// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.Set;
import java.util.Comparator;

public class Class7498
{
    private static String[] field28947;
    private static Comparator<Class9260> field28948;
    private final int field28949;
    private final Set<Class9260> field28950;
    private final List<Class6875> field28951;
    private int field28952;
    private int field28953;
    private final int field28954;
    private final int field28955;
    
    public Class7498(final int field28954, final int field28955, final int field28956) {
        this.field28950 = Sets.newHashSetWithExpectedSize(256);
        this.field28951 = Lists.newArrayListWithCapacity(256);
        this.field28949 = field28956;
        this.field28954 = field28954;
        this.field28955 = field28955;
    }
    
    public int method23339() {
        return this.field28952;
    }
    
    public int method23340() {
        return this.field28953;
    }
    
    public void method23341(final Class9336 class9336) {
        this.field28950.add(new Class9260(class9336, this.field28949));
    }
    
    public void method23342() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.field28950);
        arrayList.sort(Class7498.field28948);
        for (final Class9260 class9260 : arrayList) {
            if (this.method23345(class9260)) {
                continue;
            }
            throw new Class2361(class9260.field39720, (Collection<Class9336>)arrayList.stream().map(class9261 -> class9261.field39720).collect(ImmutableList.toImmutableList()), this.field28952, this.field28953, this.field28954, this.field28955);
        }
        this.field28952 = MathHelper.method35679(this.field28952);
        this.field28953 = MathHelper.method35679(this.field28953);
    }
    
    public void method23343(final Class9040 class9040) {
        final Iterator<Class6875> iterator = this.field28951.iterator();
        while (iterator.hasNext()) {
            iterator.next().method21043(class9042 -> class9041.method32503(class9042.method21039().field39720, this.field28952, this.field28953, class9042.method21040(), class9042.method21041()));
        }
    }
    
    private static int method23344(final int n, final int n2) {
        return (n >> n2) + (((n & (1 << n2) - 1) != 0x0) ? 1 : 0) << n2;
    }
    
    private boolean method23345(final Class9260 class9260) {
        final Iterator<Class6875> iterator = this.field28951.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().method21042(class9260)) {
                continue;
            }
            return true;
        }
        return this.method23346(class9260);
    }
    
    private boolean method23346(final Class9260 class9260) {
        MathHelper.method35679(this.field28952);
        MathHelper.method35679(this.field28953);
        final int method35679 = MathHelper.method35679(this.field28952 + class9260.field39721);
        final int method35680 = MathHelper.method35679(this.field28953 + class9260.field39722);
        final boolean b = method35679 <= this.field28954;
        final boolean b2 = method35680 <= this.field28955;
        if (!b && !b2) {
            return false;
        }
        final int method35681 = Class8500.method28405(this.field28953);
        int n = (b && method35679 <= 2 * method35681) ? 1 : 0;
        if (this.field28952 == 0) {
            if (this.field28953 == 0) {
                n = 1;
            }
        }
        Class6875 class9261;
        if (n == 0) {
            class9261 = new Class6875(0, this.field28953, this.field28952, class9260.field39722);
            this.field28953 += class9260.field39722;
        }
        else {
            if (this.field28953 == 0) {
                this.field28953 = class9260.field39722;
            }
            class9261 = new Class6875(this.field28952, 0, class9260.field39721, this.field28953);
            this.field28952 += class9260.field39721;
        }
        class9261.method21042(class9260);
        this.field28951.add(class9261);
        return true;
    }
    
    static {
        Class7498.field28948 = Comparator.comparing(class9260 -> -class9260.field39722);
        Class7498.field28948 = Class7498.field28948.thenComparing(class9261 -> -class9261.field39721).thenComparing(class9262 -> class9262.field39720.method34591());
    }
}
