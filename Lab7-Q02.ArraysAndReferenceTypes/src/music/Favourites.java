package music;

import java.util.ArrayList;

public class Favourites {
	private ArrayList<MusicTrack> musicTracks = new ArrayList<>();

	public void addTrack(String artist, String title) {
		MusicTrack newTrack = new MusicTrack(artist, title);

			musicTracks.add(newTrack);
	}

	public void showFavourites() {
		System.out.println();
			for (int i = 0; i < musicTracks.size(); i++) {
				System.out.println(musicTracks.get(i));
			}
//			for (MusicTrack s : musicTracks){
//			System.out.println(s);
//		}
		}
    public static void main(String[] args) {
        Favourites fvs = new Favourites();

        fvs.addTrack("Fun", "Some Nights");
        fvs.addTrack("Oliver Tank", "Help You Breathe");
        fvs.addTrack("Horse Feathers", "Fit Against the Country");
        fvs.addTrack("Emile Sande", "Country House");
        fvs.addTrack("Fun", "Walking the Dog");
        fvs.addTrack("Porcelain Raft", "Put Me To Sleep");

        fvs.showFavourites();
    }
}
