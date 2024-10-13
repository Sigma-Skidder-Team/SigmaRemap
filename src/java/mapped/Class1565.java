package mapped;

import java.io.IOException;

public class Class1565 extends Class1555 {
   public final Class9698 field8471;
   public final Class1556 field8472;

   public Class1565(Class1556 var1, String var2, Object[] var3, Class9698 var4) {
      super(var2, var3);
      this.field8472 = var1;
      this.field8471 = var4;
   }

   @Override
   public void method6472() {
      try {
         this.field8472.field8440.field9556.method22816(this.field8471);
      } catch (IOException var6) {
         try {
            this.field8471.method37988(Class2077.field13528);
         } catch (IOException var5) {
         }
      }
   }
}
