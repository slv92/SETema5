package tema5;

import tema5.Devices.ElectronicDevices.Device;

/**
 * Created by slv on 11/13/2014.
 * <p/>
 * Clasa Main - am urmat tutorialul de aici : http://www.avajava.com/tutorials/lessons/abstract-factory-pattern.html?page=1
 */
public class Demo {


    public static void main(String[] args) {
        AbstractFactory absFact = new AbstractFactory();
        DeviceTypeFactory devType1 = absFact.GetDeviceTypeFactory("non-mobile");
        DeviceTypeFactory devType2 = absFact.GetDeviceTypeFactory("mobile");
        
        Device d1 = devType1.getDevice("SmartTV");
        Device d2 = devType1.getDevice("DesktopPC");
        Device d3 = devType2.getDevice("Smartphone");
        Device d4 = devType2.getDevice("Tablet");

        System.out.println(d1.showSomething() + "\n");
        System.out.println(d2.showSomething() + "\n");
        System.out.println(d3.showSomething() + "\n");
        System.out.println(d4.showSomething() + "\n");

    }

}
