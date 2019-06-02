import java.io.*;
import java.text.*;
import java.util.*;
import GuestbookEntry;

public class Guestbook {
  List<GuestbookEntry> entries;

  public Guestbook() {
    entries = new ArrayList<>();
  }

  public void addEntry(GuestbookEntry entry) {
    entries.add(entry);
  }

  public void readEntries() {
    for (GuestbookEntry entry : entries) {
      System.out.println("Name:     " + entry.guestName);
      System.out.println("Date:     " + entry.visitDate);
      System.out.println("Comment:  " + entry.guestComment);
      System.out.println("====================================");
    }
  }

  public static void main(String[] args) throws IOException, ParseException {
    GuestbookEntry entry1 = new GuestbookEntry("Fred", "The room was very nice", new Date(1559480730));
    GuestbookEntry entry2 = new GuestbookEntry("Alice", "I had a great stay", new Date(1559481730));

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Welcome to Happiness Hotel!");
    System.out.println("Enter your name: ");
    String nameInput = reader.readLine();

    System.out.println("Enter the date of your stay (format: DD-MM-YYYY): ");
    String dateInput = reader.readLine();
    DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    Date parsedDate = format.parse(dateInput);

    System.out.println("Enter your comment: ");
    String commentInput = reader.readLine();

    GuestbookEntry entryCustom = new GuestbookEntry(nameInput, commentInput, parsedDate);

    Guestbook hotelGuestbook = new Guestbook();
    
    hotelGuestbook.addEntry(entry1);
    hotelGuestbook.addEntry(entry2);
    hotelGuestbook.addEntry(entryCustom);
    hotelGuestbook.readEntries();
  }
}