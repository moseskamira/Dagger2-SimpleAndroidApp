package com.team295.dagger2android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.team295.dagger2android.model.Car;
import com.team295.dagger2android.service.ApplicationComponent;
import com.team295.dagger2android.service.DaggerApplicationComponent;

public class MainActivity extends AppCompatActivity {
    private Car myCar;
    TextView carActionTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationComponent applicationComponent = DaggerApplicationComponent.create();
        myCar = applicationComponent.getCarInstance();
        carActionTv = findViewById(R.id.car_action);
        String carAction = processDriving();
        carActionTv.setText(carAction);
    }

    private String processDriving() {
        return myCar.drive();
    }
}