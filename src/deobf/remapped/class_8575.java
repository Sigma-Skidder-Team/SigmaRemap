package remapped;

import com.google.common.collect.ImmutableList;

public class class_8575 extends class_5272<RavagerEntity> {
   private static String[] field_43949;
   private final class_1549 field_43954;
   private final class_1549 field_43955;
   private final class_1549 field_43952;
   private final class_1549 field_43950;
   private final class_1549 field_43956;
   private final class_1549 field_43953;
   private final class_1549 field_43951;
   private final class_1549 field_43948;

   public class_8575() {
      this.field_49928 = 128;
      this.field_49927 = 128;
      byte var3 = 16;
      float var4 = 0.0F;
      this.field_43948 = new class_1549(this);
      this.field_43948.method_7046(0.0F, -7.0F, -1.5F);
      this.field_43948.method_7037(68, 73).method_7049(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
      this.field_43954 = new class_1549(this);
      this.field_43954.method_7046(0.0F, 16.0F, -17.0F);
      this.field_43954.method_7037(0, 0).method_7049(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
      this.field_43954.method_7037(0, 0).method_7049(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
      class_1549 var5 = new class_1549(this);
      var5.method_7046(-10.0F, -14.0F, -8.0F);
      var5.method_7037(74, 55).method_7049(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var5.field_8191 = 1.0995574F;
      this.field_43954.method_7043(var5);
      class_1549 var6 = new class_1549(this);
      var6.field_8197 = true;
      var6.method_7046(8.0F, -14.0F, -8.0F);
      var6.method_7037(74, 55).method_7049(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var6.field_8191 = 1.0995574F;
      this.field_43954.method_7043(var6);
      this.field_43955 = new class_1549(this);
      this.field_43955.method_7046(0.0F, -2.0F, 2.0F);
      this.field_43955.method_7037(0, 36).method_7049(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
      this.field_43954.method_7043(this.field_43955);
      this.field_43948.method_7043(this.field_43954);
      this.field_43952 = new class_1549(this);
      this.field_43952.method_7037(0, 55).method_7049(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
      this.field_43952.method_7037(0, 91).method_7049(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
      this.field_43952.method_7046(0.0F, 1.0F, 2.0F);
      this.field_43950 = new class_1549(this, 96, 0);
      this.field_43950.method_7049(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field_43950.method_7046(-8.0F, -13.0F, 18.0F);
      this.field_43956 = new class_1549(this, 96, 0);
      this.field_43956.field_8197 = true;
      this.field_43956.method_7049(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field_43956.method_7046(8.0F, -13.0F, 18.0F);
      this.field_43953 = new class_1549(this, 64, 0);
      this.field_43953.method_7049(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field_43953.method_7046(-8.0F, -13.0F, -5.0F);
      this.field_43951 = new class_1549(this, 64, 0);
      this.field_43951.field_8197 = true;
      this.field_43951.method_7049(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.field_43951.method_7046(8.0F, -13.0F, -5.0F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_43948, this.field_43952, this.field_43950, this.field_43956, this.field_43953, this.field_43951);
   }

   public void method_39446(RavagerEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_43954.field_8191 = var6 * (float) (Math.PI / 180.0);
      this.field_43954.field_8190 = var5 * (float) (Math.PI / 180.0);
      this.field_43952.field_8191 = (float) (Math.PI / 2);
      float var9 = 0.4F * var3;
      this.field_43950.field_8191 = MathHelper.cos(var2 * 0.6662F) * var9;
      this.field_43956.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field_43953.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * var9;
      this.field_43951.field_8191 = MathHelper.cos(var2 * 0.6662F) * var9;
   }

   public void method_39447(RavagerEntity var1, float var2, float var3, float var4) {
      super.method_29702(var1, var2, var3, var4);
      int var7 = var1.method_35654();
      int var8 = var1.method_35655();
      byte var9 = 20;
      int var10 = var1.method_35656();
      byte var11 = 10;
      if (var10 <= 0) {
         float var12 = -1.0F;
         float var13 = -1.0F * MathHelper.sin(this.field_43948.field_8191);
         this.field_43948.field_8183 = 0.0F;
         this.field_43948.field_8181 = -7.0F - var13;
         this.field_43948.field_8187 = 5.5F;
         boolean var14 = var7 > 0;
         this.field_43948.field_8191 = !var14 ? 0.0F : 0.21991149F;
         this.field_43955.field_8191 = (float) Math.PI * (!var14 ? 0.01F : 0.05F);
         if (!var14) {
            if (var8 > 0) {
               float var15 = MathHelper.sin(((float)(20 - var8) - var4) / 20.0F * (float) Math.PI * 0.25F);
               this.field_43955.field_8191 = (float) (Math.PI / 2) * var15;
            }
         } else {
            double var17 = (double)var7 / 40.0;
            this.field_43948.field_8183 = (float)Math.sin(var17 * 10.0) * 3.0F;
         }
      } else {
         float var19 = MathHelper.method_42852((float)var10 - var4, 10.0F);
         float var20 = (1.0F + var19) * 0.5F;
         float var21 = var20 * var20 * var20 * 12.0F;
         float var22 = var21 * MathHelper.sin(this.field_43948.field_8191);
         this.field_43948.field_8187 = -6.5F + var21;
         this.field_43948.field_8181 = -7.0F - var22;
         float var16 = MathHelper.sin(((float)var10 - var4) / 10.0F * (float) Math.PI * 0.25F);
         this.field_43955.field_8191 = (float) (Math.PI / 2) * var16;
         if (var10 <= 5) {
            this.field_43955.field_8191 = (float) (Math.PI / 20) * MathHelper.sin((float) Math.PI * ((float)var10 - var4) / 10.0F);
         } else {
            this.field_43955.field_8191 = MathHelper.sin(((float)(-4 + var10) - var4) / 4.0F) * (float) Math.PI * 0.4F;
         }
      }
   }
}
