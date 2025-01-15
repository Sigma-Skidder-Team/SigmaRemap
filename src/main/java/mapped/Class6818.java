// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class6818 implements Class6814
{
    public final Class2309 field26766;
    
    public Class6818(final Class2309 field26766) {
        this.field26766 = field26766;
    }
    
    @Override
    public Class1753 method20856(final Class8711 class8711) throws IOException {
        final Class8712 class8712 = (Class8712)class8711;
        final Class8596 method29905 = class8712.method29905();
        final Class8904 method29906 = class8712.method29908();
        return class8712.method29910(method29905, method29906, method29906.method31365(this.field26766, !method29905.method29110().equals("GET")), method29906.method31371());
    }
}
