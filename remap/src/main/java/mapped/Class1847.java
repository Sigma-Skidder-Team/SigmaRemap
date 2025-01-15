// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.Iterator;
import java.util.Collection;
import org.apache.logging.log4j.util.Supplier;
import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.function.BiFunction;
import java.util.Random;
import java.util.List;
import org.apache.logging.log4j.Logger;

public abstract class Class1847 implements Class1851, AutoCloseable
{
    public static final Logger field10048;
    private static final Direction[] field10049;
    public final List<Class436> field10050;
    public final List<Class436> field10051;
    public final List<Class436> field10052;
    public final List<Class436> field10053;
    private final Thread field10054;
    private int field10055;
    public int field10056;
    public final int field10057 = 1013904223;
    public float field10058;
    public float field10059;
    public float field10060;
    public float field10061;
    public final Random field10062;
    public final Class6737 field10063;
    public final Class1906 field10064;
    public final Class8660 field10065;
    private final Class5028 field10066;
    public final boolean field10067;
    public boolean field10068;
    private final Class9375 field10069;
    private final Class5507 field10070;
    
    public Class1847(final Class8660 field10065, final Class383 class383, final BiFunction<Class1847, Class6737, Class1906> biFunction, final Class5028 field10066, final boolean field10067) {
        this.field10050 = Lists.newArrayList();
        this.field10051 = Lists.newArrayList();
        this.field10052 = Lists.newArrayList();
        this.field10053 = Lists.newArrayList();
        this.field10056 = new Random().nextInt();
        this.field10062 = new Random();
        this.field10066 = field10066;
        this.field10065 = field10065;
        this.field10063 = class383.method1273(this);
        this.field10064 = biFunction.apply(this, this.field10063);
        this.field10067 = field10067;
        this.field10069 = this.field10063.method20506();
        this.field10054 = Thread.currentThread();
        this.field10070 = new Class5507(this, field10067 ? field10065.method29534() : Class8660.method29535(field10065.method29534()), class383.method1278());
    }
    
    @Override
    public boolean method6678() {
        return this.field10067;
    }
    
    @Nullable
    public Class394 method6679() {
        return null;
    }
    
    public void method6680() {
        this.method6759(new BlockPos(8, 64, 8));
    }
    
    public Class7096 method6681(final BlockPos class354) {
        BlockPos method1137;
        for (method1137 = new BlockPos(class354.getX(), this.method6743(), class354.getZ()); !this.method6961(method1137.method1137()); method1137 = method1137.method1137()) {}
        return this.method6701(method1137);
    }
    
