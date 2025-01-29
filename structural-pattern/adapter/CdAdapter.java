package adapter;

public class CdAdapter extends DVDPlayer{

    private CD cd;

    public CdAdapter(CD cd) {
        this.cd = cd;
    }


    public void adapt(CD cd) {
        this.cd.setVideoType("DVD");
    }
}
