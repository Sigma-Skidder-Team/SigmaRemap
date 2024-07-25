package remapped;

import java.awt.Color;

public class class_6128 {
   private static String[] field_31465;
   private float field_31467;
   private float field_31464;
   public float field_31461;
   public float field_31466;
   public float field_31457;
   private float field_31468;
   private float field_31469;
   private float field_31463;
   private boolean field_31460;
   private float field_31455 = 1.0F;
   private class_5794 field_31462 = new class_5794();
   public float field_31459;
   public Color field_31456 = new Color(1.0F, 1.0F, 1.0F, 0.5F);
   public int field_31458 = 0;

   public class_6128(float var1, float var2, float var3) {
      this.field_31461 = this.field_31467 = var1;
      this.field_31466 = this.field_31464 = var2;
      this.field_31457 = var3;
      this.method_28158();
   }

   public class_6128(float var1, float var2) {
      this.field_31461 = this.field_31467 = var1;
      this.field_31466 = this.field_31464 = var2;
      this.field_31457 = (float)this.field_31462.nextInt(1, 3) + this.field_31462.nextFloat();
      this.method_28158();
   }

   private void method_28158() {
      this.field_31469 = this.field_31462.nextFloat() % this.field_31455;
      this.field_31463 = this.field_31462.nextFloat() % this.field_31455;
      this.field_31468 = (this.field_31462.nextFloat() * this.field_31457 + 15.0F) % 25.0F;
      this.field_31460 = this.field_31462.nextBoolean();
      this.field_31459 = this.field_31462.nextFloat() / 2.0F;
      if (this.field_31462.nextBoolean()) {
         this.field_31459 *= -1.0F;
      }
   }

   public void method_28157(float var1) {
      class_73.method_121(
         this.field_31461 * 2.0F, this.field_31466 * 2.0F, this.field_31457 * 2.0F, class_314.method_1444(this.field_31456.getRGB(), var1 * 0.7F)
      );
   }

   public void method_28155(class_9450 var1) {
      this.field_31461 = this.field_31461 + var1.method_43702() + this.field_31459;
      this.field_31467 = this.field_31467 + var1.method_43702() + this.field_31459;
      this.field_31466 = this.field_31466 + this.field_31463;
   }
}
