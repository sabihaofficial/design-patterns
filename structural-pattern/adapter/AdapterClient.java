package adapter;

public class AdapterClient {
    public static void main(String[] args) {

        CD cd = new CD("CD");
        CD DVD = new CD("DVD");
        CD cd1 = new CD("CD");
        CdAdapter adapter = new CdAdapter(cd);
        adapter.adapt(cd);

        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.play(cd);
        dvdPlayer.play(DVD);
        dvdPlayer.play(cd1);

    }
}
