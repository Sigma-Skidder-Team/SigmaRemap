// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4834 extends Class4825
{
    private static String[] field20591;
    public static Class6523 field20719;
    
    public Class4834(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, false);
    }
    
    public Class4834(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final Class7524 class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805, false);
    }
    
    @Override
    public void method14205(final float n) {
        if (this.field20495 != null) {
            Class8154.method26889(this.method14316(), (float)this.method14272(), (float)this.method14274(), this.method14314(), Class6430.method19118(this.field20497.method19733(), n * Class6430.method19140(this.field20497.method19733())));
        }
    }
    
    static {
        Class4834.field20719 = new Class6523(Class265.field1273.field1292, Class265.field1273.field1292, Class265.field1273.field1292, Class265.field1273.field1292, Class2056.field11734, Class2056.field11738);
    }
}
