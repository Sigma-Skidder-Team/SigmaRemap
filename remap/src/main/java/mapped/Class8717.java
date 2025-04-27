// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8717 implements ArgumentType<String>
{
    private static final Collection<String> field36626;
    private static final DynamicCommandExceptionType field36627;
    private static final DynamicCommandExceptionType field36628;
    public static final DynamicCommandExceptionType field36629;
    
    public static Class8717 method29933() {
        return new Class8717();
    }
    
    public static Class9290 method29934(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final String s2 = (String)commandContext.getArgument(s, (Class)String.class);
        final Class9290 method19632 = commandContext.getSource().method23255().method1579().method19632(s2);
        if (method19632 != null) {
            return method19632;
        }
        throw Class8717.field36627.create(s2);
    }
    
    public static Class9290 method29935(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final Class9290 method29934 = method29934(commandContext, s);
        if (!method29934.method34313().method35140()) {
            return method29934;
        }
        throw Class8717.field36628.create(method29934.method34312());
    }
    
    public String parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        if (unquotedString.length() <= 16) {
            return unquotedString;
        }
        throw Class8717.field36629.create(16);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof Class7492) {
            return Class7491.method23226(((Class7492)commandContext.getSource()).method23255().method1579().method19639(), suggestionsBuilder);
        }
        if (!(commandContext.getSource() instanceof Class7491)) {
            return Suggestions.empty();
        }
        return ((Class7491)commandContext.getSource()).method23211((CommandContext<Class7491>)commandContext, suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class8717.field36626;
    }
    
    static {
        field36626 = Arrays.asList("foo", "*", "012");
        field36627 = new DynamicCommandExceptionType(o -> {
            new Class2259("arguments.objective.notFound", o);
            return;
        });
        field36628 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("arguments.objective.readonly", o3);
            return;
        });
        field36629 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("commands.scoreboard.objectives.add.longName", o5);
            return;
        });
    }
}
