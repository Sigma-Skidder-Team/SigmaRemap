package mapped;

import io.netty.buffer.ByteBuf;

public class Class4801 extends BruhMotha<Class8225> {
   private static final int field22589 = 13;

   public Class4801() {
      super("Chunk Section Type", Class8225.class);
   }

   public Class8225 method14894(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0) {
         var4 = 13;
      }

      if (var4 < 4) {
         var4 = 4;
      }

      if (var4 > 8) {
         var4 = 13;
      }

      int var6 = BruhMotha.field22544.method14907(var1);
      Class8225 var7 = var4 == 13 ? new Class8225() : new Class8225(var6);

      for (int var8 = 0; var8 < var6; var8++) {
         if (var4 == 13) {
            BruhMotha.field22544.method14907(var1);
         } else {
            var7.method28635(BruhMotha.field22544.method14907(var1));
         }
      }

      long[] var11 = new long[BruhMotha.field22544.method14907(var1)];
      if (var11.length > 0) {
         int var9 = (int)Math.ceil((double)(4096 * var4) / 64.0);
         if (var11.length != var9) {
            throw new IllegalStateException(
               "Block data length ("
                  + var11.length
                  + ") does not match expected length ("
                  + var9
                  + ")! bitsPerBlock="
                  + var4
                  + ", originalBitsPerBlock="
                  + var5
            );
         }

         for (int var10 = 0; var10 < var11.length; var10++) {
            var11[var10] = var1.readLong();
         }

         Class8505.method30111(var4, 4096, var11, var4 != 13 ? var7::method28629 : var7::method28637);
      }

      return var7;
   }

   public void method14895(ByteBuf var1, Class8225 var2) throws Exception {
      int var5 = 4;

      while (var2.method28631() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 13;
      }

      long var6 = (1L << var5) - 1L;
      var1.writeByte(var5);
      if (var5 == 13) {
         BruhMotha.field22544.method14908(var1, 0);
      } else {
         BruhMotha.field22544.method14908(var1, var2.method28631());

         for (int var8 = 0; var8 < var2.method28631(); var8++) {
            BruhMotha.field22544.method14908(var1, var2.method28632(var8));
         }
      }

      long[] var14 = Class8505.method30110(var5, 4096, var5 != 13 ? var2::method28630 : var2::method28627);
      BruhMotha.field22544.method14908(var1, var14.length);

      for (long var12 : var14) {
         var1.writeLong(var12);
      }
   }
}
