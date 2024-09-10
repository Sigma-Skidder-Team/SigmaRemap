package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2718<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
   private static String[] field17187;

   public Class2718(Class1101 var1, Class<T> var2) {
      super(var1, var2, true);
   }

   @Override
   public boolean method10803() {
      float var3 = this.field17153.getBrightness();
      return !(var3 >= 0.5F) ? super.method10803() : false;
   }
}
