// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1112 implements Runnable
{
    private static String[] field5995;
    private Class754 field5996;
    private Class1932 field5997;
    private boolean field5998;
    
    public Class1112(final Class754 field5996, final Class1932 field5997) {
        this.field5996 = field5996;
        this.field5997 = field5997;
    }
    
    @Override
    public void run() {
    }
    
    public Class1846 method5610(final Class1846 class1846) {
        final Class1846 method17111 = Class5759.method17111(class1846);
        this.field5998 = Class5759.method17112(class1846, method17111);
        return method17111;
    }
    
    public void method5611() {
        if (this.field5996 != null) {
            this.field5996.method4107(this.field5997);
            this.field5996.method4109(this.field5998);
        }
        this.method5612();
    }
    
    public void method5612() {
        this.field5996 = null;
    }
    
    public boolean method5613() {
        return this.field5998;
    }
}
