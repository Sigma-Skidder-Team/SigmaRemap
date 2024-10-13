package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.jello.Client;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

public class Class167 implements Predicate<Entity> {
   private static String[] field537;
   public final float field538;
   public final Vector3d field539;
   public final Vector3d field540;
   public final Class2309 field541;

   public Class167(Class2309 var1, float var2, Vector3d var3, Vector3d var4) {
      this.field541 = var1;
      this.field538 = var2;
      this.field539 = var3;
      this.field540 = var4;
   }

   public boolean apply(Entity var1) {
      AxisAlignedBB var4 = var1.getBoundingBox().expand((double)this.field538, (double)this.field538, (double)this.field538);
      boolean var5 = var4.method19672(this.field539, this.field540);
      return var1 != null && var1.canBeCollidedWith() && var5 && !Client.getInstance().getCombatManager().isTargetABot(var1);
   }
}
