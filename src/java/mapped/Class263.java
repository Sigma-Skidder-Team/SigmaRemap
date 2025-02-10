package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class263 extends LayerRenderer<CatEntity, Class2861<CatEntity>> {
   private static final ResourceLocation field928 = new ResourceLocation("textures/entity/cat/cat_collar.png");
   private final Class2861<CatEntity> field929 = new Class2861<CatEntity>(0.01F);

   public Class263(Class5714<CatEntity, Class2861<CatEntity>> var1) {
      super(var1);
   }

   public void render(MatrixStack var1, IRenderTypeBuffer var2, int var3, CatEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method4393()) {
         float[] var13 = var4.method5256().method311();
         method823(this.method825(), this.field929, field928, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var13[0], var13[1], var13[2]);
      }
   }
}
