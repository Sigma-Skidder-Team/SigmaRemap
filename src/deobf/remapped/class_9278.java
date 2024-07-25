package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public class class_9278 extends class_2523<class_6545, class_4787> {
   public class_9278(class_4787 var1) {
      super(var1, class_6545.class);
   }

   public class_6545 method_42742(ByteBuf var1, class_4787 var2) throws Exception {
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      boolean var7 = var1.readBoolean();
      int var8 = class_8039.field_41157.method_15647(var1);
      ByteBuf var9 = var1.readSlice(class_8039.field_41157.method_15647(var1));
      class_3929[] var10 = new class_3929[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var8 & 1 << var11) != 0) {
            class_3929 var12 = class_6091.field_31167.method_9912(var9);
            var10[var11] = var12;
            var12.method_18164(var9);
            if (var2.method_22081() == class_5872.field_29822) {
               var12.method_18163(var9);
            }
         }
      }

      int[] var14 = !var7 ? null : new int[256];
      if (var7) {
         if (var9.readableBytes() < 1024) {
            class_3446.method_15886().method_34617().log(Level.WARNING, "Chunk x=" + var5 + " z=" + var6 + " doesn't have biome data!");
         } else {
            for (int var15 = 0; var15 < 256; var15++) {
               var14[var15] = var9.readInt();
            }
         }
      }

      ArrayList var16 = new ArrayList<class_5531>(Arrays.asList(class_8039.field_41177.method_9912(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var13 = class_8039.field_41181.method_9912(var1);
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886()
               .method_34617()
               .warning("Found " + var13.length + " more bytes than expected while reading the chunk: " + var5 + "/" + var6);
         }
      }

      return new class_3816(var5, var6, var7, false, var8, var10, var14, var16);
   }

   public void method_42741(ByteBuf var1, class_4787 var2, class_6545 var3) throws Exception {
      var1.writeInt(var3.method_29858());
      var1.writeInt(var3.method_29860());
      var1.writeBoolean(var3.method_29863());
      class_8039.field_41157.method_15644(var1, var3.method_29868());
      ByteBuf var6 = var1.alloc().buffer();

      try {
         for (int var7 = 0; var7 < 16; var7++) {
            class_3929 var8 = var3.method_29869()[var7];
            if (var8 != null) {
               class_6091.field_31167.method_33275(var6, var8);
               var8.method_18170(var6);
               if (var8.method_18178()) {
                  var8.method_18191(var6);
               }
            }
         }

         var6.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var6.readableBytes() + (var3.method_29866() ? 1024 : 0));
         var1.writeBytes(var6);
      } finally {
         var6.release();
      }

      if (var3.method_29866()) {
         for (int var10 : var3.method_29867()) {
            var1.writeInt(var10);
         }
      }

      class_8039.field_41177.method_33275(var1, var3.method_29862().<class_5531>toArray(new class_5531[0]));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
