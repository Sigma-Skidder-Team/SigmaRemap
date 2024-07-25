package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class class_2376 extends class_2523<class_6545, class_4787> {
   public class_2376(class_4787 var1) {
      super(var1, class_6545.class);
   }

   public class_6545 method_10860(ByteBuf var1, class_4787 var2) throws Exception {
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      boolean var7 = var1.readBoolean();
      int var8 = class_8039.field_41157.method_15647(var1);
      class_8039.field_41157.method_15647(var1);
      class_3929[] var9 = new class_3929[16];

      for (int var10 = 0; var10 < 16; var10++) {
         if ((var8 & 1 << var10) != 0) {
            class_3929 var11 = class_2287.field_11421.method_9912(var1);
            var9[var10] = var11;
            var11.method_18164(var1);
            if (var2.method_22081() == class_5872.field_29822) {
               var11.method_18163(var1);
            }
         }
      }

      int[] var13 = !var7 ? null : new int[256];
      if (var7) {
         for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = var1.readByte() & 255;
         }
      }

      ArrayList var15 = new ArrayList<class_5531>(Arrays.asList(class_8039.field_41177.method_9912(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var12 = class_8039.field_41181.method_9912(var1);
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886()
               .method_34617()
               .warning("Found " + var12.length + " more bytes than expected while reading the chunk: " + var5 + "/" + var6);
         }
      }

      return new class_3816(var5, var6, var7, false, var8, var9, var13, var15);
   }

   public void method_10859(ByteBuf var1, class_4787 var2, class_6545 var3) throws Exception {
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

      class_8039.field_41177.method_33275(var1, var3.method_29862().<class_5531>toArray(new class_5531[0]));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
