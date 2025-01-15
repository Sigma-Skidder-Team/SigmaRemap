// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6293 extends Class6292
{
    private final String field25163;
    private final boolean field25164;
    private final Class227 field25165;
    
    public Class6293(final String s, final String field25163, final boolean field25164, final Class2314 class2314, final Class2314 class2315, final Class227 field25165) {
        super(s, class2314, class2315);
        this.field25163 = field25163;
        this.field25164 = field25164;
        if (field25165 != null) {
            this.field25165 = field25165;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }
    
    public String method18622() {
        return this.field25163;
    }
    
    public boolean method18623() {
        return this.field25164;
    }
    
    public Class227 method18624() {
        return this.field25165;
    }
    
    @Override
    public String method18617() {
        return super.method18617() + ", tag=" + this.field25163 + ", implicit=" + this.field25164;
    }
    
    public boolean method18625() {
        return Class227.field800 == this.field25165;
    }
}
