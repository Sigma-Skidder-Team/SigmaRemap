// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9338
{
    public static void method34607(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("kill").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method34608((Class7492)commandContext.getSource(), (Collection<? extends Class399>)ImmutableList.of((Object)((Class7492)commandContext.getSource()).method23252())))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).executes(commandContext -> method34608((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets")))));
    }
    
    private static int method34608(final Class7492 class7492, final Collection<? extends Class399> collection) {
        final Iterator<? extends Class399> iterator = collection.iterator();
        while (iterator.hasNext()) {
            ((Class399)iterator.next()).method1648();
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.kill.success.multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.kill.success.single", new Object[] { ((Class399)collection.iterator().next()).method1871() }), true);
        }
        return collection.size();
    }
}
