// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6067 implements Class6068<Class49>
{
    public Class49 method18119(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(128L);
        return Class49.method288(dataInput.readLong());
    }
    
    @Override
    public String method18120() {
        return "LONG";
    }
    
    @Override
    public String method18121() {
        return "TAG_Long";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
