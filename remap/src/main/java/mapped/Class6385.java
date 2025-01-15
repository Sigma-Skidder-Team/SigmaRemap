// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public final class Class6385 implements Class6382<Class6910>
{
    private static String[] field25494;
    
    public Class6910 method19062(final Class6907<Class6910> class6907, final StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        final Class7071 method21632 = new Class7071(stringReader, false).method21632();
        return new Class6910(class6907, new Class175(method21632.method21626(), method21632.method21627()).method772(1, false));
    }
    
    public Class6910 method19063(final Class6907<Class6910> class6907, final PacketBuffer class6908) {
        return new Class6910(class6907, class6908.method29511());
    }
}
