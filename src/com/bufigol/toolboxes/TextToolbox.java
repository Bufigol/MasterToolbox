package com.bufigol.toolboxes;

import java.text.Normalizer;

public class TextToolbox {
	public static String removerCaracteresEspeciales(String str) {
		String out = "";
		String stringNormalizada = Normalizer.normalize(str, Normalizer.Form.NFD);
		out = stringNormalizada.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return out;
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}