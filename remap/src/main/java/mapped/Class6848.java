// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public class Class6848
{
    private static final DynamicCommandExceptionType field26866;
    private static final DynamicCommandExceptionType field26867;
    private static final DynamicCommandExceptionType field26868;
    private static final Dynamic2CommandExceptionType field26869;
    private static final SimpleCommandExceptionType field26870;
    
    public static void method20944(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("enchant").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(((RequiredArgumentBuilder)Class7788.method25002("enchantment", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9162.method33443()).executes(commandContext -> method20945(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class9162.method33444(commandContext, "enchantment"), 1))).then(Class7788.method25002("level", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method20945(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class9162.method33444(commandContext, "enchantment"), IntegerArgumentType.getInteger(commandContext, "level")))))));
    }
    
    private static int method20945(final Class7492 class7492, final Collection<? extends Entity> collection, final Class6257 class7493, final int i) throws CommandSyntaxException {
        if (i > class7493.method18588()) {
            throw Class6848.field26869.create(i, class7493.method18588());
        }
        int n = 0;
        for (final Entity class7494 : collection) {
            if (!(class7494 instanceof LivingEntity)) {
                if (collection.size() != 1) {
                    continue;
                }
                throw Class6848.field26866.create(class7494.getName().getString());
            }
            else {
                final LivingEntity class7495 = (LivingEntity)class7494;
                final ItemStack method2713 = class7495.getHeldItemMainhand();
                if (method2713.method27620()) {
                    if (collection.size() != 1) {
                        continue;
                    }
                    throw Class6848.field26867.create(class7495.getName().getString());
                }
                else if (class7493.method18600(method2713) && Class8742.method30227(Class8742.method30196(method2713).keySet(), class7493)) {
                    method2713.method27674(class7493, i);
                    ++n;
                }
                else {
                    if (collection.size() != 1) {
                        continue;
                    }
                    throw Class6848.field26868.create(method2713.getItem().method11729(method2713).getString());
                }
            }
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.enchant.success.multiple", class7493.method18599(i), collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.enchant.success.single", class7493.method18599(i), collection.iterator().next().getDisplayName()), true);
            }
            return n;
        }
        throw Class6848.field26870.create();
    }
    
    static {
        field26866 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.enchant.failed.entity", o);
            return;
        });
        field26867 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.enchant.failed.itemless", o3);
            return;
        });
        field26868 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("commands.enchant.failed.incompatible", o5);
            return;
        });
        field26869 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.enchant.failed.level", o, o2));
        field26870 = new SimpleCommandExceptionType(new Class2259("commands.enchant.failed", new Object[0]));
    }
}
