package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class Class2757 extends Class2595 {
   private static String[] field17301;
   private final Class1112 field17302;

   public Class2757(Class1112 var1) {
      this.field17302 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return true;
   }

   @Override
   public void method10805() {
      if (this.field17302.method4232() != null) {
         LivingEntity var3 = this.field17302.method4232();
         double var4 = 64.0;
         if (var3.getDistanceSq(this.field17302) < 4096.0) {
            double var6 = var3.getPosX() - this.field17302.getPosX();
            double var8 = var3.getPosZ() - this.field17302.getPosZ();
            this.field17302.rotationYaw = -((float) MathHelper.method37814(var6, var8)) * (180.0F / (float)Math.PI);
            this.field17302.renderYawOffset = this.field17302.rotationYaw;
         }
      } else {
         Vector3d var10 = this.field17302.getMotion();
         this.field17302.rotationYaw = -((float) MathHelper.method37814(var10.x, var10.z)) * (180.0F / (float)Math.PI);
         this.field17302.renderYawOffset = this.field17302.rotationYaw;
      }
   }
}
