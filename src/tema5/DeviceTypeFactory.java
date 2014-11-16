package tema5;

import tema5.Devices.ElectronicDevices.Device;

/**
 * Clasa abstracta pt tipul de dispozitivele ( mobile sau statice )
 * Created by slv on 11/13/2014.
 */
public abstract class DeviceTypeFactory {

    public abstract Device getDevice(String type);

}
