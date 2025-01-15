// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8080
{
    private static final SimpleCommandExceptionType field33273;
    
    public static void method26498(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("save-all").requires(class7492 -> class7492.method23210(4))).executes(commandContext -> method26499((Class7492)commandContext.getSource(), false))).then(Class7788.method25001("flush").executes(commandContext -> method26499((Class7492)commandContext.getSource(), true))));
    }
    
    private static int method26499(final Class7492 class7492, final boolean b) throws CommandSyntaxException {
        class7492.method23257(new Class2259("commands.save.saving", new Object[0]), false);
        final Class394 method23255 = class7492.method23255();
        method23255.method1537().method20600();
        if (method23255.method1451(true, b, true)) {
            class7492.method23257(new Class2259("commands.save.success", new Object[0]), true);
            return 1;
        }
        throw Class8080.field33273.create();
    }
    
    static {
        field33273 = new SimpleCommandExceptionType((Message)new Class2259("commands.save.failed", new Object[0]));
    }
}
