package mapped;

import net.minecraft.entity.passive.WolfEntity;

public class Class2717 extends NearestAttackableTargetGoal<WolfEntity> {
   private static String[] field17187;

   public Class2717(LlamaEntity var1) {
      super(var1, WolfEntity.class, 16, false, true, var0 -> !((WolfEntity)var0).method4393());
   }

   @Override
   public double method10914() {
      return super.method10914() * 0.25;
   }
}
