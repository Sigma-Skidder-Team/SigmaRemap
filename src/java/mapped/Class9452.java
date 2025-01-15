// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9452
{
    private static final SimpleCommandExceptionType field40635;
    
    public static void method35129(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("save-off").requires(class7492 -> class7492.method23210(4))).executes(commandContext -> {
            final Class7492 class7492 = (Class7492)commandContext.getSource();
            int n = 0;
            for (final Class1849 class7493 : class7492.method23255().method1482()) {
                if (class7493 == null) {
                    continue;
                }
                if (class7493.field10092) {
                    continue;
                }
                class7493.field10092 = true;
                n = 1;
            }
            if (n != 0) {
                class7492.method23257(new Class2259("commands.save.disabled", new Object[0]), true);
                return 1;
            }
            throw Class9452.field40635.create();
        }));
    }
    
    static {
        field40635 = new SimpleCommandExceptionType((Message)new Class2259("commands.save.alreadyOff", new Object[0]));
    }
}
