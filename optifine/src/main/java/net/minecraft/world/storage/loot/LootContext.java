package net.minecraft.world.storage.loot;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.loot.conditions.ILootCondition;

public class LootContext
{
    private final Random random;
    private final float luck;
    private final ServerWorld world;
    private final Function<ResourceLocation, LootTable> lootTableManager;
    private final Set<LootTable> lootTables = Sets.newLinkedHashSet();
    private final Function<ResourceLocation, ILootCondition> field_227499_f_;
    private final Set<ILootCondition> field_227500_g_ = Sets.newLinkedHashSet();
    private final Map < LootParameter<?>, Object > parameters;
    private final Map<ResourceLocation, LootContext.IDynamicDropProvider> field_216037_g;

    private LootContext(Random p_i1827_1_, float p_i1827_2_, ServerWorld p_i1827_3_, Function<ResourceLocation, LootTable> p_i1827_4_, Function<ResourceLocation, ILootCondition> p_i1827_5_, Map < LootParameter<?>, Object > p_i1827_6_, Map<ResourceLocation, LootContext.IDynamicDropProvider> p_i1827_7_)
    {
        this.random = p_i1827_1_;
        this.luck = p_i1827_2_;
        this.world = p_i1827_3_;
        this.lootTableManager = p_i1827_4_;
        this.field_227499_f_ = p_i1827_5_;
        this.parameters = ImmutableMap.copyOf(p_i1827_6_);
        this.field_216037_g = ImmutableMap.copyOf(p_i1827_7_);
    }

    public boolean has(LootParameter<?> parameter)
    {
        return this.parameters.containsKey(parameter);
    }

    public void generateDynamicDrop(ResourceLocation name, Consumer<ItemStack> consumer)
    {
        LootContext.IDynamicDropProvider lootcontext$idynamicdropprovider = this.field_216037_g.get(name);

        if (lootcontext$idynamicdropprovider != null)
        {
            lootcontext$idynamicdropprovider.add(this, consumer);
        }
    }

    @Nullable
    public <T> T get(LootParameter<T> parameter)
    {
        return (T)this.parameters.get(parameter);
    }

    public boolean addLootTable(LootTable lootTableIn)
    {
        return this.lootTables.add(lootTableIn);
    }

    public void removeLootTable(LootTable lootTableIn)
    {
        this.lootTables.remove(lootTableIn);
    }

    public boolean func_227501_a_(ILootCondition p_227501_1_)
    {
        return this.field_227500_g_.add(p_227501_1_);
    }

    public void func_227503_b_(ILootCondition p_227503_1_)
    {
        this.field_227500_g_.remove(p_227503_1_);
    }

    public LootTable func_227502_a_(ResourceLocation p_227502_1_)
    {
        return this.lootTableManager.apply(p_227502_1_);
    }

    public ILootCondition func_227504_b_(ResourceLocation p_227504_1_)
    {
        return this.field_227499_f_.apply(p_227504_1_);
    }

    public Random getRandom()
    {
        return this.random;
    }

    public float getLuck()
    {
        return this.luck;
    }

    public ServerWorld getWorld()
    {
        return this.world;
    }

    public static class Builder
    {
        private final ServerWorld world;
        private final Map < LootParameter<?>, Object > lootParameters = Maps.newIdentityHashMap();
        private final Map<ResourceLocation, LootContext.IDynamicDropProvider> field_216026_c = Maps.newHashMap();
        private Random rand;
        private float luck;

        public Builder(ServerWorld p_i3035_1_)
        {
            this.world = p_i3035_1_;
        }

        public LootContext.Builder withRandom(Random randomIn)
        {
            this.rand = randomIn;
            return this;
        }

        public LootContext.Builder withSeed(long seed)
        {
            if (seed != 0L)
            {
                this.rand = new Random(seed);
            }

            return this;
        }

        public LootContext.Builder withSeededRandom(long seed, Random p_216020_3_)
        {
            if (seed == 0L)
            {
                this.rand = p_216020_3_;
            }
            else
            {
                this.rand = new Random(seed);
            }

            return this;
        }

