// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.Sets;
import java.util.Set;
import com.google.common.collect.Maps;
import net.minecraft.dispenser.IPosition;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.UUID;
import java.util.Map;

public class Class6115 implements Class6113
{
    private final Minecraft field24824;
    private final Map<BlockPos, Class7850> field24825;
    private final Map<UUID, Class8665> field24826;
    private UUID field24827;
    
    public Class6115(final Minecraft field24824) {
        this.field24825 = Maps.newHashMap();
        this.field24826 = Maps.newHashMap();
        this.field24824 = field24824;
    }
    
    @Override
    public void method18270() {
        this.field24825.clear();
        this.field24826.clear();
        this.field24827 = null;
    }
    
    public void method18276(final Class7850 class7850) {
        this.field24825.put(class7850.field32146, class7850);
    }
    
    public void method18277(final Class8665 class8665) {
        this.field24826.put(class8665.field36432, class8665);
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        RenderSystem.method30059();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        this.method18279();
        this.method18278();
        this.method18280();
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.method30060();
        if (!this.field24824.player.isSpectator()) {
            this.method18300();
        }
    }
    
    private void method18278() {
        this.field24826.entrySet().removeIf(entry -> this.field24824.world.getEntityByID(entry.getValue().field36433) == null);
    }
    
    private void method18279() {
        this.field24825.entrySet().removeIf(entry -> {
            final Object o = this.field24824.world.method6754() - 20L;
            return entry.getValue().field32151 < n;
        });
    }
    
    private void method18280() {
        final BlockPos method18162 = this.method18294().method18162();
        this.field24826.values().forEach(class355 -> {
            if (!(!this.method18297(class355))) {
                this.method18290(class355);
            }
            return;
        });
        this.method18282();
        for (final BlockPos class354 : this.field24825.keySet()) {
            if (!method18162.withinDistance(class354, 30.0)) {
                continue;
            }
            method18285(class354);
        }
        this.field24825.values().forEach(class357 -> {
            this.method18281();
            if (!(!class356.method1081(class357.field32146, 30.0))) {
                final Set set = map.get(class357.field32146);
                this.method18288(class357, (set != null) ? set : Sets.newHashSet());
            }
            return;
        });
        this.method18299().forEach((class359, list) -> {
            if (!(!class358.method1081(class359, 30.0))) {
                this.method18286(class359, list);
            }
        });
    }
    
    private Map<BlockPos, Set<UUID>> method18281() {
        final HashMap hashMap = Maps.newHashMap();
        this.field24826.values().forEach(class8665 -> class8665.field36440.forEach(class8667 -> method18284(map, class8666, class8667)));
        return hashMap;
    }
    
    private void method18282() {
        final HashMap hashMap = Maps.newHashMap();
        this.field24826.values().stream().filter(Class8665::method29671).forEach(class8665 -> {
            final Set set = map.get(class8665.field36437);
            if (set == null) {
                Sets.newHashSet();
                map.put(class8665.field36437, set);
            }
            set.add(class8665.method29669());
            return;
        });
        hashMap.entrySet().forEach(entry -> {
            final BlockPos class8666 = entry.getKey();
            final Set set2 = (Set)((Set)entry.getValue()).stream().map(Class8956::method31774).collect(Collectors.toSet());
            set2.toString();
            int n = 0;
            n++;
            final String s;
            final BlockPos class8667;
            final int n2;
            method18292(s, class8667, n2, -256);
            n++;
            final String s2;
            final BlockPos class8668;
            final int n3;
            method18292(s2, class8668, n3, -1);
            method18287(class8666, 0.05f, 0.8f, 0.8f, 0.0f, 0.3f);
        });
    }
    
    private static String method18283(final Collection<UUID> collection) {
        if (!collection.isEmpty()) {
            return (collection.size() <= 3) ? collection.stream().map((Function<? super UUID, ?>)Class8956::method31774).collect((Collector<? super Object, ?, Set<? super Object>>)Collectors.toSet()).toString() : ("" + collection.size() + " bees");
        }
        return "-";
    }
    
    private static void method18284(final Map<BlockPos, Set<UUID>> map, final Class8665 class8665, final BlockPos class8666) {
        Set hashSet = map.get(class8666);
        if (hashSet == null) {
            hashSet = Sets.newHashSet();
            map.put(class8666, hashSet);
        }
        hashSet.add(class8665.method29669());
    }
    
