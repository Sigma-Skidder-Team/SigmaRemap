// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6071 implements Class6068<Class42>
{
    public final /* synthetic */ int field24694;
    
    public Class6071(final int field24694) {
        this.field24694 = field24694;
    }
    
    public Class42 method18126(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        throw new IllegalArgumentException("Invalid tag id: " + this.field24694);
    }
    
    @Override
    public String method18120() {
        return "INVALID[" + this.field24694 + "]";
    }
    
    @Override
    public String method18121() {
        return "UNKNOWN_" + this.field24694;
    }
}
