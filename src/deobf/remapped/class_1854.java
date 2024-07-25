package remapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

public class class_1854 implements class_9638 {
   private static String[] field_9400;

   public class_1854(class_2222 var1, Identifier var2) {
      this.field_9398 = var1;
      this.field_9399 = var2;
   }

   @Override
   public Collection<class_2581> method_44495(CommandContext<class_9155> var1) throws CommandSyntaxException {
      class_2307 var4 = class_2222.method_10261(var1, this.field_9399);
      return var4.method_10608();
   }

   @Override
   public Pair<Identifier, Either<class_2581, class_2307<class_2581>>> method_44494(CommandContext<class_9155> var1) throws CommandSyntaxException {
      return Pair.of(this.field_9399, Either.right(class_2222.method_10261(var1, this.field_9399)));
   }
}
