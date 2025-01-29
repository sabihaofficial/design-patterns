package adapter;

public class CD {
    String videoType = "CD";
    CD(){}

    CD(String videoType){
        this.videoType=videoType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String video) {
        this.videoType = video;
    }
}
