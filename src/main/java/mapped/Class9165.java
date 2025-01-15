// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9165
{
    private static final SimpleCommandExceptionType field38831;
    
    public static void method33452(final CommandDispatcher<Class7492> commandDispatcher) {
        final RequiredArgumentBuilder suggests = Class7788.method25002("sound", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8533.field35816);
        final Class286[] values = Class286.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            suggests.then((ArgumentBuilder)method33453(values[i]));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("playsound").requires(class7492 -> class7492.method23210(2))).then((ArgumentBuilder)suggests));
    }
    
    private static LiteralArgumentBuilder<Class7492> method33453(final Class286 class286) {
        return (LiteralArgumentBuilder<Class7492>)Class7788.method25001(class286.method935()).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method33454((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class7000.method21433((CommandContext<Class7492>)commandContext, "sound"), class286, ((Class7492)commandContext.getSource()).method23249(), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method33454((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class7000.method21433((CommandContext<Class7492>)commandContext, "sound"), class286, Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), 1.0f, 1.0f, 0.0f))).then(((RequiredArgumentBuilder)Class7788.method25002("volume", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f)).executes(commandContext -> method33454((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class7000.method21433((CommandContext<Class7492>)commandContext, "sound"), class286, Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), (float)commandContext.getArgument("volume", (Class)Float.class), 1.0f, 0.0f))).then(((RequiredArgumentBuilder)Class7788.method25002("pitch", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f, 2.0f)).executes(commandContext -> method33454((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class7000.method21433((CommandContext<Class7492>)commandContext, "sound"), class286, Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), (float)commandContext.getArgument("volume", (Class)Float.class), (float)commandContext.getArgument("pitch", (Class)Float.class), 0.0f))).then(Class7788.method25002("minVolume", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f, 1.0f)).executes(commandContext -> method33454((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class7000.method21433((CommandContext<Class7492>)commandContext, "sound"), class286, Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), (float)commandContext.getArgument("volume", (Class)Float.class), (float)commandContext.getArgument("pitch", (Class)Float.class), (float)commandContext.getArgument("minVolume", (Class)Float.class))))))));
    }
    
    private static int method33454(final Class7492 class7492, final Collection<Class513> collection, final Class1932 class7493, final Class286 class7494, final Class5487 class7495, final float n, final float n2, final float n3) throws CommandSyntaxException {
        final double pow = Math.pow((n <= 1.0f) ? 16.0 : ((double)(n * 16.0f)), 2.0);
        int n4 = 0;
        for (final Class513 class7496 : collection) {
            final double n5 = class7495.field22770 - class7496.method1938();
            final double n6 = class7495.field22771 - class7496.method1941();
            final double n7 = class7495.field22772 - class7496.method1945();
            final double n8 = n5 * n5 + n6 * n6 + n7 * n7;
            Class5487 class7497 = class7495;
            float n9 = n;
            if (n8 > pow) {
                if (n3 <= 0.0f) {
                    continue;
                }
                final double n10 = Class9546.method35641(n8);
                class7497 = new Class5487(class7496.method1938() + n5 / n10 * 2.0, class7496.method1941() + n6 / n10 * 2.0, class7496.method1945() + n7 / n10 * 2.0);
                n9 = n3;
            }
            class7496.field3039.method17469(new Class4342(class7493, class7494, class7497, n9, n2));
            ++n4;
        }
        if (n4 != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.playsound.success.multiple", new Object[] { class7493, collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.playsound.success.single", new Object[] { class7493, collection.iterator().next().method1871() }), true);
            }
            return n4;
        }
        throw Class9165.field38831.create();
    }
    
    static {
        field38831 = new SimpleCommandExceptionType((Message)new Class2259("commands.playsound.failed", new Object[0]));
    }
}
