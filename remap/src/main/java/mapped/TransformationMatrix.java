// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import org.apache.commons.lang3.tuple.Triple;
import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public final class TransformationMatrix
{
    private static String[] field39856;
    private final Matrix4f field39857;
    private boolean field39858;
    private Vector3f field39859;
    private Quaternion field39860;
    private Vector3f field39861;
    private Quaternion field39862;
    private static final TransformationMatrix field39863;
    
    public TransformationMatrix(final Matrix4f field39857) {
        if (field39857 != null) {
            this.field39857 = field39857;
        }
        else {
            this.field39857 = TransformationMatrix.field39863.field39857;
        }
    }
    
    public TransformationMatrix(final Vector3f class9138, final Quaternion class9139, final Vector3f class9140, final Quaternion class9141) {
        this.field39857 = method34326(class9138, class9139, class9140, class9141);
        this.field39859 = ((class9138 == null) ? new Vector3f() : class9138);
        this.field39860 = ((class9139 == null) ? Quaternion.ONE.copy() : class9139);
        this.field39861 = ((class9140 == null) ? new Vector3f(1.0f, 1.0f, 1.0f) : class9140);
        this.field39862 = ((class9141 == null) ? Quaternion.ONE.copy() : class9141);
        this.field39858 = true;
    }
    
    public static TransformationMatrix identity() {
        return TransformationMatrix.field39863;
    }
    
    public TransformationMatrix method34323(final TransformationMatrix class9294) {
        final Matrix4f method34328 = this.getMatrix();
        method34328.method20752(class9294.getMatrix());
        return new TransformationMatrix(method34328);
    }
    
    @Nullable
    public TransformationMatrix method34324() {
        if (this != TransformationMatrix.field39863) {
            final Matrix4f method34328 = this.getMatrix();
            return method34328.method20751() ? new TransformationMatrix(method34328) : null;
        }
        return this;
    }
    
    private void method34325() {
        if (!this.field39858) {
            final Pair<Matrix3f, Vector3f> method34327 = method34327(this.field39857);
            final Triple<Quaternion, Vector3f, Quaternion> method34328 = method34327.getFirst().svdDecompose();
            this.field39859 = method34327.getSecond();
            this.field39860 = method34328.getLeft();
            this.field39861 = method34328.getMiddle();
            this.field39862 = method34328.getRight();
            this.field39858 = true;
        }
    }
    
    private static Matrix4f method34326(final Vector3f class9138, final Quaternion class9139, final Vector3f class9140, final Quaternion class9141) {
        final Matrix4f class9142 = new Matrix4f();
        class9142.method20748();
        if (class9139 != null) {
            class9142.method20752(new Matrix4f(class9139));
        }
        if (class9140 != null) {
            class9142.method20752(Matrix4f.method20759(class9140.getX(), class9140.getY(), class9140.getZ()));
        }
        if (class9141 != null) {
            class9142.method20752(new Matrix4f(class9141));
        }
        if (class9138 != null) {
            class9142.field26692 = class9138.getX();
            class9142.field26696 = class9138.getY();
            class9142.field26700 = class9138.getZ();
        }
        return class9142;
    }
    
    public static Pair<Matrix3f, Vector3f> method34327(final Matrix4f class6789) {
        class6789.method20754(1.0f / class6789.field26704);
        return (Pair<Matrix3f, Vector3f>)Pair.of((Object)new Matrix3f(class6789), (Object)new Vector3f(class6789.field26692, class6789.field26696, class6789.field26700));
    }
    
    public Matrix4f getMatrix() {
        return this.field39857.method20758();
    }
    
    public Quaternion method34329() {
        this.method34325();
        return this.field39860.copy();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.field39857, ((TransformationMatrix)o).field39857));
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field39857);
    }
    
    static {
        field39863 = Util.method27850(() -> {
            final Matrix4f class6789 = new Matrix4f();
            class6789.method20748();
            final TransformationMatrix class6790 = new TransformationMatrix(class6789);
            class6790.method34329();
            return class6790;
        });
    }
}
