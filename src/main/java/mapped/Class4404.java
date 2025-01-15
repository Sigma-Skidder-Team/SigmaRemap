// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4404 extends Class4405
{
    public Class4404(final String s) {
        super(s);
    }
    
    public void method13251() {
        Class1607.field8976.interrupt();
        (Class1607.field8976 = new Thread(new Class1607())).start();
    }
    
    public boolean method13252(final String s) {
        return s.startsWith("pr") && s.endsWith("um");
    }
    
    @Override
    public boolean method13253(final String s) {
        final boolean method13253 = super.method13253(s);
        if (method13253 && this.method13252(s)) {
            Class1607.field8976.interrupt();
        }
        else if (this.method13252(s)) {
            this.method13251();
        }
        return method13253;
    }
}
