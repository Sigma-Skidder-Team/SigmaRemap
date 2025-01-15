// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7418 implements ArgumentType<Class51>
{
    private static final Collection<String> field28590;
    
    private Class7418() {
    }
    
    public static Class7418 method22831() {
        return new Class7418();
    }
    
    public static <S> Class51 method22832(final CommandContext<S> commandContext, final String s) {
        return (Class51)commandContext.getArgument(s, (Class)Class51.class);
    }
    
    public Class51 parse(final StringReader stringReader) throws CommandSyntaxException {
        return new Class5704(stringReader).method16945();
    }
    
    public Collection<String> getExamples() {
        return Class7418.field28590;
    }
    
    static {
        field28590 = Arrays.asList("{}", "{foo=bar}");
    }
}
