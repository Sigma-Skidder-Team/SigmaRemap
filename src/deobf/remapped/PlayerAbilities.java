package remapped;

public class PlayerAbilities {
   public boolean disableDamage;
   public boolean isFlying;
   public boolean allowFlying;
   public boolean isCreativeMode;
   public boolean allowEdit = true;
   private float flySpeed = 0.05F;
   private float walkSpeed = 0.1F;

   public void method_4234(class_5734 var1) {
      class_5734 var4 = new class_5734();
      var4.method_25934("invulnerable", this.disableDamage);
      var4.method_25934("flying", this.isFlying);
      var4.method_25934("mayfly", this.allowFlying);
      var4.method_25934("instabuild", this.isCreativeMode);
      var4.method_25934("mayBuild", this.allowEdit);
      var4.method_25920("flySpeed", this.flySpeed);
      var4.method_25920("walkSpeed", this.walkSpeed);
      var1.method_25946("abilities", var4);
   }

   public void method_4232(class_5734 var1) {
      if (var1.method_25939("abilities", 10)) {
         class_5734 var4 = var1.method_25937("abilities");
         this.disableDamage = var4.method_25933("invulnerable");
         this.isFlying = var4.method_25933("flying");
         this.allowFlying = var4.method_25933("mayfly");
         this.isCreativeMode = var4.method_25933("instabuild");
         if (var4.method_25939("flySpeed", 99)) {
            this.flySpeed = var4.method_25955("flySpeed");
            this.walkSpeed = var4.method_25955("walkSpeed");
         }

         if (var4.method_25939("mayBuild", 1)) {
            this.allowEdit = var4.method_25933("mayBuild");
         }
      }
   }

   public float method_4230() {
      return this.flySpeed;
   }

   public void method_4233(float var1) {
      this.flySpeed = var1;
   }

   public float method_4229() {
      return this.walkSpeed;
   }

   public void method_4231(float var1) {
      this.walkSpeed = var1;
   }
}
