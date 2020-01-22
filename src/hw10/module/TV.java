package hw10.module;

public class TV implements Device {
    private boolean on = true;
    private int volume = 100;
    private int channel = 24;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = volume;
        }
        else this.volume = 0;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println(" TV is " + (on ? "enabled" : "disabled"));
        System.out.println(" Current volume is " + volume + "%");
        System.out.println(" Current channel is " + channel);
        System.out.println("\n");
    }
}