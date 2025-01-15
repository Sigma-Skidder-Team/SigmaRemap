// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6637 extends Class6635
{
    private static String[] field26249;
    private Class2183 field26250;
    
    public Class6637(final Class6108 class6108) {
        super(class6108);
    }
    
    public void method20124(final int n) {
        this.field26250 = this.method20125(n);
    }
    
    private Class2183 method20125(final int n) {
        final Class2183 method8347 = Class2183.method8347(n);
        if (method8347 != null) {
            return method8347;
        }
        return Class2183.field12926;
    }
    
    public Class2183 method20126() {
        return this.field26250;
    }
}
