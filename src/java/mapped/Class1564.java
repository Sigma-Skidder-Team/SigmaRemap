package mapped;

import java.io.IOException;
import java.util.List;

public class Class1564 extends Class1555 {
   private static String[] field8466;
   public final int field8467;
   public final List field8468;
   public final boolean field8469;
   public final Class1767 field8470;

   public Class1564(Class1767 var1, String var2, Object[] var3, int var4, List var5, boolean var6) {
      super(var2, var3);
      this.field8470 = var1;
      this.field8467 = var4;
      this.field8468 = var5;
      this.field8469 = var6;
   }

   @Override
   public void method6472() {
      boolean var3 = this.field8470.field9564.method31858(this.field8467, this.field8468, this.field8469);

      try {
         if (var3) {
            this.field8470.field9573.method7774(this.field8467, Class2077.field13532);
         }

         if (var3 || this.field8469) {
            synchronized (this.field8470) {
               this.field8470.field9575.remove(this.field8467);
            }
         }
      } catch (IOException var7) {
      }
   }
}
