package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class AgeableModel<E extends Entity> extends Class2827<E> {
   private final boolean field17685;
   private final float field17686;
   private final float field17687;
   private final float field17688;
   private final float field17689;
   private final float field17690;

   public AgeableModel(boolean var1, float var2, float var3) {
      this(var1, var2, var3, 2.0F, 2.0F, 24.0F);
   }

   public AgeableModel(boolean var1, float var2, float var3, float var4, float var5, float var6) {
      this(RenderType::getEntityCutoutNoCull, var1, var2, var3, var4, var5, var6);
   }

   public AgeableModel(Function<ResourceLocation, RenderType> var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      super(var1);
      this.field17685 = var2;
      this.field17686 = var3;
      this.field17687 = var4;
      this.field17688 = var5;
      this.field17689 = var6;
      this.field17690 = var7;
   }

   public AgeableModel() {
      this(false, 5.0F, 2.0F);
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.field17602) {
         this.getHeadParts().forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
         this.getBodyParts().forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
      } else {
         var1.push();
         if (this.field17685) {
            float var11 = 1.5F / this.field17688;
            var1.method35292(var11, var11, var11);
         }

         var1.translate(0.0, (double)(this.field17686 / 16.0F), (double)(this.field17687 / 16.0F));
         this.getHeadParts().forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
         var1.push();
         float var12 = 1.0F / this.field17689;
         var1.method35292(var12, var12, var12);
         var1.translate(0.0, (double)(this.field17690 / 16.0F), 0.0);
         this.getBodyParts().forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.pop();
      }
   }

   public abstract Iterable<ModelRenderer> getHeadParts();

   public abstract Iterable<ModelRenderer> getBodyParts();
}
