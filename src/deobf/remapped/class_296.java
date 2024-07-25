package remapped;

import io.netty.buffer.ByteBuf;

public class class_296 extends class_8039<class_3929> {
   private static final int field_1079 = 13;

   public class_296() {
      super("Chunk Section Type", class_3929.class);
   }

   public class_3929 method_1334(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0) {
         var4 = 13;
      }

      if (var4 < 4) {
         var4 = 4;
      }

      if (var4 > 8) {
         var4 = 13;
      }

      int var6 = class_8039.field_41157.method_15647(var1);
      class_3929 var7 = var4 == 13 ? new class_3929() : new class_3929(var6);

      for (int var8 = 0; var8 < var6; var8++) {
         if (var4 == 13) {
            class_8039.field_41157.method_15647(var1);
         } else {
            var7.method_18187(class_8039.field_41157.method_15647(var1));
         }
      }

      long[] var11 = new long[class_8039.field_41157.method_15647(var1)];
      if (var11.length > 0) {
         int var9 = (int)Math.ceil((double)(4096 * var4) / 64.0);
         if (var11.length != var9) {
            throw new IllegalStateException(
               "Block data length ("
                  + var11.length
                  + ") does not match expected length ("
                  + var9
                  + ")! bitsPerBlock="
                  + var4
                  + ", originalBitsPerBlock="
                  + var5
            );
         }

         for (int var10 = 0; var10 < var11.length; var10++) {
            var11[var10] = var1.readLong();
         }

         class_4847.method_22288(var4, 4096, var11, var4 != 13 ? var7::method_18165 : var7::method_18181);
      }

      return var7;
   }

   public void method_1333(ByteBuf var1, class_3929 var2) throws Exception {
      int var5 = 4;

      while (var2.method_18193() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 13;
      }

      long var6 = (1L << var5) - 1L;
      var1.writeByte(var5);
      if (var5 == 13) {
         class_8039.field_41157.method_15644(var1, 0);
      } else {
         class_8039.field_41157.method_15644(var1, var2.method_18193());

         for (int var8 = 0; var8 < var2.method_18193(); var8++) {
            class_8039.field_41157.method_15644(var1, var2.method_18168(var8));
         }
      }

      long[] var14 = class_4847.method_22287(var5, 4096, var5 != 13 ? var2::method_18192 : var2::method_18185);
      class_8039.field_41157.method_15644(var1, var14.length);

      for (long var12 : var14) {
         var1.writeLong(var12);
      }
   }
}
