// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.IdentityHashMap;
import java.util.Map;

public class Class9497
{
    public int field40850;
    public boolean field40851;
    private final Map[] field40852;
    
    public Class9497(final String str) {
        this.field40850 = 1;
        this.field40851 = false;
        this.field40852 = new Map[8];
        if (!str.equals("4")) {
            if (!str.equals("2")) {
                if (!str.equals("F")) {
                    if (!str.equals("4F")) {
                        if (!str.equals("2F")) {
                            Config.warn("NaturalTextures: Unknown type: " + str);
                        }
                        else {
                            this.field40850 = 2;
                            this.field40851 = true;
                        }
                    }
                    else {
                        this.field40850 = 4;
                        this.field40851 = true;
                    }
                }
                else {
                    this.field40851 = true;
                }
            }
            else {
                this.field40850 = 2;
            }
        }
        else {
            this.field40850 = 4;
        }
    }
    
    public boolean method35356() {
        return this.field40850 == 2 || this.field40850 == 4 || this.field40851;
    }
    
    public synchronized Class8754 method35357(final Class8754 class8754, final int n, final boolean b) {
        int n2 = n;
        if (b) {
            n2 = (n | 0x4);
        }
        if (n2 > 0 && n2 < this.field40852.length) {
            Map map = this.field40852[n2];
            if (map == null) {
                map = new IdentityHashMap(1);
                this.field40852[n2] = map;
            }
            Class8754 method35358 = map.get(class8754);
            if (method35358 == null) {
                method35358 = this.method35358(class8754, n, b);
                map.put(class8754, method35358);
            }
            return method35358;
        }
        return class8754;
    }
    
    private Class8754 method35358(final Class8754 class8754, int n, final boolean b) {
        final int[] method30291 = class8754.method30291();
        final int method30292 = class8754.method30293();
        final Direction method30293 = class8754.method30294();
        final TextureAtlasSprite method30294 = class8754.method30295();
        if (!this.method35360(class8754)) {
            n = 0;
        }
        return new Class8754(this.method35359(method30291, n, b), method30292, method30293, method30294);
    }
    
    private int[] method35359(final int[] array, final int n, final boolean b) {
        final int[] array2 = array.clone();
        int n2 = 4 - n;
        if (b) {
            n2 += 3;
        }
        int n3 = n2 % 4;
        final int n4 = array2.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n5 = i * n4;
            final int n6 = n3 * n4;
            array2[n6 + 4] = array[n5 + 4];
            array2[n6 + 4 + 1] = array[n5 + 4 + 1];
            if (!b) {
                if (++n3 > 3) {
                    n3 = 0;
                }
            }
            else if (--n3 < 0) {
                n3 = 3;
            }
        }
        return array2;
    }
    
    private boolean method35360(final Class8754 class8754) {
        final TextureAtlasSprite method30295 = class8754.method30295();
        final float method30296 = method30295.method7497();
        final float method30297 = method30295.method7498();
        final float n = (method30297 - method30296) / 256.0f;
        final float method30298 = method30295.method7500();
        final float method30299 = method30295.method7501();
        final float n2 = (method30299 - method30298) / 256.0f;
        final int[] method30300 = class8754.method30291();
        final int n3 = method30300.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n4 = i * n3;
            final float intBitsToFloat = Float.intBitsToFloat(method30300[n4 + 4]);
            final float intBitsToFloat2 = Float.intBitsToFloat(method30300[n4 + 4 + 1]);
            if (!this.method35361(intBitsToFloat, method30296, n) && !this.method35361(intBitsToFloat, method30297, n)) {
                return false;
            }
            if (!this.method35361(intBitsToFloat2, method30298, n2) && !this.method35361(intBitsToFloat2, method30299, n2)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean method35361(final float n, final float n2, final float n3) {
        return MathHelper.method35647(n - n2) < n3;
    }
}
