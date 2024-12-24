package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

public class Class2882<T extends SlimeEntity> extends Class2803<T> {
   private static String[] field17866;
   private final ModelRenderer[] field17867 = new ModelRenderer[8];
   private final ModelRenderer field17868;
   private final ImmutableList<ModelRenderer> field17869;

   public Class2882() {
      for (int var3 = 0; var3 < this.field17867.length; var3++) {
         byte var4 = 0;
         int var5 = var3;
         if (var3 != 2) {
            if (var3 == 3) {
               var4 = 24;
               var5 = 19;
            }
         } else {
            var4 = 24;
            var5 = 10;
         }

         this.field17867[var3] = new ModelRenderer(this, var4, var5);
         this.field17867[var3].method22673(-4.0F, (float)(16 + var3), -4.0F, 8.0F, 1.0F, 8.0F);
      }

      this.field17868 = new ModelRenderer(this, 0, 16);
      this.field17868.method22673(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F);
      Builder var6 = ImmutableList.builder();
      var6.add(this.field17868);
      var6.addAll(Arrays.<ModelRenderer>asList(this.field17867));
      this.field17869 = var6.build();
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      float var7 = MathHelper.lerp(var4, var1.field6084, var1.field6083);
      if (var7 < 0.0F) {
         var7 = 0.0F;
      }

      for (int var8 = 0; var8 < this.field17867.length; var8++) {
         this.field17867[var8].rotationPointY = (float)(-(4 - var8)) * var7 * 1.7F;
      }
   }

   public ImmutableList<ModelRenderer> method11015() {
      return this.field17869;
   }
}
