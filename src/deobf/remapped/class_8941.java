package remapped;

import io.netty.buffer.ByteBuf;

public class class_8941 extends class_8039<class_3929> {
   private static final int field_45846 = 15;

   public class_8941() {
      super("Chunk Section Type", class_3929.class);
   }

   public class_3929 method_41080(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      short var5 = var4;
      if (var4 == 0 || var4 > 8) {
         var4 = 15;
      }

      class_3929 var6;
      if (var4 == 15) {
         var6 = new class_3929();
      } else {
         int var7 = class_8039.field_41157.method_15647(var1);
         var6 = new class_3929(var7);

         for (int var8 = 0; var8 < var7; var8++) {
            var6.method_18187(class_8039.field_41157.method_15647(var1));
         }
      }

      long[] var11 = new long[class_8039.field_41157.method_15647(var1)];
      if (var11.length > 0) {
         char var12 = (char)(64 / var4);
         int var9 = (4096 + var12 - 1) / var12;
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

         class_4847.method_22290(var4, 4096, var11, var4 != 15 ? var6::method_18165 : var6::method_18181);
      }

      return var6;
   }

   public void method_41079(ByteBuf var1, class_3929 var2) throws Exception {
      int var5 = 4;

      while (var2.method_18193() > 1 << var5) {
         var5++;
      }

      if (var5 > 8) {
         var5 = 15;
      }

      var1.writeByte(var5);
      if (var5 != 15) {
         class_8039.field_41157.method_15644(var1, var2.method_18193());

         for (int var6 = 0; var6 < var2.method_18193(); var6++) {
            class_8039.field_41157.method_15644(var1, var2.method_18168(var6));
         }
      }

      long[] var12 = class_4847.method_22286(var5, 4096, var5 != 15 ? var2::method_18192 : var2::method_18185);
      class_8039.field_41157.method_15644(var1, var12.length);

      for (long var10 : var12) {
         var1.writeLong(var10);
      }
   }
}
