package remapped;

public class class_4523 extends class_9873 {
   private static String[] field_22084;
   private final class_1549 field_22083;
   private final class_1549 field_22085;

   public class_4523() {
      super(class_3581::method_16734);
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_22083 = new class_1549(this, 0, 0);
      this.field_22083.method_7049(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
      this.field_22085 = new class_1549(this, 26, 0);
      this.field_22085.method_7049(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
   }

   public class_1549 method_21019() {
      return this.field_22083;
   }

   public class_1549 method_21018() {
      return this.field_22085;
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_22083.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_22085.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
