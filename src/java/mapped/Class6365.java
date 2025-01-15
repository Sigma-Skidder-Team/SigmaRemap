// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class6365
{
    public static void method19010(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralCommandNode register = commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("msg").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25002("message", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> method19011((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class8695.method29807((CommandContext<Class7492>)commandContext, "message"))))));
        commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("tell").redirect((CommandNode)register));
        commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("w").redirect((CommandNode)register));
    }
    
    private static int method19011(final Class7492 class7492, final Collection<Class513> collection, final Class2250 class7493) {
        for (final Class513 class7494 : collection) {
            class7494.method1494(new Class2259("commands.message.display.incoming", new Object[] { class7492.method23247(), class7493.method8466() }).method8468(Class2116.field12316, Class2116.field12329));
            class7492.method23257(new Class2259("commands.message.display.outgoing", new Object[] { class7494.method1871(), class7493.method8466() }).method8468(Class2116.field12316, Class2116.field12329), false);
        }
        return collection.size();
    }
}
