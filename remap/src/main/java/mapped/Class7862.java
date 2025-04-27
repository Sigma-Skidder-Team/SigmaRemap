// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.HashMap;

public class Class7862
{
    private final float field32300;
    private final float field32301;
    private final float field32302;
    private final float field32303;
    private final HashMap field32304;
    private final ArrayList field32305;
    private float field32306;
    
    public Class7862(final float field32300, final float field32301, final float field32302, final float field32303) {
        this.field32304 = new HashMap();
        this.field32305 = new ArrayList();
        this.field32300 = field32300;
        this.field32301 = field32301;
        this.field32302 = field32302;
        this.field32303 = field32303;
    }
    
    public float method25471() {
        return this.field32302;
    }
    
    public float method25472() {
        return this.field32303;
    }
    
    public float method25473() {
        return this.field32300;
    }
    
    public float method25474() {
        return this.field32301;
    }
    
    public void method25475(final Class7862 class7862) {
        if (this.method25476(this.field32300, class7862.field32300 + class7862.field32302) || this.method25476(this.field32300 + this.field32302, class7862.field32300)) {
            float field32300 = this.field32300;
            if (this.field32300 + this.field32302 == class7862.field32300) {
                field32300 = this.field32300 + this.field32302;
            }
            final float max = Math.max(this.field32301, class7862.field32301);
            final Class9527 class7863 = new Class9527(field32300, max + (Math.min(this.field32301 + this.field32303, class7862.field32301 + class7862.field32303) - max) / 2.0f, class7862);
            this.field32304.put(class7862, class7863);
            this.field32305.add(class7863);
        }
        if (this.method25476(this.field32301, class7862.field32301 + class7862.field32303) || this.method25476(this.field32301 + this.field32303, class7862.field32301)) {
            float field32301 = this.field32301;
            if (this.field32301 + this.field32303 == class7862.field32301) {
                field32301 = this.field32301 + this.field32303;
            }
            final float max2 = Math.max(this.field32300, class7862.field32300);
            final Class9527 class7864 = new Class9527(max2 + (Math.min(this.field32300 + this.field32302, class7862.field32300 + class7862.field32302) - max2) / 2.0f, field32301, class7862);
            this.field32304.put(class7862, class7864);
            this.field32305.add(class7864);
        }
    }
    
    private boolean method25476(final float n, final float n2) {
        return n == n2;
    }
    
    public boolean method25477(final Class7862 class7862) {
        if (this.method25476(this.field32300, class7862.field32300 + class7862.field32302) || this.method25476(this.field32300 + this.field32302, class7862.field32300)) {
            if (this.field32301 >= class7862.field32301 && this.field32301 <= class7862.field32301 + class7862.field32303) {
                return true;
            }
            if (this.field32301 + this.field32303 >= class7862.field32301 && this.field32301 + this.field32303 <= class7862.field32301 + class7862.field32303) {
                return true;
            }
            if (class7862.field32301 >= this.field32301 && class7862.field32301 <= this.field32301 + this.field32303) {
                return true;
            }
            if (class7862.field32301 + class7862.field32303 >= this.field32301) {
                if (class7862.field32301 + class7862.field32303 <= this.field32301 + this.field32303) {
                    return true;
                }
            }
        }
        if (this.method25476(this.field32301, class7862.field32301 + class7862.field32303) || this.method25476(this.field32301 + this.field32303, class7862.field32301)) {
            if (this.field32300 >= class7862.field32300 && this.field32300 <= class7862.field32300 + class7862.field32302) {
                return true;
            }
            if (this.field32300 + this.field32302 >= class7862.field32300 && this.field32300 + this.field32302 <= class7862.field32300 + class7862.field32302) {
                return true;
            }
            if (class7862.field32300 >= this.field32300 && class7862.field32300 <= this.field32300 + this.field32302) {
                return true;
            }
            if (class7862.field32300 + class7862.field32302 >= this.field32300) {
                return class7862.field32300 + class7862.field32302 <= this.field32300 + this.field32302;
            }
        }
        return false;
    }
    
    public Class7862 method25478(final Class7862 class7862) {
        final float min = Math.min(this.field32300, class7862.field32300);
        final float min2 = Math.min(this.field32301, class7862.field32301);
        float field32302 = this.field32302 + class7862.field32302;
        float field32303 = this.field32303 + class7862.field32303;
        if (this.field32300 != class7862.field32300) {
            field32303 = this.field32303;
        }
        else {
            field32302 = this.field32302;
        }
        return new Class7862(min, min2, field32302, field32303);
    }
    
    public boolean method25479(final Class7862 class7862) {
        return this.method25477(class7862) && ((this.field32300 == class7862.field32300 && this.field32302 == class7862.field32302) || (this.field32301 == class7862.field32301 && this.field32303 == class7862.field32303));
    }
    
    public int method25480() {
        return this.field32305.size();
    }
    
    public Class9527 method25481(final int index) {
        return this.field32305.get(index);
    }
    
    public boolean method25482(final float n, final float n2) {
        if (n >= this.field32300) {
            if (n < this.field32300 + this.field32302) {
                if (n2 >= this.field32301) {
                    return n2 < this.field32301 + this.field32303;
                }
            }
        }
        return false;
    }
    
    public void method25483(final Class7862 class7862, final float n, final float n2, final float field32306) {
        if (field32306 >= this.field32306) {
            return;
        }
        this.field32306 = field32306;
        if (class7862 != this) {
            for (int i = 0; i < this.method25480(); ++i) {
                final Class9527 method25481 = this.method25481(i);
                method25481.method35575().method25483(class7862, method25481.method35573(), method25481.method35574(), field32306 + method25481.method35572(n, n2));
            }
        }
    }
    
    public void method25484() {
        this.field32306 = Float.MAX_VALUE;
    }
    
    public float method25485() {
        return this.field32306;
    }
    
    public boolean method25486(final Class7862 class7862, final Class7571 class7863) {
        if (class7862 == this) {
            return true;
        }
        if (this.field32304.size() != 0) {
            Class9527 class7864 = null;
            for (int i = 0; i < this.method25480(); ++i) {
                final Class9527 method25481 = this.method25481(i);
                if (class7864 == null || method25481.method35575().method25485() < class7864.method35575().method25485()) {
                    class7864 = method25481;
                }
            }
            class7863.method23793(class7864);
            return class7864.method35575().method25486(class7862, class7863);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "[Space " + this.field32300 + "," + this.field32301 + " " + this.field32302 + "," + this.field32303 + "]";
    }
}
