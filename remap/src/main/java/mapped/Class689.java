// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.EnumMap;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Locale;
import it.unimi.dsi.fastutil.longs.LongSets;
import java.util.Objects;
import com.google.common.collect.Lists;
import com.google.common.base.Strings;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.Map;

public class Class689 extends Class565
{
    private static final Map<Class2020, String> field3791;
    private final Class869 field3792;
    private final Class1844 field3793;
    private Class7006 field3794;
    private Class7006 field3795;
    private Class7859 field3796;
    private Class1862 field3797;
    private CompletableFuture<Class1862> field3798;
    private String field3799;
    private List<String> field3800;
    public List<String> field3801;
    private long field3802;
    private long field3803;
    
    public Class689(final Class869 field3792) {
        this.field3799 = null;
        this.field3800 = null;
        this.field3801 = null;
        this.field3802 = 0L;
        this.field3803 = 0L;
        this.field3792 = field3792;
        this.field3793 = field3792.field4643;
    }
    
    public void method3827() {
        this.field3798 = null;
        this.field3797 = null;
    }
    
    public void method3828() {
        this.field3792.method5327().method15297("debug");
        Class8726.method30059();
        final Entity method5303 = this.field3792.method5303();
        this.field3794 = method5303.method1748(20.0, 0.0f, false);
        this.field3795 = method5303.method1748(20.0, 0.0f, true);
        this.method3829();
        this.method3830();
        Class8726.method30060();
        if (this.field3792.field4648.field23468) {
            final int method5304 = this.field3792.method5332().method7696();
            this.method3839(this.field3792.method5310(), 0, method5304 / 2, true);
            final Class1655 method5305 = this.field3792.method5285();
            if (method5305 != null) {
                this.method3839(method5305.method1589(), method5304 - Math.min(method5304 / 2, 240), method5304 / 2, false);
            }
        }
        this.field3792.method5327().method15299();
    }
    
    public void method3829() {
        List<String> field3800 = this.field3800;
        if (field3800 == null || System.currentTimeMillis() > this.field3802) {
            field3800 = this.method3831();
            field3800.add("");
            field3800.add("Debug: Pie [shift]: " + (this.field3792.field4648.field23467 ? "visible" : "hidden") + ((this.field3792.method5285() != null) ? " FPS + TPS" : " FPS") + " [alt]: " + (this.field3792.field4648.field23468 ? "visible" : "hidden"));
            field3800.add("For help: press F3 + Q");
            this.field3800 = field3800;
            this.field3802 = System.currentTimeMillis() + 100L;
        }
        for (int i = 0; i < field3800.size(); ++i) {
            final String s = field3800.get(i);
            if (!Strings.isNullOrEmpty(s)) {
                final int n = 9;
                final int method6617 = this.field3793.method6617(s);
                final int n2 = 2 + n * i;
                Class565.method3293(1, n2 - 1, 2 + method6617 + 1, n2 + n - 1, -1873784752);
                this.field3793.method6610(s, 2.0f, (float)n2, 14737632);
            }
        }
    }
    
    public void method3830() {
        List<String> field3801 = this.field3801;
        if (field3801 == null || System.currentTimeMillis() > this.field3803) {
            field3801 = this.method3837();
            this.field3801 = field3801;
            this.field3803 = System.currentTimeMillis() + 100L;
        }
        for (int i = 0; i < field3801.size(); ++i) {
            final String s = field3801.get(i);
            if (!Strings.isNullOrEmpty(s)) {
                final int n = 9;
                final int method6617 = this.field3793.method6617(s);
                final int n2 = this.field3792.method5332().method7696() - 2 - method6617;
                final int n3 = 2 + n * i;
                Class565.method3293(n2 - 1, n3 - 1, n2 + method6617 + 1, n3 + n - 1, -1873784752);
                this.field3793.method6610(s, (float)n2, (float)n3, 14737632);
            }
        }
    }
    