        public LootContext.Builder withLuck(float luckIn)
        {
            this.luck = luckIn;
            return this;
        }

        public <T> LootContext.Builder withParameter(LootParameter<T> parameter, T value)
        {
            this.lootParameters.put(parameter, value);
            return this;
        }

        public <T> LootContext.Builder withNullableParameter(LootParameter<T> parameter, @Nullable T value)
        {
            if (value == null)
            {
                this.lootParameters.remove(parameter);
            }
            else
            {
                this.lootParameters.put(parameter, value);
            }

            return this;
        }

        public LootContext.Builder withDynamicDrop(ResourceLocation p_216017_1_, LootContext.IDynamicDropProvider p_216017_2_)
        {
            LootContext.IDynamicDropProvider lootcontext$idynamicdropprovider = this.field_216026_c.put(p_216017_1_, p_216017_2_);

            if (lootcontext$idynamicdropprovider != null)
            {
                throw new IllegalStateException("Duplicated dynamic drop '" + this.field_216026_c + "'");
            }
            else
            {
                return this;
            }
        }

        public ServerWorld getWorld()
        {
            return this.world;
        }

        public <T> T assertPresent(LootParameter<T> parameter)
        {
            T t = (T)this.lootParameters.get(parameter);

            if (t == null)
            {
                throw new IllegalArgumentException("No parameter " + parameter);
            }
            else
            {
                return t;
            }
        }

        @Nullable
        public <T> T get(LootParameter<T> parameter)
        {
            return (T)this.lootParameters.get(parameter);
        }

        public LootContext build(LootParameterSet parameterSet)
        {
            Set < LootParameter<? >> set = Sets.difference(this.lootParameters.keySet(), parameterSet.getAllParameters());

            if (!set.isEmpty())
            {
                throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + set);
            }
            else
            {
                Set < LootParameter<? >> set1 = Sets.difference(parameterSet.getRequiredParameters(), this.lootParameters.keySet());

                if (!set1.isEmpty())
                {
                    throw new IllegalArgumentException("Missing required parameters: " + set1);
                }
                else
                {
                    Random random = this.rand;

                    if (random == null)
                    {
                        random = new Random();
                    }

                    MinecraftServer minecraftserver = this.world.getServer();
                    return new LootContext(random, this.luck, this.world, minecraftserver.getLootTableManager()::getLootTableFromLocation, minecraftserver.func_229736_aP_()::func_227517_a_, this.lootParameters, this.field_216026_c);
                }
            }
        }
    }

    public static enum EntityTarget
    {
        THIS("this", LootParameters.THIS_ENTITY),
        KILLER("killer", LootParameters.KILLER_ENTITY),
        DIRECT_KILLER("direct_killer", LootParameters.DIRECT_KILLER_ENTITY),
        KILLER_PLAYER("killer_player", LootParameters.LAST_DAMAGE_PLAYER);

        private final String targetType;
        private final LootParameter <? extends Entity > parameter;

        private EntityTarget(String p_i691_3_, LootParameter <? extends Entity > p_i691_4_)
        {
            this.targetType = p_i691_3_;
            this.parameter = p_i691_4_;
        }

        public LootParameter <? extends Entity > getParameter()
        {
            return this.parameter;
        }

        public static LootContext.EntityTarget fromString(String type)
        {
            for (LootContext.EntityTarget lootcontext$entitytarget : values())
            {
                if (lootcontext$entitytarget.targetType.equals(type))
                {
                    return lootcontext$entitytarget;
                }
            }

            throw new IllegalArgumentException("Invalid entity target " + type);
        }

        public static class Serializer extends TypeAdapter<LootContext.EntityTarget> {
            public void write(JsonWriter p_write_1_, LootContext.EntityTarget p_write_2_) throws IOException {
                p_write_1_.value(p_write_2_.targetType);
            }

            public LootContext.EntityTarget read(JsonReader p_read_1_) throws IOException {
                return LootContext.EntityTarget.fromString(p_read_1_.nextString());
            }
        }
    }

    @FunctionalInterface
    public interface IDynamicDropProvider
    {
        void add(LootContext p_add_1_, Consumer<ItemStack> p_add_2_);
    }
}
