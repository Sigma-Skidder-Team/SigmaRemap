package mapped;

public class Class260 extends Class219<Class1021, Class2878<Class1021>> {
   private static String[] field920;

   public Class260(Class5714<Class1021, Class2878<Class1021>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1021 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method3342() && var4.method4531()) {
         var1.method35294();
         this.method825().method11197().method22682(var1);
         float var13 = 0.625F;
         var1.method35291(0.0, -0.34375, 0.0);
         var1.method35293(Class7680.field32900.method25286(180.0F));
         var1.method35292(0.625F, -0.625F, -0.625F);
         ItemStack var14 = new ItemStack(Blocks.field36589);
         Minecraft.getInstance()
            .method1555()
            .method790(var4, var14, Class2327.field15929, false, var1, var2, var4.field5024, var3, Class5712.method17883(var4, 0.0F));
         var1.method35295();
      }
   }
}