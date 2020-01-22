package hw10.controller;

import hw10.module.Device;

public class Executor {
    public static void testDevice(Device device) {
        TVRemote tvRemote = new TVRemote(device);
        tvRemote.power();
        tvRemote.volumeUp();
        tvRemote.mute();
        tvRemote.channelUp();
        device.printStatus();
    }
}
