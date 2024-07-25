package remapped;

import java.awt.Color;

public class class_628 extends class_1859 {
   public int field_3549;
   public boolean field_3551;
   public class_2377 field_3553;
   public class_3707 field_3548;
   public class_7557 field_3550;

   public class_628(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_3549 = var7;
      Color var11 = new Color(var7);
      float[] var12 = Color.RGBtoHSB(var11.getRed(), var11.getGreen(), var11.getBlue(), null);
      this.method_32148(this.field_3553 = new class_2377(this, "block", 10, 10, var5 - 20, var6 - 50, var12[0], var12[1], var12[2]));
      this.method_32148(this.field_3548 = new class_3707(this, "slider", 14, var6 - 25, var5 - 65, 8, var12[0]));
      this.method_32148(this.field_3550 = new class_7557(this, "bubble", var5 - 40, var6 - 32, 25, 25, var11.getRGB()));
      this.field_3553.method_8236(var1x -> this.method_2921());
      this.field_3548.method_8236(var1x -> this.method_2921());
      this.field_3550.method_32100((var1x, var2x) -> this.method_2923(!this.method_2918()));
      this.field_3551 = var8;
   }

   public void method_2923(boolean var1) {
      this.method_2924(var1);
      this.method_8235();
   }

   public void method_2924(boolean var1) {
      this.field_3551 = var1;
   }

   public boolean method_2918() {
      return this.field_3551;
   }

   public void method_2919(int var1) {
      if (var1 != this.field_3549) {
         Color var4 = new Color(var1);
         float[] var5 = Color.RGBtoHSB(var4.getRed(), var4.getGreen(), var4.getBlue(), null);
         this.field_3553.method_10868(var5[0]);
         this.field_3553.method_10866(var5[1], false);
         this.field_3553.method_10862(var5[2], false);
         this.field_3548.method_17210(var5[0], false);
         this.field_3550.field_38519 = var1;
      }
   }

   public int method_2922() {
      return this.field_3549;
   }

   private void method_2921() {
      this.method_2925();
      this.method_8235();
   }

   private void method_2925() {
      float var3 = this.field_3548.method_17208();
      this.field_3553.method_10868(var3);
      this.field_3549 = this.field_3553.method_10863();
      this.field_3550.field_38519 = this.field_3549;
   }

   public static void method_2920(int var0, int var1, int var2, float var3) {
      byte var6 = 14;
      class_73.method_121((float)var0, (float)var1, (float)var6, class_314.method_1444(class_1255.field_6929.field_6917, 0.1F * var3));
      class_73.method_121((float)var0, (float)var1, (float)(var6 - 1), class_314.method_1444(class_1255.field_6929.field_6917, 0.14F * var3));
      class_73.method_121((float)var0, (float)var1, (float)(var6 - 2), class_314.method_1444(class_1255.field_6918.field_6917, var3));
      class_73.method_121(
         (float)var0, (float)var1, (float)(var6 - 6), class_314.method_1444(class_314.method_1442(var2, class_1255.field_6929.field_6917, 0.7F), var3)
      );
      class_73.method_121((float)var0, (float)var1, (float)(var6 - 7), class_314.method_1444(var2, var3));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_3551) {
         this.field_3548.method_17210((float)(System.currentTimeMillis() % 4000L) / 4000.0F, false);
         this.method_2925();
      }

      super.method_32178(var1);
   }
}
