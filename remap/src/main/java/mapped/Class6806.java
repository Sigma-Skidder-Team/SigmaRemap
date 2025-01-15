// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import java.util.Collection;

public class Class6806 implements Class6807<Class8683>
{
    private static final Collection<String> field26746;
    
    public Class8683 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Class8683.method29739(stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class6806.field26746;
    }
    
    static {
        field26746 = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");
    }
}
