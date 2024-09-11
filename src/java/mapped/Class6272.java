package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

import java.util.Random;
import java.util.stream.Stream;

public abstract class Class6272<DC extends Class4716> {
   public static final Class6272<Class4718> field27752 = method19243("nope", new Class6277(Class4718.field22367));
   public static final Class6272<Class4722> field27753 = method19243("chance", new Class6286(Class4722.field22380));
   public static final Class6272<Class4715> field27754 = method19243("count", new Class6281(Class4715.field22359));
   public static final Class6272<Class4719> field27755 = method19243("count_noise", new Class6302(Class4719.field22369));
   public static final Class6272<Class4717> field27756 = method19243("count_noise_biased", new Class6275(Class4717.field22362));
   public static final Class6272<Class4721> field27757 = method19243("count_extra", new Class6283(Class4721.field22376));
   public static final Class6272<Class4718> field27758 = method19243("square", new Class6285(Class4718.field22367));
   public static final Class6272<Class4718> field27759 = method19243("heightmap", new Class6295<Class4718>(Class4718.field22367));
   public static final Class6272<Class4718> field27760 = method19243("heightmap_spread_double", new Class6296<Class4718>(Class4718.field22367));
   public static final Class6272<Class4718> field27761 = method19243("top_solid_heightmap", new Class6294(Class4718.field22367));
   public static final Class6272<Class4718> field27762 = method19243("heightmap_world_surface", new Class6293(Class4718.field22367));
   public static final Class6272<Class4725> field27763 = method19243("range", new Class6284(Class4725.field22388));
   public static final Class6272<Class4725> field27764 = method19243("range_biased", new Class6279(Class4725.field22388));
   public static final Class6272<Class4725> field27765 = method19243("range_very_biased", new Class6278(Class4725.field22388));
   public static final Class6272<Class4723> field27766 = method19243("depth_average", new Class6287(Class4723.field22382));
   public static final Class6272<Class4718> field27767 = method19243("spread_32_above", new Class6298(Class4718.field22367));
   public static final Class6272<Class4724> field27768 = method19243("carving_mask", new Class6271(Class4724.field22385));
   public static final Class6272<Class4715> field27769 = method19243("fire", new Class6274(Class4715.field22359));
   public static final Class6272<Class4718> field27770 = method19243("magma", new Class6289(Class4718.field22367));
   public static final Class6272<Class4718> field27771 = method19243("emerald_ore", new Class6288(Class4718.field22367));
   public static final Class6272<Class4722> field27772 = method19243("lava_lake", new Class6300(Class4722.field22380));
   public static final Class6272<Class4722> field27773 = method19243("water_lake", new Class6299(Class4722.field22380));
   public static final Class6272<Class4715> field27774 = method19243("glowstone", new Class6280(Class4715.field22359));
   public static final Class6272<Class4718> field27775 = method19243("end_gateway", new Class6303(Class4718.field22367));
   public static final Class6272<Class4718> field27776 = method19243("dark_oak_tree", new Class6297(Class4718.field22367));
   public static final Class6272<Class4718> field27777 = method19243("iceberg", new Class6276(Class4718.field22367));
   public static final Class6272<Class4718> field27778 = method19243("end_island", new Class6282(Class4718.field22367));
   public static final Class6272<Class4720> field27779 = method19243("decorated", new Class6301(Class4720.field22373));
   public static final Class6272<Class4715> field27780 = method19243("count_multilayer", new Class6290(Class4715.field22359));
   private final Codec<Class7907<DC>> field27781;

   private static <T extends Class4716, G extends Class6272<T>> G method19243(String var0, G var1) {
      return Registry.<G>method9194(Registry.field16118, var0, (G)var1);
   }

   public Class6272(Codec<DC> var1) {
      this.field27781 = var1.fieldOf("config").xmap(var1x -> new Class7907<DC>(this, (DC)var1x), Class7907::method26509).codec();
   }

   public Class7907<DC> method19244(DC var1) {
      return new Class7907<DC>(this, (DC)var1);
   }

   public Codec<Class7907<DC>> method19245() {
      return this.field27781;
   }

   public abstract Stream<BlockPos> method19240(Class9010 var1, Random var2, DC var3, BlockPos var4);

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
   }
}
