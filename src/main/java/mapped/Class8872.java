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

public class Class8872
{
    private static final SimpleCommandExceptionType field37300;
    
    public static void method31180(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("save-on").requires(class7492 -> class7492.method23210(4))).executes(commandContext -> {
            final Class7492 class7492 = (Class7492)commandContext.getSource();
            int n = 0;
            for (final Class1849 class7493 : class7492.method23255().method1482()) {
                if (class7493 == null) {
                    continue;
                }
                if (!class7493.field10092) {
                    continue;
                }
                class7493.field10092 = false;
                n = 1;
            }
            if (n != 0) {
                class7492.method23257(new Class2259("commands.save.enabled", new Object[0]), true);
                return 1;
            }
            throw Class8872.field37300.create();
        }));
    }
    
    static {
        field37300 = new SimpleCommandExceptionType((Message)new Class2259("commands.save.alreadyOn", new Object[0]));
    }
}
