// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8423
{
    private static String[] field34570;
    public float field34571;
    public float field34572;
    public float field34573;
    public float field34574;
    
    public Class8423(final float field34571, final float field34572, final float field34573) {
        this.field34571 = field34571;
        this.field34572 = field34572;
        this.field34573 = field34573;
        this.field34574 = 0.1f;
    }
    
    public Class8423(final float n, final float n2, final float n3, final float field34574) {
        this(n, n2, n3);
        this.field34574 = field34574;
    }
    
    public float method28124(final float n) {
        if (n != this.field34571) {
            this.field34571 += (n - this.field34571) * this.field34574;
        }
        return this.field34571;
    }
    
    public float method28125(final float n) {
        if (n != this.field34572) {
            this.field34572 += (n - this.field34572) * this.field34574;
        }
        return this.field34572;
    }
    
    public float method28126(final float n) {
        if (n != this.field34573) {
            this.field34573 += (n - this.field34573) * this.field34574;
        }
        return this.field34573;
    }
}
