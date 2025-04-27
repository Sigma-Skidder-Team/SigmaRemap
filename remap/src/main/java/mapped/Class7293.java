// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7293 implements Class7292
{
    private static String[] field28255;
    private int field28256;
    private int field28257;
    private final float field28258;
    private boolean field28259;
    
    public Class7293() {
        this.field28258 = 0.2f;
    }
    
    public Class9459 method22362(final Class7449 class7449) {
        return this.method22363(class7449, true);
    }
    
    public Class9459 method22363(final Class7449 class7449, final boolean field28259) {
        this.field28259 = field28259;
        final ArrayList list = new ArrayList();
        if (!field28259) {
            this.method22367(class7449, new Class7862(0.0f, 0.0f, (float)class7449.method22913(), (float)class7449.method22914()), list);
        }
        else {
            for (int i = 0; i < class7449.method22913(); ++i) {
                for (int j = 0; j < class7449.method22914(); ++j) {
                    if (!class7449.method22916(this, i, j)) {
                        list.add(new Class7862((float)i, (float)j, 1.0f, 1.0f));
                    }
                }
            }
        }
        while (this.method22364(list)) {}
        this.method22365(list);
        return new Class9459(list);
    }
    
    private boolean method22364(final ArrayList list) {
        for (int i = 0; i < list.size(); ++i) {
            final Class7862 o = list.get(i);
            for (int j = i + 1; j < list.size(); ++j) {
                final Class7862 o2 = list.get(j);
                if (o.method25479(o2)) {
                    list.remove(o);
                    list.remove(o2);
                    list.add(o.method25478(o2));
                    return true;
                }
            }
        }
        return false;
    }
    
    private void method22365(final ArrayList list) {
        for (int i = 0; i < list.size(); ++i) {
            final Class7862 class7862 = list.get(i);
            for (int j = i + 1; j < list.size(); ++j) {
                final Class7862 class7863 = list.get(j);
                if (class7862.method25477(class7863)) {
                    class7862.method25475(class7863);
                    class7863.method25475(class7862);
                }
            }
        }
    }
    
    public boolean method22366(final Class7449 class7449, final Class7862 class7450) {
        if (!this.field28259) {
            float method25471 = 0.0f;
            int n = 0;
            while (method25471 < class7450.method25471()) {
                float method25472 = 0.0f;
                int n2 = 0;
                while (method25472 < class7450.method25472()) {
                    this.field28256 = (int)(class7450.method25473() + method25471);
                    this.field28257 = (int)(class7450.method25474() + method25472);
                    if (class7449.method22916(this, this.field28256, this.field28257)) {
                        return false;
                    }
                    method25472 += 0.1f;
                    if (method25472 <= class7450.method25472()) {
                        continue;
                    }
                    if (n2 != 0) {
                        continue;
                    }
                    method25472 = class7450.method25472();
                    n2 = 1;
                }
                method25471 += 0.1f;
                if (method25471 <= class7450.method25471()) {
                    continue;
                }
                if (n != 0) {
                    continue;
                }
                method25471 = class7450.method25471();
                n = 1;
            }
            return true;
        }
        return true;
    }
    
    private void method22367(final Class7449 class7449, final Class7862 e, final ArrayList list) {
        if (this.method22366(class7449, e)) {
            list.add(e);
        }
        else {
            final float n = e.method25471() / 2.0f;
            final float n2 = e.method25472() / 2.0f;
            if (n < this.field28258 && n2 < this.field28258) {
                return;
            }
            this.method22367(class7449, new Class7862(e.method25473(), e.method25474(), n, n2), list);
            this.method22367(class7449, new Class7862(e.method25473(), e.method25474() + n2, n, n2), list);
            this.method22367(class7449, new Class7862(e.method25473() + n, e.method25474(), n, n2), list);
            this.method22367(class7449, new Class7862(e.method25473() + n, e.method25474() + n2, n, n2), list);
        }
    }
    
    @Override
    public Class7916 method22358() {
        return null;
    }
    
    @Override
    public int method22359() {
        return 0;
    }
    
    @Override
    public int method22360() {
        return this.field28256;
    }
    
    @Override
    public int method22361() {
        return this.field28257;
    }
}
