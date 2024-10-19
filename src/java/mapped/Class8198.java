package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.ResourceLocationArgument;

import java.util.function.Function;

public final class Class8198 implements Class8196 {
   public final String field35224;

   public Class8198(String var1) {
      this.field35224 = var1;
   }

   @Override
   public Class7151 method28503(CommandContext<CommandSource> var1) {
      return new Class7153(Class7153.method22321(var1), ResourceLocationArgument.getResourceLocation(var1, this.field35224), null);
   }

   @Override
   public ArgumentBuilder<CommandSource, ?> method28504(
           ArgumentBuilder<CommandSource, ?> var1, Function<ArgumentBuilder<CommandSource, ?>, ArgumentBuilder<CommandSource, ?>> var2
   ) {
      return var1.then(
         Commands.method18839("storage")
            .then((ArgumentBuilder)var2.apply(Commands.method18840(this.field35224, ResourceLocationArgument.method29031()).suggests(Class7153.method22322())))
      );
   }
}
