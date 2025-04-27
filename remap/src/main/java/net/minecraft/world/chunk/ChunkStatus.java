// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.world.chunk;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.function.Function;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import it.unimi.dsi.fastutil.ints.IntList;
import mapped.*;

import java.util.List;
import java.util.EnumSet;

public class ChunkStatus
{
    private static final EnumSet<HeightmapType> PRE_FEATURES;
    private static final EnumSet<HeightmapType> POST_FEATURES;
    private static final ILoadingWorker NOOP_LOADING_WORKER;
    public static final ChunkStatus EMPTY;
    public static final ChunkStatus STRUCTURE_STARTS;
    public static final ChunkStatus STRUCTURE_REFERENCES;
    public static final ChunkStatus BIOMES;
    public static final ChunkStatus NOISE;
    public static final ChunkStatus SURFACE;
    public static final ChunkStatus CARVERS;
    public static final ChunkStatus LIQUID_CARVERS;
    public static final ChunkStatus FEATURES;
    public static final ChunkStatus LIGHT;
    public static final ChunkStatus SPAWN;
    public static final ChunkStatus HEIGHTMAPS;
    public static final ChunkStatus FULL;
    private static final List<ChunkStatus> STATUS_BY_RANGE;
    private static final IntList RANGE_BY_STATUS;
    private final String name;
    private final int ordinal;
    private final ChunkStatus parent;
    private final IGenerationWorker generationWorker;
    private final ILoadingWorker loadingWorker;
    private final int taskRange;
    private final Type type;
    private final EnumSet<HeightmapType> heightmaps;
    
    private static CompletableFuture<Either<IChunk, IChunkLoadingError>> method34433(final ChunkStatus class9312, final Class1885 class9313, final IChunk class9314) {
        final boolean method34438 = isLighted(class9312, class9314);
        if (!class9314.method7027().isAtLeast(class9312)) {
            ((Class1865)class9314).method7098(class9312);
        }
        return (CompletableFuture<Either<IChunk, IChunkLoadingError>>)class9313.method7260(class9314, method34438).thenApply((Function<? super IChunk, ?>)Either::left);
    }
    
    private static ChunkStatus registerSelective(final String s, final ChunkStatus class9312, final int n, final EnumSet<HeightmapType> set, final Type class9313, final Class7942 class9314) {
        return register(s, class9312, n, set, class9313, class9314);
    }
    
    private static ChunkStatus register(final String s, final ChunkStatus class9312, final int n, final EnumSet<HeightmapType> set, final Type class9313, final IGenerationWorker class9314) {
        return register(s, class9312, n, set, class9313, class9314, ChunkStatus.NOOP_LOADING_WORKER);
    }
    
    private static ChunkStatus register(final String s, final ChunkStatus class9312, final int n, final EnumSet<HeightmapType> set, final Type class9313, final IGenerationWorker class9314, final ILoadingWorker class9315) {
        return Registry.register(Registry.field229, s, new ChunkStatus(s, class9312, n, set, class9313, class9314, class9315));
    }
    
    public static List<ChunkStatus> getAll() {
        final ArrayList arrayList = Lists.newArrayList();
        ChunkStatus class9312;
        for (class9312 = ChunkStatus.FULL; class9312.getParent() != class9312; class9312 = class9312.getParent()) {
            arrayList.add(class9312);
        }
        arrayList.add(class9312);
        Collections.reverse(arrayList);
        return arrayList;
    }
    
    private static boolean isLighted(final ChunkStatus class9312, final IChunk class9313) {
        return class9313.method7027().isAtLeast(class9312) && class9313.method7043();
    }
    
    public static ChunkStatus getStatus(final int n) {
        if (n < ChunkStatus.STATUS_BY_RANGE.size()) {
            return (n >= 0) ? ChunkStatus.STATUS_BY_RANGE.get(n) : ChunkStatus.FULL;
        }
        return ChunkStatus.EMPTY;
    }
    
