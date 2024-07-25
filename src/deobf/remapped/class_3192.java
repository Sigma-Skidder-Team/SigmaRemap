package remapped;

import com.google.common.collect.ImmutableList;

public class class_3192<T extends class_4109> extends class_1498<T> {
   private static String[] field_15939;
   public final class_1549 field_15944;
   public final class_1549 field_15938;
   private final class_1549 field_15945;
   private final class_1549 field_15942;
   private final class_1549 field_15940;
   private final class_1549 field_15933;
   private final class_1549 field_15943;
   private final class_1549 field_15935;
   private final class_1549 field_15941;
   private final class_1549 field_15946;
   private final class_1549 field_15934;
   private final class_1549[] field_15937;
   private final class_1549[] field_15936;

   public class_3192(float var1) {
      super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_15944 = new class_1549(this, 0, 32);
      this.field_15944.method_7049(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, 0.05F);
      this.field_15944.method_7046(0.0F, 11.0F, 5.0F);
      this.field_15938 = new class_1549(this, 0, 35);
      this.field_15938.method_7048(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F);
      this.field_15938.field_8191 = (float) (Math.PI / 6);
      class_1549 var4 = new class_1549(this, 0, 13);
      var4.method_7049(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, var1);
      class_1549 var5 = new class_1549(this, 56, 36);
      var5.method_7049(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, var1);
      class_1549 var6 = new class_1549(this, 0, 25);
      var6.method_7049(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, var1);
      this.field_15938.method_7043(var4);
      this.field_15938.method_7043(var5);
      this.field_15938.method_7043(var6);
      this.method_14691(this.field_15938);
      this.field_15945 = new class_1549(this, 48, 21);
      this.field_15945.field_8197 = true;
      this.field_15945.method_7049(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field_15945.method_7046(4.0F, 14.0F, 7.0F);
      this.field_15942 = new class_1549(this, 48, 21);
      this.field_15942.method_7049(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1);
      this.field_15942.method_7046(-4.0F, 14.0F, 7.0F);
      this.field_15940 = new class_1549(this, 48, 21);
      this.field_15940.field_8197 = true;
      this.field_15940.method_7049(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field_15940.method_7046(4.0F, 6.0F, -12.0F);
      this.field_15933 = new class_1549(this, 48, 21);
      this.field_15933.method_7049(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1);
      this.field_15933.method_7046(-4.0F, 6.0F, -12.0F);
      float var7 = 5.5F;
      this.field_15943 = new class_1549(this, 48, 21);
      this.field_15943.field_8197 = true;
      this.field_15943.method_7050(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field_15943.method_7046(4.0F, 14.0F, 7.0F);
      this.field_15935 = new class_1549(this, 48, 21);
      this.field_15935.method_7050(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field_15935.method_7046(-4.0F, 14.0F, 7.0F);
      this.field_15941 = new class_1549(this, 48, 21);
      this.field_15941.field_8197 = true;
      this.field_15941.method_7050(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field_15941.method_7046(4.0F, 6.0F, -12.0F);
      this.field_15946 = new class_1549(this, 48, 21);
      this.field_15946.method_7050(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, var1, var1 + 5.5F, var1);
      this.field_15946.method_7046(-4.0F, 6.0F, -12.0F);
      this.field_15934 = new class_1549(this, 42, 36);
      this.field_15934.method_7049(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, var1);
      this.field_15934.method_7046(0.0F, -5.0F, 2.0F);
      this.field_15934.field_8191 = (float) (Math.PI / 6);
      this.field_15944.method_7043(this.field_15934);
      class_1549 var8 = new class_1549(this, 26, 0);
      var8.method_7049(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, 0.5F);
      this.field_15944.method_7043(var8);
      class_1549 var9 = new class_1549(this, 29, 5);
      var9.method_7049(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field_15938.method_7043(var9);
      class_1549 var10 = new class_1549(this, 29, 5);
      var10.method_7049(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, var1);
      this.field_15938.method_7043(var10);
      class_1549 var11 = new class_1549(this, 32, 2);
      var11.method_7049(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var11.field_8191 = (float) (-Math.PI / 6);
      this.field_15938.method_7043(var11);
      class_1549 var12 = new class_1549(this, 32, 2);
      var12.method_7049(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F, var1);
      var12.field_8191 = (float) (-Math.PI / 6);
      this.field_15938.method_7043(var12);
      class_1549 var13 = new class_1549(this, 1, 1);
      var13.method_7049(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, 0.2F);
      this.field_15938.method_7043(var13);
      class_1549 var14 = new class_1549(this, 19, 0);
      var14.method_7049(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.2F);
      this.field_15938.method_7043(var14);
      this.field_15937 = new class_1549[]{var8, var9, var10, var13, var14};
      this.field_15936 = new class_1549[]{var11, var12};
   }

   public void method_14691(class_1549 var1) {
      class_1549 var4 = new class_1549(this, 19, 16);
      var4.method_7049(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      class_1549 var5 = new class_1549(this, 19, 16);
      var5.method_7049(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, -0.001F);
      var1.method_7043(var4);
      var1.method_7043(var5);
   }

   public void method_14690(T var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var9 = var1.method_43357();
      boolean var10 = var1.method_37151();

      for (class_1549 var14 : this.field_15937) {
         var14.field_8200 = var9;
      }

      for (class_1549 var18 : this.field_15936) {
         var18.field_8200 = var10 && var9;
      }

      this.field_15944.field_8181 = 11.0F;
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_15938);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(
         this.field_15944,
         this.field_15945,
         this.field_15942,
         this.field_15940,
         this.field_15933,
         this.field_15943,
         this.field_15935,
         this.field_15941,
         this.field_15946
      );
   }

   public void method_14692(T var1, float var2, float var3, float var4) {
      super.method_29702(var1, var2, var3, var4);
      float var7 = MathHelper.method_42833(var1.field_29611, var1.field_29605, var4);
      float var8 = MathHelper.method_42833(var1.field_29657, var1.field_29618, var4);
      float var9 = MathHelper.method_42795(var4, var1.field_41762, var1.rotationPitch);
      float var10 = var8 - var7;
      float var11 = var9 * (float) (Math.PI / 180.0);
      if (var10 > 20.0F) {
         var10 = 20.0F;
      }

      if (var10 < -20.0F) {
         var10 = -20.0F;
      }

      if (var3 > 0.2F) {
         var11 += MathHelper.cos(var2 * 0.4F) * 0.15F * var3;
      }

      float var12 = var1.method_19045(var4);
      float var13 = var1.method_19040(var4);
      float var14 = 1.0F - var13;
      float var15 = var1.method_19073(var4);
      boolean var16 = var1.field_20009 != 0;
      float var17 = (float)var1.field_41697 + var4;
      this.field_15938.field_8181 = 4.0F;
      this.field_15938.field_8187 = -12.0F;
      this.field_15944.field_8191 = 0.0F;
      this.field_15938.field_8191 = (float) (Math.PI / 6) + var11;
      this.field_15938.field_8190 = var10 * (float) (Math.PI / 180.0);
      float var18 = !var1.method_37285() ? 1.0F : 0.2F;
      float var19 = MathHelper.cos(var18 * var2 * 0.6662F + (float) Math.PI);
      float var20 = var19 * 0.8F * var3;
      float var21 = (1.0F - Math.max(var13, var12)) * ((float) (Math.PI / 6) + var11 + var15 * MathHelper.sin(var17) * 0.05F);
      this.field_15938.field_8191 = var13 * ((float) (Math.PI / 12) + var11) + var12 * (2.1816616F + MathHelper.sin(var17) * 0.05F) + var21;
      this.field_15938.field_8190 = var13 * var10 * (float) (Math.PI / 180.0) + (1.0F - Math.max(var13, var12)) * this.field_15938.field_8190;
      this.field_15938.field_8181 = var13 * -4.0F + var12 * 11.0F + (1.0F - Math.max(var13, var12)) * this.field_15938.field_8181;
      this.field_15938.field_8187 = var13 * -4.0F + var12 * -12.0F + (1.0F - Math.max(var13, var12)) * this.field_15938.field_8187;
      this.field_15944.field_8191 = var13 * (float) (-Math.PI / 4) + var14 * this.field_15944.field_8191;
      float var22 = (float) (Math.PI / 12) * var13;
      float var23 = MathHelper.cos(var17 * 0.6F + (float) Math.PI);
      this.field_15940.field_8181 = 2.0F * var13 + 14.0F * var14;
      this.field_15940.field_8187 = -6.0F * var13 - 10.0F * var14;
      this.field_15933.field_8181 = this.field_15940.field_8181;
      this.field_15933.field_8187 = this.field_15940.field_8187;
      float var24 = ((float) (-Math.PI / 3) + var23) * var13 + var20 * var14;
      float var25 = ((float) (-Math.PI / 3) - var23) * var13 - var20 * var14;
      this.field_15945.field_8191 = var22 - var19 * 0.5F * var3 * var14;
      this.field_15942.field_8191 = var22 + var19 * 0.5F * var3 * var14;
      this.field_15940.field_8191 = var24;
      this.field_15933.field_8191 = var25;
      this.field_15934.field_8191 = (float) (Math.PI / 6) + var3 * 0.75F;
      this.field_15934.field_8181 = -5.0F + var3;
      this.field_15934.field_8187 = 2.0F + var3 * 2.0F;
      if (!var16) {
         this.field_15934.field_8190 = 0.0F;
      } else {
         this.field_15934.field_8190 = MathHelper.cos(var17 * 0.7F);
      }

      this.field_15943.field_8181 = this.field_15945.field_8181;
      this.field_15943.field_8187 = this.field_15945.field_8187;
      this.field_15943.field_8191 = this.field_15945.field_8191;
      this.field_15935.field_8181 = this.field_15942.field_8181;
      this.field_15935.field_8187 = this.field_15942.field_8187;
      this.field_15935.field_8191 = this.field_15942.field_8191;
      this.field_15941.field_8181 = this.field_15940.field_8181;
      this.field_15941.field_8187 = this.field_15940.field_8187;
      this.field_15941.field_8191 = this.field_15940.field_8191;
      this.field_15946.field_8181 = this.field_15933.field_8181;
      this.field_15946.field_8187 = this.field_15933.field_8187;
      this.field_15946.field_8191 = this.field_15933.field_8191;
      boolean var26 = var1.method_26449();
      this.field_15945.field_8200 = !var26;
      this.field_15942.field_8200 = !var26;
      this.field_15940.field_8200 = !var26;
      this.field_15933.field_8200 = !var26;
      this.field_15943.field_8200 = var26;
      this.field_15935.field_8200 = var26;
      this.field_15941.field_8200 = var26;
      this.field_15946.field_8200 = var26;
      this.field_15944.field_8181 = !var26 ? 0.0F : 10.8F;
   }
}
