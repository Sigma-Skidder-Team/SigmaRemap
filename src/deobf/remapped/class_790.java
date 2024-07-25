package remapped;

public class class_790 {
   public static final int field_4239 = 0;
   public static final int field_4235 = 1;
   public static final int field_4237 = 2;
   public static final int field_4236 = 3;
   public static final class_790 field_4238 = new class_790(1);
   public static final class_790 field_4232 = new class_790(2);
   public static final class_790 field_4234 = new class_790(0);
   public static final class_790 field_4233 = new class_790(3);
   private int field_4240;

   public static class_790 method_3504(int var0) {
      switch (var0) {
         case 0:
            return field_4234;
         case 1:
            return field_4238;
         case 2:
            return field_4232;
         case 3:
            return field_4233;
         default:
            throw new IllegalArgumentException("Invalid channel code: " + var0);
      }
   }

   private class_790(int var1) {
      this.field_4240 = var1;
      if (var1 < 0 || var1 > 3) {
         throw new IllegalArgumentException("channels");
      }
   }

   public int method_3506() {
      return this.field_4240;
   }

   public int method_3507() {
      return this.field_4240 != 0 ? 1 : 2;
   }

   @Override
   public boolean equals(Object var1) {
      boolean var4 = false;
      if (var1 instanceof class_790) {
         class_790 var5 = (class_790)var1;
         var4 = var5.field_4240 == this.field_4240;
      }

      return var4;
   }

   @Override
   public int hashCode() {
      return this.field_4240;
   }
}
