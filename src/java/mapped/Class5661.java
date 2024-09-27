package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5661<T extends MobEntity, M extends BipedModel<T>> extends Class5651<T, M> {
   private static final ResourceLocation field25025 = new ResourceLocation("textures/entity/steve.png");

   public Class5661(EntityRendererManager var1, M var2, float var3) {
      this(var1, (M)var2, var3, 1.0F, 1.0F, 1.0F);
   }

   public Class5661(EntityRendererManager var1, M var2, float var3, float var4, float var5, float var6) {
      super(var1, (M)var2, var3);
      this.addLayer(new Class235<T, M>(this, var4, var5, var6));
      this.addLayer(new Class220<T, M>(this));
      this.addLayer(new Class242<T, M>(this));
   }

   public ResourceLocation method17843(T var1) {
      return field25025;
   }
}
