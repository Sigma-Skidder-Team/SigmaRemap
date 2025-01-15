// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class7255
{
    public static final Class94<Class7099> field28128;
    public final Class9104<Class7255, Class7099> field28129;
    private Class7099 field28130;
    
    public Class7255() {
        final Class9500 class9500 = new Class9500((O)this);
        this.method22145(class9500);
        this.field28129 = class9500.method35380(Class7100::new);
        this.method22147(this.field28129.method32903());
    }
    
    public void method22145(final Class9500<Class7255, Class7099> class9500) {
    }
    
    public Class9104<Class7255, Class7099> method22146() {
        return this.field28129;
    }
    
    public final void method22147(final Class7099 field28130) {
        this.field28130 = field28130;
    }
    
    public final Class7099 method22148() {
        return this.field28130;
    }
    
    public abstract Class3820 method22149();
    
    public void method22150(final Class1847 class1847, final BlockPos class1848, final Class7099 class1849, final Random random) {
    }
    
    public void method22151(final Class1847 class1847, final BlockPos class1848, final Class7099 class1849) {
    }
    
    public void method22152(final Class1847 class1847, final BlockPos class1848, final Class7099 class1849, final Random random) {
    }
    
    @Nullable
    public Class6909 method22153() {
        return null;
    }
    
    public abstract boolean method22154(final Class7099 p0, final Class1855 p1, final BlockPos p2, final Class7255 p3, final Direction p4);
    
    public abstract Vec3d method22155(final Class1855 p0, final BlockPos p1, final Class7099 p2);
    
    public abstract int method22156(final Class1852 p0);
    
    public boolean method22157() {
        return false;
    }
    
    public boolean method22158() {
        return false;
    }
    
    public abstract float method22159();
    
    public abstract float method22160(final Class7099 p0, final Class1855 p1, final BlockPos p2);
    
    public abstract float method22161(final Class7099 p0);
    
    public abstract Class7096 method22162(final Class7099 p0);
    
    public abstract boolean method22163(final Class7099 p0);
    
    public abstract int method22164(final Class7099 p0);
    
    public boolean method22165(final Class7255 class7255) {
        return class7255 == this;
    }
    
    public boolean method22166(final Class7909<Class7255> class7909) {
        return class7909.method25618(this);
    }
    
    public abstract Class7702 method22167(final Class7099 p0, final Class1855 p1, final BlockPos p2);
    
    static {
        field28128 = new Class94<Class7099>();
    }
}
