package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class369 extends Thread {
   private static final String field1615 = "percent";
   private static final String field1616 = "minutes";
   private static final String field1617 = "seconds";
   private InputStream field1618;
   private StringBuffer field1619;
   private final Class8954 field1620;
   // rat
   private Pattern field1621 = Pattern.compile("\\[download\\]\\s+(?<percent>\\d+\\.\\d)% .* ETA (?<minutes>\\d+):(?<seconds>\\d+)");

   public Class369(StringBuffer var1, InputStream var2, Class8954 var3) {
      this.field1618 = var2;
      this.field1619 = var1;
      this.field1620 = var3;
      this.start();
   }

   @Override
   public void run() {
      try {
         StringBuilder var3 = new StringBuilder();

         int var4;
         while ((var4 = this.field1618.read()) != -1) {
            this.field1619.append((char)var4);
            if (var4 == 13 && this.field1620 != null) {
               this.method1844(var3.toString());
               var3.setLength(0);
            } else {
               var3.append((char)var4);
            }
         }
      } catch (IOException var5) {
      }
   }

   private void method1844(String var1) {
      Matcher var4 = this.field1621.matcher(var1);
      if (var4.matches()) {
         float var5 = Float.parseFloat(var4.group("percent"));
         long var6 = (long)this.method1845(var4.group("minutes"), var4.group("seconds"));
         this.field1620.method32718(var5, var6);
      }
   }

   private int method1845(String var1, String var2) {
      return Integer.parseInt(var1) * 60 + Integer.parseInt(var2);
   }
}
