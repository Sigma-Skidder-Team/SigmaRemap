package mapped;

import java.io.IOException;

public class Class494 implements Runnable {
   private static String[] field2338;
   public final Class1756 field2339;

   public Class494(Class1756 var1) {
      this.field2339 = var1;
   }

   @Override
   public void run() {
      synchronized (this.field2339) {
         if (!(!this.field2339.field9520 | this.field2339.field9521)) {
            try {
               this.field2339.method7695();
            } catch (IOException var7) {
               this.field2339.field9522 = true;
            }

            try {
               if (this.field2339.method7690()) {
                  this.field2339.method7681();
                  this.field2339.field9518 = 0;
               }
            } catch (IOException var6) {
               this.field2339.field9523 = true;
               this.field2339.field9516 = Class7001.method21697(Class7001.method21708());
            }
         }
      }
   }
}
