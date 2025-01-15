// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7949 extends Class7948
{
    private static String[] field32628;
    private final Class513 field32629;
    
    public Class7949(final Class513 field32629) {
        this.field32629 = field32629;
    }
    
    @Override
    public void method25774(final Item class3820, final int n) {
        super.method25774(class3820, n);
        this.field32629.field3039.method17469(new Class4391(class3820, n));
    }
    
    @Override
    public void method25775(final Item class3820) {
        super.method25775(class3820);
        this.field32629.field3039.method17469(new Class4391(class3820, 0));
    }
}
