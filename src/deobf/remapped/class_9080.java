package remapped;

public class class_9080 implements class_3377 {
   private static String[] field_46512;
   private int field_46510;
   private int field_46508;
   private int field_46509 = 50;
   private int field_46507;
   private float field_46511 = 40.0F;

   public class_9080() {
   }

   public class_9080(int var1, int var2) {
      this.field_46510 = var1;
      this.field_46508 = var2;
   }

   public class_9080(int var1, int var2, float var3) {
      this.field_46510 = var1;
      this.field_46508 = var2;
      this.field_46511 = var3;
   }

   @Override
   public void method_15576(class_8095 var1, int var2) {
      this.field_46507 -= var2;
      if (this.field_46507 <= 0) {
         this.field_46507 = this.field_46509;
         class_168 var5 = var1.method_36765(this, 1000.0F);
         var5.method_690(1.0F, 1.0F, 1.0F, 0.5F);
         var5.method_681((float)this.field_46510, (float)this.field_46508);
         var5.method_692(this.field_46511);
         float var6 = (float)(-0.02F + Math.random() * 0.04F);
         float var7 = (float)(-(Math.random() * 0.15F));
         var5.method_669(var6, var7, 1.1F);
      }
   }

   @Override
   public void method_15574(class_168 var1, int var2) {
      if (!(var1.method_673() > 600.0F)) {
         var1.method_688(-0.04F * (float)var2 * (this.field_46511 / 40.0F));
      } else {
         var1.method_688(0.07F * (float)var2);
      }

      float var5 = 0.002F * (float)var2;
      var1.method_677(0.0F, -var5 / 2.0F, -var5 * 2.0F, -var5 / 4.0F);
   }

   @Override
   public boolean method_15577() {
      return true;
   }

   @Override
   public void method_15575(boolean var1) {
   }

   @Override
   public boolean method_15569() {
      return false;
   }

   @Override
   public boolean method_15572() {
      return false;
   }

   @Override
   public class_8112 method_15570() {
      return null;
   }

   @Override
   public boolean method_15568(class_8095 var1) {
      return false;
   }

   @Override
   public boolean method_15573() {
      return false;
   }

   @Override
   public void method_15571() {
   }

   @Override
   public void method_15567() {
   }
}
