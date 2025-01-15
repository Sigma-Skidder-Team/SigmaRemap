// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class5832 extends Class5831
{
    private ArrayList field23914;
    
    public Class5832(final Class5831 class5831) {
        super(class5831.method17520(), class5831.method17521());
        this.field23914 = new ArrayList();
        for (int i = 0; i < class5831.method17529(); ++i) {
            final Class7567 method17530 = class5831.method17530(i);
            this.field23914.add(new Class7567(method17530.method23755(), new Class2401(method17530.method23756()), method17530.method23757(), method17530.method23754()));
        }
    }
    
    public void method17532(final Class5831 class5831) {
        if (class5831.method17529() == this.field23914.size()) {
            for (int i = 0; i < class5831.method17529(); ++i) {
                final Class7567 method17530 = class5831.method17530(i);
                final String method17531 = method17530.method23757().method27584();
                for (int j = 0; j < this.field23914.size(); ++j) {
                    final Class7567 class5832 = this.field23914.get(j);
                    if (class5832.method23757().method27584().equals(method17531)) {
                        ((Class2401)class5832.method23756()).method9560(method17530.method23756());
                        break;
                    }
                }
            }
            return;
        }
        throw new RuntimeException("Mismatched diagrams, missing ids");
    }
    
    public void method17533(final Class5831 class5831) {
        for (int i = 0; i < this.field23914.size(); ++i) {
            final Class7567 class5832 = this.field23914.get(i);
            for (int j = 0; j < class5831.method17529(); ++j) {
                final Class7567 method17530 = class5831.method17530(j);
                if (method17530.method23757().method27584().equals(class5832.method23757().method27584())) {
                    ((Class2401)class5832.method23756()).method9564(method17530.method23756());
                    break;
                }
            }
        }
    }
    
    public void method17534(final float n) {
        for (int i = 0; i < this.field23914.size(); ++i) {
            ((Class2401)((Class7567)this.field23914.get(i)).method23756()).method9563(n);
        }
    }
    
    public void method17535(final float n) {
        for (int i = 0; i < this.field23914.size(); ++i) {
            ((Class2401)((Class7567)this.field23914.get(i)).method23756()).method9562(n);
        }
    }
    
    @Override
    public int method17529() {
        return this.field23914.size();
    }
    
    @Override
    public Class7567 method17530(final int index) {
        return this.field23914.get(index);
    }
}
