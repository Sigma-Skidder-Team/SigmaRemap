package mapped;

import io.netty.buffer.ByteBuf;

public class Class4771 extends BruhMotha<Class8225> {
   private static final int field22580 = 15;

   public Class4771() {
      super("Chunk Section Type", Class8225.class);
   }

   public Class8225 method14894(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0 || var4 > 8) {
         var4 = 15;
      }

      Class8225 var6;
      if (var4 == 15) {
         var6 = new Class8225();
      } else {
         int var7 = BruhMotha.field22544.method14907(var1);
         var6 = new Class8225(var7);

         for (int var8 = 0; var8 < var7; var8++) {
            var6.method28635(BruhMotha.field22544.method14907(var1));
         }
      }

      long[] var11 = new long[BruhMotha.field22544.method14907(var1)];
      if (var11.length > 0) {
         char var12 = (char)(64 / var4);
         int var9 = (4096 + var12 - 1) / var12;
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

         Class8505.method30109(var4, 4096, var11, var4 != 15 ? var6::method28629 : var6::method28637);
      }

      return var6;
   }

   public void method14895(ByteBuf var1, Class8225 var2) throws Exception {
      int var5 = 4;

      while (var2.method28631() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 15;
      }

      var1.writeByte(var5);
      if (var5 != 15) {
         BruhMotha.field22544.method14908(var1, var2.method28631());

         for (int var6 = 0; var6 < var2.method28631(); var6++) {
            BruhMotha.field22544.method14908(var1, var2.method28632(var6));
         }
      }

      long[] var12 = Class8505.method30108(var5, 4096, var5 != 15 ? var2::method28630 : var2::method28627);
      BruhMotha.field22544.method14908(var1, var12.length);

      for (long var10 : var12) {
         var1.writeLong(var10);
      }
   }
}
