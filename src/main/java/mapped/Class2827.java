package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class Class2827<T extends Entity> extends Class2828 {
   public float swingProgress;
   public boolean isSitting;
   public boolean isChild = true;

   public Class2827() {
      this(RenderType::getEntityCutoutNoCull);
   }

   public Class2827(Function<ResourceLocation, RenderType> var1) {
      super(var1);
   }

   public abstract void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6);

   public void setLivingAnimations(T var1, float var2, float var3, float var4) {
   }

   public void copyModelAttributesTo(Class2827<T> var1) {
      var1.swingProgress = this.swingProgress;
      var1.isSitting = this.isSitting;
      var1.isChild = this.isChild;
   }
}
