// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry;
import com.google.common.collect.Iterables;
import java.util.function.BooleanSupplier;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class Class1848 extends Class1847
{
    private final List<Entity> field10071;
    public final Int2ObjectMap<Entity> field10072;
    private final Class5799 field10073;
    private final Class1656 field10074;
    private final Class869 field10075;
    private final List<Class754> field10076;
    private int field10077;
    private Class6516 field10078;
    private final Map<String, Class6356> field10079;
    private int field10080;
    private final Object2ObjectArrayMap<Class8895, Class8141> field10081;
    private boolean field10082;
    
    public Class1848(final Class5799 field10073, final Class8511 class8511, final Class383 class8512, final int n, final Class5028 class8513, final Class1656 field10074) {
        super(new Class8660(class8511, "MpServer"), class8512, (class8515, p2) -> new Class1907((Class1848)class8515, n2), class8513, true);
        this.field10071 = Lists.newArrayList();
        this.field10072 = (Int2ObjectMap<Entity>)new Int2ObjectOpenHashMap();
        this.field10075 = Class869.method5277();
        this.field10076 = Lists.newArrayList();
        this.field10077 = this.field10062.nextInt(12000);
        this.field10078 = new Class6516();
        this.field10079 = Maps.newHashMap();
        this.field10081 = (Object2ObjectArrayMap<Class8895, Class8141>)Class8349.method27851(new Object2ObjectArrayMap(3), object2ObjectArrayMap -> {
            object2ObjectArrayMap.put((Object)Class8364.field34301, (Object)new Class8141());
            object2ObjectArrayMap.put((Object)Class8364.field34302, (Object)new Class8141());
            object2ObjectArrayMap.put((Object)Class8364.field34303, (Object)new Class8141());
            return;
        });
        this.field10082 = false;
        this.field10073 = field10073;
        this.field10074 = field10074;
        this.method6759(new BlockPos(8, 64, 8));
        this.method6733();
        this.method6735();
        if (Class9570.field41366.method22605()) {
            Class9570.method35826(this, Class9570.field41185, Class9570.method35826(this.field10063, Class9570.field41366, new Object[0]));
        }
        Class9570.method35840(Class9570.field41427, this);
        if (this.field10075.field4682 != null) {
            if (this.field10075.field4682.getClass() == Class8245.class) {
                this.field10075.field4682 = new Class8246(this.field10075, this.field10073);
                Class7890.method25550((Class8246)this.field10075.field4682);
            }
        }
    }
    
    public void method6805(final BooleanSupplier booleanSupplier) {
        this.method6787().method34809();
        this.method6757();
        this.method6796().method15297("blocks");
        this.field10064.method7403(booleanSupplier);
        this.method6815();
        this.method6796().method15299();
    }
    
    public Iterable<Entity> method6806() {
        return Iterables.concat((Iterable)this.field10072.values(), (Iterable)this.field10071);
    }
    
    public void method6807() {
        final Class5028 method6796 = this.method6796();
        method6796.method15297("entities");
        method6796.method15297("global");
        for (int i = 0; i < this.field10071.size(); ++i) {
            final Entity class399 = this.field10071.get(i);
            this.method6717(class401 -> {
                ++class401.field2424;
                if (!(!Class7667.method24316(class401))) {
                    class401.method1659();
                }
                return;
            }, class399);
            if (class399.field2410) {
                this.field10071.remove(i--);
            }
        }
        method6796.method15300("regular");
        final ObjectIterator iterator = this.field10072.int2ObjectEntrySet().iterator();
        while (iterator.hasNext()) {
            final Entity class400 = (Entity)((Int2ObjectMap$Entry)iterator.next()).getValue();
            if (class400.method1805()) {
                continue;
            }
            method6796.method15297("tick");
            if (!class400.field2410) {
                this.method6717(this::method6808, class400);
            }
            method6796.method15299();
            method6796.method15297("remove");
            if (class400.field2410) {
                iterator.remove();
                this.method6822(class400);
            }
            method6796.method15299();
        }
        method6796.method15299();
        this.method6716();
        method6796.method15299();
    }
    
    public void method6808(final Entity class399) {
        if (class399 instanceof Class512 || this.method6835().method7408(class399)) {
            class399.method1731(class399.getPosX(), class399.getPosY(), class399.getPosZ());
            class399.field2401 = class399.field2399;
            class399.field2402 = class399.field2400;
            if (class399.field2440 || class399.method1639()) {
                ++class399.field2424;
                this.method6796().method15298(() -> Class90.field210.method503(class400.method1642()).toString());
                if (Class7667.method24316(class399)) {
                    class399.method1659();
                }
                this.method6796().method15299();
            }
            this.method6810(class399);
            if (class399.field2440) {
                final Iterator<Entity> iterator = class399.method1908().iterator();
                while (iterator.hasNext()) {
                    this.method6809(class399, iterator.next());
                }
            }
        }
    }
    
    public void method6809(final Entity class399, final Entity class400) {
        if (!class400.field2410 && class400.method1920() == class399) {
            if (class400 instanceof Class512 || this.method6835().method7408(class400)) {
                class400.method1731(class400.getPosX(), class400.getPosY(), class400.getPosZ());
                class400.field2401 = class400.field2399;
                class400.field2402 = class400.field2400;
                if (class400.field2440) {
                    ++class400.field2424;
                    class400.method1772();
                }
                this.method6810(class400);
                if (class400.field2440) {
                    final Iterator<Entity> iterator = class400.method1908().iterator();
                    while (iterator.hasNext()) {
                        this.method6809(class400, iterator.next());
                    }
                }
            }
        }
        else {
            class400.method1784();
        }
    }
    
    public void method6810(final Entity class399) {
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
    
    public void method6811(final Class1862 class1862) {
        Collection<Class436> field10053;
        if (!Class9570.field41360.method22634()) {
            field10053 = this.field10053;
        }
        else {
            field10053 = (Collection)Class9570.method35828(this, Class9570.field41360);
        }
        field10053.addAll(class1862.method7066().values());
        this.field10064.method7405().method7255(class1862.method7019(), false);
    }
    
    public void method6812(final int n, final int n2) {
        this.field10081.forEach((p2, class8141) -> class8141.method26830(n3, n4));
    }
    
    public void method6813() {
        this.field10081.forEach((p0, class8141) -> class8141.method26831());
    }
    
    @Override
    public boolean method6814(final int n, final int n2) {
        return true;
    }
    
    private void method6815() {
        if (this.field10075.field4684 != null) {
            if (this.field10077 <= 0) {
                final BlockPos class354 = new BlockPos(this.field10075.field4684);
                final BlockPos method1134 = class354.method1134(4 * (this.field10062.nextInt(3) - 1), 4 * (this.field10062.nextInt(3) - 1), 4 * (this.field10062.nextInt(3) - 1));
                final double method1135 = class354.distanceSq(method1134);
                if (method1135 >= 4.0) {
                    if (method1135 <= 256.0) {
                        if (this.method6701(method1134).method21706()) {
                            if (this.method6993(method1134, 0) <= this.field10062.nextInt(8)) {
                                if (this.method6992(Class237.field911, method1134) <= 0) {
                                    this.method6708(method1134.getX() + 0.5, method1134.getY() + 0.5, method1134.getZ() + 0.5, Class8520.field34964, Class286.field1586, 0.7f, 0.8f + this.field10062.nextFloat() * 0.2f, false);
                                    this.field10077 = this.field10062.nextInt(12000) + 6000;
                                }
                            }
                        }
                    }
                }
            }
            else {
                --this.field10077;
            }
        }
    }
    
    public int method6816() {
        return this.field10072.size();
    }
    
    public void method6817(final Class422 class422) {
        this.field10071.add(class422);
    }
    
    public void method6818(final int n, final Class754 class754) {
        this.method6820(n, class754);
        this.field10076.add(class754);
    }
    
    public void method6819(final int n, final Entity class399) {
        this.method6820(n, class399);
    }
    
    private void method6820(final int n, final Entity class399) {
        if (!Class9570.field41223.method22619() || !Class9570.method35840(Class9570.field41223, class399, this)) {
            this.method6821(n);
            this.field10072.put(n, (Object)class399);
            this.method6835().method7413(MathHelper.floor(class399.getPosX() / 16.0), MathHelper.floor(class399.getPosZ() / 16.0), Class9312.field39989, true).method7010(class399);
            if (Class9570.field41253.method22605()) {
                Class9570.method35826(class399, Class9570.field41253, new Object[0]);
            }
            this.method6851(class399);
        }
    }
    
    public void method6821(final int n) {
        final Entity class399 = (Entity)this.field10072.remove(n);
        if (class399 != null) {
            class399.method1652();
            this.method6822(class399);
        }
    }
    
    private void method6822(final Entity class399) {
        class399.method1640();
        if (class399.field2440) {
            this.method6686(class399.field2441, class399.field2443).method7053(class399);
        }
        this.field10076.remove(class399);
        if (Class9570.field41254.method22605()) {
            Class9570.method35826(class399, Class9570.field41254, new Object[0]);
        }
        this.method6852(class399);
    }
    
    public void method6823(final Class1862 class1862) {
        final ObjectIterator iterator = this.field10072.int2ObjectEntrySet().iterator();
        while (((Iterator)iterator).hasNext()) {
            final Entity class1863 = (Entity)((Int2ObjectMap$Entry)((Iterator)iterator).next()).getValue();
            final int method35644 = MathHelper.floor(class1863.getPosX() / 16.0);
            final int method35645 = MathHelper.floor(class1863.getPosZ() / 16.0);
            if (method35644 != class1862.method7019().field32290) {
                continue;
            }
            if (method35645 != class1862.method7019().field32291) {
                continue;
            }
            class1862.method7010(class1863);
        }
    }
    
    @Nullable
    @Override
    public Entity method6741(final int n) {
        return (Entity)this.field10072.get(n);
    }
    
    public void method6824(final BlockPos class354, final Class7096 class355) {
        this.method6688(class354, class355, 19);
    }
    
    @Override
    public void method6751() {
        this.field10073.method17369().method11181(new Class2259("multiplayer.status.quitting", new Object[0]));
    }
    
    public void method6825(final int n, final int n2, final int n3) {
        final Random random = new Random();
        boolean b = false;
        if (this.field10075.field4682.method27336() == Class101.field299) {
            final Iterator<Class8321> iterator = this.field10075.field4684.method1800().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().method27622() != Class7521.field29517.method11704()) {
                    continue;
                }
                b = true;
                break;
            }
        }
        final Class385 class385 = new Class385();
        for (int i = 0; i < 667; ++i) {
            this.method6826(n, n2, n3, 16, random, b, class385);
            this.method6826(n, n2, n3, 32, random, b, class385);
        }
    }
    
    public void method6826(final int n, final int n2, final int n3, final int n4, final Random random, final boolean b, final Class385 class385) {
        final int n5 = n + this.field10062.nextInt(n4) - this.field10062.nextInt(n4);
        final int n6 = n2 + this.field10062.nextInt(n4) - this.field10062.nextInt(n4);
        final int n7 = n3 + this.field10062.nextInt(n4) - this.field10062.nextInt(n4);
        class385.method1284(n5, n6, n7);
        final Class7096 method6701 = this.method6701(class385);
        method6701.method21696().method11823(method6701, this, class385, random);
        final Class7099 method6702 = this.method6702(class385);
        if (!method6702.method21781()) {
            method6702.method21787(this, class385, random);
            final Class6909 method6703 = method6702.method21792();
            if (method6703 != null) {
                if (this.field10062.nextInt(10) == 0) {
                    final boolean method6704 = method6701.method21761(this, class385, Direction.DOWN);
                    final BlockPos method6705 = class385.method1139();
                    this.method6827(method6705, this.method6701(method6705), method6703, method6704);
                }
            }
        }
        if (b) {
            if (method6701.method21696() == Class7521.field29517) {
                this.method6709(Class8432.field34599, n5 + 0.5, n6 + 0.5, n7 + 0.5, 0.0, 0.0, 0.0);
            }
        }
    }
    
    private void method6827(final BlockPos class354, final Class7096 class355, final Class6909 class356, final boolean b) {
        if (class355.method21756().method21781()) {
            final Class7702 method21727 = class355.method21727(this, class354);
            if (method21727.method24536(Axis.Y) >= 1.0) {
                if (!class355.method21755(Class7188.field27919)) {
                    final double method21728 = method21727.method24535(Axis.Y);
                    if (method21728 <= 0.0) {
                        final BlockPos method21729 = class354.method1139();
                        final Class7096 method21730 = this.method6701(method21729);
                        if (method21730.method21727(this, method21729).method24536(Axis.Y) < 1.0) {
                            if (method21730.method21756().method21781()) {
                                this.method6828(class354, class356, method21727, class354.getY() - 0.05);
                            }
                        }
                    }
                    else {
                        this.method6828(class354, class356, method21727, class354.getY() + method21728 - 0.05);
                    }
                }
            }
            else if (b) {
                this.method6829(class354.getX(), class354.getX() + 1, class354.getZ(), class354.getZ() + 1, class354.getY() + 1 - 0.05, class356);
            }
        }
    }
    
    private void method6828(final BlockPos class354, final Class6909 class355, final Class7702 class356, final double n) {
        this.method6829(class354.getX() + class356.method24535(Axis.X), class354.getX() + class356.method24536(Axis.X), class354.getZ() + class356.method24535(Axis.Z), class354.getZ() + class356.method24536(Axis.Z), n, class355);
    }
    
    private void method6829(final double n, final double n2, final double n3, final double n4, final double n5, final Class6909 class6909) {
        this.method6709(class6909, MathHelper.method35701(this.field10062.nextDouble(), n, n2), n5, MathHelper.method35701(this.field10062.nextDouble(), n3, n4), 0.0, 0.0, 0.0);
    }
    
    public void method6830() {
        final ObjectIterator iterator = this.field10072.int2ObjectEntrySet().iterator();
        while (iterator.hasNext()) {
            final Entity class399 = (Entity)((Int2ObjectMap$Entry)iterator.next()).getValue();
            if (!class399.field2410) {
                continue;
            }
            iterator.remove();
            this.method6822(class399);
        }
    }
    
    @Override
    public Class5204 method6779(final Class7689 class7689) {
        final Class5204 method6779 = super.method6779(class7689);
        method6779.method16296("Server brand", () -> this.field10075.field4684.method4120());
        method6779.method16296("Server type", () -> (this.field10075.method5285() != null) ? "Integrated singleplayer server" : "Non-integrated multiplayer server");
        return method6779;
    }
    
    @Override
    public void method6706(final Class512 class512, final double n, final double n2, final double n3, Class7795 class513, Class286 class514, float method35823, final float f) {
        if (Class9570.field41267.method22605()) {
            final Object method35824 = Class9570.field41267.method22608(class512, class513, class514, method35823, f);
            if (Class9570.method35820(method35824, Class9570.field41225, new Object[0]) || Class9570.method35826(method35824, Class9570.field41403, new Object[0]) == null) {
                return;
            }
            class513 = (Class7795)Class9570.method35826(method35824, Class9570.field41403, new Object[0]);
            class514 = (Class286)Class9570.method35826(method35824, Class9570.field41404, new Object[0]);
            method35823 = Class9570.method35823(method35824, Class9570.field41405, new Object[0]);
        }
        if (class512 == this.field10075.field4684) {
            this.method6708(n, n2, n3, class513, class514, method35823, f, false);
        }
    }
    
    @Override
    public void method6707(final Class512 class512, final Entity class513, Class7795 class514, Class286 class515, float method35823, final float f) {
        if (Class9570.field41267.method22605()) {
            final Object method35824 = Class9570.field41267.method22608(class512, class514, class515, method35823, f);
            if (Class9570.method35820(method35824, Class9570.field41225, new Object[0]) || Class9570.method35826(method35824, Class9570.field41403, new Object[0]) == null) {
                return;
            }
            class514 = (Class7795)Class9570.method35826(method35824, Class9570.field41403, new Object[0]);
            class515 = (Class286)Class9570.method35826(method35824, Class9570.field41404, new Object[0]);
            method35823 = Class9570.method35823(method35824, Class9570.field41405, new Object[0]);
        }
        if (class512 == this.field10075.field4684) {
            this.field10075.method5299().method6422(new Class6838(class514, class515, class513));
        }
    }
    
    public void method6831(final BlockPos class354, final Class7795 class355, final Class286 class356, final float n, final float n2, final boolean b) {
        this.method6708(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5, class355, class356, n, n2, b);
    }
    
    @Override
    public void method6708(final double n, final double n2, final double n3, final Class7795 class7795, final Class286 class7796, final float n4, final float n5, final boolean b) {
        final double method16747 = this.field10075.field4644.method5833().method18161().squareDistanceTo(n, n2, n3);
        final Class6836 class7797 = new Class6836(class7795, class7796, n4, n5, (float)n, (float)n2, (float)n3);
        if (b && method16747 > 100.0) {
            this.field10075.method5299().method6423(class7797, (int)(Math.sqrt(method16747) / 40.0 * 20.0));
        }
        else {
            this.field10075.method5299().method6422(class7797);
        }
    }
    
    @Override
    public void method6781(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class51 class51) {
        this.field10075.field4640.method6480(new Class6176(this, n, n2, n3, n4, n5, n6, this.field10075.field4640, class51));
    }
    
    @Override
    public void method6788(final Class4252<?> class4252) {
        this.field10073.method17292(class4252);
    }
    
    @Override
    public Class1780 method6792() {
        return this.field10073.method17271();
    }
    
    public void method6832(final Class6516 field10078) {
        this.field10078 = field10078;
    }
    
    @Override
    public void method6756(long n) {
        if (n >= 0L) {
            this.method6765().method31211(Class8878.field37324).method26724(true, null);
        }
        else {
            n = -n;
            this.method6765().method31211(Class8878.field37324).method26724(false, null);
        }
        super.method6756(n);
    }
    
    @Override
    public Class6952<Class3833> method6833() {
        return (Class6952<Class3833>)Class6954.method21355();
    }
    
    @Override
    public Class6952<Class7255> method6834() {
        return (Class6952<Class7255>)Class6954.method21355();
    }
    
    public Class1907 method6835() {
        return (Class1907)super.method6762();
    }
    
    @Override
    public boolean method6688(final BlockPos class354, final Class7096 class355, final int n) {
        this.field10082 = this.method6836();
        final boolean method6688 = super.method6688(class354, class355, n);
        this.field10082 = false;
        return method6688;
    }
    
    private boolean method6836() {
        return this.field10075.field4682 instanceof Class8246 && ((Class8246)this.field10075.field4682).method27341();
    }
    
    public boolean method6837() {
        return this.field10082;
    }
    
    @Nullable
    @Override
    public Class6356 method6774(final String s) {
        return this.field10079.get(s);
    }
    
    @Override
    public void method6775(final Class6356 class6356) {
        this.field10079.put(class6356.method18906(), class6356);
    }
    
    @Override
    public int method6776() {
        return 0;
    }
    
    @Override
    public Class6516 method6782() {
        return this.field10078;
    }
    
    @Override
    public Class1792 method6793() {
        return this.field10073.method17377();
    }
    
    @Override
    public void method6693(final BlockPos class354, final Class7096 class355, final Class7096 class356, final int n) {
        this.field10074.method5735(this, class354, class355, class356, n);
    }
    
    @Override
    public void method6695(final BlockPos class354, final Class7096 class355, final Class7096 class356) {
        this.field10074.method5738(class354, class355, class356);
    }
    
    public void method6838(final int n, final int n2, final int n3) {
        this.field10074.method5739(n, n2, n3);
    }
    
    @Override
    public void method6780(final int n, final BlockPos class354, final int n2) {
        this.field10074.method5753(n, class354, n2);
    }
    
    @Override
    public void method6777(final int n, final BlockPos class354, final int n2) {
        this.field10074.method5751(n, class354, n2);
    }
    
    @Override
    public void method6839(final Class512 class512, final int i, final BlockPos class513, final int j) {
        try {
            this.field10074.method5752(class512, i, class513, j);
        }
        catch (final Throwable t) {
            final Class7689 method24421 = Class7689.method24421(t, "Playing level event");
            final Class5204 method24422 = method24421.method24418("Level event being played");
            method24422.method16297("Block coordinates", Class5204.method16294(class513));
            method24422.method16297("Event source", class512);
            method24422.method16297("Event type", i);
            method24422.method16297("Event data", j);
            throw new Class2365(method24421);
        }
    }
    
    @Override
    public void method6709(final Class6909 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.field10074.method5744(class6909, class6909.method21272().method21270(), n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void method6710(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.field10074.method5744(class6909, class6909.method21272().method21270() || b, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void method6711(final Class6909 class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.field10074.method5745(class6909, false, true, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void method6712(final Class6909 class6909, final boolean b, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.field10074.method5745(class6909, class6909.method21272().method21270() || b, true, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public List<Class754> method6840() {
        return this.field10076;
    }
    
    @Override
    public Class3090 method6841(final int n, final int n2, final int n3) {
        return Class7102.field27633;
    }
    
    public float method6842(final float n) {
        return (float)((float)((1.0f - MathHelper.clamp(1.0f - (MathHelper.cos(this.method6952(n) * 6.2831855f) * 2.0f + 0.2f), 0.0f, 1.0f)) * (1.0 - this.method6768(n) * 5.0f / 16.0)) * (1.0 - this.method6766(n) * 5.0f / 16.0)) * 0.8f + 0.2f;
    }
    
    public Vec3d method6843(final BlockPos class354, final float n) {
        final float method35653 = MathHelper.clamp(MathHelper.cos(this.method6952(n) * 6.2831855f) * 2.0f + 0.5f, 0.0f, 1.0f);
        final int method35654 = this.method6959(class354).method9838();
        final float n2 = (method35654 >> 16 & 0xFF) / 255.0f;
        final float n3 = (method35654 >> 8 & 0xFF) / 255.0f;
        final float n4 = (method35654 & 0xFF) / 255.0f;
        float n5 = n2 * method35653;
        float n6 = n3 * method35653;
        float n7 = n4 * method35653;
        final float method35655 = this.method6768(n);
        if (method35655 > 0.0f) {
            final float n8 = (n5 * 0.3f + n6 * 0.59f + n7 * 0.11f) * 0.6f;
            final float n9 = 1.0f - method35655 * 0.75f;
            n5 = n5 * n9 + n8 * (1.0f - n9);
            n6 = n6 * n9 + n8 * (1.0f - n9);
            n7 = n7 * n9 + n8 * (1.0f - n9);
        }
        final float method35656 = this.method6766(n);
        if (method35656 > 0.0f) {
            final float n10 = (n5 * 0.3f + n6 * 0.59f + n7 * 0.11f) * 0.2f;
            final float n11 = 1.0f - method35656 * 0.75f;
            n5 = n5 * n11 + n10 * (1.0f - n11);
            n6 = n6 * n11 + n10 * (1.0f - n11);
            n7 = n7 * n11 + n10 * (1.0f - n11);
        }
        if (this.field10080 > 0) {
            float n12 = this.field10080 - n;
            if (n12 > 1.0f) {
                n12 = 1.0f;
            }
            final float n13 = n12 * 0.45f;
            n5 = n5 * (1.0f - n13) + 0.8f * n13;
            n6 = n6 * (1.0f - n13) + 0.8f * n13;
            n7 = n7 * (1.0f - n13) + 1.0f * n13;
        }
        return new Vec3d(n5, n6, n7);
    }
    
    public Vec3d method6844(final float n) {
        final float method35653 = MathHelper.clamp(MathHelper.cos(this.method6952(n) * 6.2831855f) * 2.0f + 0.5f, 0.0f, 1.0f);
        float n2 = 1.0f;
        float n3 = 1.0f;
        float n4 = 1.0f;
        final float method35654 = this.method6768(n);
        if (method35654 > 0.0f) {
            final float n5 = (n2 * 0.3f + n3 * 0.59f + n4 * 0.11f) * 0.6f;
            final float n6 = 1.0f - method35654 * 0.95f;
            n2 = n2 * n6 + n5 * (1.0f - n6);
            n3 = n3 * n6 + n5 * (1.0f - n6);
            n4 = n4 * n6 + n5 * (1.0f - n6);
        }
        float n7 = n2 * (method35653 * 0.9f + 0.1f);
        float n8 = n3 * (method35653 * 0.9f + 0.1f);
        float n9 = n4 * (method35653 * 0.85f + 0.15f);
        final float method35655 = this.method6766(n);
        if (method35655 > 0.0f) {
            final float n10 = (n7 * 0.3f + n8 * 0.59f + n9 * 0.11f) * 0.2f;
            final float n11 = 1.0f - method35655 * 0.95f;
            n7 = n7 * n11 + n10 * (1.0f - n11);
            n8 = n8 * n11 + n10 * (1.0f - n11);
            n9 = n9 * n11 + n10 * (1.0f - n11);
        }
        return new Vec3d(n7, n8, n9);
    }
    
    public Vec3d method6845(final float n) {
        return this.field10063.method20493(this.method6952(n), n);
    }
    
    public float method6846(final float n) {
        final float method35653 = MathHelper.clamp(1.0f - (MathHelper.cos(this.method6952(n) * 6.2831855f) * 2.0f + 0.25f), 0.0f, 1.0f);
        return method35653 * method35653 * 0.5f;
    }
    
    public double method6847() {
        return (this.field10065.method29570() != Class9505.field40893) ? 63.0 : 0.0;
    }
    
    public int method6848() {
        return this.field10080;
    }
    
    @Override
    public void method6786(final int field10080) {
        this.field10080 = field10080;
    }
    
    @Override
    public int method6849(final BlockPos class354, final Class8895 class355) {
        return ((Class8141)this.field10081.get((Object)class355)).method26829(class354, () -> this.method6850(class356, class357));
    }
    
    public int method6850(final BlockPos class354, final Class8895 class355) {
        final int field23410 = Class869.method5277().field4648.field23410;
        if (field23410 != 0) {
            final int n = (field23410 * 2 + 1) * (field23410 * 2 + 1);
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            final Class8243 class356 = new Class8243(class354.getX() - field23410, class354.getY(), class354.getZ() - field23410, class354.getX() + field23410, class354.getY(), class354.getZ() + field23410);
            final Class385 class357 = new Class385();
            while (class356.method27301()) {
                class357.method1284(class356.method27302(), class356.method27303(), class356.method27304());
                final int method31308 = class355.method31308(this.method6959(class357), class357.getX(), class357.getZ());
                n2 += (method31308 & 0xFF0000) >> 16;
                n3 += (method31308 & 0xFF00) >> 8;
                n4 += (method31308 & 0xFF);
            }
            return (n2 / n & 0xFF) << 16 | (n3 / n & 0xFF) << 8 | (n4 / n & 0xFF);
        }
        return class355.method31308(this.method6959(class354), class354.getX(), class354.getZ());
    }
    
    public void method6851(final Entity class399) {
        Class9066.method32639(class399, this);
        if (Class8571.method29002()) {
            Class8850.method30983(class399, Class8571.method28908());
        }
    }
    
    public void method6852(final Entity class399) {
        Class9066.method32640(class399, this);
        if (Class8571.method29002()) {
            Class8850.method30984(class399, Class8571.method28908());
        }
    }
}
