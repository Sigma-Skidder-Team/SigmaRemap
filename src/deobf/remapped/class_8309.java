package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.logging.Level;

public class class_8309 extends class_2523<class_6545, class_7291> {
   public static final int field_42559 = 16;
   private static final int field_42558 = 16;
   private static final int field_42557 = 256;

   public class_8309(class_7291 var1) {
      super(var1, class_6545.class);
   }

   private static long method_38322(int var0, int var1) {
      return ((long)var0 << 32) + (long)var1 - -2147483648L;
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }

   public class_6545 method_38323(ByteBuf var1, class_7291 var2) throws Exception {
      boolean var5 = var2.method_5205().method_6744().method_17596().method_42441(class_7355.class) && class_3446.method_15884().method_25801();
      int var6 = class_3446.method_15884().method_25816();
      int var7 = var1.readInt();
      int var8 = var1.readInt();
      long var9 = method_38322(var7, var8);
      boolean var11 = var1.readByte() != 0;
      int var12 = var1.readUnsignedShort();
      int var13 = class_8039.field_41157.method_15647(var1);
      BitSet var14 = new BitSet(16);
      class_3929[] var15 = new class_3929[16];
      int[] var16 = null;

      for (int var17 = 0; var17 < 16; var17++) {
         if ((var12 & 1 << var17) != 0) {
            var14.set(var17);
         }
      }

      int var22 = var14.cardinality();
      if (var13 < 4096) {
         return new class_8895(var7, var8);
      } else {
         boolean var18 = var2.method_33285().remove(var9);
         if (var22 == 0 && var11 && !var18 && var2.method_33286().contains(var9)) {
            var2.method_33286().remove(var9);
            return new class_8895(var7, var8);
         } else {
            int var19 = var1.readerIndex();
            var2.method_33286().add(var9);

            for (int var20 = 0; var20 < 16; var20++) {
               if (var14.get(var20)) {
                  class_3929 var21 = class_6781.field_34980.method_9912(var1);
                  var15[var20] = var21;
                  if (var5) {
                     var21.method_18172(36, var6);
                  }
               }
            }

            for (int var23 = 0; var23 < 16; var23++) {
               if (var14.get(var23)) {
                  var15[var23].method_18164(var1);
               }
            }

            int var24 = var13 - (var1.readerIndex() - var19);
            if (var24 >= 2048) {
               for (int var25 = 0; var25 < 16; var25++) {
                  if (var14.get(var25)) {
                     var15[var25].method_18163(var1);
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
               class_3446.method_15886().method_34617().log(Level.WARNING, var24 + " Bytes left after reading chunks! (" + var11 + ")");
            }

            return new class_8895(var7, var8, var11, var12, var15, var16, new ArrayList<class_5531>());
         }
      }
   }

   public void method_38321(ByteBuf var1, class_7291 var2, class_6545 var3) throws Exception {
      if (!(var3 instanceof class_8895)) {
         throw new Exception("Incompatible chunk, " + var3.getClass());
      } else {
         class_8895 var6 = (class_8895)var3;
         var1.writeInt(var6.method_29858());
         var1.writeInt(var6.method_29860());
         if (!var6.method_40949()) {
            var1.writeByte(var6.method_29863() ? 1 : 0);
            class_8039.field_41157.method_15644(var1, var6.method_29868());
            ByteBuf var7 = var1.alloc().buffer();

            try {
               for (int var8 = 0; var8 < 16; var8++) {
                  class_3929 var9 = var6.method_29869()[var8];
                  if (var9 != null) {
                     class_2287.field_11421.method_33275(var7, var9);
                     var9.method_18170(var7);
                     if (var9.method_18178()) {
                        var9.method_18191(var7);
                     }
                  }
               }

               var7.readerIndex(0);
               class_8039.field_41157.method_15644(var1, var7.readableBytes() + (var6.method_40950() ? 256 : 0));
               var1.writeBytes(var7);
            } finally {
               var7.release();
            }

            if (var6.method_40950()) {
               for (int var11 : var6.method_29867()) {
                  var1.writeByte((byte)var11);
               }
            }
         }
      }
   }
}
