package mapped;

import io.netty.buffer.ByteBuf;

public class Class4815 extends Class4750<Class8225> {
   private static final int field22596 = 14;

   public Class4815() {
      super("Chunk Section Type", Class8225.class);
   }

   public Class8225 method14894(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0 || var4 > 8) {
         var4 = 14;
      }

      Class8225 var6;
      if (var4 == 14) {
         var6 = new Class8225();
      } else {
         int var7 = Class4750.field22544.method14907(var1);
         var6 = new Class8225(var7);

         for (int var8 = 0; var8 < var7; var8++) {
            var6.method28635(Class4750.field22544.method14907(var1));
         }
      }

      long[] var10 = new long[Class4750.field22544.method14907(var1)];
      if (var10.length > 0) {
         int var11 = (int)Math.ceil((double)(4096 * var4) / 64.0);
         if (var10.length != var11) {
            throw new IllegalStateException(
               "Block data length ("
                  + var10.length
                  + ") does not match expected length ("
                  + var11
                  + ")! bitsPerBlock="
                  + var4
                  + ", originalBitsPerBlock="
                  + var5
            );
         }

         for (int var9 = 0; var9 < var10.length; var9++) {
            var10[var9] = var1.readLong();
         }

         Class8505.method30111(var4, 4096, var10, var4 != 14 ? var6::method28629 : var6::method28637);
      }

      return var6;
   }

   public void method14895(ByteBuf var1, Class8225 var2) throws Exception {
      int var5 = 4;

      while (var2.method28631() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 14;
      }

      var1.writeByte(var5);
      if (var5 != 14) {
         Class4750.field22544.method14908(var1, var2.method28631());

         for (int var6 = 0; var6 < var2.method28631(); var6++) {
            Class4750.field22544.method14908(var1, var2.method28632(var6));
         }
      }

      long[] var12 = Class8505.method30110(var5, 4096, var5 != 14 ? var2::method28630 : var2::method28627);
      Class4750.field22544.method14908(var1, var12.length);

      for (long var10 : var12) {
         var1.writeLong(var10);
      }
   }
}
