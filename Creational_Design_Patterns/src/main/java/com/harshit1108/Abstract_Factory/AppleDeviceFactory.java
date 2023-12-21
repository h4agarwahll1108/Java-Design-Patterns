package com.harshit1108.Abstract_Factory;

// Concrete Factory for Apple Devices
public class AppleDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new IPhone();
    }

    @Override
    public Smartwatch createSmartwatch() {
        return new AppleWatch();
    }
}