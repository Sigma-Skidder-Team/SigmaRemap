package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.Difficulty;

public class Class2721 extends NearestAttackableTargetGoal<PlayerEntity> {
   private static String[] field17187;
   public final ShulkerEntity field17207;

   public Class2721(ShulkerEntity var1, ShulkerEntity var2) {
      super(var2, PlayerEntity.class, true);
      this.field17207 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17207.world.method6997() != Difficulty.PEACEFUL ? super.method10803() : false;
   }

   @Override
   public AxisAlignedBB method10921(double var1) {
      Direction var5 = ((ShulkerEntity)this.field17153).method4848();
      if (var5.getAxis() != Direction.Axis.X) {
         return var5.getAxis() != Direction.Axis.Z
            ? this.field17153.getBoundingBox().grow(var1, 4.0, var1)
            : this.field17153.getBoundingBox().grow(var1, var1, 4.0);
      } else {
         return this.field17153.getBoundingBox().grow(4.0, var1, var1);
      }
   }
}
