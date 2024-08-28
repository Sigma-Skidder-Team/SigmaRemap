package mapped;

import java.io.IOException;

public class Class1727 extends Class1726 {
   private static String[] field9406;
   public final Class7163 field9408;

   public Class1727(Class7163 var1, Class1716 var2) {
      super(var2);
      this.field9408 = var1;
   }

   @Override
   public void method7550(IOException var1) {
      synchronized (this.field9408.field30814) {
         this.field9408.method22495();
      }
   }
}
