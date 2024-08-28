package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class544 implements Runnable {
   private static String[] field2605;
   public final Class4309 field2606;
   public final Class4309 field2607;

   public Class544(Class4309 var1, Class4309 var2) {
      this.field2607 = var1;
      this.field2606 = var2;
   }

   @Override
   public void run() {
      for (Class4305 var4 : this.field2606.method13241()) {
         if (var4 instanceof Class4375) {
            Class4375 var5 = (Class4375)var4;
            var5.method13712();
         }
      }
   }
}
