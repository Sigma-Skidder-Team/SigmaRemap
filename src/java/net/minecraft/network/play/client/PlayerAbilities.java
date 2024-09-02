package net.minecraft.network.play.client;

import net.minecraft.nbt.CompoundNBT;

public class PlayerAbilities {
   public boolean disableDamage;
   public boolean isFlying;
   public boolean allowFlying;
   public boolean isCreativeMode;
   public boolean allowEdit = true;
   private float flySpeed = 0.05F;
   private float walkSpeed = 0.1F;

   public void method20712(CompoundNBT var1) {
      CompoundNBT var4 = new CompoundNBT();
      var4.putBoolean("invulnerable", this.disableDamage);
      var4.putBoolean("flying", this.isFlying);
      var4.putBoolean("mayfly", this.allowFlying);
      var4.putBoolean("instabuild", this.isCreativeMode);
      var4.putBoolean("mayBuild", this.allowEdit);
      var4.putFloat("flySpeed", this.flySpeed);
      var4.putFloat("walkSpeed", this.walkSpeed);
      var1.put("abilities", var4);
   }

   public void read(CompoundNBT var1) {
      if (var1.contains("abilities", 10)) {
         CompoundNBT var4 = var1.getCompound("abilities");
         this.disableDamage = var4.getBoolean("invulnerable");
         this.isFlying = var4.getBoolean("flying");
         this.allowFlying = var4.getBoolean("mayfly");
         this.isCreativeMode = var4.getBoolean("instabuild");
         if (var4.contains("flySpeed", 99)) {
            this.flySpeed = var4.getFloat("flySpeed");
            this.walkSpeed = var4.getFloat("walkSpeed");
         }

         if (var4.contains("mayBuild", 1)) {
            this.allowEdit = var4.getBoolean("mayBuild");
         }
      }
   }

   public float getFlySpeed() {
      return this.flySpeed;
   }

   public void setFlySpeed(float var1) {
      this.flySpeed = var1;
   }

   public float getWalkSpeed() {
      return this.walkSpeed;
   }

   public void setWalkSpeed(float var1) {
      this.walkSpeed = var1;
   }
}
