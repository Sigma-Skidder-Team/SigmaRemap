package mapped;

import java.util.function.Function;

public abstract class Class2803<E extends Entity> extends Class2827<E> {
   public Class2803() {
      this(Class4520::method14312);
   }

   public Class2803(Function<ResourceLocation, Class4520> var1) {
      super(var1);
   }

   @Override
   public void method11016(Class9332 var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.method11015().forEach(var8x -> var8x.method22681(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public abstract Iterable<Class7219> method11015();
}
