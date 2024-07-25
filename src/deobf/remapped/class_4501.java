package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_4501 extends Thread {
   private static final String field_22009 = "percent";
   private static final String field_22005 = "minutes";
   private static final String field_22012 = "seconds";
   private InputStream field_22010;
   private StringBuffer field_22008;
   private final class_6504 field_22007;
   private Pattern field_22011 = Pattern.compile("\\[download\\]\\s+(?<percent>\\d+\\.\\d)% .* ETA (?<minutes>\\d+):(?<seconds>\\d+)");

   public class_4501(StringBuffer var1, InputStream var2, class_6504 var3) {
      this.field_22010 = var2;
      this.field_22008 = var1;
      this.field_22007 = var3;
      this.start();
   }

   @Override
   public void run() {
      try {
         StringBuilder var3 = new StringBuilder();

         int var4;
         while ((var4 = this.field_22010.read()) != -1) {
            this.field_22008.append((char)var4);
            if (var4 == 13 && this.field_22007 != null) {
               this.method_20909(var3.toString());
               var3.setLength(0);
            } else {
               var3.append((char)var4);
            }
         }
      } catch (IOException var5) {
      }
   }

   private void method_20909(String var1) {
      Matcher var4 = this.field_22011.matcher(var1);
      if (var4.matches()) {
         float var5 = Float.parseFloat(var4.group("percent"));
         long var6 = (long)this.method_20908(var4.group("minutes"), var4.group("seconds"));
         this.field_22007.method_29651(var5, var6);
      }
   }

   private int method_20908(String var1, String var2) {
      return Integer.parseInt(var1) * 60 + Integer.parseInt(var2);
   }
}
