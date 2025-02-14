package mapped;

public class Class6136 implements Class6135 {
   private static String[] field27525;
   private int field27526;
   private int field27527;
   private int field27528 = 50;
   private int field27529;
   private float field27530 = 40.0F;

   public Class6136() {
   }

   public Class6136(int var1, int var2) {
      this.field27526 = var1;
      this.field27527 = var2;
   }

   public Class6136(int var1, int var2, float var3) {
      this.field27526 = var1;
      this.field27527 = var2;
      this.field27530 = var3;
   }

   @Override
   public void method18944(Class9365 var1, int var2) {
      this.field27529 -= var2;
      if (this.field27529 <= 0) {
         this.field27529 = this.field27528;
         Class4536 var5 = var1.method35488(this, 1000.0F);
         var5.method14482(1.0F, 1.0F, 1.0F, 0.5F);
         var5.method14483((float)this.field27526, (float)this.field27527);
         var5.method14477(this.field27530);
         float var6 = (float)(-0.02F + Math.random() * 0.04F);
         float var7 = (float)(-(Math.random() * 0.15F));
         var5.method14484(var6, var7, 1.1F);
      }
   }

   @Override
   public void method18945(Class4536 var1, int var2) {
      if (!(var1.method14469() > 600.0F)) {
         var1.method14478(-0.04F * (float)var2 * (this.field27530 / 40.0F));
      } else {
         var1.method14478(0.07F * (float)var2);
      }

      float var5 = 0.002F * (float)var2;
      var1.method14488(0.0F, -var5 / 2.0F, -var5 * 2.0F, -var5 / 4.0F);
   }

   @Override
   public boolean method18942() {
      return true;
   }

   @Override
   public void method18943(boolean var1) {
   }

   @Override
   public boolean method18946() {
      return false;
   }

   @Override
   public boolean method18952() {
      return false;
   }

   @Override
   public Image method18955() {
      return null;
   }

   @Override
   public boolean method18954(Class9365 var1) {
      return false;
   }

   @Override
   public boolean method18953() {
      return false;
   }

   @Override
   public void method18956() {
   }

   @Override
   public void method18957() {
   }
}
