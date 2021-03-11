package com.team295.dagger2android.service;

import com.team295.dagger2android.model.Car;

import dagger.Component;

@Component
public interface ApplicationComponent {

   Car getCarInstance();


}
