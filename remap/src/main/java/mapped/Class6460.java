// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.ChunkStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6460 implements Class6459
{
    private static final Logger field25667;
    private final int field25668;
    private int field25669;
    private long field25670;
    private long field25671;
    
    public Class6460(final int n) {
        this.field25671 = Long.MAX_VALUE;
        final int n2 = n * 2 + 1;
        this.field25668 = n2 * n2;
    }
    
    @Override
    public void method19317(final ChunkPos class7859) {
        this.field25671 = Util.method27837();
        this.field25670 = this.field25671;
    }
    
    @Override
    public void method19318(final ChunkPos class7859, final ChunkStatus class7860) {
        if (class7860 == ChunkStatus.FULL) {
            ++this.field25669;
        }
        final int method19322 = this.method19322();
        if (Util.method27837() > this.field25671) {
            this.field25671 += 500L;
            Class6460.field25667.info(new Class2259("menu.preparingSpawn", MathHelper.method35651(method19322, 0, 100)).getString());
        }
    }
    
    @Override
    public void method19319() {
        Class6460.field25667.info("Time elapsed: {} ms", Util.method27837() - this.field25670);
        this.field25671 = Long.MAX_VALUE;
    }
    
    public int method19322() {
        return MathHelper.method35642(this.field25669 * 100.0f / this.field25668);
    }
    
    static {
        field25667 = LogManager.getLogger();
    }
}
