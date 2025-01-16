// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

import java.util.List;

public class Class6731
{
    private static String[] field26464;
    public int field26465;
    public int field26466;
    public List<BlockPos> field26467;
    
    public Class6731(final int field26465, final int field26466, final List<BlockPos> field26467) {
        this.field26465 = field26465;
        this.field26466 = field26466;
        this.field26467 = field26467;
    }
    
    public boolean method20418(final ChunkPos class7859) {
        return class7859.field32290 == this.field26465 && class7859.field32291 == this.field26466;
    }
    
    public int method20419(final ChunkPos class7859) {
        return (int)Math.sqrt((class7859.field32290 - this.field26465) * (class7859.field32290 - this.field26465) + (class7859.field32291 - this.field26466) * (class7859.field32291 - this.field26466));
    }
    
    public ChunkPos method20420() {
        return new ChunkPos(this.field26465, this.field26466);
    }
}
