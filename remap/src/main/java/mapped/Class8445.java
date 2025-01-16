// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8445 implements Class8444
{
    private static String[] field34701;
    private TileEntity field34702;
    
    @Override
    public int method28177() {
        return Config.method28968(this.field34702.getPos(), 0);
    }
    
    @Override
    public BlockPos method28178() {
        return this.field34702.getPos();
    }
    
    @Override
    public String method28180() {
        return Class8477.method28302(this.field34702);
    }
    
    @Override
    public Class3090 method28179() {
        return this.field34702.method2186().method6959(this.field34702.getPos());
    }
    
    @Override
    public int method28181() {
        return -1;
    }
    
    @Override
    public int method28182() {
        return -1;
    }
    
    public TileEntity method28185() {
        return this.field34702;
    }
    
    public void method28186(final TileEntity field34702) {
        this.field34702 = field34702;
    }
}
