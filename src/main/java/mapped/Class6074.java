// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.io.DataInput;

public final class Class6074 implements Class6068<Class52>
{
    public Class52 method18129(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(296L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        final byte byte1 = dataInput.readByte();
        final int int1 = dataInput.readInt();
        if (byte1 == 0 && int1 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        class7553.method23718(32L * int1);
        final Class6068<?> method24059 = Class7638.method24059(byte1);
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(int1);
        for (int i = 0; i < int1; ++i) {
            arrayListWithCapacity.add(method24059.method18123(dataInput, n + 1, class7553));
        }
        return new Class52(arrayListWithCapacity, byte1, null);
    }
    
    @Override
    public String method18120() {
        return "LIST";
    }
    
    @Override
    public String method18121() {
        return "TAG_List";
    }
}
