// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.function.Predicate;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.item.ItemStack;

public class Class9158
{
    private static final DynamicCommandExceptionType field38803;
    private static final DynamicCommandExceptionType field38804;
    
    public static void method33427(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("clear").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method33428((Class7492)commandContext.getSource(), Collections.singleton(((Class7492)commandContext.getSource()).method23253()), p0 -> true, -1)).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method33428(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), p0 -> true, -1))).then(((RequiredArgumentBuilder)Class7788.method25002("item", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9508.method35422()).executes(commandContext -> method33428(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class9508.method35423(commandContext, "item"), -1))).then(Class7788.method25002("maxCount", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method33428(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), Class9508.method35423(commandContext, "item"), IntegerArgumentType.getInteger(commandContext, "maxCount")))))));
    }
    
    private static int method33428(final Class7492 class7492, final Collection<Class513> collection, final Predicate<ItemStack> predicate, final int n) throws CommandSyntaxException {
        int n2 = 0;
        for (final Class513 class7493 : collection) {
            n2 += class7493.inventory.method2357(predicate, n);
            class7493.field3009.method10876();
            class7493.method2932();
        }
        if (n2 != 0) {
            if (n != 0) {
                if (collection.size() != 1) {
                    class7492.method23257(new Class2259("commands.clear.success.multiple", n2, collection.size()), true);
                }
                else {
                    class7492.method23257(new Class2259("commands.clear.success.single", n2, collection.iterator().next().getDisplayName()), true);
                }
            }
            else if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.clear.test.multiple", n2, collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.clear.test.single", n2, collection.iterator().next().getDisplayName()), true);
            }
            return n2;
        }
        if (collection.size() != 1) {
            throw Class9158.field38804.create(collection.size());
        }
        throw Class9158.field38803.create(collection.iterator().next().getName().getFormattedText());
    }
    
    static {
        field38803 = new DynamicCommandExceptionType(o -> {
            new Class2259("clear.failed.single", o);
            return;
        });
        field38804 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("clear.failed.multiple", o3);
            return;
        });
    }
}
