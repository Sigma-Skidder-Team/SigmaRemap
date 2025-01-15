// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class7880
{
    public static void method25532(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("tellraw").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25002("message", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> {
            int n = 0;
            for (final Class513 class513 : Class6886.method21152((CommandContext<Class7492>)commandContext, "targets")) {
                class513.method1494(Class9479.method35294((Class7492)commandContext.getSource(), Class9502.method35389((CommandContext<Class7492>)commandContext, "message"), class513, 0));
                ++n;
            }
            return n;
        }))));
    }
}
