package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;

import java.util.function.Function;

public interface Class8196 {
   Class7151 method28503(CommandContext<CommandSource> var1) throws CommandSyntaxException;

   ArgumentBuilder<CommandSource, ?> method28504(ArgumentBuilder<CommandSource, ?> var1, Function<ArgumentBuilder<CommandSource, ?>, ArgumentBuilder<CommandSource, ?>> var2);
}
