// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class Class6848
{
    private static final DynamicCommandExceptionType field26866;
    private static final DynamicCommandExceptionType field26867;
    private static final DynamicCommandExceptionType field26868;
    private static final Dynamic2CommandExceptionType field26869;
    private static final SimpleCommandExceptionType field26870;
    
    public static void method20944(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("enchant").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(((RequiredArgumentBuilder)Class7788.method25002("enchantment", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9162.method33443()).executes(commandContext -> method20945((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), Class9162.method33444((CommandContext<Class7492>)commandContext, "enchantment"), 1))).then(Class7788.method25002("level", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method20945((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), Class9162.method33444((CommandContext<Class7492>)commandContext, "enchantment"), IntegerArgumentType.getInteger(commandContext, "level")))))));
    }
    
    private static int method20945(final Class7492 class7492, final Collection<? extends Class399> collection, final Class6257 class7493, final int i) throws CommandSyntaxException {
        if (i > class7493.method18588()) {
            throw Class6848.field26869.create((Object)i, (Object)class7493.method18588());
        }
        int n = 0;
        for (final Class399 class7494 : collection) {
            if (!(class7494 instanceof Class511)) {
                if (collection.size() != 1) {
                    continue;
                }
                throw Class6848.field26866.create((Object)class7494.method1841().getString());
            }
            else {
                final Class511 class7495 = (Class511)class7494;
                final Class8321 method2713 = class7495.method2713();
                if (method2713.method27620()) {
                    if (collection.size() != 1) {
                        continue;
                    }
                    throw Class6848.field26867.create((Object)class7495.method1841().getString());
                }
                else if (class7493.method18600(method2713) && Class8742.method30227(Class8742.method30196(method2713).keySet(), class7493)) {
                    method2713.method27674(class7493, i);
                    ++n;
                }
                else {
                    if (collection.size() != 1) {
                        continue;
                    }
                    throw Class6848.field26868.create((Object)method2713.method27622().method11729(method2713).getString());
                }
            }
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.enchant.success.multiple", new Object[] { class7493.method18599(i), collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.enchant.success.single", new Object[] { class7493.method18599(i), ((Class399)collection.iterator().next()).method1871() }), true);
            }
            return n;
        }
        throw Class6848.field26870.create();
    }
    
    static {
        field26866 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.enchant.failed.entity", new Object[] { o });
            return;
        });
        field26867 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.enchant.failed.itemless", new Object[] { o3 });
            return;
        });
        field26868 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("commands.enchant.failed.incompatible", new Object[] { o5 });
            return;
        });
        field26869 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.enchant.failed.level", new Object[] { o, o2 }));
        field26870 = new SimpleCommandExceptionType((Message)new Class2259("commands.enchant.failed", new Object[0]));
    }
}
