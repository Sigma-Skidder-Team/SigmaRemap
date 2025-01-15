// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class Class9350
{
    private static final DynamicCommandExceptionType field40127;
    
    public static void method34660(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralArgumentBuilder<Class7492> method25001 = Class7788.method25001("difficulty");
        for (final Class2113 class2113 : Class2113.values()) {
            method25001.then(Class7788.method25001(class2113.method8239()).executes(commandContext -> method34661((Class7492)commandContext.getSource(), class2113)));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)method25001.requires(class2114 -> class2114.method23210(2))).executes(commandContext -> {
            final Class2113 method6954 = ((Class7492)commandContext.getSource()).method23250().method6954();
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.difficulty.query", new Object[] { method6954.method8236() }), false);
            return method6954.method8235();
        }));
    }
    
    public static int method34661(final Class7492 class7492, final Class2113 class7493) throws CommandSyntaxException {
        final Class394 method23255 = class7492.method23255();
        if (method23255.method1481(Class383.field2223).method6954() != class7493) {
            method23255.method1505(class7493, true);
            class7492.method23257(new Class2259("commands.difficulty.success", new Object[] { class7493.method8236() }), true);
            return 0;
        }
        throw Class9350.field40127.create((Object)class7493.method8239());
    }
    
    static {
        field40127 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.difficulty.failure", new Object[] { o });
            return;
        });
    }
}
