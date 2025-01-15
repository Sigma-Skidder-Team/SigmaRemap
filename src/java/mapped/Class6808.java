// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class Class6808 implements Class6807<Class8685>
{
    private static final Collection<String> field26747;
    
    public static Class8685 method20839(final CommandContext<Class7492> commandContext, final String s) {
        return (Class8685)commandContext.getArgument(s, (Class)Class8685.class);
    }
    
    public Class8685 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Class8685.method29757(stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class6808.field26747;
    }
    
    static {
        field26747 = Arrays.asList("0..5", "0", "-5", "-100..", "..100");
    }
}
