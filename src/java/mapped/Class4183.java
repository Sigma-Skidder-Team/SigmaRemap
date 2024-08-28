package mapped;

import java.util.Random;

public class Class4183 extends Class4180 {
   private final Class110 field20460;
   private final float field20461;
   private final ResourceLocation field20462;
   private final Class80 field20463;
   private final boolean field20464;

   public Class4183(Class8761 var1, ResourceLocation var2, BlockPos var3, Class80 var4, float var5, Class110 var6, boolean var7) {
      super(Class7792.field33458, 0);
      this.field20462 = var2;
      this.field20455 = var3;
      this.field20463 = var4;
      this.field20461 = var5;
      this.field20460 = var6;
      this.field20464 = var7;
      this.method12947(var1);
   }

   public Class4183(Class8761 var1, Class39 var2) {
      super(Class7792.field33458, var2);
      this.field20462 = new ResourceLocation(var2.method126("Template"));
      this.field20463 = Class80.valueOf(var2.method126("Rot"));
      this.field20461 = var2.method124("Integrity");
      this.field20460 = Class110.valueOf(var2.method126("BiomeType"));
      this.field20464 = var2.method132("IsLarge");
      this.method12947(var1);
   }

   private void method12947(Class8761 var1) {
      Class8969 var4 = var1.method31603(this.field20462);
      Class9463 var5 = new Class9463().method36426(this.field20463).method36425(Class2089.field13614).method36434(Class7095.field30528);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(Class39 var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20462.toString());
      var1.method109("Rot", this.field20463.name());
      var1.method107("Integrity", this.field20461);
      var1.method109("BiomeType", this.field20460.toString());
      var1.method115("IsLarge", this.field20464);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (!"chest".equals(var1)) {
         if ("drowned".equals(var1)) {
            Class1037 var8 = Class8992.field41021.method33215(var3.method6970());
            var8.method4278();
            var8.method3272(var2, 0.0F, 0.0F);
            var8.method4276(var3, var3.method6807(var2), Class2202.field14394, (Class5093)null, (Class39)null);
            var3.method6995(var8);
            if (var2.getY() <= var3.method6776()) {
               var3.method6725(var2, Blocks.WATER.method11579(), 2);
            } else {
               var3.method6725(var2, Blocks.AIR.method11579(), 2);
            }
         }
      } else {
         var3.method6725(
            var2,
            Blocks.CHEST.method11579().method23465(Class3348.field18867, Boolean.valueOf(var3.method6739(var2).method23486(Class8953.field40469))),
            2
         );
         Class944 var9 = var3.method6759(var2);
         if (var9 instanceof Class941) {
            ((Class941)var9).method3744(!this.field20464 ? Class8793.field39563 : Class8793.field39564, var4.nextLong());
         }
      }
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.field20454.method36433().method36434(new Class7094(this.field20461)).method36434(Class7095.field30528);
      int var10 = var1.method6736(Class101.field297, this.field20455.method8304(), this.field20455.method8306());
      this.field20455 = new BlockPos(this.field20455.method8304(), var10, this.field20455.method8306());
      BlockPos var11 = Class8969.method32905(
            new BlockPos(this.field20453.method32886().method8304() - 1, 0, this.field20453.method32886().method8306() - 1),
            Class2089.field13614,
            this.field20463,
            BlockPos.field13032
         )
         .method8337(this.field20455);
      this.field20455 = new BlockPos(this.field20455.method8304(), this.method12948(this.field20455, var1, var11), this.field20455.method8306());
      return super.method12896(var1, var2, var3, var4, var5, var6, var7);
   }

   private int method12948(BlockPos var1, Class1665 var2, BlockPos var3) {
      int var6 = var1.getY();
      int var7 = 512;
      int var8 = var6 - 1;
      int var9 = 0;

      for (BlockPos var11 : BlockPos.method8359(var1, var3)) {
         int var12 = var11.method8304();
         int var13 = var11.method8306();
         int var14 = var1.getY() - 1;
         Mutable var15 = new Mutable(var12, var14, var13);
         Class7380 var16 = var2.method6738(var15);

         for (Class7379 var17 = var2.method6739(var15);
            (var16.method23393() || var17.method23486(Class8953.field40469) || var16.method23383().method11540(Class7645.field32779)) && var14 > 1;
            var17 = var2.method6739(var15)
         ) {
            var15.method8372(var12, --var14, var13);
            var16 = var2.method6738(var15);
         }

         var7 = Math.min(var7, var14);
         if (var14 < var8 - 2) {
            var9++;
         }
      }

      int var18 = Math.abs(var1.method8304() - var3.method8304());
      if (var8 - var7 > 2 && var9 > var18 - 2) {
         var6 = var7 + 1;
      }

      return var6;
   }
}
