package mapped;

import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.util.DamageSource;

public abstract class Class7362 extends Class7361 {
   public Class7362(Class1007 var1) {
      super(var1);
   }

   @Override
   public boolean method23358() {
      return true;
   }

   @Override
   public float method23366(DamageSource var1, float var2) {
      if (!(var1.method31113() instanceof AbstractArrowEntity)) {
         return super.method23366(var1, var2);
      } else {
         var1.method31113().method3221(1);
         return 0.0F;
      }
   }
}
