package mapped;

public class Class2800<T extends ZombieEntity> extends BipedModel<T> implements Class2801 {
   private static String[] field17431;
   private ModelRenderer field17445;

   public Class2800(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
      if (!var2) {
         this.bipedHead = new ModelRenderer(this, 0, 0);
         this.bipedHead.method22671(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
         this.bipedHead.method22671(24, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
         this.field17433 = new ModelRenderer(this, 32, 0);
         this.field17433.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
         this.field17445 = new ModelRenderer(this);
         this.field17445.method22671(30, 47).addBox(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
         this.field17445.rotateAngleX = (float) (-Math.PI / 2);
         this.field17433.method22670(this.field17445);
         this.bipedBody = new ModelRenderer(this, 16, 20);
         this.bipedBody.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
         this.bipedBody.method22671(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.05F);
         this.bipedRightArm = new ModelRenderer(this, 44, 22);
         this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
         this.bipedLeftArm = new ModelRenderer(this, 44, 22);
         this.bipedLeftArm.field31038 = true;
         this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
         this.bipedRightLeg = new ModelRenderer(this, 0, 22);
         this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
         this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.bipedLeftLeg = new ModelRenderer(this, 0, 22);
         this.bipedLeftLeg.field31038 = true;
         this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
         this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      } else {
         this.bipedHead = new ModelRenderer(this, 0, 0);
         this.bipedHead.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
         this.bipedBody = new ModelRenderer(this, 16, 16);
         this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.bipedRightLeg = new ModelRenderer(this, 0, 16);
         this.bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
         this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
         this.bipedLeftLeg.field31038 = true;
         this.bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
         this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
      }
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      ModelHelper.method27109(this.bipedLeftArm, this.bipedRightArm, var1.method4307(), this.field17600, var4);
   }

   @Override
   public void method11014(boolean var1) {
      this.bipedHead.showModel = var1;
      this.field17433.showModel = var1;
      this.field17445.showModel = var1;
   }
}
