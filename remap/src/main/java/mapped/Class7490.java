// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.mojang.brigadier.suggestion.Suggestions;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.concurrent.CompletableFuture;

public class Class7490 implements Class7491
{
    private final Class5799 field28922;
    private final Minecraft field28923;
    private int field28924;
    private CompletableFuture<Suggestions> field28925;
    
    public Class7490(final Class5799 field28922, final Minecraft field28923) {
        this.field28924 = -1;
        this.field28922 = field28922;
        this.field28923 = field28923;
    }
    
    @Override
    public Collection<String> method23205() {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class9081> iterator = this.field28922.method17370().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().method32719().getName());
        }
        return arrayList;
    }
    
    @Override
    public Collection<String> method23206() {
        return (Collection<String>)((this.field28923.field4691 != null && this.field28923.field4691.getType() == RayTraceResult.Type.ENTITY) ? Collections.singleton(((EntityRayTraceResult)this.field28923.field4691).getEntity().method1866()) : Collections.emptyList());
    }
    
    @Override
    public Collection<String> method23207() {
        return this.field28922.method17376().method6782().method19649();
    }
    
    @Override
    public Collection<ResourceLocation> method23208() {
        return this.field28923.method5299().method6420();
    }
    
    @Override
    public Stream<ResourceLocation> method23209() {
        return this.field28922.method17271().method6384();
    }
    
    @Override
    public boolean method23210(final int n) {
        final ClientPlayerEntity field4684 = this.field28923.player;
        return (field4684 == null) ? (n == 0) : field4684.method1926(n);
    }
    
    @Override
    public CompletableFuture<Suggestions> method23211(final CommandContext<Class7491> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        if (this.field28925 != null) {
            this.field28925.cancel(false);
        }
        this.field28925 = new CompletableFuture<Suggestions>();
        this.field28922.method17292(new Class4265(++this.field28924, commandContext.getInput()));
        return this.field28925;
    }
    
    private static String method23212(final double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }
    
    private static String method23213(final int i) {
        return Integer.toString(i);
    }
    
    @Override
    public Collection<Class8762> method23214() {
        final RayTraceResult field4691 = this.field28923.field4691;
        if (field4691 != null && field4691.getType() == RayTraceResult.Type.BLOCK) {
            final BlockPos method21447 = ((BlockRayTraceResult)field4691).getPos();
            return Collections.singleton(new Class8762(method23213(method21447.getX()), method23213(method21447.getY()), method23213(method21447.getZ())));
        }
        return super.method23214();
    }
    
    @Override
    public Collection<Class8762> method23215() {
        final RayTraceResult field4691 = this.field28923.field4691;
        if (field4691 != null && field4691.getType() == RayTraceResult.Type.BLOCK) {
            final Vec3d method21451 = field4691.getHitVec();
            return Collections.singleton(new Class8762(method23212(method21451.x), method23212(method21451.y), method23212(method21451.z)));
        }
        return super.method23215();
    }
    
    public void method23216(final int n, final Suggestions value) {
        if (n == this.field28924) {
            this.field28925.complete(value);
            this.field28925 = null;
            this.field28924 = -1;
        }
    }
}