    public static boolean method6682(final BlockPos class354) {
        if (!method6683(class354)) {
            if (class354.getX() >= -30000000) {
                if (class354.getZ() >= -30000000) {
                    if (class354.getX() < 30000000) {
                        if (class354.getZ() < 30000000) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean method6683(final BlockPos class354) {
        return method6684(class354.getY());
    }
    
    public static boolean method6684(final int n) {
        return n < 0 || n >= 256;
    }
    
    public Class1862 method6685(final BlockPos class354) {
        return this.method6686(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    public Class1862 method6686(final int n, final int n2) {
        return (Class1862)this.method6966(n, n2, Class9312.field39989);
    }
    
    @Override
    public Class1860 method6687(final int n, final int n2, final Class9312 class9312, final boolean b) {
        final Class1860 method7402 = this.field10064.method7402(n, n2, class9312, b);
        if (method7402 == null && b) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return method7402;
    }
    
    @Override
    public boolean method6688(final BlockPos class354, final Class7096 class355, final int n) {
        if (method6683(class354)) {
            return false;
        }
        if (!this.field10067 && this.field10065.method29570() == Class9505.field40898) {
            return false;
        }
        final Class1862 method6685 = this.method6685(class354);
        final Class3833 method6686 = class355.method21696();
        final Class7096 method6687 = method6685.method7008(class354, class355, (n & 0x40) != 0x0);
        if (method6687 != null) {
            final Class7096 method6688 = this.method6701(class354);
            Label_0091: {
                if (method6688 != method6687) {
                    if (method6688.method21700(this, class354) == method6687.method21700(this, class354)) {
                        if (method6688.method21704() == method6687.method21704()) {
                            if (!method6688.method21703()) {
                                if (!method6687.method21703()) {
                                    break Label_0091;
                                }
                            }
                        }
                    }
                    this.field10066.method15297("queueCheckLight");
                    this.method6762().method7405().method7252(class354);
                    this.field10066.method15299();
                }
            }
            if (method6688 == class355) {
                if (method6687 != method6688) {
                    this.method6695(class354, method6687, method6688);
                }
                Label_0213: {
                    if ((n & 0x2) != 0x0) {
                        if (!this.field10067 || (n & 0x4) == 0x0) {
                            if (!this.field10067) {
                                if (method6685.method7073() == null) {
                                    break Label_0213;
                                }
                                if (!method6685.method7073().method8321(Class2152.field12788)) {
                                    break Label_0213;
                                }
                            }
                            this.method6693(class354, method6687, class355, n);
                        }
                    }
                }
                if (!this.field10067) {
                    if ((n & 0x1) != 0x0) {
                        this.method6694(class354, method6687.method21696());
                        if (class355.method21716()) {
                            this.method6783(class354, method6686);
                        }
                    }
                }
                if ((n & 0x10) == 0x0) {
                    final int n2 = n & 0xFFFFFFFE;
                    method6687.method21736(this, class354, n2);
                    class355.method21735(this, class354, n2);
                    class355.method21736(this, class354, n2);
                }
                this.method6689(class354, method6687, method6688);
            }
            return true;
        }
        return false;
    }
    
    public void method6689(final BlockPos class354, final Class7096 class355, final Class7096 class356) {
    }
    
    @Override
    public boolean method6690(final BlockPos class354, final boolean b) {
        return this.method6688(class354, this.method6702(class354).method21791(), 0x3 | (b ? 64 : 0));
    }
    
    @Override
    public boolean method6691(final BlockPos class354, final boolean b, final Entity class355) {
        final Class7096 method6701 = this.method6701(class354);
        if (!method6701.method21706()) {
            final Class7099 method6702 = this.method6702(class354);
            this.method6955(2001, class354, Class3833.method11774(method6701));
            if (b) {
                Class3833.method11838(method6701, this, class354, method6701.method21696().method11802() ? this.method6727(class354) : null, class355, Class8321.field34174);
            }
            return this.method6688(class354, method6702.method21791(), 3);
        }
        return false;
    }
    
    public boolean method6692(final BlockPos class354, final Class7096 class355) {
        return this.method6688(class354, class355, 3);
    }
    
    public abstract void method6693(final BlockPos p0, final Class7096 p1, final Class7096 p2, final int p3);
    
    @Override
    public void method6694(final BlockPos class354, final Class3833 class355) {
        if (this.field10065.method29570() != Class9505.field40898) {
            this.method6696(class354, class355);
        }
    }
    
    public void method6695(final BlockPos class354, final Class7096 class355, final Class7096 class356) {
    }
    
    public void method6696(final BlockPos class354, final Class3833 class355) {
        this.method6698(class354.method1145(), class355, class354);
        this.method6698(class354.method1147(), class355, class354);
        this.method6698(class354.method1139(), class355, class354);
        this.method6698(class354.method1137(), class355, class354);
        this.method6698(class354.method1141(), class355, class354);
        this.method6698(class354.method1143(), class355, class354);
    }
    
    public void method6697(final BlockPos class354, final Class3833 class355, final Direction class356) {
        if (class356 != Direction.WEST) {
            this.method6698(class354.method1145(), class355, class354);
        }
        if (class356 != Direction.EAST) {
            this.method6698(class354.method1147(), class355, class354);
        }
        if (class356 != Direction.DOWN) {
            this.method6698(class354.method1139(), class355, class354);
        }
        if (class356 != Direction.UP) {
            this.method6698(class354.method1137(), class355, class354);
        }
        if (class356 != Direction.NORTH) {
            this.method6698(class354.method1141(), class355, class354);
        }
        if (class356 != Direction.SOUTH) {
            this.method6698(class354.method1143(), class355, class354);
        }
    }
    
    public void method6698(final BlockPos class354, final Class3833 class355, final BlockPos class356) {
        if (!this.field10067) {
            final Class7096 method6701 = this.method6701(class354);
            try {
                method6701.method21734(this, class354, class355, class356, false);
            }
            catch (final Throwable t) {
                final Class7689 method6702 = Class7689.method24421(t, "Exception while updating neighbours");
                final Class5204 method6703 = method6702.method24418("Block being updated");
                method6703.method16296("Source block type", () -> {
                    try {
                        return String.format("ID #%s (%s // %s)", Class90.field208.method503(class357), class357.method11856(), class357.getClass().getCanonicalName());
                    }
                    catch (final Throwable t2) {
                        return "ID #" + Class90.field208.method503(class357);
                    }
                });
                Class5204.method16304(method6703, class354, method6701);
                throw new Class2365(method6702);
            }
        }
    }
    
    @Override
    public int method6699(final Class2020 class2020, final int n, final int n2) {
        if (n >= -30000000) {
            if (n2 >= -30000000) {
                if (n < 30000000) {
                    if (n2 < 30000000) {
                        if (!this.method6814(n >> 4, n2 >> 4)) {
                            return 0;
                        }
                        return this.method6686(n >> 4, n2 >> 4).method7018(class2020, n & 0xF, n2 & 0xF) + 1;
                    }
                }
            }
        }
        return this.method6743() + 1;
    }
    
    @Override
    public Class1886 method6700() {
        return this.method6762().method7405();
    }
    
    @Override
    public Class7096 method6701(final BlockPos class354) {
        if (!method6683(class354)) {
            return this.method6686(class354.getX() >> 4, class354.getZ() >> 4).method6701(class354);
        }
        return Class7521.field29763.method11878();
    }
    
    @Override
    public Class7099 method6702(final BlockPos class354) {
        if (!method6683(class354)) {
            return this.method6685(class354).method6702(class354);
        }
        return Class7558.field29974.method22148();
    }
    
    public boolean method6703() {
        return this.field10063.method20487() == Class383.field2223 && this.field10055 < 4;
    }
    
    public boolean method6704() {
        return this.field10063.method20487() == Class383.field2223 && !this.method6703();
    }
    
    @Override
    public void method6705(final Class512 class512, final BlockPos class513, final Class7795 class514, final Class286 class515, final float n, final float n2) {
        this.method6706(class512, class513.getX() + 0.5, class513.getY() + 0.5, class513.getZ() + 0.5, class514, class515, n, n2);
    }
    
    public abstract void method6706(final Class512 p0, final double p1, final double p2, final double p3, final Class7795 p4, final Class286 p5, final float p6, final float p7);
    
    public abstract void method6707(final Class512 p0, final Entity p1, final Class7795 p2, final Class286 p3, final float p4, final float p5);
    
    public void method6708(final double n, final double n2, final double n3, final Class7795 class7795, final Class286 class7796, final float n4, final float n5, final boolean b) {
    }
    
    @Override
    public void method6709(final Class6909 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6710(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6711(final Class6909 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public void method6712(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
    }
    
    public float method6713(final float n) {
        return this.method6952(n) * 6.2831855f;
    }
    
    public boolean method6714(final Class436 class436) {
        if (this.field10068) {
            Class1847.field10048.error("Adding block entity while ticking: {} @ {}", new Supplier[] { () -> Class90.field224.method503(class436.method2206()), class436::method2193 });
        }
        final boolean add = this.field10050.add(class436);
        if (add) {
            if (class436 instanceof Class439) {
                this.field10051.add(class436);
            }
        }
        if (this.field10067) {
            final BlockPos method2193 = class436.method2193();
            final Class7096 method2194 = this.method6701(method2193);
            this.method6693(method2193, method2194, method2194, 2);
        }
        return add;
    }
    
    public void method6715(final Collection<Class436> collection) {
        if (!this.field10068) {
            final Iterator<Class436> iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.method6714(iterator.next());
            }
        }
        else {
            this.field10052.addAll(collection);
        }
    }
    
    public void method6716() {
        final Class5028 method6796 = this.method6796();
        method6796.method15297("blockEntities");
        if (!this.field10053.isEmpty()) {
            this.field10051.removeAll(this.field10053);
            this.field10050.removeAll(this.field10053);
            this.field10053.clear();
        }
        this.field10068 = true;
        final Iterator<Class436> iterator = this.field10051.iterator();
        while (iterator.hasNext()) {
            final Class436 class436 = iterator.next();
            if (!class436.method2197() && class436.method2188()) {
                final BlockPos method6797 = class436.method2193();
                if (this.field10064.method7410(method6797) && this.method6787().method34779(method6797)) {
                    try {
                        method6796.method15298(() -> String.valueOf(Class5412.method16520(class438.method2206())));
                        if (class436.method2206().method16523(this.method6701(method6797).method21696())) {
                            ((Class439)class436).method2229();
                        }
                        else {
                            class436.method2207();
                        }
                        method6796.method15299();
                    }
                    catch (final Throwable t) {
                        final Class7689 method6798 = Class7689.method24421(t, "Ticking block entity");
                        class436.method2202(method6798.method24418("Block entity being ticked"));
                        throw new Class2365(method6798);
                    }
                }
            }
            if (class436.method2197()) {
                iterator.remove();
                this.field10050.remove(class436);
                if (!this.method6971(class436.method2193())) {
                    continue;
                }
                this.method6685(class436.method2193()).method7028(class436.method2193());
            }
        }
        this.field10068 = false;
        method6796.method15300("pendingBlockEntities");
        if (!this.field10052.isEmpty()) {
            for (int i = 0; i < this.field10052.size(); ++i) {
                final Class436 class437 = this.field10052.get(i);
                if (!class437.method2197()) {
                    if (!this.field10050.contains(class437)) {
                        this.method6714(class437);
                    }
                    if (this.method6971(class437.method2193())) {
                        final Class1862 method6799 = this.method6685(class437.method2193());
                        final Class7096 method6800 = method6799.method6701(class437.method2193());
                        method6799.method7009(class437.method2193(), class437);
                        this.method6693(class437.method2193(), method6800, method6800, 3);
                    }
                }
            }
            this.field10052.clear();
        }
        method6796.method15299();
    }
    
    public void method6717(final Consumer<Entity> consumer, final Entity class399) {
        try {
            consumer.accept(class399);
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Ticking entity");
            class399.method1862(method24421.method24418("Entity being ticked"));
            throw new Class2365(method24421);
        }
    }
    
    public boolean method6718(final Class6221 class6221) {
        final int method35644 = MathHelper.floor(class6221.field25073);
        final int method35645 = MathHelper.method35650(class6221.field25076);
        final int method35646 = MathHelper.floor(class6221.field25074);
        final int method35647 = MathHelper.method35650(class6221.field25077);
        final int method35648 = MathHelper.floor(class6221.field25075);
        final int method35649 = MathHelper.method35650(class6221.field25078);
        try (final Class386 method35650 = Class386.method1296()) {
            for (int i = method35644; i < method35645; ++i) {
                for (int j = method35646; j < method35647; ++j) {
                    for (int k = method35648; k < method35649; ++k) {
                        if (!this.method6701(method35650.method1300(i, j, k)).method21706()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
    
    public boolean method6719(final Class6221 class6221) {
        final int method35644 = MathHelper.floor(class6221.field25073);
        final int method35645 = MathHelper.method35650(class6221.field25076);
        final int method35646 = MathHelper.floor(class6221.field25074);
        final int method35647 = MathHelper.method35650(class6221.field25077);
        final int method35648 = MathHelper.floor(class6221.field25075);
        final int method35649 = MathHelper.method35650(class6221.field25078);
        if (this.method6973(method35644, method35646, method35648, method35645, method35647, method35649)) {
            try (final Class386 method35650 = Class386.method1296()) {
                for (int i = method35644; i < method35645; ++i) {
                    for (int j = method35646; j < method35647; ++j) {
                        for (int k = method35648; k < method35649; ++k) {
                            final Class3833 method35651 = this.method6701(method35650.method1300(i, j, k)).method21696();
                            if (method35651 == Class7521.field29289 || method35651 == Class7521.field29174) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }
    
    @Nullable
    public Class7096 method6720(final Class6221 class6221, final Class3833 class6222) {
        final int method35644 = MathHelper.floor(class6221.field25073);
        final int method35645 = MathHelper.method35650(class6221.field25076);
        final int method35646 = MathHelper.floor(class6221.field25074);
        final int method35647 = MathHelper.method35650(class6221.field25077);
        final int method35648 = MathHelper.floor(class6221.field25075);
        final int method35649 = MathHelper.method35650(class6221.field25078);
        if (this.method6973(method35644, method35646, method35648, method35645, method35647, method35649)) {
            try (final Class386 method35650 = Class386.method1296()) {
                for (int i = method35644; i < method35645; ++i) {
                    for (int j = method35646; j < method35647; ++j) {
                        for (int k = method35648; k < method35649; ++k) {
                            final Class7096 method35651 = this.method6701(method35650.method1300(i, j, k));
                            if (method35651.method21696() == class6222) {
                                return method35651;
                            }
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
    
    public boolean method6721(final Class6221 class6221, final Class8059 class6222) {
        return BlockPos.method1157(MathHelper.floor(class6221.field25073), MathHelper.floor(class6221.field25074), MathHelper.floor(class6221.field25075), MathHelper.method35650(class6221.field25076) - 1, MathHelper.method35650(class6221.field25077) - 1, MathHelper.method35650(class6221.field25078) - 1).anyMatch(class6225 -> {
            Class114.method607(class6224);
            return class6223.test(this.method6701(class6225));
        });
    }
    
    public Class6154 method6722(final Entity class399, final double n, final double n2, final double n3, final float n4, final Class2196 class400) {
        return this.method6724(class399, null, n, n2, n3, n4, false, class400);
    }
    
    public Class6154 method6723(final Entity class399, final double n, final double n2, final double n3, final float n4, final boolean b, final Class2196 class400) {
        return this.method6724(class399, null, n, n2, n3, n4, b, class400);
    }
    
    public Class6154 method6724(final Entity class399, final Class7929 class400, final double n, final double n2, final double n3, final float n4, final boolean b, final Class2196 class401) {
        final Class6154 class402 = new Class6154(this, class399, n, n2, n3, n4, b, class401);
        if (class400 != null) {
            class402.method18412(class400);
        }
        class402.method18408();
        class402.method18409(true);
        return class402;
    }
    
    public boolean method6725(final Class512 class512, BlockPos method1149, final Direction class513) {
        method1149 = method1149.method1149(class513);
        if (this.method6701(method1149).method21696() != Class7521.field29289) {
            return false;
        }
        this.method6839(class512, 1009, method1149, 0);
        this.method6690(method1149, false);
        return true;
    }
    
    public String method6726() {
        return this.field10064.method7404();
    }
    
    @Nullable
    @Override
    public Class436 method6727(final BlockPos class354) {
        if (method6683(class354)) {
            return null;
        }
        if (!this.field10067 && Thread.currentThread() != this.field10054) {
            return null;
        }
        Class436 class355 = null;
        if (this.field10068) {
            class355 = this.method6728(class354);
        }
        if (class355 == null) {
            class355 = this.method6685(class354).method7000(class354, Class2079.field12020);
        }
        if (class355 == null) {
            class355 = this.method6728(class354);
        }
        return class355;
    }
    
    @Nullable
    private Class436 method6728(final BlockPos class354) {
        for (int i = 0; i < this.field10052.size(); ++i) {
            final Class436 class355 = this.field10052.get(i);
            if (!class355.method2197() && class355.method2193().equals(class354)) {
                return class355;
            }
        }
        return null;
    }
    
    public void method6729(final BlockPos class354, final Class436 class355) {
        if (!method6683(class354)) {
            if (class355 != null) {
                if (!class355.method2197()) {
                    if (!this.field10068) {
                        this.method6685(class354).method7009(class354, class355);
                        this.method6714(class355);
                    }
                    else {
                        class355.method2187(this, class354);
                        final Iterator<Class436> iterator = this.field10052.iterator();
                        while (iterator.hasNext()) {
                            final Class436 class356 = iterator.next();
                            if (!class356.method2193().equals(class354)) {
                                continue;
                            }
                            class356.method2198();
                            iterator.remove();
                        }
                        this.field10052.add(class355);
                    }
                }
            }
        }
    }
    
    public void method6730(final BlockPos class354) {
        final Class436 method6727 = this.method6727(class354);
        if (method6727 != null && this.field10068) {
            method6727.method2198();
            this.field10052.remove(method6727);
        }
        else {
            if (method6727 != null) {
                this.field10052.remove(method6727);
                this.field10050.remove(method6727);
                this.field10051.remove(method6727);
            }
            this.method6685(class354).method7028(class354);
        }
    }
    
    public boolean method6731(final BlockPos class354) {
        return !method6683(class354) && this.field10064.method7401(class354.getX() >> 4, class354.getZ() >> 4);
    }
    
    public boolean method6732(final BlockPos class354, final Entity class355) {
        if (!method6683(class354)) {
            final Class1860 method6687 = this.method6687(class354.getX() >> 4, class354.getZ() >> 4, Class9312.field39989, false);
            return method6687 != null && method6687.method6701(class354).method21731(this, class354, class355);
        }
        return false;
    }
    
    public void method6733() {
        this.field10055 = (int)((1.0 - (0.5 + 2.0 * MathHelper.method35654(MathHelper.cos(this.method6952(1.0f) * 6.2831855f), -0.25, 0.25)) * (1.0 - this.method6768(1.0f) * 5.0f / 16.0) * (1.0 - this.method6766(1.0f) * 5.0f / 16.0)) * 11.0);
    }
    
    public void method6734(final boolean b, final boolean b2) {
        this.method6762().method7406(b, b2);
    }
    
    public void method6735() {
        if (this.field10065.method29560()) {
            this.field10059 = 1.0f;
            if (this.field10065.method29556()) {
                this.field10061 = 1.0f;
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        this.field10064.close();
    }
    
    @Nullable
    @Override
    public Class1855 method6736(final int n, final int n2) {
        return this.method6687(n, n2, Class9312.field39989, false);
    }
    
    @Override
    public List<Entity> method6737(final Entity class399, final Class6221 class400, final Predicate<? super Entity> predicate) {
        this.method6796().method15302("getEntities");
        final ArrayList arrayList = Lists.newArrayList();
        final int method35644 = MathHelper.floor((class400.field25073 - 2.0) / 16.0);
        final int method35645 = MathHelper.floor((class400.field25076 + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class400.field25075 - 2.0) / 16.0);
        final int method35647 = MathHelper.floor((class400.field25078 + 2.0) / 16.0);
        for (int i = method35644; i <= method35645; ++i) {
            for (int j = method35646; j <= method35647; ++j) {
                final Class1862 method35648 = this.method6762().method7398(i, j, false);
                if (method35648 != null) {
                    method35648.method7059(class399, class400, arrayList, predicate);
                }
            }
        }
        return arrayList;
    }
    
    public <T extends Entity> List<T> method6738(final Class7499<T> class7499, final Class6221 class7500, final Predicate<? super T> predicate) {
        this.method6796().method15302("getEntities");
        final int method35644 = MathHelper.floor((class7500.field25073 - 2.0) / 16.0);
        final int method35645 = MathHelper.method35650((class7500.field25076 + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class7500.field25075 - 2.0) / 16.0);
        final int method35647 = MathHelper.method35650((class7500.field25078 + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Class1862 method35648 = this.method6762().method7398(i, j, false);
                if (method35648 != null) {
                    method35648.method7060(class7499, class7500, arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public <T extends Entity> List<T> method6739(final Class<? extends T> clazz, final Class6221 class6221, final Predicate<? super T> predicate) {
        this.method6796().method15302("getEntities");
        final int method35644 = MathHelper.floor((class6221.field25073 - 2.0) / 16.0);
        final int method35645 = MathHelper.method35650((class6221.field25076 + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class6221.field25075 - 2.0) / 16.0);
        final int method35647 = MathHelper.method35650((class6221.field25078 + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        final Class1906 method35648 = this.method6762();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Class1862 method35649 = method35648.method7398(i, j, false);
                if (method35649 != null) {
                    method35649.method7061(clazz, class6221, (List<Entity>)arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public <T extends Entity> List<T> method6740(final Class<? extends T> clazz, final Class6221 class6221, final Predicate<? super T> predicate) {
        this.method6796().method15302("getLoadedEntities");
        final int method35644 = MathHelper.floor((class6221.field25073 - 2.0) / 16.0);
        final int method35645 = MathHelper.method35650((class6221.field25076 + 2.0) / 16.0);
        final int method35646 = MathHelper.floor((class6221.field25075 - 2.0) / 16.0);
        final int method35647 = MathHelper.method35650((class6221.field25078 + 2.0) / 16.0);
        final ArrayList arrayList = Lists.newArrayList();
        final Class1906 method35648 = this.method6762();
        for (int i = method35644; i < method35645; ++i) {
            for (int j = method35646; j < method35647; ++j) {
                final Class1862 method35649 = method35648.method7399(i, j);
                if (method35649 != null) {
                    method35649.method7061(clazz, class6221, (List<Entity>)arrayList, (Predicate<? super Entity>)predicate);
                }
            }
        }
        return arrayList;
    }
    
    @Nullable
    public abstract Entity method6741(final int p0);
    
    public void method6742(final BlockPos class354, final Class436 class355) {
        if (this.method6971(class354)) {
            this.method6685(class354).method7058();
        }
    }
    
    @Override
    public int method6743() {
        return 63;
    }
    
    @Override
    public Class1847 method6744() {
        return this;
    }
    
    public Class9505 method6745() {
        return this.field10065.method29570();
    }
    
    public int method6746(final BlockPos class354) {
        final int max = Math.max(0, this.method6964(class354.method1139(), Direction.DOWN));
        if (max >= 15) {
            return max;
        }
        final int max2 = Math.max(max, this.method6964(class354.method1137(), Direction.UP));
        if (max2 >= 15) {
            return max2;
        }
        final int max3 = Math.max(max2, this.method6964(class354.method1141(), Direction.NORTH));
        if (max3 >= 15) {
            return max3;
        }
        final int max4 = Math.max(max3, this.method6964(class354.method1143(), Direction.SOUTH));
        if (max4 >= 15) {
            return max4;
        }
        final int max5 = Math.max(max4, this.method6964(class354.method1145(), Direction.WEST));
        if (max5 < 15) {
            final int max6 = Math.max(max5, this.method6964(class354.method1147(), Direction.EAST));
            return (max6 < 15) ? max6 : max6;
        }
        return max5;
    }
    
    public boolean method6747(final BlockPos class354, final Direction class355) {
        return this.method6748(class354, class355) > 0;
    }
    
    public int method6748(final BlockPos class354, final Direction class355) {
        final Class7096 method6701 = this.method6701(class354);
        return method6701.method21713(this, class354) ? this.method6746(class354) : method6701.method21715(this, class354, class355);
    }
    
    public boolean method6749(final BlockPos class354) {
        return this.method6748(class354.method1139(), Direction.DOWN) > 0 || this.method6748(class354.method1137(), Direction.UP) > 0 || this.method6748(class354.method1141(), Direction.NORTH) > 0 || this.method6748(class354.method1143(), Direction.SOUTH) > 0 || this.method6748(class354.method1145(), Direction.WEST) > 0 || this.method6748(class354.method1147(), Direction.EAST) > 0;
    }
    
    public int method6750(final BlockPos class354) {
        int n = 0;
        for (final Direction class355 : Class1847.field10049) {
            final int method6748 = this.method6748(class354.method1149(class355), class355);
            if (method6748 >= 15) {
                return 15;
            }
            if (method6748 > n) {
                n = method6748;
            }
        }
        return n;
    }
    
    public void method6751() {
    }
    
    public void method6752(final long n) {
        this.field10065.method29546(n);
    }
    
    @Override
    public long method6753() {
        return this.field10065.method29534();
    }
    
    public long method6754() {
        return this.field10065.method29539();
    }
    
    public long method6755() {
        return this.field10065.method29540();
    }
    
    public void method6756(final long n) {
        this.field10065.method29547(n);
    }
    
    public void method6757() {
        this.method6752(this.field10065.method29539() + 1L);
        if (this.field10065.method29578().method31216(Class8878.field37324)) {
            this.method6756(this.field10065.method29540() + 1L);
        }
    }
    
    @Override
    public BlockPos method6758() {
        BlockPos method6958 = new BlockPos(this.field10065.method29536(), this.field10065.method29537(), this.field10065.method29538());
        if (!this.method6787().method34779(method6958)) {
            method6958 = this.method6958(Class2020.field11525, new BlockPos(this.method6787().method34777(), 0.0, this.method6787().method34778()));
        }
        return method6958;
    }
    
    public void method6759(final BlockPos class354) {
        this.field10065.method29548(class354);
    }
    
    public boolean method6760(final Class512 class512, final BlockPos class513) {
        return true;
    }
    
    public void method6761(final Entity class399, final byte b) {
    }
    
    @Override
    public Class1906 method6762() {
        return this.field10064;
    }
    
    public void method6763(final BlockPos class354, final Class3833 class355, final int n, final int n2) {
        this.method6701(class354).method21733(this, class354, n, n2);
    }
    
    @Override
    public Class8660 method6764() {
        return this.field10065;
    }
    
    public Class8878 method6765() {
        return this.field10065.method29578();
    }
    
    public float method6766(final float n) {
        return MathHelper.method35700(n, this.field10060, this.field10061) * this.method6768(n);
    }
    
    public void method6767(final float n) {
        this.field10060 = n;
        this.field10061 = n;
    }
    
    public float method6768(final float n) {
        return MathHelper.method35700(n, this.field10058, this.field10059);
    }
    
    public void method6769(final float n) {
        this.field10058 = n;
        this.field10059 = n;
    }
    
    public boolean method6770() {
        return this.field10063.method20503() && !this.field10063.method20504() && this.method6766(1.0f) > 0.9;
    }
    
    public boolean method6771() {
        return this.method6768(1.0f) > 0.2;
    }
    
    public boolean method6772(final BlockPos class354) {
        return this.method6771() && this.method6994(class354) && this.method6958(Class2020.field11525, class354).getY() <= class354.getY() && this.method6959(class354).method9841() == Class2145.field12629;
    }
    
    public boolean method6773(final BlockPos class354) {
        return this.method6959(class354).method9842();
    }
    
    @Nullable
    public abstract Class6356 method6774(final String p0);
    
    public abstract void method6775(final Class6356 p0);
    
    public abstract int method6776();
    
    public void method6777(final int n, final BlockPos class354, final int n2) {
    }
    
    public int method6778() {
        return this.field10063.method20504() ? 128 : 256;
    }
    
    public Class5204 method6779(final Class7689 class7689) {
        final Class5204 method24419 = class7689.method24419("Affected level", 1);
        method24419.method16296("All players", () -> this.method6840().size() + " total; " + this.method6840());
        method24419.method16296("Chunk stats", this.field10064::method7404);
        method24419.method16296("Level dimension", () -> this.field10063.method20487().toString());
        try {
            this.field10065.method29602(method24419);
        }
        catch (final Throwable t) {
            method24419.method16298("Level Data Unobtainable", t);
        }
        return method24419;
    }
    
    public abstract void method6780(final int p0, final BlockPos p1, final int p2);
    
    public void method6781(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class51 class51) {
    }
    
    public abstract Class6516 method6782();
    
    public void method6783(final BlockPos class354, final Class3833 class355) {
        for (final Direction class356 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class354.method1149(class356);
            if (!this.method6971(method1149)) {
                continue;
            }
            final Class7096 method1150 = this.method6701(method1149);
            if (method1150.method21696() != Class7521.field29471) {
                if (!method1150.method21713(this, method1149)) {
                    continue;
                }
                final BlockPos method1151 = method1149.method1149(class356);
                final Class7096 method1152 = this.method6701(method1151);
                if (method1152.method21696() != Class7521.field29471) {
                    continue;
                }
                method1152.method21734(this, method1151, class355, class354, false);
            }
            else {
                method1150.method21734(this, method1149, class355, class354, false);
            }
        }
    }
    
    @Override
    public Class9592 method6784(final BlockPos class354) {
        long method7041 = 0L;
        float method7042 = 0.0f;
        if (this.method6971(class354)) {
            method7042 = this.method6951();
            method7041 = this.method6685(class354).method7041();
        }
        return new Class9592(this.method6954(), this.method6755(), method7041, method7042);
    }
    
    @Override
    public int method6785() {
        return this.field10055;
    }
    
    public void method6786(final int n) {
    }
    
    @Override
    public Class9375 method6787() {
        return this.field10069;
    }
    
    public void method6788(final Class4252<?> class4252) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }
    
    @Override
    public Class6737 method6789() {
        return this.field10063;
    }
    
    @Override
    public Random method6790() {
        return this.field10062;
    }
    
    @Override
    public boolean method6791(final BlockPos class354, final Predicate<Class7096> predicate) {
        return predicate.test(this.method6701(class354));
    }
    
    public abstract Class1780 method6792();
    
    public abstract Class1792 method6793();
    
    public BlockPos method6794(final int n, final int n2, final int n3, final int n4) {
        this.field10056 = this.field10056 * 3 + 1013904223;
        final int n5 = this.field10056 >> 2;
        return new BlockPos(n + (n5 & 0xF), n2 + (n5 >> 16 & n4), n3 + (n5 >> 8 & 0xF));
    }
    
    public boolean method6795() {
        return false;
    }
    
    public Class5028 method6796() {
        return this.field10066;
    }
    
    @Override
    public Class5507 method6797() {
        return this.field10070;
    }
    
    static {
        field10048 = LogManager.getLogger();
        field10049 = Direction.values();
    }
}
