package mapped;

import net.minecraft.entity.Entity;

import java.util.Arrays;

public class Class2818<T extends Entity> extends Class2803<T> {
   private static String[] field17554;
   private final ModelRenderer[] field17555 = new ModelRenderer[6];

   public Class2818() {
      this.field17555[0] = new ModelRenderer(this, 0, 10);
      this.field17555[1] = new ModelRenderer(this, 0, 0);
      this.field17555[2] = new ModelRenderer(this, 0, 0);
      this.field17555[3] = new ModelRenderer(this, 0, 0);
      this.field17555[4] = new ModelRenderer(this, 0, 0);
      this.field17555[5] = new ModelRenderer(this, 44, 10);
      byte var3 = 20;
      byte var4 = 8;
      byte var5 = 16;
      byte var6 = 4;
      this.field17555[0].addBox(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F);
      this.field17555[0].setRotationPoint(0.0F, 4.0F, 0.0F);
      this.field17555[5].addBox(-9.0F, -7.0F, -1.0F, 18.0F, 14.0F, 1.0F, 0.0F);
      this.field17555[5].setRotationPoint(0.0F, 4.0F, 0.0F);
      this.field17555[1].addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[1].setRotationPoint(-9.0F, 4.0F, 0.0F);
      this.field17555[2].addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[2].setRotationPoint(9.0F, 4.0F, 0.0F);
      this.field17555[3].addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[3].setRotationPoint(0.0F, 4.0F, -7.0F);
      this.field17555[4].addBox(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[4].setRotationPoint(0.0F, 4.0F, 7.0F);
      this.field17555[0].rotateAngleX = (float) (Math.PI / 2);
      this.field17555[1].rotateAngleY = (float) (Math.PI * 3.0 / 2.0);
      this.field17555[2].rotateAngleY = (float) (Math.PI / 2);
      this.field17555[3].rotateAngleY = (float) Math.PI;
      this.field17555[5].rotateAngleX = (float) (-Math.PI / 2);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17555[5].rotationPointY = 4.0F - var4;
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return Arrays.<ModelRenderer>asList(this.field17555);
   }
}
