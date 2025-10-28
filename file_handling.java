import java.io.*;  

class file_handling {
    public static void main(String[] args) {
        try {
            
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("This is your first file write and read example.\n");
            fileWriter.close();
            System.out.println("File written successfully!");

            FileReader fileReader = new FileReader("myfile.txt");
            int character;

            System.out.println("\nFile content:");
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            fileReader.close();
        } 
        catch (IOException e) {
            System.out.println(" An error occurred.");
            e.printStackTrace();
        }
    }
}
