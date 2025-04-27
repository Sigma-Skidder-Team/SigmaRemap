// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8920
{
    private static final SimpleCommandExceptionType field37504;
    private static final SimpleCommandExceptionType field37505;
    
    public static void method31446(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("pardon-ip").requires(class7492 -> class7492.method23255().method1537().method20592().method26203() && class7492.method23210(3))).then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23228(commandContext.getSource().method23255().method1537().method20592().method26210(), suggestionsBuilder)).executes(commandContext -> method31447(commandContext.getSource(), StringArgumentType.getString(commandContext, "target")))));
    }
    
    private static int method31447(final Class7492 class7492, final String input) throws CommandSyntaxException {
        if (!Class6519.field25943.matcher(input).matches()) {
            throw Class8920.field37504.create();
        }
        final Class8009 method20592 = class7492.method23255().method1537().method20592();
        if (method20592.method26223(input)) {
            method20592.method26208(input);
            class7492.method23257(new Class2259("commands.pardonip.success", input), true);
            return 1;
        }
        throw Class8920.field37505.create();
    }
    
    static {
        field37504 = new SimpleCommandExceptionType(new Class2259("commands.pardonip.invalid", new Object[0]));
        field37505 = new SimpleCommandExceptionType(new Class2259("commands.pardonip.failed", new Object[0]));
    }
}
