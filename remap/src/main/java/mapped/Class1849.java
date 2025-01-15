// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.Writer;
import it.unimi.dsi.fastutil.objects.Object2IntMap$Entry;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Optional;
import java.util.Objects;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.longs.LongSet;
import javax.annotation.Nonnull;
import java.util.function.BiFunction;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.function.Predicate;
import net.minecraft.world.storage.SessionLockException;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry;
import java.util.function.BooleanSupplier;
import com.google.common.collect.Sets;
import com.google.common.collect.Queues;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import com.google.common.collect.Lists;
import java.util.concurrent.Executor;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.Queue;
import java.util.UUID;
import java.util.Map;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class1849 extends Class1847
{
    private static final Logger field10083;
    private final List<Entity> field10084;
    private final Int2ObjectMap<Entity> field10085;
    private final Map<UUID, Entity> field10086;
    private final Queue<Entity> field10087;
    private final List<Class513> field10088;
    public boolean field10089;
    private final Class394 field10090;
    private final Class8642 field10091;
    public boolean field10092;
    private boolean field10093;
    private int field10094;
    private final Class8955 field10095;
    private final Class6953<Class3833> field10096;
    private final Class6953<Class7255> field10097;
    private final Set<Class7746> field10098;
    public final Class6357 field10099;
    private final ObjectLinkedOpenHashSet<Class9569> field10100;
    private boolean field10101;
    private final Class8335 field10102;
    
    public Class1849(final Class394 field10090, final Executor executor, final Class8642 field10091, final Class8660 class8660, final Class383 class8661, final Class5028 class8662, final Class6459 class8663) {
        super(class8660, class8661, (class8669, class8670) -> new Class1909((Class1849)class8669, class8664.method29392(), class8664.method29400(), class8664.method29399(), executor2, class8670.method20488(), class8667.method1537().method20613(), class8668, () -> class8671.method1481(Class383.field2223).method6918()), class8662, false);
        this.field10084 = Lists.newArrayList();
        this.field10085 = (Int2ObjectMap<Entity>)new Int2ObjectLinkedOpenHashMap();
        this.field10086 = Maps.newHashMap();
        this.field10087 = Queues.newArrayDeque();
        this.field10088 = Lists.newArrayList();
        this.field10096 = new Class6953<Class3833>(this, class8672 -> class8672 == null || class8672.method11878().method21706(), Class90.field208::method503, Class90.field208::method505, this::method6872);
        this.field10097 = new Class6953<Class7255>(this, class8673 -> class8673 == null || class8673 == Class7558.field29974, Class90.field206::method503, Class90.field206::method505, this::method6871);
        this.field10098 = Sets.newHashSet();
        this.field10100 = (ObjectLinkedOpenHashSet<Class9569>)new ObjectLinkedOpenHashSet();
        this.field10091 = field10091;
        this.field10090 = field10090;
        this.field10095 = new Class8955(this);
        this.method6733();
        this.method6735();
        this.method6787().method34798(field10090.method1559());
        this.field10099 = this.method6918().method27208(() -> new Class6357(this), Class6357.method18930(this.field10063));
        if (!field10090.method1500()) {
            this.method6764().method29567(field10090.method1445());
        }
        this.field10102 = ((this.field10063.method20487() != Class383.field2223) ? null : new Class8335(this));
    }
    
    @Override
    public Class3090 method6841(final int n, final int n2, final int n3) {
        return this.method6904().method7438().method18879().method6960(n, n2, n3);
    }
    
    public void method6862(final BooleanSupplier booleanSupplier) {
        final Class5028 method6796 = this.method6796();
        this.field10101 = true;
        method6796.method15297("world border");
        this.method6787().method34809();
        method6796.method15300("weather");
        final boolean method6797 = this.method6771();
        if (this.field10063.method20503()) {
            if (this.method6765().method31216(Class8878.field37334)) {
                int method6798 = this.field10065.method29554();
                int method6799 = this.field10065.method29558();
                int method6800 = this.field10065.method29562();
                boolean method6801 = this.field10065.method29556();
                boolean method6802 = this.field10065.method29560();
                if (method6798 <= 0) {
                    if (method6799 <= 0) {
                        if (!method6801) {
                            method6799 = this.field10062.nextInt(168000) + 12000;
                        }
                        else {
                            method6799 = this.field10062.nextInt(12000) + 3600;
                        }
                    }
                    else if (--method6799 == 0) {
                        method6801 = !method6801;
                    }
                    if (method6800 <= 0) {
                        if (!method6802) {
                            method6800 = this.field10062.nextInt(168000) + 12000;
                        }
                        else {
                            method6800 = this.field10062.nextInt(12000) + 12000;
                        }
                    }
                    else if (--method6800 == 0) {
                        method6802 = !method6802;
                    }
                }
                else {
                    --method6798;
                    method6799 = (method6801 ? 0 : 1);
                    method6800 = (method6802 ? 0 : 1);
                    method6801 = false;
                    method6802 = false;
                }
                this.field10065.method29559(method6799);
                this.field10065.method29563(method6800);
                this.field10065.method29555(method6798);
                this.field10065.method29557(method6801);
                this.field10065.method29561(method6802);
            }
            this.field10060 = this.field10061;
            if (!this.field10065.method29556()) {
                this.field10061 -= (float)0.01;
            }
            else {
                this.field10061 += (float)0.01;
            }
            this.field10061 = MathHelper.clamp(this.field10061, 0.0f, 1.0f);
            this.field10058 = this.field10059;
            if (!this.field10065.method29560()) {
                this.field10059 -= (float)0.01;
            }
            else {
                this.field10059 += (float)0.01;
            }
            this.field10059 = MathHelper.clamp(this.field10059, 0.0f, 1.0f);
        }
        if (this.field10058 != this.field10059) {
            this.field10090.method1537().method20587(new Class4306(7, this.field10059), this.field10063.method20487());
        }
        if (this.field10060 != this.field10061) {
            this.field10090.method1537().method20587(new Class4306(8, this.field10061), this.field10063.method20487());
        }
        if (method6797 != this.method6771()) {
            if (!method6797) {
                this.field10090.method1537().method20586(new Class4306(1, 0.0f));
            }
            else {
                this.field10090.method1537().method20586(new Class4306(2, 0.0f));
            }
            this.field10090.method1537().method20586(new Class4306(7, this.field10059));
            this.field10090.method1537().method20586(new Class4306(8, this.field10061));
        }
        if (this.method6764().method29568()) {
            if (this.method6954() != Class2113.field12293) {
                this.method6764().method29598(Class2113.field12293);
            }
        }
        if (this.field10093) {
            if (this.field10088.stream().noneMatch(class402 -> !class402.method1639() && !class402.method2851())) {
                this.field10093 = false;
                if (this.method6765().method31216(Class8878.field37324)) {
                    final long n = this.field10065.method29540() + 24000L;
                    this.method6756(n - n % 24000L);
                }
                this.method6863();
                if (this.method6765().method31216(Class8878.field37334)) {
                    this.method6869();
                }
            }
        }
        this.method6733();
        this.method6757();
        method6796.method15300("chunkSource");
        this.method6904().method7403(booleanSupplier);
        method6796.method15300("tickPending");
        if (this.field10065.method29570() != Class9505.field40898) {
            this.field10096.method21346();
            this.field10097.method21346();
        }
        method6796.method15300("raid");
        this.field10099.method18926();
        if (this.field10102 != null) {
            this.field10102.method27773();
        }
        method6796.method15300("blockEvents");
        this.method6905();
        this.field10101 = false;
        method6796.method15300("entities");
        final boolean b = !this.field10088.isEmpty() || !this.method6919().isEmpty();
        if (b) {
            this.method6870();
        }
        if (b || this.field10094++ < 300) {
            this.field10063.method20508();
            method6796.method15297("global");
            for (int i = 0; i < this.field10084.size(); ++i) {
                final Entity class399 = this.field10084.get(i);
                this.method6717(class403 -> {
                    ++class403.field2424;
                    class403.method1659();
                    return;
                }, class399);
                if (class399.field2410) {
                    this.field10084.remove(i--);
                }
            }
            method6796.method15300("regular");
            this.field10089 = true;
            final ObjectIterator iterator = this.field10085.int2ObjectEntrySet().iterator();
            while (iterator.hasNext()) {
                final Entity class400 = (Entity)((Int2ObjectMap$Entry)iterator.next()).getValue();
                final Entity method6803 = class400.method1920();
                if (!this.field10090.method1522()) {
                    if (class400 instanceof Class789 || class400 instanceof Class832) {
                        class400.method1652();
                    }
                }
                if (!this.field10090.method1524()) {
                    if (class400 instanceof Class820) {
                        class400.method1652();
                    }
                }
                method6796.method15297("checkDespawn");
                if (!class400.field2410) {
                    class400.method1949();
                }
                method6796.method15299();
                if (method6803 != null) {
                    if (!method6803.field2410 && method6803.method1909(class400)) {
                        continue;
                    }
                    class400.method1784();
                }
                method6796.method15297("tick");
                if (!class400.field2410) {
                    if (!(class400 instanceof Class859)) {
                        this.method6717(this::method6873, class400);
                    }
                }
                method6796.method15299();
                method6796.method15297("remove");
                if (class400.field2410) {
                    this.method6901(class400);
                    iterator.remove();
                    this.method6898(class400);
                }
                method6796.method15299();
            }
            this.field10089 = false;
            Entity class401;
            while ((class401 = this.field10087.poll()) != null) {
                this.method6899(class401);
            }
            method6796.method15299();
            this.method6716();
        }
        method6796.method15299();
    }
    
    private void method6863() {
        this.field10088.stream().filter(Class511::method2783).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()).forEach(class513 -> class513.method2849(false, false));
    }
    
    public void method6864(final Class1862 class1862, final int n) {
        final Class7859 method7019 = class1862.method7019();
        final boolean method7020 = this.method6771();
        final int method7021 = method7019.method25426();
        final int method7022 = method7019.method25427();
        final Class5028 method7023 = this.method6796();
        method7023.method15297("thunder");
        if (method7020) {
            if (this.method6770()) {
                if (this.field10062.nextInt(100000) == 0) {
                    final BlockPos method7024 = this.method6865(this.method6794(method7021, 0, method7022, 15));
                    if (this.method6772(method7024)) {
                        final Class9592 method7025 = this.method6784(method7024);
                        final boolean b = this.method6765().method31216(Class8878.field37318) && this.field10062.nextDouble() < method7025.method35973() * 0.01;
                        if (b) {
                            final Class809 class1863 = Class7499.field29024.method23371(this);
                            class1863.method4779(true);
                            class1863.method4354(0);
                            class1863.method1656(method7024.getX(), method7024.getY(), method7024.getZ());
                            this.method6886(class1863);
                        }
                        this.method6903(new Class422(this, method7024.getX() + 0.5, method7024.getY(), method7024.getZ() + 0.5, b));
                    }
                }
            }
        }
        method7023.method15300("iceandsnow");
        if (this.field10062.nextInt(16) == 0) {
            final BlockPos method7026 = this.method6958(Class2020.field11525, this.method6794(method7021, 0, method7022, 15));
            final BlockPos method7027 = method7026.method1139();
            final Class3090 method7028 = this.method6959(method7026);
            if (method7028.method9846(this, method7027)) {
                this.method6692(method7027, Class7521.field29330.method11878());
            }
            if (method7020) {
                if (method7028.method9848(this, method7026)) {
                    this.method6692(method7026, Class7521.field29329.method11878());
                }
            }
            if (method7020) {
                if (this.method6959(method7027).method9841() == Class2145.field12629) {
                    this.method6701(method7027).method21696().method11871(this, method7027);
                }
            }
        }
        method7023.method15300("tickBlocks");
        if (n > 0) {
            for (final Class8199 class1864 : class1862.method7014()) {
                if (class1864 != Class1862.field10141) {
                    if (class1864.method27156()) {
                        final int method7030 = class1864.method27159();
                        for (int j = 0; j < n; ++j) {
                            final BlockPos method7031 = this.method6794(method7021, method7030, method7022, 15);
                            method7023.method15297("randomTick");
                            final Class7096 method7032 = class1864.method27148(method7031.getX() - method7021, method7031.getY() - method7030, method7031.getZ() - method7022);
                            if (method7032.method21757()) {
                                method7032.method21740(this, method7031, this.field10062);
                            }
                            final Class7099 method7033 = method7032.method21756();
                            if (method7033.method21788()) {
                                method7033.method21789(this, method7031, this.field10062);
                            }
                            method7023.method15299();
                        }
                    }
                }
            }
        }
        method7023.method15299();
    }
    
    public BlockPos method6865(final BlockPos class354) {
        BlockPos class355 = this.method6958(Class2020.field11525, class354);
        final List<Entity> method6739 = this.method6739((Class<? extends Entity>)Class511.class, new AxisAlignedBB(class355, new BlockPos(class355.getX(), this.method6986(), class355.getZ())).method18496(3.0), class356 -> {
            final boolean b;
            if (class356 != null) {
                if (!(!class356.method1768())) {
                    if (!(!this.method6994(class356.method1894()))) {
                        return b;
                    }
                }
            }
            return b;
        });
        if (method6739.isEmpty()) {
            if (class355.getY() == -1) {
                class355 = class355.method1138(2);
            }
            return class355;
        }
        return ((Class511)method6739.get(this.field10062.nextInt(method6739.size()))).method1894();
    }
    
    public boolean method6866() {
        return this.field10101;
    }
    
    public void method6867() {
        this.field10093 = false;
        if (!this.field10088.isEmpty()) {
            int n = 0;
            int n2 = 0;
            for (final Class513 class513 : this.field10088) {
                if (!class513.method1639()) {
                    if (!class513.method2783()) {
                        continue;
                    }
                    ++n2;
                }
                else {
                    ++n;
                }
            }
            this.field10093 = (n2 > 0 && n2 >= this.field10088.size() - n);
        }
    }
    
    public Class6515 method6868() {
        return this.field10090.method1579();
    }
    
    private void method6869() {
        this.field10065.method29563(0);
        this.field10065.method29561(false);
        this.field10065.method29559(0);
        this.field10065.method29557(false);
    }
    
    @Override
    public void method6680() {
        if (this.field10065.method29537() <= 0) {
            this.field10065.method29544(this.method6743() + 1);
        }
        int method29536 = this.field10065.method29536();
        int method29537 = this.field10065.method29538();
        int n = 0;
        while (this.method6681(new BlockPos(method29536, 0, method29537)).method21706()) {
            method29536 += this.field10062.nextInt(8) - this.field10062.nextInt(8);
            method29537 += this.field10062.nextInt(8) - this.field10062.nextInt(8);
            if (++n != 10000) {
                continue;
            }
            break;
        }
        this.field10065.method29543(method29536);
        this.field10065.method29545(method29537);
    }
    
    public void method6870() {
        this.field10094 = 0;
    }
    
    private void method6871(final Class7460<Class7255> class7460) {
        final Class7099 method6702 = this.method6702(class7460.field28774);
        if (method6702.method21779() == class7460.method22980()) {
            method6702.method21786(this, class7460.field28774);
        }
    }
    
    private void method6872(final Class7460<Class3833> class7460) {
        final Class7096 method6701 = this.method6701(class7460.field28774);
        if (method6701.method21696() == class7460.method22980()) {
            method6701.method21739(this, class7460.field28774, this.field10062);
        }
    }
    
    public void method6873(final Entity class399) {
        if (class399 instanceof Class512 || this.method6904().method7408(class399)) {
            class399.method1731(class399.getPosX(), class399.getPosY(), class399.getPosZ());
            class399.field2401 = class399.field2399;
            class399.field2402 = class399.field2400;
            if (class399.field2440) {
                ++class399.field2424;
                final Class5028 method6796 = this.method6796();
                method6796.method15298(() -> Class90.field210.method503(class400.method1642()).toString());
                method6796.method15302("tickNonPassenger");
                class399.method1659();
                method6796.method15299();
            }
            this.method6875(class399);
            if (class399.field2440) {
                final Iterator<Entity> iterator = class399.method1908().iterator();
                while (iterator.hasNext()) {
                    this.method6874(class399, iterator.next());
                }
            }
        }
    }
    
    public void method6874(final Entity class399, final Entity class400) {
        if (!class400.field2410 && class400.method1920() == class399) {
            if (class400 instanceof Class512 || this.method6904().method7408(class400)) {
                class400.method1731(class400.getPosX(), class400.getPosY(), class400.getPosZ());
                class400.field2401 = class400.field2399;
                class400.field2402 = class400.field2400;
                if (class400.field2440) {
                    ++class400.field2424;
                    final Class5028 method6796 = this.method6796();
                    method6796.method15298(() -> Class90.field210.method503(class401.method1642()).toString());
                    method6796.method15302("tickPassenger");
                    class400.method1772();
                    method6796.method15299();
                }
                this.method6875(class400);
                if (class400.field2440) {
                    final Iterator<Entity> iterator = class400.method1908().iterator();
                    while (iterator.hasNext()) {
                        this.method6874(class400, iterator.next());
                    }
                }
            }
        }
        else {
            class400.method1784();
        }
    }
    
    public void method6875(final Entity class399) {
        this.method6796().method15297("chunkCheck");
        final int method35644 = MathHelper.floor(class399.getPosX() / 16.0);
        final int method35645 = MathHelper.floor(class399.getPosY() / 16.0);
        final int method35646 = MathHelper.floor(class399.getPosZ() / 16.0);
        Label_0123: {
            if (class399.field2440) {
                if (class399.field2441 == method35644) {
                    if (class399.field2442 == method35645) {
                        if (class399.field2443 == method35646) {
                            break Label_0123;
                        }
                    }
                }
            }
            if (class399.field2440) {
                if (this.method6814(class399.field2441, class399.field2443)) {
                    this.method6686(class399.field2441, class399.field2443).method7054(class399, class399.field2442);
                }
            }
            if (!class399.method1906() && !this.method6814(method35644, method35646)) {
                class399.field2440 = false;
            }
            else {
                this.method6686(method35644, method35646).method7010(class399);
            }
        }
        this.method6796().method15299();
    }
    
    @Override
    public boolean method6760(final Class512 class512, final BlockPos class513) {
        return !this.field10090.method1549(this, class513, class512) && this.method6787().method34779(class513);
    }
    
    public void method6876(final Class8511 class8511) {
        if (this.field10063.method20494()) {
            if (this.field10065.method29570() != Class9505.field40898) {
                final Class1868 method18879 = this.method6904().method7438().method18879();
                final BlockPos method18880 = method18879.method7119(0, this.method6743(), 0, 256, method18879.method7117(), new Random(this.method6753()));
                final Class7859 class8512 = (method18880 != null) ? new Class7859(method18880) : new Class7859(0, 0);
                if (method18880 == null) {
                    Class1849.field10083.warn("Unable to find spawn biome");
                }
                boolean b = false;
                final Iterator<Class3833> iterator = Class7188.field27918.method25616().iterator();
                while (iterator.hasNext()) {
                    if (!method18879.method7122().contains(iterator.next().method11878())) {
                        continue;
                    }
                    b = true;
                    break;
                }
                this.field10065.method29548(class8512.method25435().method1134(8, this.method6904().method7438().method18852(), 8));
                int n = 0;
                int n2 = 0;
                int n3 = 0;
                int n4 = -1;
                for (int i = 0; i < 1024; ++i) {
                    if (n > -16) {
                        if (n <= 16) {
                            if (n2 > -16) {
                                if (n2 <= 16) {
                                    final BlockPos method18881 = this.field10063.method20489(new Class7859(class8512.field32290 + n, class8512.field32291 + n2), b);
                                    if (method18881 != null) {
                                        this.field10065.method29548(method18881);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Label_0438: {
                        if (n != n2) {
                            if (n >= 0 || n != -n2) {
                                if (n <= 0) {
                                    break Label_0438;
                                }
                                if (n != 1 - n2) {
                                    break Label_0438;
                                }
                            }
                        }
                        final int n5 = n3;
                        n3 = -n4;
                        n4 = n5;
                    }
                    n += n3;
                    n2 += n4;
                }
                if (class8511.method28434()) {
                    this.method6877();
                }
            }
            else {
                this.field10065.method29548(BlockPos.ZERO.method1137());
            }
        }
        else {
            this.field10065.method29548(BlockPos.ZERO.method1138(this.method6904().method7438().method18852()));
        }
    }
    
    public void method6877() {
        Class4535.field20016.method13527(Class5113.field22059).method28613(this, (Class6346<? extends Class7065>)this.method6904().method7438(), this.field10062, new BlockPos(this.field10065.method29536(), this.field10065.method29537(), this.field10065.method29538()));
    }
    
    @Nullable
    public BlockPos method6878() {
        return this.field10063.method20500();
    }
    
    public void method6879(final Class732 class732, final boolean b, final boolean b2) throws SessionLockException {
        final Class1909 method6904 = this.method6904();
        if (!b2) {
            if (class732 != null) {
                class732.method4036(new Class2259("menu.savingLevel", new Object[0]));
            }
            this.method6880();
            if (class732 != null) {
                class732.method4038(new Class2259("menu.savingChunks", new Object[0]));
            }
            method6904.method7435(b);
        }
    }
    
    public void method6880() throws SessionLockException {
        this.method6916();
        this.field10063.method20507();
        this.method6904().method7450().method27214();
    }
    
    public List<Entity> method6881(final Class7499<?> class7499, final Predicate<? super Entity> predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class1909 method6904 = this.method6904();
        for (final Entity class7500 : this.field10085.values()) {
            if (class7499 != null && class7500.method1642() != class7499) {
                continue;
            }
            if (!method6904.method7401(MathHelper.floor(class7500.getPosX()) >> 4, MathHelper.floor(class7500.getPosZ()) >> 4)) {
                continue;
            }
            if (!predicate.test(class7500)) {
                continue;
            }
            arrayList.add(class7500);
        }
        return arrayList;
    }
    
    public List<Class852> method6882() {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Entity class399 : this.field10085.values()) {
            if (!(class399 instanceof Class852)) {
                continue;
            }
            if (!class399.method1768()) {
                continue;
            }
            arrayList.add(class399);
        }
        return arrayList;
    }
    
    public List<Class513> method6883(final Predicate<? super Class513> predicate) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class513 class513 : this.field10088) {
            if (!predicate.test(class513)) {
                continue;
            }
            arrayList.add(class513);
        }
        return arrayList;
    }
    
    @Nullable
    public Class513 method6884() {
        final List<Class513> method6883 = this.method6883(Class511::method1768);
        return method6883.isEmpty() ? null : ((Class513)method6883.get(this.field10062.nextInt(method6883.size())));
    }
    
    public Object2IntMap<Class1976> method6885() {
        final Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (final Entity class399 : this.field10085.values()) {
            if (class399 instanceof Class759) {
                final Class759 class400 = (Class759)class399;
                if (class400.method4194() || class400.method4169()) {
                    continue;
                }
            }
            final Class1976 method23365 = class399.method1642().method23365();
            if (method23365 == Class1976.field10952) {
                continue;
            }
            if (!this.method6904().method7433(class399)) {
                continue;
            }
            ((Object2IntMap)object2IntOpenHashMap).mergeInt((Object)method23365, 1, (BiFunction)Integer::sum);
        }
        return (Object2IntMap<Class1976>)object2IntOpenHashMap;
    }
    
    @Override
    public boolean method6886(final Entity class399) {
        return this.method6894(class399);
    }
    
    public boolean method6887(final Entity class399) {
        return this.method6894(class399);
    }
    
    public void method6888(final Entity class399) {
        final boolean field2390 = class399.field2390;
        class399.field2390 = true;
        this.method6887(class399);
        class399.field2390 = field2390;
        this.method6875(class399);
    }
    
    public void method6889(final Class513 class513) {
        this.method6893(class513);
        this.method6875(class513);
    }
    
    public void method6890(final Class513 class513) {
        this.method6893(class513);
        this.method6875(class513);
    }
    
    public void method6891(final Class513 class513) {
        this.method6893(class513);
    }
    
    public void method6892(final Class513 class513) {
        this.method6893(class513);
    }
    
    private void method6893(final Class513 class513) {
        final Entity class514 = this.field10086.get(class513.method1865());
        if (class514 != null) {
            Class1849.field10083.warn("Force-added player with duplicate UUID {}", (Object)class513.method1865().toString());
            class514.method1640();
            this.method6902((Class513)class514);
        }
        this.field10088.add(class513);
        this.method6867();
        final Class1860 method6687 = this.method6687(MathHelper.floor(class513.getPosX() / 16.0), MathHelper.floor(class513.getPosZ() / 16.0), Class9312.field39989, true);
        if (method6687 instanceof Class1862) {
            method6687.method7010(class513);
        }
        this.method6899(class513);
    }
    
    private boolean method6894(final Entity class399) {
        if (class399.field2410) {
            Class1849.field10083.warn("Tried to add entity {} but it was marked as removed already", (Object)Class7499.method23354(class399.method1642()));
            return false;
        }
        if (this.method6896(class399)) {
            return false;
        }
        final Class1860 method6687 = this.method6687(MathHelper.floor(class399.getPosX() / 16.0), MathHelper.floor(class399.getPosZ() / 16.0), Class9312.field39989, class399.field2390);
        if (method6687 instanceof Class1862) {
            method6687.method7010(class399);
            this.method6899(class399);
            return true;
        }
        return false;
    }
    
    public boolean method6895(final Entity class399) {
        if (!this.method6896(class399)) {
            this.method6899(class399);
            return true;
        }
        return false;
    }
    
    private boolean method6896(final Entity class399) {
        final Entity class400 = this.field10086.get(class399.method1865());
        if (class400 != null) {
            Class1849.field10083.warn("Keeping entity {} that already exists with UUID {}", (Object)Class7499.method23354(class400.method1642()), (Object)class399.method1865().toString());
            return true;
        }
        return false;
    }
    
    public void method6897(final Class1862 class1862) {
        this.field10053.addAll(class1862.method7066().values());
        final Class80<Entity>[] method7067 = class1862.method7067();
        for (int length = method7067.length, i = 0; i < length; ++i) {
            for (final Entity class1863 : method7067[i]) {
                if (class1863 instanceof Class513) {
                    continue;
                }
                if (this.field10089) {
                    throw Class8349.method27859(new IllegalStateException("Removing entity while ticking!"));
                }
                this.field10085.remove(class1863.method1643());
                this.method6898(class1863);
            }
        }
    }
    
    public void method6898(final Entity class399) {
        if (class399 instanceof Class852) {
            final Class859[] method5123 = ((Class852)class399).method5123();
            for (int length = method5123.length, i = 0; i < length; ++i) {
                method5123[i].method1652();
            }
        }
        this.field10086.remove(class399.method1865());
        this.method6904().method7444(class399);
        if (class399 instanceof Class513) {
            this.field10088.remove(class399);
        }
        this.method6868().method19655(class399);
        if (class399 instanceof Class759) {
            this.field10098.remove(((Class759)class399).method4150());
        }
    }
    
    private void method6899(final Entity class399) {
        if (!this.field10089) {
            this.field10085.put(class399.method1643(), (Object)class399);
            if (class399 instanceof Class852) {
                for (final Class859 class400 : ((Class852)class399).method5123()) {
                    this.field10085.put(class400.method1643(), (Object)class400);
                }
            }
            this.field10086.put(class399.method1865(), class399);
            this.method6904().method7445(class399);
            if (class399 instanceof Class759) {
                this.field10098.add(((Class759)class399).method4150());
            }
        }
        else {
            this.field10087.add(class399);
        }
    }
    
    public void method6900(final Entity class399) {
        if (!this.field10089) {
            this.method6901(class399);
            this.field10085.remove(class399.method1643());
            this.method6898(class399);
            return;
        }
        throw Class8349.method27859(new IllegalStateException("Removing entity while ticking!"));
    }
    
    private void method6901(final Entity class399) {
        final Class1860 method6687 = this.method6687(class399.field2441, class399.field2443, Class9312.field39989, false);
        if (method6687 instanceof Class1862) {
            ((Class1862)method6687).method7053(class399);
        }
    }
    
    public void method6902(final Class513 class513) {
        class513.method1652();
        this.method6900(class513);
        this.method6867();
    }
    
    public void method6903(final Class422 class422) {
        this.field10084.add(class422);
        this.field10090.method1537().method20599(null, class422.getPosX(), class422.getPosY(), class422.getPosZ(), 512.0, this.field10063.method20487(), new Class4318(class422));
    }
    
    @Override
    public void method6780(final int n, final BlockPos class354, final int n2) {
        for (final Class513 class355 : this.field10090.method1537().method20623()) {
            if (class355 == null) {
                continue;
            }
            if (class355.field2391 != this) {
                continue;
            }
            if (class355.method1643() == n) {
                continue;
            }
            final double n3 = class354.getX() - class355.getPosX();
            final double n4 = class354.getY() - class355.getPosY();
            final double n5 = class354.getZ() - class355.getPosZ();
            if (n3 * n3 + n4 * n4 + n5 * n5 >= 1024.0) {
                continue;
            }
            class355.field3039.method17469(new Class4310(n, class354, n2));
        }
    }
    
    @Override
    public void method6706(final Class512 class512, final double n, final double n2, final double n3, final Class7795 class513, final Class286 class514, final float n4, final float n5) {
        this.field10090.method1537().method20599(class512, n, n2, n3, (n4 <= 1.0f) ? 16.0 : ((double)(16.0f * n4)), this.field10063.method20487(), new Class4282(class513, class514, n, n2, n3, n4, n5));
    }
    
    @Override
    public void method6707(final Class512 class512, final Entity class513, final Class7795 class514, final Class286 class515, final float n, final float n2) {
        this.field10090.method1537().method20599(class512, class513.getPosX(), class513.getPosY(), class513.getPosZ(), (n <= 1.0f) ? 16.0 : ((double)(16.0f * n)), this.field10063.method20487(), new Class4351(class514, class515, class513, n, n2));
    }
    
    @Override
    public void method6777(final int n, final BlockPos class354, final int n2) {
        this.field10090.method1537().method20586(new Class4395(n, class354, n2, true));
    }
    
    @Override
    public void method6839(final Class512 class512, final int n, final BlockPos class513, final int n2) {
        this.field10090.method1537().method20599(class512, class513.getX(), class513.getY(), class513.getZ(), 64.0, this.field10063.method20487(), new Class4395(n, class513, n2, false));
    }
    
    @Override
    public void method6693(final BlockPos class354, final Class7096 class355, final Class7096 class356, final int n) {
        this.method6904().method7440(class354);
        if (Class7698.method24496(class355.method21727(this, class354), class356.method21727(this, class354), Class9306.field39922)) {
            for (final Class7746 class357 : this.field10098) {
                if (class357.method24717()) {
                    continue;
                }
                class357.method24743(class354);
            }
        }
    }
    
    @Override
    public void method6761(final Entity class399, final byte b) {
        this.method6904().method7446(class399, new Class4264(class399, b));
    }
    
    public Class1909 method6904() {
        return (Class1909)super.method6762();
    }
    
    @Override
    public Class6154 method6724(final Entity class399, final Class7929 class400, final double n, final double n2, final double n3, final float n4, final boolean b, final Class2196 class401) {
        final Class6154 class402 = new Class6154(this, class399, n, n2, n3, n4, b, class401);
        if (class400 != null) {
            class402.method18412(class400);
        }
        class402.method18408();
        class402.method18409(false);
        if (class401 == Class2196.field13365) {
            class402.method18415();
        }
        for (final Class513 class403 : this.field10088) {
            if (class403.method1733(n, n2, n3) >= 4096.0) {
                continue;
            }
            class403.field3039.method17469(new Class4394(n, n2, n3, n4, class402.method18416(), class402.method18413().get(class403)));
        }
        return class402;
    }
    
    @Override
    public void method6763(final BlockPos class354, final Class3833 class355, final int n, final int n2) {
        this.field10100.add((Object)new Class9569(class354, class355, n, n2));
    }
    
    private void method6905() {
        while (!this.field10100.isEmpty()) {
            final Class9569 class9569 = (Class9569)this.field10100.removeFirst();
            if (!this.method6906(class9569)) {
                continue;
            }
            this.field10090.method1537().method20599(null, class9569.method35807().getX(), class9569.method35807().getY(), class9569.method35807().getZ(), 64.0, this.field10063.method20487(), new Class4363(class9569.method35807(), class9569.method35808(), class9569.method35809(), class9569.method35810()));
        }
    }
    
    private boolean method6906(final Class9569 class9569) {
        final Class7096 method6701 = this.method6701(class9569.method35807());
        return method6701.method21696() == class9569.method35808() && method6701.method21733(this, class9569.method35807(), class9569.method35809(), class9569.method35810());
    }
    
    public Class6953<Class3833> method6907() {
        return this.field10096;
    }
    
    public Class6953<Class7255> method6908() {
        return this.field10097;
    }
    
    @Nonnull
    @Override
    public Class394 method6679() {
        return this.field10090;
    }
    
    public Class8955 method6909() {
        return this.field10095;
    }
    
    public Class1795 method6910() {
        return this.field10091.method29399();
    }
    
    public <T extends Class6909> int method6911(final T t, final double n, final double n2, final double n3, final int n4, final double n5, final double n6, final double n7, final double n8) {
        final Class4278 class4278 = new Class4278((T)t, false, n, n2, n3, (float)n5, (float)n6, (float)n7, (float)n8, n4);
        int n9 = 0;
        for (int i = 0; i < this.field10088.size(); ++i) {
            if (this.method6913(this.field10088.get(i), false, n, n2, n3, class4278)) {
                ++n9;
            }
        }
        return n9;
    }
    
    public <T extends Class6909> boolean method6912(final Class513 class513, final T t, final boolean b, final double n, final double n2, final double n3, final int n4, final double n5, final double n6, final double n7, final double n8) {
        return this.method6913(class513, b, n, n2, n3, new Class4278((T)t, b, n, n2, n3, (float)n5, (float)n6, (float)n7, (float)n8, n4));
    }
    
    private boolean method6913(final Class513 class513, final boolean b, final double n, final double n2, final double n3, final Class4252<?> class514) {
        if (class513.method2940() != this) {
            return false;
        }
        if (!class513.method1894().withinDistance(new Vec3d(n, n2, n3), b ? 512.0 : 32.0)) {
            return false;
        }
        class513.field3039.method17469(class514);
        return true;
    }
    
    @Nullable
    @Override
    public Entity method6741(final int n) {
        return (Entity)this.field10085.get(n);
    }
    
    @Nullable
    public Entity method6914(final UUID uuid) {
        return this.field10086.get(uuid);
    }
    
    @Nullable
    public BlockPos method6915(final String s, final BlockPos class354, final int n, final boolean b) {
        return this.method6904().method7438().method18874(this, s, class354, n, b);
    }
    
    @Override
    public Class1780 method6792() {
        return this.field10090.method1577();
    }
    
    @Override
    public Class1792 method6793() {
        return this.field10090.method1578();
    }
    
    @Override
    public void method6752(final long n) {
        super.method6752(n);
        this.field10065.method29601().run(this.field10090, n);
    }
    
    @Override
    public boolean method6795() {
        return this.field10092;
    }
    
    public void method6916() throws SessionLockException {
        this.field10091.method29393();
    }
    
    public Class8642 method6917() {
        return this.field10091;
    }
    
    public Class8213 method6918() {
        return this.method6904().method7450();
    }
    
    @Nullable
    @Override
    public Class6356 method6774(final String s) {
        return this.method6679().method1481(Class383.field2223).method6918().method27209(() -> new Class6356(s2), s);
    }
    
    @Override
    public void method6775(final Class6356 class6356) {
        this.method6679().method1481(Class383.field2223).method6918().method27211(class6356);
    }
    
    @Override
    public int method6776() {
        return this.method6679().method1481(Class383.field2223).method6918().method27208(Class6361::new, "idcounts").method18948();
    }
    
    @Override
    public void method6759(final BlockPos class354) {
        final Class7859 class355 = new Class7859(new BlockPos(this.field10065.method29536(), 0, this.field10065.method29538()));
        super.method6759(class354);
        this.method6904().method7442(Class9105.field38565, class355, 11, Class315.field1875);
        this.method6904().method7441(Class9105.field38565, new Class7859(class354), 11, Class315.field1875);
    }
    
    public LongSet method6919() {
        final Class6358 class6358 = this.method6918().method27209(Class6358::new, "chunks");
        return (LongSet)((class6358 == null) ? LongSets.EMPTY_SET : LongSets.unmodifiable(class6358.method18933()));
    }
    
    public boolean method6920(final int n, final int n2, final boolean b) {
        final Class6358 class6358 = this.method6918().method27208(Class6358::new, "chunks");
        final Class7859 class6359 = new Class7859(n, n2);
        final long method25422 = class6359.method25422();
        boolean b2;
        if (!b) {
            b2 = class6358.method18933().remove(method25422);
        }
        else {
            b2 = class6358.method18933().add(method25422);
            if (b2) {
                this.method6686(n, n2);
            }
        }
        class6358.method18904(b2);
        if (b2) {
            this.method6904().method7407(class6359, b);
        }
        return b2;
    }
    
    @Override
    public List<Class513> method6840() {
        return this.field10088;
    }
    
    @Override
    public void method6689(final BlockPos class354, final Class7096 class355, final Class7096 class356) {
        final Optional<Class8912> method31401 = Class8912.method31401(class355);
        final Optional<Class8912> method31402 = Class8912.method31401(class356);
        if (!Objects.equals(method31401, method31402)) {
            class354.method1153();
            method31401.ifPresent(p1 -> this.method6679().execute(() -> {
                this.method6921().method7197(class357);
                Class9324.method34533(this, class357);
            }));
            method31402.ifPresent(p1 -> this.method6679().execute(() -> {
                this.method6921().method7196(class358, class359);
                Class9324.method34532(this, class358);
            }));
        }
    }
    
    public Class1883 method6921() {
        return this.method6904().method7451();
    }
    
    public boolean method6922(final BlockPos class354) {
        return this.method6924(class354, 1);
    }
    
    public boolean method6923(final Class353 class353) {
        return this.method6922(class353.method1114());
    }
    
    public boolean method6924(final BlockPos class354, final int n) {
        return n <= 6 && this.method6925(Class353.method1089(class354)) <= n;
    }
    
    public int method6925(final Class353 class353) {
        return this.method6921().method7211(class353);
    }
    
    public Class6357 method6926() {
        return this.field10099;
    }
    
    @Nullable
    public Class8792 method6927(final BlockPos class354) {
        return this.field10099.method18932(class354, 9216);
    }
    
    public boolean method6928(final BlockPos class354) {
        return this.method6927(class354) != null;
    }
    
    public void method6929(final Class8156 class8156, final Entity class8157, final Class831 class8158) {
        class8158.method4896(class8156, class8157);
    }
    
    public void method6930(final Path path) throws IOException {
        final Class388 field10354 = this.method6904().field10354;
        try (final BufferedWriter bufferedWriter = Files.newBufferedWriter(path.resolve("stats.txt"), new OpenOption[0])) {
            bufferedWriter.write(String.format("spawning_chunks: %d\n", field10354.method1341().method30140()));
            for (final Object2IntMap$Entry object2IntMap$Entry : this.method6885().object2IntEntrySet()) {
                bufferedWriter.write(String.format("spawn_count.%s: %d\n", ((Class1976)object2IntMap$Entry.getKey()).method7986(), object2IntMap$Entry.getIntValue()));
            }
            bufferedWriter.write(String.format("entities: %d\n", this.field10085.size()));
            bufferedWriter.write(String.format("block_entities: %d\n", this.field10050.size()));
            bufferedWriter.write(String.format("block_ticks: %d\n", this.method6907().method21354()));
            bufferedWriter.write(String.format("fluid_ticks: %d\n", this.method6908().method21354()));
            bufferedWriter.write("distance_manager: " + field10354.method1341().method30142() + "\n");
            bufferedWriter.write(String.format("pending_tasks: %d\n", this.method6904().method7437()));
        }
        final Class7689 class7689 = new Class7689("Level dump", new Exception("dummy"));
        this.method6779(class7689);
        try (final BufferedWriter bufferedWriter2 = Files.newBufferedWriter(path.resolve("example_crash.txt"), new OpenOption[0])) {
            bufferedWriter2.write(class7689.method24414());
        }
        try (final BufferedWriter bufferedWriter3 = Files.newBufferedWriter(path.resolve("chunks.csv"), new OpenOption[0])) {
            field10354.method1343(bufferedWriter3);
        }
        try (final BufferedWriter bufferedWriter4 = Files.newBufferedWriter(path.resolve("entities.csv"), new OpenOption[0])) {
            method6931(bufferedWriter4, (Iterable<Entity>)this.field10085.values());
        }
        try (final BufferedWriter bufferedWriter5 = Files.newBufferedWriter(path.resolve("global_entities.csv"), new OpenOption[0])) {
            method6931(bufferedWriter5, this.field10084);
        }
        try (final BufferedWriter bufferedWriter6 = Files.newBufferedWriter(path.resolve("block_entities.csv"), new OpenOption[0])) {
            this.method6932(bufferedWriter6);
        }
    }
    
    private static void method6931(final Writer writer, final Iterable<Entity> iterable) throws IOException {
        final Class8308 method22418 = Class8308.method27594().method22417("x").method22417("y").method22417("z").method22417("uuid").method22417("type").method22417("alive").method22417("display_name").method22417("custom_name").method22418(writer);
        for (final Entity class399 : iterable) {
            final Class2250 method22419 = class399.method1873();
            method22418.method27595(class399.getPosX(), class399.getPosY(), class399.getPosZ(), class399.method1865(), Class90.field210.method503(class399.method1642()), class399.method1768(), class399.method1871().getString(), (method22419 == null) ? null : method22419.getString());
        }
    }
    
    private void method6932(final Writer writer) throws IOException {
        final Class8308 method22418 = Class8308.method27594().method22417("x").method22417("y").method22417("z").method22417("type").method22418(writer);
        for (final Class436 class436 : this.field10050) {
            final BlockPos method22419 = class436.method2193();
            method22418.method27595(method22419.getX(), method22419.getY(), method22419.getZ(), Class90.field224.method503(class436.method2206()));
        }
    }
    
    @VisibleForTesting
    public void method6933(final Class6997 class6997) {
        this.field10100.removeIf(class6999 -> class6998.method21415(class6999.method35807()));
    }
    
    static {
        field10083 = LogManager.getLogger();
    }
}
