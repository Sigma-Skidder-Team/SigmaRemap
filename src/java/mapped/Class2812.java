package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class2812<T extends Entity> extends Class2803<T> {
   private static String[] field17500;
   private final ModelRenderer field17501;
   private final ModelRenderer field17502;
   private final ModelRenderer field17503;
   private final ModelRenderer field17504;
   private final ModelRenderer field17505;
   private final ModelRenderer field17506;
   private final ModelRenderer field17507;
   private final ModelRenderer field17508;
   private final ModelRenderer field17509;
   private final ModelRenderer field17510;
   private final ModelRenderer field17511;
   private final ModelRenderer field17512;
   private final ModelRenderer field17513;

   public Class2812() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      byte var3 = 22;
      this.field17501 = new ModelRenderer(this, 0, 0);
      this.field17501.method22673(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field17501.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field17502 = new ModelRenderer(this, 24, 0);
      this.field17502.method22673(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field17502.setRotationPoint(-4.0F, 15.0F, -2.0F);
      this.field17503 = new ModelRenderer(this, 24, 3);
      this.field17503.method22673(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field17503.setRotationPoint(4.0F, 15.0F, -2.0F);
      this.field17504 = new ModelRenderer(this, 15, 17);
      this.field17504.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17504.setRotationPoint(0.0F, 14.0F, -4.0F);
      this.field17504.rotateAngleX = (float) (Math.PI / 4);
      this.field17505 = new ModelRenderer(this, 14, 16);
      this.field17505.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
      this.field17505.setRotationPoint(0.0F, 14.0F, 0.0F);
      this.field17506 = new ModelRenderer(this, 23, 18);
      this.field17506.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17506.setRotationPoint(0.0F, 14.0F, 4.0F);
      this.field17506.rotateAngleX = (float) (-Math.PI / 4);
      this.field17507 = new ModelRenderer(this, 5, 17);
      this.field17507.method22673(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17507.setRotationPoint(-4.0F, 22.0F, -4.0F);
      this.field17507.rotateAngleY = (float) (-Math.PI / 4);
      this.field17508 = new ModelRenderer(this, 1, 17);
      this.field17508.method22673(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17508.setRotationPoint(4.0F, 22.0F, -4.0F);
      this.field17508.rotateAngleY = (float) (Math.PI / 4);
      this.field17509 = new ModelRenderer(this, 15, 20);
      this.field17509.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17509.setRotationPoint(0.0F, 22.0F, -4.0F);
      this.field17509.rotateAngleX = (float) (-Math.PI / 4);
      this.field17511 = new ModelRenderer(this, 15, 20);
      this.field17511.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17511.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field17510 = new ModelRenderer(this, 15, 20);
      this.field17510.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17510.setRotationPoint(0.0F, 22.0F, 4.0F);
      this.field17510.rotateAngleX = (float) (Math.PI / 4);
      this.field17512 = new ModelRenderer(this, 9, 17);
      this.field17512.method22673(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17512.setRotationPoint(-4.0F, 22.0F, 4.0F);
      this.field17512.rotateAngleY = (float) (Math.PI / 4);
      this.field17513 = new ModelRenderer(this, 9, 17);
      this.field17513.method22673(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17513.setRotationPoint(4.0F, 22.0F, 4.0F);
      this.field17513.rotateAngleY = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(
         this.field17501,
         this.field17502,
         this.field17503,
         this.field17504,
         this.field17505,
         this.field17506,
         this.field17507,
         this.field17508,
         this.field17509,
         this.field17511,
         this.field17510,
         this.field17512,
         new ModelRenderer[]{this.field17513}
      );
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17502.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(var4 * 0.2F);
      this.field17503.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(var4 * 0.2F);
   }
}
