// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6076 implements Class6068<Class48>
{
    public Class48 method18131(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(80L);
        return Class48.method286(dataInput.readShort());
    }
    
    @Override
    public String method18120() {
        return "SHORT";
    }
    
    @Override
    public String method18121() {
        return "TAG_Short";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
