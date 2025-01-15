// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class141 extends Class126
{
    private static final Logger field420;
    private final List<Class6257> field421;
    
    private Class141(final Class122[] array, final Collection<Class6257> collection) {
        super(array);
        this.field421 = (List<Class6257>)ImmutableList.copyOf((Collection)collection);
    }
    
    @Override
    public Class8321 method639(Class8321 class8321, final Class7529 class8322) {
        final Random method23586 = class8322.method23586();
        Class6257 class8323;
        if (!this.field421.isEmpty()) {
            class8323 = this.field421.get(method23586.nextInt(this.field421.size()));
        }
        else {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Class6257 class8324 : Class90.field209) {
                if (class8321.method27622() != Class7739.field31370 && !class8324.method18600(class8321)) {
                    continue;
                }
                arrayList.add(class8324);
            }
            if (arrayList.isEmpty()) {
                Class141.field420.warn("Couldn't find a compatible enchantment for {}", (Object)class8321);
                return class8321;
            }
            class8323 = (Class6257)arrayList.get(method23586.nextInt(arrayList.size()));
        }
        final int method23587 = Class9546.method35658(method23586, class8323.method18593(), class8323.method18588());
        if (class8321.method27622() != Class7739.field31370) {
            class8321.method27674(class8323, method23587);
        }
        else {
            class8321 = new Class8321(Class7739.field31534);
            Class4034.method12226(class8321, new Class6827(class8323, method23587));
        }
        return class8321;
    }
    
    public static Class4943<?> method690() {
        return Class126.method640(array -> new Class141(array, (Collection<Class6257>)ImmutableList.of()));
    }
    
    static {
        field420 = LogManager.getLogger();
    }
}
