package remapped;

import java.io.IOException;
import java.io.InputStream;

public class class_1406 extends Thread {
   private static String[] field_7642;
   private InputStream field_7641;
   private StringBuffer field_7640;

   public class_1406(StringBuffer var1, InputStream var2) {
      this.field_7641 = var2;
      this.field_7640 = var1;
      this.start();
   }

   @Override
   public void run() {
      int var3;
      try {
         while ((var3 = this.field_7641.read()) != -1) {
            this.field_7640.append((char)var3);
         }
      } catch (IOException var4) {
      }
   }
}
