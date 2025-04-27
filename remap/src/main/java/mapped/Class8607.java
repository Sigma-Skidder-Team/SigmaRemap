// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8607
{
    public static void method29186(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("setidletimeout").requires(class7492 -> class7492.method23210(3))).then(Class7788.method25002("minutes", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method29187(commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "minutes")))));
    }
    
    private static int method29187(final Class7492 class7492, final int i) {
        class7492.method23255().method1553(i);
        class7492.method23257(new Class2259("commands.setidletimeout.success", i), true);
        return i;
    }
}
