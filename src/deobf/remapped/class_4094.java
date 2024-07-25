package remapped;

public class class_4094<T extends class_5521> extends class_3192<T> {
   private static String[] field_19946;
   private final class_1549 field_19945 = new class_1549(this, 26, 21);
   private final class_1549 field_19947;

   public class_4094(float var1) {
      super(var1);
      this.field_19945.method_7048(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.field_19947 = new class_1549(this, 26, 21);
      this.field_19947.method_7048(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.field_19945.field_8190 = (float) (-Math.PI / 2);
      this.field_19947.field_8190 = (float) (Math.PI / 2);
      this.field_19945.method_7046(6.0F, -8.0F, 0.0F);
      this.field_19947.method_7046(-6.0F, -8.0F, 0.0F);
      this.field_15944.method_7043(this.field_19945);
      this.field_15944.method_7043(this.field_19947);
   }

   @Override
   public void method_14691(class_1549 var1) {
      class_1549 var4 = new class_1549(this, 0, 12);
      var4.method_7048(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var4.method_7046(1.25F, -10.0F, 4.0F);
      class_1549 var5 = new class_1549(this, 0, 12);
      var5.method_7048(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var5.method_7046(-1.25F, -10.0F, 4.0F);
      var4.field_8191 = (float) (Math.PI / 12);
      var4.field_8185 = (float) (Math.PI / 12);
      var5.field_8191 = (float) (Math.PI / 12);
      var5.field_8185 = (float) (-Math.PI / 12);
      var1.method_7043(var4);
      var1.method_7043(var5);
   }

   public void method_18932(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_14690((T)var1, var2, var3, var4, var5, var6);
      if (!var1.method_25017()) {
         this.field_19945.field_8200 = false;
         this.field_19947.field_8200 = false;
      } else {
         this.field_19945.field_8200 = true;
         this.field_19947.field_8200 = true;
      }
   }
}
