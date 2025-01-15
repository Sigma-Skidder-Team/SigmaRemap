// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6069 implements Class6068<Class44>
{
    public Class44 method18125(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(128L);
        return Class44.method277(dataInput.readDouble());
    }
    
    @Override
    public String method18120() {
        return "DOUBLE";
    }
    
    @Override
    public String method18121() {
        return "TAG_Double";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
