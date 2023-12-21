package com.harshit1108.Abstract_Factory;

// Concrete Factory for Samsung Devices
public class SamsungDeviceFactory implements ElectronicDeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new GalaxyPhone();
    }

    @Override
    public Smartwatch createSmartwatch() {
        return new GalaxyWatch();
    }
}