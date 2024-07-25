package remapped;

public class class_1721<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
   private static String[] field_8889;

   public class_1721(class_7937 var1, Class<T> var2) {
      super(var1, var2, true);
   }

   @Override
   public boolean method_16795() {
      float var3 = this.field_4915.method_37193();
      return !(var3 >= 0.5F) ? super.method_16795() : false;
   }
}
