package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int oys=0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				oys++;
			}
		}
		return oys;
	}

	public static double findTallest(List<Double> peeps) {
		double height=0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>height) {
				height=peeps.get(i);
			}
		}
		return height;
	}

	public static Object findLongestWord(List<String> words) {
		String length="a";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>length.length()) {
				length=words.get(i);
			}
		}
		return length;
	}

	public static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
	
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
