package remapped;

public class class_130 {
   private static String[] field_320;
   private final class_1893 field_323;
   private final class_1973 field_322;
   private float field_321;

   public class_130(class_1973 var1) {
      this.field_322 = var1;
      this.field_323 = class_1893.method_8510();
   }

   public void method_401(float var1, float var2) {
      this.field_321 += var1;
      this.field_322.method_9074(this.field_323, class_9299.method_42818(this.field_321 * 0.001F) * 5.0F + 25.0F, -this.field_321 * 0.1F, var2);
   }
}
