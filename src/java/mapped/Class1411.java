package mapped;

import java.io.IOException;

public class Class1411 implements Runnable {
   private static String[] field7559;
   public final Class8212 field7560;

   public Class1411(Class8212 var1) {
      this.field7560 = var1;
   }

   @Override
   public void run() {
      try {
         while (this.field7560.method28557()) {
         }
      } catch (IOException var4) {
         this.field7560.method28559(var4, null);
      }
   }
}
