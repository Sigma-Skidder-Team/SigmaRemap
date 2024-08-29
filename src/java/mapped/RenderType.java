package mapped;

import com.google.common.collect.ImmutableList;

import java.util.*;
import java.util.function.Supplier;

public abstract class RenderType extends Class4510 {
   private static final RenderType field21794 = method14347(
      "solid",
      DefaultVertexFormats.field43334,
      7,
      2097152,
      true,
      false,
      Class9484.method36614().method31361(field21748).method31365(field21756).method31358(field21749).method31373(true)
   );
   private static final RenderType field21795 = method14347(
      "cutout_mipped",
      DefaultVertexFormats.field43334,
      7,
      131072,
      true,
      false,
      Class9484.method36614().method31361(field21748).method31365(field21756).method31358(field21749).method31362(field21746).method31373(true)
   );
   private static final RenderType field21796 = method14347(
      "cutout",
      DefaultVertexFormats.field43334,
      7,
      131072,
      true,
      false,
      Class9484.method36614().method31361(field21748).method31365(field21756).method31358(field21750).method31362(field21746).method31373(true)
   );
   private static final RenderType field21797 = method14347("translucent", DefaultVertexFormats.field43334, 7, 262144, true, true, method14303());
   private static final RenderType field21798 = method14347("translucent_moving_block", DefaultVertexFormats.field43334, 7, 262144, false, true, method14305());
   private static final RenderType field21799 = method14347("translucent_no_crumbling", DefaultVertexFormats.field43334, 7, 262144, false, true, method14303());
   private static final RenderType field21800 = method14346(
      "leash", DefaultVertexFormats.field43343, 7, 256, Class9484.method36614().method31358(field21751).method31364(field21763).method31365(field21756).method31373(false)
   );
   private static final RenderType field21801 = method14346(
      "water_mask", DefaultVertexFormats.field43341, 7, 256, Class9484.method36614().method31358(field21751).method31371(field21769).method31373(false)
   );
   private static final RenderType field21802 = method14346(
      "armor_glint",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21754)
         .method31368(field21772)
         .method31373(false)
   );
   private static final RenderType field21803 = method14346(
      "armor_entity_glint",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21755)
         .method31368(field21772)
         .method31373(false)
   );
   private static final RenderType field21804 = method14346(
      "glint_translucent",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21754)
         .method31369(field21782)
         .method31373(false)
   );
   private static final RenderType field21805 = method14346(
      "glint",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21754)
         .method31373(false)
   );
   private static final RenderType field21806 = method14346(
      "glint_direct",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21754)
         .method31373(false)
   );
   private static final RenderType field21807 = method14346(
      "entity_glint",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31369(field21782)
         .method31370(field21755)
         .method31373(false)
   );
   private static final RenderType field21808 = method14346(
      "entity_glint_direct",
      DefaultVertexFormats.field43344,
      7,
      256,
      Class9484.method36614()
         .method31358(new Class4518(ItemRenderer.field845, true, false))
         .method31371(field21768)
         .method31364(field21763)
         .method31363(field21765)
         .method31359(field21740)
         .method31370(field21755)
         .method31373(false)
   );
   private static final RenderType field21809 = method14347(
      "lightning",
      DefaultVertexFormats.POSITION_COLOR,
      7,
      256,
      false,
      true,
      Class9484.method36614().method31371(field21767).method31359(field21739).method31369(field21780).method31361(field21748).method31373(false)
   );
   private static final RenderType field21810 = method14347("tripwire", DefaultVertexFormats.field43334, 7, 262144, true, true, method14342());
   public static final Class4521 field21811 = method14346(
      "lines",
      DefaultVertexFormats.POSITION_COLOR,
      1,
      256,
      Class9484.method36614()
         .method31372(new Class4516(OptionalDouble.empty()))
         .method31368(field21772)
         .method31359(field21742)
         .method31369(field21782)
         .method31371(field21767)
         .method31373(false)
   );
   private final Class7831 field21812;
   private final int field21813;
   private final int field21814;
   private final boolean field21815;
   private final boolean field21816;
   private final Optional<RenderType> field21817;
   private int field21818 = -1;
   public static final RenderType[] field21819 = method14299();
   private static Map<Class9098, RenderType> field21820;

   public int method14297() {
      return this.field21818;
   }

   public boolean method14298() {
      return this.field21816;
   }

   private static RenderType[] method14299() {
      RenderType[] var2 = method14349().<RenderType>toArray(new RenderType[0]);
      int var3 = 0;

      while (var3 < var2.length) {
         RenderType var4 = var2[var3];
         var4.field21818 = var3++;
      }

      return var2;
   }

   public static RenderType method14300() {
      return field21794;
   }

   public static RenderType method14301() {
      return field21795;
   }

   public static RenderType method14302() {
      return field21796;
   }

   private static Class9484 method14303() {
      return Class9484.method36614()
         .method31361(field21748)
         .method31365(field21756)
         .method31358(field21749)
         .method31359(field21742)
         .method31369(field21778)
         .method31373(true);
   }

   public static RenderType method14304() {
      return field21797;
   }

   private static Class9484 method14305() {
      return Class9484.method36614()
         .method31361(field21748)
         .method31365(field21756)
         .method31358(field21749)
         .method31359(field21742)
         .method31369(field21782)
         .method31373(true);
   }

   public static RenderType method14306() {
      return field21798;
   }

   public static RenderType method14307() {
      return field21799;
   }

   public static RenderType method14308(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "armor_cutout_no_cull",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21737)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31368(field21772)
               .method31373(true);
            return method14347("armor_cutout_no_cull", DefaultVertexFormats.field43335, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderType getEntitySolid(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_solid",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21737)
               .method31360(field21760)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(true);
            return method14347("entity_solid", DefaultVertexFormats.field43335, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderType getEntityCutout(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_cutout",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21737)
               .method31360(field21760)
               .method31362(field21744)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(true);
            return method14347("entity_cutout", DefaultVertexFormats.field43335, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderType method14311(ResourceLocation var0, boolean var1) {
      ResourceLocation var4 = method14363(var0);
      return method14358(
         "entity_cutout_no_cull",
         var0,
         var1,
         () -> {
            Class9484 var4x = Class9484.method36614()
               .method31358(new Class4518(var4, false, false))
               .method31359(field21737)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(var1);
            return method14347("entity_cutout_no_cull", DefaultVertexFormats.field43335, 7, 256, true, false, var4x);
         }
      );
   }

   public static RenderType getEntityCutoutNoCull(ResourceLocation var0) {
      return method14311(var0, true);
   }

   public static RenderType method14313(ResourceLocation var0, boolean var1) {
      ResourceLocation var4 = method14363(var0);
      return method14358(
         "entity_cutout_no_cull_z_offset",
         var0,
         var1,
         () -> {
            Class9484 var4x = Class9484.method36614()
               .method31358(new Class4518(var4, false, false))
               .method31359(field21737)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31368(field21772)
               .method31373(var1);
            return method14347("entity_cutout_no_cull_z_offset", DefaultVertexFormats.field43335, 7, 256, true, false, var4x);
         }
      );
   }

   public static RenderType method14314(ResourceLocation var0) {
      return method14313(var0, true);
   }

   public static RenderType method14315(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "item_entity_translucent_cull",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21742)
               .method31369(field21782)
               .method31360(field21760)
               .method31362(field21744)
               .method31365(field21756)
               .method31366(field21758)
               .method31371(Class4510.field21767)
               .method31373(true);
            return method14347("item_entity_translucent_cull", DefaultVertexFormats.field43335, 7, 256, true, true, var3x);
         }
      );
   }

   public static RenderType method14316(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_translucent_cull",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21742)
               .method31360(field21760)
               .method31362(field21744)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(true);
            return method14347("entity_translucent_cull", DefaultVertexFormats.field43335, 7, 256, true, true, var3x);
         }
      );
   }

   public static RenderType method14317(ResourceLocation var0, boolean var1) {
      ResourceLocation var4 = method14363(var0);
      return method14358(
         "entity_translucent",
         var0,
         var1,
         () -> {
            Class9484 var4x = Class9484.method36614()
               .method31358(new Class4518(var4, false, false))
               .method31359(field21742)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(var1);
            return method14347("entity_translucent", DefaultVertexFormats.field43335, 7, 256, true, true, var4x);
         }
      );
   }

   public static RenderType method14318(ResourceLocation var0) {
      return method14317(var0, true);
   }

   public static RenderType getEntitySmoothCutout(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_smooth_cutout",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31362(field21745)
               .method31360(field21760)
               .method31361(field21748)
               .method31364(field21763)
               .method31365(field21756)
               .method31373(true);
            return method14346("entity_smooth_cutout", DefaultVertexFormats.field43335, 7, 256, var3x);
         }
      );
   }

   public static RenderType method14320(ResourceLocation var0, boolean var1) {
      ResourceLocation var4 = method14363(var0);
      return method14358(
         "beacon_beam",
         var0,
         var1,
         () -> {
            Class9484 var4x = Class9484.method36614()
               .method31358(new Class4518(var4, false, false))
               .method31359(!var1 ? field21737 : field21742)
               .method31371(!var1 ? field21767 : field21768)
               .method31367(field21773)
               .method31373(false);
            return method14347("beacon_beam", DefaultVertexFormats.field43334, 7, 256, false, true, var4x);
         }
      );
   }

   public static RenderType method14321(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_decal",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31360(field21760)
               .method31362(field21744)
               .method31363(field21765)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31373(false);
            return method14346("entity_decal", DefaultVertexFormats.field43335, 7, 256, var3x);
         }
      );
   }

   public static RenderType method14322(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_no_outline",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21742)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21763)
               .method31365(field21756)
               .method31366(field21758)
               .method31371(field21768)
               .method31373(false);
            return method14347("entity_no_outline", DefaultVertexFormats.field43335, 7, 256, false, true, var3x);
         }
      );
   }

   public static RenderType method14323(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "entity_shadow",
         var0,
         () -> {
            Class9484 var3x = Class9484.method36614()
               .method31358(new Class4518(var3, false, false))
               .method31359(field21742)
               .method31360(field21760)
               .method31362(field21744)
               .method31364(field21762)
               .method31365(field21756)
               .method31366(field21758)
               .method31371(field21768)
               .method31363(field21766)
               .method31368(field21772)
               .method31373(false);
            return method14347("entity_shadow", DefaultVertexFormats.field43335, 7, 256, false, false, var3x);
         }
      );
   }

   public static RenderType method14324(ResourceLocation var0, float var1) {
      ResourceLocation var4 = method14363(var0);
      return method14359(
         "entity_alpha",
         var0,
         var1,
         () -> {
            Class9484 var4x = Class9484.method36614()
               .method31358(new Class4518(var4, false, false))
               .method31362(new Class4511(var1))
               .method31364(field21763)
               .method31373(true);
            return method14346("entity_alpha", DefaultVertexFormats.field43335, 7, 256, var4x);
         }
      );
   }

   public static RenderType method14325(ResourceLocation var0) {
      ResourceLocation var3 = method14363(var0);
      return method14357(
         "eyes",
         var0,
         () -> {
            Class4518 var3x = new Class4518(var3, false, false);
            return method14347(
               "eyes",
               DefaultVertexFormats.field43335,
               7,
               256,
               false,
               true,
               Class9484.method36614().method31358(var3x).method31359(field21738).method31371(field21768).method31367(field21775).method31373(false)
            );
         }
      );
   }

   public static RenderType method14326(ResourceLocation var0, float var1, float var2) {
      ResourceLocation var5 = method14363(var0);
      return method14360(
         "energy_swirl",
         var0,
         var1,
         var2,
         () -> method14347(
               "energy_swirl",
               DefaultVertexFormats.field43335,
               7,
               256,
               false,
               true,
               Class9484.method36614()
                  .method31358(new Class4518(var5, false, false))
                  .method31370(new Class4515(var1, var2))
                  .method31367(field21775)
                  .method31359(field21738)
                  .method31360(field21760)
                  .method31362(field21744)
                  .method31364(field21763)
                  .method31365(field21756)
                  .method31366(field21758)
                  .method31373(false)
            )
      );
   }

   public static RenderType method14327() {
      return field21800;
   }

   public static RenderType method14328() {
      return field21801;
   }

   public static RenderType method14329(ResourceLocation var0) {
      return method14330(var0, field21763);
   }

   public static RenderType method14330(ResourceLocation var0, Class4507 var1) {
      return method14358(
         "outline",
         var0,
         var1 == field21762,
         () -> method14346(
               "outline",
               DefaultVertexFormats.field43345,
               7,
               256,
               Class9484.method36614()
                  .method31358(new Class4518(var0, false, false))
                  .method31364(var1)
                  .method31363(field21764)
                  .method31362(field21744)
                  .method31370(field21753)
                  .method31367(field21773)
                  .method31369(field21777)
                  .method31374(Class2041.field13341)
            )
      );
   }

   public static RenderType method14331() {
      return field21802;
   }

   public static RenderType method14332() {
      return field21803;
   }

   public static RenderType method14333() {
      return field21804;
   }

   public static RenderType method14334() {
      return field21805;
   }

   public static RenderType method14335() {
      return field21806;
   }

   public static RenderType method14336() {
      return field21807;
   }

   public static RenderType method14337() {
      return field21808;
   }

   public static RenderType method14338(ResourceLocation var0) {
      return method14357(
         "crumbling",
         var0,
         () -> {
            Class4518 var3 = new Class4518(var0, false, false);
            return method14347(
               "crumbling",
               DefaultVertexFormats.field43334,
               7,
               256,
               false,
               true,
               Class9484.method36614()
                  .method31358(var3)
                  .method31362(field21744)
                  .method31359(field21741)
                  .method31371(field21768)
                  .method31368(field21771)
                  .method31373(false)
            );
         }
      );
   }

   public static RenderType method14339(ResourceLocation var0) {
      return method14357(
         "text",
         var0,
         () -> method14347(
               "text",
               DefaultVertexFormats.field43347,
               7,
               256,
               false,
               false,
               Class9484.method36614()
                  .method31358(new Class4518(var0, false, false))
                  .method31362(field21744)
                  .method31359(field21742)
                  .method31365(field21756)
                  .method31373(false)
            )
      );
   }

   public static RenderType method14340(ResourceLocation var0) {
      return method14357(
         "text_see_through",
         var0,
         () -> method14347(
               "text_see_through",
               DefaultVertexFormats.field43347,
               7,
               256,
               false,
               false,
               Class9484.method36614()
                  .method31358(new Class4518(var0, false, false))
                  .method31362(field21744)
                  .method31359(field21742)
                  .method31365(field21756)
                  .method31363(field21764)
                  .method31371(field21768)
                  .method31373(false)
            )
      );
   }

   public static RenderType method14341() {
      return field21809;
   }

   private static Class9484 method14342() {
      return Class9484.method36614()
         .method31361(field21748)
         .method31365(field21756)
         .method31358(field21749)
         .method31359(field21742)
         .method31369(field21780)
         .method31373(true);
   }

   public static RenderType method14343() {
      return field21810;
   }

   public static RenderType method14344(int var0) {
      return method14361(
         "end_portal",
         var0,
         () -> {
            Class4525 var3;
            Class4518 var4;
            if (var0 > 1) {
               var3 = field21738;
               var4 = new Class4518(Class5957.field25979, false, false);
            } else {
               var3 = field21742;
               var4 = new Class4518(Class5957.field25978, false, false);
            }

            return method14347(
               "end_portal",
               DefaultVertexFormats.POSITION_COLOR,
               7,
               256,
               false,
               true,
               Class9484.method36614().method31359(var3).method31358(var4).method31370(new Class4514(var0)).method31367(field21775).method31373(false)
            );
         }
      );
   }

   public static RenderType method14345() {
      return field21811;
   }

   public RenderType(String var1, Class7831 var2, int var3, int var4, boolean var5, boolean var6, Runnable var7, Runnable var8) {
      super(var1, var7, var8);
      this.field21812 = var2;
      this.field21813 = var3;
      this.field21814 = var4;
      this.field21815 = var5;
      this.field21816 = var6;
      this.field21817 = Optional.<RenderType>of(this);
   }

   public static Class4521 method14346(String var0, Class7831 var1, int var2, int var3, Class9484 var4) {
      return method14347(var0, var1, var2, var3, false, false, var4);
   }

   public static Class4521 method14347(String var0, Class7831 var1, int var2, int var3, boolean var4, boolean var5, Class9484 var6) {
      return Class4521.method14394(var0, var1, var2, var3, var4, var5, var6);
   }

   public void method14348(BufferBuilder var1, int var2, int var3, int var4) {
      if (var1.method17074()) {
         if (this.field21816) {
            var1.method17058((float)var2, (float)var3, (float)var4);
         }

         if (var1.field24134 != null) {
            Class4501.method14216(var1.field24134);
         }

         var1.method17065();
         this.method14231();
         if (Class7944.method26921()) {
            Class8496.method30082(false);
            Shaders.method33117();
            Class5463.method17164(this, var1);
         }

         Class4395.method13895(var1);
         if (Class7944.method26921()) {
            Class5463.method17165(this, var1);
            Shaders.method33118();
            Class8496.method30082(true);
         }

         this.method14232();
      }
   }

   @Override
   public String toString() {
      return this.field21734;
   }

   public static List<RenderType> method14349() {
      return ImmutableList.of(method14300(), method14301(), method14302(), method14304(), method14343());
   }

   public int method14350() {
      return this.field21814;
   }

   public Class7831 method14351() {
      return this.field21812;
   }

   public int method14352() {
      return this.field21813;
   }

   public Optional<RenderType> method14353() {
      return Optional.<RenderType>empty();
   }

   public boolean method14354() {
      return false;
   }

   public boolean method14355() {
      return this.field21815;
   }

   public Optional<RenderType> method14356() {
      return this.field21817;
   }

   private static RenderType method14357(String var0, ResourceLocation var1, Supplier<RenderType> var2) {
      Class9098 var5 = new Class9098(var0, var1);
      return method14362(var5, var2);
   }

   private static RenderType method14358(String var0, ResourceLocation var1, boolean var2, Supplier<RenderType> var3) {
      Class9098 var6 = new Class9098(var0, var1, var2);
      return method14362(var6, var3);
   }

   private static RenderType method14359(String var0, ResourceLocation var1, float var2, Supplier<RenderType> var3) {
      Class9098 var6 = new Class9098(var0, var1, var2);
      return method14362(var6, var3);
   }

   private static RenderType method14360(String var0, ResourceLocation var1, float var2, float var3, Supplier<RenderType> var4) {
      Class9098 var7 = new Class9098(var0, var1, var2, var3);
      return method14362(var7, var4);
   }

   private static RenderType method14361(String var0, int var1, Supplier<RenderType> var2) {
      Class9098 var5 = new Class9098(var0, var1);
      return method14362(var5, var2);
   }

   private static RenderType method14362(Class9098 var0, Supplier<RenderType> var1) {
      if (field21820 == null) {
         field21820 = new HashMap<Class9098, RenderType>();
      }

      RenderType var4 = field21820.get(var0);
      if (var4 == null) {
         var4 = (RenderType)var1.get();
         field21820.put(var0, var4);
         return var4;
      } else {
         return var4;
      }
   }

   public static ResourceLocation method14363(ResourceLocation var0) {
      if (Class7944.method26907()) {
         var0 = Class9387.method35633(var0);
      }

      if (Class8564.method30588()) {
         var0 = Class8564.method30591(var0);
      }

      return var0;
   }

   public boolean method14364() {
      return this.method14234().equals("entity_solid");
   }

   public static int method14365() {
      return Class9484.method36616(Class4521.method14395(field21811)).size();
   }

   public ResourceLocation method14366() {
      return null;
   }

   public boolean method14367() {
      return this.method14366() == ItemRenderer.field845;
   }
}
