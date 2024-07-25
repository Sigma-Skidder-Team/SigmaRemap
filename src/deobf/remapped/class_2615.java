package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.BitSet;

public class class_2615 extends class_2523<class_6545, class_4787> {
   private static String[] field_12907;

   public class_2615(class_4787 var1) {
      super(var1, class_6545.class);
   }

   public class_6545 method_11863(ByteBuf var1, class_4787 var2) throws Exception {
      boolean var5 = var2.method_5205().method_6744().method_17596().method_42441(class_7355.class) && class_3446.method_15884().method_25801();
      int var6 = class_3446.method_15884().method_25816();
      int var7 = var1.readInt();
      int var8 = var1.readInt();
      boolean var9 = var1.readBoolean();
      int var10 = class_8039.field_41157.method_15647(var1);
      class_8039.field_41157.method_15647(var1);
      BitSet var11 = new BitSet(16);
      class_3929[] var12 = new class_3929[16];

      for (int var13 = 0; var13 < 16; var13++) {
         if ((var10 & 1 << var13) != 0) {
            var11.set(var13);
         }
      }

      for (int var15 = 0; var15 < 16; var15++) {
         if (var11.get(var15)) {
            class_3929 var14 = class_2287.field_11421.method_9912(var1);
            var12[var15] = var14;
            var14.method_18164(var1);
            if (var2.method_22081() == class_5872.field_29822) {
               var14.method_18163(var1);
            }

            if (var5) {
               var14.method_18172(36, var6);
            }
         }
      }

      int[] var16 = !var9 ? null : new int[256];
      if (var9) {
         for (int var17 = 0; var17 < 256; var17++) {
            var16[var17] = var1.readByte() & 255;
         }
      }

      return new class_3816(var7, var8, var9, false, var10, var12, var16, new ArrayList<class_5531>());
   }

   public void method_11862(ByteBuf var1, class_4787 var2, class_6545 var3) throws Exception {
      var1.writeInt(var3.method_29858());
      var1.writeInt(var3.method_29860());
      var1.writeBoolean(var3.method_29863());
      class_8039.field_41157.method_15644(var1, var3.method_29868());
      ByteBuf var6 = var1.alloc().buffer();

      try {
         for (int var7 = 0; var7 < 16; var7++) {
            class_3929 var8 = var3.method_29869()[var7];
            if (var8 != null) {
               class_2287.field_11421.method_33275(var6, var8);
               var8.method_18170(var6);
               if (var8.method_18178()) {
                  var8.method_18191(var6);
               }
            }
         }

         var6.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var6.readableBytes() + (var3.method_29866() ? 256 : 0));
         var1.writeBytes(var6);
      } finally {
         var6.release();
      }

      if (var3.method_29866()) {
         for (int var10 : var3.method_29867()) {
            var1.writeByte((byte)var10);
         }
      }
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
