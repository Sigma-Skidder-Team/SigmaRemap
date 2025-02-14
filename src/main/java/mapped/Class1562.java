package mapped;

import java.io.IOException;
import java.util.List;

public class Class1562 extends Class1555 {
   private static String[] field8458;
   public final int field8459;
   public final List field8460;
   public final FramedConnection field8461;

   public Class1562(FramedConnection var1, String var2, Object[] var3, int var4, List var5) {
      super(var2, var3);
      this.field8461 = var1;
      this.field8459 = var4;
      this.field8460 = var5;
   }

   @Override
   public void method6472() {
      boolean var3 = this.field8461.field9564.method31857(this.field8459, this.field8460);

      try {
         if (var3) {
            this.field8461.field9573.method7774(this.field8459, Class2077.field13532);
            synchronized (this.field8461) {
               this.field8461.field9575.remove(this.field8459);
            }
         }
      } catch (IOException var7) {
      }
   }
}
