// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class3736 implements Class3746
{
    private final String field17135;
    public long field17136;
    public long field17137;
    public long field17138;
    public Class3746 field17139;
    public final List<Class3746> field17140;
    
    public Class3736(final String field17135) {
        this.field17135 = field17135;
        this.field17140 = new ArrayList<Class3746>(4);
    }
    
    public void method11490(final Class3746 field17139, final long field17140, final long field17141, final long field17142) {
        this.field17136 = field17140;
        this.field17137 = field17141;
        this.field17139 = field17139;
        this.field17138 = field17142;
    }
    
    public long method11491(final Class9131 class9131) throws IOException {
        return this.field17138 + this.field17136 - class9131.method33145();
    }
    
    public void method11381(final Class9131 class9131) throws IOException {
    }
    
    @Override
    public long method11492() {
        return this.field17137;
    }
    
    @Override
    public long method11493() {
        return this.field17136;
    }
    
    @Override
    public long method11494() {
        return this.field17138;
    }
    
    @Override
    public Class3746 method11495() {
        return this.field17139;
    }
    
    @Override
    public String method11496() {
        return this.field17135;
    }
    
    @Override
    public String toString() {
        return this.field17135 + " [" + Class4144.method12380(this.field17137) + "]";
    }
    
    @Override
    public boolean method11497() {
        return this.field17140.size() > 0;
    }
    
    @Override
    public boolean method11498(final long n) {
        boolean b = false;
        final Iterator<Class3746> iterator = this.field17140.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method11492() != n) {
                continue;
            }
            b = true;
            break;
        }
        return b;
    }
    
    @Override
    public Class3746 method11499(final long n) {
        Class3746 class3746 = null;
        for (int n2 = 0; class3746 == null && n2 < this.field17140.size(); ++n2) {
            final Class3746 class3747 = this.field17140.get(n2);
            if (class3747.method11492() == n) {
                class3746 = class3747;
            }
        }
        return class3746;
    }
    
    @Override
    public List<Class3746> method11500() {
        return Collections.unmodifiableList(this.field17140);
    }
    
    @Override
    public List<Class3746> method11501(final long n) {
        final ArrayList list = new ArrayList();
        for (final Class3746 class3746 : this.field17140) {
            if (class3746.method11492() != n) {
                continue;
            }
            list.add(class3746);
        }
        return list;
    }
    
    public void method11502(final Class9131 class9131) throws IOException {
        while (class9131.method33145() < this.field17138 + this.field17136) {
            this.field17140.add(Class4144.method12377(this, class9131));
        }
    }
    
    public void method11503(final Class9131 class9131, final int n) throws IOException {
        for (int i = 0; i < n; ++i) {
            this.field17140.add(Class4144.method12377(this, class9131));
        }
    }
}
