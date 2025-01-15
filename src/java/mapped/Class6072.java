// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6072 implements Class6068<Class47>
{
    public Class47 method18127(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(72L);
        return Class47.method283(dataInput.readByte());
    }
    
    @Override
    public String method18120() {
        return "BYTE";
    }
    
    @Override
    public String method18121() {
        return "TAG_Byte";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
