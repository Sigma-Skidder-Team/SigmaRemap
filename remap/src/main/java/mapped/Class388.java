// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.chunk.IChunkLightProvider;
import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;
import java.util.stream.Stream;
import java.io.Writer;

import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.longs.LongIterator;

import java.util.function.BooleanSupplier;

import org.apache.commons.lang3.mutable.MutableBoolean;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.io.IOException;
import java.util.Optional;
import java.util.Iterator;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

import java.util.concurrent.Executor;

import com.mojang.datafixers.DataFixer;

import java.util.Queue;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import org.apache.logging.log4j.Logger;

public class Class388 extends Class387 implements Class389 {
    private static final Logger field2248;
    public static final int field2249;
    private final Long2ObjectLinkedOpenHashMap<Class9298> field2250;
    private volatile Long2ObjectLinkedOpenHashMap<Class9298> field2251;
    private final Long2ObjectLinkedOpenHashMap<Class9298> field2252;
    private final LongSet field2253;
    private final Class1849 field2254;
    private final Class872<Runnable> field2256;
    private final Class6346<?> field2257;
    private final Supplier<Class8213> field2258;
    private final Class1883 field2259;
    private final LongSet field2260;
    private boolean field2261;
    private final Class6459 field2265;
    private final Class8731 field2266;
    private final AtomicInteger field2267;
    private final Class1795 field2268;
    private final File field2269;
    private final Class8249 field2270;
    private final Int2ObjectMap<Class9406> field2271;
    private final Queue<Runnable> field2272;
    private int field2273;

    public Class388(final Class1849 field2254, final File file, final DataFixer dataFixer, final Class1795 field2255, final Executor executor, final Class872<Runnable> field2256, final IChunkLightProvider class1908, final Class6346<?> field2257, final Class6459 field2258, final Supplier<Class8213> field2259, final int n) {
        super(new File(field2254.method6789().getType().method1272(file), "region"), dataFixer);
        this.field2250 = (Long2ObjectLinkedOpenHashMap<Class9298>) new Long2ObjectLinkedOpenHashMap();
        this.field2251 = this.field2250.clone();
        this.field2252 = (Long2ObjectLinkedOpenHashMap<Class9298>) new Long2ObjectLinkedOpenHashMap();
        this.field2253 = new LongOpenHashSet();
        this.field2260 = new LongOpenHashSet();
        this.field2267 = new AtomicInteger();
        this.field2270 = new Class8249();
        this.field2271 = (Int2ObjectMap<Class9406>) new Int2ObjectOpenHashMap();
        this.field2272 = Queues.newConcurrentLinkedQueue();
        this.field2268 = field2255;
        this.field2269 = field2254.method6789().getType().method1272(file);
        this.field2254 = field2254;
        this.field2257 = field2257;
        this.field2256 = field2256;
        final Class877<Runnable> method5393 = Class877.method5393(executor, "worldgen");
        this.field2265 = field2258;
        final Class877<Runnable> method5395 = Class877.method5393(executor, "light");
        this.field2266 = new Class8731(this, executor, field2256);
        this.field2258 = field2259;
        this.field2259 = new Class1883(new File(this.field2269, "poi"), dataFixer);
        this.method1338(n);
    }

    private static double method1312(final ChunkPos class7859, final Entity class7860) {
        final double n = class7859.field32290 * 16 + 8;
        final double n2 = class7859.field32291 * 16 + 8;
        final double n3 = n - class7860.getPosX();
        final double n4 = n2 - class7860.getPosZ();
        return n3 * n3 + n4 * n4;
    }

    private static int method1313(final ChunkPos class7859, final Class513 class7860, final boolean b) {
        int n;
        int n2;
        if (!b) {
            n = MathHelper.floor(class7860.getPosX() / 16.0);
            n2 = MathHelper.floor(class7860.getPosZ() / 16.0);
        } else {
            final Class353 method2961 = class7860.method2961();
            n = method2961.method1102();
            n2 = method2961.method1104();
        }
        return method1314(class7859, n, n2);
    }

    private static int method1314(final ChunkPos class7859, final int n, final int n2) {
        return Math.max(Math.abs(class7859.field32290 - n), Math.abs(class7859.field32291 - n2));
    }

    public Class1885 method1315() {
        return null;
    }

