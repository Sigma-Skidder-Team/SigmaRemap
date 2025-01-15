// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.bridge.game.PerformanceMetrics;

public class Class9197 implements PerformanceMetrics
{
    private static String[] field38977;
    private final int field38978;
    private final int field38979;
    private final int field38980;
    private final int field38981;
    
    public Class9197(final int field38978, final int field38979, final int field38980, final int field38981) {
        this.field38978 = field38978;
        this.field38979 = field38979;
        this.field38980 = field38980;
        this.field38981 = field38981;
    }
    
    public int getMinTime() {
        return this.field38978;
    }
    
    public int getMaxTime() {
        return this.field38979;
    }
    
    public int getAverageTime() {
        return this.field38980;
    }
    
    public int getSampleCount() {
        return this.field38981;
    }
}
