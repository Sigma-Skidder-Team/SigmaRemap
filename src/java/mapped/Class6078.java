// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6078 implements Class6068<Class50>
{
    public Class50 method18133(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(288L);
        final String utf = dataInput.readUTF();
        class7553.method23718(16 * utf.length());
        return Class50.method290(utf);
    }
    
    @Override
    public String method18120() {
        return "STRING";
    }
    
    @Override
    public String method18121() {
        return "TAG_String";
    }
    
    @Override
    public boolean method18122() {
        return true;
    }
}
