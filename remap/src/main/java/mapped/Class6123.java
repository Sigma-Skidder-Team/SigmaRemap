// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.dispenser.IPosition;
import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import java.util.HashMap;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.UUID;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class6123 implements Class6113
{
    private static final Logger field24854;
    private final Minecraft field24855;
    private final Map<BlockPos, Class7018> field24856;
    private final Set<Class353> field24857;
    private final Map<UUID, Class9307> field24858;
    private UUID field24859;
    
    public Class6123(final Minecraft field24855) {
        this.field24856 = Maps.newHashMap();
        this.field24857 = Sets.newHashSet();
        this.field24858 = Maps.newHashMap();
        this.field24855 = field24855;
    }
    
    @Override
    public void method18270() {
        this.field24856.clear();
        this.field24857.clear();
        this.field24858.clear();
        this.field24859 = null;
    }
    
    public void method18317(final Class7018 class7018) {
        this.field24856.put(class7018.field27401, class7018);
    }
    
    public void method18318(final BlockPos class354) {
        this.field24856.remove(class354);
    }
    
    public void method18319(final BlockPos obj, final int field27403) {
        final Class7018 class7018 = this.field24856.get(obj);
        if (class7018 != null) {
            class7018.field27403 = field27403;
        }
        else {
            Class6123.field24854.warn("Strange, setFreeTicketCount was called for an unknown POI: " + obj);
        }
    }
    
    public void method18320(final Class353 class353) {
        this.field24857.add(class353);
    }
    
    public void method18321(final Class353 class353) {
        this.field24857.remove(class353);
    }
    
    public void method18322(final Class9307 class9307) {
        this.field24858.put(class9307.field39933, class9307);
    }
    
    @Override
    public void method18269(final MatrixStack class7351, final IRenderTypeBuffer class7352, final double n, final double n2, final double n3) {
        RenderSystem.method30059();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        this.method18323(n, n2, n3);
        RenderSystem.enableTexture();
        RenderSystem.disableBlend();
        RenderSystem.method30060();
        if (!this.field24855.player.isSpectator()) {
            this.method18338();
        }
    }
    
    private void method18323(final double n, final double n2, final double n3) {
        final BlockPos class354 = new BlockPos(n, n2, n3);
        this.field24857.forEach(class357 -> {
            if (!(!class356.method1081(class357.method1114(), 60.0))) {
                method18324(class357);
            }
            return;
        });
        this.field24858.values().forEach(class358 -> {
            if (!(!this.method18335(class358))) {
                this.method18329(class358, n4, n5, n6);
            }
            return;
        });
        for (final BlockPos class355 : this.field24856.keySet()) {
            if (!class354.withinDistance(class355, 30.0)) {
                continue;
            }
            method18325(class355);
        }
        this.field24856.values().forEach(class360 -> {
            if (!(!class359.method1081(class360.field27401, 30.0))) {
                this.method18327(class360);
            }
            return;
        });
        this.method18337().forEach((class362, list) -> {
            if (!(!class361.method1081(class362, 30.0))) {
                this.method18326(class362, list);
            }
        });
    }
    
    private static void method18324(final Class353 class353) {
        final BlockPos method1114 = class353.method1114();
        Class7282.method22334(method1114.add(-1.0, -1.0, -1.0), method1114.add(1.0, 1.0, 1.0), 0.2f, 1.0f, 0.2f, 0.15f);
    }
    
    private static void method18325(final BlockPos class354) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        Class7282.method22335(class354, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
    }
    
    private void method18326(final BlockPos class354, final List<String> obj) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        Class7282.method22335(class354, 0.05f, 0.2f, 0.2f, 1.0f, 0.3f);
        method18331("" + obj, class354, 0, -256);
        method18331("Ghost POI", class354, 1, -65536);
    }
    
    private void method18327(final Class7018 class7018) {
        int n = 0;
        if (this.method18333(class7018).size() >= 4) {
            method18330("" + this.method18333(class7018).size() + " ticket holders", class7018, n, -256);
        }
        else {
            method18330("" + this.method18333(class7018), class7018, n, -256);
        }
        ++n;
        method18330("Free tickets: " + class7018.field27403, class7018, n, -256);
        ++n;
        method18330(class7018.field27402, class7018, n, -1);
    }
    
    private void method18328(final Class9307 class9307, final double n, final double n2, final double n3) {
        if (class9307.field39940 != null) {
            Class6114.method18272(class9307.field39940, 0.5f, false, false, n, n2, n3);
        }
    }
    
    private void method18329(final Class9307 class9307, final double n, final double n2, final double n3) {
        final boolean method18334 = this.method18334(class9307);
        int n4 = 0;
        method18332(class9307.field39938, n4, class9307.field39935, -1, 0.03f);
        ++n4;
        if (method18334) {
            method18332(class9307.field39938, n4, class9307.field39936 + " " + class9307.field39937 + "xp", -1, 0.02f);
            ++n4;
        }
        if (method18334) {
            if (!class9307.field39939.equals("")) {
                method18332(class9307.field39938, n4, class9307.field39939, -98404, 0.02f);
                ++n4;
            }
        }
        if (method18334) {
            final Iterator<String> iterator = class9307.field39943.iterator();
            while (iterator.hasNext()) {
                method18332(class9307.field39938, n4, iterator.next(), -16711681, 0.02f);
                ++n4;
            }
        }
        if (method18334) {
            final Iterator<String> iterator2 = class9307.field39942.iterator();
            while (iterator2.hasNext()) {
                method18332(class9307.field39938, n4, iterator2.next(), -16711936, 0.02f);
                ++n4;
            }
        }
        if (class9307.field39941) {
            method18332(class9307.field39938, n4, "Wants Golem", -23296, 0.02f);
            ++n4;
        }
        if (method18334) {
            for (final String s : class9307.field39945) {
                if (!s.startsWith(class9307.field39935)) {
                    method18332(class9307.field39938, n4, s, -23296, 0.02f);
                }
                else {
                    method18332(class9307.field39938, n4, s, -1, 0.02f);
                }
                ++n4;
            }
        }
        if (method18334) {
            final Iterator iterator4 = Lists.reverse((List)class9307.field39944).iterator();
            while (iterator4.hasNext()) {
                method18332(class9307.field39938, n4, (String)iterator4.next(), -3355444, 0.02f);
                ++n4;
            }
        }
        if (method18334) {
            this.method18328(class9307, n, n2, n3);
        }
    }
    
    private static void method18330(final String s, final Class7018 class7018, final int n, final int n2) {
        method18331(s, class7018.field27401, n, n2);
    }
    
    private static void method18331(final String s, final BlockPos class354, final int n, final int n2) {
        Class7282.method22341(s, class354.getX() + 0.5, class354.getY() + 1.3 + n * 0.2, class354.getZ() + 0.5, n2, 0.02f, true, 0.0f, true);
    }
    
    private static void method18332(final IPosition class5488, final int n, final String s, final int n2, final float n3) {
        final BlockPos class5489 = new BlockPos(class5488);
        Class7282.method22341(s, class5489.getX() + 0.5, class5488.getY() + 2.4 + n * 0.25, class5489.getZ() + 0.5, n2, n3, false, 0.5f, true);
    }
    
    private Set<String> method18333(final Class7018 class7018) {
        return this.method18336(class7018.field27401).stream().map((Function<? super UUID, ?>)Class8956::method31774).collect((Collector<? super Object, ?, Set<String>>)Collectors.toSet());
    }
    
    private boolean method18334(final Class9307 class9307) {
        return Objects.equals(this.field24859, class9307.field39933);
    }
    
    private boolean method18335(final Class9307 class9307) {
        final Class756 field4684 = this.field24855.player;
        return new BlockPos(field4684.getPosX(), class9307.field39938.getY(), field4684.getPosZ()).withinDistance(new BlockPos(class9307.field39938), 30.0);
    }
    
    private Collection<UUID> method18336(final BlockPos class354) {
        return this.field24858.values().stream().filter(class356 -> Class9307.method34425(class356, class355)).map((Function<? super Class9307, ?>)Class9307::method34424).collect((Collector<? super Object, ?, Collection<UUID>>)Collectors.toSet());
    }
    
    private Map<BlockPos, List<String>> method18337() {
        final HashMap hashMap = Maps.newHashMap();
        for (final Class9307 class9307 : this.field24858.values()) {
            for (final BlockPos class9308 : class9307.field39946) {
                if (this.field24856.containsKey(class9308)) {
                    continue;
                }
                List arrayList = (List)hashMap.get(class9308);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                    hashMap.put(class9308, arrayList);
                }
                arrayList.add(class9307.field39935);
            }
        }
        return hashMap;
    }
    
    private void method18338() {
        Class7282.method22333(this.field24855.method5303(), 8).ifPresent(class399 -> this.field24859 = class399.method1865());
    }
    
    static {
        field24854 = LogManager.getLogger();
    }
}
