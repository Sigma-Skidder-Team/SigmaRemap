// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5216 extends Class5207
{
    private static String[] field22232;
    
    @Override
    public void method16306() {
        this.method16316(Class2044.field11646, 0, 0, new Class3012(this));
        this.method16315(Class2044.field11646, 1, 1);
        this.method16315(Class2044.field11647, 0, 0);
        this.method16315(Class2044.field11647, 1, 1);
        this.method16316(Class2044.field11647, 2, 2, new Class3061(this));
        this.method16315(Class2044.field11647, 3, 3);
        this.method16312(Class2044.field11647, 4, 4);
        this.method16312(Class2044.field11646, 0, 0);
        this.method16312(Class2044.field11646, 1, 1);
        this.method16313(Class2044.field11647, 0, 0, new Class2988(this));
        this.method16312(Class2044.field11647, 1, 1);
        this.method16312(Class2044.field11647, 2, 2);
    }
    
    @Override
    public void method16307(final Class6108 class6108) {
    }
    
    public static String method16331(final String str) {
        final StringBuilder sb = new StringBuilder(str);
        sb.insert(20, '-');
        sb.insert(16, '-');
        sb.insert(12, '-');
        sb.insert(8, '-');
        return sb.toString();
    }
}
