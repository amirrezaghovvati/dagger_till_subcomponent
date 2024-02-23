package com.example.disubcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.disubcomponent.Car.Car;
import com.example.disubcomponent.Car.CarComponent;
import com.example.disubcomponent.Car.DaggerCarComponent;
import com.example.disubcomponent.Computer.Computer;
import com.example.disubcomponent.Computer.ComputerComponent;
import com.example.disubcomponent.Computer.DaggerComputerComponent;
import com.example.disubcomponent.Http.DaggerHttpServiceComponent;
import com.example.disubcomponent.Http.HttpRequestModule;
import com.example.disubcomponent.Http.HttpService;
import com.example.disubcomponent.Http.HttpServiceComponent;
import com.example.disubcomponent.Image.DaggerImageServiceComponent;
import com.example.disubcomponent.Image.ImageService;
import com.example.disubcomponent.Image.ImageServiceComponent;

import com.example.disubcomponent.Laptop.DaggerInputsComponent;
import com.example.disubcomponent.Laptop.Laptop;
import com.example.disubcomponent.Laptop.LaptopComponent;
import com.example.disubcomponent.Mobile.DaggerMobileComponent;
import com.example.disubcomponent.Mobile.Mobile;
import com.example.disubcomponent.Mobile.MobileComponent;
import com.example.disubcomponent.MotherBoard.DaggerMotherBoardComponent;
import com.example.disubcomponent.MotherBoard.MotherBoardComponent;
import com.example.disubcomponent.MotherBoard.Motherboard;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private Mobile mobile;
    @Inject Mobile mobileInjectField;
    private MobileComponent mobileComponent;
    private Motherboard motherboard;
    private MotherBoardComponent motherBoardComponent;
    private HttpService httpService;
    private HttpServiceComponent httpServiceComponent;
    private ImageService imageService;
    private ImageServiceComponent imageServiceComponent;
    private Car car;
    private CarComponent carComponent;
    private Computer computer;
    private ComputerComponent computerComponent;
    private Laptop laptop;
    private LaptopComponent laptopComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobileComponent= DaggerMobileComponent.create();
        mobileComponent.injectFields(this);
        mobile=mobileComponent.buildMobile();
        mobile.runMobile();
        mobileInjectField.runMobile();
        //MotherBoard
        motherBoardComponent= DaggerMotherBoardComponent.create();
        motherboard=motherBoardComponent.buildMotherBoard();
        motherboard.runMotherBoard(8);
        //HttpService
        httpServiceComponent= DaggerHttpServiceComponent.builder().httpRequestModule(new HttpRequestModule("GET")).build();
        httpService=httpServiceComponent.createHttpService();
        httpService.sendRequestToWeb("google.com");
        //ImageService
       // imageServiceComponent= DaggerImageServiceComponent.builder().setUrl("google.com").returnImagSerivceComponent();
        imageServiceComponent=DaggerImageServiceComponent.factory().returnImageServiceComponent("goo.com");
        imageService=imageServiceComponent.buildImageService();
        imageService.sendImageRequest("google.com");
        //Car
        carComponent=((App)getApplication()).permanentCarComponent();
        car=carComponent.createCar();
        car.whatIsGearBox();
        Button button=findViewById(R.id.button);
        button.setOnClickListener(v->{
            Intent intent=new Intent(v.getContext(),SecondActivity.class);
            startActivity(intent);
        });
        //Computer
        computerComponent= DaggerComputerComponent.builder()
                .setSoftWareComponent(((App) getApplication()).permanentSoftwareComponent()).returnComputerComponent();
        computer=computerComponent.createComputer();
        computer.computerTurnedOn();
        //Laptop
     //   laptopComponent= DaggerLaptopComponent.builder().inputsComponent(((App) getApplication()).permanentInputComponent()).build();
     //   laptopComponent=((App) getApplication()).permanentInputComponent().buildLaptopComponent();
        laptopComponent=((App) getApplication()).permanentInputComponent().buildLaptopComponent().setI(8).buildLaptopComponent();
        laptop=laptopComponent.buildLaptop();
        laptop.startLapTop();
    }
}