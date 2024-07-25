package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class class_9424 extends class_8039<class_6545> {
   private static final class_5531[] field_48149 = new class_5531[0];

   public class_9424() {
      super(class_6545.class);
   }

   public class_6545 method_43620(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = class_8039.field_41157.method_15647(var1);
      class_5531 var8 = class_8039.field_41158.method_9912(var1);
      int[] var9 = !var6 ? null : new int[1024];
      if (var6) {
         for (int var10 = 0; var10 < 1024; var10++) {
            var9[var10] = var1.readInt();
         }
      }

      class_8039.field_41157.method_15647(var1);
      class_3929[] var14 = new class_3929[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var7 & 1 << var11) != 0) {
            short var12 = var1.readShort();
            class_3929 var13 = class_6091.field_31167.method_9912(var1);
            var13.method_18188(var12);
            var14[var11] = var13;
         }
      }

      ArrayList var15 = new ArrayList<class_5531>(Arrays.asList(class_8039.field_41177.method_9912(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var16 = class_8039.field_41181.method_9912(var1);
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886()
               .method_34617()
               .warning("Found " + var16.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new class_3816(var4, var5, var6, false, var7, var14, var9, var8, var15);
   }

   public void method_43619(ByteBuf var1, class_6545 var2) throws Exception {
      var1.writeInt(var2.method_29858());
      var1.writeInt(var2.method_29860());
      var1.writeBoolean(var2.method_29863());
      class_8039.field_41157.method_15644(var1, var2.method_29868());
      class_8039.field_41158.method_33275(var1, var2.method_29864());
      if (var2.method_29866()) {
         for (int var8 : var2.method_29867()) {
            var1.writeInt(var8);
         }
      }

      ByteBuf var12 = var1.alloc().buffer();

      try {
         for (int var13 = 0; var13 < 16; var13++) {
            class_3929 var14 = var2.method_29869()[var13];
            if (var14 != null) {
               var12.writeShort(var14.method_18176());
               class_6091.field_31167.method_33275(var12, var14);
            }
         }

         var12.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var12.readableBytes());
         var1.writeBytes(var12);
      } finally {
         var12.release();
      }

      class_8039.field_41177.method_33275(var1, var2.method_29862().<class_5531>toArray(field_48149));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
