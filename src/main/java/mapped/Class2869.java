package mapped;

public class Class2869<T extends SheepEntity> extends Class2866<T> {
   private static String[] field17771;
   private float field17784;

   public Class2869() {
      super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
      this.field17772 = new ModelRenderer(this, 0, 0);
      this.field17772.addBox(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F, 0.0F);
      this.field17772.setRotationPoint(0.0F, 6.0F, -8.0F);
      this.field17773 = new ModelRenderer(this, 28, 8);
      this.field17773.addBox(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 0.0F);
      this.field17773.setRotationPoint(0.0F, 5.0F, 2.0F);
   }

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
      super.setLivingAnimations((T)var1, var2, var3, var4);
      this.field17772.rotationPointY = 6.0F + var1.method4513(var4) * 9.0F;
      this.field17784 = var1.method4514(var4);
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.setRotationAngles((T)var1, var2, var3, var4, var5, var6);
      this.field17772.rotateAngleX = this.field17784;
   }
}
