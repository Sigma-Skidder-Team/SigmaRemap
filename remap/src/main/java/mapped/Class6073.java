// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.Maps;
import java.io.DataInput;

public final class Class6073 implements Class6068<Class51>
{
    public Class51 method18128(final DataInput dataInput, final int n, final Class7553 class7553) throws IOException {
        class7553.method23718(384L);
        if (n <= 512) {
            final HashMap hashMap = Maps.newHashMap();
            byte method342;
            while ((method342 = Class51.method342(dataInput, class7553)) != 0) {
                final String method343 = Class51.method343(dataInput, class7553);
                class7553.method23718(224 + 16 * method343.length());
                if (hashMap.put(method343, Class51.method344(Class7638.method24059(method342), method343, dataInput, n + 1, class7553)) == null) {
                    continue;
                }
                class7553.method23718(288L);
            }
            return new Class51(hashMap, null);
        }
        throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
    }
    
    @Override
    public String method18120() {
        return "COMPOUND";
    }
    
    @Override
    public String method18121() {
        return "TAG_Compound";
    }
}
