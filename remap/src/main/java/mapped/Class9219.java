// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;

import java.util.Map;

public class Class9219
{
    private static String[] field39553;
    public final Vector3f field39554;
    public final Vector3f field39555;
    public final Map<Direction, Class8111> field39556;
    public final Class8225 field39557;
    public final boolean field39558;
    
    public Class9219(final Vector3f field39554, final Vector3f field39555, final Map<Direction, Class8111> field39556, final Class8225 field39557, final boolean field39558) {
        this.field39554 = field39554;
        this.field39555 = field39555;
        this.field39556 = field39556;
        this.field39557 = field39557;
        this.field39558 = field39558;
        this.method34001();
    }
    
    private void method34001() {
        for (final Map.Entry entry : this.field39556.entrySet()) {
            ((Class8111)entry.getValue()).field33426.method28167(this.method34002((Direction)entry.getKey()));
        }
    }
    
    private float[] method34002(final Direction class179) {
        switch (Class7789.field31877[class179.ordinal()]) {
            case 1: {
                return new float[] { this.field39554.getX(), 16.0f - this.field39555.getZ(), this.field39555.getX(), 16.0f - this.field39554.getZ() };
            }
            case 2: {
                return new float[] { this.field39554.getX(), this.field39554.getZ(), this.field39555.getX(), this.field39555.getZ() };
            }
            default: {
                return new float[] { 16.0f - this.field39555.getX(), 16.0f - this.field39555.getY(), 16.0f - this.field39554.getX(), 16.0f - this.field39554.getY() };
            }
            case 4: {
                return new float[] { this.field39554.getX(), 16.0f - this.field39555.getY(), this.field39555.getX(), 16.0f - this.field39554.getY() };
            }
            case 5: {
                return new float[] { this.field39554.getZ(), 16.0f - this.field39555.getY(), this.field39555.getZ(), 16.0f - this.field39554.getY() };
            }
            case 6: {
                return new float[] { 16.0f - this.field39555.getZ(), 16.0f - this.field39555.getY(), 16.0f - this.field39554.getZ(), 16.0f - this.field39554.getY() };
            }
        }
    }
}
