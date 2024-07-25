package remapped;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class class_9873 implements Consumer<class_1549> {
   public final Function<Identifier, RenderLayer> field_49929;
   public int field_49928 = 64;
   public int field_49927 = 32;

   public class_9873(Function<Identifier, RenderLayer> var1) {
      this.field_49929 = var1;
   }

   public void accept(class_1549 var1) {
   }

   public final RenderLayer method_45498(Identifier var1) {
      RenderLayer var4 = this.field_49929.apply(var1);
      if (class_5052.method_23276() && var4.method_16717()) {
         var4 = RenderLayer.method_16747(var1);
      }

      return var4;
   }

   public abstract void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8);
}
