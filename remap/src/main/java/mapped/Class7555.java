// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Arrays;
import java.util.Collections;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.util.math.Vec3d;

public class Class7555 implements ArgumentType<Class5346>
{
    private static final Collection<String> field29959;
    public static final SimpleCommandExceptionType field29960;
    public static final SimpleCommandExceptionType field29961;
    private final boolean field29962;
    
    public Class7555(final boolean field29962) {
        this.field29962 = field29962;
    }
    
    public static Class7555 method23719() {
        return new Class7555(true);
    }
    
    public static Class7555 method23720(final boolean b) {
        return new Class7555(b);
    }
    
    public static Vec3d method23721(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class5346)commandContext.getArgument(s, (Class)Class5346.class)).method16504(commandContext.getSource());
    }
    
    public static Class5346 method23722(final CommandContext<Class7492> commandContext, final String s) {
        return (Class5346)commandContext.getArgument(s, (Class)Class5346.class);
    }
    
    public Class5346 parse(final StringReader stringReader) throws CommandSyntaxException {
        return (stringReader.canRead() && stringReader.peek() == '^') ? Class5348.method16513(stringReader) : Class5347.method16511(stringReader, this.field29962);
    }
    
    public <S> CompletableFuture<Suggestions> listSuggestions(final CommandContext<S> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (commandContext.getSource() instanceof Class7491) {
            final String remaining = suggestionsBuilder.getRemaining();
            Collection<Class8762> collection;
            if (!remaining.isEmpty() && remaining.charAt(0) == '^') {
                collection = Collections.singleton(Class8762.field36787);
            }
            else {
                collection = ((Class7491)commandContext.getSource()).method23215();
            }
            return Class7491.method23224(remaining, collection, suggestionsBuilder, Class7788.method25003(this::parse));
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class7555.field29959;
    }
    
    static {
        field29959 = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
        field29960 = new SimpleCommandExceptionType(new Class2259("argument.pos3d.incomplete", new Object[0]));
        field29961 = new SimpleCommandExceptionType(new Class2259("argument.pos.mixed", new Object[0]));
    }
}
