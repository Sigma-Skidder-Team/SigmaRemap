package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2653 extends Class2647 {
   private static String[] field16989;
   public final RavagerEntity field17005;

   public Class2653(RavagerEntity var1) {
      super(var1, 1.0, true);
      this.field17005 = var1;
   }

   @Override
   public double method10859(LivingEntity var1) {
      float var4 = this.field17005.getWidth() - 0.1F;
      return (double)(var4 * 2.0F * var4 * 2.0F + var1.getWidth());
   }
}
