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
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.util.math.Vec3d;

public class Class8930 implements ArgumentType<Class5346>
{
    private static final Collection<String> field37533;
    public static final SimpleCommandExceptionType field37534;
    private final boolean field37535;
    
    public Class8930(final boolean field37535) {
        this.field37535 = field37535;
    }
    
    public static Class8930 method31491() {
        return new Class8930(true);
    }
    
    public static Vec2f method31492(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final Vec3d method16504 = ((Class5346)commandContext.getArgument(s, (Class)Class5346.class)).method16504(commandContext.getSource());
        return new Vec2f((float)method16504.x, (float)method16504.z);
    }
    
    public Class5346 parse(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        if (!stringReader.canRead()) {
            throw Class8930.field37534.createWithContext(stringReader);
        }
        final Class7629 method23979 = Class7629.method23979(stringReader, this.field37535);
        if (stringReader.canRead() && stringReader.peek() == ' ') {
            stringReader.skip();
            return new Class5347(method23979, new Class7629(true, 0.0), Class7629.method23979(stringReader, this.field37535));
        }
        stringReader.setCursor(cursor);
        throw Class8930.field37534.createWithContext(stringReader);
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
            return Class7491.method23225(remaining, collection, suggestionsBuilder, Class7788.method25003(this::parse));
        }
        return Suggestions.empty();
    }
    
    public Collection<String> getExamples() {
        return Class8930.field37533;
    }
    
    static {
        field37533 = Arrays.asList("0 0", "~ ~", "0.1 -0.5", "~1 ~-2");
        field37534 = new SimpleCommandExceptionType(new Class2259("argument.pos2d.incomplete", new Object[0]));
    }
}
