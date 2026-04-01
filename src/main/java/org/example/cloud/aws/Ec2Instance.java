package org.example.cloud.aws;

import org.example.cloud.IComputeInstance;

public class Ec2Instance implements IComputeInstance {
    @Override
    public void startInstance() {
        System.out.println("EC2 Instance: Started Up Successfully");
    }
}
