package remapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Collections;

public class class_5835 implements class_9638 {
   private static String[] field_29678;

   public class_5835(class_2222 var1, class_4639 var2) {
      this.field_29680 = var1;
      this.field_29679 = var2;
   }

   @Override
   public Collection<class_2581> method_44495(CommandContext<class_9155> var1) throws CommandSyntaxException {
      return Collections.<class_2581>singleton(class_2222.method_10255(var1, this.field_29679));
   }

   @Override
   public Pair<class_4639, Either<class_2581, class_2307<class_2581>>> method_44494(CommandContext<class_9155> var1) throws CommandSyntaxException {
      return Pair.of(this.field_29679, Either.left(class_2222.method_10255(var1, this.field_29679)));
   }
}
