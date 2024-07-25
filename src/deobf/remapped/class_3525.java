package remapped;

public class class_3525 {
   private boolean field_17274;
   private int field_17272;
   private int field_17273;
   private int field_17269;
   private int field_17271;

   public class_3525() {
      this(false, 1, 0);
   }

   public class_3525(boolean var1) {
      this(var1, 1, 0);
   }

   public class_3525(boolean var1, int var2, int var3, int var4, int var5) {
      this.field_17274 = var1;
      this.field_17272 = var2;
      this.field_17273 = var3;
      this.field_17269 = var4;
      this.field_17271 = var5;
   }

   public class_3525(boolean var1, int var2, int var3) {
      this(var1, var2, var3, var2, var3);
   }

   public void method_16276(boolean var1, int var2, int var3, int var4, int var5) {
      this.field_17274 = var1;
      this.field_17272 = var2;
      this.field_17273 = var3;
      this.field_17269 = var4;
      this.field_17271 = var5;
   }

   public void method_16275(class_3525 var1) {
      this.field_17274 = var1.field_17274;
      this.field_17272 = var1.field_17272;
      this.field_17273 = var1.field_17273;
      this.field_17269 = var1.field_17269;
      this.field_17271 = var1.field_17271;
   }

   public void method_16283(boolean var1) {
      this.field_17274 = var1;
   }

   public void method_16282() {
      this.field_17274 = true;
   }

   public void method_16281() {
      this.field_17274 = false;
   }

   public void method_16277(int var1, int var2) {
      this.field_17272 = var1;
      this.field_17273 = var2;
      this.field_17269 = var1;
      this.field_17271 = var2;
   }

   public void method_16278(int var1, int var2, int var3, int var4) {
      this.field_17272 = var1;
      this.field_17273 = var2;
      this.field_17269 = var3;
      this.field_17271 = var4;
   }

   public boolean method_16287() {
      return this.field_17274;
   }

   public int method_16273() {
      return this.field_17272;
   }

   public int method_16285() {
      return this.field_17273;
   }

   public int method_16286() {
      return this.field_17269;
   }

   public int method_16279() {
      return this.field_17271;
   }

   public boolean method_16274() {
      return this.field_17272 != this.field_17269 || this.field_17273 != this.field_17271;
   }

   @Override
   public String toString() {
      return "enabled: "
         + this.field_17274
         + ", src: "
         + this.field_17272
         + ", dst: "
         + this.field_17273
         + ", srcAlpha: "
         + this.field_17269
         + ", dstAlpha: "
         + this.field_17271;
   }

   public void method_16280() {
      if (this.field_17274) {
         class_1920.method_8829();
         class_1920.method_8816(this.field_17272, this.field_17273, this.field_17269, this.field_17271);
      } else {
         class_1920.method_8775();
      }
   }
}
