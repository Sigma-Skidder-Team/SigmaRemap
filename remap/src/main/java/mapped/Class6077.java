// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6077 implements Class6068<Class46>
{
    public Class46 method18132(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(96L);
        return Class46.method281(dataInput.readFloat());
    }
    
    @Override
    public String method18120() {
        return "FLOAT";
    }
    
    @Override
    public String method18121() {
        return "TAG_Float";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
