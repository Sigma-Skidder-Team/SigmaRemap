// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8689
{
    public static void method29779(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("banlist").requires(class7492 -> {
            final boolean b;
            if (class7492.method23255().method1537().method20591().method26203() || class7492.method23255().method1537().method20592().method26203()) {
                if (!(!class7492.method23210(3))) {
                    return b;
                }
            }
            return b;
        })).executes(commandContext -> {
            final Class6765 method1537 = ((Class7492)commandContext.getSource()).method23255().method1537();
            return method29780((Class7492)commandContext.getSource(), Lists.newArrayList(Iterables.concat((Iterable)method1537.method20591().method26216(), (Iterable)method1537.method20592().method26216())));
        })).then(Class7788.method25001("ips").executes(commandContext -> method29780((Class7492)commandContext.getSource(), ((Class8006<K, ? extends Class6024<?>>)((Class7492)commandContext.getSource()).method23255().method1537().method20592()).method26216())))).then(Class7788.method25001("players").executes(commandContext -> method29780((Class7492)commandContext.getSource(), ((Class8006<K, ? extends Class6024<?>>)((Class7492)commandContext.getSource()).method23255().method1537().method20591()).method26216()))));
    }
    
    private static int method29780(final Class7492 class7492, final Collection<? extends Class6024<?>> collection) {
        if (!collection.isEmpty()) {
            class7492.method23257(new Class2259("commands.banlist.list", new Object[] { collection.size() }), false);
            for (final Class6024 class7493 : collection) {
                class7492.method23257(new Class2259("commands.banlist.entry", new Object[] { class7493.method17951(), class7493.method17948(), class7493.method17950() }), false);
            }
        }
        else {
            class7492.method23257(new Class2259("commands.banlist.none", new Object[0]), false);
        }
        return collection.size();
    }
}
