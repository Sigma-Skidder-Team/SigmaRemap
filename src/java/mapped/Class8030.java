// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8030
{
    public static void method26334(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("seed").requires(class7492 -> class7492.method23255().method1500() || class7492.method23210(2))).executes(commandContext -> {
            final long method6753 = ((Class7492)commandContext.getSource()).method23250().method6753();
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.seed.success", new Object[] { Class9479.method35299(new Class2260(String.valueOf(method6753)).method8467(class8768 -> {
                    class8768.method30413(Class2116.field12319).method30419(new Class9485(Class2075.field11976, String.valueOf(n)));
                    new Class9390(Class1961.field10697, new Class2259("chat.copy.click", new Object[0]));
                    final Class9390 class8769;
                    final Class8768 class8770;
                    class8770.method30420(class8769).method30421(String.valueOf(n));
                    return;
                })) }), false);
            return (int)method6753;
        }));
    }
}
