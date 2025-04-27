// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class6772
{
    public final int field26589;
    public final int field26590;
    public final int field26591;
    private final int field26592;
    public int field26593;
    public float field26594;
    public float field26595;
    public float field26596;
    public Class6772 field26597;
    public boolean field26598;
    public float field26599;
    public float field26600;
    public Class257 field26601;
    
    public Class6772(final int field26589, final int field26590, final int field26591) {
        this.field26593 = -1;
        this.field26601 = Class257.field1205;
        this.field26589 = field26589;
        this.field26590 = field26590;
        this.field26591 = field26591;
        this.field26592 = method20666(field26589, field26590, field26591);
    }
    
    public Class6772 method20665(final int n, final int n2, final int n3) {
        final Class6772 class6772 = new Class6772(n, n2, n3);
        class6772.field26593 = this.field26593;
        class6772.field26594 = this.field26594;
        class6772.field26595 = this.field26595;
        class6772.field26596 = this.field26596;
        class6772.field26597 = this.field26597;
        class6772.field26598 = this.field26598;
        class6772.field26599 = this.field26599;
        class6772.field26600 = this.field26600;
        class6772.field26601 = this.field26601;
        return class6772;
    }
    
    public static int method20666(final int n, final int n2, final int n3) {
        return (n2 & 0xFF) | (n & 0x7FFF) << 8 | (n3 & 0x7FFF) << 24 | ((n >= 0) ? 0 : Integer.MIN_VALUE) | ((n3 >= 0) ? 0 : 32768);
    }
    
    public float method20667(final Class6772 class6772) {
        final float n = (float)(class6772.field26589 - this.field26589);
        final float n2 = (float)(class6772.field26590 - this.field26590);
        final float n3 = (float)(class6772.field26591 - this.field26591);
        return MathHelper.method35640(n * n + n2 * n2 + n3 * n3);
    }
    
    public float method20668(final Class6772 class6772) {
        final float n = (float)(class6772.field26589 - this.field26589);
        final float n2 = (float)(class6772.field26590 - this.field26590);
        final float n3 = (float)(class6772.field26591 - this.field26591);
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public float method20669(final Class6772 class6772) {
        return Math.abs(class6772.field26589 - this.field26589) + (float)Math.abs(class6772.field26590 - this.field26590) + Math.abs(class6772.field26591 - this.field26591);
    }
    
    public float method20670(final BlockPos class354) {
        return Math.abs(class354.getX() - this.field26589) + (float)Math.abs(class354.getY() - this.field26590) + Math.abs(class354.getZ() - this.field26591);
    }
    
    public BlockPos method20671() {
        return new BlockPos(this.field26589, this.field26590, this.field26591);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class6772) {
            final Class6772 class6772 = (Class6772)o;
            if (this.field26592 == class6772.field26592) {
                if (this.field26589 == class6772.field26589) {
                    if (this.field26590 == class6772.field26590) {
                        return this.field26591 == class6772.field26591;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field26592;
    }
    
    public boolean method20672() {
        return this.field26593 >= 0;
    }
    
    @Override
    public String toString() {
        return "Node{x=" + this.field26589 + ", y=" + this.field26590 + ", z=" + this.field26591 + '}';
    }
    
    public static Class6772 method20673(final PacketBuffer class8654) {
        final Class6772 class8655 = new Class6772(class8654.readInt(), class8654.readInt(), class8654.readInt());
        class8655.field26599 = class8654.readFloat();
        class8655.field26600 = class8654.readFloat();
        class8655.field26598 = class8654.readBoolean();
        class8655.field26601 = Class257.values()[class8654.readInt()];
        class8655.field26596 = class8654.readFloat();
        return class8655;
    }
}