    public List<String> method3831() {
        if (this.field3792.field4707 != this.field3799) {
            final StringBuffer sb = new StringBuffer(this.field3792.field4707);
            Class8571.method28989();
            final int index = this.field3792.field4707.indexOf(" fps ");
            if (index >= 0) {
                sb.append(index);
            }
            if (Class8571.method29011()) {
                sb.append(" sf");
            }
            if (Class8571.method28953()) {
                sb.append(" fr");
            }
            if (Class8571.method28924()) {
                sb.append(" af");
            }
            if (Class8571.method28926()) {
                sb.append(" aa");
            }
            if (Class8571.method29009()) {
                sb.append(" reg");
            }
            if (Class8571.method28955()) {
                sb.append(" sh");
            }
            this.field3792.field4707 = sb.toString();
            this.field3799 = this.field3792.field4707;
        }
        final List<String> method3832 = this.method3832();
        final StringBuilder sb2 = new StringBuilder();
        final Class1774 method3833 = Class8571.method29001();
        sb2.append(", A: ");
        if (Class7663.method24283()) {
            sb2.append(method3833.method6358() + Class8287.method27545());
            sb2.append("/");
        }
        sb2.append(method3833.method6357() + Class8287.method27544());
        final String string = sb2.toString();
        for (int i = 0; i < method3832.size(); ++i) {
            final String str = method3832.get(i);
            if (str != null && str.startsWith("P: ")) {
                method3832.set(i, str + string);
                break;
            }
        }
        return method3832;
    }
    
