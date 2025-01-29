package adapter;

public class DVDPlayer {
    public void play(CD cd){
        if(cd.videoType.equals("DVD")){
            System.out.println("playing Video from DVD!!");
        }else{
            System.out.println("Cannot play video, device not compatible");
        }

    }
}
