// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;

public class Class9459
{
    private static String[] field40667;
    private final ArrayList field40668;
    
    public Class9459() {
        this.field40668 = new ArrayList();
    }
    
    public Class9459(final ArrayList c) {
        (this.field40668 = new ArrayList()).addAll(c);
    }
    
    public int method35157() {
        return this.field40668.size();
    }
    
    public Class7862 method35158(final int index) {
        return this.field40668.get(index);
    }
    
    public void method35159(final Class7862 e) {
        this.field40668.add(e);
    }
    
    public Class7862 method35160(final float n, final float n2) {
        for (int i = 0; i < this.field40668.size(); ++i) {
            final Class7862 method35158 = this.method35158(i);
            if (method35158.method25482(n, n2)) {
                return method35158;
            }
        }
        return null;
    }
    
    public Class7571 method35161(final float n, final float n2, final float n3, final float n4, final boolean b) {
        final Class7862 method35160 = this.method35160(n, n2);
        final Class7862 method35161 = this.method35160(n3, n4);
        if (method35160 == null || method35161 == null) {
            return null;
        }
        for (int i = 0; i < this.field40668.size(); ++i) {
            ((Class7862)this.field40668.get(i)).method25484();
        }
        method35161.method25483(method35160, n3, n4, 0.0f);
        if (method35161.method25485() == Float.MAX_VALUE) {
            return null;
        }
        if (method35160.method25485() == Float.MAX_VALUE) {
            return null;
        }
        final Class7571 class7571 = new Class7571();
        class7571.method23793(new Class9527(n, n2, null));
        if (!method35160.method25486(method35161, class7571)) {
            return null;
        }
        class7571.method23793(new Class9527(n3, n4, null));
        if (b) {
            this.method35163(class7571);
        }
        return class7571;
    }
    
    private boolean method35162(final float n, final float n2, final float n3, final float n4, final float n5) {
        final float n6 = n3 - n;
        final float n7 = n4 - n2;
        final float n8 = (float)Math.sqrt(n6 * n6 + n7 * n7);
        final float n9 = n6 * n5 / n8;
        final float n10 = n7 * n5 / n8;
        for (int n11 = (int)(n8 / n5), i = 0; i < n11; ++i) {
            if (this.method35160(n + n9 * i, n2 + n10 * i) == null) {
                return false;
            }
        }
        return true;
    }
    
    private void method35163(final Class7571 class7571) {
        int i = 0;
        while (i < class7571.method23794() - 2) {
            if (!this.method35162(class7571.method23795(i), class7571.method23796(i), class7571.method23795(i + 2), class7571.method23796(i + 2), 0.1f)) {
                ++i;
            }
            else {
                class7571.method23797(i + 1);
            }
        }
    }
}
