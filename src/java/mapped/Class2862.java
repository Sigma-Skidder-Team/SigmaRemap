package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class2862<T extends Class1017> extends Class2855<T> {
   private final ModelRenderer field17735;
   private final ModelRenderer field17736;
   private final ModelRenderer field17737;
   private final ModelRenderer field17738;
   private final ModelRenderer field17739;
   private final ModelRenderer field17740;
   private final ModelRenderer field17741;
   private final ModelRenderer field17742;
   private final ModelRenderer field17743;
   private final ModelRenderer field17744;
   private float field17745;

   public Class2862() {
      super(false, 24.0F, 0.0F);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17735 = new ModelRenderer(this);
      this.field17735.setRotationPoint(0.0F, 19.0F, 0.0F);
      this.field17736 = new ModelRenderer(this, 0, 0);
      this.field17736.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.field17735.method22670(this.field17736);
      this.field17736.addBox(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
      this.field17742 = new ModelRenderer(this, 26, 7);
      this.field17742.addBox(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
      this.field17736.method22670(this.field17742);
      this.field17743 = new ModelRenderer(this, 2, 0);
      this.field17743.setRotationPoint(0.0F, -2.0F, -5.0F);
      this.field17743.addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field17744 = new ModelRenderer(this, 2, 3);
      this.field17744.setRotationPoint(0.0F, -2.0F, -5.0F);
      this.field17744.addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.field17736.method22670(this.field17743);
      this.field17736.method22670(this.field17744);
      this.field17737 = new ModelRenderer(this, 0, 18);
      this.field17737.setRotationPoint(-1.5F, -4.0F, -3.0F);
      this.field17737.rotateAngleX = 0.0F;
      this.field17737.rotateAngleY = -0.2618F;
      this.field17737.field31037 = 0.0F;
      this.field17735.method22670(this.field17737);
      this.field17737.addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field17738 = new ModelRenderer(this, 0, 18);
      this.field17738.setRotationPoint(1.5F, -4.0F, -3.0F);
      this.field17738.rotateAngleX = 0.0F;
      this.field17738.rotateAngleY = 0.2618F;
      this.field17738.field31037 = 0.0F;
      this.field17738.field31038 = true;
      this.field17735.method22670(this.field17738);
      this.field17738.addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.field17739 = new ModelRenderer(this);
      this.field17739.setRotationPoint(1.5F, 3.0F, -2.0F);
      this.field17735.method22670(this.field17739);
      this.field17739.method22672("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
      this.field17740 = new ModelRenderer(this);
      this.field17740.setRotationPoint(1.5F, 3.0F, 0.0F);
      this.field17735.method22670(this.field17740);
      this.field17740.method22672("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
      this.field17741 = new ModelRenderer(this);
      this.field17741.setRotationPoint(1.5F, 3.0F, 2.0F);
      this.field17735.method22670(this.field17741);
      this.field17741.method22672("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997(var1, var2, var3, var4);
      this.field17745 = var1.method4427(var4);
      this.field17742.showModel = !var1.method4440();
   }

   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17737.rotateAngleX = 0.0F;
      this.field17743.rotateAngleX = 0.0F;
      this.field17744.rotateAngleX = 0.0F;
      this.field17735.rotateAngleX = 0.0F;
      this.field17735.rotationPointY = 19.0F;
      boolean var9 = var1.isOnGround() && var1.getMotion().lengthSquared() < 1.0E-7;
      if (!var9) {
         float var10 = var4 * 2.1F;
         this.field17737.rotateAngleY = 0.0F;
         this.field17737.field31037 = MathHelper.cos(var10) * (float) Math.PI * 0.15F;
         this.field17738.rotateAngleX = this.field17737.rotateAngleX;
         this.field17738.rotateAngleY = this.field17737.rotateAngleY;
         this.field17738.field31037 = -this.field17737.field31037;
         this.field17739.rotateAngleX = (float) (Math.PI / 4);
         this.field17740.rotateAngleX = (float) (Math.PI / 4);
         this.field17741.rotateAngleX = (float) (Math.PI / 4);
         this.field17735.rotateAngleX = 0.0F;
         this.field17735.rotateAngleY = 0.0F;
         this.field17735.field31037 = 0.0F;
      } else {
         this.field17737.rotateAngleY = -0.2618F;
         this.field17737.field31037 = 0.0F;
         this.field17738.rotateAngleX = 0.0F;
         this.field17738.rotateAngleY = 0.2618F;
         this.field17738.field31037 = 0.0F;
         this.field17739.rotateAngleX = 0.0F;
         this.field17740.rotateAngleX = 0.0F;
         this.field17741.rotateAngleX = 0.0F;
      }

      if (!var1.method4369()) {
         this.field17735.rotateAngleX = 0.0F;
         this.field17735.rotateAngleY = 0.0F;
         this.field17735.field31037 = 0.0F;
         if (!var9) {
            float var11 = MathHelper.cos(var4 * 0.18F);
            this.field17735.rotateAngleX = 0.1F + var11 * (float) Math.PI * 0.025F;
            this.field17743.rotateAngleX = var11 * (float) Math.PI * 0.03F;
            this.field17744.rotateAngleX = var11 * (float) Math.PI * 0.03F;
            this.field17739.rotateAngleX = -var11 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.field17741.rotateAngleX = -var11 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.field17735.rotationPointY = 19.0F - MathHelper.cos(var4 * 0.18F) * 0.9F;
         }
      }

      if (this.field17745 > 0.0F) {
         this.field17735.rotateAngleX = Class9530.method36832(this.field17735.rotateAngleX, 3.0915928F, this.field17745);
      }
   }

   @Override
   public Iterable<ModelRenderer> method11001() {
      return ImmutableList.of();
   }

   @Override
   public Iterable<ModelRenderer> getBodyParts() {
      return ImmutableList.of(this.field17735);
   }
}
