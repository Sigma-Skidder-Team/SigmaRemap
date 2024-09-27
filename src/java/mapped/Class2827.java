package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.function.Function;

public abstract class Class2827<T extends Entity> extends Class2828 {
   public float field17600;
   public boolean field17601;
   public boolean field17602 = true;

   public Class2827() {
      this(RenderType::getEntityCutoutNoCull);
   }

   public Class2827(Function<ResourceLocation, RenderType> var1) {
      super(var1);
   }

   public abstract void setRotationAngles(T var1, float var2, float var3, float var4, float var5, float var6);

   public void method10997(T var1, float var2, float var3, float var4) {
   }

   public void method11027(Class2827<T> var1) {
      var1.field17600 = this.field17600;
      var1.field17601 = this.field17601;
      var1.field17602 = this.field17602;
   }
}
