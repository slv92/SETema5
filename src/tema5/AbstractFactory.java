package tema5;

/**
 * Created by slv on 11/13/2014.
 * Clasa Abstracta
 */
public class AbstractFactory {
    /**
     * Metoda urmatoare returneaza tipul Device-ului : daca este mobil sau nu
     *
     * @param type
     * @return
     */
    public DeviceTypeFactory GetDeviceTypeFactory(String type) {
        if ("mobile".equals(type)) {
            return new MobileDeviceFactory();
        } else {
            return new NonMobileDeviceFactory();
        }
    }


}
