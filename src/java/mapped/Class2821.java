package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2821<T extends Entity> extends Class2803<T> {
   private static String[] field17576;
   private final ModelRenderer field17577;

   public Class2821() {
      this.field17604 = 64;
      this.field17605 = 32;
      this.field17577 = new ModelRenderer(this);
      this.field17577.method22671(0, 0).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, 0.0F);
      this.field17577.method22671(0, 10).addBox(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F);
      this.field17577.method22671(20, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F);
      this.field17577.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17577);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17577.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17577.rotateAngleX = var6 * (float) (Math.PI / 180.0);
   }
}
