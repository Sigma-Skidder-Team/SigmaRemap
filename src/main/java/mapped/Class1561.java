package mapped;

import java.io.IOException;

public class Class1561 extends Class1555 {
   private static String[] field8452;
   public final int field8453;
   public final Class1734 field8454;
   public final int field8455;
   public final boolean field8456;
   public final FramedConnection field8457;

   public Class1561(FramedConnection var1, String var2, Object[] var3, int var4, Class1734 var5, int var6, boolean var7) {
      super(var2, var3);
      this.field8457 = var1;
      this.field8453 = var4;
      this.field8454 = var5;
      this.field8455 = var6;
      this.field8456 = var7;
   }

   @Override
   public void method6472() {
      try {
         boolean var3 = this.field8457.field9564.method31859(this.field8453, this.field8454, this.field8455, this.field8456);
         if (var3) {
            this.field8457.field9573.method7774(this.field8453, Class2077.field13532);
         }

         if (var3 || this.field8456) {
            synchronized (this.field8457) {
               this.field8457.field9575.remove(this.field8453);
            }
         }
      } catch (IOException var7) {
      }
   }
}
