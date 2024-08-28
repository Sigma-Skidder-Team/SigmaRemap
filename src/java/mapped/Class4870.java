package mapped;

public class Class4870 extends Class4869 {
   private final double field22697;
   private final double field22698;

   public Class4870(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.field22697 = var4;
      this.field22698 = var6;
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
   public double method15031(double var1) {
      return MathHelper.method37778(var1, this.field22697, this.field22698);
   }
}
