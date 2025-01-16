// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;

import java.util.function.Consumer;

public final class Class7584 extends AbstractSpliterator<ChunkPos>
{
    private static String[] field30088;
    private ChunkPos field30089;
    public final /* synthetic */ ChunkPos field30090;
    public final /* synthetic */ ChunkPos field30091;
    public final /* synthetic */ int field30092;
    public final /* synthetic */ int field30093;
    
    public Class7584(final long est, final int additionalCharacteristics, final ChunkPos field30090, final ChunkPos field30091, final int field30092, final int field30093) {
        this.field30090 = field30090;
        this.field30091 = field30091;
        this.field30092 = field30092;
        this.field30093 = field30093;
        super(est, additionalCharacteristics);
    }
    
    @Override
    public boolean tryAdvance(final Consumer<? super ChunkPos> consumer) {
        if (this.field30089 != null) {
            final int field32290 = this.field30089.field32290;
            final int field32291 = this.field30089.field32291;
            if (field32290 != this.field30091.field32290) {
                this.field30089 = new ChunkPos(field32290 + this.field30093, field32291);
            }
            else {
                if (field32291 == this.field30091.field32291) {
                    return false;
                }
                this.field30089 = new ChunkPos(this.field30090.field32290, field32291 + this.field30092);
            }
        }
        else {
            this.field30089 = this.field30090;
        }
        consumer.accept(this.field30089);
        return true;
    }
}
