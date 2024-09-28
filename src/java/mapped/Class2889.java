package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;

public class Class2889<T extends Entity> extends Class2803<T> {
   private static String[] field17901;
   private final ModelRenderer field17902;

   public Class2889() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      this.field17902 = new ModelRenderer(this, 0, 0);
      this.field17902.addBox(-3.0F, -6.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.field17902.setRotationPoint(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<ModelRenderer> method11015() {
      return ImmutableList.of(this.field17902);
   }

   @Override
   public void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17902.rotateAngleY = var5 * (float) (Math.PI / 180.0);
      this.field17902.rotateAngleX = var6 * (float) (Math.PI / 180.0);
   }
}
