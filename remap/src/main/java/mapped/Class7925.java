// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.VoxelShape;

public class Class7925 implements Class7924
{
    private static String[] field32548;
    private final double field32549;
    private double field32550;
    private double field32551;
    private double field32552;
    private double field32553;
    private VoxelShape field32554;
    public final /* synthetic */ WorldBorder field32555;
    
    public Class7925(final WorldBorder field32555, final double field32556) {
        this.field32555 = field32555;
        this.field32549 = field32556;
        this.method25688();
    }
    
    @Override
    public double method25675() {
        return this.field32550;
    }
    
    @Override
    public double method25677() {
        return this.field32552;
    }
    
    @Override
    public double method25676() {
        return this.field32551;
    }
    
    @Override
    public double method25678() {
        return this.field32553;
    }
    
    @Override
    public double method25679() {
        return this.field32549;
    }
    
    @Override
    public Class2096 method25683() {
        return Class2096.field12144;
    }
    
    @Override
    public double method25680() {
        return 0.0;
    }
    
    @Override
    public long method25681() {
        return 0L;
    }
    
    @Override
    public double method25682() {
        return this.field32549;
    }
    
    private void method25688() {
        this.field32550 = Math.max(this.field32555.method34777() - this.field32549 / 2.0, -WorldBorder.method34812(this.field32555));
        this.field32551 = Math.max(this.field32555.method34778() - this.field32549 / 2.0, -WorldBorder.method34812(this.field32555));
        this.field32552 = Math.min(this.field32555.method34777() + this.field32549 / 2.0, WorldBorder.method34812(this.field32555));
        this.field32553 = Math.min(this.field32555.method34778() + this.field32549 / 2.0, WorldBorder.method34812(this.field32555));
        this.field32554 = VoxelShapes.method24494(VoxelShapes.field30599, VoxelShapes.method24488(Math.floor(this.method25675()), Double.NEGATIVE_INFINITY, Math.floor(this.method25676()), Math.ceil(this.method25677()), Double.POSITIVE_INFINITY, Math.ceil(this.method25678())), Class9306.field39920);
    }
    
    @Override
    public void method25685() {
        this.method25688();
    }
    
    @Override
    public void method25684() {
        this.method25688();
    }
    
    @Override
    public Class7924 method25686() {
        return this;
    }
    
    @Override
    public VoxelShape method25687() {
        return this.field32554;
    }
}
