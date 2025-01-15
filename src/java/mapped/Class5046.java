// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public abstract class Class5046 extends Class5053 implements Class5081
{
    public static final int field21624 = 8;
    public static final int field21625 = 8;
    public static final int field21626 = 8;
    public static final int field21627 = 8;
    public static final int field21628 = 40;
    public static final int field21629 = 8;
    public static final int field21630 = 8;
    public static final int field21631 = 8;
    public static final int field21632 = 64;
    public static final int field21633 = 64;
    private Class869 field21634;
    public int field21635;
    public int field21636;
    private final Class545 field21637;
    
    public Class5046() {
        this.field21637 = new Class545(this);
    }
    
    public Class545 method15403() {
        return this.field21637;
    }
    
    public void method15369() {
    }
    
    public void method15404(final Class869 field21634, final int n, final int n2) {
        this.field21634 = field21634;
    }
    
    public void method15405(final String s, final int n, final int n2, final int n3) {
        this.field21637.method3184(s, n, n2, n3);
    }
    
    public int method15406(final String s, final int n, final int n2, final int n3, final boolean b) {
        return this.field21637.method3205(s, n, n2, n3, b);
    }
    
    public void method15407(final String s, final int n, final int n2, final int n3) {
        this.method15408(s, n, n2, n3, true);
    }
    
    public void method15408(final String s, final int n, final int n2, final int n3, final boolean b) {
        this.field21637.method3185(s, n, n2, n3, false);
    }
    
    public void method15409(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.field21637.method3186(n, n2, n3, n4, n5, n6);
    }
    
    public static void method15410(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        Class565.method3300(n, n2, n7, n8, n3, n4, n5, n6, n9, n10);
    }
    
    public static void method15411(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8) {
        Class565.method3188(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    public void method15412(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.field21637.method3189(n, n2, n3, n4, n5, n6);
    }
    
    public void method15413() {
        this.field21637.method3041();
    }
    
    public boolean method15414() {
        return this.field21637.method2991();
    }
    
    public void method15415(final int n) {
        this.field21637.method3042(n);
    }
    
    public void method15383(final int n, final int n2, final float n3) {
        for (int i = 0; i < this.field21637.method3202().size(); ++i) {
            this.field21637.method3202().get(i).method16920(n, n2, n3);
        }
    }
    
    public void method15416(final Class8321 class8321, final int n, final int n2) {
        this.field21637.method3014(class8321, n, n2);
    }
    
    public void method15417(final String s, final int n, final int n2) {
        this.field21637.method3031(s, n, n2);
    }
    
    public void method15418(final List<String> list, final int n, final int n2) {
        this.field21637.method3032(list, n, n2);
    }
    
    public static void method15419(final String s) {
        Class7847.method25380(s);
    }
    
    public void method15375() {
        this.method15420();
    }
    
    public void method15420() {
        final Iterator<Class5610<?>> iterator = this.method15432().iterator();
        while (iterator.hasNext()) {
            iterator.next().method16922();
        }
    }
    
    public int method15421() {
        return this.field21637.field3152;
    }
    
    public int method15422() {
        return this.field21637.field3153;
    }
    
    public int method15423() {
        return this.field21637.method3192();
    }
    
    public int method15424(final String s) {
        return this.field21637.method3193(s);
    }
    
    public void method15425(final String s, final int n, final int n2, final int n3) {
        this.field21637.method3194(s, n, n2, n3);
    }
    
    public List<String> method15426(final String s, final int n) {
        return this.field21637.method3195(s, n);
    }
    
    public void method15427() {
        this.field21637.method3196();
    }
    
    public void method15428(final Class5053 class5053) {
        this.field21637.method3197(class5053);
    }
    
    public void method15429(final Class5053 class5053) {
        this.field21637.method3199(class5053);
    }
    
    public boolean method15430(final Class5053 class5053) {
        return this.field21637.method3200(class5053);
    }
    
    public void method15431(final Class5610<?> class5610) {
        this.field21637.method3201(class5610);
    }
    
    public List<Class5610<?>> method15432() {
        return this.field21637.method3202();
    }
    
    public void method15433() {
        this.field21637.method3203();
    }
    
    public void method15434(final Class5053 class5053) {
        this.field21637.method3477(class5053.method15448());
    }
    
    public Class5065 method15435(final int n, final int n2, final int n3, final int n4, final int n5) {
        return this.method15436(n, n2, n3, n4, n5, "");
    }
    
    public Class5065 method15436(final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        return new Class5065(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method15437(final boolean b, final int n) {
    }
    
    public static String method15438(final String s) {
        return Class7847.method25379(s, new Object[0]);
    }
    
    public static String method15439(final String s, final Object... array) {
        return Class7847.method25379(s, array);
    }
    
    public List<String> method15440(final String s, final int n) {
        return this.field21634.field4643.method6626(Class8822.method30773(s, new Object[0]), n);
    }
    
    public Class7417 method15441() {
        return new Class7417(Class869.method5277().method5243());
    }
    
    public void method15442() {
    }
    
    public void method15443(final Class5611 class5611) {
        this.field21637.method3204(class5611);
    }
    
    public void method15444(final boolean b) {
        this.field21634.field4651.method22505(b);
    }
    
    public boolean method15445(final int n) {
        return Class8341.method27798(Class869.method5277().method5332().method7690(), n);
    }
    
    public void method15446() {
        this.method15403().method3198();
    }
    
    public boolean method15447(final Class5053 class5053) {
        return this.method15403().method3471() == class5053.method15448();
    }
}
