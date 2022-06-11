package JPL0Lab11.part2;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFile {

    public void readData() {
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }            System.out.println("");
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void writeData(String str) {
        //chuyen chuoi thanh byte
        byte[] b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void listPath(File path) {
        // get all files (or directories) in File path
        File[] files = path.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].toString());
        }
    }
    public void menu(){
        System.out.println("--------------------\n1. Add a list of Students and save to File");
        System.out.println("2. Loading list of Students from a File\n3. Exit\nYour choice : ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadWriteFile d = new ReadWriteFile();
        int chon =0;
        while (true) {
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("writing something :");
                    String c = sc.nextLine();
                    d.writeData(c);
                    break;
                case 2:
                    listPath(new File("C:\\Users\\Administrator\\IdeaProjects\\Sem2"));
                    d.readData();
                break;
                default:
                    System.out.println("run again.");
                case 3:
                    System.exit(0);
            }
        }

    }
}

