// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.dispenser.IPosition;

public class Class5493 implements IPosition
{
    private static String[] field22776;
    public final double field22777;
    public final double field22778;
    public final double field22779;
    
    public Class5493(final double field22777, final double field22778, final double field22779) {
        this.field22777 = field22777;
        this.field22778 = field22778;
        this.field22779 = field22779;
    }
    
    @Override
    public double getX() {
        return this.field22777;
    }
    
    @Override
    public double getY() {
        return this.field22778;
    }
    
    @Override
    public double getZ() {
        return this.field22779;
    }
}
