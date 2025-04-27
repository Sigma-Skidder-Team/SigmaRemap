// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8931
{
    private static final SimpleCommandExceptionType field37536;
    private static final DynamicCommandExceptionType field37537;
    
    public static void method31493(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("publish").requires(class7492 -> class7492.method23255().method1500() && class7492.method23210(4))).executes(commandContext -> method31494((Class7492)commandContext.getSource(), Class7676.method24365())).then(Class7788.method25002("port", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0, 65535)).executes(commandContext -> method31494(commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "port")))));
    }
    
    private static int method31494(final Class7492 class7492, final int i) throws CommandSyntaxException {
        if (class7492.method23255().method1539()) {
            throw Class8931.field37537.create(class7492.method23255().method1496());
        }
        if (class7492.method23255().method1544(class7492.method23255().method1445(), false, i)) {
            class7492.method23257(new Class2259("commands.publish.success", i), true);
            return i;
        }
        throw Class8931.field37536.create();
    }
    
    static {
        field37536 = new SimpleCommandExceptionType(new Class2259("commands.publish.failed", new Object[0]));
        field37537 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.publish.alreadyPublished", o);
            return;
        });
    }
}
