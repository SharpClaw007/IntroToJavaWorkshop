package day3;

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What Mood Are You In?", "Mood-Quiz", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Bored", "Sad", "Angry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
		JOptionPane.showMessageDialog(null, "" + userMood);

		// 3. If they are in a sad mood, use the playVideo method to play a happy song from YouTube.
		if(userMood == 2)
		{
			playVideo("https://www.youtube.com/watch?v=7E1Dfm4mHZo");
		}
		if(userMood == 1)
		{
			playVideo("https://www.youtube.com/watch?v=JxJsai5nkGI");
		}
		if(userMood == 0)
		{
			playVideo("https://www.youtube.com/watch?v=6-6YCLFiUEg");
		}
		

		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/

