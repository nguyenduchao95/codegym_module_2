package b1;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại!");
        } catch (Exception e) {
            System.err.println("Nội dung có lỗi!");
        }
    }
}
