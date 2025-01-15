// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9519
{
    public static void method35534(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralArgumentBuilder literalArgumentBuilder = (LiteralArgumentBuilder)Class7788.method25001("gamemode").requires(class102 -> class102.method23210(2));
        for (final Class101 class101 : Class101.values()) {
            if (class101 != Class101.field297) {
                literalArgumentBuilder.then(((LiteralArgumentBuilder)Class7788.method25001(class101.method586()).executes(commandContext -> method35536((CommandContext<Class7492>)commandContext, Collections.singleton(((Class7492)commandContext.getSource()).method23253()), class101))).then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method35536((CommandContext<Class7492>)commandContext, Class6886.method21152((CommandContext<Class7492>)commandContext, "target"), class101))));
            }
        }
        commandDispatcher.register(literalArgumentBuilder);
    }
    
    private static void method35535(final Class7492 class7492, final Class513 class7493, final Class101 class7494) {
        final Class2259 class7495 = new Class2259("gameMode." + class7494.method586(), new Object[0]);
        if (class7492.method23251() != class7493) {
            if (class7492.method23250().method6765().method31216(Class8878.field37328)) {
                class7493.method1494(new Class2259("gameMode.changed", new Object[] { class7495 }));
            }
            class7492.method23257(new Class2259("commands.gamemode.success.other", new Object[] { class7493.method1871(), class7495 }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.gamemode.success.self", new Object[] { class7495 }), true);
        }
    }
    
    private static int method35536(final CommandContext<Class7492> commandContext, final Collection<Class513> collection, final Class101 class101) {
        int n = 0;
        for (final Class513 class102 : collection) {
            if (class102.field3041.method26482() == class101) {
                continue;
            }
            class102.method2883(class101);
            method35535((Class7492)commandContext.getSource(), class102, class101);
            ++n;
        }
        return n;
    }
}
