package abstract_factory.factory;

import abstract_factory.EBook;
import abstract_factory.Laptop;
import abstract_factory.Netbook;
import abstract_factory.Smartphone;

public class XiaomiFactory implements DeviceFactory{
    @Override
    public Laptop createLaptop() {
        return new Laptop();
    }

    @Override
    public Netbook createNetbook() {
        return new Netbook();
    }

    @Override
    public EBook createEBook() {
        return new EBook();
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone();
    }
}
