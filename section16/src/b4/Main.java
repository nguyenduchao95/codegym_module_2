package b4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("section16/src/b4/countries.csv");
            if (!file.exists())
                throw new FileNotFoundException();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(",");
                Country country = new Country(Integer.parseInt(strings[0]), strings[1], strings[2]);
                System.out.println(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
