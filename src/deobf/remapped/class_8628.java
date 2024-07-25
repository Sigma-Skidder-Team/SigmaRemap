package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class class_8628 extends class_8039<class_6545> {
   private static final class_5531[] field_44266 = new class_5531[0];

   public class_8628() {
      super(class_6545.class);
   }

   public class_6545 method_39625(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = class_8039.field_41157.method_15647(var1);
      class_5531 var8 = class_8039.field_41158.method_9912(var1);
      int[] var9 = null;
      if (var6) {
         var9 = class_8039.field_41144.method_9912(var1);
      }

      class_8039.field_41157.method_15647(var1);
      class_3929[] var10 = new class_3929[16];

      for (int var11 = 0; var11 < 16; var11++) {
         if ((var7 & 1 << var11) != 0) {
            short var12 = var1.readShort();
            class_3929 var13 = class_9216.field_47140.method_9912(var1);
            var13.method_18188(var12);
            var10[var11] = var13;
         }
      }

      ArrayList var14 = new ArrayList<class_5531>(Arrays.asList(class_8039.field_41177.method_9912(var1)));
      if (var1.readableBytes() > 0) {
         byte[] var15 = class_8039.field_41181.method_9912(var1);
         if (class_3446.method_15883().method_33731()) {
            class_3446.method_15886()
               .method_34617()
               .warning("Found " + var15.length + " more bytes than expected while reading the chunk: " + var4 + "/" + var5);
         }
      }

      return new class_3816(var4, var5, var6, false, var7, var10, var9, var8, var14);
   }

   public void method_39624(ByteBuf var1, class_6545 var2) throws Exception {
      var1.writeInt(var2.method_29858());
      var1.writeInt(var2.method_29860());
      var1.writeBoolean(var2.method_29863());
      class_8039.field_41157.method_15644(var1, var2.method_29868());
      class_8039.field_41158.method_33275(var1, var2.method_29864());
      if (var2.method_29866()) {
         class_8039.field_41144.method_33275(var1, var2.method_29867());
      }

      ByteBuf var5 = var1.alloc().buffer();

      try {
         for (int var6 = 0; var6 < 16; var6++) {
            class_3929 var7 = var2.method_29869()[var6];
            if (var7 != null) {
               var5.writeShort(var7.method_18176());
               class_9216.field_47140.method_33275(var5, var7);
            }
         }

         var5.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var5.readableBytes());
         var1.writeBytes(var5);
      } finally {
         var5.release();
      }

      class_8039.field_41177.method_33275(var1, var2.method_29862().<class_5531>toArray(field_44266));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
