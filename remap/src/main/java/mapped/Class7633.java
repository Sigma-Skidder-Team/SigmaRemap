// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class7633
{
    public static void method23988(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("time").requires(class7492 -> class7492.method23210(2))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("set").then(Class7788.method25001("day").executes(commandContext -> method23991((Class7492)commandContext.getSource(), 1000)))).then(Class7788.method25001("noon").executes(commandContext -> method23991((Class7492)commandContext.getSource(), 6000)))).then(Class7788.method25001("night").executes(commandContext -> method23991((Class7492)commandContext.getSource(), 13000)))).then(Class7788.method25001("midnight").executes(commandContext -> method23991((Class7492)commandContext.getSource(), 18000)))).then(Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8590.method29089()).executes(commandContext -> method23991((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "time")))))).then(Class7788.method25001("add").then(Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8590.method29089()).executes(commandContext -> method23992((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "time")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("query").then(Class7788.method25001("daytime").executes(commandContext -> method23990((Class7492)commandContext.getSource(), method23989(((Class7492)commandContext.getSource()).method23250()))))).then(Class7788.method25001("gametime").executes(commandContext -> method23990((Class7492)commandContext.getSource(), (int)(((Class7492)commandContext.getSource()).method23250().method6754() % 2147483647L))))).then(Class7788.method25001("day").executes(commandContext -> method23990((Class7492)commandContext.getSource(), (int)(((Class7492)commandContext.getSource()).method23250().method6755() / 24000L % 2147483647L))))));
    }
    
    private static int method23989(final Class1849 class1849) {
        return (int)(class1849.method6755() % 24000L);
    }
    
    private static int method23990(final Class7492 class7492, final int i) {
        class7492.method23257(new Class2259("commands.time.query", new Object[] { i }), false);
        return i;
    }
    
    public static int method23991(final Class7492 class7492, final int i) {
        final Iterator<Class1849> iterator = class7492.method23255().method1482().iterator();
        while (iterator.hasNext()) {
            iterator.next().method6756(i);
        }
        class7492.method23257(new Class2259("commands.time.set", new Object[] { i }), true);
        return method23989(class7492.method23250());
    }
    
    public static int method23992(final Class7492 class7492, final int n) {
        for (final Class1849 class7493 : class7492.method23255().method1482()) {
            class7493.method6756(class7493.method6755() + n);
        }
        final int method23989 = method23989(class7492.method23250());
        class7492.method23257(new Class2259("commands.time.set", new Object[] { method23989 }), true);
        return method23989;
    }
}
