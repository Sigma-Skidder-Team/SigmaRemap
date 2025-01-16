package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class2715 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field17187;

   public Class2715(BeeEntity var1) {
      super(var1, PlayerEntity.class, 10, true, false, var1::method4367);
   }

   @Override
   public boolean method10803() {
      return this.method10928() && super.method10803();
   }

   @Override
   public boolean method10806() {
      boolean var3 = this.method10928();
      if (var3 && this.field17153.method4232() != null) {
         return super.method10806();
      } else {
         this.field17159 = null;
         return false;
      }
   }

   private boolean method10928() {
      BeeEntity var3 = (BeeEntity)this.field17153;
      return var3.method4369() && !var3.method4440();
   }
}
