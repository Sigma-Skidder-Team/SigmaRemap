package remapped;

import java.util.Random;

public class class_3867 extends class_7067<class_2770> {
   public static final Identifier field_18844 = new Identifier("textures/entity/end_crystal/end_crystal_beam.png");
   private static final Identifier field_18838 = new Identifier("textures/entity/enderdragon/dragon_exploding.png");
   private static final Identifier field_18841 = new Identifier("textures/entity/enderdragon/dragon.png");
   private static final Identifier field_18837 = new Identifier("textures/entity/enderdragon/dragon_eyes.png");
   private static final class_3581 field_18842 = class_3581.method_16755(field_18841);
   private static final class_3581 field_18836 = class_3581.method_16727(field_18841);
   private static final class_3581 field_18843 = class_3581.method_16769(field_18837);
   private static final class_3581 field_18840 = class_3581.method_16730(field_18844);
   private static final float field_18845 = (float)(Math.sqrt(3.0) / 2.0);
   private final class_170 field_18839 = new class_170();

   public class_3867(class_6122 var1) {
      super(var1);
      this.field_36492 = 0.5F;
   }

   public void method_17919(class_2770 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      float var9 = (float)var1.method_12613(7, var3)[0];
      float var10 = (float)(var1.method_12613(5, var3)[1] - var1.method_12613(10, var3)[1]);
      var4.method_36060(class_2426.field_12074.method_11074(-var9));
      var4.method_36060(class_2426.field_12080.method_11074(var10 * 10.0F));
      var4.method_36065(0.0, 0.0, 1.0);
      var4.method_36062(-1.0F, -1.0F, 1.0F);
      var4.method_36065(0.0, -1.501F, 0.0);
      boolean var11 = var1.field_29645 > 0;
      this.field_18839.method_706(var1, 0.0F, 0.0F, var3);
      if (var1.field_13537 <= 0) {
         class_7907 var12 = var5.method_11645(field_18842);
         this.field_18839.method_45499(var4, var12, var6, class_5367.method_24486(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         float var22 = (float)var1.field_13537 / 200.0F;
         class_7907 var13 = var5.method_11645(class_3581.method_16703(field_18838, var22));
         this.field_18839.method_45499(var4, var13, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
         class_7907 var14 = var5.method_11645(field_18836);
         this.field_18839.method_45499(var4, var14, var6, class_5367.method_24486(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      class_7907 var23 = var5.method_11645(field_18843);
      if (class_3111.method_14424()) {
         class_6588.method_30278();
      }

      class_3111.method_14387().field_20923 = true;
      this.field_18839.method_45499(var4, var23, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      class_3111.method_14387().field_20923 = false;
      if (class_3111.method_14424()) {
         class_6588.method_30249();
      }

      if (var1.field_13537 > 0) {
         float var24 = ((float)var1.field_13537 + var3) / 200.0F;
         float var26 = Math.min(!(var24 > 0.8F) ? 0.0F : (var24 - 0.8F) / 0.2F, 1.0F);
         Random var15 = new Random(432L);
         class_7907 var16 = var5.method_11645(class_3581.method_16714());
         var4.method_36063();
         var4.method_36065(0.0, -1.0, -2.0);

         for (int var17 = 0; (float)var17 < (var24 + var24 * var24) / 2.0F * 60.0F; var17++) {
            var4.method_36060(class_2426.field_12080.method_11074(var15.nextFloat() * 360.0F));
            var4.method_36060(class_2426.field_12074.method_11074(var15.nextFloat() * 360.0F));
            var4.method_36060(class_2426.field_12076.method_11074(var15.nextFloat() * 360.0F));
            var4.method_36060(class_2426.field_12080.method_11074(var15.nextFloat() * 360.0F));
            var4.method_36060(class_2426.field_12074.method_11074(var15.nextFloat() * 360.0F));
            var4.method_36060(class_2426.field_12076.method_11074(var15.nextFloat() * 360.0F + var24 * 90.0F));
            float var18 = var15.nextFloat() * 20.0F + 5.0F + var26 * 10.0F;
            float var19 = var15.nextFloat() * 2.0F + 1.0F + var26 * 2.0F;
            class_8107 var20 = var4.method_36058().method_28620();
            int var21 = (int)(255.0F * (1.0F - var26));
            method_17916(var16, var20, var21);
            method_17921(var16, var20, var18, var19);
            method_17920(var16, var20, var18, var19);
            method_17916(var16, var20, var21);
            method_17920(var16, var20, var18, var19);
            method_17917(var16, var20, var18, var19);
            method_17916(var16, var20, var21);
            method_17917(var16, var20, var18, var19);
            method_17921(var16, var20, var18, var19);
         }

         var4.method_36064();
      }

      var4.method_36064();
      if (var1.field_13548 != null) {
         var4.method_36063();
         float var25 = (float)(var1.field_13548.method_37302() - class_9299.method_42794((double)var3, var1.field_41767, var1.method_37302()));
         float var27 = (float)(var1.field_13548.method_37309() - class_9299.method_42794((double)var3, var1.field_41698, var1.method_37309()));
         float var28 = (float)(var1.field_13548.method_37156() - class_9299.method_42794((double)var3, var1.field_41725, var1.method_37156()));
         method_17915(var25, var27 + class_8205.method_37574(var1.field_13548, var3), var28, var3, var1.field_41697, var4, var5, var6);
         var4.method_36064();
      }

      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   private static void method_17916(class_7907 var0, class_8107 var1, int var2) {
      var0.method_35762(var1, 0.0F, 0.0F, 0.0F).method_35743(255, 255, 255, var2).method_35735();
      var0.method_35762(var1, 0.0F, 0.0F, 0.0F).method_35743(255, 255, 255, var2).method_35735();
   }

   private static void method_17921(class_7907 var0, class_8107 var1, float var2, float var3) {
      var0.method_35762(var1, -field_18845 * var3, var2, -0.5F * var3).method_35743(255, 0, 255, 0).method_35735();
   }

   private static void method_17920(class_7907 var0, class_8107 var1, float var2, float var3) {
      var0.method_35762(var1, field_18845 * var3, var2, -0.5F * var3).method_35743(255, 0, 255, 0).method_35735();
   }

   private static void method_17917(class_7907 var0, class_8107 var1, float var2, float var3) {
      var0.method_35762(var1, 0.0F, var2, 1.0F * var3).method_35743(255, 0, 255, 0).method_35735();
   }

   public static void method_17915(float var0, float var1, float var2, float var3, int var4, class_7966 var5, class_2565 var6, int var7) {
      float var10 = class_9299.method_42843(var0 * var0 + var2 * var2);
      float var11 = class_9299.method_42843(var0 * var0 + var1 * var1 + var2 * var2);
      var5.method_36063();
      var5.method_36065(0.0, 2.0, 0.0);
      var5.method_36060(class_2426.field_12074.method_11062((float)(-Math.atan2((double)var2, (double)var0)) - (float) (Math.PI / 2)));
      var5.method_36060(class_2426.field_12080.method_11062((float)(-Math.atan2((double)var10, (double)var1)) - (float) (Math.PI / 2)));
      class_7907 var12 = var6.method_11645(field_18840);
      float var13 = 0.0F - ((float)var4 + var3) * 0.01F;
      float var14 = class_9299.method_42843(var0 * var0 + var1 * var1 + var2 * var2) / 32.0F - ((float)var4 + var3) * 0.01F;
      byte var15 = 8;
      float var16 = 0.0F;
      float var17 = 0.75F;
      float var18 = 0.0F;
      class_6279 var19 = var5.method_36058();
      class_8107 var20 = var19.method_28620();
      class_6555 var21 = var19.method_28618();

      for (int var22 = 1; var22 <= 8; var22++) {
         float var23 = class_9299.method_42818((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var24 = class_9299.method_42840((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var25 = (float)var22 / 8.0F;
         var12.method_35762(var20, var16 * 0.2F, var17 * 0.2F, 0.0F)
            .method_35743(0, 0, 0, 255)
            .method_35745(var18, var13)
            .method_35737(class_5367.field_27381)
            .method_35747(var7)
            .method_35756(var21, 0.0F, -1.0F, 0.0F)
            .method_35735();
         var12.method_35762(var20, var16, var17, var11)
            .method_35743(255, 255, 255, 255)
            .method_35745(var18, var14)
            .method_35737(class_5367.field_27381)
            .method_35747(var7)
            .method_35756(var21, 0.0F, -1.0F, 0.0F)
            .method_35735();
         var12.method_35762(var20, var23, var24, var11)
            .method_35743(255, 255, 255, 255)
            .method_35745(var25, var14)
            .method_35737(class_5367.field_27381)
            .method_35747(var7)
            .method_35756(var21, 0.0F, -1.0F, 0.0F)
            .method_35735();
         var12.method_35762(var20, var23 * 0.2F, var24 * 0.2F, 0.0F)
            .method_35743(0, 0, 0, 255)
            .method_35745(var25, var13)
            .method_35737(class_5367.field_27381)
            .method_35747(var7)
            .method_35756(var21, 0.0F, -1.0F, 0.0F)
            .method_35735();
         var16 = var23;
         var17 = var24;
         var18 = var25;
      }

      var5.method_36064();
   }

   public Identifier method_17918(class_2770 var1) {
      return field_18841;
   }
}
