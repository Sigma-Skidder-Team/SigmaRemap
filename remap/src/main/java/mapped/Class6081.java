// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6081 implements Class6068<Class40>
{
    public Class40 method18136(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(192L);
        final int int1 = dataInput.readInt();
        class7553.method23718(8L * int1);
        final byte[] array = new byte[int1];
        dataInput.readFully(array);
        return new Class40(array);
    }
    
    @Override
    public String method18120() {
        return "BYTE[]";
    }
    
    @Override
    public String method18121() {
        return "TAG_Byte_Array";
    }
}
