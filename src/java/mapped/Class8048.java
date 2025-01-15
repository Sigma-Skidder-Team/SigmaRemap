// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8048
{
    private static String[] field33116;
    private final Class6332 field33117;
    private final Class6332 field33118;
    private final float field33119;
    private final float field33120;
    private final float field33121;
    private final float field33122;
    private final float field33123;
    private final float field33124;
    private final float field33125;
    private final float field33126;
    
    public Class8048(final Class6332 field33117, final Class6332 field33118, final float field33119, final float field33120, final float field33121, final float field33122, final float field33123, final float field33124, final float field33125, final float field33126) {
        this.field33117 = field33117;
        this.field33118 = field33118;
        this.field33119 = field33119;
        this.field33120 = field33120;
        this.field33121 = field33121;
        this.field33122 = field33122;
        this.field33123 = field33123;
        this.field33124 = field33124;
        this.field33125 = field33125;
        this.field33126 = field33126;
    }
    
    public void method26393(final boolean b, final float n, final float n2, final Class6789 class6789, final Class4150 class6790, final float n3, final float n4, final float n5, final float n6, final int n7) {
        final float n8 = n + this.field33123;
        final float n9 = n + this.field33124;
        final float n10 = this.field33125 - 3.0f;
        final float n11 = this.field33126 - 3.0f;
        final float n12 = n2 + n10;
        final float n13 = n2 + n11;
        final float n14 = b ? (1.0f - 0.25f * n10) : 0.0f;
        final float n15 = b ? (1.0f - 0.25f * n11) : 0.0f;
        class6790.method12444(class6789, n8 + n14, n12, 0.0f).method12439(n3, n4, n5, n6).method12391(this.field33119, this.field33121).method12440(n7).method12397();
        class6790.method12444(class6789, n8 + n15, n13, 0.0f).method12439(n3, n4, n5, n6).method12391(this.field33119, this.field33122).method12440(n7).method12397();
        class6790.method12444(class6789, n9 + n15, n13, 0.0f).method12439(n3, n4, n5, n6).method12391(this.field33120, this.field33122).method12440(n7).method12397();
        class6790.method12444(class6789, n9 + n14, n12, 0.0f).method12439(n3, n4, n5, n6).method12391(this.field33120, this.field33121).method12440(n7).method12397();
    }
    
    public void method26394(final Class7469 class7469, final Class6789 class7470, final Class4150 class7471, final int n) {
        class7471.method12444(class7470, class7469.field28844, class7469.field28845, class7469.field28848).method12439(class7469.field28849, class7469.field28850, class7469.field28851, class7469.field28852).method12391(this.field33119, this.field33121).method12440(n).method12397();
        class7471.method12444(class7470, class7469.field28846, class7469.field28845, class7469.field28848).method12439(class7469.field28849, class7469.field28850, class7469.field28851, class7469.field28852).method12391(this.field33119, this.field33122).method12440(n).method12397();
        class7471.method12444(class7470, class7469.field28846, class7469.field28847, class7469.field28848).method12439(class7469.field28849, class7469.field28850, class7469.field28851, class7469.field28852).method12391(this.field33120, this.field33122).method12440(n).method12397();
        class7471.method12444(class7470, class7469.field28844, class7469.field28847, class7469.field28848).method12439(class7469.field28849, class7469.field28850, class7469.field28851, class7469.field28852).method12391(this.field33120, this.field33121).method12440(n).method12397();
    }
    
    public Class6332 method26395(final boolean b) {
        return b ? this.field33118 : this.field33117;
    }
}
