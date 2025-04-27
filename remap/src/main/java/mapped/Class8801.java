// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8801
{
    public static void method30706(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("reload").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> {
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.reload.success"), true);
            ((Class7492)commandContext.getSource()).method23255().method1568();
            return 0;
        }));
    }
}
