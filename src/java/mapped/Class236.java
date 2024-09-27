package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class236 extends Class219<Class1064, Class2854<Class1064>> {
   private static final ResourceLocation[] field884 = new ResourceLocation[]{
      new ResourceLocation("textures/entity/llama/decor/white.png"),
      new ResourceLocation("textures/entity/llama/decor/orange.png"),
      new ResourceLocation("textures/entity/llama/decor/magenta.png"),
      new ResourceLocation("textures/entity/llama/decor/light_blue.png"),
      new ResourceLocation("textures/entity/llama/decor/yellow.png"),
      new ResourceLocation("textures/entity/llama/decor/lime.png"),
      new ResourceLocation("textures/entity/llama/decor/pink.png"),
      new ResourceLocation("textures/entity/llama/decor/gray.png"),
      new ResourceLocation("textures/entity/llama/decor/light_gray.png"),
      new ResourceLocation("textures/entity/llama/decor/cyan.png"),
      new ResourceLocation("textures/entity/llama/decor/purple.png"),
      new ResourceLocation("textures/entity/llama/decor/blue.png"),
      new ResourceLocation("textures/entity/llama/decor/brown.png"),
      new ResourceLocation("textures/entity/llama/decor/green.png"),
      new ResourceLocation("textures/entity/llama/decor/red.png"),
      new ResourceLocation("textures/entity/llama/decor/black.png")
   };
   private static final ResourceLocation field885 = new ResourceLocation("textures/entity/llama/decor/trader_llama.png");
   private final Class2854<Class1064> field886 = new Class2854<Class1064>(0.5F);

   public Class236(Class5714<Class1064, Class2854<Class1064>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, Class1064 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Class112 var13 = var4.method4906();
      ResourceLocation var14;
      if (var13 == null) {
         if (!var4.method4884()) {
            return;
         }

         var14 = field885;
      } else {
         var14 = field884[var13.method309()];
      }

      this.method825().method11027(this.field886);
      this.field886.setRotationAngles(var4, var5, var6, var8, var9, var10);
      IVertexBuilder var15 = var2.method25597(RenderType.getEntityCutoutNoCull(var14));
      this.field886.method11016(var1, var15, var3, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
