package com.overpassapp;


import android.app.Application;

import com.facebook.react.ReactApplication;
import com.oblador.vectoricons.VectorIconsPackage;
import com.reactnativenavigation.NavigationApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import com.airbnb.android.react.maps.MapsPackage;

import java.util.Arrays;
import java.util.List;


public class MainApplication extends NavigationApplication {

  public boolean isDebug() {
    return BuildConfig.DEBUG;
  }

  protected List<ReactPackage> getPackages() {
    // Add additional packages you require here
    // No need to add RnnPackage and MainReactPackage
    return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new VectorIconsPackage(),
                 new MapsPackage()
    );
  }

  public List<ReactPackage> createAdditionalReactPackages() {
    return getPackages();
  }

  @Override
  public String getJSMainModuleName() {
    return "index";
  }

}