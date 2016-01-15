package com.hashtag.recommendation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class HashTagstoID {

	public void convert() throws IOException{
		File file = new File("DataSet/dataset_iid.csv");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		File f = new File("DataSet/dataset_hashtag.csv");
		

		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String a[] = new String[3];
				a = line.split(",");
				
				if (a[1].equalsIgnoreCase("#tech")) {
					a[1] = "01";
				} else if (a[1].equalsIgnoreCase("#lap")) {
					a[1] = "02";
				} else if (a[1].equalsIgnoreCase("#money")) {
					a[1] = "03";
				} else if (a[1].equalsIgnoreCase("#win")) {
					a[1] = "04";
				} else if (a[1].equalsIgnoreCase("#party")) {
					a[1] = "05";
				} else if (a[1].equalsIgnoreCase("#cup")) {
					a[1] = "06";
				}
				else if (a[1].equalsIgnoreCase("#deal")) {
					a[1] = "07";
				} else if (a[1].equalsIgnoreCase("#style")) {
					a[1] = "08";
				} else if (a[1].equalsIgnoreCase("#love")) {
					a[1] = "09";
				}

			 //System.out.println(a[0] + "," + a[1]+ "," + a[2]);

				bw.write(a[0] + "," + Integer.parseInt(a[1]) + "," + a[2]);
				bw.write("\n");
			

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			bw.close();

		}

	}
}
