package mapped;

import java.io.IOException;

public class Class1566 extends Class1555 {
   private static String[] field8473;
   public final boolean field8474;
   public final int field8475;
   public final int field8476;
   public final Class9224 field8477;
   public final FramedConnection field8478;

   public Class1566(FramedConnection var1, String var2, Object[] var3, boolean var4, int var5, int var6, Class9224 var7) {
      super(var2, var3);
      this.field8478 = var1;
      this.field8474 = var4;
      this.field8475 = var5;
      this.field8476 = var6;
      this.field8477 = var7;
   }

   @Override
   public void method6472() {
      try {
         this.field8478.method7721(this.field8474, this.field8475, this.field8476, this.field8477);
      } catch (IOException var4) {
      }
   }
}
