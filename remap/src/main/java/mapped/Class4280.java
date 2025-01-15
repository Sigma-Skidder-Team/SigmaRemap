// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4280 implements Class4252<Class5800>
{
    private static String[] field19201;
    private double field19202;
    private double field19203;
    private double field19204;
    private int field19205;
    private Class2042 field19206;
    private Class2042 field19207;
    private boolean field19208;
    
    public Class4280() {
    }
    
    public Class4280(final Class2042 field19206, final double field19207, final double field19208, final double field19209) {
        this.field19206 = field19206;
        this.field19202 = field19207;
        this.field19203 = field19208;
        this.field19204 = field19209;
    }
    
    public Class4280(final Class2042 field19206, final Entity class399, final Class2042 field19207) {
        this.field19206 = field19206;
        this.field19205 = class399.method1643();
        this.field19207 = field19207;
        final Vec3d method8122 = field19207.method8122(class399);
        this.field19202 = method8122.x;
        this.field19203 = method8122.y;
        this.field19204 = method8122.z;
        this.field19208 = true;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19206 = class8654.method29499(Class2042.class);
        this.field19202 = class8654.readDouble();
        this.field19203 = class8654.readDouble();
        this.field19204 = class8654.readDouble();
        if (class8654.readBoolean()) {
            this.field19208 = true;
            this.field19205 = class8654.method29501();
            this.field19207 = class8654.method29499(Class2042.class);
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19206);
        class8654.writeDouble(this.field19202);
        class8654.writeDouble(this.field19203);
        class8654.writeDouble(this.field19204);
        class8654.writeBoolean(this.field19208);
        if (this.field19208) {
            class8654.method29505(this.field19205);
            class8654.method29500(this.field19207);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17328(this);
    }
    
    public Class2042 method12857() {
        return this.field19206;
    }
    
    @Nullable
    public Vec3d method12858(final Class1847 class1847) {
        if (!this.field19208) {
            return new Vec3d(this.field19202, this.field19203, this.field19204);
        }
        final Entity method6741 = class1847.method6741(this.field19205);
        return (method6741 != null) ? this.field19207.method8122(method6741) : new Vec3d(this.field19202, this.field19203, this.field19204);
    }
}
