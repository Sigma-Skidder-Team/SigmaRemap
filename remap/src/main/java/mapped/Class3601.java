// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.EnumSet;
import com.google.common.collect.Lists;
import java.util.List;

public class Class3601 extends Class3446
{
    private static String[] field16769;
    private final Class776 field16770;
    private final double field16771;
    private BlockPos field16772;
    private final List<BlockPos> field16773;
    private final int field16774;
    private boolean field16775;
    
    public Class3601(final Class776 field16770, final double field16771, final int field16772) {
        this.field16773 = Lists.newArrayList();
        this.field16770 = field16770;
        this.field16771 = field16771;
        this.field16774 = field16772;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        this.method11132();
        if (this.method11129()) {
            if (this.method11130()) {
                if (this.field16770.method4152() == null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method11129() {
        return this.field16770.method4293() && !this.field16770.method4292().method30618();
    }
    
    private boolean method11130() {
        final Optional<BlockPos> method7207 = ((Class1849)this.field16770.field2391).method6921().method7207(class8912 -> class8912 == Class8912.field37476, this::method11131, Class2045.field11652, new BlockPos(this.field16770), 48, Class776.method4306(this.field16770));
        if (method7207.isPresent()) {
            this.field16772 = method7207.get().method1153();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16770.method4150().method24731()) {
            if (this.field16770.method4152() == null) {
                if (!this.field16772.method1082(this.field16770.method1934(), this.field16770.method1930() + this.field16774)) {
                    if (!this.field16775) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public void method11018() {
        if (this.field16772.method1082(this.field16770.method1934(), this.field16774)) {
            this.field16773.add(this.field16772);
        }
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16770.method2641(0);
        this.field16770.method4150().method24724(this.field16772.getX(), this.field16772.getY(), this.field16772.getZ(), this.field16771);
        this.field16775 = false;
    }
    
    @Override
    public void method11016() {
        if (this.field16770.method4150().method24731()) {
            final Class5487 class5487 = new Class5487(this.field16772);
            Class5487 class5488 = Class7775.method24906(this.field16770, 16, 7, class5487, 0.3141592741012573);
            if (class5488 == null) {
                class5488 = Class7775.method24905(this.field16770, 8, 7, class5487);
            }
            if (class5488 == null) {
                this.field16775 = true;
                return;
            }
            this.field16770.method4150().method24724(class5488.field22770, class5488.field22771, class5488.field22772, this.field16771);
        }
    }
    
    private boolean method11131(final BlockPos a) {
        final Iterator<BlockPos> iterator = this.field16773.iterator();
        while (iterator.hasNext()) {
            if (!Objects.equals(a, iterator.next())) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private void method11132() {
        if (this.field16773.size() > 2) {
            this.field16773.remove(0);
        }
    }
}
