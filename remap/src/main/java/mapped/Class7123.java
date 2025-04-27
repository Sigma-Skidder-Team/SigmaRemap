// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class7123
{
    public static void method21862(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register(Class7788.method25001("me").then(Class7788.method25002("action", (ArgumentType<Object>)StringArgumentType.greedyString()).executes(commandContext -> {
            commandContext.getSource().method23255().method1537().method20619(new Class2259("chat.type.emote", commandContext.getSource().method23247(), StringArgumentType.getString(commandContext, "action")));
            return 1;
        })));
    }
}
