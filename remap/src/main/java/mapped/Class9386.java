// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashSet;

public class Class9386
{
    private final int field40277;
    private int field40278;
    private final Class8802[] field40279;
    
    public Class9386(final int field40277, final int field40278, final Class8802[] field40279) {
        this.field40277 = field40277;
        this.field40278 = field40278;
        this.field40279 = field40279;
    }
    
    public Class9386(final int field40277, final Class8802[] field40278) {
        this.field40277 = field40277;
        this.field40279 = field40278;
    }
    
    public int method34891() {
        return this.field40277;
    }
    
    public int method34892() {
        return this.field40278;
    }
    
    public Class8802[] method34893() {
        return this.field40279;
    }
    
    public boolean method34894(final int n, final int n2) {
        for (int i = 0; i < this.field40279.length; ++i) {
            if (this.field40279[i].method30712(n, n2)) {
                return true;
            }
        }
        return false;
    }
    
    public int[] method34895() {
        final HashSet set = new HashSet();
        for (int i = 0; i < this.field40279.length; ++i) {
            set.add(this.field40279[i].method30709());
        }
        return Config.method29008((Integer[])set.toArray(new Integer[set.size()]));
    }
    
    public Class8802[] method34896(final int n) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < this.field40279.length; ++i) {
            final Class8802 class8802 = this.field40279[i];
            if (class8802.method30709() == n) {
                list.add(class8802);
            }
        }
        return (Class8802[])list.toArray(new Class8802[list.size()]);
    }
    
    @Override
    public String toString() {
        return "block." + this.field40277 + ":" + this.field40278 + "=" + Config.method28888(this.field40279);
    }
}
