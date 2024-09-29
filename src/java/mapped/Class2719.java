package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class2719 extends NearestAttackableTargetGoal<LivingEntity> {
   private static String[] field17187;

   public Class2719(Class1057 var1) {
      super(var1, LivingEntity.class, 10, true, false, var0 -> var0 instanceof Class1008);
   }

   @Override
   public boolean method10803() {
      return this.field17153.getTeam() != null ? super.method10803() : false;
   }

   @Override
   public AxisAlignedBB method10921(double var1) {
      Direction var5 = ((Class1057)this.field17153).method4848();
      if (var5.getAxis() != Direction.Axis.X) {
         return var5.getAxis() != Direction.Axis.Z
            ? this.field17153.getBoundingBox().grow(var1, 4.0, var1)
            : this.field17153.getBoundingBox().grow(var1, var1, 4.0);
      } else {
         return this.field17153.getBoundingBox().grow(4.0, var1, var1);
      }
   }
}