    public static int maxDistance() {
        return ChunkStatus.STATUS_BY_RANGE.size();
    }
    
    public static int getDistance(final ChunkStatus class9312) {
        return ChunkStatus.RANGE_BY_STATUS.getInt(class9312.ordinal());
    }
    
    public ChunkStatus(final String name, final ChunkStatus class9312, final int ordinal, final EnumSet<HeightmapType> parent, final Type generationWorker, final IGenerationWorker loadingWorker, final ILoadingWorker taskRange) {
        this.name = name;
        this.parent = ((class9312 != null) ? class9312 : this);
        this.generationWorker = loadingWorker;
        this.loadingWorker = taskRange;
        this.taskRange = ordinal;
        this.type = generationWorker;
        this.heightmaps = parent;
        this.ordinal = ((class9312 != null) ? (class9312.ordinal() + 1) : 0);
    }
    
    public int ordinal() {
        return this.ordinal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public ChunkStatus getParent() {
        return this.parent;
    }
    
    public CompletableFuture<Either<IChunk, IChunkLoadingError>> method34445(final Class1849 class1849, final Class6346<?> class1850, final Class1795 class1851, final Class1885 class1852, final Function<IChunk, CompletableFuture<Either<IChunk, IChunkLoadingError>>> function, final List<IChunk> list) {
        return this.generationWorker.method25764(this, class1849, class1850, class1851, class1852, function, list, list.get(list.size() / 2));
    }
    
    public CompletableFuture<Either<IChunk, IChunkLoadingError>> method34446(final Class1849 class1849, final Class1795 class1850, final Class1885 class1851, final Function<IChunk, CompletableFuture<Either<IChunk, IChunkLoadingError>>> function, final IChunk class1852) {
        return this.loadingWorker.method34981(this, class1849, class1850, class1851, function, class1852);
    }
    
    public int getTaskRange() {
        return this.taskRange;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public static ChunkStatus byName(final String s) {
        return Registry.field229.getOrDefault(ResourceLocation.method7795(s));
    }
    
    public EnumSet<HeightmapType> getHeightMaps() {
        return this.heightmaps;
    }
    
    public boolean isAtLeast(final ChunkStatus class9312) {
        return this.ordinal() >= class9312.ordinal();
    }
    
    @Override
    public String toString() {
        return Registry.field229.getKey(this).toString();
    }
    
    static {
        PRE_FEATURES = EnumSet.of(HeightmapType.field11523, HeightmapType.field11521);
        POST_FEATURES = EnumSet.of(HeightmapType.field11524, HeightmapType.field11522, HeightmapType.field11525, HeightmapType.field11526);
        NOOP_LOADING_WORKER = ((class9312, class9313, class9314, class9315, function, class9316) -> {
            if (class9316 instanceof Class1865) {
                if (!class9316.method7027().isAtLeast(class9312)) {
                    ((Class1865)class9316).method7098(class9312);
                }
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9316));
        });
        EMPTY = registerSelective("empty", null, -1, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> {});
        STRUCTURE_STARTS = register("structure_starts", ChunkStatus.EMPTY, 0, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> {
            if (!class9317.method7027().isAtLeast(class9312)) {
                if (class9313.method6764().method29565()) {
                    class9314.method18881(class9313.method6797().method16809(class9314.method18879()), class9317, class9314, class9315);
                }
                if (class9317 instanceof Class1865) {
                    ((Class1865)class9317).method7098(class9312);
                }
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9317));
        });
        STRUCTURE_REFERENCES = registerSelective("structure_references", ChunkStatus.STRUCTURE_STARTS, 8, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18882(new Class1878(class1849, list), class1851));
        BIOMES = registerSelective("biomes", ChunkStatus.STRUCTURE_REFERENCES, 0, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18871(class1851));
        NOISE = registerSelective("noise", ChunkStatus.BIOMES, 8, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18861(new Class1878(class1849, list), class1851));
        SURFACE = registerSelective("surface", ChunkStatus.NOISE, 0, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18859(new Class1878(class1849, list), class1851));
        CARVERS = registerSelective("carvers", ChunkStatus.SURFACE, 0, ChunkStatus.PRE_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18873(class1849.method6797().method16809(class1850.method18879()), class1851, Class2126.field12400));
        LIQUID_CARVERS = registerSelective("liquid_carvers", ChunkStatus.CARVERS, 0, ChunkStatus.POST_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18873(class1849.method6797().method16809(class1850.method18879()), class1851, Class2126.field12401));
        FEATURES = register("features", ChunkStatus.LIQUID_CARVERS, 8, ChunkStatus.POST_FEATURES, Type.PROTOCHUNK, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> {
            final Class1865 class9318 = (Class1865)class9317;
            class9318.method7106(class9316);
            if (!class9317.method7027().isAtLeast(class9312)) {
                Class9548.method35711(class9317, EnumSet.of(HeightmapType.field11525, HeightmapType.field11526, HeightmapType.field11524, HeightmapType.field11522));
                class9314.method18875(new Class1878(class9313, list));
                class9318.method7098(class9312);
            }
            return CompletableFuture.completedFuture(Either.left((Object)class9317));
        });
        LIGHT = register("light", ChunkStatus.FEATURES, 1, ChunkStatus.POST_FEATURES, Type.PROTOCHUNK, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> method34433(class9312, class9316, class9317), (class9312, class9313, class9314, class9315, function, class9316) -> method34433(class9312, class9315, class9316));
        SPAWN = registerSelective("spawn", ChunkStatus.LIGHT, 0, ChunkStatus.POST_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> class1850.method18868(new Class1878(class1849, list)));
        HEIGHTMAPS = registerSelective("heightmaps", ChunkStatus.SPAWN, 0, ChunkStatus.POST_FEATURES, Type.PROTOCHUNK, (class1849, class1850, list, class1851) -> {});
        FULL = register("full", ChunkStatus.HEIGHTMAPS, 0, ChunkStatus.POST_FEATURES, Type.LEVELCHUNK, (class9312, class9313, class9314, class9315, class9316, function, list, class9317) -> function.apply(class9317), (class9312, class9313, class9314, class9315, function, class9316) -> function.apply(class9316));
        STATUS_BY_RANGE = (List)ImmutableList.of(ChunkStatus.FULL, ChunkStatus.FEATURES, ChunkStatus.LIQUID_CARVERS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, ChunkStatus.STRUCTURE_STARTS, (Object) ChunkStatus.STRUCTURE_STARTS);
        RANGE_BY_STATUS = Util.method27851((IntList)new IntArrayList(getAll().size()), list -> {
            for (int i = getAll().size() - 1; i >= 0; --i) {
                int n = 0;
                while (n + 1 < ChunkStatus.STATUS_BY_RANGE.size() && i <= ChunkStatus.STATUS_BY_RANGE.get(n + 1).ordinal()) {
                    ++n;
                }
                list.add(0, n);
            }
        });
    }

    interface ILoadingWorker
    {
        CompletableFuture<Either<IChunk, IChunkLoadingError>> method34981(final ChunkStatus p0, final Class1849 p1, final Class1795 p2, final Class1885 p3, final Function<IChunk, CompletableFuture<Either<IChunk, IChunkLoadingError>>> p4, final IChunk p5);
    }

    interface IGenerationWorker
    {
        CompletableFuture<Either<IChunk, IChunkLoadingError>> method25764(final ChunkStatus p0, final Class1849 p1, final Class6346<?> p2, final Class1795 p3, final Class1885 p4, final Function<IChunk, CompletableFuture<Either<IChunk, IChunkLoadingError>>> p5, final List<IChunk> p6, final IChunk p7);
    }

    public enum Type
    {
        PROTOCHUNK,
        LEVELCHUNK
    }
}