    @Nullable
    public Class9298 method1316(final long n) {
        return this.field2250.get(n);
    }

    @Nullable
    public Class9298 method1317(final long n) {
        return this.field2251.get(n);
    }

    public IntSupplier method1318(final long n) {
        return null;
    }

    public String method1319(final ChunkPos class7859) {
        final Class9298 method1317 = this.method1317(class7859.method25422());
        if (method1317 != null) {
            String str = method1317.method34358() + "\n";
            final ChunkStatus method1318 = method1317.method34346();
            final IChunk method1319 = method1317.method34347();
            if (method1318 != null) {
                str = str + "St: §" + method1318.ordinal() + method1318 + '§' + "r\n";
            }
            if (method1319 != null) {
                str = str + "Ch: §" + method1319.method7027().ordinal() + method1319.method7027() + '§' + "r\n";
            }
            final Class2152 method1320 = method1317.method34356();
            return str + "§" + method1320.ordinal() + method1320 + '§' + "r";
        }
        return "null";
    }

    private CompletableFuture<Either<List<IChunk>, IChunkLoadingError>> method1320(final ChunkPos class7859, final int n, final IntFunction<ChunkStatus> intFunction) {
        final ArrayList arrayList = Lists.newArrayList();
        final int field32290 = class7859.field32290;
        final int field32291 = class7859.field32291;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                final int max = Math.max(Math.abs(j), Math.abs(i));
                final ChunkPos class7860 = new ChunkPos(field32290 + j, field32291 + i);
                final Class9298 method1316 = this.method1316(class7860.method25422());
                arrayList.add(method1316.method34354(intFunction.apply(max), this));
            }
        }
        return null;
    }

    public CompletableFuture<Either<Chunk, IChunkLoadingError>> method1321(final ChunkPos class7859) {
        return null;
    }

    @Nullable
    private Class9298 method1322(final long n, final int n2, Class9298 class9298, final int n3) {
        if (n3 > Class388.field2249 && n2 > Class388.field2249) {
            return class9298;
        }
        if (class9298 != null) {
            class9298.method34361(n2);
        }
        if (class9298 != null) {
            if (n2 <= Class388.field2249) {
                this.field2260.remove(n);
            } else {
                this.field2260.add(n);
            }
        }
        return class9298;
    }

    @Override
    public void close() throws IOException {
        try {
            this.field2259.close();
        } finally {
            super.close();
        }
    }

    public void method1323(final boolean b) {
        if (!b) {
            this.field2251.values().stream().filter(Class9298::method34365).forEach(class9298 -> {
                final IChunk class9299 = class9298.method34348().getNow(null);
                if (class9299 instanceof Class1866 || class9299 instanceof Chunk) {
                    this.method1337(class9299);
                    class9298.method34366();
                }
            });
        } else {
            final List<Object> list = this.field2251.values().stream().filter(Class9298::method34365).peek(Class9298::method34366).collect((Collector<? super Object, ?, List<Object>>) Collectors.toList());
            final MutableBoolean mutableBoolean = new MutableBoolean();
            while (true) {
                mutableBoolean.setFalse();
                break;
            }
            this.method1325(() -> true);
            this.method1311();
            Class388.field2248.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", this.field2269.getName());
        }
    }

    public void method1324(final BooleanSupplier booleanSupplier) {
        final IProfiler method6796 = this.field2254.method6796();
        method6796.startSection("poi");
        this.field2259.method7178(booleanSupplier);
        method6796.method15300("chunk_unload");
        if (!this.field2254.method6795()) {
            this.method1325(booleanSupplier);
            if (Class9570.field41203.method22605()) {
                if (this.field2250.isEmpty()) {
                    Class9570.field41203.method22608(this.field2254);
                }
            }
        }
        method6796.endSection();
    }

    private void method1325(final BooleanSupplier booleanSupplier) {
        final LongIterator iterator = this.field2260.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (!booleanSupplier.getAsBoolean()) {
                if (n >= 200) {
                    if (this.field2260.size() <= 2000) {
                        break;
                    }
                }
            }
            final long nextLong = iterator.nextLong();
            final Class9298 class9298 = this.field2250.remove(nextLong);
            if (class9298 != null) {
                this.field2261 = true;
                ++n;
                this.method1326(nextLong, class9298);
            }
            iterator.remove();
        }
        while (booleanSupplier.getAsBoolean() || this.field2272.size() > 2000) {
            final Runnable runnable;
            if ((runnable = this.field2272.poll()) == null) {
                return;
            }
            runnable.run();
        }
    }

    private void method1326(final long n, final Class9298 class9298) {

    }

    public boolean method1327() {
        if (this.field2261) {
            this.field2251 = this.field2250.clone();
            this.field2261 = false;
            return true;
        }
        return false;
    }

    public CompletableFuture<Either<IChunk, IChunkLoadingError>> method1328(final Class9298 class9298, final ChunkStatus class9299) {
        return null;
    }

    private CompletableFuture<Either<IChunk, IChunkLoadingError>> method1329(final ChunkPos class7859) {
        return null;
    }

    private CompletableFuture<Either<IChunk, IChunkLoadingError>> method1330(final Class9298 class9298, final ChunkStatus class9299) {
        return null;
    }

    public void method1331(final ChunkPos class7859) {
    }

    private CompletableFuture<Either<IChunk, IChunkLoadingError>> method1333(final Class9298 class9298) {
        return null;
    }

    public CompletableFuture<Either<Chunk, IChunkLoadingError>> method1334(final Class9298 class9298) {
        return null;
    }

    public CompletableFuture<Either<Chunk, IChunkLoadingError>> method1335(final Class9298 class9298) {
        return null;
    }

    public int method1336() {
        return this.field2267.get();
    }

    private boolean method1337(final IChunk class1860) {
        this.field2259.method7191(class1860.method7019());
        if (!class1860.method7026()) {
            return false;
        }
        try {
            this.field2254.method6916();
        } catch (final Exception class1861) {
            Class388.field2248.error("Couldn't save chunk; already in use by another instance of Minecraft?", class1861);
            return false;
        }
        class1860.method7020(this.field2254.method6754());
        class1860.method7025(false);
        final ChunkPos method7019 = class1860.method7019();
        try {
            final ChunkStatus method7020 = class1860.method7027();
            if (method7020.getType() != ChunkStatus.Type.LEVELCHUNK) {
                final CompoundNBT method7021 = this.method1345(method7019);
                if (method7021 != null && Class7532.method23594(method7021) == ChunkStatus.Type.LEVELCHUNK) {
                    return false;
                }
                if (method7020 == ChunkStatus.EMPTY && class1860.method7021().values().stream().noneMatch(Class5936::method17858)) {
                    return false;
                }
            }
            this.field2254.method6796().method15302("chunkSave");
            final CompoundNBT method7022 = Class7532.method23593(this.field2254, class1860);
            if (Class9570.field41190.method22619()) {
                Class9570.method35840(Class9570.field41190, class1860, method7022);
            }
            this.method1310(method7019, method7022);
            return true;
        } catch (final Exception ex) {
            Class388.field2248.error("Failed to save chunk {},{}", method7019.field32290, method7019.field32291, ex);
            return false;
        }
    }

    public void method1338(final int n) {
        final int method35651 = MathHelper.method35651(n + 1, 3, 64);
        if (method35651 != this.field2273) {
            final int field2273 = this.field2273;
            this.field2273 = method35651;
            this.field2266.method30139(this.field2273);
            final ObjectIterator iterator = this.field2250.values().iterator();
        }
    }

    public void method1339(final Class513 class513, final ChunkPos class514, final IPacket<?>[] array, final boolean b, final boolean b2) {
        if (class513.world == this.field2254) {
            if (Class9570.field41264.method22605()) {
                Class9570.field41264.method22608(b, b2, class513, class514, this.field2254);
            }
            if (b2) {
                if (!b) {
                    final Class9298 method1317 = this.method1317(class514.method25422());
                    if (method1317 != null) {
                        final Chunk method1318 = method1317.method34345();
                        if (method1318 != null) {
                            this.method1357(class513, array, method1318);
                        }
                        Class9324.method34531(this.field2254, class514);
                    }
                }
            }
            if (!b2) {
                if (b) {
                    class513.method2960(class514);
                }
            }
        }
    }

    public int method1340() {
        return this.field2251.size();
    }

    public Class8731 method1341() {
        return this.field2266;
    }

    public Iterable<Class9298> method1342() {
        return Iterables.unmodifiableIterable((Iterable) this.field2251.values());
    }

    public void method1343(final Writer writer) throws IOException {
        final Class8308 method22418 = Class8308.method27594().method22417("x").method22417("z").method22417("level").method22417("in_memory").method22417("status").method22417("full_status").method22417("accessible_ready").method22417("ticking_ready").method22417("entity_ticking_ready").method22417("ticket").method22417("spawning").method22417("entity_count").method22417("block_entity_count").method22418(writer);
    }

    private static String method1344(final CompletableFuture<Either<Chunk, IChunkLoadingError>> completableFuture) {
        try {
            final Either either = completableFuture.getNow(null);
            return (String) ((either != null) ? either.map(p0 -> "done", p0 -> "unloaded") : "not completed");
        } catch (final CompletionException ex) {
            return "failed " + ex.getCause().getMessage();
        } catch (final CancellationException ex2) {
            return "cancelled";
        }
    }

    @Nullable
    private CompoundNBT method1345(final ChunkPos class7859) throws IOException {
        final CompoundNBT method1309 = this.method1309(class7859);
        return (method1309 != null) ? this.method1307(this.field2254.method6789().getType(), this.field2258, method1309) : null;
    }

    public boolean method1346(final ChunkPos class7859) {
        return false;
    }

    private boolean method1347(final Class513 class513) {
        return class513.isSpectator() && !this.field2254.method6765().method31216(Class8878.field37330);
    }

    public void method1348(final Class513 class513, final boolean b) {
        final boolean method1347 = this.method1347(class513);
        final boolean method1348 = this.field2270.method27356(class513);
        final int n = MathHelper.floor(class513.getPosX()) >> 4;
        final int n2 = MathHelper.floor(class513.getPosZ()) >> 4;
        if (!b) {
            final Class353 method1349 = class513.method2961();
            this.field2270.method27353(method1349.method1115().method25422(), class513);
            if (!method1348) {
                this.field2266.method30137(method1349, class513);
            }
        } else {
            this.field2270.method27352(ChunkPos.method25423(n, n2), class513, method1347);
            this.method1349(class513);
            if (!method1347) {
                this.field2266.method30136(Class353.method1091(class513), class513);
            }
        }
        for (int i = n - this.field2273; i <= n + this.field2273; ++i) {
            for (int j = n2 - this.field2273; j <= n2 + this.field2273; ++j) {
                this.method1339(class513, new ChunkPos(i, j), new IPacket[2], !b, b);
            }
        }
    }

    private Class353 method1349(final Class513 class513) {
        final Class353 method1091 = Class353.method1091(class513);
        class513.method2962(method1091);
        class513.field3039.method17469(new Class4379(method1091.method1102(), method1091.method1104()));
        return method1091;
    }

    public void method1350(final Class513 class513) {
        for (final Class9406 class514 : this.field2271.values()) {
            class514.method34988(this.field2254.getPlayers());
        }
        final int n = MathHelper.floor(class513.getPosX()) >> 4;
        final int n2 = MathHelper.floor(class513.getPosZ()) >> 4;
        final Class353 method2961 = class513.method2961();
        final Class353 method2962 = Class353.method1091(class513);
        final long method2963 = method2961.method1115().method25422();
        final long method2964 = method2962.method1115().method25422();
        final boolean method2965 = this.field2270.method27357(class513);
        final boolean method2966 = this.method1347(class513);
        if (method2961.method1117() != method2962.method1117() || method2965 != method2966) {
            this.method1349(class513);
            if (!method2965) {
                this.field2266.method30137(method2961, class513);
            }
            if (!method2966) {
                this.field2266.method30136(method2962, class513);
            }
            if (!method2965) {
                if (method2966) {
                    this.field2270.method27354(class513);
                }
            }
            if (method2965) {
                if (!method2966) {
                    this.field2270.method27355(class513);
                }
            }
            if (method2963 != method2964) {
                this.field2270.method27358(method2963, method2964, class513);
            }
        }
        final int method2967 = method2961.method1102();
        final int method2968 = method2961.method1104();
        if (Math.abs(method2967 - n) <= this.field2273 * 2 && Math.abs(method2968 - n2) <= this.field2273 * 2) {
            final int n3 = Math.min(n, method2967) - this.field2273;
            final int n4 = Math.min(n2, method2968) - this.field2273;
            final int n5 = Math.max(n, method2967) + this.field2273;
            final int n6 = Math.max(n2, method2968) + this.field2273;
            for (int i = n3; i <= n5; ++i) {
                for (int j = n4; j <= n6; ++j) {
                    final ChunkPos class515 = new ChunkPos(i, j);
                    this.method1339(class513, class515, new IPacket[2], method1314(class515, method2967, method2968) <= this.field2273, method1314(class515, n, n2) <= this.field2273);
                }
            }
        } else {
            for (int k = method2967 - this.field2273; k <= method2967 + this.field2273; ++k) {
                for (int l = method2968 - this.field2273; l <= method2968 + this.field2273; ++l) {
                    this.method1339(class513, new ChunkPos(k, l), new IPacket[2], true, false);
                }
            }
            for (int n7 = n - this.field2273; n7 <= n + this.field2273; ++n7) {
                for (int n8 = n2 - this.field2273; n8 <= n2 + this.field2273; ++n8) {
                    this.method1339(class513, new ChunkPos(n7, n8), new IPacket[2], false, true);
                }
            }
        }
    }

    @Override
    public Stream<Class513> method1351(final ChunkPos class7859, final boolean b) {
        return Stream.empty();
    }

    public void method1352(final Entity class399) {
        if (!(class399 instanceof Class859)) {
            if (!(class399 instanceof LightningBoltEntity)) {
                final EntityType<?> method1642 = class399.getType();
                final int n = method1642.method23380() * 16;
                final int method1643 = method1642.method23381();
                if (this.field2271.containsKey(class399.getEntityId())) {
                    throw Util.pauseDevMode(new IllegalStateException("Entity is already tracked!"));
                }
                final Class9406 class400 = new Class9406(this, class399, n, method1643, method1642.method23382());
                class400.method34988(this.field2254.getPlayers());
                if (class399 instanceof Class513) {
                    final Class513 class401 = (Class513) class399;
                    this.method1348(class401, true);
                    for (final Class9406 class402 : this.field2271.values()) {
                        class402.method34986(class401);
                    }
                }
            }
        }
    }

    public void method1353(final Entity class399) {
        if (class399 instanceof Class513) {
            final Class513 class400 = (Class513) class399;
            this.method1348(class400, false);
            final ObjectIterator iterator = this.field2271.values().iterator();
            while (iterator.hasNext()) {
                ((Class9406) iterator.next()).method34985(class400);
            }
        }
        final Class9406 class401 = this.field2271.remove(class399.getEntityId());
        if (class401 != null) {
            class401.method34984();
        }
    }

    public void method1354() {
        final ArrayList arrayList = Lists.newArrayList();
        final List<Class513> method6840 = this.field2254.getPlayers();
        if (!arrayList.isEmpty()) {
            final ObjectIterator iterator2 = this.field2271.values().iterator();
            while (iterator2.hasNext()) {
                ((Class9406) iterator2.next()).method34988(arrayList);
            }
        }
    }

    public void method1355(final Entity class399, final IPacket<?> class400) {
        final Class9406 class401 = this.field2271.get(class399.getEntityId());
        if (class401 != null) {
            class401.method34982(class400);
        }
    }

    public void method1356(final Entity class399, final IPacket<?> class400) {
        final Class9406 class401 = this.field2271.get(class399.getEntityId());
        if (class401 != null) {
            class401.method34983(class400);
        }
    }

    private void method1357(final Class513 class513, final IPacket<?>[] array, final Chunk class514) {
        if (array[0] == null) {
            array[0] = new Class4298(class514, 65535);
        }
        class513.method2959(class514.method7019(), array[0], array[1]);
        Class9324.method34531(this.field2254, class514.method7019());
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        if (!arrayList2.isEmpty()) {
            final Iterator iterator3 = arrayList2.iterator();
            while (iterator3.hasNext()) {
                class513.field3039.method17469(new Class4286((Entity) iterator3.next()));
            }
        }
    }

    public Class1883 method1358() {
        return this.field2259;
    }

    public CompletableFuture<Void> method1359(final Chunk class1862) {
        return null;
    }

    static {
        field2248 = LogManager.getLogger();
        field2249 = 33 + ChunkStatus.maxDistance();
    }
}
