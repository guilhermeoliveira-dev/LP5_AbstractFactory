package org.example.cloud.azure;

import org.example.cloud.IComputeInstance;

public class VMInstance implements IComputeInstance {
    @Override
    public void startInstance() {
        System.out.println("VM Instance: Started Up Successfully");
    }
}
