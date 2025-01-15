// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.CubeCoordinateIterator;

public final class AbstractIterator extends com.google.common.collect.AbstractIterator<BlockPos>
{
    private static String[] field28097;
    public final CubeCoordinateIterator field_218298_a;
    public final Mutable field_218299_b;
    public final /* synthetic */ int field28100;
    public final /* synthetic */ int field28101;
    public final /* synthetic */ int field28102;
    public final /* synthetic */ int field28103;
    public final /* synthetic */ int field28104;
    public final /* synthetic */ int field28105;
    
    public AbstractIterator(final int field28100, final int field28101, final int field28102, final int field28103, final int field28104, final int field28105) {
        this.field28100 = field28100;
        this.field28101 = field28101;
        this.field28102 = field28102;
        this.field28103 = field28103;
        this.field28104 = field28104;
        this.field28105 = field28105;
        this.field_218298_a = new CubeCoordinateIterator(this.field28100, this.field28101, this.field28102, this.field28103, this.field28104, this.field28105);
        this.field_218299_b = new Mutable();
    }
    
    public BlockPos computeNext() {
        return this.field_218298_a.hasNext() ? this.field_218299_b.setPos(this.field_218298_a.getX(), this.field_218298_a.getY(), this.field_218298_a.getZ()) : ((BlockPos)this.endOfData());
    }
}
