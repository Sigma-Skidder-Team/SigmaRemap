package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;

import java.util.Collection;
import java.util.function.Supplier;

@FunctionalInterface
public interface Class8985 {
   Collection<String> method33188(CommandSource var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
}
