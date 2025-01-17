// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

public class Class4863 extends Class4841
{
    private static String[] field20591;
    public Class7920 field20828;
    
    public Class4863(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        super(class4803, s, n, n2, n3, n4, b);
    }
    
    public Class4863(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final boolean b, final Class7920 field20828) {
        super(class4803, s, n, n2, n3, n4, b);
        this.field20828 = field20828;
    }
    
    public Class4863(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final boolean b, final Class7920 field20828) {
        super(class4803, s, n, n2, n3, n4, class4804, b);
        this.field20828 = field20828;
    }
    
    public Class4863(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final boolean b, final Class7920 field20828) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, b);
        this.field20828 = field20828;
    }
    
    public Class4863(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final TrueTypeFont class4805, final boolean b, final Class7920 field20828) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805, b);
        this.field20828 = field20828;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20828.method25647();
    }
    
    @Override
    public void method14205(final float n) {
        this.method14583().method25648(this.method14272(), this.method14274(), this.method14276(), this.method14278(), n);
        super.method14205(n);
    }
    
    public Class7920 method14583() {
        return this.field20828;
    }
    
    public void method14584(final Class7920 field20828) {
        this.field20828 = field20828;
    }
}
