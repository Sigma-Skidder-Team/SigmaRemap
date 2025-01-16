// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.IBlockReader;

import java.util.List;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Class6110
{
    private static boolean field24785;
    private static boolean field24786;
    private static boolean field24787;
    private static boolean field24788;
    private static boolean field24789;
    private static boolean field24790;
    private static boolean field24791;
    private static boolean field24792;
    private static TextureAtlasSprite field24793;
    private static TextureAtlasSprite field24794;
    private static TextureAtlasSprite field24795;
    private static TextureAtlasSprite field24796;
    private static TextureAtlasSprite field24797;
    private static TextureAtlasSprite field24798;
    private static TextureAtlasSprite field24799;
    private static boolean field24800;
    private static Class6313 field24801;
    private static Class6313 field24802;
    private static Class6313 field24803;
    private static Class6313 field24804;
    private static Class6313 field24805;
    private static Class6313 field24806;
    private static boolean field24807;
    private static final String field24808 = "block/grass_block_top";
    private static final String field24809 = "block/grass_block_side";
    private static final String field24810 = "block/grass_path_top";
    private static final String field24811 = "block/grass_path_side";
    private static final String field24812 = "block/mycelium_top";
    private static final String field24813 = "block/podzol_top";
    private static final String field24814 = "block/snow";
    private static final Random field24815;
    
    public static void method18254(final Class1774 class1774) {
        Class6110.field24800 = false;
        Class6110.field24807 = false;
        method18256(class1774);
    }
    
    public static void method18255() {
        if (Class6110.field24800) {
            Class6110.field24801 = Class6778.method20686(Class6110.field24793, 0);
            if (Class6110.field24792) {
                Class6110.field24801 = Class6778.method20687(Class6778.method20686(Class6110.field24794, -1), Class6110.field24801);
            }
            Class6110.field24802 = Class6778.method20690("grass_path", Class6110.field24796, Class6110.field24795);
            Class6110.field24803 = Class6778.method20686(Class6110.field24795, -1);
            Class6110.field24804 = Class6778.method20686(Class6110.field24797, -1);
            Class6110.field24805 = Class6778.method20686(Class6110.field24798, 0);
            Class6110.field24806 = Class6778.method20686(Class6110.field24799, -1);
            Class6110.field24807 = true;
        }
    }
    
    private static void method18256(final Class1774 class1774) {
        Class6110.field24785 = true;
        Class6110.field24786 = true;
        Class6110.field24787 = true;
        Class6110.field24788 = true;
        Class6110.field24789 = true;
        Class6110.field24790 = true;
        Class6110.field24791 = true;
        Class6110.field24793 = class1774.method6359(new ResourceLocation("block/grass_block_top"));
        Class6110.field24794 = class1774.method6359(new ResourceLocation("block/grass_block_side"));
        Class6110.field24795 = class1774.method6359(new ResourceLocation("block/grass_path_top"));
        Class6110.field24796 = class1774.method6359(new ResourceLocation("block/grass_path_side"));
        Class6110.field24797 = class1774.method6359(new ResourceLocation("block/mycelium_top"));
        Class6110.field24798 = class1774.method6359(new ResourceLocation("block/podzol_top"));
        Class6110.field24799 = class1774.method6359(new ResourceLocation("block/snow"));
        Class6110.field24800 = true;
        final String str = "optifine/bettergrass.properties";
        try {
            final ResourceLocation class1775 = new ResourceLocation(str);
            if (!Config.method28900(class1775)) {
                return;
            }
            final InputStream method28897 = Config.method28897(class1775);
            if (method28897 == null) {
                return;
            }
            if (Config.method28906(class1775)) {
                Config.method28847("BetterGrass: Parsing default configuration " + str);
            }
            else {
                Config.method28847("BetterGrass: Parsing configuration " + str);
            }
            final Class27 class1776 = new Class27();
            class1776.load(method28897);
            Class6110.field24785 = method18267(class1776, "grass", true);
            Class6110.field24786 = method18267(class1776, "grass_path", true);
            Class6110.field24787 = method18267(class1776, "mycelium", true);
            Class6110.field24788 = method18267(class1776, "podzol", true);
            Class6110.field24789 = method18267(class1776, "grass.snow", true);
            Class6110.field24790 = method18267(class1776, "mycelium.snow", true);
            Class6110.field24791 = method18267(class1776, "podzol.snow", true);
            Class6110.field24792 = method18267(class1776, "grass.multilayer", false);
            Class6110.field24793 = method18259(class1776, "texture.grass", "block/grass_block_top", class1774);
            Class6110.field24794 = method18259(class1776, "texture.grass_side", "block/grass_block_side", class1774);
            Class6110.field24795 = method18259(class1776, "texture.grass_path", "block/grass_path_top", class1774);
            Class6110.field24796 = method18259(class1776, "texture.grass_path_side", "block/grass_path_side", class1774);
            Class6110.field24797 = method18259(class1776, "texture.mycelium", "block/mycelium_top", class1774);
            Class6110.field24798 = method18259(class1776, "texture.podzol", "block/podzol_top", class1774);
            Class6110.field24799 = method18259(class1776, "texture.snow", "block/snow", class1774);
        }
        catch (final IOException ex) {
            Config.warn("Error reading: " + str + ", " + ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
    
    public static void method18257(final Class1774 class1774) {
        Class6110.field24793 = method18258(class1774, Class6110.field24793.method7503());
        Class6110.field24794 = method18258(class1774, Class6110.field24794.method7503());
        Class6110.field24795 = method18258(class1774, Class6110.field24795.method7503());
        Class6110.field24796 = method18258(class1774, Class6110.field24796.method7503());
        Class6110.field24797 = method18258(class1774, Class6110.field24797.method7503());
        Class6110.field24798 = method18258(class1774, Class6110.field24798.method7503());
        Class6110.field24799 = method18258(class1774, Class6110.field24799.method7503());
    }
    
    private static TextureAtlasSprite method18258(final Class1774 class1774, final ResourceLocation obj) {
        final TextureAtlasSprite method6338 = class1774.method6338(obj);
        if (method6338 == null || method6338 instanceof Class1913) {
            Config.warn("Missing BetterGrass sprite: " + obj);
        }
        return method6338;
    }
    
    private static TextureAtlasSprite method18259(final Properties properties, final String key, final String s, final Class1774 class1774) {
        String property = properties.getProperty(key);
        if (property == null) {
            property = s;
        }
        final ResourceLocation obj = new ResourceLocation("textures/" + property + ".png");
        if (!Config.method28900(obj)) {
            Config.warn("BetterGrass texture not found: " + obj);
            property = s;
        }
        return class1774.method6359(new ResourceLocation(property));
    }
    
    public static List method18260(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        if (class1858 == Direction.UP || class1858 == Direction.DOWN) {
            return list;
        }
        if (!Class6110.field24807) {
            return list;
        }
        final Block method21696 = class1856.getBlock();
        if (method21696 instanceof Class3912) {
            return method18261(class1855, class1856, class1857, class1858, list);
        }
        if (method21696 instanceof Class3971) {
            return method18262(class1855, class1856, class1857, class1858, list);
        }
        if (method21696 == Class7521.field29158) {
            return method18263(class1855, class1856, class1857, class1858, list);
        }
        if (method21696 != Class7521.field29156) {
            return (method21696 instanceof Class3909) ? method18265(class1855, class1856, class1857, class1858, list) : list;
        }
        return method18264(class1855, class1856, class1857, class1858, list);
    }
    
    private static List method18261(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        final Block method21696 = class1855.getBlockState(class1857.method1137()).getBlock();
        final boolean b = method21696 == Class7521.field29331 || method21696 == Class7521.field29329;
        if (!Config.method28911()) {
            if (!b) {
                if (Class6110.field24787) {
                    return Class6110.field24804.method18691(class1856, class1858, Class6110.field24815);
                }
            }
            else if (Class6110.field24790) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        else if (!b) {
            if (Class6110.field24787) {
                if (method18266(class1857.method1139(), class1858, class1855) == Class7521.field29392) {
                    return Class6110.field24804.method18691(class1856, class1858, Class6110.field24815);
                }
            }
        }
        else if (Class6110.field24790) {
            if (method18266(class1857, class1858, class1855) == Class7521.field29329) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        return list;
    }
    
    private static List method18262(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        if (!Class6110.field24786) {
            return list;
        }
        if (!Config.method28911()) {
            return Class6110.field24802.method18691(class1856, class1858, Class6110.field24815);
        }
        return (method18266(class1857.method1139(), class1858, class1855) != Class7521.field29637) ? list : Class6110.field24802.method18691(class1856, class1858, Class6110.field24815);
    }
    
    private static List method18263(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        final Block method18266 = method18266(class1857, Direction.UP, class1855);
        final boolean b = method18266 == Class7521.field29331 || method18266 == Class7521.field29329;
        if (!Config.method28911()) {
            if (!b) {
                if (Class6110.field24788) {
                    return Class6110.field24805.method18691(class1856, class1858, Class6110.field24815);
                }
            }
            else if (Class6110.field24791) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        else if (!b) {
            if (Class6110.field24788) {
                if (class1855.getBlockState(class1857.method1139().method1149(class1858)).getBlock() == Class7521.field29158) {
                    return Class6110.field24805.method18691(class1856, class1858, Class6110.field24815);
                }
            }
        }
        else if (Class6110.field24791) {
            if (method18266(class1857, class1858, class1855) == Class7521.field29329) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        return list;
    }
    
    private static List method18264(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        if (method18266(class1857, Direction.UP, class1855) == Class7521.field29637) {
            if (Class6110.field24786) {
                if (method18266(class1857, class1858, class1855) == Class7521.field29637) {
                    return Class6110.field24803.method18691(class1856, class1858, Class6110.field24815);
                }
            }
        }
        return list;
    }
    
    private static List method18265(final IBlockReader class1855, final BlockState class1856, final BlockPos class1857, final Direction class1858, final List list) {
        final Block method21696 = class1855.getBlockState(class1857.method1137()).getBlock();
        final boolean b = method21696 == Class7521.field29331 || method21696 == Class7521.field29329;
        if (!Config.method28911()) {
            if (!b) {
                if (Class6110.field24785) {
                    return Class6110.field24801.method18691(class1856, class1858, Class6110.field24815);
                }
            }
            else if (Class6110.field24789) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        else if (!b) {
            if (Class6110.field24785) {
                if (method18266(class1857.method1139(), class1858, class1855) == Class7521.field29155) {
                    return Class6110.field24801.method18691(class1856, class1858, Class6110.field24815);
                }
            }
        }
        else if (Class6110.field24789) {
            if (method18266(class1857, class1858, class1855) == Class7521.field29329) {
                return Class6110.field24806.method18691(class1856, class1858, Class6110.field24815);
            }
        }
        return list;
    }
    
    private static Block method18266(final BlockPos class354, final Direction class355, final IBlockReader class356) {
        return class356.getBlockState(class354.method1149(class355)).getBlock();
    }
    
    private static boolean method18267(final Properties properties, final String key, final boolean b) {
        final String property = properties.getProperty(key);
        return (property != null) ? Boolean.parseBoolean(property) : b;
    }
    
    static {
        Class6110.field24785 = true;
        Class6110.field24786 = true;
        Class6110.field24787 = true;
        Class6110.field24788 = true;
        Class6110.field24789 = true;
        Class6110.field24790 = true;
        Class6110.field24791 = true;
        Class6110.field24792 = false;
        Class6110.field24793 = null;
        Class6110.field24794 = null;
        Class6110.field24795 = null;
        Class6110.field24796 = null;
        Class6110.field24797 = null;
        Class6110.field24798 = null;
        Class6110.field24799 = null;
        Class6110.field24800 = false;
        Class6110.field24801 = null;
        Class6110.field24802 = null;
        Class6110.field24803 = null;
        Class6110.field24804 = null;
        Class6110.field24805 = null;
        Class6110.field24806 = null;
        Class6110.field24807 = false;
        field24815 = new Random(0L);
    }
}
