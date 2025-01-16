// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public enum Class2122 implements Class2123
{
    field12371(0, 0), 
    field12372(0, 90), 
    field12373(0, 180), 
    field12374(0, 270), 
    field12375(90, 0), 
    field12376(90, 90), 
    field12377(90, 180), 
    field12378(90, 270), 
    field12379(180, 0), 
    field12380(180, 90), 
    field12381(180, 180), 
    field12382(180, 270), 
    field12383(270, 0), 
    field12384(270, 90), 
    field12385(270, 180), 
    field12386(270, 270);
    
    private static final Map<Integer, Class2122> field12387;
    private final int field12388;
    private final Quaternion field12389;
    private final int field12390;
    private final int field12391;
    
    private static int method8273(final int n, final int n2) {
        return n * 360 + n2;
    }
    
    private Class2122(final int n, final int n2) {
        this.field12388 = method8273(n, n2);
        final Quaternion field12389 = new Quaternion(new Vector3f(0.0f, 1.0f, 0.0f), (float)(-n2), true);
        field12389.multiply(new Quaternion(new Vector3f(1.0f, 0.0f, 0.0f), (float)(-n), true));
        this.field12389 = field12389;
        this.field12390 = MathHelper.abs(n / 90);
        this.field12391 = MathHelper.abs(n2 / 90);
    }
    
    @Override
    public TransformationMatrix method8274() {
        return new TransformationMatrix(null, this.field12389, null, null);
    }
    
    public static Class2122 method8275(final int n, final int n2) {
        return Class2122.field12387.get(method8273(MathHelper.method35664(n, 360), MathHelper.method35664(n2, 360)));
    }
    
    static {
        field12387 = Arrays.stream(values()).collect(Collectors.toMap(class2122 -> class2122.field12388, class2123 -> class2123));
    }
}
