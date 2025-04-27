// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;
import java.util.logging.Level;

public class Class9335
{
    private static final float field40080 = -9.765625E-4f;
    private static final float field40081 = -1024.0f;
    private static final int field40082 = 672;
    private static final float field40083 = 0.953125f;
    private static final float field40084 = 0.90625f;
    private boolean field40085;
    private int field40086;
    private boolean[] field40087;
    private final Class8417[] field40088;
    
    public Class9335() {
        this.field40088 = new Class8417[672];
        this.method34585();
    }
    
    public void method34581(final Class8157 class8157, final int a, final Class2077 class8158) throws AACException {
        class8158.method8185();
        if (this.field40085 = class8157.method26942()) {
            this.field40086 = class8157.method26940(5);
        }
        final int method8184 = class8158.method8184();
        final int min = Math.min(a, method8184);
        this.field40087 = new boolean[min];
        for (int i = 0; i < min; ++i) {
            this.field40087[i] = class8157.method26942();
        }
        Class4178.field18616.log(Level.WARNING, "ICPrediction: maxSFB={0}, maxPredSFB={1}", new int[] { a, method8184 });
    }
    
    public void method34582(final int n) {
        this.field40087[n] = false;
    }
    
    public void method34583(final Class4192 class4192, final float[] array, final Class2077 class4193) {
        final Class4182 method12588 = class4192.method12588();
        if (!method12588.method12557()) {
            final int min = Math.min(class4193.method8184(), method12588.method12549());
            final int[] method12589 = method12588.method12551();
            for (int i = 0; i < min; ++i) {
                for (int j = method12589[i]; j < method12589[i + 1]; ++j) {
                    this.method34587(array, j, this.field40087[i]);
                }
            }
            if (this.field40085) {
                this.method34586(this.field40086);
            }
        }
        else {
            this.method34585();
        }
    }
    
    private void method34584(final int n) {
        if (this.field40088[n] == null) {
            this.field40088[n] = new Class8417(null);
        }
        this.field40088[n].field34560 = 0.0f;
        this.field40088[n].field34561 = 0.0f;
        this.field40088[n].field34556 = 0.0f;
        this.field40088[n].field34557 = 0.0f;
        this.field40088[n].field34558 = 16256.0f;
        this.field40088[n].field34559 = 16256.0f;
    }
    
    private void method34585() {
        for (int i = 0; i < this.field40088.length; ++i) {
            this.method34584(i);
        }
    }
    
    private void method34586(final int n) {
        for (int i = n - 1; i < this.field40088.length; i += 30) {
            this.method34584(i);
        }
    }
    
    private void method34587(final float[] array, final int n, final boolean b) {
        if (this.field40088[n] == null) {
            this.field40088[n] = new Class8417(null);
        }
        final Class8417 class8417 = this.field40088[n];
        final float field34560 = class8417.field34560;
        final float field34561 = class8417.field34561;
        final float field34562 = class8417.field34556;
        final float field34563 = class8417.field34557;
        final float field34564 = class8417.field34558;
        final float field34565 = class8417.field34559;
        final float n2 = (field34564 <= 1.0f) ? 0.0f : (field34562 * this.method34589(0.953125f / field34564));
        final float method34588 = this.method34588(n2 * field34560 + ((field34565 <= 1.0f) ? 0.0f : (field34563 * this.method34589(0.953125f / field34565))) * field34561);
        if (b) {
            array[n] += method34588 * -9.765625E-4f;
        }
        final float n3 = array[n] * -1024.0f;
        final float n4 = n3 - n2 * field34560;
        class8417.field34557 = this.method34590(0.90625f * field34563 + field34561 * n4);
        class8417.field34559 = this.method34590(0.90625f * field34565 + 0.5f * (field34561 * field34561 + n4 * n4));
        class8417.field34556 = this.method34590(0.90625f * field34562 + field34560 * n3);
        class8417.field34558 = this.method34590(0.90625f * field34564 + 0.5f * (field34560 * field34560 + n3 * n3));
        class8417.field34561 = this.method34590(0.953125f * (field34560 - n2 * n3));
        class8417.field34560 = this.method34590(0.953125f * n3);
    }
    
    private float method34588(final float value) {
        return Float.intBitsToFloat(Float.floatToIntBits(value) + 32768 & 0xFFFF0000);
    }
    
    private float method34589(final float value) {
        final int floatToIntBits = Float.floatToIntBits(value);
        return Float.intBitsToFloat(floatToIntBits + 32767 + (floatToIntBits & 0x1) & 0xFFFF0000);
    }
    
    private float method34590(final float value) {
        return Float.intBitsToFloat(Float.floatToIntBits(value) & 0xFFFF0000);
    }
}
