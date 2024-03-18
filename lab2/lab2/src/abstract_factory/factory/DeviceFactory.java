package abstract_factory.factory;

import abstract_factory.EBook;
import abstract_factory.Laptop;
import abstract_factory.Netbook;
import abstract_factory.Smartphone;

public interface DeviceFactory {
    Laptop createLaptop();

    Netbook createNetbook();

    EBook createEBook();

    Smartphone createSmartphone();
}
