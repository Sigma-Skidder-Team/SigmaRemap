package mapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.logging.Level;

public class Class4748 extends Class4747<Class8173, Class6051> {
   public static final int field22515 = 16;
   private static final int field22516 = 16;
   private static final int field22517 = 256;

   public Class4748(Class6051 var1) {
      super(var1, Class8173.class);
   }

   private static long method14896(int var0, int var1) {
      return ((long)var0 << 32) + (long)var1 - -2147483648L;
   }

   @Override
   public Class<? extends Class4750> method14897() {
      return Class4800.class;
   }

   public Class8173 method14893(ByteBuf var1, Class6051 var2) throws Exception {
      boolean var5 = var2.method18672().method22465().method18683().method19390(Class6362.class) && Class8042.method27612().method21911();
      int var6 = Class8042.method27612().method21912();
      int var7 = var1.readInt();
      int var8 = var1.readInt();
      long var9 = method14896(var7, var8);
      boolean var11 = var1.readByte() != 0;
      int var12 = var1.readUnsignedShort();
      int var13 = Class4750.field22544.method14907(var1);
      BitSet var14 = new BitSet(16);
      Class8225[] var15 = new Class8225[16];
      int[] var16 = null;

      for (int var17 = 0; var17 < 16; var17++) {
         if ((var12 & 1 << var17) != 0) {
            var14.set(var17);
         }
      }

      int var22 = var14.cardinality();
      if (var13 < 4096) {
         return new Class8172(var7, var8);
      } else {
         boolean var18 = var2.method18739().remove(var9);
         if (var22 == 0 && var11 && !var18 && var2.method18738().contains(var9)) {
            var2.method18738().remove(var9);
            return new Class8172(var7, var8);
         } else {
            int var19 = var1.readerIndex();
            var2.method18738().add(var9);

            for (int var20 = 0; var20 < 16; var20++) {
               if (var14.get(var20)) {
                  Class8225 var21 = Class9040.field41363.method14894(var1);
                  var15[var20] = var21;
                  if (var5) {
                     var21.method28634(36, var6);
                  }
               }
            }

            for (int var23 = 0; var23 < 16; var23++) {
               if (var14.get(var23)) {
                  var15[var23].method28644(var1);
               }
            }

            int var24 = var13 - (var1.readerIndex() - var19);
            if (var24 >= 2048) {
               for (int var25 = 0; var25 < 16; var25++) {
                  if (var14.get(var25)) {
                     var15[var25].method28645(var1);
                     var24 -= 2048;
                  }
               }
            }

            if (var24 >= 256) {
               var16 = new int[256];

               for (int var26 = 0; var26 < 256; var26++) {
                  var16[var26] = var1.readByte() & 255;
               }

               var24 -= 256;
            }

            if (var24 > 0) {
               Class8042.method27613().method27366().log(Level.WARNING, var24 + " Bytes left after reading chunks! (" + var11 + ")");
            }

            return new Class8172(var7, var8, var11, var12, var15, var16, new ArrayList<Class72>());
         }
      }
   }

   public void method14892(ByteBuf var1, Class6051 var2, Class8173 var3) throws Exception {
      if (!(var3 instanceof Class8172)) {
         throw new Exception("Incompatible chunk, " + var3.getClass());
      } else {
         Class8172 var6 = (Class8172)var3;
         var1.writeInt(var6.method28440());
         var1.writeInt(var6.method28441());
         if (!var6.method28453()) {
            var1.writeByte(var6.method28442() ? 1 : 0);
            Class4750.field22544.method14908(var1, var6.method28445());
            ByteBuf var7 = var1.alloc().buffer();

            try {
               for (int var8 = 0; var8 < 16; var8++) {
                  Class8225 var9 = var6.method28446()[var8];
                  if (var9 != null) {
                     Class7593.field32600.method14895(var7, var9);
                     var9.method28647(var7);
                     if (var9.method28649()) {
                        var9.method28648(var7);
                     }
                  }
               }

               var7.readerIndex(0);
               Class4750.field22544.method14908(var1, var7.readableBytes() + (var6.method28452() ? 256 : 0));
               var1.writeBytes(var7);
            } finally {
               var7.release();
            }

            if (var6.method28452()) {
               for (int var11 : var6.method28447()) {
                  var1.writeByte((byte)var11);
               }
            }
         }
      }
   }
}
