// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8695 implements ArgumentType<Class6319>
{
    private static final Collection<String> field36539;
    
    public static Class8695 method29806() {
        return new Class8695();
    }
    
    public static Class2250 method29807(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class6319)commandContext.getArgument(s, (Class)Class6319.class)).method18705((Class7492)commandContext.getSource(), ((Class7492)commandContext.getSource()).method23210(2));
    }
    
    public Class6319 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Class6319.method18706(stringReader, true);
    }
    
    public Collection<String> getExamples() {
        return Class8695.field36539;
    }
    
    static {
        field36539 = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
    }
}
