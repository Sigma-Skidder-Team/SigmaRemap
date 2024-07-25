package remapped;

public final class class_1844 {
   public String field_9371;
   public String field_9368;
   public long field_9366 = 253402300799999L;
   public String field_9365;
   public String field_9364 = "/";
   public boolean field_9367;
   public boolean field_9369;
   public boolean field_9370;
   public boolean field_9363;

   public class_1844 method_8157(String var1) {
      if (var1 != null) {
         if (var1.trim().equals(var1)) {
            this.field_9371 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("name is not trimmed");
         }
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public class_1844 method_8155(String var1) {
      if (var1 != null) {
         if (var1.trim().equals(var1)) {
            this.field_9368 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("value is not trimmed");
         }
      } else {
         throw new NullPointerException("value == null");
      }
   }

   public class_1844 method_8154(long var1) {
      if (var1 <= 0L) {
         var1 = Long.MIN_VALUE;
      }

      if (var1 > 253402300799999L) {
         var1 = 253402300799999L;
      }

      this.field_9366 = var1;
      this.field_9370 = true;
      return this;
   }

   public class_1844 method_8152(String var1) {
      return this.method_8153(var1, false);
   }

   public class_1844 method_8158(String var1) {
      return this.method_8153(var1, true);
   }

   private class_1844 method_8153(String var1, boolean var2) {
      if (var1 != null) {
         String var5 = class_8515.method_39199(var1);
         if (var5 != null) {
            this.field_9365 = var5;
            this.field_9363 = var2;
            return this;
         } else {
            throw new IllegalArgumentException("unexpected domain: " + var1);
         }
      } else {
         throw new NullPointerException("domain == null");
      }
   }

   public class_1844 method_8149(String var1) {
      if (var1.startsWith("/")) {
         this.field_9364 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("path must start with '/'");
      }
   }

   public class_1844 method_8151() {
      this.field_9367 = true;
      return this;
   }

   public class_1844 method_8150() {
      this.field_9369 = true;
      return this;
   }

   public class_8460 method_8156() {
      return new class_8460(this);
   }
}
