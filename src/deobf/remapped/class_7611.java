package remapped;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class class_7611 {
   public static final long field_38740 = 253402300799999L;
   private static final ThreadLocal<DateFormat> field_38739 = new class_2916();
   private static final String[] field_38741 = new String[]{
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
   private static final DateFormat[] field_38742 = new DateFormat[field_38741.length];

   public static Date method_34525(String var0) {
      if (var0.length() == 0) {
         return null;
      } else {
         ParsePosition var3 = new ParsePosition(0);
         Date var4 = field_38739.get().parse(var0, var3);
         if (var3.getIndex() == var0.length()) {
            return var4;
         } else {
            synchronized (field_38741) {
               int var6 = 0;

               for (int var7 = field_38741.length; var6 < var7; var6++) {
                  Object var8 = field_38742[var6];
                  if (var8 == null) {
                     var8 = new SimpleDateFormat(field_38741[var6], Locale.US);
                     var8.setTimeZone(class_8515.field_43584);
                     field_38742[var6] = (DateFormat)var8;
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

   public static String method_34526(Date var0) {
      return field_38739.get().format(var0);
   }

   private class_7611() {
   }
}
