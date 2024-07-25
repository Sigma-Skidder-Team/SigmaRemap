package remapped;

public class class_806 extends class_225 {
   private final double field_4303;
   private final double field_4304;

   public class_806(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.field_4303 = var4;
      this.field_4304 = var6;
      if (!(var4 > var6)) {
         if (!(var2 < var4)) {
            if (var2 > var6) {
               throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
            }
         } else {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
         }
      } else {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      }
   }

   @Override
   public double method_954(double var1) {
      return MathHelper.clamp(var1, this.field_4303, this.field_4304);
   }
}
