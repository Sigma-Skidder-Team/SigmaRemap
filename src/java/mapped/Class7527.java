// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;

public class Class7527 implements Class7523
{
    private Class7765 field29883;
    private char field29884;
    private int field29885;
    private int field29886;
    private int field29887;
    private int field29888;
    
    public Class7527(final Class7765 field29883, final char field29884) {
        this.field29883 = field29883;
        this.field29884 = field29884;
        this.field29887 = field29883.method24861();
        final int method24862 = field29883.method24862();
        this.field29885 = field29883.method24843() / this.field29887;
        this.field29886 = field29883.method24844() / method24862;
        this.field29888 = this.field29887 * method24862;
    }
    
    @Override
    public void method23500(final float n, final float n2, final String s) {
        this.method23501(n, n2, s, Class2427.field14355);
    }
    
    @Override
    public void method23501(final float n, final float n2, final String s, final Class2427 class2427) {
        this.method23499(n, n2, s, class2427, 0, s.length() - 1);
    }
    
    @Override
    public void method23499(final float n, final float n2, final String s, final Class2427 class2427, final int n3, final int n4) {
        try {
            final byte[] bytes = s.getBytes("US-ASCII");
            for (int i = 0; i < bytes.length; ++i) {
                final int n5 = bytes[i] - this.field29884;
                if (n5 < this.field29888) {
                    final int n6 = n5 % this.field29887;
                    final int n7 = n5 / this.field29887;
                    if (i >= n3 || i <= n4) {
                        this.field29883.method24860(n6, n7).method24776(n + i * this.field29885, n2, class2427);
                    }
                }
            }
        }
        catch (final UnsupportedEncodingException ex) {
            Class8452.method28203(ex);
        }
    }
    
    @Override
    public int method23506(final String s) {
        return this.field29886;
    }
    
    @Override
    public int method23505(final String s) {
        return this.field29885 * s.length();
    }
    
    @Override
    public int method23521() {
        return this.field29886;
    }
}
