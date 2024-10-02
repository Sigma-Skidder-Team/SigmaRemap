package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public interface Class9041 {
   Predicate<ItemStack> method33539(CommandContext<CommandSource> var1) throws CommandSyntaxException;
}
