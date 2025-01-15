// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.Optional;
import javax.annotation.Nullable;
import java.util.Random;

public class Class448 extends Class436 implements Class447, Class439
{
    private final Class2265<Class8321> field2686;
    private final int[] field2687;
    private final int[] field2688;
    
    public Class448() {
        super(Class5412.field22572);
        this.field2686 = Class2265.method8507(4, Class8321.field34174);
        this.field2687 = new int[4];
        this.field2688 = new int[4];
    }
    
    @Override
    public void method2229() {
        final boolean booleanValue = this.method2194().method21772((Class7111<Boolean>)Class3918.field17760);
        if (!this.field2656.field10067) {
            if (!booleanValue) {
                for (int i = 0; i < this.field2686.size(); ++i) {
                    if (this.field2687[i] > 0) {
                        this.field2687[i] = MathHelper.method35651(this.field2687[i] - 2, 0, this.field2688[i]);
                    }
                }
            }
            else {
                this.method2268();
            }
        }
        else if (booleanValue) {
            this.method2269();
        }
    }
    
    private void method2268() {
        for (int i = 0; i < this.field2686.size(); ++i) {
            final Class8321 other = this.field2686.get(i);
            if (!other.method27620()) {
                final int[] field2687 = this.field2687;
                final int n = i;
                ++field2687[n];
                if (this.field2687[i] >= this.field2688[i]) {
                    final Class8321 class8321 = this.field2656.method6792().method6378(Class8976.field37847, new Class443(new Class8321[] { other }), this.field2656).map(class8323 -> class8323.method11290(class8322)).orElse(other);
                    final BlockPos method2193 = this.method2193();
                    Class9193.method33642(this.field2656, method2193.getX(), method2193.getY(), method2193.getZ(), class8321);
                    this.field2686.set(i, Class8321.field34174);
                    this.method2274();
                }
            }
        }
    }
    
    private void method2269() {
        final Class1847 method2186 = this.method2186();
        if (method2186 != null) {
            final BlockPos method2187 = this.method2193();
            final Random field10062 = method2186.field10062;
            if (field10062.nextFloat() < 0.11f) {
                for (int i = 0; i < field10062.nextInt(2) + 2; ++i) {
                    Class3918.method12032(method2186, method2187, this.method2194().method21772((Class7111<Boolean>)Class3918.field17761), false);
                }
            }
            final int method2188 = this.method2194().method21772((Class7111<Direction>)Class3918.field17763).getHorizontalIndex();
            for (int j = 0; j < this.field2686.size(); ++j) {
                if (!this.field2686.get(j).method27620()) {
                    if (field10062.nextFloat() < 0.2f) {
                        final Direction method2189 = Direction.byHorizontalIndex(Math.floorMod(j + method2188, 4));
                        final double n = method2187.getX() + 0.5 - method2189.getXOffset() * 0.3125f + method2189.rotateY().getXOffset() * 0.3125f;
                        final double n2 = method2187.getY() + 0.5;
                        final double n3 = method2187.getZ() + 0.5 - method2189.getZOffset() * 0.3125f + method2189.rotateY().getZOffset() * 0.3125f;
                        for (int k = 0; k < 4; ++k) {
                            method2186.method6709(Class8432.field34639, n, n2, n3, 0.0, 5.0E-4, 0.0);
                        }
                    }
                }
            }
        }
    }
    
    public Class2265<Class8321> method2270() {
        return this.field2686;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        this.field2686.clear();
        Class8508.method28426(class51, this.field2686);
        if (class51.method316("CookingTimes", 11)) {
            final int[] method325 = class51.method325("CookingTimes");
            System.arraycopy(method325, 0, this.field2687, 0, Math.min(this.field2688.length, method325.length));
        }
        if (class51.method316("CookingTotalTimes", 11)) {
            final int[] method326 = class51.method325("CookingTotalTimes");
            System.arraycopy(method326, 0, this.field2688, 0, Math.min(this.field2688.length, method326.length));
        }
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        this.method2271(class51);
        class51.method308("CookingTimes", this.field2687);
        class51.method308("CookingTotalTimes", this.field2688);
        return class51;
    }
    
    private Class51 method2271(final Class51 class51) {
        super.method2180(class51);
        Class8508.method28425(class51, this.field2686, true);
        return class51;
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 13, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2271(new Class51());
    }
    
    public Optional<Class3682> method2272(final Class8321 class8321) {
        return this.field2686.stream().noneMatch(Class8321::method27620) ? Optional.empty() : this.field2656.method6792().method6378(Class8976.field37847, new Class443(new Class8321[] { class8321 }), this.field2656);
    }
    
    public boolean method2273(final Class8321 class8321, final int n) {
        for (int i = 0; i < this.field2686.size(); ++i) {
            if (this.field2686.get(i).method27620()) {
                this.field2688[i] = n;
                this.field2687[i] = 0;
                this.field2686.set(i, class8321.method27621(1));
                this.method2274();
                return true;
            }
        }
        return false;
    }
    
    private void method2274() {
        this.method2161();
        this.method2186().method6693(this.method2193(), this.method2194(), this.method2194(), 3);
    }
    
    @Override
    public void method2164() {
        this.field2686.clear();
    }
    
    public void method2275() {
        if (!this.method2186().field10067) {
            Class9193.method33641(this.method2186(), this.method2193(), this.method2270());
        }
        this.method2274();
    }
}
