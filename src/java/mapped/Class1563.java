package mapped;

import java.io.IOException;

public class Class1563 extends Class1555 {
   private static String[] field8462;
   public final int field8463;
   public final Class2077 field8464;
   public final FramedConnection field8465;

   public Class1563(FramedConnection var1, String var2, Object[] var3, int var4, Class2077 var5) {
      super(var2, var3);
      this.field8465 = var1;
      this.field8463 = var4;
      this.field8464 = var5;
   }

   @Override
   public void method6472() {
      try {
         this.field8465.method7717(this.field8463, this.field8464);
      } catch (IOException var4) {
      }
   }
}
