// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class6739 extends Class6737
{
    private static String[] field26500;
    private static final Vec3d field26501;
    
    public Class6739(final Class1847 class1847, final Class383 class1848) {
        super(class1847, class1848, 0.1f);
        this.field26494 = true;
        this.field26495 = true;
    }
    
    @Override
    public Vec3d method20493(final float n, final float n2) {
        return Class6739.field26501;
    }
    
    @Override
    public Class6346<?> method20488() {
        final Class7064 class7064 = Class8705.field36575.method29874();
        class7064.method21584(Class7521.field29338.method11878());
        class7064.method21585(Class7521.field29174.method11878());
        return Class8705.field36575.method29872(this.field26492, Class7768.field31769.method24875(Class7768.field31769.method24876(this.field26492.method6764()).method16709(Class7102.field27640)), class7064);
    }
    
    @Override
    public boolean method20492() {
        return false;
    }
    
    @Nullable
    @Override
    public BlockPos method20489(final Class7859 class7859, final boolean b) {
        return null;
    }
    
    @Nullable
    @Override
    public BlockPos method20490(final int n, final int n2, final boolean b) {
        return null;
    }
    
    @Override
    public float method20491(final long n, final float n2) {
        return 0.5f;
    }
    
    @Override
    public boolean method20494() {
        return false;
    }
    
    @Override
    public boolean method20495(final int n, final int n2) {
        return true;
    }
    
    @Override
    public Class9375 method20506() {
        return new Class9374(this);
    }
    
    @Override
    public Class383 method20487() {
        return Class383.field2224;
    }
    
    static {
        field26501 = new Vec3d(0.20000000298023224, 0.029999999329447746, 0.029999999329447746);
    }
}
