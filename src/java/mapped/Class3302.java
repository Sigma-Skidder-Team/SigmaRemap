// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Class3302 extends Class3167
{
    private boolean field15873;
    private int field15874;
    
    public Class3302() {
        super(Class8013.field32990, "Vanilla", "Regular vanilla fly");
        this.method9881(new Class4996("Speed", "Fly speed", 4.0f, Float.class, 1.0f, 10.0f, 0.1f));
        this.method9881(new Class4999("Kick bypass", "Bypass vanilla kick for flying", true));
    }
    
    @Override
    public void method9879() {
        if (!Class3302.field15514.field4648.field23440.method1056()) {
            if (!Class3302.field15514.field4648.field23440.method1056()) {
                this.field15873 = false;
            }
        }
        else {
            Class3302.field15514.field4648.field23440.field2162 = false;
            this.field15873 = true;
        }
    }
    
    @Override
    public void method9897() {
        Class6430.method19155(-0.08);
        Class7482.method23151(Class7482.method23136());
    }
    
    @Class6753
    private void method10457(final Class5752 class5752) {
        if (this.method9906()) {
            if (class5752.method17061() == Class3302.field15514.field4648.field23440.field2161.field32860) {
                class5752.method16961(true);
                this.field15873 = true;
            }
        }
    }
    
    @Class6753
    private void method10458(final Class5715 class5715) {
        if (this.method9906()) {
            if (class5715.method16963() == Class3302.field15514.field4648.field23440.field2161.field32860) {
                class5715.method16961(true);
                this.field15873 = false;
            }
        }
    }
    
    @Class6753
    public void method10459(final Class5744 class5744) {
        if (!this.method9906()) {
            return;
        }
        if (!Class3302.field15514.field4684.field2404 && this.method9883("Kick bypass")) {
            if (this.field15874 > 0) {
                if (this.field15874 % 30 == 0) {
                    if (!Class6430.method19160(Class3302.field15514.field4684, 0.01f)) {
                        if (Class9367.method34762() != Class7906.field32452.method25613()) {
                            class5744.method17037(class5744.method17036() - 0.04);
                        }
                        else {
                            final double method10461 = this.method10461();
                            if (method10461 < 0.0) {
                                return;
                            }
                            double method10462 = class5744.method17036();
                            final ArrayList list = new ArrayList();
                            if (method10462 - method10461 <= 9.0) {
                                Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), method10461, class5744.method17038(), true));
                            }
                            else {
                                while (method10462 > method10461 + 9.0) {
                                    method10462 -= 9.0;
                                    list.add(method10462);
                                    Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), method10462, class5744.method17038(), true));
                                }
                                final Iterator iterator = list.iterator();
                                while (iterator.hasNext()) {
                                    Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), (double)iterator.next(), class5744.method17038(), true));
                                }
                                Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), method10461, class5744.method17038(), true));
                                Collections.reverse(list);
                                final Iterator iterator2 = list.iterator();
                                while (iterator2.hasNext()) {
                                    Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), (double)iterator2.next(), class5744.method17038(), true));
                                }
                                Class3302.field15514.method5269().method17292(new Class4354(class5744.method17034(), class5744.method17036(), class5744.method17038(), true));
                            }
                            this.field15874 = 0;
                        }
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10460(final Class5717 class5717) {
        if (this.method9906()) {
            if (!Class6430.method19160(Class3302.field15514.field4684, 0.01f)) {
                ++this.field15874;
            }
            else {
                this.field15874 = 0;
            }
            final double n = Class7482.method23136() * this.method9886("Speed");
            double n2 = Class3302.field15514.field4648.field23439.field2162 ? (n / 2.0) : 0.0;
            if (Class3302.field15514.field4648.field23439.field2162 && Class3302.field15514.field4648.field23440.field2162) {
                n2 = 0.0;
            }
            else if (!this.field15873) {
                if (Class3302.field15514.field4648.field23439.field2162) {
                    n2 = n / 2.0;
                }
            }
            else {
                n2 = -n / 2.0;
            }
            Class7482.method23149(class5717, n);
            class5717.method16975(n2);
        }
    }
    
    private double method10461() {
        if (Class3302.field15514.field4684.method1895().field22771 < 1.0) {
            return -1.0;
        }
        if (!Class3302.field15514.field4684.field2404) {
            final Iterator<Object> iterator = Class3302.field15514.field4683.method6981(Class3302.field15514.field4684, Class3302.field15514.field4684.field2403.method18494(0.0, -Class3302.field15514.field4684.method1934().field22771, 0.0)).iterator();
            double field25077 = -1.0;
            while (iterator.hasNext()) {
                final Class7702 class7702 = iterator.next();
                if (class7702.method24537().field25077 <= field25077) {
                    continue;
                }
                field25077 = class7702.method24537().field25077;
            }
            return field25077;
        }
        return Class3302.field15514.field4684.field2396;
    }
}
