package mapped;

public class Class8978 {
   private static String[] field40576;
   private final Class4520 field40577;
   private final Class4520 field40578;
   private final float field40579;
   private final float field40580;
   private final float field40581;
   private final float field40582;
   private final float field40583;
   private final float field40584;
   private final float field40585;
   private final float field40586;
   public static final Class9367 field40587 = Class7317.method23178();

   public Class8978(Class4520 var1, Class4520 var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.field40577 = var1;
      this.field40578 = var2;
      this.field40579 = var3;
      this.field40580 = var4;
      this.field40581 = var5;
      this.field40582 = var6;
      this.field40583 = var7;
      this.field40584 = var8;
      this.field40585 = var9;
      this.field40586 = var10;
   }

   public void method32940(boolean var1, float var2, float var3, Class9367 var4, Class5422 var5, float var6, float var7, float var8, float var9, int var10) {
      float var14 = var2 + this.field40583;
      float var15 = var2 + this.field40584;
      float var16 = this.field40585 - 3.0F;
      float var17 = this.field40586 - 3.0F;
      float var18 = var3 + var16;
      float var19 = var3 + var17;
      float var20 = !var1 ? 0.0F : 1.0F - 0.25F * var16;
      float var21 = !var1 ? 0.0F : 1.0F - 0.25F * var17;
      if (var5 instanceof Class5425 && var4 == field40587) {
         Class5425 var22 = (Class5425)var5;
         int var23 = (int)(var6 * 255.0F);
         int var24 = (int)(var7 * 255.0F);
         int var25 = (int)(var8 * 255.0F);
         int var26 = (int)(var9 * 255.0F);
         int var27 = var10 & 65535;
         int var28 = var10 >> 16 & 65535;
         var22.method17087(var14 + var20, var18, 0.0F, var23, var24, var25, var26, this.field40579, this.field40581, var27, var28);
         var22.method17087(var14 + var21, var19, 0.0F, var23, var24, var25, var26, this.field40579, this.field40582, var27, var28);
         var22.method17087(var15 + var21, var19, 0.0F, var23, var24, var25, var26, this.field40580, this.field40582, var27, var28);
         var22.method17087(var15 + var20, var18, 0.0F, var23, var24, var25, var26, this.field40580, this.field40581, var27, var28);
      } else {
         var5.method17040(var4, var14 + var20, var18, 0.0F)
            .method17033(var6, var7, var8, var9)
            .method17027(this.field40579, this.field40581)
            .method17034(var10)
            .method17031();
         var5.method17040(var4, var14 + var21, var19, 0.0F)
            .method17033(var6, var7, var8, var9)
            .method17027(this.field40579, this.field40582)
            .method17034(var10)
            .method17031();
         var5.method17040(var4, var15 + var21, var19, 0.0F)
            .method17033(var6, var7, var8, var9)
            .method17027(this.field40580, this.field40582)
            .method17034(var10)
            .method17031();
         var5.method17040(var4, var15 + var20, var18, 0.0F)
            .method17033(var6, var7, var8, var9)
            .method17027(this.field40580, this.field40581)
            .method17034(var10)
            .method17031();
      }
   }

   public void method32941(Class8442 var1, Class9367 var2, Class5422 var3, int var4) {
      var3.method17040(var2, var1.field36164, var1.field36165, var1.field36168)
         .method17033(var1.field36169, var1.field36170, var1.field36171, var1.field36172)
         .method17027(this.field40579, this.field40581)
         .method17034(var4)
         .method17031();
      var3.method17040(var2, var1.field36166, var1.field36165, var1.field36168)
         .method17033(var1.field36169, var1.field36170, var1.field36171, var1.field36172)
         .method17027(this.field40579, this.field40582)
         .method17034(var4)
         .method17031();
      var3.method17040(var2, var1.field36166, var1.field36167, var1.field36168)
         .method17033(var1.field36169, var1.field36170, var1.field36171, var1.field36172)
         .method17027(this.field40580, this.field40582)
         .method17034(var4)
         .method17031();
      var3.method17040(var2, var1.field36164, var1.field36167, var1.field36168)
         .method17033(var1.field36169, var1.field36170, var1.field36171, var1.field36172)
         .method17027(this.field40580, this.field40581)
         .method17034(var4)
         .method17031();
   }

   public Class4520 method32942(boolean var1) {
      return !var1 ? this.field40577 : this.field40578;
   }
}
