package mapped;

public class Class2871<T extends PolarBearEntity> extends Class2866<T> {
   private static String[] field17786;

   public Class2871() {
      super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.field17772 = new ModelRenderer(this, 0, 0);
      this.field17772.addBox(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
      this.field17772.setRotationPoint(0.0F, 10.0F, -16.0F);
      this.field17772.method22671(0, 44).addBox(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
      this.field17772.method22671(26, 0).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      ModelRenderer var3 = this.field17772.method22671(26, 0);
      var3.mirror = true;
      var3.addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.field17773 = new ModelRenderer(this);
      this.field17773.method22671(0, 19).addBox(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
      this.field17773.method22671(39, 0).addBox(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
      this.field17773.setRotationPoint(-2.0F, 9.0F, 12.0F);
      byte var4 = 10;
      this.field17774 = new ModelRenderer(this, 50, 22);
      this.field17774.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field17774.setRotationPoint(-3.5F, 14.0F, 6.0F);
      this.field17775 = new ModelRenderer(this, 50, 22);
      this.field17775.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.field17775.setRotationPoint(3.5F, 14.0F, 6.0F);
      this.field17776 = new ModelRenderer(this, 50, 40);
      this.field17776.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field17776.setRotationPoint(-2.5F, 14.0F, -7.0F);
      this.field17777 = new ModelRenderer(this, 50, 40);
      this.field17777.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.field17777.setRotationPoint(2.5F, 14.0F, -7.0F);
      this.field17774.rotationPointX--;
      this.field17775.rotationPointX++;
      this.field17774.rotationPointZ += 0.0F;
      this.field17775.rotationPointZ += 0.0F;
      this.field17776.rotationPointX--;
      this.field17777.rotationPointX++;
      this.field17776.rotationPointZ--;
      this.field17777.rotationPointZ--;
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      float var9 = var4 - (float)var1.ticksExisted;
      float var10 = var1.method5185(var9);
      var10 *= var10;
      float var11 = 1.0F - var10;
      this.field17773.rotateAngleX = (float) (Math.PI / 2) - var10 * (float) Math.PI * 0.35F;
      this.field17773.rotationPointY = 9.0F * var11 + 11.0F * var10;
      this.field17776.rotationPointY = 14.0F * var11 - 6.0F * var10;
      this.field17776.rotationPointZ = -8.0F * var11 - 4.0F * var10;
      this.field17776.rotateAngleX -= var10 * (float) Math.PI * 0.45F;
      this.field17777.rotationPointY = this.field17776.rotationPointY;
      this.field17777.rotationPointZ = this.field17776.rotationPointZ;
      this.field17777.rotateAngleX -= var10 * (float) Math.PI * 0.45F;
      if (!this.isChild) {
         this.field17772.rotationPointY = 10.0F * var11 - 14.0F * var10;
         this.field17772.rotationPointZ = -16.0F * var11 - 3.0F * var10;
      } else {
         this.field17772.rotationPointY = 10.0F * var11 - 9.0F * var10;
         this.field17772.rotationPointZ = -16.0F * var11 - 7.0F * var10;
      }

      this.field17772.rotateAngleX += var10 * (float) Math.PI * 0.15F;
   }
}
