// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class9514
{
    private static final SimpleCommandExceptionType field40936;
    private static final DynamicCommandExceptionType field40937;
    private static final SuggestionProvider<Class7492> field40938;
    
    public static void method35487(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("schedule").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("function").then(Class7788.method25002("function", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9179.method33537()).suggests((SuggestionProvider)Class8641.field36242).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8590.method29089()).executes(commandContext -> method35488((Class7492)commandContext.getSource(), Class9179.method33541((CommandContext<Class7492>)commandContext, "function"), IntegerArgumentType.getInteger(commandContext, "time"), true))).then(Class7788.method25001("append").executes(commandContext -> method35488((Class7492)commandContext.getSource(), Class9179.method33541((CommandContext<Class7492>)commandContext, "function"), IntegerArgumentType.getInteger(commandContext, "time"), false)))).then(Class7788.method25001("replace").executes(commandContext -> method35488((Class7492)commandContext.getSource(), Class9179.method33541((CommandContext<Class7492>)commandContext, "function"), IntegerArgumentType.getInteger(commandContext, "time"), true))))))).then(Class7788.method25001("clear").then(Class7788.method25002("function", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.greedyString()).suggests((SuggestionProvider)Class9514.field40938).executes(commandContext -> method35489((Class7492)commandContext.getSource(), StringArgumentType.getString(commandContext, "function"))))));
    }
    
    private static int method35488(final Class7492 class7492, final Either<Class8263, Class7909<Class8263>> either, final int n, final boolean b) throws CommandSyntaxException {
        if (n != 0) {
            final long x = class7492.method23250().method6754() + n;
            class7492.method23250().method6764().method29601();
            either.ifLeft(class7495 -> {
                class7495.method27443();
                final Class1932 class7496;
                class7496.toString();
                final String s;
                if (!(!b2)) {
                    class7493.method25414(s);
                }
                class7493.method25413(s, l, new Class8184(class7496));
                new Class2259("commands.schedule.created.function", new Object[] { class7496, i, l });
                final Class2259 class7497;
                class7494.method23257(class7497, true);
                return;
            }).ifRight(class7500 -> {
                class7500.method25621();
                final Class1932 class7501;
                new StringBuilder().append("#").append(class7501.toString()).toString();
                final String s2;
                if (!(!b3)) {
                    class7498.method25414(s2);
                }
                class7498.method25413(s2, j, new Class8182(class7501));
                new Class2259("commands.schedule.created.tag", new Object[] { class7501, k, j });
                final Class2259 class7502;
                class7499.method23257(class7502, true);
                return;
            });
            return (int)Math.floorMod(x, 2147483647L);
        }
        throw Class9514.field40936.create();
    }
    
    private static int method35489(final Class7492 class7492, final String s) throws CommandSyntaxException {
        final int method25414 = class7492.method23250().method6764().method29601().method25414(s);
        if (method25414 != 0) {
            class7492.method23257(new Class2259("commands.schedule.cleared.success", new Object[] { method25414, s }), true);
            return method25414;
        }
        throw Class9514.field40937.create((Object)s);
    }
    
    static {
        field40936 = new SimpleCommandExceptionType((Message)new Class2259("commands.schedule.same_tick", new Object[0]));
        field40937 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.schedule.cleared.failure", new Object[] { o });
            return;
        });
        field40938 = ((commandContext, suggestionsBuilder) -> Class7491.method23226(((Class7492)commandContext.getSource()).method23250().method6764().method29601().method25415(), suggestionsBuilder));
    }
}
