package net.minecraft.util.registry;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.memory.MemoryModuleType;
import net.minecraft.entity.ai.brain.schedule.Activity;
import net.minecraft.entity.ai.brain.schedule.Schedule;
import net.minecraft.entity.ai.brain.sensor.SensorType;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.villager.IVillagerType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.IObjectIntIterable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.blockplacer.BlockPlacerType;
import net.minecraft.world.gen.blockstateprovider.BlockStateProviderType;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.jigsaw.IJigsawDeserializer;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.Structures;
import net.minecraft.world.gen.feature.template.IRuleTestType;
import net.minecraft.world.gen.feature.template.IStructureProcessorType;
import net.minecraft.world.gen.foliageplacer.FoliagePlacerType;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Registry<T> implements IObjectIntIterable<T>
{
    protected static final Logger LOGGER = LogManager.getLogger();
    private static final Map < ResourceLocation, Supplier<? >> LOCATION_TO_SUPPLIER = Maps.newLinkedHashMap();
    public static final MutableRegistry < MutableRegistry<? >> REGISTRY = new SimpleRegistry<>();
    public static final Registry<SoundEvent> SOUND_EVENT = registerSimple("sound_event", () ->
    {
        return SoundEvents.ENTITY_ITEM_PICKUP;
    });
    public static final DefaultedRegistry<Fluid> FLUID = registerDefaulted("fluid", "empty", () ->
    {
        return Fluids.EMPTY;
    });
    public static final Registry<Effect> EFFECTS = registerSimple("mob_effect", () ->
    {
        return Effects.LUCK;
    });
    public static final DefaultedRegistry<Block> BLOCK = registerDefaulted("block", "air", () ->
    {
        return Blocks.AIR;
    });
    public static final Registry<Enchantment> ENCHANTMENT = registerSimple("enchantment", () ->
    {
        return Enchantments.FORTUNE;
    });
    public static final DefaultedRegistry < EntityType<? >> ENTITY_TYPE = registerDefaulted("entity_type", "pig", () ->
    {
        return EntityType.PIG;
    });
    public static final DefaultedRegistry<Item> ITEM = registerDefaulted("item", "air", () ->
    {
        return Items.AIR;
    });
    public static final DefaultedRegistry<Potion> POTION = registerDefaulted("potion", "empty", () ->
    {
        return Potions.EMPTY;
    });
    public static final Registry < WorldCarver<? >> CARVER = registerSimple("carver", () ->
    {
        return WorldCarver.CAVE;
    });
    public static final Registry < SurfaceBuilder<? >> SURFACE_BUILDER = registerSimple("surface_builder", () ->
    {
        return SurfaceBuilder.DEFAULT;
    });
    public static final Registry < Feature<? >> FEATURE = registerSimple("feature", () ->
    {
        return Feature.ORE;
    });
    public static final Registry < Placement<? >> DECORATOR = registerSimple("decorator", () ->
    {
        return Placement.NOPE;
    });
    public static final Registry<Biome> BIOME = registerSimple("biome", () ->
    {
        return Biomes.DEFAULT;
    });
    public static final Registry < BlockStateProviderType<? >> BLOCK_STATE_PROVIDER_TYPE = registerSimple("block_state_provider_type", () ->
    {
        return BlockStateProviderType.SIMPLE_STATE_PROVIDER;
    });
    public static final Registry < BlockPlacerType<? >> BLOCK_PLACER_TYPE = registerSimple("block_placer_type", () ->
    {
        return BlockPlacerType.field_227259_a_;
    });
    public static final Registry < FoliagePlacerType<? >> FOLIAGE_PLACER_TYPE = registerSimple("foliage_placer_type", () ->
    {
        return FoliagePlacerType.field_227386_a_;
    });
    public static final Registry < TreeDecoratorType<? >> TREE_DECORATOR_TYPE = registerSimple("tree_decorator_type", () ->
    {
        return TreeDecoratorType.field_227426_b_;
    });
    public static final Registry < ParticleType <? extends IParticleData >> PARTICLE_TYPE = registerSimple("particle_type", () ->
    {
        return ParticleTypes.BLOCK;
    });
    public static final Registry < BiomeProviderType <? , ? >> BIOME_SOURCE_TYPE = registerSimple("biome_source_type", () ->
    {
        return BiomeProviderType.VANILLA_LAYERED;
    });
    public static final Registry < TileEntityType<? >> BLOCK_ENTITY_TYPE = registerSimple("block_entity_type", () ->
    {
        return TileEntityType.FURNACE;
    });
    public static final Registry < ChunkGeneratorType <? , ? >> CHUNK_GENERATOR_TYPE = registerSimple("chunk_generator_type", () ->
    {
        return ChunkGeneratorType.FLAT;
    });
    public static final Registry<DimensionType> DIMENSION_TYPE = registerSimple("dimension_type", () ->
    {
        return DimensionType.OVERWORLD;
    });
    public static final DefaultedRegistry<PaintingType> MOTIVE = registerDefaulted("motive", "kebab", () ->
    {
        return PaintingType.KEBAB;
    });
    public static final Registry<ResourceLocation> CUSTOM_STAT = registerSimple("custom_stat", () ->
    {
        return Stats.JUMP;
    });
    public static final DefaultedRegistry<ChunkStatus> CHUNK_STATUS = registerDefaulted("chunk_status", "empty", () ->
    {
        return ChunkStatus.EMPTY;
    });
    public static final Registry < Structure<? >> STRUCTURE_FEATURE = registerSimple("structure_feature", () ->
    {
        return Structures.MINESHAFT;
    });
    public static final Registry<IStructurePieceType> STRUCTURE_PIECE = registerSimple("structure_piece", () ->
    {
        return IStructurePieceType.MSROOM;
    });
    public static final Registry<IRuleTestType> RULE_TEST = registerSimple("rule_test", () ->
    {
        return IRuleTestType.ALWAYS_TRUE;
    });
    public static final Registry<IStructureProcessorType> STRUCTURE_PROCESSOR = registerSimple("structure_processor", () ->
    {
        return IStructureProcessorType.BLOCK_IGNORE;
    });
    public static final Registry<IJigsawDeserializer> STRUCTURE_POOL_ELEMENT = registerSimple("structure_pool_element", () ->
    {
        return IJigsawDeserializer.EMPTY_POOL_ELEMENT;
    });
    public static final Registry < ContainerType<? >> MENU = registerSimple("menu", () ->
    {
        return ContainerType.ANVIL;
    });
    public static final Registry < IRecipeType<? >> RECIPE_TYPE = registerSimple("recipe_type", () ->
    {
        return IRecipeType.CRAFTING;
    });
    public static final Registry < IRecipeSerializer<? >> RECIPE_SERIALIZER = registerSimple("recipe_serializer", () ->
    {
        return IRecipeSerializer.CRAFTING_SHAPELESS;
    });
    public static final Registry < StatType<? >> STATS = registerSimple("stat_type", () ->
    {
        return Stats.ITEM_USED;
    });
    public static final DefaultedRegistry<IVillagerType> VILLAGER_TYPE = registerDefaulted("villager_type", "plains", () ->
    {
        return IVillagerType.PLAINS;
    });
    public static final DefaultedRegistry<VillagerProfession> VILLAGER_PROFESSION = registerDefaulted("villager_profession", "none", () ->
    {
        return VillagerProfession.NONE;
    });
    public static final DefaultedRegistry<PointOfInterestType> POINT_OF_INTEREST_TYPE = registerDefaulted("point_of_interest_type", "unemployed", () ->
    {
        return PointOfInterestType.UNEMPLOYED;
    });
    public static final DefaultedRegistry < MemoryModuleType<? >> MEMORY_MODULE_TYPE = registerDefaulted("memory_module_type", "dummy", () ->
    {
        return MemoryModuleType.DUMMY;
    });
    public static final DefaultedRegistry < SensorType<? >> SENSOR_TYPE = registerDefaulted("sensor_type", "dummy", () ->
    {
        return SensorType.DUMMY;
    });
    public static final Registry<Schedule> SCHEDULE = registerSimple("schedule", () ->
    {
        return Schedule.EMPTY;
    });
    public static final Registry<Activity> ACTIVITY = registerSimple("activity", () ->
    {
        return Activity.IDLE;
    });

    private static <T> Registry<T> registerSimple(String p_222935_0_, Supplier<T> p_222935_1_)
    {
        return register(p_222935_0_, new SimpleRegistry<>(), p_222935_1_);
    }

    private static <T> DefaultedRegistry<T> registerDefaulted(String p_222933_0_, String p_222933_1_, Supplier<T> p_222933_2_)
    {
        return register(p_222933_0_, new DefaultedRegistry<>(p_222933_1_), p_222933_2_);
    }

    private static <T, R extends MutableRegistry<T>> R register(String p_222939_0_, R p_222939_1_, Supplier<T> p_222939_2_)
    {
        ResourceLocation resourcelocation = new ResourceLocation(p_222939_0_);
        LOCATION_TO_SUPPLIER.put(resourcelocation, p_222939_2_);
        return (R)(REGISTRY.register(resourcelocation, p_222939_1_));
    }

    @Nullable
    public abstract ResourceLocation getKey(T value);

    public abstract int getId(@Nullable T value);

    @Nullable
    public abstract T getOrDefault(@Nullable ResourceLocation name);

    public abstract Optional<T> getValue(@Nullable ResourceLocation key);

    public abstract Set<ResourceLocation> keySet();

    @Nullable
    public abstract T getRandom(Random random);

    public Stream<T> stream()
    {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public abstract boolean containsKey(ResourceLocation name);

    public static <T> T register(Registry <? super T > p_218325_0_, String p_218325_1_, T p_218325_2_)
    {
        return register(p_218325_0_, new ResourceLocation(p_218325_1_), p_218325_2_);
    }

    public static <T> T register(Registry <? super T > p_218322_0_, ResourceLocation p_218322_1_, T p_218322_2_)
    {
        return ((MutableRegistry<T>)p_218322_0_).register(p_218322_1_, p_218322_2_);
    }

    public static <T> T register(Registry <? super T > p_218343_0_, int p_218343_1_, String p_218343_2_, T p_218343_3_)
    {
        return ((MutableRegistry<T>)p_218343_0_).register(p_218343_1_, new ResourceLocation(p_218343_2_), p_218343_3_);
    }

    static
    {
        LOCATION_TO_SUPPLIER.entrySet().forEach((p_229397_0_) ->
        {
            if (p_229397_0_.getValue().get() == null)
            {
                LOGGER.error("Unable to bootstrap registry '{}'", p_229397_0_.getKey());
            }
        });
        REGISTRY.forEach((p_229396_0_) ->
        {
            if (p_229396_0_.isEmpty())
            {
                LOGGER.error("Registry '{}' was empty after loading", (Object)REGISTRY.getKey(p_229396_0_));

                if (SharedConstants.developmentMode)
                {
                    throw new IllegalStateException("Registry: '" + REGISTRY.getKey(p_229396_0_) + "' is empty, not allowed, fix me!");
                }
            }

            if (p_229396_0_ instanceof DefaultedRegistry)
            {
                ResourceLocation resourcelocation = ((DefaultedRegistry)p_229396_0_).getDefaultKey();
                Validate.notNull(p_229396_0_.getOrDefault(resourcelocation), "Missing default of DefaultedMappedRegistry: " + resourcelocation);
            }
        });
    }
}
