// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import java.util.function.Supplier;
import java.util.Collections;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7456 implements ArgumentType<Class8953>
{
    public static final SuggestionProvider<Class7492> field28758;
    private static final Collection<String> field28759;
    private static final SimpleCommandExceptionType field28760;
    private final boolean field28761;
    
    public Class7456(final boolean field28761) {
        this.field28761 = field28761;
    }
    
    public static String method22949(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return method22950(commandContext, s).iterator().next();
    }
    
    public static Collection<String> method22950(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return method22952(commandContext, s, Collections::emptyList);
    }
    
    public static Collection<String> method22951(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return method22952(commandContext, s, commandContext.getSource().method23255().method1579()::method19640);
    }
    
    public static Collection<String> method22952(final CommandContext<Class7492> commandContext, final String s, final Supplier<Collection<String>> supplier) throws CommandSyntaxException {
        final Collection<String> method31766 = ((Class8953)commandContext.getArgument(s, (Class)Class8953.class)).method31766(commandContext.getSource(), supplier);
        if (!method31766.isEmpty()) {
            return method31766;
        }
        throw Class6886.field27004.create();
    }
    
    public static Class7456 method22953() {
        return new Class7456(false);
    }
    
    public static Class7456 method22954() {
        return new Class7456(true);
    }
    
    public Class8953 parse(final StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '@') {
            final Class9043 method25070 = new Class7793(stringReader).method25070();
            if (!this.field28761 && method25070.method32505() > 1) {
                throw Class6886.field27001.create();
            }
            return new Class8954(method25070);
        }
        else {
            final int cursor = stringReader.getCursor();
            while (stringReader.canRead() && stringReader.peek() != ' ') {
                stringReader.skip();
            }
            final String substring = stringReader.getString().substring(cursor, stringReader.getCursor());
            if (!substring.equals("*")) {
                return (class7492, supplier) -> collection;
            }
            return (class7492, supplier) -> {
                final Collection collection = supplier.get();
                if (!collection.isEmpty()) {
                    return collection;
                }
                throw Class7456.field28760.create();
            };
        }
    }
    
    public Collection<String> getExamples() {
        return Class7456.field28759;
    }
    
    static {
        field28758 = ((commandContext, suggestionsBuilder) -> {
            final StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
            stringReader.setCursor(suggestionsBuilder.getStart());
            final Class7793 class7793 = new Class7793(stringReader);
            try {
                class7793.method25070();
            }
            catch (final CommandSyntaxException ex) {}
            return class7793.method25081(suggestionsBuilder, suggestionsBuilder2 -> Class7491.method23226(((Class7492)commandContext2.getSource()).method23205(), suggestionsBuilder2));
        });
        field28759 = Arrays.asList("Player", "0123", Class7456.\u156e\ua6ae\ub9c6\u97e7\u7074\u2db3[0], "@e");
        field28760 = new SimpleCommandExceptionType(new Class2259("argument.scoreHolder.empty", new Object[0]));
    }
}
