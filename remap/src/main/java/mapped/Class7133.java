// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;

public abstract class Class7133<DC extends Class6926>
{
    public static final Class7133<Class6936> field27782;
    public static final Class7133<Class6927> field27783;
    public static final Class7133<Class6927> field27784;
    public static final Class7133<Class6927> field27785;
    public static final Class7133<Class6927> field27786;
    public static final Class7133<Class6927> field27787;
    public static final Class7133<Class6930> field27788;
    public static final Class7133<Class6930> field27789;
    public static final Class7133<Class6928> field27790;
    public static final Class7133<Class6928> field27791;
    public static final Class7133<Class6928> field27792;
    public static final Class7133<Class6928> field27793;
    public static final Class7133<Class6934> field27794;
    public static final Class7133<Class6937> field27795;
    public static final Class7133<Class6937> field27796;
    public static final Class7133<Class6937> field27797;
    public static final Class7133<Class6937> field27798;
    public static final Class7133<Class6925> field27799;
    public static final Class7133<Class6935> field27800;
    public static final Class7133<Class6935> field27801;
    public static final Class7133<Class6929> field27802;
    public static final Class7133<Class6936> field27803;
    public static final Class7133<Class6932> field27804;
    public static final Class7133<Class6931> field27805;
    public static final Class7133<Class6933> field27806;
    public static final Class7133<Class6927> field27807;
    public static final Class7133<Class6927> field27808;
    public static final Class7133<Class6927> field27809;
    public static final Class7133<Class6936> field27810;
    public static final Class7133<Class6928> field27811;
    public static final Class7133<Class6928> field27812;
    public static final Class7133<Class6928> field27813;
    public static final Class7133<Class6936> field27814;
    public static final Class7133<Class6928> field27815;
    public static final Class7133<Class6927> field27816;
    public static final Class7133<Class6936> field27817;
    public static final Class7133<Class6936> field27818;
    public static final Class7133<Class6936> field27819;
    private final Function<Dynamic<?>, ? extends DC> field27820;
    
    private static <T extends Class6926, G extends Class7133<T>> G method21887(final String s, final G g) {
        return Registry.register(Registry.field216, s, g);
    }
    
    public Class7133(final Function<Dynamic<?>, ? extends DC> field27820) {
        this.field27820 = field27820;
    }
    
    public DC method21888(final Dynamic<?> dynamic) {
        return (DC)this.field27820.apply(dynamic);
    }
    
    public Class9166<DC> method21889(final DC dc) {
        return new Class9166<DC>(this, dc);
    }
    
    public <FC extends Class5113, F extends Class4535<FC>> boolean method21890(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final DC dc, final Class8530<FC, F> class1854) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.method21885(class1851, class1852, random, dc, class1853).forEach(class1858 -> {
            class1855.method28613(class1856, class1857, random2, class1858);
            final boolean b;
            atomicBoolean2.set(atomicBoolean2.get() || b);
            return;
        });
        return atomicBoolean.get();
    }
    
    public abstract Stream<BlockPos> method21885(final Class1851 p0, final Class6346<? extends Class7065> p1, final Random p2, final DC p3, final BlockPos p4);
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
    
    static {
        field27782 = method21887("nope", new Class7146(Class6936::method21310));
        field27783 = method21887("count_heightmap", new Class7160(Class6927::method21301));
        field27784 = method21887("count_top_solid", new Class7152(Class6927::method21301));
        field27785 = method21887("count_heightmap_32", new Class7136(Class6927::method21301));
        field27786 = method21887("count_heightmap_double", new Class7132(Class6927::method21301));
        field27787 = method21887("count_height_64", new Class7156(Class6927::method21301));
        field27788 = method21887("noise_heightmap_32", new Class7158(Class6930::method21304));
        field27789 = method21887("noise_heightmap_double", new Class7165(Class6930::method21304));
        field27790 = method21887("chance_heightmap", new Class7137(Class6928::method21302));
        field27791 = method21887("chance_heightmap_double", new Class7161(Class6928::method21302));
        field27792 = method21887("chance_passthrough", new Class7140(Class6928::method21302));
        field27793 = method21887("chance_top_solid_heightmap", new Class7171(Class6928::method21302));
        field27794 = method21887("count_extra_heightmap", new Class7170(Class6934::method21308));
        field27795 = method21887("count_range", new Class7144(Class6937::method21311));
        field27796 = method21887("count_biased_range", new Class7145(Class6937::method21311));
        field27797 = method21887("count_very_biased_range", new Class7149(Class6937::method21311));
        field27798 = method21887("random_count_range", new Class7148(Class6937::method21311));
        field27799 = method21887("chance_range", new Class7150(Class6925::method21300));
        field27800 = method21887("count_chance_heightmap", new Class7155(Class6935::method21309));
        field27801 = method21887("count_chance_heightmap_double", new Class7135(Class6935::method21309));
        field27802 = method21887("count_depth_average", new Class7141(Class6929::method21303));
        field27803 = method21887("top_solid_heightmap", new Class7169(Class6936::method21310));
        field27804 = method21887("top_solid_heightmap_range", new Class7157(Class6932::method21306));
        field27805 = method21887("top_solid_heightmap_noise_biased", new Class7168(Class6931::method21305));
        field27806 = method21887("carving_mask", new Class7162(Class6933::method21307));
        field27807 = method21887("forest_rock", new Class7167(Class6927::method21301));
        field27808 = method21887("hell_fire", new Class7151(Class6927::method21301));
        field27809 = method21887("magma", new Class7164(Class6927::method21301));
        field27810 = method21887("emerald_ore", new Class7143(Class6936::method21310));
        field27811 = method21887("lava_lake", new Class7166(Class6928::method21302));
        field27812 = method21887("water_lake", new Class7153(Class6928::method21302));
        field27813 = method21887("dungeons", new Class7138(Class6928::method21302));
        field27814 = method21887("dark_oak_tree", new Class7163(Class6936::method21310));
        field27815 = method21887("iceberg", new Class7134(Class6928::method21302));
        field27816 = method21887("light_gem_chance", new Class7142(Class6927::method21301));
        field27817 = method21887("end_island", new Class7147(Class6936::method21310));
        field27818 = method21887("chorus_plant", new Class7154(Class6936::method21310));
        field27819 = method21887("end_gateway", new Class7159(Class6936::method21310));
    }
}
