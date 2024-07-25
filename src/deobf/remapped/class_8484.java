package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class class_8484 extends class_8039<class_6545> {
   private static final class_5531[] field_43464 = new class_5531[0];

   public class_8484() {
      super(class_6545.class);
   }

   public class_6545 method_39085(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      boolean var7 = var1.readBoolean();
      int var8 = class_8039.field_41157.method_15647(var1);
      class_5531 var9 = class_8039.field_41158.method_9912(var1);
      int[] var10 = !var6 ? null : new int[1024];
      if (var6) {
         for (int var11 = 0; var11 < 1024; var11++) {
            var10[var11] = var1.readInt();
         }
      }

      class_8039.field_41157.method_15647(var1);
      class_3929[] var15 = new class_3929[16];

      for (int var12 = 0; var12 < 16; var12++) {
         if ((var8 & 1 << var12) != 0) {
            short var13 = var1.readShort();
            class_3929 var14 = class_9216.field_47140.method_9912(var1);
            var14.method_18188(var13);
            var15[var12] = var14;
         }
      }

      ArrayList var16 = new ArrayList<class_5531>(Arrays.asList(class_8039.field_41177.method_9912(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var17 = class_8039.field_41181.method_9912(var1);
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886()
               .method_34617()
               .warning("Found " + var17.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new class_3816(var4, var5, var6, var7, var8, var15, var10, var9, var16);
   }

   public void method_39084(ByteBuf var1, class_6545 var2) throws Exception {
      var1.writeInt(var2.method_29858());
      var1.writeInt(var2.method_29860());
      var1.writeBoolean(var2.method_29863());
      var1.writeBoolean(var2.method_29865());
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
               class_9216.field_47140.method_33275(var12, var14);
            }
         }

         var12.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var12.readableBytes());
         var1.writeBytes(var12);
      } finally {
         var12.release();
      }

      class_8039.field_41177.method_33275(var1, var2.method_29862().<class_5531>toArray(field_43464));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
