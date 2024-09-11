package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;

public class Class254<T extends Class1037> extends Class219<T, Class2793<T>> {
   private static final ResourceLocation field910 = new ResourceLocation("textures/entity/zombie/drowned_outer_layer.png");
   private final Class2793<T> field911 = new Class2793<T>(0.25F, 0.0F, 64, 64);

   public Class254(Class5714<T, Class2793<T>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      method823(this.method825(), this.field911, field910, var1, var2, var3, (T)var4, var5, var6, var8, var9, var10, var7, 1.0F, 1.0F, 1.0F);
   }
}
