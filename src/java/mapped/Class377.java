package mapped;

import java.io.IOException;
import java.io.InputStream;

public class Class377 extends Thread {
   private static String[] field1631;
   private InputStream field1632;
   private StringBuffer field1633;

   public Class377(StringBuffer var1, InputStream var2) {
      this.field1632 = var2;
      this.field1633 = var1;
      this.start();
   }

   @Override
   public void run() {
      int var3;
      try {
         while ((var3 = this.field1632.read()) != -1) {
            this.field1633.append((char)var3);
         }
      } catch (IOException var4) {
      }
   }
}
