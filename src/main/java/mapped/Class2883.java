package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

public class Class2883 extends Class2803<BoatEntity> {
   private static String[] field17870;
   private final ModelRenderer[] field17871 = new ModelRenderer[2];
   private final ModelRenderer field17872;
   private final ImmutableList<ModelRenderer> field17873;

   public Class2883() {
      ModelRenderer[] var3 = new ModelRenderer[]{
         new ModelRenderer(this, 0, 0).setTextureSize(128, 64),
         new ModelRenderer(this, 0, 19).setTextureSize(128, 64),
         new ModelRenderer(this, 0, 27).setTextureSize(128, 64),
         new ModelRenderer(this, 0, 35).setTextureSize(128, 64),
         new ModelRenderer(this, 0, 43).setTextureSize(128, 64)
      };
      byte var4 = 32;
      byte var5 = 6;
      byte var6 = 20;
      byte var7 = 4;
      byte var8 = 28;
      var3[0].addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      var3[0].setRotationPoint(0.0F, 3.0F, 1.0F);
      var3[1].addBox(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
      var3[1].setRotationPoint(-15.0F, 4.0F, 4.0F);
      var3[2].addBox(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
      var3[2].setRotationPoint(15.0F, 4.0F, 0.0F);
      var3[3].addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[3].setRotationPoint(0.0F, 4.0F, -9.0F);
      var3[4].addBox(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[4].setRotationPoint(0.0F, 4.0F, 9.0F);
      var3[0].rotateAngleX = (float) (Math.PI / 2);
      var3[1].rotateAngleY = (float) (Math.PI * 3.0 / 2.0);
      var3[2].rotateAngleY = (float) (Math.PI / 2);
      var3[3].rotateAngleY = (float) Math.PI;
      this.field17871[0] = this.method11200(true);
      this.field17871[0].setRotationPoint(3.0F, -5.0F, 9.0F);
      this.field17871[1] = this.method11200(false);
      this.field17871[1].setRotationPoint(3.0F, -5.0F, -9.0F);
      this.field17871[1].rotateAngleY = (float) Math.PI;
      this.field17871[0].rotateAngleZ = (float) (Math.PI / 16);
      this.field17871[1].rotateAngleZ = (float) (Math.PI / 16);
      this.field17872 = new ModelRenderer(this, 0, 0).setTextureSize(128, 64);
      this.field17872.addBox(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      this.field17872.setRotationPoint(0.0F, -3.0F, 1.0F);
      this.field17872.rotateAngleX = (float) (Math.PI / 2);
      Builder var9 = ImmutableList.builder();
      var9.addAll(Arrays.<ModelRenderer>asList(var3));
      var9.addAll(Arrays.<ModelRenderer>asList(this.field17871));
      this.field17873 = var9.build();
   }

   public void setRotationAngles(BoatEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.method11201(var1, 0, var2);
      this.method11201(var1, 1, var2);
   }

   public ImmutableList<ModelRenderer> method11015() {
      return this.field17873;
   }

   public ModelRenderer method11199() {
      return this.field17872;
   }

   public ModelRenderer method11200(boolean var1) {
      ModelRenderer var4 = new ModelRenderer(this, 62, !var1 ? 20 : 0).setTextureSize(128, 64);
      byte var5 = 20;
      byte var6 = 7;
      byte var7 = 6;
      float var8 = -5.0F;
      var4.method22673(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
      var4.method22673(!var1 ? 0.001F : -1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
      return var4;
   }

   public void method11201(BoatEntity var1, int var2, float var3) {
      float var6 = var1.method4152(var2, var3);
      ModelRenderer var7 = this.field17871[var2];
      var7.rotateAngleX = (float) MathHelper.method37779((float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((MathHelper.sin(-var6) + 1.0F) / 2.0F));
      var7.rotateAngleY = (float) MathHelper.method37779(
         (float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((MathHelper.sin(-var6 + 1.0F) + 1.0F) / 2.0F)
      );
      if (var2 == 1) {
         var7.rotateAngleY = (float) Math.PI - var7.rotateAngleY;
      }
   }
}
