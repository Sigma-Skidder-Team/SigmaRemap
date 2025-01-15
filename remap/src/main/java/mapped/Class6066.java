// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class6066 implements ArgumentType<TextFormatting>
{
    private static final Collection<String> field24692;
    public static final DynamicCommandExceptionType field24693;
    
    private Class6066() {
    }
    
    public static Class6066 method18116() {
        return new Class6066();
    }
    
    public static TextFormatting method18117(final CommandContext<Class7492> commandContext, final String s) {
        return (TextFormatting)commandContext.getArgument(s, (Class) TextFormatting.class);
    }
    
    public TextFormatting parse(final StringReader stringReader) throws CommandSyntaxException {
        final String unquotedString = stringReader.readUnquotedString();
        final TextFormatting method8260 = TextFormatting.getValueByName(unquotedString);
        if (method8260 != null && !method8260.isFancyStyling()) {
            return method8260;
        }
        throw Class6066.field24693.create((Object)unquotedString);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23226(TextFormatting.getValidValues(true, false), suggestionsBuilder);
    }
    
    public Collection<String> getExamples() {
        return Class6066.field24692;
    }
    
    static {
        field24692 = Arrays.asList("red", "green");
        field24693 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.color.invalid", new Object[] { o });
            return;
        });
    }
}
