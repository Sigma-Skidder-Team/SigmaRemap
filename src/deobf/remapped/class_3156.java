package remapped;

import java.util.EnumSet;

public class class_3156 extends class_3599 {
   private static String[] field_15685;
   private final class_4206 field_15684;

   public class_3156(class_4206 var1) {
      this.field_15684 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return true;
   }

   @Override
   public void method_16794() {
      if (this.field_15684.getAttackTarget() != null) {
         LivingEntity var3 = this.field_15684.getAttackTarget();
         double var4 = 64.0;
         if (var3.method_37275(this.field_15684) < 4096.0) {
            double var6 = var3.getPosX() - this.field_15684.getPosX();
            double var8 = var3.getPosZ() - this.field_15684.getPosZ();
            this.field_15684.rotationYaw = -((float) MathHelper.atan2(var6, var8)) * (180.0F / (float)Math.PI);
            this.field_15684.field_29605 = this.field_15684.rotationYaw;
         }
      } else {
         class_1343 var10 = this.field_15684.method_37098();
         this.field_15684.rotationYaw = -((float) MathHelper.atan2(var10.field_7336, var10.field_7334)) * (180.0F / (float)Math.PI);
         this.field_15684.field_29605 = this.field_15684.rotationYaw;
      }
   }
}