    private static void method18285(final BlockPos class354) {
        method18287(class354, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }
    
    private void method18286(final BlockPos class354, final List<String> obj) {
        method18287(class354, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        method18292("" + obj, class354, 0, -256);
        method18292("Ghost Hive", class354, 1, -65536);
    }
    
    private static void method18287(final BlockPos class354, final float n, final float n2, final float n3, final float n4, final float n5) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        Class7282.method22335(class354, n, n2, n3, n4, n5);
    }
    
    private void method18288(final Class7850 class7850, final Collection<UUID> collection) {
        int n = 0;
        if (!collection.isEmpty()) {
            method18291("Blacklisted by " + method18283(collection), class7850, n++, -65536);
        }
        method18291("Out: " + method18283(this.method18298(class7850.field32146)), class7850, n++, -3355444);
        if (class7850.field32148 != 0) {
            if (class7850.field32148 != 1) {
                method18291("In: " + class7850.field32148 + " bees", class7850, n++, -256);
            }
            else {
                method18291("In: 1 bee", class7850, n++, -256);
            }
        }
        else {
            method18291("In: -", class7850, n++, -256);
        }
        method18291("Honey: " + class7850.field32149, class7850, n++, -23296);
        method18291(class7850.field32147 + (class7850.field32150 ? " (sedated)" : ""), class7850, n++, -1);
    }
    
    private void method18289(final Class8665 class8665) {
        if (class8665.field36435 != null) {
            Class6114.method18272(class8665.field36435, 0.5f, false, false, this.method18294().method18161().getX(), this.method18294().method18161().getY(), this.method18294().method18161().getZ());
        }
    }
    
    private void method18290(final Class8665 class8665) {
        final boolean method18296 = this.method18296(class8665);
        int n = 0;
        method18293(class8665.field36434, n++, class8665.toString(), -1, 0.03f);
        if (class8665.field36436 != null) {
            method18293(class8665.field36434, n++, "Hive: " + this.method18295(class8665, class8665.field36436), -256, 0.02f);
        }
        else {
            method18293(class8665.field36434, n++, "No hive", -98404, 0.02f);
        }
        if (class8665.field36437 != null) {
            method18293(class8665.field36434, n++, "Flower: " + this.method18295(class8665, class8665.field36437), -256, 0.02f);
        }
        else {
            method18293(class8665.field36434, n++, "No flower", -98404, 0.02f);
        }
        final Iterator<String> iterator = class8665.field36439.iterator();
        while (iterator.hasNext()) {
            method18293(class8665.field36434, n++, iterator.next(), -16711936, 0.02f);
        }
        if (method18296) {
            this.method18289(class8665);
        }
        if (class8665.field36438 > 0) {
            method18293(class8665.field36434, n++, "Travelling: " + class8665.field36438 + " ticks", (class8665.field36438 >= 600) ? -23296 : -3355444, 0.02f);
        }
    }
    
    private static void method18291(final String s, final Class7850 class7850, final int n, final int n2) {
        method18292(s, class7850.field32146, n, n2);
    }
    
    private static void method18292(final String s, final BlockPos class354, final int n, final int n2) {
        Class7282.method22341(s, class354.getX() + 0.5, class354.getY() + 1.3 + n * 0.2, class354.getZ() + 0.5, n2, 0.02f, true, 0.0f, true);
    }
    
    private static void method18293(final IPosition class5488, final int n, final String s, final int n2, final float n3) {
        final BlockPos class5489 = new BlockPos(class5488);
        Class7282.method22341(s, class5489.getX() + 0.5, class5488.getY() + 2.4 + n * 0.25, class5489.getZ() + 0.5, n2, n3, false, 0.5f, true);
    }
    
    private Class6092 method18294() {
        return this.field24824.field4644.method5833();
    }
    
    private String method18295(final Class8665 class8665, final BlockPos class8666) {
        return class8666.func_229422_x_() + " (dist " + Math.round(MathHelper.sqrt(class8666.distanceSq(class8665.field36434.getX(), class8665.field36434.getY(), class8665.field36434.getZ(), true)) * 10.0f) / 10.0 + ")";
    }
    
    private boolean method18296(final Class8665 class8665) {
        return Objects.equals(this.field24827, class8665.field36432);
    }
    
    private boolean method18297(final Class8665 class8665) {
        final ClientPlayerEntity field4684 = this.field24824.player;
        return new BlockPos(field4684.getPosX(), class8665.field36434.getY(), field4684.getPosZ()).withinDistance(new BlockPos(class8665.field36434), 30.0);
    }
    
    private Collection<UUID> method18298(final BlockPos class354) {
        return this.field24826.values().stream().filter(class356 -> class356.method29668(class355)).map((Function<? super Class8665, ?>)Class8665::method29669).collect((Collector<? super Object, ?, Collection<UUID>>)Collectors.toSet());
    }
    
    private Map<BlockPos, List<String>> method18299() {
        final HashMap hashMap = Maps.newHashMap();
        for (final Class8665 class8665 : this.field24826.values()) {
            if (class8665.field36436 == null) {
                continue;
            }
            if (this.field24825.containsKey(class8665.field36436)) {
                continue;
            }
            List arrayList = (List)hashMap.get(class8665.field36436);
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
                hashMap.put(class8665.field36436, arrayList);
            }
            arrayList.add(class8665.method29670());
        }
        return hashMap;
    }
    
    private void method18300() {
        Class7282.method22333(this.field24824.method5303(), 8).ifPresent(class399 -> this.field24827 = class399.method1865());
    }
}
