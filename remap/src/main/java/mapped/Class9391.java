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

public class Class9391
{
    public static void method34913(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("weather").requires(class7492 -> class7492.method23210(2))).then(((LiteralArgumentBuilder)Class7788.method25001("clear").executes(commandContext -> method34914((Class7492)commandContext.getSource(), 6000))).then(Class7788.method25002("duration", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0, 1000000)).executes(commandContext -> method34914((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "duration") * 20))))).then(((LiteralArgumentBuilder)Class7788.method25001("rain").executes(commandContext -> method34915((Class7492)commandContext.getSource(), 6000))).then(Class7788.method25002("duration", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0, 1000000)).executes(commandContext -> method34915((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "duration") * 20))))).then(((LiteralArgumentBuilder)Class7788.method25001("thunder").executes(commandContext -> method34916((Class7492)commandContext.getSource(), 6000))).then(Class7788.method25002("duration", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0, 1000000)).executes(commandContext -> method34916((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "duration") * 20)))));
    }
    
    private static int method34914(final Class7492 class7492, final int n) {
        class7492.method23250().method6764().method29555(n);
        class7492.method23250().method6764().method29563(0);
        class7492.method23250().method6764().method29559(0);
        class7492.method23250().method6764().method29561(false);
        class7492.method23250().method6764().method29557(false);
        class7492.method23257(new Class2259("commands.weather.set.clear", new Object[0]), true);
        return n;
    }
    
    private static int method34915(final Class7492 class7492, final int n) {
        class7492.method23250().method6764().method29555(0);
        class7492.method23250().method6764().method29563(n);
        class7492.method23250().method6764().method29559(n);
        class7492.method23250().method6764().method29561(true);
        class7492.method23250().method6764().method29557(false);
        class7492.method23257(new Class2259("commands.weather.set.rain", new Object[0]), true);
        return n;
    }
    
    private static int method34916(final Class7492 class7492, final int n) {
        class7492.method23250().method6764().method29555(0);
        class7492.method23250().method6764().method29563(n);
        class7492.method23250().method6764().method29559(n);
        class7492.method23250().method6764().method29561(true);
        class7492.method23250().method6764().method29557(true);
        class7492.method23257(new Class2259("commands.weather.set.thunder", new Object[0]), true);
        return n;
    }
}
