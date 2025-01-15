// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8701
{
    public static void method29849(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("spawnpoint").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method29850((Class7492)commandContext.getSource(), Collections.singleton(((Class7492)commandContext.getSource()).method23253()), new Class354(((Class7492)commandContext.getSource()).method23249())))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method29850((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), new Class354(((Class7492)commandContext.getSource()).method23249())))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method29850((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class8330.method27769((CommandContext<Class7492>)commandContext, "pos"))))));
    }
    
    private static int method29850(final Class7492 class7492, final Collection<Class513> collection, final Class354 class7493) {
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method2856(class7493, true, false);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.spawnpoint.success.multiple", new Object[] { class7493.method1074(), class7493.method1075(), class7493.method1076(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.spawnpoint.success.single", new Object[] { class7493.method1074(), class7493.method1075(), class7493.method1076(), collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
}
