package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

public class Class221 extends Class219<WolfEntity, Class2859<WolfEntity>> {
   private static final ResourceLocation field866 = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

   public Class221(Class5714<WolfEntity, Class2859<WolfEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, WolfEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method4393() && !var4.isInvisible()) {
         float[] var13 = var4.method4382().method311();
         if (Config.method26911()) {
            var13 = Class9680.method37883(var4.method4382(), var13);
         }

         method824(this.method825(), field866, var1, var2, var3, var4, var13[0], var13[1], var13[2]);
      }
   }
}
