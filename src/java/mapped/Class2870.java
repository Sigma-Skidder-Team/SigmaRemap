package mapped;

import net.minecraft.entity.Entity;

public class Class2870<T extends Entity> extends Class2866<T> {
   private static String[] field17785;

   public Class2870() {
      super(12, 0.0F, false, 10.0F, 4.0F, 2.0F, 2.0F, 24);
      this.field17772 = new ModelRenderer(this, 0, 0);
      this.field17772.addBox(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F, 0.0F);
      this.field17772.setRotationPoint(0.0F, 4.0F, -8.0F);
      this.field17772.method22671(22, 0).addBox(-5.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F);
      this.field17772.method22671(22, 0).addBox(4.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F);
      this.field17773 = new ModelRenderer(this, 18, 4);
      this.field17773.addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, 0.0F);
      this.field17773.setRotationPoint(0.0F, 5.0F, 2.0F);
      this.field17773.method22671(52, 0).method22673(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F);
      this.field17774.rotationPointX--;
      this.field17775.rotationPointX++;
      this.field17774.rotationPointZ += 0.0F;
      this.field17775.rotationPointZ += 0.0F;
      this.field17776.rotationPointX--;
      this.field17777.rotationPointX++;
      this.field17776.rotationPointZ--;
      this.field17777.rotationPointZ--;
   }

   public ModelRenderer method11191() {
      return this.field17772;
   }
}
