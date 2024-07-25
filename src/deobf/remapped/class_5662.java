package remapped;

public class class_5662 extends class_9037 {
   private static String[] field_28704;

   public class_5662(class_5542 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.field_28705 = var1;
   }

   @Override
   public void method_41489(LivingEntity var1, double var2) {
      double var6 = this.method_41492(var1);
      if (var2 <= var6 && this.method_41493()) {
         this.method_41491();
         this.field_46244.method_26442(var1);
         this.field_28705.method_37155(SoundEvents.field_2317, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_16796() {
      this.field_28705.method_25181(false);
      super.method_16796();
   }

   @Override
   public boolean method_16795() {
      return !this.field_28705.method_25205()
         && !this.field_28705.method_26507()
         && !this.field_28705.method_37382()
         && !this.field_28705.method_25212()
         && super.method_16795();
   }
}
