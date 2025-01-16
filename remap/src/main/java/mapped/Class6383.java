// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public final class Class6383 implements Class6382<Class6911>
{
    private static String[] field25492;
    
    public Class6911 method19058(final Class6907<Class6911> class6907, final StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        return new Class6911(class6907, new Class7572(stringReader, false).method23802(false).method23799());
    }
    
    public Class6911 method19059(final Class6907<Class6911> class6907, final PacketBuffer class6908) {
        return new Class6911(class6907, Block.field17391.method499(class6908.readVarInt()));
    }
}
