package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;

public class Class7351 implements Class7352 {
   private static String[] field31467;
   public final ResourceLocation field31468;
   public final Class7566 field31469;

   public Class7351(Class7566 var1, ResourceLocation var2) {
      this.field31469 = var1;
      this.field31468 = var2;
   }

   @Override
   public Collection<Class7744> method23305(CommandContext<Class6619> var1) throws CommandSyntaxException {
      ITag var4 = Class7566.method24774(var1, this.field31468);
      return var4.method24918();
   }

   @Override
   public Pair<ResourceLocation, Either<Class7744, ITag<Class7744>>> method23306(CommandContext<Class6619> var1) throws CommandSyntaxException {
      return Pair.of(this.field31468, Either.right(Class7566.method24774(var1, this.field31468)));
   }
}
