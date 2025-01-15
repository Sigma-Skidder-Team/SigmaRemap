// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6075 implements Class6068<Class45>
{
    public Class45 method18130(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(96L);
        return Class45.method279(dataInput.readInt());
    }
    
    @Override
    public String method18120() {
        return "INT";
    }
    
    @Override
    public String method18121() {
        return "TAG_Int";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
