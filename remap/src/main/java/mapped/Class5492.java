// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5492 implements Class5491
{
    private static String[] field22773;
    private final World field22774;
    private final BlockPos field22775;
    
    public Class5492(final World field22774, final BlockPos field22775) {
        this.field22774 = field22774;
        this.field22775 = field22775;
    }
    
    @Override
    public World method16763() {
        return this.field22774;
    }
    
    @Override
    public double getX() {
        return this.field22775.getX() + 0.5;
    }
    
    @Override
    public double getY() {
        return this.field22775.getY() + 0.5;
    }
    
    @Override
    public double getZ() {
        return this.field22775.getZ() + 0.5;
    }
    
    @Override
    public BlockPos method16764() {
        return this.field22775;
    }
    
    @Override
    public Class7096 method16765() {
        return this.field22774.method6701(this.field22775);
    }
    
    @Override
    public <T extends Class436> T method16766() {
        return (T)this.field22774.method6727(this.field22775);
    }
}
