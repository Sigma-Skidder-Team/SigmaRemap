// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class Class7746
{
    public final Class759 field31657;
    public final Class1847 field31658;
    public Class9468 field31659;
    public double field31660;
    private final Class7619 field31661;
    public int field31662;
    public int field31663;
    public Vec3d field31664;
    public Vec3d field31665;
    public long field31666;
    public long field31667;
    public double field31668;
    public float field31669;
    public boolean field31670;
    public long field31671;
    public Class4654 field31672;
    private BlockPos field31673;
    private int field31674;
    private float field31675;
    private final Class7914 field31676;
    
    public Class7746(final Class759 field31657, final Class1847 field31658) {
        this.field31664 = Vec3d.field22769;
        this.field31665 = Vec3d.field22769;
        this.field31669 = 0.5f;
        this.field31675 = 1.0f;
        this.field31657 = field31657;
        this.field31658 = field31658;
        this.field31661 = field31657.method2710(Class8107.field33406);
        this.field31676 = this.method24715(MathHelper.floor(this.field31661.method23950() * 16.0));
    }
    
    public void method24712() {
        this.field31675 = 1.0f;
    }
    
    public void method24713(final float field31675) {
        this.field31675 = field31675;
    }
    
    public BlockPos method24714() {
        return this.field31673;
    }
    
    public abstract Class7914 method24715(final int p0);
    
    public void method24716(final double field31660) {
        this.field31660 = field31660;
    }
    
    public boolean method24717() {
        return this.field31670;
    }
    
    public void method24718() {
        if (this.field31658.method6754() - this.field31671 <= 20L) {
            this.field31670 = true;
        }
        else if (this.field31673 != null) {
            this.field31659 = null;
            this.field31659 = this.method24721(this.field31673, this.field31674);
            this.field31671 = this.field31658.method6754();
            this.field31670 = false;
        }
    }
    
    @Nullable
    public final Class9468 method24719(final double n, final double n2, final double n3, final int n4) {
        return this.method24721(new BlockPos(n, n2, n3), n4);
    }
    
    @Nullable
    public Class9468 method24720(final Stream<BlockPos> stream, final int n) {
        return this.method24723((Set<BlockPos>)stream.collect((Collector<? super BlockPos, ?, Set<? super BlockPos>>)Collectors.toSet()), 8, false, n);
    }
    
    @Nullable
    public Class9468 method24721(final BlockPos class354, final int n) {
        return this.method24723((Set<BlockPos>)ImmutableSet.of((Object)class354), 8, false, n);
    }
    
    @Nullable
    public Class9468 method24722(final Entity class399, final int n) {
        return this.method24723((Set<BlockPos>)ImmutableSet.of((Object)new BlockPos(class399)), 16, true, n);
    }
    
    @Nullable
    public Class9468 method24723(final Set<BlockPos> set, final int n, final boolean b, final int field31674) {
        if (set.isEmpty()) {
            return null;
        }
        if (this.field31657.method1941() < 0.0) {
            return null;
        }
        if (this.method24735()) {
            if (this.field31659 != null) {
                if (!this.field31659.method35215()) {
                    if (set.contains(this.field31673)) {
                        return this.field31659;
                    }
                }
            }
            this.field31658.method6796().method15297("pathfind");
            final float n2 = (float)this.field31661.method23950();
            final BlockPos class354 = b ? new BlockPos(this.field31657).method1137() : new BlockPos(this.field31657);
            final int n3 = (int)(n2 + n);
            final Class9468 method25625 = this.field31676.method25625(new Class1854(this.field31658, class354.method1134(-n3, -n3, -n3), class354.method1134(n3, n3, n3)), this.field31657, set, n2, field31674, this.field31675);
            this.field31658.method6796().method15299();
            if (method25625 != null) {
                if (method25625.method35232() != null) {
                    this.field31673 = method25625.method35232();
                    this.field31674 = field31674;
                }
            }
            return method25625;
        }
        return null;
    }
    
    public boolean method24724(final double n, final double n2, final double n3, final double n4) {
        return this.method24726(this.method24719(n, n2, n3, 1), n4);
    }
    
    public boolean method24725(final Entity class399, final double n) {
        final Class9468 method24722 = this.method24722(class399, 1);
        return method24722 != null && this.method24726(method24722, n);
    }
    
    public boolean method24726(final Class9468 field31659, final double field31660) {
        if (field31659 == null) {
            this.field31659 = null;
            return false;
        }
        if (!field31659.method35227(this.field31659)) {
            this.field31659 = field31659;
        }
        if (this.method24731()) {
            return false;
        }
        this.method24737();
        if (this.field31659.method35221() > 0) {
            this.field31660 = field31660;
            final Vec3d method24734 = this.method24734();
            this.field31663 = this.field31662;
            this.field31664 = method24734;
            return true;
        }
        return false;
    }
    
    @Nullable
    public Class9468 method24727() {
        return this.field31659;
    }
    
    public void method24728() {
        ++this.field31662;
        if (this.field31670) {
            this.method24718();
        }
        if (!this.method24731()) {
            if (!this.method24735()) {
                if (this.field31659 != null) {
                    if (this.field31659.method35222() < this.field31659.method35221()) {
                        final Vec3d method24734 = this.method24734();
                        final Vec3d method24735 = this.field31659.method35224(this.field31657, this.field31659.method35222());
                        if (method24734.field22771 > method24735.field22771) {
                            if (!this.field31657.field2404) {
                                if (MathHelper.floor(method24734.field22770) == MathHelper.floor(method24735.field22770)) {
                                    if (MathHelper.floor(method24734.field22772) == MathHelper.floor(method24735.field22772)) {
                                        this.field31659.method35223(this.field31659.method35222() + 1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else {
                this.method24729();
            }
            Class9324.method34535(this.field31658, this.field31657, this.field31659, this.field31669);
            if (!this.method24731()) {
                final Vec3d method24736 = this.field31659.method35225(this.field31657);
                final BlockPos class354 = new BlockPos(method24736);
                this.field31657.method4148().method19907(method24736.field22770, this.field31658.method6701(class354.method1139()).method21706() ? method24736.field22771 : Class4651.method13906(this.field31658, class354), method24736.field22772, this.field31660);
            }
        }
    }
    
    public void method24729() {
        final Vec3d method24734 = this.method24734();
        this.field31669 = ((this.field31657.method1930() <= 0.75f) ? (0.75f - this.field31657.method1930() / 2.0f) : (this.field31657.method1930() / 2.0f));
        final Vec3d method24735 = this.field31659.method35226();
        if (Math.abs(this.field31657.method1938() - (method24735.field22770 + 0.5)) < this.field31669) {
            if (Math.abs(this.field31657.method1945() - (method24735.field22772 + 0.5)) < this.field31669) {
                if (Math.abs(this.field31657.method1941() - method24735.field22771) < 1.0) {
                    this.field31659.method35223(this.field31659.method35222() + 1);
                }
            }
        }
        this.method24730(method24734);
    }
    
    public void method24730(final Vec3d field31664) {
        if (this.field31662 - this.field31663 > 100) {
            if (field31664.method16746(this.field31664) < 2.25) {
                this.method24733();
            }
            this.field31663 = this.field31662;
            this.field31664 = field31664;
        }
        if (this.field31659 != null) {
            if (!this.field31659.method35215()) {
                final Vec3d method35226 = this.field31659.method35226();
                if (!method35226.equals(this.field31665)) {
                    this.field31665 = method35226;
                    final double method35227 = field31664.method16745(this.field31665);
                    this.field31668 = ((this.field31657.method2732() <= 0.0f) ? 0.0 : (method35227 / this.field31657.method2732() * 1000.0));
                }
                else {
                    this.field31666 += Class8349.method27837() - this.field31667;
                }
                if (this.field31668 > 0.0) {
                    if (this.field31666 > this.field31668 * 3.0) {
                        this.field31665 = Vec3d.field22769;
                        this.field31666 = 0L;
                        this.field31668 = 0.0;
                        this.method24733();
                    }
                }
                this.field31667 = Class8349.method27837();
            }
        }
    }
    
    public boolean method24731() {
        return this.field31659 == null || this.field31659.method35215();
    }
    
    public boolean method24732() {
        return !this.method24731();
    }
    
    public void method24733() {
        this.field31659 = null;
    }
    
    public abstract Vec3d method24734();
    
    public abstract boolean method24735();
    
    public boolean method24736() {
        return this.field31657.method1711() || this.field31657.method1723();
    }
    
    public void method24737() {
        if (this.field31659 != null) {
            for (int i = 0; i < this.field31659.method35221(); ++i) {
                final Class6772 method35217 = this.field31659.method35217(i);
                final Class6772 class6772 = (i + 1 >= this.field31659.method35221()) ? null : this.field31659.method35217(i + 1);
                if (this.field31658.method6701(new BlockPos(method35217.field26589, method35217.field26590, method35217.field26591)).method21696() == Class7521.field29400) {
                    this.field31659.method35220(i, method35217.method20665(method35217.field26589, method35217.field26590 + 1, method35217.field26591));
                    if (class6772 != null) {
                        if (method35217.field26590 >= class6772.field26590) {
                            this.field31659.method35220(i + 1, class6772.method20665(class6772.field26589, method35217.field26590 + 1, class6772.field26591));
                        }
                    }
                }
            }
        }
    }
    
    public abstract boolean method24738(final Vec3d p0, final Vec3d p1, final int p2, final int p3, final int p4);
    
    public boolean method24739(final BlockPos class354) {
        final BlockPos method1139 = class354.method1139();
        return this.field31658.method6701(method1139).method21722(this.field31658, method1139);
    }
    
    public Class4654 method24740() {
        return this.field31672;
    }
    
    public void method24741(final boolean b) {
        this.field31672.method13924(b);
    }
    
    public boolean method24742() {
        return this.field31672.method13927();
    }
    
    public void method24743(final BlockPos class354) {
        if (this.field31659 != null) {
            if (!this.field31659.method35215()) {
                if (this.field31659.method35221() != 0) {
                    final Class6772 method35216 = this.field31659.method35216();
                    if (class354.method1082(new Vec3d((method35216.field26589 + this.field31657.method1938()) / 2.0, (method35216.field26590 + this.field31657.method1941()) / 2.0, (method35216.field26591 + this.field31657.method1945()) / 2.0), this.field31659.method35221() - this.field31659.method35222())) {
                        this.method24718();
                    }
                }
            }
        }
    }
}
