// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class5058 extends Class5056
{
    public final /* synthetic */ Class5088 field21707;
    
    public Class5058(final Class5088 field21707) {
        this.field21707 = field21707;
        super(field21707.width(), field21707.height(), Class7869.method25488(0), field21707.height() - 40, 36);
    }
    
    public void method15541(final Class1951 class1951) {
        final Class5088 field21707 = this.field21707;
        field21707.getClass();
        this.method15511(new Class630(field21707, class1951));
    }
    
    @Override
    public int method15521() {
        return Class5088.method15952(this.field21707).size();
    }
    
    @Override
    public int method15523() {
        return Class5088.method15952(this.field21707).size() * 36;
    }
    
    @Override
    public boolean method15532() {
        return this.field21707.method15447(this);
    }
    
    @Override
    public void method15522() {
        this.field21707.method15413();
    }
    
    @Override
    public void method15533(final int n) {
        this.method15519(n);
        if (n != -1) {
            final Class1951 class1951 = Class5088.method15952(this.field21707).get(n);
            Realms.narrateNow(RealmsScreen.method15439("narrator.select", Realms.method25385(Arrays.asList(class1951.method7937(), Class5088.method15955(this.field21707, class1951), Class5088.method15957(this.field21707, class1951), RealmsScreen.method15439("narrator.select.list.position", n + 1, Class5088.method15952(this.field21707).size())))));
        }
        Class5088.method15958(this.field21707, n);
        final Class5611 method15960 = Class5088.method15960(this.field21707);
        boolean b = false;
        Label_0218: {
            if (Class5088.method15959(this.field21707) >= 0) {
                if (Class5088.method15959(this.field21707) < this.method15521()) {
                    if (!Class5088.method15952(this.field21707).get(Class5088.method15959(this.field21707)).method7935()) {
                        b = true;
                        break Label_0218;
                    }
                }
            }
            b = false;
        }
        method15960.method16917(b);
    }
}
