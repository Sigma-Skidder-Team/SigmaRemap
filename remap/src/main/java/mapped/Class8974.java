// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.stream.Collectors;
import com.google.common.collect.Sets;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class Class8974
{
    public final AtomicReference<Class9006> field37809;
    private Class1945 field37810;
    private Class1946 field37811;
    private final Set<Class436> field37812;
    private final Map<Class6332, Class1918> field37813;
    public AxisAlignedBB field37814;
    private int field37815;
    private boolean field37816;
    private final Mutable field37817;
    private final Mutable[] field37818;
    private boolean field37819;
    private final boolean field37820;
    private final boolean field37821;
    private boolean field37822;
    public int field37823;
    public int field37824;
    private final Class8974[] field37825;
    private boolean field37826;
    private Class1862 field37827;
    private Class8974[] field37828;
    private Class8974[] field37829;
    private boolean field37830;
    private Class9071 field37831;
    public Class6222 field37832;
    public final /* synthetic */ Class7520 field37833;
    
    public Class8974(final Class7520 field37833) {
        this.field37833 = field37833;
        this.field37809 = new AtomicReference<Class9006>(Class9006.field38022);
        this.field37812 = Sets.newHashSet();
        this.field37813 = Class6332.method18795().stream().collect(Collectors.toMap(class6332 -> class6332, p0 -> new Class1918(Class9237.field39607)));
        this.field37815 = -1;
        this.field37816 = true;
        this.field37817 = new Mutable(-1, -1, -1);
        this.field37818 = Class8349.method27851(new Mutable[6], array -> {
            int i = 0;
            while (i < array.length) {
                array[i] = new Mutable();
                ++i;
            }
            return;
        });
        this.field37820 = Class8571.method28836();
        this.field37821 = !Class9570.field41178.method22623();
        this.field37822 = false;
        this.field37825 = new Class8974[6];
        this.field37826 = false;
        this.field37828 = new Class8974[Direction.VALUES.length];
        this.field37829 = new Class8974[Direction.VALUES.length];
        this.field37830 = false;
        this.field37831 = new Class9071(this, null, 0);
    }
    
    private boolean method31863(final BlockPos class354) {
        return Class7520.method23478(this.field37833).method6687(class354.getX() >> 4, class354.getZ() >> 4, Class9312.field39989, false) != null;
    }
    
    public boolean method31864() {
        if (Math.sqrt(this.method31868()) <= Class869.method5277().field4648.field23382 * 16 && Class9463.method35173().method35192().method28375()) {
            return true;
        }
        if (this.method31868() > 576.0) {
            if (this.method31863(this.field37818[Direction.WEST.ordinal()])) {
                if (this.method31863(this.field37818[Direction.NORTH.ordinal()])) {
                    if (this.method31863(this.field37818[Direction.EAST.ordinal()])) {
                        if (this.method31863(this.field37818[Direction.SOUTH.ordinal()])) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public boolean method31865(final int field37815) {
        if (this.field37815 != field37815) {
            this.field37815 = field37815;
            return true;
        }
        return false;
    }
    
    public Class1918 method31866(final Class6332 class6332) {
        return this.field37813.get(class6332);
    }
    
    public void method31867(final int n, final int n2, final int n3) {
        if (n == this.field37817.getX()) {
            if (n2 == this.field37817.getY()) {
                if (n3 == this.field37817.getZ()) {
                    return;
                }
            }
        }
        this.method31871();
        this.field37817.setPos(n, n2, n3);
        final int n4 = 8;
        this.field37823 = n >> n4 << n4;
        this.field37824 = n3 >> n4 << n4;
        this.field37814 = new AxisAlignedBB(n, n2, n3, n + 16, n2 + 16, n3 + 16);
        for (final Direction class179 : Direction.VALUES) {
            this.field37818[class179.ordinal()].method1287(this.field37817).method1291(class179, 16);
        }
        this.field37826 = false;
        this.field37830 = false;
        for (int j = 0; j < this.field37828.length; ++j) {
            final Class8974 class180 = this.field37828[j];
            if (class180 != null) {
                class180.field37830 = false;
            }
        }
        this.field37827 = null;
        this.field37832 = null;
    }
    
    public double method31868() {
        final Class6092 method5833 = Class869.method5277().field4644.method5833();
        final double n = this.field37814.field25073 + 8.0 - method5833.method18161().x;
        final double n2 = this.field37814.field25074 + 8.0 - method5833.method18161().y;
        final double n3 = this.field37814.field25075 + 8.0 - method5833.method18161().z;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    private void method31869(final Class4148 class4148) {
        class4148.method12390(7, Class9237.field39607);
    }
    
    public Class9006 method31870() {
        return this.field37809.get();
    }
    
    private void method31871() {
        this.method31880();
        this.field37809.set(Class9006.field38022);
        this.field37816 = true;
    }
    
    public void method31872() {
        this.method31871();
        this.field37813.values().forEach(Class1918::close);
    }
    
    public BlockPos method31873() {
        return this.field37817;
    }
    
    public void method31874(final boolean b) {
        final boolean field37816 = this.field37816;
        this.field37816 = true;
        this.field37819 = (b | (field37816 && this.field37819));
        if (this.method31885()) {
            this.field37822 = true;
        }
    }
    
    public void method31875() {
        this.field37816 = false;
        this.field37819 = false;
        this.field37822 = false;
    }
    
    public boolean method31876() {
        return this.field37816;
    }
    
    public boolean method31877() {
        return this.field37816 && this.field37819;
    }
    
    public BlockPos method31878(final Direction class179) {
        return this.field37818[class179.ordinal()];
    }
    
    public boolean method31879(final Class6332 class6332, final Class7520 class6333) {
        final Class9006 method31870 = this.method31870();
        if (this.field37811 != null) {
            this.field37811.method7895();
        }
        if (Class9006.method32219(method31870).contains(class6332)) {
            if (!Class7520.method23479()) {
                this.field37811 = new Class1946(this, this.method31868(), method31870);
            }
            else {
                this.field37811 = new Class1946(this, new Class7859(this.method31873()), this.method31868(), method31870);
            }
            class6333.method23460(this.field37811);
            return true;
        }
        return false;
    }
    
    public void method31880() {
        if (this.field37810 != null) {
            this.field37810.method7895();
            this.field37810 = null;
        }
        if (this.field37811 != null) {
            this.field37811.method7895();
            this.field37811 = null;
        }
    }
    
    public Class1944 method31881() {
        this.method31880();
        this.field37817.toImmutable();
        final Class1858 class1858 = null;
        if (!Class7520.method23479()) {
            this.field37810 = new Class1945(this, this.method31868(), class1858);
        }
        else {
            this.field37810 = new Class1945(this, new Class7859(this.method31873()), this.method31868(), class1858);
        }
        return this.field37810;
    }
    
    public void method31882(final Class7520 class7520) {
        class7520.method23460(this.method31881());
    }
    
    private void method31883(final Set<Class436> set) {
        final HashSet hashSet = Sets.newHashSet((Iterable)set);
        final HashSet hashSet2 = Sets.newHashSet((Iterable)this.field37812);
        hashSet.removeAll(this.field37812);
        hashSet2.removeAll(set);
        this.field37812.clear();
        this.field37812.addAll(set);
        Class7520.method23480(this.field37833).method5775(hashSet2, hashSet);
    }
    
    public void method31884() {
        this.method31881().method7894(Class7520.method23481(this.field37833));
    }
    
    private boolean method31885() {
        return Class7520.method23478(this.field37833) instanceof Class1848 && ((Class1848)Class7520.method23478(this.field37833)).method6837();
    }
    
    public boolean method31886() {
        return this.field37822;
    }
    
    private Class6332[] method31887(final Class7099 class7099, final Class6332[] array) {
        if (!Class7520.method23482()) {
            array[0] = Class7969.method25827(class7099);
            return array;
        }
        return Class7520.field29141;
    }
    
    private Class6332[] method31888(final Class7096 class7096, final Class6332[] array) {
        if (!Class7520.method23483()) {
            array[0] = Class7969.method25824(class7096);
            return array;
        }
        return Class7520.field29141;
    }
    
    private Class6332 method31889(final Class1855 class1855, final Class7096 class1856, final BlockPos class1857, final Class6332 class1858) {
        if (Class8929.method31490()) {
            final Class6332 method31486 = Class8929.method31486(class1855, class1856, class1857);
            if (method31486 != null) {
                return method31486;
            }
        }
        if (this.field37821) {
            if (!this.field37820) {
                if (class1858 == Class9484.field40760) {
                    return Class9484.field40761;
                }
            }
            else if (class1858 == Class9484.field40761) {
                final Class3833 method31487 = class1856.method21696();
                if (method31487 instanceof Class3999) {
                    return class1858;
                }
                if (!(method31487 instanceof Class3977)) {
                    return Class9484.field40760;
                }
                return class1858;
            }
            return class1858;
        }
        return class1858;
    }
    
    private void method31890(final Class9226 class9226, final Class9006 class9227) {
        this.method31891(Class9484.field40761, class9226, class9227);
        this.method31891(Class9484.field40760, class9226, class9227);
        this.method31891(Class9484.field40762, class9226, class9227);
    }
    
    private void method31891(final Class6332 class6332, final Class9226 class6333, final Class9006 class6334) {
        final Class4148 method34024 = class6333.method34024(class6332);
        if (method34024.method12405()) {
            class6334.method32217(class6332);
            if (method34024.method12418() > 0) {
                class6334.method32218(class6332);
            }
        }
    }
    
    private Class1857 method31892(final BlockPos class354) {
        final BlockPos method1134 = class354.add(-1, -1, -1);
        final BlockPos method1135 = class354.add(16, 16, 16);
        return new Class1857(this.method31893(Class7520.method23478(this.field37833), method1134, method1135, 1), method1134, method1135, 1);
    }
    
    public Class1858 method31893(final World class1847, final BlockPos class1848, final BlockPos class1849, final int n) {
        return Class1858.method7004(class1847, class1848, class1849, n, false);
    }
    
    public Class8974 method31894(final Class9112 class9112, final Direction class9113) {
        if (!this.field37826) {
            for (int i = 0; i < Direction.VALUES.length; ++i) {
                this.field37825[i] = class9112.method32963(this.method31878(Direction.VALUES[i]));
            }
            this.field37826 = true;
        }
        return this.field37825[class9113.ordinal()];
    }
    
    public Class1862 method31895() {
        return this.method31896(this.field37817);
    }
    
    private Class1862 method31896(final BlockPos class354) {
        final Class1862 field37827 = this.field37827;
        if (field37827 != null && Class6502.method19585(field37827)) {
            return field37827;
        }
        return this.field37827 = Class7520.method23478(this.field37833).method6685(class354);
    }
    
    public boolean method31897() {
        return this.method31898(this.field37817);
    }
    
    private boolean method31898(final BlockPos class354) {
        final int method1075 = class354.getY();
        return this.method31896(class354).method7023(method1075, method1075 + 15);
    }
    
    public void method31899(final Direction class179, final Class8974 class180) {
        this.field37828[class179.ordinal()] = class180;
        this.field37829[class179.ordinal()] = class180;
    }
    
    public Class8974 method31900(final Direction class179) {
        if (!this.field37830) {
            this.method31902();
        }
        return this.field37829[class179.ordinal()];
    }
    
    public Class9071 method31901() {
        return this.field37831;
    }
    
    private void method31902() {
        final int method1074 = this.method31873().getX();
        final int method1075 = this.method31873().getZ();
        final int ordinal = Direction.NORTH.ordinal();
        final int ordinal2 = Direction.SOUTH.ordinal();
        final int ordinal3 = Direction.WEST.ordinal();
        final int ordinal4 = Direction.EAST.ordinal();
        this.field37829[ordinal] = ((this.field37828[ordinal].method31873().getZ() != method1075 - 16) ? null : this.field37828[ordinal]);
        this.field37829[ordinal2] = ((this.field37828[ordinal2].method31873().getZ() != method1075 + 16) ? null : this.field37828[ordinal2]);
        this.field37829[ordinal3] = ((this.field37828[ordinal3].method31873().getX() != method1074 - 16) ? null : this.field37828[ordinal3]);
        this.field37829[ordinal4] = ((this.field37828[ordinal4].method31873().getX() != method1074 + 16) ? null : this.field37828[ordinal4]);
        this.field37830 = true;
    }
    
    public boolean method31903(final Class8902 class8902, final int n) {
        return this.method31904().method18518(class8902, n) || class8902.method31350(this.field37814);
    }
    
    public Class6222 method31904() {
        if (this.field37832 == null) {
            final BlockPos method31873 = this.method31873();
            final int method31874 = method31873.getX();
            final int method31875 = method31873.getY();
            final int method31876 = method31873.getZ();
            final int n = 5;
            final int n2 = method31874 >> n << n;
            final int n3 = method31875 >> n << n;
            final int n4 = method31876 >> n << n;
            Label_0109: {
                if (n2 == method31874) {
                    if (n3 == method31875) {
                        if (n4 == method31876) {
                            break Label_0109;
                        }
                    }
                }
                final Class6222 method31877 = Class7520.method23480(this.field37833).method5762(new BlockPos(n2, n3, n4)).method31904();
                if (method31877 != null) {
                    if (method31877.field25073 == n2) {
                        if (method31877.field25074 == n3) {
                            if (method31877.field25075 == n4) {
                                this.field37832 = method31877;
                            }
                        }
                    }
                }
            }
            if (this.field37832 == null) {
                final int n5 = 1 << n;
                this.field37832 = new Class6222(n2, n3, n4, n2 + n5, n3 + n5, n4 + n5);
            }
        }
        return this.field37832;
    }
    
    @Override
    public String toString() {
        return "pos: " + this.method31873() + ", frameIndex: " + this.field37815;
    }
}
