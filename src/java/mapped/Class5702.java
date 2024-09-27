package mapped;

import net.minecraft.util.ResourceLocation;

public class Class5702<T extends Class1101> extends Class5651<T, Class2813<T>> {
   private static final ResourceLocation field25072 = new ResourceLocation("textures/entity/spider/spider.png");

   public Class5702(EntityRendererManager var1) {
      super(var1, new Class2813<T>(), 0.8F);
      this.addLayer(new Class227<T, Class2813<T>>(this));
   }

   public float method17865(T var1) {
      return 180.0F;
   }

   public ResourceLocation method17843(T var1) {
      return field25072;
   }
}
