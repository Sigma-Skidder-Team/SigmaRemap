package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class8624 {
   public static final ResourceLocation field38766 = new ResourceLocation("textures/atlas/shulker_boxes.png");
   public static final ResourceLocation field38767 = new ResourceLocation("textures/atlas/beds.png");
   public static final ResourceLocation field38768 = new ResourceLocation("textures/atlas/banner_patterns.png");
   public static final ResourceLocation field38769 = new ResourceLocation("textures/atlas/shield_patterns.png");
   public static final ResourceLocation field38770 = new ResourceLocation("textures/atlas/signs.png");
   public static final ResourceLocation field38771 = new ResourceLocation("textures/atlas/chest.png");
   private static final RenderType field38772 = RenderType.getEntityCutoutNoCull(field38766);
   private static final RenderType field38773 = RenderType.getEntitySolid(field38767);
   private static final RenderType field38774 = RenderType.method14322(field38768);
   private static final RenderType field38775 = RenderType.method14322(field38769);
   private static final RenderType field38776 = RenderType.getEntityCutoutNoCull(field38770);
   private static final RenderType field38777 = RenderType.getEntityCutout(field38771);
   private static final RenderType field38778 = RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
   private static final RenderType field38779 = RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
   private static final RenderType field38780 = RenderType.method14315(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
   private static final RenderType field38781 = RenderType.method14316(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
   public static final Class7826 field38782 = new Class7826(field38766, new ResourceLocation("entity/shulker/shulker"));
   public static final List<Class7826> field38783 = Stream.<String>of(
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      )
      .<Class7826>map(var0 -> new Class7826(field38766, new ResourceLocation("entity/shulker/shulker_" + var0)))
      .collect(ImmutableList.toImmutableList());
   public static final Map<Class9673, Class7826> field38784 = Class9673.method37736()
      .collect(Collectors.toMap(Function.<Class9673>identity(), Class8624::method30911));
   public static final Class7826[] field38785 = Arrays.<Class112>stream(Class112.values())
      .sorted(Comparator.comparingInt(Class112::method309))
      .<Class7826>map(var0 -> new Class7826(field38767, new ResourceLocation("entity/bed/" + var0.method310())))
      .<Class7826>toArray(Class7826[]::new);
   public static final Class7826 field38786 = method30912("trapped");
   public static final Class7826 field38787 = method30912("trapped_left");
   public static final Class7826 field38788 = method30912("trapped_right");
   public static final Class7826 field38789 = method30912("christmas");
   public static final Class7826 field38790 = method30912("christmas_left");
   public static final Class7826 field38791 = method30912("christmas_right");
   public static final Class7826 field38792 = method30912("normal");
   public static final Class7826 field38793 = method30912("normal_left");
   public static final Class7826 field38794 = method30912("normal_right");
   public static final Class7826 field38795 = method30912("ender");

   public static RenderType method30900() {
      return field38774;
   }

   public static RenderType method30901() {
      return field38775;
   }

   public static RenderType method30902() {
      return field38773;
   }

   public static RenderType method30903() {
      return field38772;
   }

   public static RenderType method30904() {
      return field38776;
   }

   public static RenderType method30905() {
      return field38777;
   }

   public static RenderType method30906() {
      return field38778;
   }

   public static RenderType method30907() {
      return field38779;
   }

   public static RenderType method30908() {
      return field38780;
   }

   public static RenderType method30909() {
      return field38781;
   }

   public static void method30910(Consumer<Class7826> var0) {
      var0.accept(field38782);
      field38783.forEach(var0);

      for (Class2154 var6 : Class2154.values()) {
         var0.accept(new Class7826(field38768, var6.method8869(true)));
         var0.accept(new Class7826(field38769, var6.method8869(false)));
      }

      field38784.values().forEach(var0);

      for (Class7826 var10 : field38785) {
         var0.accept(var10);
      }

      var0.accept(field38786);
      var0.accept(field38787);
      var0.accept(field38788);
      var0.accept(field38789);
      var0.accept(field38790);
      var0.accept(field38791);
      var0.accept(field38792);
      var0.accept(field38793);
      var0.accept(field38794);
      var0.accept(field38795);
   }

   public static Class7826 method30911(Class9673 var0) {
      return new Class7826(field38770, new ResourceLocation("entity/signs/" + var0.method37737()));
   }

   private static Class7826 method30912(String var0) {
      return new Class7826(field38771, new ResourceLocation("entity/chest/" + var0));
   }

   public static Class7826 method30913(TileEntity var0, ChestType var1, boolean var2) {
      if (!var2) {
         if (!(var0 instanceof Class970)) {
            return !(var0 instanceof Class943) ? method30914(var1, field38792, field38793, field38794) : field38795;
         } else {
            return method30914(var1, field38786, field38787, field38788);
         }
      } else {
         return method30914(var1, field38789, field38790, field38791);
      }
   }

   private static Class7826 method30914(ChestType var0, Class7826 var1, Class7826 var2, Class7826 var3) {
      switch (Class9292.field42734[var0.ordinal()]) {
         case 1:
            return var2;
         case 2:
            return var3;
         case 3:
         default:
            return var1;
      }
   }
}
