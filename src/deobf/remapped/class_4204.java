package remapped;

public class class_4204<T extends LivingEntity> extends class_6837<T> {
   private static String[] field_20445;
   private final class_5583 field_20444;

   public class_4204(class_5583 var1, Class<T> var2, float var3, double var4, double var6) {
      super(var1, var2, var3, var4, var6, class_3572.field_17479::test);
      this.field_20444 = var1;
   }

   @Override
   public boolean method_16795() {
      return !this.field_20444.method_41215() && super.method_16795();
   }

   @Override
   public boolean method_16799() {
      return !this.field_20444.method_41215() && super.method_16799();
   }
}
