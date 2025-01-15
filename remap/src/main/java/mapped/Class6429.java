// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6429
{
    private static String[] field25536;
    public static final Class6429 field25537;
    public final Vector3f field25538;
    public final Vector3f field25539;
    public final Vector3f field25540;
    
    public Class6429(final Vector3f class9138, final Vector3f class9139, final Vector3f class9140) {
        this.field25538 = class9138.method33329();
        this.field25539 = class9139.method33329();
        this.field25540 = class9140.method33329();
    }
    
    public void method19105(final boolean b, final Class7351 class7351) {
        if (this != Class6429.field25537) {
            final float method33311 = this.field25538.method33311();
            float method33312 = this.field25538.method33312();
            float method33313 = this.field25538.method33313();
            if (b) {
                method33312 = -method33312;
                method33313 = -method33313;
            }
            class7351.method22564((b ? -1 : 1) * this.field25539.method33311(), this.field25539.method33312(), this.field25539.method33313());
            class7351.method22566(new Quaternion(method33311, method33312, method33313, true));
            class7351.method22565(this.field25540.method33311(), this.field25540.method33312(), this.field25540.method33313());
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() == o.getClass()) {
            final Class6429 class6429 = (Class6429)o;
            if (this.field25538.equals(class6429.field25538)) {
                if (this.field25540.equals(class6429.field25540)) {
                    if (this.field25539.equals(class6429.field25539)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.field25538.hashCode() + this.field25539.hashCode()) + this.field25540.hashCode();
    }
    
    static {
        field25537 = new Class6429(new Vector3f(), new Vector3f(), new Vector3f(1.0f, 1.0f, 1.0f));
    }
}
