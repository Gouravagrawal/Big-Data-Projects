package com.hashtag.recommendation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class IDtoHashTags {

	public static void main(String args[]) throws IOException {

		File file = new File("C:/Users/Gourav/Desktop/opwithhashtag.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		File f = new File("C:/Users/Gourav/Desktop/Ipwithid.txt");
		

		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String a[] = new String[3];
				a = line.split(",");
				
				if (a[1].equalsIgnoreCase("01")) {
					a[1] = "#tech";
				} else if (a[1].equalsIgnoreCase("02")) {
					a[1] = "#lap";
				} else if (a[1].equalsIgnoreCase("03")) {
					a[1] = "#money";
				} else if (a[1].equalsIgnoreCase("04")) {
					a[1] = "#win";
				} else if (a[1].equalsIgnoreCase("05")) {
					a[1] = "#party";
				} else if (a[1].equalsIgnoreCase("06")) {
					a[1] = "#cup";
				}
				else if (a[1].equalsIgnoreCase("07")) {
					a[1] = "#deal";
				} else if (a[1].equalsIgnoreCase("08")) {
					a[1] = "#style";
				} else if (a[1].equalsIgnoreCase("09")) {
					a[1] = "#love";
				}

			 System.out.println(a[0] + "," + a[1]+ "," + a[2]);

				bw.write(a[0] + "," +a[1] + "," + a[2]);
				bw.write("\n");
			

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			bw.close();

		}

	}
}
