package remapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public final class class_3870 implements class_5098 {
   public class_3870(String var1) {
      this.field_18853 = var1;
   }

   @Override
   public class_1429 method_23413(CommandContext<class_9155> var1) throws CommandSyntaxException {
      return new class_4288(class_5601.method_25413(var1, this.field_18853));
   }

   @Override
   public ArgumentBuilder<class_9155, ?> method_23414(
      ArgumentBuilder<class_9155, ?> var1, Function<ArgumentBuilder<class_9155, ?>, ArgumentBuilder<class_9155, ?>> var2
   ) {
      return var1.then(class_465.method_2231("entity").then((ArgumentBuilder)var2.apply(class_465.method_2236(this.field_18853, class_5601.method_25411()))));
   }
}
