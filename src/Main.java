import java.io.*;

public class Main {
    public static void main(String[] args) {
        String result = "";
        try {
            String text = "";
            File file = new File("C:\\Users\\79623\\OneDrive\\Рабочий стол\\lab-14\\lab_14.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = null;
            while ((line = reader.readLine()) != null) {
                text += line +("\n");
            }
            System.out.println(text);  //Вывод с комментариями
            result = text.toString().replaceAll("//.*", "").replaceAll("/\\*(.|\\n)*?\\*/","");
            System.out.println(result); //Вывод без комментариев
            reader.close();

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        try{
            FileWriter writer = new FileWriter("C:\\Users\\79623\\OneDrive\\Рабочий стол\\lab-14\\lab_14_1.txt", false);
            writer.write(result);
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}