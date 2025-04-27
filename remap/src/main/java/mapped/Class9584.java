// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9584
{
    public static void method35935(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralArgumentBuilder literalArgumentBuilder = Class7788.method25001("defaultgamemode").requires(class102 -> class102.method23210(2));
        for (final Class101 class101 : Class101.values()) {
            if (class101 != Class101.field297) {
                literalArgumentBuilder.then(Class7788.method25001(class101.method586()).executes(commandContext -> method35936(commandContext.getSource(), class101)));
            }
        }
        commandDispatcher.register(literalArgumentBuilder);
    }
    
    private static int method35936(final Class7492 class7492, final Class101 class7493) {
        int n = 0;
        final MinecraftServer method23255 = class7492.method23255();
        method23255.method1540(class7493);
        if (method23255.method1551()) {
            for (final Class513 class7494 : method23255.method1537().method20623()) {
                if (class7494.field3041.method26482() == class7493) {
                    continue;
                }
                class7494.method2883(class7493);
                ++n;
            }
        }
        class7492.method23257(new Class2259("commands.defaultgamemode.success", class7493.method587()), true);
        return n;
    }
}
