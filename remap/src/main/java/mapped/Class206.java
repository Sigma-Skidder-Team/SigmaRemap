// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class206 implements Class198, Class200
{
    field715;
    
    private static final int field716;
    private static final int field717;
    private static final int field718;
    private static final int field719;
    private static final int field720;
    
    @Override
    public int method841(final Class6433 class6433, final Class6631 class6434, final Class6631 class6435, final int n, final int n2) {
        final int method20074 = class6434.method20074(this.method839(n), this.method840(n2));
        final int method20075 = class6435.method20074(this.method839(n), this.method840(n2));
        if (Class7983.method26038(method20074)) {
            return method20074;
        }
        if (method20075 != Class206.field720) {
            return method20074;
        }
        if (method20074 != Class206.field717) {
            return (method20074 != Class206.field718 && method20074 != Class206.field719) ? (method20075 & 0xFF) : Class206.field719;
        }
        return Class206.field716;
    }
    
    static {
        field716 = Registry.field217.getId(Class7102.field27643);
        field717 = Registry.field217.getId(Class7102.field27644);
        field718 = Registry.field217.getId(Class7102.field27646);
        field719 = Registry.field217.getId(Class7102.field27647);
        field720 = Registry.field217.getId(Class7102.field27639);
    }
}
