import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter; // Import the FileWriter class

public class FileManagement {
  public void creatFile() {
    try {
      File myObj = new File("message_history.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public void WriteFile(Object[] way, Object[] timestation, Object[] phonesend, Object[] phonereceiver, 
      Object[] information, int length) {
    try {
      FileWriter myWriter = new FileWriter("message_history.txt");
      myWriter.write("Direction\t \t" + "Phone Send\t \t" + "Phone Receive\t \t" + "Time\t \t"
           + "Message\t \t \n");
      for (int i = 0; i < length; i++) {
        myWriter.write(way[i] + "\t \t" + "\t" + phonesend[i] + "\t \t" + phonereceiver[i] + "\t \t \t"
            + timestation[i] +  "\t \t \t" + information[i] + "\t \t" + "\n");
        System.out.println();
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
