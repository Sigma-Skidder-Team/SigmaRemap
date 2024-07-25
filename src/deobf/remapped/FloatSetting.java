package remapped;

public class FloatSetting<T extends Number> extends Setting<Float> {
   private Class<? extends T> field_13452;
   private float field_13449;
   private float field_13453;
   private float field_13451;

   public FloatSetting(String var1, String var2, float var3, Class<? extends T> var4, float var5, float var6, float var7) {
      super(var1, var2, class_5195.field_26718, var3);
      this.field_13452 = var4;
      this.field_13449 = var5;
      this.field_13453 = var6;
      this.field_13451 = var7;
   }

   public int method_12386() {
      if (this.field_13451 != 1.0F) {
         String var3 = Float.toString(Math.abs(this.method_12382()));
         int var4 = var3.indexOf(46);
         return var3.length() - var4 - 1;
      } else {
         return 0;
      }
   }

   @Override
   public class_1293 method_23042(class_1293 var1) {
      this.field_25890 = class_3332.method_15288(var1, "value", this.method_23039());
      return var1;
   }

   public float method_12385() {
      return this.field_13449;
   }

   public void method_12384(float var1) {
      this.field_13449 = var1;
   }

   public float method_12387() {
      return this.field_13453;
   }

   public void method_12383(float var1) {
      this.field_13453 = var1;
   }

   public float method_12382() {
      return this.field_13451;
   }

   public void method_12381(float var1) {
      this.field_13451 = var1;
   }
}
