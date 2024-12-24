package mapped;

import java.io.IOException;

public class Class1560 extends Class1555 {
   private static String[] field8448;
   public final int field8449;
   public final long field8450;
   public final FramedConnection field8451;

   public Class1560(FramedConnection var1, String var2, Object[] var3, int var4, long var5) {
      super(var2, var3);
      this.field8451 = var1;
      this.field8449 = var4;
      this.field8450 = var5;
   }

   @Override
   public void method6472() {
      try {
         this.field8451.field9573.method7781(this.field8449, this.field8450);
      } catch (IOException var4) {
      }
   }
}
