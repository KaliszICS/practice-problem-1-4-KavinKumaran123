import java.io.*;
import java.util.*;

public class PracticeProblem {

    public static String getName(int Line, String file) {
        try {
            Scanner scan = new Scanner(new File(file));
            int a = 1;

            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                if (a == Line) {
                    String[] parts = data.split(" ");
                    scan.close();
                    return parts[0] + " " + parts[1];
                }

                a++;
            }

            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static int getAge(int Line, String file) {
        try {
            Scanner scan = new Scanner(new File(file));
            int a = 1;

            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                if (a == Line) {
                    String[] parts = data.split(" ");
                    scan.close();
                    return Integer.parseInt(parts[2]);
                }

                a++;
            }

            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static int getNumber(int Line, String file) {
        try {
            Scanner scan = new Scanner(new File(file));
            int a = 1;

            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                if (a == Line) {
                    String[] parts = data.split(" ");
                    scan.close();
                    return Integer.parseInt(parts[3]);
                }

                a++;
            }

            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }
	public static void fileAppend(String output, String filename){
		try{
			FileWriter writer = new FileWriter(filename, true);
			writer.write(output);
			writer.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}	
}