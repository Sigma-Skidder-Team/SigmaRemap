package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Collections;

public class Class7353 implements Class7352 {
   private static String[] field31470;
   public final ResourceLocation field31471;
   public final Class7566 field31472;

   public Class7353(Class7566 var1, ResourceLocation var2) {
      this.field31472 = var1;
      this.field31471 = var2;
   }

   @Override
   public Collection<Class7744> method23305(CommandContext<Class6619> var1) throws CommandSyntaxException {
      return Collections.<Class7744>singleton(Class7566.method24775(var1, this.field31471));
   }

   @Override
   public Pair<ResourceLocation, Either<Class7744, ITag<Class7744>>> method23306(CommandContext<Class6619> var1) throws CommandSyntaxException {
      return Pair.of(this.field31471, Either.left(Class7566.method24775(var1, this.field31471)));
   }
}
