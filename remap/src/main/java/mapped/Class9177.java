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

public class Class9177
{
    private static final SimpleCommandExceptionType field38895;
    
    public static void method33532(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("deop").requires(class7492 -> class7492.method23210(3))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8740.method30191()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23228(((Class7492)commandContext.getSource()).method23255().method1537().method20604(), suggestionsBuilder)).executes(commandContext -> method33533((Class7492)commandContext.getSource(), Class8740.method30190((CommandContext<Class7492>)commandContext, "targets")))));
    }
    
    private static int method33533(final Class7492 class7492, final Collection<GameProfile> collection) throws CommandSyntaxException {
        final Class6765 method1537 = class7492.method23255().method1537();
        int n = 0;
        for (final GameProfile gameProfile : collection) {
            if (!method1537.method20597(gameProfile)) {
                continue;
            }
            method1537.method20594(gameProfile);
            ++n;
            class7492.method23257(new Class2259("commands.deop.success", new Object[] { collection.iterator().next().getName() }), true);
        }
        if (n != 0) {
            class7492.method23255().method1570(class7492);
            return n;
        }
        throw Class9177.field38895.create();
    }
    
    static {
        field38895 = new SimpleCommandExceptionType((Message)new Class2259("commands.deop.failed", new Object[0]));
    }
}
