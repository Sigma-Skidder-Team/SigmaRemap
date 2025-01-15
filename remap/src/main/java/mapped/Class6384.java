// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public final class Class6384 implements Class6382<Class6912>
{
    private static String[] field25493;
    
    public Class6912 method19060(final Class6907<Class6912> class6907, final StringReader stringReader) throws CommandSyntaxException {
        stringReader.expect(' ');
        final float n = (float)stringReader.readDouble();
        stringReader.expect(' ');
        final float n2 = (float)stringReader.readDouble();
        stringReader.expect(' ');
        final float n3 = (float)stringReader.readDouble();
        stringReader.expect(' ');
        return new Class6912(n, n2, n3, (float)stringReader.readDouble());
    }
    
    public Class6912 method19061(final Class6907<Class6912> class6907, final PacketBuffer class6908) {
        return new Class6912(class6908.readFloat(), class6908.readFloat(), class6908.readFloat(), class6908.readFloat());
    }
}
