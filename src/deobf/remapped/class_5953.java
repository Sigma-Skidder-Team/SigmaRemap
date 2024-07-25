package remapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public final class class_5953 implements class_5098 {
   public class_5953(String var1) {
      this.field_30349 = var1;
   }

   @Override
   public class_1429 method_23413(CommandContext<class_9155> var1) throws CommandSyntaxException {
      class_1331 var4 = class_1024.method_4519(var1, this.field_30349 + "Pos");
      class_3757 var5 = ((class_9155)var1.getSource()).method_42198().method_28260(var4);
      if (var5 != null) {
         return new class_5749(var5, var4);
      } else {
         throw class_5749.method_26029().create();
      }
   }

   @Override
   public ArgumentBuilder<class_9155, ?> method_23414(
      ArgumentBuilder<class_9155, ?> var1, Function<ArgumentBuilder<class_9155, ?>, ArgumentBuilder<class_9155, ?>> var2
   ) {
      return var1.then(
         class_465.method_2231("block").then((ArgumentBuilder)var2.apply(class_465.method_2236(this.field_30349 + "Pos", class_1024.method_4522())))
      );
   }
}
