// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.CubeCoordinateIterator;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

import java.util.function.Consumer;

public class Class7583 extends AbstractSpliterator<VoxelShape>
{
    private static String[] field30080;
    public boolean field30081;
    public final /* synthetic */ Entity field30082;
    public final /* synthetic */ CubeCoordinateIterator field30083;
    public final /* synthetic */ Mutable field30084;
    public final /* synthetic */ ISelectionContext field30085;
    public final /* synthetic */ VoxelShape field30086;
    public final /* synthetic */ Class1853 field30087;
    
    public Class7583(final Class1853 field30087, final long est, final int additionalCharacteristics, final Entity field30088, final CubeCoordinateIterator field30089, final Mutable field30090, final ISelectionContext field30091, final VoxelShape field30092) {
        this.field30087 = field30087;
        this.field30082 = field30088;
        this.field30083 = field30089;
        this.field30084 = field30090;
        this.field30085 = field30091;
        this.field30086 = field30092;
        super(est, additionalCharacteristics);
        this.field30081 = (this.field30082 == null);
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super VoxelShape> consumer) {
        if (!this.field30081) {
            this.field30081 = true;
            final VoxelShape method34783 = this.field30087.getWorldBorder().method34783();
            final boolean method34784 = VoxelShapes.method24496(method34783, VoxelShapes.method24489(this.field30082.getBoundingBox().method18511(1.0E-7)), Class9306.field39924);
            final boolean method34785 = VoxelShapes.method24496(method34783, VoxelShapes.method24489(this.field30082.getBoundingBox().method18496(1.0E-7)), Class9306.field39924);
            if (!method34784) {
                if (method34785) {
                    consumer.accept(method34783);
                    return true;
                }
            }
        }
        while (this.field30083.hasNext()) {
            final int method34786 = this.field30083.getX();
            final int method34787 = this.field30083.getY();
            final int method34788 = this.field30083.getZ();
            final int method34789 = this.field30083.method27305();
            if (method34789 == 3) {
                continue;
            }
            final Class1855 method34790 = this.field30087.method6736(method34786 >> 4, method34788 >> 4);
            if (method34790 == null) {
                continue;
            }
            this.field30084.setPos(method34786, method34787, method34788);
            final BlockState method34791 = method34790.getBlockState(this.field30084);
            if (method34789 == 1 && !method34791.isCollisionShapeLargerThanFullBlock()) {
                continue;
            }
            if (method34789 == 2 && method34791.getBlock() != Class7521.field29264) {
                continue;
            }
            VoxelShape class7702 = method34791.getCollisionShape(this.field30087, this.field30084, this.field30085);
            if (this.field30082 instanceof Class512) {
                final Class5753 class7703 = new Class5753(this.field30084, class7702);
                Class9463.method35173().method35188().method21097(class7703);
                class7702 = class7703.method17065();
                if (class7703.method16962()) {
                    return false;
                }
            }
            final VoxelShape method34792 = class7702.method24541(method34786, method34787, method34788);
            if (!VoxelShapes.method24496(this.field30086, method34792, Class9306.field39924)) {
                continue;
            }
            consumer.accept(method34792);
            return true;
        }
        return false;
    }
}
