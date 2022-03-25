package submit.chapter1011.submit01;

public class AudioBoard extends Board {
	private String audio;
	
	public AudioBoard(int no, String title, String content) {
		super(no, title, content);
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

}
