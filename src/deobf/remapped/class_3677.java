package remapped;

import javax.annotation.Nullable;

public final class class_3677 {
   public final class_8121 field_17932;
   public final class_9001 field_17934;

   public static class_3677 method_17081(class_9001 var0) {
      return method_17080(null, var0);
   }

   public static class_3677 method_17080(class_8121 var0, class_9001 var1) {
      if (var1 != null) {
         if (var0 != null && var0.method_36955("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
         } else if (var0 != null && var0.method_36955("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
         } else {
            return new class_3677(var0, var1);
         }
      } else {
         throw new NullPointerException("body == null");
      }
   }

   public static class_3677 method_17078(String var0, String var1) {
      return method_17079(var0, null, class_9001.method_41292(null, var1));
   }

   public static class_3677 method_17079(String var0, String var1, class_9001 var2) {
      if (var0 != null) {
         StringBuilder var5 = new StringBuilder("form-data; name=");
         class_5942.method_27176(var5, var0);
         if (var1 != null) {
            var5.append("; filename=");
            class_5942.method_27176(var5, var1);
         }

         return method_17080(class_8121.method_36959("Content-Disposition", var5.toString()), var2);
      } else {
         throw new NullPointerException("name == null");
      }
   }

   private class_3677(class_8121 var1, class_9001 var2) {
      this.field_17932 = var1;
      this.field_17934 = var2;
   }

   @Nullable
   public class_8121 method_17077() {
      return this.field_17932;
   }

   public class_9001 method_17076() {
      return this.field_17934;
   }
}
