package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class2817<T extends Entity> extends Class2803<T> {
   private static String[] field17551;
   private final ModelRenderer[] field17552 = new ModelRenderer[9];
   private final ImmutableList<ModelRenderer> field17553;

   public Class2817() {
      Builder var3 = ImmutableList.builder();
      ModelRenderer var4 = new ModelRenderer(this, 0, 0);
      var4.method22673(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      var4.rotationPointY = 17.6F;
      var3.add(var4);
      Random var5 = new Random(1660L);

      for (int var6 = 0; var6 < this.field17552.length; var6++) {
         this.field17552[var6] = new ModelRenderer(this, 0, 0);
         float var7 = (((float)(var6 % 3) - (float)(var6 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var8 = ((float)(var6 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var9 = var5.nextInt(7) + 8;
         this.field17552[var6].method22673(-1.0F, 0.0F, -1.0F, 2.0F, (float)var9, 2.0F);
         this.field17552[var6].rotationPointX = var7;
         this.field17552[var6].rotationPointZ = var8;
         this.field17552[var6].rotationPointY = 24.6F;
         var3.add(this.field17552[var6]);
      }

      this.field17553 = var3.build();
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field17552.length; var9++) {
         this.field17552[var9].rotateAngleX = 0.2F * MathHelper.sin(var4 * 0.3F + (float)var9) + 0.4F;
      }
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return this.field17553;
   }
}
