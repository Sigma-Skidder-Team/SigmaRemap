package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class Class2803<E extends Entity> extends Class2827<E> {
   public Class2803() {
      this(RenderType::getEntityCutoutNoCull);
   }

   public Class2803(Function<ResourceLocation, RenderType> var1) {
      super(var1);
   }

   @Override
   public void render(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method11015().forEach(var8x -> var8x.render(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public abstract Iterable<ModelRenderer> method11015();
}
