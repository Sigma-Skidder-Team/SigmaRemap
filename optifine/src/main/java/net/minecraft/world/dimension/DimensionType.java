package net.minecraft.world.dimension;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.io.File;
import java.util.function.BiFunction;
import javax.annotation.Nullable;
import net.minecraft.util.IDynamicSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.ColumnFuzzedBiomeMagnifier;
import net.minecraft.world.biome.FuzzedBiomeMagnifier;
import net.minecraft.world.biome.IBiomeMagnifier;

public class DimensionType implements IDynamicSerializable
{
    public static final DimensionType OVERWORLD = register("overworld", new DimensionType(1, "", "", OverworldDimension::new, true, ColumnFuzzedBiomeMagnifier.INSTANCE));
    public static final DimensionType THE_NETHER = register("the_nether", new DimensionType(0, "_nether", "DIM-1", NetherDimension::new, false, FuzzedBiomeMagnifier.INSTANCE));
    public static final DimensionType THE_END = register("the_end", new DimensionType(2, "_end", "DIM1", EndDimension::new, false, FuzzedBiomeMagnifier.INSTANCE));
    private final int id;
    private final String suffix;
    private final String directory;
    private final BiFunction < World, DimensionType, ? extends Dimension > factory;
    private final boolean hasSkyLight;
    private final IBiomeMagnifier magnifier;

    private static DimensionType register(String key, DimensionType type)
    {
        return Registry.register(Registry.DIMENSION_TYPE, type.id, key, type);
    }

    protected DimensionType(int p_i1114_1_, String p_i1114_2_, String p_i1114_3_, BiFunction < World, DimensionType, ? extends Dimension > p_i1114_4_, boolean p_i1114_5_, IBiomeMagnifier p_i1114_6_)
    {
        this.id = p_i1114_1_;
        this.suffix = p_i1114_2_;
        this.directory = p_i1114_3_;
        this.factory = p_i1114_4_;
        this.hasSkyLight = p_i1114_5_;
        this.magnifier = p_i1114_6_;
    }

    public static DimensionType deserialize(Dynamic<?> p_218271_0_)
    {
        return Registry.DIMENSION_TYPE.getOrDefault(new ResourceLocation(p_218271_0_.asString("")));
    }

    public static Iterable<DimensionType> getAll()
    {
        return Registry.DIMENSION_TYPE;
    }

    public int getId()
    {
        return this.id + -1;
    }

    public String getSuffix()
    {
        return this.suffix;
    }

    public File getDirectory(File p_212679_1_)
    {
        return this.directory.isEmpty() ? p_212679_1_ : new File(p_212679_1_, this.directory);
    }

    public Dimension create(World worldIn)
    {
        return this.factory.apply(worldIn, this);
    }

    public String toString()
    {
        return getKey(this).toString();
    }

    @Nullable
    public static DimensionType getById(int id)
    {
        return Registry.DIMENSION_TYPE.getByValue(id - -1);
    }

    @Nullable
    public static DimensionType byName(ResourceLocation nameIn)
    {
        return Registry.DIMENSION_TYPE.getOrDefault(nameIn);
    }

    @Nullable
    public static ResourceLocation getKey(DimensionType dim)
    {
        return Registry.DIMENSION_TYPE.getKey(dim);
    }

    public boolean hasSkyLight()
    {
        return this.hasSkyLight;
    }

    public IBiomeMagnifier getMagnifier()
    {
        return this.magnifier;
    }

    public <T> T serialize(DynamicOps<T> p_218175_1_)
    {
        return p_218175_1_.createString(Registry.DIMENSION_TYPE.getKey(this).toString());
    }
}
