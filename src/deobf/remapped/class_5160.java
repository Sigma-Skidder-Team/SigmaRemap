package remapped;

public class class_5160<T extends LivingEntity> extends class_6837<T> {
   private static String[] field_26571;
   private final class_9408 field_26570;

   public class_5160(class_9408 var1, Class<T> var2, float var3, double var4, double param6, double param8) {
      super(var2, var3, var4, var5, var7);
      this.field_26572 = var1;
      this.field_26570 = var2;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && this.field_35258 instanceof class_9310
         ? !this.field_26570.method_41215() && this.method_23649((class_9310)this.field_35258)
         : false;
   }

   private boolean method_23649(class_9310 var1) {
      return var1.method_42988() >= class_9408.method_43580(this.field_26572).nextInt(5);
   }

   @Override
   public void method_16796() {
      this.field_26572.method_26860((LivingEntity)null);
      super.method_16796();
   }

   @Override
   public void method_16794() {
      this.field_26572.method_26860((LivingEntity)null);
      super.method_16794();
   }
}
