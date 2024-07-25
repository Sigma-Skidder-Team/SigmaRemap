package remapped;

import io.netty.buffer.ByteBuf;

public class class_4062 extends class_8039<class_3929> {
   private static final int field_19783 = 14;

   public class_4062() {
      super("Chunk Section Type", class_3929.class);
   }

   public class_3929 method_18735(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0 || var4 > 8) {
         var4 = 14;
      }

      class_3929 var6;
      if (var4 == 14) {
         var6 = new class_3929();
      } else {
         int var7 = class_8039.field_41157.method_15647(var1);
         var6 = new class_3929(var7);

         for (int var8 = 0; var8 < var7; var8++) {
            var6.method_18187(class_8039.field_41157.method_15647(var1));
         }
      }

      long[] var10 = new long[class_8039.field_41157.method_15647(var1)];
      if (var10.length > 0) {
         int var11 = (int)Math.ceil((double)(4096 * var4) / 64.0);
         if (var10.length != var11) {
            throw new IllegalStateException(
               "Block data length ("
                  + var10.length
                  + ") does not match expected length ("
                  + var11
                  + ")! bitsPerBlock="
                  + var4
                  + ", originalBitsPerBlock="
                  + var5
            );
         }

         for (int var9 = 0; var9 < var10.length; var9++) {
            var10[var9] = var1.readLong();
         }

         class_4847.method_22288(var4, 4096, var10, var4 != 14 ? var6::method_18165 : var6::method_18181);
      }

      return var6;
   }

   public void method_18734(ByteBuf var1, class_3929 var2) throws Exception {
      int var5 = 4;

      while (var2.method_18193() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 14;
      }

      var1.writeByte(var5);
      if (var5 != 14) {
         class_8039.field_41157.method_15644(var1, var2.method_18193());

         for (int var6 = 0; var6 < var2.method_18193(); var6++) {
            class_8039.field_41157.method_15644(var1, var2.method_18168(var6));
         }
      }

      long[] var12 = class_4847.method_22287(var5, 4096, var5 != 14 ? var2::method_18192 : var2::method_18185);
      class_8039.field_41157.method_15644(var1, var12.length);

      for (long var10 : var12) {
         var1.writeLong(var10);
      }
   }
}
