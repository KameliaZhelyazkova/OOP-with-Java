package music;
public class MusicTrack {

	private String artistName;
	private String trackTitle;

	public MusicTrack(String artistName, String trackTitle) {
		this.artistName = artistName;
		this.trackTitle = trackTitle;
	}

	public String getArtist() {
		return this.artistName;
	}

	public String getTitle() {
		return this.trackTitle;
	}

	@Override
	public String toString() {
		return this.trackTitle + " | " + this.artistName;
	}

	
//	public static void main(String[] args) {
//		MusicTrack firstMusicTrack = new MusicTrack("Martin G", "Enjoy the silence"); 
//		System.out.println(firstMusicTrack.toString());
//	}
}
