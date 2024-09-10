package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IAngerable;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class ResetAngerGoal<T extends MobEntity & IAngerable> extends Class2595 {
   private static String[] field17377;
   private final T field17378;
   private final boolean field17379;
   private int field17380;

   public ResetAngerGoal(T var1, boolean var2) {
      this.field17378 = (T)var1;
      this.field17379 = var2;
   }

   @Override
   public boolean method10803() {
      return this.field17378.world.getGameRules().getBoolean(Class5462.field24255) && this.method10967();
   }

   private boolean method10967() {
      return this.field17378.method3014() != null
         && this.field17378.method3014().getType() == EntityType.PLAYER
         && this.field17378.method3015() > this.field17380;
   }

   @Override
   public void method10804() {
      this.field17380 = this.field17378.method3015();
      this.field17378.method4371();
      if (this.field17379) {
         this.method10968().stream().filter(var1 -> var1 != this.field17378).<IAngerable>map(var0 -> (IAngerable)var0).forEach(IAngerable::method4371);
      }

      super.method10804();
   }

   private List<MobEntity> method10968() {
      double var3 = this.field17378.getAttributeValue(Attributes.field42106);
      AxisAlignedBB var5 = AxisAlignedBB.method19657(this.field17378.getPositionVec()).method19663(var3, 10.0, var3);
      return this.field17378.world.<MobEntity>method7183((Class<? extends MobEntity>)this.field17378.getClass(), var5);
   }
}
