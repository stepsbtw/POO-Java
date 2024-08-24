package paco;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println(Utils.getPalavroes());
	}
}

class Utils{
	public static List<String> getPalavroes() {
		ArrayList<String> palavroes = new ArrayList<String>();
		palavroes.add("casa");
		palavroes.add("navio");
		String[] tweets = Twitter.getTweets();
		List<String> output = new ArrayList<String>();
		
		for(int i =0; i<tweets.length; i++) {
			String tweet_temp = tweets[i];
			for(String palavrao : palavroes) {
				// CONTAINS IGNORE CASE
				if(tweet_temp.toLowerCase().contains(palavrao)) {
					//tweet_temp = tweet_temp.replace(palavrao, "#".repeat(palavrao.length()));
					tweet_temp = tweet_temp.toLowerCase().replaceAll(palavrao,"#".repeat(palavrao.length()));
				}
			}
			output.add(tweet_temp);
		}
		return output;
	}
}

class Twitter{
	public static String[] getTweets() {
		String[] x = new String[4];
		x[0] = "A casa é bonita casa";
		x[1] = "Eu fui de NAVIO";
		x[2] = "A Bola Sumiu";
		x[3] = "a casa feia";
		return x;
	}
}
