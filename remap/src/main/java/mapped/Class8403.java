// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8403
{
    public static void method28024(final CommandDispatcher<Class7492> commandDispatcher) {
        final RequiredArgumentBuilder requiredArgumentBuilder = (RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method28025(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), null, null))).then(Class7788.method25001("*").then(Class7788.method25002("sound", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8533.field35816).executes(commandContext -> method28025((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), null, Class7000.method21433((CommandContext<Class7492>)commandContext, "sound")))));
        for (final Class286 class286 : Class286.values()) {
            requiredArgumentBuilder.then(((LiteralArgumentBuilder)Class7788.method25001(class286.method935()).executes(commandContext -> method28025(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), class286, null))).then(Class7788.method25002("sound", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8533.field35816).executes(commandContext -> method28025((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), class286, Class7000.method21433((CommandContext<Class7492>)commandContext, "sound")))));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("stopsound").requires(class287 -> class287.method23210(2))).then(requiredArgumentBuilder));
    }
    
    private static int method28025(final Class7492 class7492, final Collection<Class513> collection, final Class286 class7493, final ResourceLocation class7494) {
        final Class4382 class7495 = new Class4382(class7494, class7493);
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ((Class513)iterator.next()).field3039.method17469(class7495);
        }
        if (class7493 == null) {
            if (class7494 == null) {
                class7492.method23257(new Class2259("commands.stopsound.success.sourceless.any"), true);
            }
            else {
                class7492.method23257(new Class2259("commands.stopsound.success.sourceless.sound", class7494), true);
            }
        }
        else if (class7494 == null) {
            class7492.method23257(new Class2259("commands.stopsound.success.source.any", class7493.method935()), true);
        }
        else {
            class7492.method23257(new Class2259("commands.stopsound.success.source.sound", class7494, class7493.method935()), true);
        }
        return collection.size();
    }
}
