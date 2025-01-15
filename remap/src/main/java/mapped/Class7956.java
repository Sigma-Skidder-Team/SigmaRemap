// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Random;

public class Class7956 implements Class7954
{
    private static String[] field32686;
    private final Class3820 field32687;
    private final int field32688;
    private final int field32689;
    private final int field32690;
    
    public Class7956(final Class3820 class3820, final int n) {
        this(class3820, n, 12, 1);
    }
    
    public Class7956(final Class3820 field32687, final int field32688, final int field32689, final int field32690) {
        this.field32687 = field32687;
        this.field32688 = field32688;
        this.field32689 = field32689;
        this.field32690 = field32690;
    }
    
    @Override
    public Class9017 method25804(final Class399 class399, final Random random) {
        final Class8321 class400 = new Class8321(Class7739.field31514, this.field32688);
        Class8321 method12255 = new Class8321(this.field32687);
        if (this.field32687 instanceof Class4054) {
            final ArrayList arrayList = Lists.newArrayList();
            arrayList.add(method25806(random));
            if (random.nextFloat() > 0.7f) {
                arrayList.add(method25806(random));
            }
            if (random.nextFloat() > 0.8f) {
                arrayList.add(method25806(random));
            }
            method12255 = Class4053.method12255(method12255, arrayList);
        }
        return new Class9017(class400, method12255, this.field32689, this.field32690, 0.2f);
    }
    
    private static Class3829 method25806(final Random random) {
        return Class3829.method11768(Class181.method819(random.nextInt(16)));
    }
}
