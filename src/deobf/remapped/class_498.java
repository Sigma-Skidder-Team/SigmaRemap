package remapped;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class class_498 extends class_8039<class_6545> {
   public class_498() {
      super(class_6545.class);
   }

   public class_6545 method_2487(ByteBuf var1) throws Exception {
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      boolean var6 = var1.readBoolean();
      int var7 = class_8039.field_41157.method_15647(var1);
      class_5531 var8 = class_8039.field_41158.method_9912(var1);
      class_8039.field_41157.method_15647(var1);
      class_3929[] var9 = new class_3929[16];

      for (int var10 = 0; var10 < 16; var10++) {
         if ((var7 & 1 << var10) != 0) {
            short var11 = var1.readShort();
            class_3929 var12 = class_6091.field_31167.method_9912(var1);
            var12.method_18188(var11);
            var9[var10] = var12;
         }
      }

      int[] var13 = !var6 ? null : new int[256];
      if (var6) {
         for (int var14 = 0; var14 < 256; var14++) {
            var13[var14] = var1.readInt();
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

      return new class_3816(var4, var5, var6, false, var7, var9, var13, var8, var15);
   }

   public void method_2486(ByteBuf var1, class_6545 var2) throws Exception {
      var1.writeInt(var2.method_29858());
      var1.writeInt(var2.method_29860());
      var1.writeBoolean(var2.method_29863());
      class_8039.field_41157.method_15644(var1, var2.method_29868());
      class_8039.field_41158.method_33275(var1, var2.method_29864());
      ByteBuf var5 = var1.alloc().buffer();

      try {
         for (int var6 = 0; var6 < 16; var6++) {
            class_3929 var7 = var2.method_29869()[var6];
            if (var7 != null) {
               var5.writeShort(var7.method_18176());
               class_6091.field_31167.method_33275(var5, var7);
            }
         }

         var5.readerIndex(0);
         class_8039.field_41157.method_15644(var1, var5.readableBytes() + (var2.method_29866() ? 1024 : 0));
         var1.writeBytes(var5);
      } finally {
         var5.release();
      }

      if (var2.method_29866()) {
         for (int var9 : var2.method_29867()) {
            var1.writeInt(var9 & 0xFF);
         }
      }

      class_8039.field_41177.method_33275(var1, var2.method_29862().<class_5531>toArray(new class_5531[0]));
   }

   @Override
   public Class<? extends class_8039> method_36495() {
      return class_8745.class;
   }
}
