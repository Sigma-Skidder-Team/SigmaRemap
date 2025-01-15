// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7295 extends Class7296
{
    private static String[] field28269;
    private final Class792 field28270;
    private boolean field28271;
    public final /* synthetic */ Class792 field28272;
    
    public Class7295(final Class792 field28272, final Class792 field28273) {
        this.field28272 = field28272;
        super(field28273);
        this.field28270 = field28273;
    }
    
    public boolean method22378() {
        return this.field28275;
    }
    
    public boolean method22379() {
        return this.field28271;
    }
    
    public void method22380(final boolean field28271) {
        this.field28271 = field28271;
    }
    
    @Override
    public void method22381() {
        if (this.field28275) {
            this.field28270.method4435();
            this.field28275 = false;
        }
    }
}
