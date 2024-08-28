package mapped;

public class Class6799 {
   public boolean field29606;
   public boolean field29607;
   public boolean field29608;
   public boolean field29609;
   public boolean field29610 = true;
   private float field29611 = 0.05F;
   private float field29612 = 0.1F;

   public void method20712(Class39 var1) {
      Class39 var4 = new Class39();
      var4.method115("invulnerable", this.field29606);
      var4.method115("flying", this.field29607);
      var4.method115("mayfly", this.field29608);
      var4.method115("instabuild", this.field29609);
      var4.method115("mayBuild", this.field29610);
      var4.method107("flySpeed", this.field29611);
      var4.method107("walkSpeed", this.field29612);
      var1.method99("abilities", var4);
   }

   public void method20713(Class39 var1) {
      if (var1.method119("abilities", 10)) {
         Class39 var4 = var1.method130("abilities");
         this.field29606 = var4.method132("invulnerable");
         this.field29607 = var4.method132("flying");
         this.field29608 = var4.method132("mayfly");
         this.field29609 = var4.method132("instabuild");
         if (var4.method119("flySpeed", 99)) {
            this.field29611 = var4.method124("flySpeed");
            this.field29612 = var4.method124("walkSpeed");
         }

         if (var4.method119("mayBuild", 1)) {
            this.field29610 = var4.method132("mayBuild");
         }
      }
   }

   public float method20714() {
      return this.field29611;
   }

   public void method20715(float var1) {
      this.field29611 = var1;
   }

   public float method20716() {
      return this.field29612;
   }

   public void method20717(float var1) {
      this.field29612 = var1;
   }
}
