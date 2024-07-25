package remapped;

public class class_5145 extends HurtByTargetGoal {
   private static String[] field_26497;

   public class_5145(class_9310 var1) {
      super(var1);
   }

   @Override
   public boolean method_16799() {
      if (this.field_4915 instanceof class_9310) {
         class_9310 var3 = (class_9310)this.field_4915;
         if (class_9310.method_42984(var3)) {
            class_9310.method_42981(var3, false);
            return false;
         }
      }

      return super.method_16799();
   }
}
