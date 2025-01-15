// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.UUID;
import java.util.Map;

public class Class571 extends Class565
{
    private static final Class1932 field3399;
    private final Class869 field3400;
    private final Map<UUID, Class6881> field3401;
    
    public Class571(final Class869 field3400) {
        this.field3401 = Maps.newLinkedHashMap();
        this.field3400 = field3400;
    }
    
    public void method3330() {
        if (!this.field3401.isEmpty()) {
            final int method7696 = this.field3400.method5332().method7696();
            int n = 12;
            for (final Class6881 class6881 : this.field3401.values()) {
                final int n2 = method7696 / 2 - 91;
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                this.field3400.method5290().method5849(Class571.field3399);
                this.method3331(n2, n, class6881);
                final String method7697 = class6881.method21076().getFormattedText();
                this.field3400.field4643.method6609(method7697, (float)(method7696 / 2 - this.field3400.field4643.method6617(method7697) / 2), (float)(n - 9), 16777215);
                n += 19;
                if (n < this.field3400.method5332().method7697() / 3) {
                    continue;
                }
                break;
            }
        }
    }
    
    private void method3331(final int n, final int n2, final Class6880 class6880) {
        this.method3186(n, n2, 0, class6880.method21078().ordinal() * 5 * 2, 182, 5);
        if (class6880.method21079() != Class342.field2105) {
            this.method3186(n, n2, 0, 80 + (class6880.method21079().ordinal() - 1) * 5 * 2, 182, 5);
        }
        final int n3 = (int)(class6880.method21077() * 183.0f);
        if (n3 > 0) {
            this.method3186(n, n2, 0, class6880.method21078().ordinal() * 5 * 2 + 5, n3, 5);
            if (class6880.method21079() != Class342.field2105) {
                this.method3186(n, n2, 0, 80 + (class6880.method21079().ordinal() - 1) * 5 * 2 + 5, n3, 5);
            }
        }
    }
    
    public void method3332(final Class4301 class4301) {
        if (class4301.method12932() != Class1994.field11169) {
            if (class4301.method12932() != Class1994.field11170) {
                if (this.field3401.get(class4301.method12931()) != null) {
                    this.field3401.get(class4301.method12931()).method21083(class4301);
                }
            }
            else {
                this.field3401.remove(class4301.method12931());
            }
        }
        else {
            this.field3401.put(class4301.method12931(), new Class6881(class4301));
        }
    }
    
    public void method3333() {
        this.field3401.clear();
    }
    
    public boolean method3334() {
        if (!this.field3401.isEmpty()) {
            final Iterator<Class6881> iterator = this.field3401.values().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method21081()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public boolean method3335() {
        if (!this.field3401.isEmpty()) {
            final Iterator<Class6881> iterator = this.field3401.values().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method21080()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public boolean method3336() {
        if (!this.field3401.isEmpty()) {
            final Iterator<Class6881> iterator = this.field3401.values().iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().method21082()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    static {
        field3399 = new Class1932("textures/gui/bars.png");
    }
}
