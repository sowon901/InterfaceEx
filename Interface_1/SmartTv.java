package oop.Interface_1;

public class SmartTv implements RemoteControl, Searchable{
    private int vol;
    private int channel;

    @Override
    public void turnOn() {
        System.out.println("SmartTV 전원On");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV 전원Off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.vol = RemoteControl.MAX_VOLUME-15;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.vol = RemoteControl.MIN_VOLUME;
        } else
            this.vol = volume;

        System.out.println("현재 볼륨: " + this.vol);
                //super에는 객체의 주솟값이 걸려있는데 여기에는 객체의 주소값이 없으므로
    }

    @Override
    public int getVolume() {
        return vol;
    }

    @Override
    public void setMute(boolean mute) {
        RemoteControl.super.setMute(mute);
    }

    @Override
    public void search(String url) {
        System.out.println(url+ "검색합니다.");
    }

    @Override
    public void channelUp(int channel) {
        this.channel++;
    }

    @Override
    public void channelDown(int channel) {
        this.channel--;
    }
}
