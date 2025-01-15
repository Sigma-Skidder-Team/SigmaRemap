// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataInput;

public final class Class6079 implements Class6068<Class53>
{
    public Class53 method18134(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(192L);
        final int int1 = dataInput.readInt();
        class7553.method23718(32L * int1);
        final int[] array = new int[int1];
        for (int i = 0; i < int1; ++i) {
            array[i] = dataInput.readInt();
        }
        return new Class53(array);
    }
    
    @Override
    public String method18120() {
        return "INT[]";
    }
    
    @Override
    public String method18121() {
        return "TAG_Int_Array";
    }
}
