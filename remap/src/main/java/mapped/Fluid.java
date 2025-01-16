// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class Fluid
{
    public static final Class94<IFluidState> field28128;
    public final StateContainer<Fluid, IFluidState> field28129;
    private IFluidState field28130;
    
    public Fluid() {
        final Class9500 class9500 = new Class9500((O)this);
        this.method22145(class9500);
        this.field28129 = class9500.method35380(Class7100::new);
        this.method22147(this.field28129.method32903());
    }
    
    public void method22145(final Class9500<Fluid, IFluidState> class9500) {
    }
    
    public StateContainer<Fluid, IFluidState> method22146() {
        return this.field28129;
    }
    
    public final void method22147(final IFluidState field28130) {
        this.field28130 = field28130;
    }
    
    public final IFluidState method22148() {
        return this.field28130;
    }
    
    public abstract Item method22149();
    
    public void method22150(final World class1847, final BlockPos class1848, final IFluidState class1849, final Random random) {
    }
    
    public void method22151(final World class1847, final BlockPos class1848, final IFluidState class1849) {
    }
    
    public void method22152(final World class1847, final BlockPos class1848, final IFluidState class1849, final Random random) {
    }
    
    @Nullable
    public Class6909 method22153() {
        return null;
    }
    
    public abstract boolean method22154(final IFluidState p0, final Class1855 p1, final BlockPos p2, final Fluid p3, final Direction p4);
    
    public abstract Vec3d method22155(final Class1855 p0, final BlockPos p1, final IFluidState p2);
    
    public abstract int method22156(final Class1852 p0);
    
    public boolean method22157() {
        return false;
    }
    
    public boolean method22158() {
        return false;
    }
    
    public abstract float method22159();
    
    public abstract float method22160(final IFluidState p0, final Class1855 p1, final BlockPos p2);
    
    public abstract float method22161(final IFluidState p0);
    
    public abstract BlockState method22162(final IFluidState p0);
    
    public abstract boolean method22163(final IFluidState p0);
    
    public abstract int method22164(final IFluidState p0);
    
    public boolean method22165(final Fluid class7255) {
        return class7255 == this;
    }
    
    public boolean method22166(final Class7909<Fluid> class7909) {
        return class7909.method25618(this);
    }
    
    public abstract VoxelShape method22167(final IFluidState p0, final Class1855 p1, final BlockPos p2);
    
    static {
        field28128 = new Class94<IFluidState>();
    }
}
