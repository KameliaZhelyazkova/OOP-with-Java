public class Favourites {

    private static final int N = 5;
    
    private int count = 0;
    private MusicTrack[] tracks = new MusicTrack[N];

    public void addTrack(String artist, String title) {
        MusicTrack mt = new MusicTrack(artist, title);
        if (count < N) {
            tracks[count] = mt;
            count++;
        }
        else {
            System.out.println("Sorry, can't add: " + mt);
        }
    }

    public void showFavourites() {
        System.out.println();
        for (int i = 0; i < N; i++) {
            MusicTrack mt = tracks[i];
            if (mt != null) {
                System.out.println(mt);
            }
        }
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































//	private MusicTrack[] favourites = new MusicTrack[5];
//
//	public void addTrack(String artist, String title) {
//		boolean isFull = true;
//		for (int i = 0; i < favourites.length; i++) {
//			if (favourites[i] == null) {
//				isFull = false;
//				favourites[i] = new MusicTrack(artist, title);
//				break;
//			}
//		}
//		if (isFull == true) {
//			System.out.printf("Sorry, can't add: %s | %s\n", title, artist);
//			System.out.println();
//		}
//	}
//
//	public void showFavourites() {
//		for (int i = 0; i < favourites.length; i++) {
//			if (favourites[i] != null) {
//				System.out.println(favourites[i].toString());
//			}
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Favourites fvs = new Favourites();
//
//		fvs.addTrack("Fun", "Some Nights");
//		fvs.addTrack("Oliver Tank", "Help You Breathe");
//		fvs.addTrack("Horse Feathers", "Fit Against the Country");
//		fvs.addTrack("Emile Sande", "Country House");
//		fvs.addTrack("Fun", "Walking the Dog");
//		fvs.addTrack("Porcelain Raft", "Put Me To Sleep");
//
//		fvs.showFavourites();
//	}
//}