package mapped;

import net.minecraft.entity.LivingEntity;

public class Class2656 extends Class2647 {
   private static String[] field16989;
   public final VindicatorEntity field17009;

   public Class2656(VindicatorEntity var1, VindicatorEntity var2) {
      super(var2, 1.0, false);
      this.field17009 = var1;
   }

   @Override
   public double method10859(LivingEntity var1) {
      if (!(this.field16990.getRidingEntity() instanceof RavagerEntity)) {
         return super.method10859(var1);
      } else {
         float var4 = this.field16990.getRidingEntity().getWidth() - 0.1F;
         return (double)(var4 * 2.0F * var4 * 2.0F + var1.getWidth());
      }
   }
}
