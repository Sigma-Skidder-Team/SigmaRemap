package mapped;

import net.minecraft.entity.ai.attributes.Attributes;

public class Class6841 extends Class6829 {
   private static String[] field29706;
   private float field29730;
   private int field29731;
   private final Class1108 field29732;
   private boolean field29733;

   public Class6841(Class1108 var1) {
      super(var1);
      this.field29732 = var1;
      this.field29730 = 180.0F * var1.rotationYaw / (float) Math.PI;
   }

   public void method20822(float var1, boolean var2) {
      this.field29730 = var1;
      this.field29733 = var2;
   }

   public void method20823(double var1) {
      this.field29711 = var1;
      this.field29714 = Class2335.field15967;
   }

   @Override
   public void method20810() {
      this.field29707.rotationYaw = this.method20816(this.field29707.rotationYaw, this.field29730, 90.0F);
      this.field29707.rotationYawHead = this.field29707.rotationYaw;
      this.field29707.renderYawOffset = this.field29707.rotationYaw;
      if (this.field29714 == Class2335.field15967) {
         this.field29714 = Class2335.field15966;
         if (!this.field29707.isOnGround()) {
            this.field29707.setAIMoveSpeed((float)(this.field29711 * this.field29707.getAttributeValue(Attributes.MOVEMENT_SPEED)));
         } else {
            this.field29707.setAIMoveSpeed((float)(this.field29711 * this.field29707.getAttributeValue(Attributes.MOVEMENT_SPEED)));
            if (this.field29731-- > 0) {
               this.field29732.moveStrafing = 0.0F;
               this.field29732.moveForward = 0.0F;
               this.field29707.setAIMoveSpeed(0.0F);
            } else {
               this.field29731 = this.field29732.method5323();
               if (this.field29733) {
                  this.field29731 /= 3;
               }

               this.field29732.method4229().method27049();
               if (this.field29732.method5329()) {
                  this.field29732.playSound(this.field29732.method5331(), this.field29732.getSoundVolume(), Class1108.method5333(this.field29732));
               }
            }
         }
      } else {
         this.field29707.method4243(0.0F);
      }
   }
}
