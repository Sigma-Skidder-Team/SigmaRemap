// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8811
{
    private static final SimpleCommandExceptionType field37019;
    
    public static void method30739(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("pardon").requires(class7492 -> class7492.method23255().method1537().method20592().method26203() && class7492.method23210(3))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8740.method30191()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23228(commandContext.getSource().method23255().method1537().method20591().method26210(), suggestionsBuilder)).executes(commandContext -> method30740(commandContext.getSource(), Class8740.method30190(commandContext, "targets")))));
    }
    
    private static int method30740(final Class7492 class7492, final Collection<GameProfile> collection) throws CommandSyntaxException {
        final Class8007 method20591 = class7492.method23255().method1537().method20591();
        int n = 0;
        for (final GameProfile gameProfile : collection) {
            if (!method20591.method26219(gameProfile)) {
                continue;
            }
            method20591.method26208(gameProfile);
            ++n;
            class7492.method23257(new Class2259("commands.pardon.success", Class9479.method35295(gameProfile)), true);
        }
        if (n != 0) {
            return n;
        }
        throw Class8811.field37019.create();
    }
    
    static {
        field37019 = new SimpleCommandExceptionType(new Class2259("commands.pardon.failed", new Object[0]));
    }
}
