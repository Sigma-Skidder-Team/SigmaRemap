package mapped;

import net.minecraft.entity.Entity;

public class Class7860 extends Class7859 {
   private static String[] field33668;
   public final Entity field33669;

   public Class7860(Entity var1) {
      this.field33669 = var1;
   }

   @Override
   public boolean method26354(Class9110 var1) {
      return this.field33669.getDistanceSq(var1.method33972()) < 9.0;
   }

   @Override
   public double method26355(Class9110 var1) {
      return this.field33669.getDistanceSq(var1.method33972());
   }
}
