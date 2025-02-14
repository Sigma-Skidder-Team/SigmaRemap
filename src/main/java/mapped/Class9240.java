package mapped;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class Class9240 {
   public static final long field42518 = 253402300799999L;
   private static final ThreadLocal<DateFormat> field42519 = new Class2542();
   private static final String[] field42520 = new String[]{
      "EEE, dd MMM yyyy HH:mm:ss zzz",
      "EEEE, dd-MMM-yy HH:mm:ss zzz",
      "EEE MMM d HH:mm:ss yyyy",
      "EEE, dd-MMM-yyyy HH:mm:ss z",
      "EEE, dd-MMM-yyyy HH-mm-ss z",
      "EEE, dd MMM yy HH:mm:ss z",
      "EEE dd-MMM-yyyy HH:mm:ss z",
      "EEE dd MMM yyyy HH:mm:ss z",
      "EEE dd-MMM-yyyy HH-mm-ss z",
      "EEE dd-MMM-yy HH:mm:ss z",
      "EEE dd MMM yy HH:mm:ss z",
      "EEE,dd-MMM-yy HH:mm:ss z",
      "EEE,dd-MMM-yyyy HH:mm:ss z",
      "EEE, dd-MM-yyyy HH:mm:ss z",
      "EEE MMM d yyyy HH:mm:ss z"
   };
   private static final DateFormat[] field42521 = new DateFormat[field42520.length];

   public static Date method34752(String var0) {
      if (var0.length() == 0) {
         return null;
      } else {
         ParsePosition var3 = new ParsePosition(0);
         Date var4 = field42519.get().parse(var0, var3);
         if (var3.getIndex() == var0.length()) {
            return var4;
         } else {
            synchronized (field42520) {
               int var6 = 0;

               for (int var7 = field42520.length; var6 < var7; var6++) {
                  DateFormat var8 = field42521[var6];
                  if (var8 == null) {
                     var8 = new SimpleDateFormat(field42520[var6], Locale.US);
                     var8.setTimeZone(Class9474.field44029);
                     field42521[var6] = (DateFormat)var8;
                  }

                  var3.setIndex(0);
                  var4 = var8.parse(var0, var3);
                  if (var3.getIndex() != 0) {
                     return var4;
                  }
               }

               return null;
            }
         }
      }
   }

   public static String method34753(Date var0) {
      return field42519.get().format(var0);
   }

   private Class9240() {
   }
}
