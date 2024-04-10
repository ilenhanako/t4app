package com.sutd.t4app.ui.reviews;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/**
 * The ReviewViewModel class in Java contains LiveData objects for user's feedback on food, service, and atmosphere
 * ratings with getter and setter methods.
 */
public class ReviewViewModel extends ViewModel {

    private MutableLiveData<Integer> foodRating = new MutableLiveData<>(3);
    private MutableLiveData<Integer> serviceRating = new MutableLiveData<>(3);
    private MutableLiveData<Integer> atmosphereRating = new MutableLiveData<>(3);

    public LiveData<Integer> getFoodRating() {
        return foodRating;
    }

    public LiveData<Integer> getServiceRating() {
        return serviceRating;
    }

    public LiveData<Integer> getAtmosphereRating() {
        return atmosphereRating;
    }

    public void setFoodRating(int rating) {
        foodRating.setValue(rating);
    }

    public void setServiceRating(int rating) {
        serviceRating.setValue(rating);
    }

    public void setAtmosphereRating(int rating) {
        atmosphereRating.setValue(rating);
    }
}