// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6911 implements Class6909
{
    public static final Class6382<Class6911> field27098;
    private final Class6907<Class6911> field27099;
    private final Class7096 field27100;
    
    public Class6911(final Class6907<Class6911> field27099, final Class7096 field27100) {
        this.field27099 = field27099;
        this.field27100 = field27100;
    }
    
    @Override
    public void method21273(final Class8654 class8654) {
        class8654.method29505(Class3833.field17391.method563(this.field27100));
    }
    
    @Override
    public String method21274() {
        return Class90.field222.method503(this.method21272()) + " " + Class7572.toString(this.field27100);
    }
    
    @Override
    public Class6907<Class6911> method21272() {
        return this.field27099;
    }
    
    public Class7096 method21276() {
        return this.field27100;
    }
    
    static {
        field27098 = new Class6383();
    }
}
