package remapped;

public class class_964 {
   public boolean field_4940;
   public boolean field_4942;
   public boolean field_4941;
   public boolean field_4944;
   public boolean field_4938 = true;
   private float field_4945 = 0.05F;
   private float field_4943 = 0.1F;

   public void method_4234(class_5734 var1) {
      class_5734 var4 = new class_5734();
      var4.method_25934("invulnerable", this.field_4940);
      var4.method_25934("flying", this.field_4942);
      var4.method_25934("mayfly", this.field_4941);
      var4.method_25934("instabuild", this.field_4944);
      var4.method_25934("mayBuild", this.field_4938);
      var4.method_25920("flySpeed", this.field_4945);
      var4.method_25920("walkSpeed", this.field_4943);
      var1.method_25946("abilities", var4);
   }

   public void method_4232(class_5734 var1) {
      if (var1.method_25939("abilities", 10)) {
         class_5734 var4 = var1.method_25937("abilities");
         this.field_4940 = var4.method_25933("invulnerable");
         this.field_4942 = var4.method_25933("flying");
         this.field_4941 = var4.method_25933("mayfly");
         this.field_4944 = var4.method_25933("instabuild");
         if (var4.method_25939("flySpeed", 99)) {
            this.field_4945 = var4.method_25955("flySpeed");
            this.field_4943 = var4.method_25955("walkSpeed");
         }

         if (var4.method_25939("mayBuild", 1)) {
            this.field_4938 = var4.method_25933("mayBuild");
         }
      }
   }

   public float method_4230() {
      return this.field_4945;
   }

   public void method_4233(float var1) {
      this.field_4945 = var1;
   }

   public float method_4229() {
      return this.field_4943;
   }

   public void method_4231(float var1) {
      this.field_4943 = var1;
   }
}
