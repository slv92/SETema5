package tema5;

import pachet.tema5.Devices.ElectronicDevices.Device;
import pachet.tema5.Devices.ElectronicDevices.Smartphone;
import pachet.tema5.Devices.ElectronicDevices.Tablet;

/**
 * Created by slv on 11/13/2014.
 */
public class MobileDeviceFactory extends DeviceTypeFactory {

    @Override
    public Device getDevice(String type) {
        if ("smartphone".equals(type)) {
            return new Smartphone();
        } else {
            return new Tablet();
        }
    }

}