    public List<String> method3832() {
        final Class1655 method5285 = this.field3792.method5285();
        final Class3641 method5286 = this.field3792.method5269().method17369();
        final float method5287 = method5286.method11195();
        final float method5288 = method5286.method11194();
        String s;
        if (method5285 != null) {
            s = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", method5285.method1587(), method5287, method5288);
        }
        else {
            s = String.format("\"%s\" server, %.0f tx, %.0f rx", this.field3792.field4684.method4120(), method5287, method5288);
        }
        final BlockPos class354 = new BlockPos(this.field3792.method5303());
        if (this.field3792.method5317()) {
            return Lists.newArrayList((Object[])new String[] { "Minecraft " + Class9528.method35579().getName() + " (" + this.field3792.method5235() + "/" + Class7932.method25729() + ")", this.field3792.field4707, s, this.field3792.field4636.method5704(), this.field3792.field4636.method5706(), "P: " + this.field3792.field4640.method6488() + ". T: " + this.field3792.field4683.method6816(), this.field3792.field4683.method6726(), "", String.format("Chunk-relative: %d %d %d", class354.getX() & 0xF, class354.getY() & 0xF, class354.getZ() & 0xF) });
        }
        final Entity method5289 = this.field3792.method5303();
        final Direction method5290 = method5289.method1882();
        String s2 = null;
        switch (Class8226.field33788[method5290.ordinal()]) {
            case 1: {
                s2 = "Towards negative Z";
                break;
            }
            case 2: {
                s2 = "Towards positive Z";
                break;
            }
            case 3: {
                s2 = "Towards negative X";
                break;
            }
            case 4: {
                s2 = "Towards positive X";
                break;
            }
            default: {
                s2 = "Invalid";
                break;
            }
        }
        final Class7859 class355 = new Class7859(class354);
        if (!Objects.equals(this.field3796, class355)) {
            this.field3796 = class355;
            this.method3827();
        }
        final Class1847 method5291 = this.method3834();
        final Object o = (method5291 instanceof Class1849) ? ((Class1849)method5291).method6919() : LongSets.EMPTY_SET;
        String str = Class9528.method35579().getName();
        if (!this.field3792.method5284()) {
            str = Class7906.method25609(Class9367.method34762()).method25614();
        }
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { "Minecraft " + Class9528.method35579().getName() + " (" + str + "/" + Class7932.method25729() + ("release".equalsIgnoreCase(this.field3792.method5236()) ? "" : ("/" + this.field3792.method5236())) + ")", this.field3792.field4707, s, this.field3792.field4636.method5704(), this.field3792.field4636.method5706(), "P: " + this.field3792.field4640.method6488() + ". T: " + this.field3792.field4683.method6816(), this.field3792.field4683.method6726() });
        final String method5292 = this.method3833();
        if (method5292 != null) {
            arrayList.add(method5292);
        }
        arrayList.add(Class383.method1276(this.field3792.field4683.field10063.method20487()).toString() + " FC: " + Integer.toString(((LongSet)o).size()));
        arrayList.add("");
        arrayList.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.field3792.method5303().getPosX(), this.field3792.method5303().getPosY(), this.field3792.method5303().getPosZ()));
        arrayList.add(String.format("Block: %d %d %d", class354.getX(), class354.getY(), class354.getZ()));
        arrayList.add(String.format("Chunk: %d %d %d in %d %d %d", class354.getX() & 0xF, class354.getY() & 0xF, class354.getZ() & 0xF, class354.getX() >> 4, class354.getY() >> 4, class354.getZ() >> 4));
        arrayList.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", method5290, s2, MathHelper.method35668(method5289.field2399), MathHelper.method35668(method5289.field2400)));
        if (this.field3792.field4683 != null) {
            if (this.field3792.field4683.method6971(class354)) {
                final Class1862 method5293 = this.method3836();
                if (method5293.method7062()) {
                    arrayList.add("Waiting for chunk...");
                }
                else {
                    arrayList.add("Client Light: " + this.field3792.field4683.method6835().method7405().method7290(class354, 0) + " (" + this.field3792.field4683.method6992(Class237.field911, class354) + " sky, " + this.field3792.field4683.method6992(Class237.field912, class354) + " block)");
                    final Class1862 method5294 = this.method3835();
                    if (method5294 != null) {
                        final Class1886 method5295 = method5291.method6762().method7405();
                        arrayList.add("Server Light: (" + method5295.method7288(Class237.field911).method7293(class354) + " sky, " + method5295.method7288(Class237.field912).method7293(class354) + " block)");
                    }
                    else {
                        arrayList.add("Server Light: (?? sky, ?? block)");
                    }
                    final StringBuilder sb = new StringBuilder("CH");
                    for (final Class2020 class356 : Class2020.values()) {
                        if (class356.method8061()) {
                            sb.append(" ").append(Class689.field3791.get(class356)).append(": ").append(method5293.method7018(class356, class354.getX(), class354.getZ()));
                        }
                    }
                    arrayList.add(sb.toString());
                    sb.setLength();
                    sb.append("SH");
                    for (final Class2020 class357 : Class2020.values()) {
                        if (class357.method8062()) {
                            sb.append(" ").append(Class689.field3791.get(class357)).append(": ");
                            if (method5294 != null) {
                                sb.append(method5294.method7018(class357, class354.getX(), class354.getZ()));
                            }
                            else {
                                sb.append("??");
                            }
                        }
                    }
                    arrayList.add(sb.toString());
                    if (class354.getY() >= 0 && class354.getY() < 256) {
                        arrayList.add("Biome: " + Class90.field217.method503(this.field3792.field4683.method6959(class354)));
                        long method5296 = 0L;
                        float method5297 = 0.0f;
                        if (method5294 != null) {
                            method5297 = method5291.method6951();
                            method5296 = method5294.method7041();
                        }
                        final Class9592 class358 = new Class9592(method5291.method6954(), method5291.method6755(), method5296, method5297);
                        arrayList.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", class358.method35973(), class358.method35975(), this.field3792.field4683.method6755() / 24000L));
                    }
                }
            }
            else {
                arrayList.add("Outside of world...");
            }
        }
        else {
            arrayList.add("Outside of world...");
        }
        final Class1884 method5298 = this.field3792.field4644.method5805();
        if (method5298 != null) {
            arrayList.add("Shader: " + method5298.method7248());
        }
        if (this.field3794.method21449() == Class2165.field12881) {
            final BlockPos method5299 = ((Class7005)this.field3794).method21447();
            arrayList.add(String.format("Looking at block: %d %d %d", method5299.getX(), method5299.getY(), method5299.getZ()));
        }
        if (this.field3795.method21449() == Class2165.field12881) {
            final BlockPos method5300 = ((Class7005)this.field3795).method21447();
            arrayList.add(String.format("Looking at liquid: %d %d %d", method5300.getX(), method5300.getY(), method5300.getZ()));
        }
        arrayList.add(this.field3792.method5299().method6436());
        return arrayList;
    }
    
    @Nullable
    private String method3833() {
        final Class1655 method5285 = this.field3792.method5285();
        if (method5285 != null) {
            final Class1849 method5286 = method5285.method1481(this.field3792.field4683.method6789().method20487());
            if (method5286 != null) {
                return method5286.method6726();
            }
        }
        return null;
    }
    
    private Class1847 method3834() {
        return (Class1847)DataFixUtils.orElse((Optional)Optional.ofNullable(this.field3792.method5285()).map(class1655 -> class1655.method1481(this.field3792.field4683.field10063.method20487())), (Object)this.field3792.field4683);
    }
    
    @Nullable
    private Class1862 method3835() {
        if (this.field3798 == null) {
            final Class1655 method5285 = this.field3792.method5285();
            if (method5285 != null) {
                final Class1849 method5286 = method5285.method1481(this.field3792.field4683.field10063.method20487());
                if (method5286 != null) {
                    this.field3798 = (CompletableFuture<Class1862>)method5286.method6904().method7427(this.field3796.field32290, this.field3796.field32291, Class9312.field39989, false).thenApply(either -> either.map(class1860 -> class1860, p0 -> null));
                }
            }
            if (this.field3798 == null) {
                this.field3798 = CompletableFuture.completedFuture(this.method3836());
            }
        }
        return this.field3798.getNow(null);
    }
    
    private Class1862 method3836() {
        if (this.field3797 == null) {
            this.field3797 = this.field3792.field4683.method6686(this.field3796.field32290, this.field3796.field32291);
        }
        return this.field3797;
    }
    
    public List<String> method3837() {
        final long maxMemory = Runtime.getRuntime().maxMemory();
        final long totalMemory = Runtime.getRuntime().totalMemory();
        final long n = totalMemory - Runtime.getRuntime().freeMemory();
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { String.format("Java: %s %dbit", System.getProperty("java.version"), this.field3792.method5297() ? 64 : 32), String.format("Mem: % 2d%% %03d/%03dMB", n * 100L / maxMemory, method3842(n), method3842(maxMemory)), String.format("Allocated: % 2d%% %03dMB", totalMemory * 100L / maxMemory, method3842(totalMemory)), "", String.format("CPU: %s", Class7691.method24459()), "", String.format("Display: %dx%d (%s)", Class869.method5277().method5332().method7692(), Class869.method5277().method5332().method7693(), Class7691.method24458()), Class7691.method24460(), Class7691.method24461() });
        arrayList.add(3, "Native: " + method3842(Class8203.method27170()) + "/" + method3842(Class8203.method27171()) + "+" + method3842(Class8203.method27174()) + "MB");
        arrayList.set(4, "GC: " + Class7741.method24705() + "MB/s");
        if (Class9570.field41180.method22605()) {
            arrayList.add("");
            for (final String s : (Collection)Class9570.method35818(Class9570.field41180, true, false)) {
                if (s.startsWith("Minecraft ")) {
                    continue;
                }
                arrayList.add(s);
            }
        }
        if (!this.field3792.method5317()) {
            if (this.field3794.method21449() == Class2165.field12881) {
                final Class7096 method6701 = this.field3792.field4683.method6701(((Class7005)this.field3794).method21447());
                arrayList.add("");
                arrayList.add(Class2116.field12328 + "Targeted Block");
                arrayList.add(String.valueOf(Class90.field208.method503(method6701.method21696())));
                final UnmodifiableIterator iterator2 = method6701.method21776().entrySet().iterator();
                while (((Iterator)iterator2).hasNext()) {
                    arrayList.add(this.method3838((Map.Entry<Class7111<?>, Comparable<?>>)((Iterator)iterator2).next()));
                }
                Collection<Class1932> method6702;
                if (!Class9570.field41235.method22605()) {
                    method6702 = this.field3792.method5269().method17377().method6463().method18463(method6701.method21696());
                }
                else {
                    method6702 = (Collection)Class9570.method35826(method6701.method21696(), Class9570.field41235, new Object[0]);
                }
                final Iterator<Class1932> iterator3 = method6702.iterator();
                while (iterator3.hasNext()) {
                    arrayList.add("#" + iterator3.next());
                }
            }
            if (this.field3795.method21449() == Class2165.field12881) {
                final Class7099 method6703 = this.field3792.field4683.method6702(((Class7005)this.field3795).method21447());
                arrayList.add("");
                arrayList.add(Class2116.field12328 + "Targeted Fluid");
                arrayList.add(String.valueOf(Class90.field206.method503(method6703.method21779())));
                final UnmodifiableIterator iterator4 = method6703.method21776().entrySet().iterator();
                while (((Iterator)iterator4).hasNext()) {
                    arrayList.add(this.method3838((Map.Entry<Class7111<?>, Comparable<?>>)((Iterator)iterator4).next()));
                }
                Collection<Class1932> method6704;
                if (!Class9570.field41272.method22605()) {
                    method6704 = this.field3792.method5269().method17377().method6465().method18463(method6703.method21779());
                }
                else {
                    method6704 = (Collection)Class9570.method35826(method6703.method21779(), Class9570.field41272, new Object[0]);
                }
                final Iterator<Class1932> iterator5 = method6704.iterator();
                while (iterator5.hasNext()) {
                    arrayList.add("#" + iterator5.next());
                }
            }
            final Entity field4690 = this.field3792.field4690;
            if (field4690 != null) {
                arrayList.add("");
                arrayList.add(Class2116.field12328 + "Targeted Entity");
                arrayList.add(String.valueOf(Class90.field210.method503(field4690.method1642())));
                if (Class9570.field41259.method22605()) {
                    ((Collection)Class9570.method35826(field4690.method1642(), Class9570.field41259, new Object[0])).forEach(obj -> list.add("#" + obj));
                }
            }
            return arrayList;
        }
        return arrayList;
    }
    
    private String method3838(final Map.Entry<Class7111<?>, Comparable<?>> entry) {
        final Class7111 class7111 = entry.getKey();
        final Comparable comparable = entry.getValue();
        String str = Class8349.method27835((Class7111<Comparable>)class7111, comparable);
        if (!Boolean.TRUE.equals(comparable)) {
            if (Boolean.FALSE.equals(comparable)) {
                str = Class2116.field12321 + str;
            }
        }
        else {
            str = Class2116.field12319 + str;
        }
        return class7111.method21826() + ": " + str;
    }
    
    private void method3839(final Class9462 class9462, int max, int n, final boolean b) {
        if (!b) {
            max = Math.max(max, (int)(512.0 / this.field3792.method5332().method7700()));
            n = this.field3792.method5332().method7696() - max;
            Class8726.method30007();
            final int method35169 = class9462.method35169();
            final int method35170 = class9462.method35170();
            final long[] method35171 = class9462.method35172();
            int n2 = max;
            final int max2 = Math.max(0, method35171.length - n);
            final int n3 = method35171.length - max2;
            int i = class9462.method35171(method35169 + max2);
            long n4 = 0L;
            int min = Integer.MAX_VALUE;
            int max3 = Integer.MIN_VALUE;
            for (int j = 0; j < n3; ++j) {
                final int n5 = (int)(method35171[class9462.method35171(i + j)] / 1000000L);
                min = Math.min(min, n5);
                max3 = Math.max(max3, n5);
                n4 += n5;
            }
            final int method35172 = this.field3792.method5332().method7697();
            Class565.method3293(max, method35172 - 60, max + n3, method35172, -1873784752);
            final Class4148 method35173 = Class7392.method22694().method22696();
            Class8726.method30011();
            Class8726.method30041();
            Class8726.method30117();
            method35173.method12390(7, Class9237.field39615);
            final Matrix4f method35174 = Class9294.method34322().method34328();
            while (i != method35170) {
                final int method35175 = class9462.method35168(method35171[i], b ? 30 : 60, b ? 60 : 20);
                final int n6 = b ? 100 : 60;
                final int method35176 = this.method3840(MathHelper.method35651(method35175, 0, n6), 0, n6 / 2, n6);
                final int n7 = method35176 >> 24 & 0xFF;
                final int n8 = method35176 >> 16 & 0xFF;
                final int n9 = method35176 >> 8 & 0xFF;
                final int n10 = method35176 & 0xFF;
                method35173.method12444(method35174, (float)(n2 + 1), (float)method35172, 0.0f).method12399(n8, n9, n10, n7).method12397();
                method35173.method12444(method35174, (float)n2, (float)method35172, 0.0f).method12399(n8, n9, n10, n7).method12397();
                method35173.method12444(method35174, (float)n2, (float)(method35172 - method35175 + 1), 0.0f).method12399(n8, n9, n10, n7).method12397();
                method35173.method12444(method35174, (float)(n2 + 1), (float)(method35172 - method35175 + 1), 0.0f).method12399(n8, n9, n10, n7).method12397();
                ++n2;
                i = class9462.method35171(i + 1);
            }
            method35173.method12393();
            Class8475.method28282(method35173);
            Class8726.method30040();
            Class8726.method30012();
            if (!b) {
                Class565.method3293(max + 1, method35172 - 60 + 1, max + 14, method35172 - 60 + 10, -1873784752);
                this.field3793.method6610("20 TPS", (float)(max + 2), (float)(method35172 - 60 + 2), 14737632);
                this.method3291(max, max + n3 - 1, method35172 - 60, -1);
            }
            else {
                Class565.method3293(max + 1, method35172 - 30 + 1, max + 14, method35172 - 30 + 10, -1873784752);
                this.field3793.method6610("60 FPS", (float)(max + 2), (float)(method35172 - 30 + 2), 14737632);
                this.method3291(max, max + n3 - 1, method35172 - 30, -1);
                Class565.method3293(max + 1, method35172 - 60 + 1, max + 14, method35172 - 60 + 10, -1873784752);
                this.field3793.method6610("30 FPS", (float)(max + 2), (float)(method35172 - 60 + 2), 14737632);
                this.method3291(max, max + n3 - 1, method35172 - 60, -1);
            }
            this.method3291(max, max + n3 - 1, method35172 - 1, -1);
            this.method3292(max, method35172 - 60, method35172, -1);
            this.method3292(max + n3 - 1, method35172 - 60, method35172, -1);
            if (b) {
                if (this.field3792.field4648.field23383 > 0) {
                    if (this.field3792.field4648.field23383 <= 250) {
                        this.method3291(max, max + n3 - 1, method35172 - 1 - (int)(1800.0 / this.field3792.field4648.field23383), -16711681);
                    }
                }
            }
            final String string = min + " ms min";
            final String string2 = n4 / n3 + " ms avg";
            final String string3 = max3 + " ms max";
            this.field3793.method6609(string, (float)(max + 2), (float)(method35172 - 60 - 9), 14737632);
            this.field3793.method6609(string2, (float)(max + n3 / 2 - this.field3793.method6617(string2) / 2), (float)(method35172 - 60 - 9), 14737632);
            this.field3793.method6609(string3, (float)(max + n3 - this.field3793.method6617(string3)), (float)(method35172 - 60 - 9), 14737632);
            Class8726.method30008();
        }
    }
    
    private int method3840(final int n, final int n2, final int n3, final int n4) {
        return (n >= n3) ? this.method3841(-256, -65536, (n - n3) / (float)(n4 - n3)) : this.method3841(-16711936, -256, n / (float)n3);
    }
    
    private int method3841(final int n, final int n2, final float n3) {
        return MathHelper.method35651((int) MathHelper.method35700(n3, (float)(n >> 24 & 0xFF), (float)(n2 >> 24 & 0xFF)), 0, 255) << 24 | MathHelper.method35651((int) MathHelper.method35700(n3, (float)(n >> 16 & 0xFF), (float)(n2 >> 16 & 0xFF)), 0, 255) << 16 | MathHelper.method35651((int) MathHelper.method35700(n3, (float)(n >> 8 & 0xFF), (float)(n2 >> 8 & 0xFF)), 0, 255) << 8 | MathHelper.method35651((int) MathHelper.method35700(n3, (float)(n & 0xFF), (float)(n2 & 0xFF)), 0, 255);
    }
    
    private static long method3842(final long n) {
        return n / 1024L / 1024L;
    }
    
    static {
        field3791 = Class8349.method27851((EnumMap)new EnumMap(Class2020.class), enumMap -> {
            enumMap.put(Class2020.field11521, "SW");
            enumMap.put(Class2020.field11522, "S");
            enumMap.put(Class2020.field11523, "OW");
            enumMap.put(Class2020.field11524, "O");
            enumMap.put(Class2020.field11525, "M");
            enumMap.put(Class2020.field11526, "ML");
        });
    }
}
