// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class6422 extends Class6404
{
    private static String[] field25523;
    private final Class6404 field25531;
    
    public Class6422() {
        this.field25531 = new Class6404();
    }
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class3821 class5493 = (Class3821)class5492.method27622();
        final BlockPos method1149 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final Class1847 method1150 = class5491.method16763();
        if (!class5493.method11755(null, method1150, method1149, null)) {
            return this.field25531.method19090(class5491, class5492);
        }
        class5493.method11753(method1150, class5492, method1149);
        return new Class8321(Class7739.field31349);
    }
}
