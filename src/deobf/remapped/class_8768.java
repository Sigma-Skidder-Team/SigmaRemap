package remapped;

public class class_8768 extends class_7067<class_5490> {
   private static String[] field_44889;

   public class_8768(class_6122 var1) {
      super(var1);
   }

   public void method_40289(class_5490 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36060(class_2426.field_12074.method_11074(180.0F - var2));
      class_6933 var9 = var1.field_27978;
      float var10 = 0.0625F;
      var4.method_36062(0.0625F, 0.0625F, 0.0625F);
      class_7907 var11 = var5.method_11645(class_3581.method_16734(this.method_40288(var1)));
      class_4642 var12 = class_1893.method_8510().method_8581();
      this.method_40287(var4, var11, var1, var9.method_31700(), var9.method_31699(), var12.method_21477(var9), var12.method_21478());
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public class_4639 method_40288(class_5490 var1) {
      return class_1893.method_8510().method_8581().method_21478().method_23608().method_38519();
   }

   private void method_40287(class_7966 var1, class_7907 var2, class_5490 var3, int var4, int var5, class_5155 var6, class_5155 var7) {
      class_6279 var10 = var1.method_36058();
      class_8107 var11 = var10.method_28620();
      class_6555 var12 = var10.method_28618();
      float var13 = (float)(-var4) / 2.0F;
      float var14 = (float)(-var5) / 2.0F;
      float var15 = 0.5F;
      float var16 = var7.method_23630();
      float var17 = var7.method_23619();
      float var18 = var7.method_23642();
      float var19 = var7.method_23640();
      float var20 = var7.method_23630();
      float var21 = var7.method_23619();
      float var22 = var7.method_23642();
      float var23 = var7.method_23639(1.0);
      float var24 = var7.method_23630();
      float var25 = var7.method_23602(1.0);
      float var26 = var7.method_23642();
      float var27 = var7.method_23640();
      int var28 = var4 / 16;
      int var29 = var5 / 16;
      double var30 = 16.0 / (double)var28;
      double var32 = 16.0 / (double)var29;

      for (int var34 = 0; var34 < var28; var34++) {
         for (int var35 = 0; var35 < var29; var35++) {
            float var36 = var13 + (float)((var34 + 1) * 16);
            float var37 = var13 + (float)(var34 * 16);
            float var38 = var14 + (float)((var35 + 1) * 16);
            float var39 = var14 + (float)(var35 * 16);
            int var40 = class_9299.method_42847(var3.method_37302());
            int var41 = class_9299.method_42847(var3.method_37309() + (double)((var38 + var39) / 2.0F / 16.0F));
            int var42 = class_9299.method_42847(var3.method_37156());
            class_240 var43 = var3.method_37365();
            if (var43 == class_240.field_818) {
               var40 = class_9299.method_42847(var3.method_37302() + (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == class_240.field_809) {
               var42 = class_9299.method_42847(var3.method_37156() - (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == class_240.field_800) {
               var40 = class_9299.method_42847(var3.method_37302() - (double)((var36 + var37) / 2.0F / 16.0F));
            }

            if (var43 == class_240.field_804) {
               var42 = class_9299.method_42847(var3.method_37156() + (double)((var36 + var37) / 2.0F / 16.0F));
            }

            int var44 = class_4316.method_20002(var3.field_41768, new class_1331(var40, var41, var42));
            float var45 = var6.method_23602(var30 * (double)(var28 - var34));
            float var46 = var6.method_23602(var30 * (double)(var28 - (var34 + 1)));
            float var47 = var6.method_23639(var32 * (double)(var29 - var35));
            float var48 = var6.method_23639(var32 * (double)(var29 - (var35 + 1)));
            this.method_40290(var11, var12, var2, var36, var39, var46, var47, -0.5F, 0, 0, -1, var44);
            this.method_40290(var11, var12, var2, var37, var39, var45, var47, -0.5F, 0, 0, -1, var44);
            this.method_40290(var11, var12, var2, var37, var38, var45, var48, -0.5F, 0, 0, -1, var44);
            this.method_40290(var11, var12, var2, var36, var38, var46, var48, -0.5F, 0, 0, -1, var44);
            this.method_40290(var11, var12, var2, var36, var38, var16, var18, 0.5F, 0, 0, 1, var44);
            this.method_40290(var11, var12, var2, var37, var38, var17, var18, 0.5F, 0, 0, 1, var44);
            this.method_40290(var11, var12, var2, var37, var39, var17, var19, 0.5F, 0, 0, 1, var44);
            this.method_40290(var11, var12, var2, var36, var39, var16, var19, 0.5F, 0, 0, 1, var44);
            this.method_40290(var11, var12, var2, var36, var38, var20, var22, -0.5F, 0, 1, 0, var44);
            this.method_40290(var11, var12, var2, var37, var38, var21, var22, -0.5F, 0, 1, 0, var44);
            this.method_40290(var11, var12, var2, var37, var38, var21, var23, 0.5F, 0, 1, 0, var44);
            this.method_40290(var11, var12, var2, var36, var38, var20, var23, 0.5F, 0, 1, 0, var44);
            this.method_40290(var11, var12, var2, var36, var39, var20, var22, 0.5F, 0, -1, 0, var44);
            this.method_40290(var11, var12, var2, var37, var39, var21, var22, 0.5F, 0, -1, 0, var44);
            this.method_40290(var11, var12, var2, var37, var39, var21, var23, -0.5F, 0, -1, 0, var44);
            this.method_40290(var11, var12, var2, var36, var39, var20, var23, -0.5F, 0, -1, 0, var44);
            this.method_40290(var11, var12, var2, var36, var38, var25, var26, 0.5F, -1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var36, var39, var25, var27, 0.5F, -1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var36, var39, var24, var27, -0.5F, -1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var36, var38, var24, var26, -0.5F, -1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var37, var38, var25, var26, -0.5F, 1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var37, var39, var25, var27, -0.5F, 1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var37, var39, var24, var27, 0.5F, 1, 0, 0, var44);
            this.method_40290(var11, var12, var2, var37, var38, var24, var26, 0.5F, 1, 0, 0, var44);
         }
      }
   }

   private void method_40290(
      class_8107 var1, class_6555 var2, class_7907 var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.method_35762(var1, var4, var5, var8)
         .method_35743(255, 255, 255, 255)
         .method_35745(var6, var7)
         .method_35737(class_5367.field_27381)
         .method_35747(var12)
         .method_35756(var2, (float)var9, (float)var10, (float)var11)
         .method_35735();
   }
}
