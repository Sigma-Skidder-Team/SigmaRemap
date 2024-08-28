package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class605 implements Runnable {
   private static String[] field2986;
   public final Class4315 field2987;
   public final Class4305 field2988;
   public final Class4315 field2989;

   public Class605(Class4315 var1, Class4315 var2, Class4305 var3) {
      this.field2989 = var1;
      this.field2987 = var2;
      this.field2988 = var3;
   }

   @Override
   public void run() {
      this.field2987.method13236(this.field2988);
      this.field2987.field21041 = null;
   }
}
