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

public class Class9136 implements ArgumentType<Class41>
{
    private static final Collection<String> field38712;
    
    private Class9136() {
    }
    
    public static Class9136 method33309() {
        return new Class9136();
    }
    
    public static <S> Class41 method33310(final CommandContext<S> commandContext, final String s) {
        return (Class41)commandContext.getArgument(s, (Class)Class41.class);
    }
    
    public Class41 parse(final StringReader stringReader) throws CommandSyntaxException {
        return new Class5704(stringReader).method16943();
    }
    
    public Collection<String> getExamples() {
        return Class9136.field38712;
    }
    
    static {
        field38712 = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
    }
}
