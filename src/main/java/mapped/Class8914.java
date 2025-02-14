package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.item.ItemStack;

import java.util.List;

@FunctionalInterface
public interface Class8914 {
   int method32583(CommandContext<CommandSource> var1, List<ItemStack> var2, Class7946 var3) throws CommandSyntaxException;
}
