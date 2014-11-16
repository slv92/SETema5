package tema5;

import pachet.tema5.Devices.ElectronicDevices.DesktopPC;
import pachet.tema5.Devices.ElectronicDevices.Device;
import pachet.tema5.Devices.ElectronicDevices.SmartTV;

/**
 * Created by slv on 11/13/2014.
 */
public class NonMobileDeviceFactory extends DeviceTypeFactory {

    @Override
    public Device getDevice(String type) {
        if ("smartTV".equals(type)) {
            return new SmartTV();
        } else {
            return new DesktopPC();
        }
    }

}
