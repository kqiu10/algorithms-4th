public class EX11 {
 private final int month;
 private final int day;
 private final int year;

 public EX11(int m, int d, int y) {
  switch (m) {
  case 1:
  case 3:
  case 5:
  case 7:
  case 8:
  case 10:
  case 12:
   if (d > 0 && d <= 31) {
    month = m;
    day = d;
    year = y;
   } else {
    throw new IllegalArgumentException("Illegal date");
   }
   break;
  case 4:
  case 6:
  case 9:
  case 11:
   if (d > 0 && d <= 30) {
    month = m;
    day = d;
    year = y;
   } else {
    throw new IllegalArgumentException("Illegal date");
   }
   break;
  case 2:
   if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
    if (d > 0 && d <= 29) {
     month = m;
     day = d;
     year = y;
    } else {
     throw new IllegalArgumentException("Illegal date");
    }
   } else {
    if (d > 0 && d <= 28) {
     month = m;
     day = d;
     year = y;
    } else {
     throw new IllegalArgumentException("Illegal date");
    }
   }
   break;
   default:
   throw new IllegalArgumentException("Illegal date");
  }
 }

 public int month() {
  return month;
 }

 public int day() {
  return day;
 }

 public int year() {
  return year;
 }

 public static void main(String[] args) {
  int m = Integer.parseInt(args[0]);
  int d = Integer.parseInt(args[1]);
  int y = Integer.parseInt(args[2]);
  try {
   EX11 date = new EX11(m, d, y);
   System.out.println(date);
  } catch (IllegalArgumentException e) {
   e.printStackTrace();
  }
 }
}