// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import org.apache.commons.lang3.tuple.Triple;
import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public final class Class9294
{
    private static String[] field39856;
    private final Class6789 field39857;
    private boolean field39858;
    private Vector3f field39859;
    private Quaternion field39860;
    private Vector3f field39861;
    private Quaternion field39862;
    private static final Class9294 field39863;
    
    public Class9294(final Class6789 field39857) {
        if (field39857 != null) {
            this.field39857 = field39857;
        }
        else {
            this.field39857 = Class9294.field39863.field39857;
        }
    }
    
    public Class9294(final Vector3f class9138, final Quaternion class9139, final Vector3f class9140, final Quaternion class9141) {
        this.field39857 = method34326(class9138, class9139, class9140, class9141);
        this.field39859 = ((class9138 == null) ? new Vector3f() : class9138);
        this.field39860 = ((class9139 == null) ? Quaternion.ONE.copy() : class9139);
        this.field39861 = ((class9140 == null) ? new Vector3f(1.0f, 1.0f, 1.0f) : class9140);
        this.field39862 = ((class9141 == null) ? Quaternion.ONE.copy() : class9141);
        this.field39858 = true;
    }
    
    public static Class9294 method34322() {
        return Class9294.field39863;
    }
    
    public Class9294 method34323(final Class9294 class9294) {
        final Class6789 method34328 = this.method34328();
        method34328.method20752(class9294.method34328());
        return new Class9294(method34328);
    }
    
    @Nullable
    public Class9294 method34324() {
        if (this != Class9294.field39863) {
            final Class6789 method34328 = this.method34328();
            return method34328.method20751() ? new Class9294(method34328) : null;
        }
        return this;
    }
    
    private void method34325() {
        if (!this.field39858) {
            final Pair<Class9429, Vector3f> method34327 = method34327(this.field39857);
            final Triple<Quaternion, Vector3f, Quaternion> method34328 = ((Class9429)method34327.getFirst()).method35037();
            this.field39859 = (Vector3f)method34327.getSecond();
            this.field39860 = (Quaternion)method34328.getLeft();
            this.field39861 = (Vector3f)method34328.getMiddle();
            this.field39862 = (Quaternion)method34328.getRight();
            this.field39858 = true;
        }
    }
    
    private static Class6789 method34326(final Vector3f class9138, final Quaternion class9139, final Vector3f class9140, final Quaternion class9141) {
        final Class6789 class9142 = new Class6789();
        class9142.method20748();
        if (class9139 != null) {
            class9142.method20752(new Class6789(class9139));
        }
        if (class9140 != null) {
            class9142.method20752(Class6789.method20759(class9140.method33311(), class9140.method33312(), class9140.method33313()));
        }
        if (class9141 != null) {
            class9142.method20752(new Class6789(class9141));
        }
        if (class9138 != null) {
            class9142.field26692 = class9138.method33311();
            class9142.field26696 = class9138.method33312();
            class9142.field26700 = class9138.method33313();
        }
        return class9142;
    }
    
    public static Pair<Class9429, Vector3f> method34327(final Class6789 class6789) {
        class6789.method20754(1.0f / class6789.field26704);
        return (Pair<Class9429, Vector3f>)Pair.of((Object)new Class9429(class6789), (Object)new Vector3f(class6789.field26692, class6789.field26696, class6789.field26700));
    }
    
    public Class6789 method34328() {
        return this.field39857.method20758();
    }
    
    public Quaternion method34329() {
        this.method34325();
        return this.field39860.copy();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.field39857, ((Class9294)o).field39857));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field39857);
    }
    
    static {
        field39863 = Class8349.method27850(() -> {
            final Class6789 class6789 = new Class6789();
            class6789.method20748();
            final Class9294 class6790 = new Class9294(class6789);
            class6790.method34329();
            return class6790;
        });
    }
}
