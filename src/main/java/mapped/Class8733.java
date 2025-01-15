// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class8733
{
    private static String[] field36683;
    public Class8797 field36684;
    public int field36685;
    public int field36686;
    public Float field36687;
    public Float field36688;
    public int field36689;
    public Class8733 field36690;
    public Class2049 field36691;
    public Class2234 field36692;
    public Set<Long> field36693;
    public Set<Long> field36694;
    public Set<Long> field36695;
    
    public Class8733(final Class8797 field36684, final int field36685, final Float field36686) {
        this.field36686 = 0;
        this.field36688 = 0.0f;
        this.field36689 = 1;
        this.field36691 = Class2049.field11676;
        this.field36692 = Class2234.field13720;
        this.field36693 = new HashSet<Long>();
        this.field36694 = new HashSet<Long>();
        this.field36695 = new HashSet<Long>();
        this.field36684 = field36684;
        this.field36685 = field36685;
        this.field36687 = field36686;
    }
    
    public Class8733(final Class8797 field36684) {
        this.field36686 = 0;
        this.field36688 = 0.0f;
        this.field36689 = 1;
        this.field36691 = Class2049.field11676;
        this.field36692 = Class2234.field13720;
        this.field36693 = new HashSet<Long>();
        this.field36694 = new HashSet<Long>();
        this.field36695 = new HashSet<Long>();
        this.field36684 = field36684;
    }
    
    public Class8733(final Class8797 field36684, final int n) {
        this.field36686 = 0;
        this.field36688 = 0.0f;
        this.field36689 = 1;
        this.field36691 = Class2049.field11676;
        this.field36692 = Class2234.field13720;
        this.field36693 = new HashSet<Long>();
        this.field36694 = new HashSet<Long>();
        this.field36695 = new HashSet<Long>();
        this.field36684 = field36684;
        this.field36689 += n;
    }
    
    public Class8733(final Class8797 field36684, final int n, final Class2049 field36685) {
        this.field36686 = 0;
        this.field36688 = 0.0f;
        this.field36689 = 1;
        this.field36691 = Class2049.field11676;
        this.field36692 = Class2234.field13720;
        this.field36693 = new HashSet<Long>();
        this.field36694 = new HashSet<Long>();
        this.field36695 = new HashSet<Long>();
        this.field36684 = field36684;
        this.field36689 += n;
        this.field36691 = field36685;
    }
    
    public Class8733(final Class8797 field36684, final int n, final Class2049 field36685, final Class2234 field36686) {
        this.field36686 = 0;
        this.field36688 = 0.0f;
        this.field36689 = 1;
        this.field36691 = Class2049.field11676;
        this.field36692 = Class2234.field13720;
        this.field36693 = new HashSet<Long>();
        this.field36694 = new HashSet<Long>();
        this.field36695 = new HashSet<Long>();
        this.field36684 = field36684;
        this.field36689 += n;
        this.field36691 = field36685;
        this.field36692 = field36686;
    }
    
    public Class8733 method30168(final Class8797 class8797, final boolean b) {
        final long method1132 = class8797.method30692().method1132();
        if (b) {
            final long method1133 = class8797.method30692().method1137().method1132();
            this.field36694.add(method1133);
            this.field36693.add(method1133);
            this.field36695.remove(method1133);
        }
        this.field36694.add(method1132);
        this.field36693.add(method1132);
        this.field36695.remove(method1132);
        return this;
    }
    
    public Class8733 method30169(final Class8797 class8797) {
        final long method1132 = class8797.method30692().method1132();
        this.field36694.remove(method1132);
        this.field36695.add(method1132);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class8733 class8733 = (Class8733)o;
            return this.field36684.method30683() == class8733.field36684.method30683() && this.field36684.method30684() == class8733.field36684.method30684() && this.field36684.method30685() == class8733.field36684.method30685();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (int)((long)this.field36684.method30683() ^ (long)this.field36684.method30683() >>> 32) + (int)((long)this.field36684.method30684() ^ (long)this.field36684.method30684() >>> 32)) + (int)((long)this.field36684.method30685() ^ (long)this.field36684.method30685() >>> 32);
    }
}
