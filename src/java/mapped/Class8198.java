package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;

public final class Class8198 implements Class8196 {
   public final String field35224;

   public Class8198(String var1) {
      this.field35224 = var1;
   }

   @Override
   public Class7151 method28503(CommandContext<Class6619> var1) {
      return new Class7153(Class7153.method22321(var1), Class8303.method29036(var1, this.field35224), null);
   }

   @Override
   public ArgumentBuilder<Class6619, ?> method28504(
      ArgumentBuilder<Class6619, ?> var1, Function<ArgumentBuilder<Class6619, ?>, ArgumentBuilder<Class6619, ?>> var2
   ) {
      return var1.then(
         Class6099.method18839("storage")
            .then((ArgumentBuilder)var2.apply(Class6099.method18840(this.field35224, Class8303.method29031()).suggests(Class7153.method22322())))
      );
   }
}
