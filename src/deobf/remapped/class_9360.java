package remapped;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public final class class_9360 implements class_2237 {
   public class_9360(LiteralArgumentBuilder var1) {
      this.field_47811 = var1;
   }

   @Override
   public <T extends class_9152<T>> void method_10289(class_7505<T> var1, class_3275<T> var2) {
      this.field_47811
         .then(
            ((LiteralArgumentBuilder)class_465.method_2231(var1.method_34215()).executes(var1x -> class_9173.method_42279((class_9155)var1x.getSource(), var1)))
               .then(var2.method_14953("value").executes(var1x -> class_9173.method_42278(var1x, var1)))
         );
   }
}
