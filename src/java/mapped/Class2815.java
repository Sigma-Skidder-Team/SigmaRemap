package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

public class Class2815<T extends Entity> extends Class2803<T> {
   private static String[] field17538;
   private final ModelRenderer[] field17539;
   private final ModelRenderer[] field17540;
   private final ImmutableList<ModelRenderer> field17541;
   private final float[] field17542 = new float[7];
   private static final int[][] field17543 = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] field17544 = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public Class2815() {
      this.field17539 = new ModelRenderer[7];
      float var3 = -3.5F;

      for (int var4 = 0; var4 < this.field17539.length; var4++) {
         this.field17539[var4] = new ModelRenderer(this, field17544[var4][0], field17544[var4][1]);
         this.field17539[var4]
            .method22673(
               (float)field17543[var4][0] * -0.5F,
               0.0F,
               (float)field17543[var4][2] * -0.5F,
               (float)field17543[var4][0],
               (float)field17543[var4][1],
               (float)field17543[var4][2]
            );
         this.field17539[var4].setRotationPoint(0.0F, (float)(24 - field17543[var4][1]), var3);
         this.field17542[var4] = var3;
         if (var4 < this.field17539.length - 1) {
            var3 += (float)(field17543[var4][2] + field17543[var4 + 1][2]) * 0.5F;
         }
      }

      this.field17540 = new ModelRenderer[3];
      this.field17540[0] = new ModelRenderer(this, 20, 0);
      this.field17540[0].method22673(-5.0F, 0.0F, (float)field17543[2][2] * -0.5F, 10.0F, 8.0F, (float)field17543[2][2]);
      this.field17540[0].setRotationPoint(0.0F, 16.0F, this.field17542[2]);
      this.field17540[1] = new ModelRenderer(this, 20, 11);
      this.field17540[1].method22673(-3.0F, 0.0F, (float)field17543[4][2] * -0.5F, 6.0F, 4.0F, (float)field17543[4][2]);
      this.field17540[1].setRotationPoint(0.0F, 20.0F, this.field17542[4]);
      this.field17540[2] = new ModelRenderer(this, 20, 18);
      this.field17540[2].method22673(-3.0F, 0.0F, (float)field17543[4][2] * -0.5F, 6.0F, 5.0F, (float)field17543[1][2]);
      this.field17540[2].setRotationPoint(0.0F, 19.0F, this.field17542[1]);
      Builder var5 = ImmutableList.builder();
      var5.addAll(Arrays.<ModelRenderer>asList(this.field17539));
      var5.addAll(Arrays.<ModelRenderer>asList(this.field17540));
      this.field17541 = var5.build();
   }

   public ImmutableList<ModelRenderer> method11015() {
      return this.field17541;
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < this.field17539.length; var9++) {
         this.field17539[var9].rotateAngleY = MathHelper.cos(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.05F
            * (float)(1 + Math.abs(var9 - 2));
         this.field17539[var9].rotationPointX = MathHelper.sin(var4 * 0.9F + (float)var9 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.2F
            * (float)Math.abs(var9 - 2);
      }

      this.field17540[0].rotateAngleY = this.field17539[2].rotateAngleY;
      this.field17540[1].rotateAngleY = this.field17539[4].rotateAngleY;
      this.field17540[1].rotationPointX = this.field17539[4].rotationPointX;
      this.field17540[2].rotateAngleY = this.field17539[1].rotateAngleY;
      this.field17540[2].rotationPointX = this.field17539[1].rotationPointX;
   }
}
