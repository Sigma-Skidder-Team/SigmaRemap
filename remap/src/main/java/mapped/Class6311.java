// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Predicate;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.item.ItemStack;

public interface Class6311
{
    Predicate<ItemStack> method18686(final CommandContext<Class7492> p0) throws CommandSyntaxException;
}
