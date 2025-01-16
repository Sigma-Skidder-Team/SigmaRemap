// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class2360 extends Class2359
{
    private final BlockPos field14146;
    private final BlockPos field14147;
    private final long field14148;
    
    private Class2360() {
        super("TestBlockPosException");
        this.field14146 = new BlockPos(0, 0, 0);
        this.field14147 = new BlockPos(0, 0, 0);
        this.field14148 = 0L;
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() + " at " + ("" + this.field14146.getX() + "," + this.field14146.getY() + "," + this.field14146.getZ() + " (relative: " + this.field14147.getX() + "," + this.field14147.getY() + "," + this.field14147.getZ() + ")") + " (t=" + this.field14148 + ")";
    }
    
    @Nullable
    public String method9496() {
        return super.getMessage() + " here";
    }
    
    @Nullable
    public BlockPos method9497() {
        return this.field14146;
    }
}
