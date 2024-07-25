package remapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;

public final class class_9788 implements class_5098 {
   public class_9788(String var1) {
      this.field_49674 = var1;
   }

   @Override
   public class_1429 method_23413(CommandContext<class_9155> var1) {
      return new class_3460(class_3460.method_15921(var1), class_4195.method_19511(var1, this.field_49674), null);
   }

   @Override
   public ArgumentBuilder<class_9155, ?> method_23414(
      ArgumentBuilder<class_9155, ?> var1, Function<ArgumentBuilder<class_9155, ?>, ArgumentBuilder<class_9155, ?>> var2
   ) {
      return var1.then(
         class_465.method_2231("storage")
            .then((ArgumentBuilder)var2.apply(class_465.method_2236(this.field_49674, class_4195.method_19515()).suggests(class_3460.method_15920())))
      );
   }
}
