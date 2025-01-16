// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public final class PartSplitVoxelShape extends VoxelShapePart
{
    private final VoxelShapePart part;
    private final int startX;
    private final int startY;
    private final int startZ;
    private final int endX;
    private final int endY;
    private final int endZ;
    
    public PartSplitVoxelShape(final VoxelShapePart part, final int startX, final int startY, final int startZ, final int endX, final int endY, final int endZ) {
        super(endX - startX, endY - startY, endZ - startZ);
        this.part = part;
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.endX = endX;
        this.endY = endY;
        this.endZ = endZ;
    }
    
    @Override
    public boolean isFilled(final int n, final int n2, final int n3) {
        return this.part.isFilled(this.startX + n, this.startY + n2, this.startZ + n3);
    }
    
    @Override
    public void setFilled(final int n, final int n2, final int n3, final boolean b, final boolean b2) {
        this.part.setFilled(this.startX + n, this.startY + n2, this.startZ + n3, b, b2);
    }
    
    @Override
    public int getStart(final Direction.Axis class111) {
        return Math.max(0, this.part.getStart(class111) - class111.getCoordinate(this.startX, this.startY, this.startZ));
    }
    
    @Override
    public int getEnd(final Direction.Axis class111) {
        return Math.min(class111.getCoordinate(this.endX, this.endY, this.endZ), this.part.getEnd(class111) - class111.getCoordinate(this.startX, this.startY, this.startZ));
    }
}
