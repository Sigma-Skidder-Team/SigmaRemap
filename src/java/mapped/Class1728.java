package mapped;

import java.io.IOException;

public class Class1728 extends Class1726 {
   private static String[] field9406;
   public static final boolean field9409 = !Class1756.class.desiredAssertionStatus();
   public final Class1756 field9410;

   public Class1728(Class1756 var1, Class1716 var2) {
      super(var2);
      this.field9410 = var1;
   }

   @Override
   public void method7550(IOException var1) {
      if (!field9409 && !Thread.holdsLock(this.field9410)) {
         throw new AssertionError();
      } else {
         this.field9410.field9519 = true;
      }
   }
}
