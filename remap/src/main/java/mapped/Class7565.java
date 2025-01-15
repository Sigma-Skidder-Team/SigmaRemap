// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class7565
{
    public static void method23749(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("say").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("message", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8695.method29806()).executes(commandContext -> {
            ((Class7492)commandContext.getSource()).method23255().method1537().method20619(new Class2259("chat.type.announcement", new Object[] { ((Class7492)commandContext.getSource()).method23247(), Class8695.method29807((CommandContext<Class7492>)commandContext, "message") }));
            return 1;
        })));
    }
}
