// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.CubeCoordinateIterator;

import java.util.function.Consumer;

public final class Class7580 extends AbstractSpliterator<BlockPos>
{
    private static String[] field30060;
    public final CubeCoordinateIterator field30061;
    public final Mutable field30062;
    public final /* synthetic */ int field30063;
    public final /* synthetic */ int field30064;
    public final /* synthetic */ int field30065;
    public final /* synthetic */ int field30066;
    public final /* synthetic */ int field30067;
    public final /* synthetic */ int field30068;
    
    public Class7580(final long est, final int additionalCharacteristics, final int field30063, final int field30064, final int field30065, final int field30066, final int field30067, final int field30068) {
        this.field30063 = field30063;
        this.field30064 = field30064;
        this.field30065 = field30065;
        this.field30066 = field30066;
        this.field30067 = field30067;
        this.field30068 = field30068;
        super(est, additionalCharacteristics);
        this.field30061 = new CubeCoordinateIterator(this.field30063, this.field30064, this.field30065, this.field30066, this.field30067, this.field30068);
        this.field30062 = new Mutable();
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super BlockPos> consumer) {
        if (!this.field30061.hasNext()) {
            return false;
        }
        consumer.accept(this.field30062.setPos(this.field30061.getX(), this.field30061.getY(), this.field30061.getZ()));
        return true;
    }
}
