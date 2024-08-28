package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.BitSet;

public class Class4825 extends Class4747<Class8173, Class6047> {
   private static String[] field22598;

   public Class4825(Class6047 var1) {
      super(var1, Class8173.class);
   }

   public Class8173 method14893(ByteBuf var1, Class6047 var2) throws Exception {
      boolean var5 = var2.method18672().method22465().method18683().method19390(Class6362.class) && Class8042.method27612().method21911();
      int var6 = Class8042.method27612().method21912();
      int var7 = var1.readInt();
      int var8 = var1.readInt();
      boolean var9 = var1.readBoolean();
      int var10 = Class4750.field22544.method14907(var1);
      Class4750.field22544.method14907(var1);
      BitSet var11 = new BitSet(16);
      Class8225[] var12 = new Class8225[16];

      for (int var13 = 0; var13 < 16; var13++) {
         if ((var10 & 1 << var13) != 0) {
            var11.set(var13);
         }
      }

      for (int var15 = 0; var15 < 16; var15++) {
         if (var11.get(var15)) {
            Class8225 var14 = Class7593.field32600.method14894(var1);
            var12[var15] = var14;
            var14.method28644(var1);
            if (var2.method18729() == Class2195.field14342) {
               var14.method28645(var1);
            }

            if (var5) {
               var14.method28634(36, var6);
            }
         }
      }

      int[] var16 = !var9 ? null : new int[256];
      if (var9) {
         for (int var17 = 0; var17 < 256; var17++) {
            var16[var17] = var1.readByte() & 255;
         }
      }

      return new Class8171(var7, var8, var9, false, var10, var12, var16, new ArrayList<Class72>());
   }

   public void method14892(ByteBuf var1, Class6047 var2, Class8173 var3) throws Exception {
      var1.writeInt(var3.method28440());
      var1.writeInt(var3.method28441());
      var1.writeBoolean(var3.method28442());
      Class4750.field22544.method14908(var1, var3.method28445());
      ByteBuf var6 = var1.alloc().buffer();

      try {
         for (int var7 = 0; var7 < 16; var7++) {
            Class8225 var8 = var3.method28446()[var7];
            if (var8 != null) {
               Class7593.field32600.method14895(var6, var8);
               var8.method28647(var6);
               if (var8.method28649()) {
                  var8.method28648(var6);
               }
            }
         }

         var6.readerIndex(0);
         Class4750.field22544.method14908(var1, var6.readableBytes() + (var3.method28439() ? 256 : 0));
         var1.writeBytes(var6);
      } finally {
         var6.release();
      }

      if (var3.method28439()) {
         for (int var10 : var3.method28447()) {
            var1.writeByte((byte)var10);
         }
      }
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }
}
