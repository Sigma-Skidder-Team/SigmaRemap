// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9535
{
    private final List<Class8779> field41036;
    private final Class511 field41037;
    private int field41038;
    private int field41039;
    private int field41040;
    private boolean field41041;
    private boolean field41042;
    private String field41043;
    
    public Class9535(final Class511 field41037) {
        this.field41036 = Lists.newArrayList();
        this.field41037 = field41037;
    }
    
    public void method35593() {
        this.method35600();
        if (!this.field41037.method2688()) {
            if (this.field41037.method1706()) {
                this.field41043 = "water";
            }
        }
        else {
            final Class3833 method21696 = this.field41037.field2391.method6701(new Class354(this.field41037)).method21696();
            if (method21696 != Class7521.field29307) {
                if (method21696 == Class7521.field29388) {
                    this.field41043 = "vines";
                }
            }
            else {
                this.field41043 = "ladder";
            }
        }
    }
    
    public void method35594(final Class7929 class7929, final float n, final float n2) {
        this.method35601();
        this.method35593();
        final Class8779 class7930 = new Class8779(class7929, this.field41037.field2424, n, n2, this.field41043, this.field41037.field2414);
        this.field41036.add(class7930);
        this.field41038 = this.field41037.field2424;
        this.field41042 = true;
        if (class7930.method30539()) {
            if (!this.field41041) {
                if (this.field41037.method1768()) {
                    this.field41041 = true;
                    this.field41039 = this.field41037.field2424;
                    this.field41040 = this.field41039;
                    this.field41037.method2752();
                }
            }
        }
    }
    
    public Class2250 method35595() {
        if (!this.field41036.isEmpty()) {
            final Class8779 method35597 = this.method35597();
            final Class8779 class8779 = this.field41036.get(this.field41036.size() - 1);
            final Class2250 method35598 = class8779.method30541();
            final Class399 method35599 = class8779.method30537().method25714();
            Class2250 method35602;
            if (method35597 != null && class8779.method30537() == Class7929.field32572) {
                final Class2250 method35600 = method35597.method30541();
                if (method35597.method30537() != Class7929.field32572 && method35597.method30537() != Class7929.field32574) {
                    if (method35600 != null && (method35598 == null || !method35600.equals(method35598))) {
                        final Class399 method35601 = method35597.method30537().method25714();
                        final Class8321 class8780 = (method35601 instanceof Class511) ? ((Class511)method35601).method2713() : Class8321.field34174;
                        if (!class8780.method27620() && class8780.method27667()) {
                            method35602 = new Class2259("death.fell.assist.item", new Object[] { this.field41037.method1871(), method35600, class8780.method27684() });
                        }
                        else {
                            method35602 = new Class2259("death.fell.assist", new Object[] { this.field41037.method1871(), method35600 });
                        }
                    }
                    else if (method35598 == null) {
                        method35602 = new Class2259("death.fell.killer", new Object[] { this.field41037.method1871() });
                    }
                    else {
                        final Class8321 class8781 = (method35599 instanceof Class511) ? ((Class511)method35599).method2713() : Class8321.field34174;
                        if (!class8781.method27620() && class8781.method27667()) {
                            method35602 = new Class2259("death.fell.finish.item", new Object[] { this.field41037.method1871(), method35598, class8781.method27684() });
                        }
                        else {
                            method35602 = new Class2259("death.fell.finish", new Object[] { this.field41037.method1871(), method35598 });
                        }
                    }
                }
                else {
                    method35602 = new Class2259("death.fell.accident." + this.method35598(method35597), new Object[] { this.field41037.method1871() });
                }
            }
            else {
                method35602 = class8779.method30537().method25690(this.field41037);
            }
            return method35602;
        }
        return new Class2259("death.attack.generic", new Object[] { this.field41037.method1871() });
    }
    
    @Nullable
    public Class511 method35596() {
        Class511 class511 = null;
        Class511 class512 = null;
        float method30538 = 0.0f;
        float method30539 = 0.0f;
        for (final Class8779 class513 : this.field41036) {
            if (class513.method30537().method25714() instanceof Class512) {
                if (class512 == null || class513.method30538() > method30539) {
                    method30539 = class513.method30538();
                    class512 = (Class512)class513.method30537().method25714();
                }
            }
            if (!(class513.method30537().method25714() instanceof Class511)) {
                continue;
            }
            if (class511 != null && class513.method30538() <= method30538) {
                continue;
            }
            method30538 = class513.method30538();
            class511 = (Class511)class513.method30537().method25714();
        }
        return (class512 != null && method30539 >= method30538 / 3.0f) ? class512 : class511;
    }
    
    @Nullable
    private Class8779 method35597() {
        Class8779 class8779 = null;
        Class8779 class8780 = null;
        float method30538 = 0.0f;
        float method30539 = 0.0f;
        for (int i = 0; i < this.field41036.size(); ++i) {
            final Class8779 class8781 = this.field41036.get(i);
            final Class8779 class8782 = (i <= 0) ? null : this.field41036.get(i - 1);
            if (class8781.method30537() == Class7929.field32572 || class8781.method30537() == Class7929.field32574) {
                if (class8781.method30542() > 0.0f) {
                    if (class8779 == null || class8781.method30542() > method30539) {
                        if (i <= 0) {
                            class8779 = class8781;
                        }
                        else {
                            class8779 = class8782;
                        }
                        method30539 = class8781.method30542();
                    }
                }
            }
            if (class8781.method30540() != null) {
                if (class8780 == null || class8781.method30538() > method30538) {
                    class8780 = class8781;
                    method30538 = class8781.method30538();
                }
            }
        }
        if (method30539 > 5.0f && class8779 != null) {
            return class8779;
        }
        return (method30538 > 5.0f && class8780 != null) ? class8780 : null;
    }
    
    private String method35598(final Class8779 class8779) {
        return (class8779.method30540() != null) ? class8779.method30540() : "generic";
    }
    
    public int method35599() {
        return this.field41041 ? (this.field41037.field2424 - this.field41039) : (this.field41040 - this.field41039);
    }
    
    private void method35600() {
        this.field41043 = null;
    }
    
    public void method35601() {
        final int n = this.field41041 ? 300 : 100;
        if (this.field41042) {
            if (!this.field41037.method1768() || this.field41037.field2424 - this.field41038 > n) {
                final boolean field41041 = this.field41041;
                this.field41042 = false;
                this.field41041 = false;
                this.field41040 = this.field41037.field2424;
                if (field41041) {
                    this.field41037.method2753();
                }
                this.field41036.clear();
            }
        }
    }
    
    public Class511 method35602() {
        return this.field41037;
    }
}
