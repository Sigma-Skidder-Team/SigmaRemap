// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6080 implements Class6068<Class39>
{
    public Class39 method18135(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(192L);
        final int int1 = dataInput.readInt();
        class7553.method23718(64L * int1);
        final long[] array = new long[int1];
        for (int i = 0; i < int1; ++i) {
            array[i] = dataInput.readLong();
        }
        return new Class39(array);
    }
    
    @Override
    public String method18120() {
        return "LONG[]";
    }
    
    @Override
    public String method18121() {
        return "TAG_Long_Array";
    }
}
