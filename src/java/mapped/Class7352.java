package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import net.minecraft.command.CommandSource;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;

public interface Class7352 {
   Collection<Class7744> method23305(CommandContext<CommandSource> var1) throws CommandSyntaxException;

   Pair<ResourceLocation, Either<Class7744, ITag<Class7744>>> method23306(CommandContext<CommandSource> var1) throws CommandSyntaxException;
}
