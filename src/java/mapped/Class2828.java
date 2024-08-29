package mapped;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class Class2828 implements Consumer<Class7219> {
   public final Function<ResourceLocation, RenderType> field17603;
   public int field17604 = 64;
   public int field17605 = 32;

   public Class2828(Function<ResourceLocation, RenderType> var1) {
      this.field17603 = var1;
   }

   public void accept(Class7219 var1) {
   }

   public final RenderType method11028(ResourceLocation var1) {
      RenderType var4 = this.field17603.apply(var1);
      if (Class8564.method30596() && var4.method14364()) {
         var4 = RenderType.getEntityCutout(var1);
      }

      return var4;
   }

   public abstract void method11016(MatrixStack var1, Class5422 var2, int var3, int var4, float var5, float var6, float var7, float var8);
}
