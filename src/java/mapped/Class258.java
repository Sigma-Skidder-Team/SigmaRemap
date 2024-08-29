package mapped;

public class Class258 extends Class219<Class1074, Class2856<Class1074>> {
   private static String[] field917;
   private final Class2856<Class1074> field918 = new Class2856<Class1074>(0.1F);

   public Class258(Class5714<Class1074, Class2856<Class1074>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1074 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      ItemStack var13 = var4.method4990();
      if (var13.getItem() instanceof Class3275) {
         Class3275 var14 = (Class3275)var13.getItem();
         this.method825().method11027(this.field918);
         this.field918.method10997(var4, var5, var6, var7);
         this.field918.method10998(var4, var5, var6, var8, var9, var10);
         float var15;
         float var16;
         float var17;
         if (!(var14 instanceof Class3276)) {
            var15 = 1.0F;
            var16 = 1.0F;
            var17 = 1.0F;
         } else {
            int var18 = ((Class3276)var14).method11800(var13);
            var15 = (float)(var18 >> 16 & 0xFF) / 255.0F;
            var16 = (float)(var18 >> 8 & 0xFF) / 255.0F;
            var17 = (float)(var18 & 0xFF) / 255.0F;
         }

         Class5422 var19 = var2.method25597(RenderType.getEntityCutoutNoCull(var14.method11797()));
         this.field918.method11016(var1, var19, var3, Class213.field798, var15, var16, var17, 1.0F);
      }
   }
}
