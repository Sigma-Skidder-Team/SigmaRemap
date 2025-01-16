// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import net.minecraft.util.math.ChunkPos;

public class Class6798 implements IChunkLoadingError
{
    public final /* synthetic */ int field26733;
    public final /* synthetic */ int field26734;
    public final /* synthetic */ int field26735;
    public final /* synthetic */ int field26736;
    public final /* synthetic */ Either field26737;
    public final /* synthetic */ Class388 field26738;
    
    public Class6798(final Class388 field26738, final int field26739, final int field26740, final int field26741, final int field26742, final Either field26743) {
        this.field26738 = field26738;
        this.field26733 = field26739;
        this.field26734 = field26740;
        this.field26735 = field26741;
        this.field26736 = field26742;
        this.field26737 = field26743;
    }
    
    @Override
    public String toString() {
        return "Unloaded " + new ChunkPos(this.field26733 + this.field26734 % (this.field26735 * 2 + 1), this.field26736 + this.field26734 / (this.field26735 * 2 + 1)) + " " + this.field26737.right().get().toString();
    }
}
