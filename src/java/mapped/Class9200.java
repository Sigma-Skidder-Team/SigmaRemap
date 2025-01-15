// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9200
{
    public static void method33670(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("give").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(((RequiredArgumentBuilder)Class7788.method25002("item", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6767.method20638()).executes(commandContext -> method33671((Class7492)commandContext.getSource(), Class6767.method20639((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "item"), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), 1))).then(Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(1)).executes(commandContext -> method33671((Class7492)commandContext.getSource(), Class6767.method20639((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "item"), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "count")))))));
    }
    
    private static int method33671(final Class7492 class7492, final Class175 class7493, final Collection<Class513> collection, final int n) throws CommandSyntaxException {
        for (final Class513 class7494 : collection) {
            int i = n;
            while (i > 0) {
                final int min = Math.min(class7493.method771().method11708(), i);
                i -= min;
                final Class8321 method772 = class7493.method772(min, false);
                if (class7494.field3006.method2362(method772) && method772.method27620()) {
                    method772.method27691(1);
                    final Class427 method773 = class7494.method2822(method772, false);
                    if (method773 != null) {
                        method773.method2120();
                    }
                    class7494.field2391.method6706(null, class7494.method1938(), class7494.method1941(), class7494.method1945(), Class8520.field35327, Class286.field1585, 0.2f, ((class7494.method2633().nextFloat() - class7494.method2633().nextFloat()) * 0.7f + 1.0f) * 2.0f);
                    class7494.field3008.method10876();
                }
                else {
                    final Class427 method774 = class7494.method2822(method772, false);
                    if (method774 == null) {
                        continue;
                    }
                    method774.method2115();
                    method774.method2110(class7494.method1865());
                }
            }
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.give.success.single", new Object[] { n, class7493.method772(n, false).method27684(), collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.give.success.single", new Object[] { n, class7493.method772(n, false).method27684(), collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
}
