// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class721 extends Class720
{
    private Class654 field3942;
    public static int field3943;
    private Class573 field3944;
    
    public Class721() {
        super(new Class548());
    }
    
    public Class721(final Class527 class527) {
        super(class527);
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3944 = this.method3029(new Class6470("jello.portaloption", 0.0, (double)(this.method3963().size() - 1), 1.0f, p0 -> Double.valueOf(this.method3962()), (p0, n) -> Class9367.field40167 = this.method3964(n.intValue()), (class5762, class5764) -> this.method3964((int)class5764.method19476(class5762)).method25614()).method19362(this.field3150.field4648, this.field3152 / 2 + 40, 7, 114));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
        Class8154.method26870(0, 0, Class869.method5277().field4632.method7694(), (int)(30.0 * Class869.method5277().field4632.method7700() / Class9000.field37993));
        this.method3041();
        Class8154.method26872();
        this.field3944.method2975(n, n2, n3);
        this.method3297(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2 - 146, 13, 16777215);
        this.method3297(this.field3156, "Jello Portal:", this.field3152 / 2 - 30, 13, Class6430.method19118(Class265.field1278.field1292, 0.5f));
    }
    
    private int method3962() {
        Class721.field3943 = 0;
        for (final Class7906 class7906 : this.method3963()) {
            if (this.method3964(Class721.field3943).equals(Class9367.field40167)) {
                break;
            }
            ++Class721.field3943;
        }
        return Class721.field3943;
    }
    
    private List<Class7906> method3963() {
        final ArrayList list = new ArrayList();
        for (final Class7906 class7906 : Class7906.field32451) {
            if (class7906.method25613() < 47) {
                continue;
            }
            list.add(class7906);
        }
        return list;
    }
    
    private Class7906 method3964(final int n) {
        return this.method3963().get(n);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    static {
        Class721.field3943 = 0;
    }
}