// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;

public class Class9496
{
    private static String[] field40843;
    private float field40844;
    private float field40845;
    private float field40846;
    private float field40847;
    private float field40848;
    private float field40849;
    
    public Class9496(final int[] array) {
        this.field40844 = Float.MAX_VALUE;
        this.field40845 = Float.MAX_VALUE;
        this.field40846 = Float.MAX_VALUE;
        this.field40847 = -3.4028235E38f;
        this.field40848 = -3.4028235E38f;
        this.field40849 = -3.4028235E38f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i * n;
            final float intBitsToFloat = Float.intBitsToFloat(array[n2 + 0]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array[n2 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array[n2 + 2]);
            if (this.field40844 > intBitsToFloat) {
                this.field40844 = intBitsToFloat;
            }
            if (this.field40845 > intBitsToFloat2) {
                this.field40845 = intBitsToFloat2;
            }
            if (this.field40846 > intBitsToFloat3) {
                this.field40846 = intBitsToFloat3;
            }
            if (this.field40847 < intBitsToFloat) {
                this.field40847 = intBitsToFloat;
            }
            if (this.field40848 < intBitsToFloat2) {
                this.field40848 = intBitsToFloat2;
            }
            if (this.field40849 < intBitsToFloat3) {
                this.field40849 = intBitsToFloat3;
            }
        }
    }
    
    public float method35348() {
        return this.field40844;
    }
    
    public float method35349() {
        return this.field40845;
    }
    
    public float method35350() {
        return this.field40846;
    }
    
    public float method35351() {
        return this.field40847;
    }
    
    public float method35352() {
        return this.field40848;
    }
    
    public float method35353() {
        return this.field40849;
    }
    
    public boolean method35354(final Direction class179) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (Class9291.field39852[class179.ordinal()]) {
            case 1: {
                n = this.method35349();
                n2 = this.method35352();
                n3 = 0.0f;
                break;
            }
            case 2: {
                n = this.method35349();
                n2 = this.method35352();
                n3 = 1.0f;
                break;
            }
            case 3: {
                n = this.method35350();
                n2 = this.method35353();
                n3 = 0.0f;
                break;
            }
            case 4: {
                n = this.method35350();
                n2 = this.method35353();
                n3 = 1.0f;
                break;
            }
            case 5: {
                n = this.method35348();
                n2 = this.method35351();
                n3 = 0.0f;
                break;
            }
            case 6: {
                n = this.method35348();
                n2 = this.method35351();
                n3 = 1.0f;
                break;
            }
            default: {
                return false;
            }
        }
        return n == n3 && n2 == n3;
    }
    
    public boolean method35355(final Direction class179) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        switch (Class9291.field39852[class179.ordinal()]) {
            case 1:
            case 2: {
                n = this.method35348();
                n2 = this.method35351();
                n3 = this.method35350();
                n4 = this.method35353();
                break;
            }
            case 3:
            case 4: {
                n = this.method35348();
                n2 = this.method35351();
                n3 = this.method35349();
                n4 = this.method35352();
                break;
            }
            case 5:
            case 6: {
                n = this.method35349();
                n2 = this.method35352();
                n3 = this.method35350();
                n4 = this.method35353();
                break;
            }
            default: {
                return false;
            }
        }
        return n == 0.0f && n2 == 1.0f && n3 == 0.0f && n4 == 1.0f;
    }
}
