package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2706 extends HurtByTargetGoal {
   private static String[] field17178;
   private final PandaEntity field17184;

   public Class2706(PandaEntity var1, Class<?>... var2) {
      super(var1, var2);
      this.field17184 = var1;
   }

   @Override
   public boolean method10806() {
      if (!PandaEntity.method5239(this.field17184) && !PandaEntity.method5240(this.field17184)) {
         return super.method10806();
      } else {
         this.field17184.method4233((LivingEntity)null);
         return false;
      }
   }

   @Override
   public void method10920(MobEntity var1, LivingEntity var2) {
      if (var1 instanceof PandaEntity && ((PandaEntity)var1).method4307()) {
         var1.method4233(var2);
      }
   }
}
