package remapped;

import com.google.common.collect.ImmutableList;

public class class_618<T extends class_8829> extends class_1498<T> {
   private final class_1549 field_3529;
   private final class_1549 field_3528;
   private final class_1549 field_3527;
   private final class_1549 field_3525;
   private final class_1549 field_3521;
   private final class_1549 field_3526;
   private final class_1549 field_3530;
   private final class_1549 field_3523;
   private final class_1549 field_3522;
   private final class_1549 field_3524;
   private float field_3531;

   public class_618() {
      super(false, 24.0F, 0.0F);
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_3529 = new class_1549(this);
      this.field_3529.method_7046(0.0F, 19.0F, 0.0F);
      this.field_3528 = new class_1549(this, 0, 0);
      this.field_3528.method_7046(0.0F, 0.0F, 0.0F);
      this.field_3529.method_7043(this.field_3528);
      this.field_3528.method_7049(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
      this.field_3523 = new class_1549(this, 26, 7);
      this.field_3523.method_7049(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
      this.field_3528.method_7043(this.field_3523);
      this.field_3522 = new class_1549(this, 2, 0);
      this.field_3522.method_7046(0.0F, -2.0F, -5.0F);
      this.field_3522.method_7049(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field_3524 = new class_1549(this, 2, 3);
      this.field_3524.method_7046(0.0F, -2.0F, -5.0F);
      this.field_3524.method_7049(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field_3528.method_7043(this.field_3522);
      this.field_3528.method_7043(this.field_3524);
      this.field_3527 = new class_1549(this, 0, 18);
      this.field_3527.method_7046(-1.5F, -4.0F, -3.0F);
      this.field_3527.field_8191 = 0.0F;
      this.field_3527.field_8190 = -0.2618F;
      this.field_3527.field_8185 = 0.0F;
      this.field_3529.method_7043(this.field_3527);
      this.field_3527.method_7049(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field_3525 = new class_1549(this, 0, 18);
      this.field_3525.method_7046(1.5F, -4.0F, -3.0F);
      this.field_3525.field_8191 = 0.0F;
      this.field_3525.field_8190 = 0.2618F;
      this.field_3525.field_8185 = 0.0F;
      this.field_3525.field_8197 = true;
      this.field_3529.method_7043(this.field_3525);
      this.field_3525.method_7049(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field_3521 = new class_1549(this);
      this.field_3521.method_7046(1.5F, 3.0F, -2.0F);
      this.field_3529.method_7043(this.field_3521);
      this.field_3521.method_7054("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
      this.field_3526 = new class_1549(this);
      this.field_3526.method_7046(1.5F, 3.0F, 0.0F);
      this.field_3529.method_7043(this.field_3526);
      this.field_3526.method_7054("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
      this.field_3530 = new class_1549(this);
      this.field_3530.method_7046(1.5F, 3.0F, 2.0F);
      this.field_3529.method_7043(this.field_3530);
      this.field_3530.method_7054("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
   }

   public void method_2884(T var1, float var2, float var3, float var4) {
      super.method_29702(var1, var2, var3, var4);
      this.field_3531 = var1.method_40549(var4);
      this.field_3523.field_8200 = !var1.method_40610();
   }

   public void method_2883(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_3527.field_8191 = 0.0F;
      this.field_3522.field_8191 = 0.0F;
      this.field_3524.field_8191 = 0.0F;
      this.field_3529.field_8191 = 0.0F;
      this.field_3529.field_8181 = 19.0F;
      boolean var9 = var1.method_37360() && var1.method_37098().method_6221() < 1.0E-7;
      if (!var9) {
         float var10 = var4 * 2.1F;
         this.field_3527.field_8190 = 0.0F;
         this.field_3527.field_8185 = MathHelper.cos(var10) * (float) Math.PI * 0.15F;
         this.field_3525.field_8191 = this.field_3527.field_8191;
         this.field_3525.field_8190 = this.field_3527.field_8190;
         this.field_3525.field_8185 = -this.field_3527.field_8185;
         this.field_3521.field_8191 = (float) (Math.PI / 4);
         this.field_3526.field_8191 = (float) (Math.PI / 4);
         this.field_3530.field_8191 = (float) (Math.PI / 4);
         this.field_3529.field_8191 = 0.0F;
         this.field_3529.field_8190 = 0.0F;
         this.field_3529.field_8185 = 0.0F;
      } else {
         this.field_3527.field_8190 = -0.2618F;
         this.field_3527.field_8185 = 0.0F;
         this.field_3525.field_8191 = 0.0F;
         this.field_3525.field_8190 = 0.2618F;
         this.field_3525.field_8185 = 0.0F;
         this.field_3521.field_8191 = 0.0F;
         this.field_3526.field_8191 = 0.0F;
         this.field_3530.field_8191 = 0.0F;
      }

      if (!var1.method_28537()) {
         this.field_3529.field_8191 = 0.0F;
         this.field_3529.field_8190 = 0.0F;
         this.field_3529.field_8185 = 0.0F;
         if (!var9) {
            float var11 = MathHelper.cos(var4 * 0.18F);
            this.field_3529.field_8191 = 0.1F + var11 * (float) Math.PI * 0.025F;
            this.field_3522.field_8191 = var11 * (float) Math.PI * 0.03F;
            this.field_3524.field_8191 = var11 * (float) Math.PI * 0.03F;
            this.field_3521.field_8191 = -var11 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.field_3530.field_8191 = -var11 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.field_3529.field_8181 = 19.0F - MathHelper.cos(var4 * 0.18F) * 0.9F;
         }
      }

      if (this.field_3531 > 0.0F) {
         this.field_3529.field_8191 = class_8746.method_40145(this.field_3529.field_8191, 3.0915928F, this.field_3531);
      }
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of();
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_3529);
   }
}
