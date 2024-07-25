package remapped;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class class_9001 {
   @Nullable
   public abstract class_1972 method_41290();

   public long method_41288() throws IOException {
      return -1L;
   }

   public abstract void method_41289(class_3947 var1) throws IOException;

   public static class_9001 method_41292(class_1972 var0, String var1) {
      Charset var4 = class_8515.field_43592;
      if (var0 != null) {
         var4 = var0.method_9072();
         if (var4 == null) {
            var4 = class_8515.field_43592;
            var0 = class_1972.method_9069(var0 + "; charset=utf-8");
         }
      }

      byte[] var5 = var1.getBytes(var4);
      return method_41294(var0, var5);
   }

   public static class_9001 method_41293(class_1972 var0, class_9091 var1) {
      return new class_224(var0, var1);
   }

   public static class_9001 method_41294(class_1972 var0, byte[] var1) {
      return method_41295(var0, var1, 0, var1.length);
   }

   public static class_9001 method_41295(class_1972 var0, byte[] var1, int var2, int var3) {
      if (var1 != null) {
         class_8515.method_39203((long)var1.length, (long)var2, (long)var3);
         return new class_9631(var0, var3, var1, var2);
      } else {
         throw new NullPointerException("content == null");
      }
   }

   public static class_9001 method_41291(class_1972 var0, File var1) {
      if (var1 != null) {
         return new class_6386(var0, var1);
      } else {
         throw new NullPointerException("content == null");
      }
   }
}
