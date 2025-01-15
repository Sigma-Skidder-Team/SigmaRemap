// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class8581
{
    private static String[] field36064;
    private ArrayList field36065;
    private int field36066;
    private float field36067;
    private int field36068;
    
    public Class8581() {
        this(10, 0.75f);
    }
    
    public Class8581(final int n) {
        this(n, 0.75f);
    }
    
    public Class8581(final int n, final float field36067) {
        this.field36065 = null;
        this.field36066 = 0;
        this.field36067 = 1.0f;
        this.field36068 = 0;
        this.field36065 = new ArrayList(n);
        this.field36066 = n;
        this.field36067 = field36067;
    }
    
    public void method29038(final int index, final Object element) {
        if (element != null) {
            ++this.field36068;
        }
        this.field36065.add(index, element);
    }
    
    public boolean method29039(final Object e) {
        if (e != null) {
            ++this.field36068;
        }
        return this.field36065.add(e);
    }
    
    public Object method29040(final int index, final Object element) {
        final Object set = this.field36065.set(index, element);
        if (element != set) {
            if (set == null) {
                ++this.field36068;
            }
            if (element == null) {
                --this.field36068;
            }
        }
        return set;
    }
    
    public Object method29041(final int index) {
        final Object remove = this.field36065.remove(index);
        if (remove != null) {
            --this.field36068;
        }
        return remove;
    }
    
    public void method29042() {
        this.field36065.clear();
        this.field36068 = 0;
    }
    
    public void method29043() {
        if (this.field36068 <= 0 && this.field36065.size() <= 0) {
            this.method29042();
        }
        else if (this.field36065.size() > this.field36066) {
            if (this.field36068 * 1.0f / this.field36065.size() <= this.field36067) {
                int index = 0;
                for (int i = 0; i < this.field36065.size(); ++i) {
                    final Object value = this.field36065.get(i);
                    if (value != null) {
                        if (i != index) {
                            this.field36065.set(index, value);
                        }
                        ++index;
                    }
                }
                for (int j = this.field36065.size() - 1; j >= index; --j) {
                    this.field36065.remove(j);
                }
            }
        }
    }
    
    public boolean method29044(final Object o) {
        return this.field36065.contains(o);
    }
    
    public Object method29045(final int index) {
        return this.field36065.get(index);
    }
    
    public boolean method29046() {
        return this.field36065.isEmpty();
    }
    
    public int method29047() {
        return this.field36065.size();
    }
    
    public int method29048() {
        return this.field36068;
    }
}
