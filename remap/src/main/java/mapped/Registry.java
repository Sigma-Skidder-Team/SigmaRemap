// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.EntityType;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.dimension.DimensionType;
import org.apache.logging.log4j.LogManager;
import org.apache.commons.lang3.Validate;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;
import java.util.Random;
import java.util.Set;
import java.util.Optional;
import javax.annotation.Nullable;
import java.util.function.Supplier;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public abstract class Registry<T> implements Class89<T>
{
    public static final Logger field202;
    private static final Map<ResourceLocation, Supplier<?>> field203;
    public static final Class91<Class91<?>> field204;
    public static final Registry<Class7795> field205;
    public static final Class93<Fluid> FLUID;
    public static final Registry<Class5328> field207;
    public static final Class93<Block> BLOCK;
    public static final Registry<Class6257> field209;
    public static final Class93<EntityType<?>> field210;
    public static final Class93<Item> field211;
    public static final Class93<Class8061> field212;
    public static final Registry<Class7304<?>> field213;
    public static final Registry<Class6032<?>> field214;
    public static final Registry<Class4535<?>> field215;
    public static final Registry<Class7133<?>> field216;
    public static final Registry<Class3090> field217;
    public static final Registry<Class8804<?>> field218;
    public static final Registry<Class8372<?>> field219;
    public static final Registry<Class7944<?>> field220;
    public static final Registry<Class7742<?>> field221;
    public static final Registry<Class6907<? extends IParticleData>> field222;
    public static final Registry<Class7768<?, ?>> field223;
    public static final Registry<Class5412<?>> field224;
    public static final Registry<Class8705<?, ?>> field225;
    public static final Registry<DimensionType> field226;
    public static final Class93<Class8539> field227;
    public static final Registry<ResourceLocation> field228;
    public static final Class93<ChunkStatus> field229;
    public static final Registry<Class4574<?>> field230;
    public static final Registry<Class9520> field231;
    public static final Registry<Class7757> field232;
    public static final Registry<Class7756> field233;
    public static final Registry<Class7755> field234;
    public static final Registry<Class8471<?>> field235;
    public static final Registry<IRecipeType<?>> field236;
    public static final Registry<IRecipeSerializer<?>> field237;
    public static final Registry<Class2248<?>> field238;
    public static final Class93<Class7611> field239;
    public static final Class93<Class9334> field240;
    public static final Class93<Class8912> field241;
    public static final Class93<Class8233<?>> field242;
    public static final Class93<Class8033<?>> field243;
    public static final Registry<Class8771> field244;
    public static final Registry<Class7635> field245;
    
    private static <T> Registry<T> method500(final String s, final Supplier<T> supplier) {
        return method502(s, new Class92(), supplier);
    }
    
    private static <T> Class93<T> method501(final String s, final String s2, final Supplier<T> supplier) {
        return method502(s, new Class93<T>(s2), supplier);
    }
    
    private static <T, R extends Class91<T>> R method502(final String s, final R r, final Supplier<T> supplier) {
        final ResourceLocation class1932 = new ResourceLocation(s);
        Registry.field203.put(class1932, supplier);
        return Registry.field204.method558(class1932, r);
    }
    
    @Nullable
    public abstract ResourceLocation getKey(final T p0);
    
    public abstract int getId(final T p0);
    
    @Nullable
    public abstract T getOrDefault(final ResourceLocation p0);
    
    public abstract Optional<T> method506(final ResourceLocation p0);
    
    public abstract Set<ResourceLocation> method507();
    
    @Nullable
    public abstract T method508(final Random p0);
    
    public Stream<T> method509() {
        return StreamSupport.stream(this.spliterator(), false);
    }
    
    public abstract boolean method510(final ResourceLocation p0);
    
    public static <T> T register(final Registry<? super T> class90, final String s, final T t) {
        return method512(class90, new ResourceLocation(s), t);
    }
    
    public static <T> T method512(final Registry<? super T> class90, final ResourceLocation class91, final T t) {
        return ((Class91<? super T>)class90).method558(class91, t);
    }
    
    public static <T> T method513(final Registry<? super T> class90, final int n, final String s, final T t) {
        return ((Class91<? super T>)class90).method557(n, new ResourceLocation(s), t);
    }
    
    static {
        field202 = LogManager.getLogger();
        field203 = Maps.newLinkedHashMap();
        field204 = new Class92<Class91<?>>();
        field205 = method500("sound_event", () -> Class8520.field35327);
        FLUID = method501("fluid", "empty", () -> Class7558.field29974);
        field207 = method500("mob_effect", () -> Class9439.field40499);
        BLOCK = method501("block", "air", () -> Blocks.AIR);
        field209 = method500("enchantment", () -> Class7882.field32368);
        field210 = method501("entity_type", "pig", () -> EntityType.field29012);
        field211 = method501("item", "air", () -> Items.AIR);
        field212 = method501("potion", "empty", () -> Class8644.field36250);
        field213 = method500("carver", () -> Class7304.field28276);
        field214 = method500("surface_builder", () -> Class6032.field24552);
        field215 = method500("feature", () -> Class4535.field20003);
        field216 = method500("decorator", () -> Class7133.field27782);
        field217 = method500("biome", () -> Class7102.field27632);
        field218 = method500("block_state_provider_type", () -> Class8804.field37004);
        field219 = method500("block_placer_type", () -> Class8372.field34331);
        field220 = method500("foliage_placer_type", () -> Class7944.field32619);
        field221 = method500("tree_decorator_type", () -> Class7742.field31648);
        field222 = method500("particle_type", () -> Class8432.field34600);
        field223 = method500("biome_source_type", () -> Class7768.field31770);
        field224 = method500("block_entity_type", () -> Class5412.field22541);
        field225 = method500("chunk_generator_type", () -> Class8705.field36578);
        field226 = method500("dimension_type", () -> DimensionType.field2223);
        field227 = method501("motive", "kebab", () -> Class8539.field35829);
        field228 = method500("custom_stat", () -> Class8276.field34007);
        field229 = method501("chunk_status", "empty", () -> ChunkStatus.EMPTY);
        field230 = method500("structure_feature", () -> Class9380.field40226);
        field231 = method500("structure_piece", () -> Class9520.field40945);
        field232 = method500("rule_test", () -> Class7757.field31698);
        field233 = method500("structure_processor", () -> Class7756.field31692);
        field234 = method500("structure_pool_element", () -> Class7755.field31691);
        field235 = method500("menu", () -> Class8471.field34762);
        field236 = method500("recipe_type", () -> IRecipeType.field37843);
        field237 = method500("recipe_serializer", () -> IRecipeSerializer.field24734);
        field238 = method500("stat_type", () -> Class8276.field33981);
        field239 = method501("villager_type", "plains", () -> Class7611.field30165);
        field240 = method501("villager_profession", "none", () -> Class9334.field40060);
        field241 = method501("point_of_interest_type", "unemployed", () -> Class8912.field37461);
        field242 = method501("memory_module_type", "dummy", () -> Class8233.field33799);
        field243 = method501("sensor_type", "dummy", () -> Class8033.field33063);
        field244 = method500("schedule", () -> Class8771.field36872);
        field245 = method500("activity", () -> Class7635.field30227);
        Registry.field203.entrySet().forEach(entry -> {
            if (entry.getValue().get() == null) {
                Registry.field202.error("Unable to bootstrap registry '{}'", (Object)entry.getKey());
            }
            return;
        });
        Registry.field204.forEach(class91 -> {
            if (!(!class91.method559())) {
                Registry.field202.error("Registry '{}' was empty after loading", (Object) Registry.field204.getKey(class91));
                if (!(!Class9528.field41021)) {
                    new IllegalStateException("Registry: '" + Registry.field204.getKey(class91) + "' is empty, not allowed, fix me!");
                    throw;
                }
            }
            if (!(!(class91 instanceof Class93))) {
                ((Class93)class91).method560();
                final ResourceLocation obj;
                Validate.notNull(class91.getOrDefault(obj), "Missing default of DefaultedMappedRegistry: " + obj, new Object[0]);
            }
        });
    }
}
