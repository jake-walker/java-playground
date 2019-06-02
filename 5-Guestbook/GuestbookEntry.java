import java.util.Date;

public class GuestbookEntry {
  String guestName;
  String guestComment;
  Date visitDate;

  public GuestbookEntry(String name, String comment, Date date) {
    guestName = name;
    guestComment = comment;
    visitDate = date;
  }

  public String toString() {
    return guestName + " visited on " + visitDate + " and says '" + guestComment + "'";
  }
}