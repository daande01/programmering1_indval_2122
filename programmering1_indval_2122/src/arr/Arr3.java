package arr;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arr3 {

	public static void main(String[] args) {

		String[] s = new String[5];

		for (int i = 0; i <s.length; i = i + 1) {

			s[i] = JOptionPane.showInputDialog("ange ett tal");



		}
		System.out.println(Arrays.toString(s));

	}
}
