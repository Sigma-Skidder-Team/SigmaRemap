// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class3198 extends Class3167
{
    private int field15614;
    private int field15615;
    private int field15616;
    
    public Class3198() {
        super(Class8013.field32985, "Basic", "Basic AutoGapple");
        this.field15614 = -1;
    }
    
    @Override
    public void method9879() {
        this.field15614 = -1;
        this.field15616 = 20;
    }
    
    @Class6753
    public void method10036(final Class5751 class5751) {
        if (this.method9906()) {
            if (this.field15614 >= 0) {
                class5751.method16961(true);
            }
        }
    }
    
    @Class6753
    public void method10037(final Class5752 class5752) {
        if (this.method9906()) {
            for (int length = Class3198.field15514.field4648.field23457.length, i = 0; i < length; ++i) {
                final Class350 class5753 = Class3198.field15514.field4648.field23457[i];
                final String method1060 = class5753.method1060();
                final int int1 = Integer.parseInt(String.valueOf(method1060.charAt(method1060.length() - 1)));
                if (class5752.method17061() == class5753.field2161.field32860) {
                    if (int1 - 1 != Class3198.field15514.field4684.field3006.field2743) {
                        this.field15614 = -1;
                        this.field15616 = 0;
                    }
                }
            }
        }
    }
    
    @Class6753
    public void method10038(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        if (this.field15616 < 20) {
            ++this.field15616;
        }
        int method10292 = -1;
        if (Class3198.field15514.field4684.method2664() <= this.method9914().method9886("Health") * 2.0f) {
            method10292 = ((Class3263)this.method9914()).method10292(false);
            if (this.field15614 == -1) {
                if (this.field15616 >= 20) {
                    if (method10292 != -1) {
                        this.field15614 = 0;
                        this.field15616 = 0;
                    }
                }
            }
        }
        if (method10292 < 0 && this.field15614 == -1) {
            return;
        }
        if (this.field15614 >= 0) {
            ++this.field15614;
            if (this.field15614 != 1) {
                if (this.field15614 > 1) {
                    if (Class3198.field15514.field4684.method2715(Class316.field1877).method27622() != Class7739.field31341) {
                        if (Class3198.field15514.field4684.method2715(Class316.field1877).method27622() != Class7739.field31342) {
                            Class3198.field15514.field4684.field3006.field2743 = this.field15615;
                            this.field15615 = -1;
                            this.field15614 = -1;
                        }
                    }
                }
            }
            else {
                this.field15615 = Class3198.field15514.field4684.field3006.field2743;
                Class3198.field15514.field4684.field3006.field2743 = method10292;
                Class3198.field15514.field4682.method27318();
                Class3198.field15514.field4682.method27320(Class3198.field15514.field4684, Class3198.field15514.field4683, Class316.field1877);
            }
        }
    }
    
    @Class6753
    public void method10039(final Class5723 class5723) {
        if (this.method9906() && this.field15614 > 1) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4268) {
                final Class4268 class5724 = (Class4268)method16998;
                if (class5724.method12811() == Class3198.field15514.field4684.getEntityId()) {
                    final Iterator<Class9369<?>> iterator = class5724.method12810().iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().method34766().method30737() != 14) {
                            continue;
                        }
                        Class3198.field15514.field4684.field3006.field2743 = this.field15615;
                        this.field15615 = -1;
                        this.field15614 = -1;
                    }
                }
            }
        }
    }
}
