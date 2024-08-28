package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public final class Class8195 implements Class8196 {
   public final String field35222;

   public Class8195(String var1) {
      this.field35222 = var1;
   }

   @Override
   public Class7151 method28503(CommandContext<Class6619> var1) throws CommandSyntaxException {
      return new Class7154(Class8700.method31346(var1, this.field35222));
   }

   @Override
   public ArgumentBuilder<Class6619, ?> method28504(
      ArgumentBuilder<Class6619, ?> var1, Function<ArgumentBuilder<Class6619, ?>, ArgumentBuilder<Class6619, ?>> var2
   ) {
      return var1.then(Class6099.method18839("entity").then((ArgumentBuilder)var2.apply(Class6099.method18840(this.field35222, Class8700.method31345()))));
   }
}
