package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class class_5788<DC extends class_9793> {
   public static final class_5788<class_9504> field_29240 = method_26184("nope", new class_9368(class_9504.field_48400));
   public static final class_5788<class_3966> field_29252 = method_26184("chance", new class_5306(class_3966.field_19209));
   public static final class_5788<class_611> field_29253 = method_26184("count", new class_5961(class_611.field_3487));
   public static final class_5788<class_9302> field_29249 = method_26184("count_noise", new class_1649(class_9302.field_47520));
   public static final class_5788<class_209> field_29242 = method_26184("count_noise_biased", new class_6525(class_209.field_706));
   public static final class_5788<class_9865> field_29248 = method_26184("count_extra", new class_5471(class_9865.field_49915));
   public static final class_5788<class_9504> field_29234 = method_26184("square", new class_5045(class_9504.field_48400));
   public static final class_5788<class_9504> field_29229 = method_26184("heightmap", new class_9807<class_9504>(class_9504.field_48400));
   public static final class_5788<class_9504> field_29235 = method_26184("heightmap_spread_double", new class_2479<class_9504>(class_9504.field_48400));
   public static final class_5788<class_9504> field_29237 = method_26184("top_solid_heightmap", new class_6341(class_9504.field_48400));
   public static final class_5788<class_9504> field_29231 = method_26184("heightmap_world_surface", new class_2360(class_9504.field_48400));
   public static final class_5788<class_8458> field_29257 = method_26184("range", new class_1879(class_8458.field_43242));
   public static final class_5788<class_8458> field_29230 = method_26184("range_biased", new class_4175(class_8458.field_43242));
   public static final class_5788<class_8458> field_29247 = method_26184("range_very_biased", new class_6928(class_8458.field_43242));
   public static final class_5788<class_3891> field_29246 = method_26184("depth_average", new class_5374(class_3891.field_18933));
   public static final class_5788<class_9504> field_29228 = method_26184("spread_32_above", new class_2539(class_9504.field_48400));
   public static final class_5788<class_6686> field_29232 = method_26184("carving_mask", new class_555(class_6686.field_34549));
   public static final class_5788<class_611> field_29251 = method_26184("fire", new class_8323(class_611.field_3487));
   public static final class_5788<class_9504> field_29250 = method_26184("magma", new class_1354(class_9504.field_48400));
   public static final class_5788<class_9504> field_29238 = method_26184("emerald_ore", new class_1592(class_9504.field_48400));
   public static final class_5788<class_3966> field_29254 = method_26184("lava_lake", new class_1968(class_3966.field_19209));
   public static final class_5788<class_3966> field_29245 = method_26184("water_lake", new class_4194(class_3966.field_19209));
   public static final class_5788<class_611> field_29243 = method_26184("glowstone", new class_8479(class_611.field_3487));
   public static final class_5788<class_9504> field_29255 = method_26184("end_gateway", new class_4430(class_9504.field_48400));
   public static final class_5788<class_9504> field_29236 = method_26184("dark_oak_tree", new class_2004(class_9504.field_48400));
   public static final class_5788<class_9504> field_29233 = method_26184("iceberg", new class_4025(class_9504.field_48400));
   public static final class_5788<class_9504> field_29256 = method_26184("end_island", new class_8756(class_9504.field_48400));
   public static final class_5788<class_2692> field_29239 = method_26184("decorated", new class_655(class_2692.field_13176));
   public static final class_5788<class_611> field_29244 = method_26184("count_multilayer", new class_1018(class_611.field_3487));
   private final Codec<class_3010<DC>> field_29241;

   private static <T extends class_9793, G extends class_5788<T>> G method_26184(String var0, G var1) {
      return class_8669.<G>method_39791(class_8669.field_44449, var0, (G)var1);
   }

   public class_5788(Codec<DC> var1) {
      this.field_29241 = var1.fieldOf("config").xmap(var1x -> new class_3010<DC>(this, (DC)var1x), class_3010::method_13768).codec();
   }

   public class_3010<DC> method_26183(DC var1) {
      return new class_3010<DC>(this, (DC)var1);
   }

   public Codec<class_3010<DC>> method_26181() {
      return this.field_29241;
   }

   public abstract Stream<BlockPos> method_26185(class_6680 var1, Random var2, DC var3, BlockPos var4);

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
   }
}
