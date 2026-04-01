package org.example.cloud;

public interface ICloudModuleFactory {

    IStorageService createStorage();
    IComputeInstance createCompute();

}
