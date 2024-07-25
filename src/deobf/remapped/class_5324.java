package remapped;

public class class_5324 {
   private static String[] field_27167;
   private float field_27169;
   private float field_27168;
   private float[] field_27170;

   public class_5324(class_1411 var1, float var2, float var3) {
      this.field_27166 = var1;
      this.field_27169 = var2;
      this.field_27168 = var3;
      this.field_27170 = new float[]{var2, var3};
   }

   public float method_24280() {
      return this.field_27169;
   }

   public float method_24278() {
      return this.field_27168;
   }

   public float[] method_24276() {
      return this.field_27170;
   }

   @Override
   public int hashCode() {
      return (int)(this.field_27169 * this.field_27168 * 31.0F);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_5324)) {
         return false;
      } else {
         class_5324 var4 = (class_5324)var1;
         return var4.field_27169 == this.field_27169 && var4.field_27168 == this.field_27168;
      }
   }
}
