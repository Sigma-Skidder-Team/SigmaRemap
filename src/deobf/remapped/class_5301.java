package remapped;

import com.google.common.collect.ImmutableList;

public class class_5301 extends class_5272<class_2022> {
   private static String[] field_27092;
   private final class_1549 field_27093;
   private final class_1549 field_27091;
   private final class_1549 field_27089;
   private final class_1549 field_27095;
   private final class_1549 field_27094;
   private final class_1549 field_27090;

   public class_5301() {
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_27093 = new class_1549(this, 0, 0);
      this.field_27093.method_7048(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      class_1549 var3 = new class_1549(this, 24, 0);
      var3.method_7048(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field_27093.method_7043(var3);
      class_1549 var4 = new class_1549(this, 24, 0);
      var4.field_8197 = true;
      var4.method_7048(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
      this.field_27093.method_7043(var4);
      this.field_27091 = new class_1549(this, 0, 16);
      this.field_27091.method_7048(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
      this.field_27091.method_7037(0, 34).method_7048(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
      this.field_27089 = new class_1549(this, 42, 0);
      this.field_27089.method_7048(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field_27094 = new class_1549(this, 24, 16);
      this.field_27094.method_7046(-12.0F, 1.0F, 1.5F);
      this.field_27094.method_7048(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field_27095 = new class_1549(this, 42, 0);
      this.field_27095.field_8197 = true;
      this.field_27095.method_7048(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
      this.field_27090 = new class_1549(this, 24, 16);
      this.field_27090.field_8197 = true;
      this.field_27090.method_7046(12.0F, 1.0F, 1.5F);
      this.field_27090.method_7048(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
      this.field_27091.method_7043(this.field_27089);
      this.field_27091.method_7043(this.field_27095);
      this.field_27089.method_7043(this.field_27094);
      this.field_27095.method_7043(this.field_27090);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_27093, this.field_27091);
   }

   public void method_24232(class_2022 var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.method_9392()) {
         this.field_27093.field_8191 = var6 * (float) (Math.PI / 180.0);
         this.field_27093.field_8190 = var5 * (float) (Math.PI / 180.0);
         this.field_27093.field_8185 = 0.0F;
         this.field_27093.method_7046(0.0F, 0.0F, 0.0F);
         this.field_27089.method_7046(0.0F, 0.0F, 0.0F);
         this.field_27095.method_7046(0.0F, 0.0F, 0.0F);
         this.field_27091.field_8191 = (float) (Math.PI / 4) + MathHelper.cos(var4 * 0.1F) * 0.15F;
         this.field_27091.field_8190 = 0.0F;
         this.field_27089.field_8190 = MathHelper.cos(var4 * 1.3F) * (float) Math.PI * 0.25F;
         this.field_27095.field_8190 = -this.field_27089.field_8190;
         this.field_27094.field_8190 = this.field_27089.field_8190 * 0.5F;
         this.field_27090.field_8190 = -this.field_27089.field_8190 * 0.5F;
      } else {
         this.field_27093.field_8191 = var6 * (float) (Math.PI / 180.0);
         this.field_27093.field_8190 = (float) Math.PI - var5 * (float) (Math.PI / 180.0);
         this.field_27093.field_8185 = (float) Math.PI;
         this.field_27093.method_7046(0.0F, -2.0F, 0.0F);
         this.field_27089.method_7046(-3.0F, 0.0F, 3.0F);
         this.field_27095.method_7046(3.0F, 0.0F, 3.0F);
         this.field_27091.field_8191 = (float) Math.PI;
         this.field_27089.field_8191 = (float) (-Math.PI / 20);
         this.field_27089.field_8190 = (float) (-Math.PI * 2.0 / 5.0);
         this.field_27094.field_8190 = -1.7278761F;
         this.field_27095.field_8191 = this.field_27089.field_8191;
         this.field_27095.field_8190 = -this.field_27089.field_8190;
         this.field_27090.field_8190 = -this.field_27094.field_8190;
      }
   }
}
