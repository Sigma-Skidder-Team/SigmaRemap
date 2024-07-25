package remapped;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;

public abstract class RenderLayer extends class_5348 {
   private static final RenderLayer field_17571 = method_16761(
      "solid",
      class_7985.field_40918,
      7,
      2097152,
      true,
      false,
      class_8570.method_39411().method_25434(field_27297).method_25438(field_27280).method_25435(field_27324).method_25436(true)
   );
   private static final RenderLayer field_17560 = method_16761(
      "cutout_mipped",
      class_7985.field_40918,
      7,
      131072,
      true,
      false,
      class_8570.method_39411().method_25434(field_27297).method_25438(field_27280).method_25435(field_27324).method_25433(field_27316).method_25436(true)
   );
   private static final RenderLayer field_17561 = method_16761(
      "cutout",
      class_7985.field_40918,
      7,
      131072,
      true,
      false,
      class_8570.method_39411().method_25434(field_27297).method_25438(field_27280).method_25435(field_27315).method_25433(field_27316).method_25436(true)
   );
   private static final RenderLayer field_17562 = method_16761("translucent", class_7985.field_40918, 7, 262144, true, true, method_16759());
   private static final RenderLayer field_17565 = method_16761("translucent_moving_block", class_7985.field_40918, 7, 262144, false, true, method_16706());
   private static final RenderLayer field_17574 = method_16761("translucent_no_crumbling", class_7985.field_40918, 7, 262144, false, true, method_16759());
   private static final RenderLayer field_17563 = method_16760(
      "leash",
      class_7985.field_40908,
      7,
      256,
      class_8570.method_39411().method_25435(field_27302).method_25432(field_27319).method_25438(field_27280).method_25436(false)
   );
   private static final RenderLayer field_17570 = method_16760(
      "water_mask", class_7985.field_40915, 7, 256, class_8570.method_39411().method_25435(field_27302).method_25428(field_27286).method_25436(false)
   );
   private static final RenderLayer field_17564 = method_16760(
      "armor_glint",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27301)
         .method_25430(field_27293)
         .method_25436(false)
   );
   private static final RenderLayer field_17569 = method_16760(
      "armor_entity_glint",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27314)
         .method_25430(field_27293)
         .method_25436(false)
   );
   private static final RenderLayer field_17581 = method_16760(
      "glint_translucent",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27301)
         .method_25427(field_27317)
         .method_25436(false)
   );
   private static final RenderLayer field_17559 = method_16760(
      "glint",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27301)
         .method_25436(false)
   );
   private static final RenderLayer field_17575 = method_16760(
      "glint_direct",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27301)
         .method_25436(false)
   );
   private static final RenderLayer field_17556 = method_16760(
      "entity_glint",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25427(field_27317)
         .method_25440(field_27314)
         .method_25436(false)
   );
   private static final RenderLayer field_17568 = method_16760(
      "entity_glint_direct",
      class_7985.field_40912,
      7,
      256,
      class_8570.method_39411()
         .method_25435(new class_3771(ItemRenderer.field_44880, true, false))
         .method_25428(field_27303)
         .method_25432(field_27319)
         .method_25439(field_27289)
         .method_25431(field_27325)
         .method_25440(field_27314)
         .method_25436(false)
   );
   private static final RenderLayer field_17577 = method_16761(
      "lightning",
      class_7985.field_40903,
      7,
      256,
      false,
      true,
      class_8570.method_39411().method_25428(field_27327).method_25431(field_27288).method_25427(field_27313).method_25434(field_27297).method_25436(false)
   );
   private static final RenderLayer field_17582 = method_16761("tripwire", class_7985.field_40918, 7, 262144, true, true, method_16726());
   public static final class_7634 field_17558 = method_16760(
      "lines",
      class_7985.field_40903,
      1,
      256,
      class_8570.method_39411()
         .method_25443(new class_8315(OptionalDouble.empty()))
         .method_25430(field_27293)
         .method_25431(field_27308)
         .method_25427(field_27317)
         .method_25428(field_27327)
         .method_25436(false)
   );
   private final class_2868 field_17572;
   private final int field_17576;
   private final int field_17557;
   private final boolean field_17579;
   private final boolean field_17573;
   private final Optional<RenderLayer> field_17578;
   private int field_17567 = -1;
   public static final RenderLayer[] field_17580 = method_16708();
   private static Map<class_6998, RenderLayer> field_17566;

   public int method_16704() {
      return this.field_17567;
   }

   public boolean method_16710() {
      return this.field_17573;
   }

   private static RenderLayer[] method_16708() {
      RenderLayer[] var2 = method_16770().<RenderLayer>toArray(new RenderLayer[0]);
      int var3 = 0;

      while (var3 < var2.length) {
         RenderLayer var4 = var2[var3];
         var4.field_17567 = var3++;
      }

      return var2;
   }

   public static RenderLayer method_16751() {
      return field_17571;
   }

   public static RenderLayer method_16756() {
      return field_17560;
   }

   public static RenderLayer method_16771() {
      return field_17561;
   }

   private static class_8570 method_16759() {
      return class_8570.method_39411()
         .method_25434(field_27297)
         .method_25438(field_27280)
         .method_25435(field_27324)
         .method_25431(field_27308)
         .method_25427(field_27323)
         .method_25436(true);
   }

   public static RenderLayer method_16762() {
      return field_17562;
   }

   private static class_8570 method_16706() {
      return class_8570.method_39411()
         .method_25434(field_27297)
         .method_25438(field_27280)
         .method_25435(field_27324)
         .method_25431(field_27308)
         .method_25427(field_27317)
         .method_25436(true);
   }

   public static RenderLayer method_16746() {
      return field_17565;
   }

   public static RenderLayer method_16767() {
      return field_17574;
   }

   public static RenderLayer method_16749(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "armor_cutout_no_cull",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27320)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25430(field_27293)
               .method_25436(true);
            return method_16761("armor_cutout_no_cull", class_7985.field_40906, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderLayer method_16734(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_solid",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27320)
               .method_25437(field_27278)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(true);
            return method_16761("entity_solid", class_7985.field_40906, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderLayer method_16747(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_cutout",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27320)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(true);
            return method_16761("entity_cutout", class_7985.field_40906, 7, 256, true, false, var3x);
         }
      );
   }

   public static RenderLayer method_16737(Identifier var0, boolean var1) {
      Identifier var4 = method_16768(var0);
      return method_16724(
         "entity_cutout_no_cull",
         var0,
         var1,
         () -> {
            class_8570 var4x = class_8570.method_39411()
               .method_25435(new class_3771(var4, false, false))
               .method_25431(field_27320)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(var1);
            return method_16761("entity_cutout_no_cull", class_7985.field_40906, 7, 256, true, false, var4x);
         }
      );
   }

   public static RenderLayer method_16755(Identifier var0) {
      return method_16737(var0, true);
   }

   public static RenderLayer method_16748(Identifier var0, boolean var1) {
      Identifier var4 = method_16768(var0);
      return method_16724(
         "entity_cutout_no_cull_z_offset",
         var0,
         var1,
         () -> {
            class_8570 var4x = class_8570.method_39411()
               .method_25435(new class_3771(var4, false, false))
               .method_25431(field_27320)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25430(field_27293)
               .method_25436(var1);
            return method_16761("entity_cutout_no_cull_z_offset", class_7985.field_40906, 7, 256, true, false, var4x);
         }
      );
   }

   public static RenderLayer method_16753(Identifier var0) {
      return method_16748(var0, true);
   }

   public static RenderLayer method_16766(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "item_entity_translucent_cull",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27308)
               .method_25427(field_27317)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25428(class_5348.field_27327)
               .method_25436(true);
            return method_16761("item_entity_translucent_cull", class_7985.field_40906, 7, 256, true, true, var3x);
         }
      );
   }

   public static RenderLayer method_16735(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_translucent_cull",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27308)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(true);
            return method_16761("entity_translucent_cull", class_7985.field_40906, 7, 256, true, true, var3x);
         }
      );
   }

   public static RenderLayer method_16754(Identifier var0, boolean var1) {
      Identifier var4 = method_16768(var0);
      return method_16724(
         "entity_translucent",
         var0,
         var1,
         () -> {
            class_8570 var4x = class_8570.method_39411()
               .method_25435(new class_3771(var4, false, false))
               .method_25431(field_27308)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(var1);
            return method_16761("entity_translucent", class_7985.field_40906, 7, 256, true, true, var4x);
         }
      );
   }

   public static RenderLayer method_16705(Identifier var0) {
      return method_16754(var0, true);
   }

   public static RenderLayer method_16730(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_smooth_cutout",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25433(field_27299)
               .method_25437(field_27278)
               .method_25434(field_27297)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25436(true);
            return method_16760("entity_smooth_cutout", class_7985.field_40906, 7, 256, var3x);
         }
      );
   }

   public static RenderLayer method_16731(Identifier var0, boolean var1) {
      Identifier var4 = method_16768(var0);
      return method_16724(
         "beacon_beam",
         var0,
         var1,
         () -> {
            class_8570 var4x = class_8570.method_39411()
               .method_25435(new class_3771(var4, false, false))
               .method_25431(!var1 ? field_27320 : field_27308)
               .method_25428(!var1 ? field_27327 : field_27303)
               .method_25444(field_27306)
               .method_25436(false);
            return method_16761("beacon_beam", class_7985.field_40918, 7, 256, false, true, var4x);
         }
      );
   }

   public static RenderLayer method_16727(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_decal",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25439(field_27289)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25436(false);
            return method_16760("entity_decal", class_7985.field_40906, 7, 256, var3x);
         }
      );
   }

   public static RenderLayer method_16750(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_no_outline",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27308)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27319)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25428(field_27303)
               .method_25436(false);
            return method_16761("entity_no_outline", class_7985.field_40906, 7, 256, false, true, var3x);
         }
      );
   }

   public static RenderLayer getEntityShadow(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "entity_shadow",
         var0,
         () -> {
            class_8570 var3x = class_8570.method_39411()
               .method_25435(new class_3771(var3, false, false))
               .method_25431(field_27308)
               .method_25437(field_27278)
               .method_25433(field_27310)
               .method_25432(field_27309)
               .method_25438(field_27280)
               .method_25442(field_27311)
               .method_25428(field_27303)
               .method_25439(field_27321)
               .method_25430(field_27293)
               .method_25436(false);
            return method_16761("entity_shadow", class_7985.field_40906, 7, 256, false, false, var3x);
         }
      );
   }

   public static RenderLayer method_16703(Identifier var0, float var1) {
      Identifier var4 = method_16768(var0);
      return method_16722(
         "entity_alpha",
         var0,
         var1,
         () -> {
            class_8570 var4x = class_8570.method_39411()
               .method_25435(new class_3771(var4, false, false))
               .method_25433(new class_7017(var1))
               .method_25432(field_27319)
               .method_25436(true);
            return method_16760("entity_alpha", class_7985.field_40906, 7, 256, var4x);
         }
      );
   }

   public static RenderLayer method_16769(Identifier var0) {
      Identifier var3 = method_16768(var0);
      return method_16723(
         "eyes",
         var0,
         () -> {
            class_3771 var3x = new class_3771(var3, false, false);
            return method_16761(
               "eyes",
               class_7985.field_40906,
               7,
               256,
               false,
               true,
               class_8570.method_39411().method_25435(var3x).method_25431(field_27292).method_25428(field_27303).method_25444(field_27284).method_25436(false)
            );
         }
      );
   }

   public static RenderLayer method_16738(Identifier var0, float var1, float var2) {
      Identifier var5 = method_16768(var0);
      return method_16721(
         "energy_swirl",
         var0,
         var1,
         var2,
         () -> method_16761(
               "energy_swirl",
               class_7985.field_40906,
               7,
               256,
               false,
               true,
               class_8570.method_39411()
                  .method_25435(new class_3771(var5, false, false))
                  .method_25440(new class_7716(var1, var2))
                  .method_25444(field_27284)
                  .method_25431(field_27292)
                  .method_25437(field_27278)
                  .method_25433(field_27310)
                  .method_25432(field_27319)
                  .method_25438(field_27280)
                  .method_25442(field_27311)
                  .method_25436(false)
            )
      );
   }

   public static RenderLayer method_16743() {
      return field_17563;
   }

   public static RenderLayer method_16728() {
      return field_17570;
   }

   public static RenderLayer method_16773(Identifier var0) {
      return method_16741(var0, field_27319);
   }

   public static RenderLayer method_16741(Identifier var0, class_3754 var1) {
      return method_16724(
         "outline",
         var0,
         var1 == field_27309,
         () -> method_16760(
               "outline",
               class_7985.field_40913,
               7,
               256,
               class_8570.method_39411()
                  .method_25435(new class_3771(var0, false, false))
                  .method_25432(var1)
                  .method_25439(field_27296)
                  .method_25433(field_27310)
                  .method_25440(field_27281)
                  .method_25444(field_27306)
                  .method_25427(field_27287)
                  .method_25429(class_3409.field_16786)
            )
      );
   }

   public static RenderLayer method_16707() {
      return field_17564;
   }

   public static RenderLayer method_16711() {
      return field_17569;
   }

   public static RenderLayer method_16739() {
      return field_17581;
   }

   public static RenderLayer method_16716() {
      return field_17559;
   }

   public static RenderLayer method_16715() {
      return field_17575;
   }

   public static RenderLayer method_16757() {
      return field_17556;
   }

   public static RenderLayer method_16763() {
      return field_17568;
   }

   public static RenderLayer method_16719(Identifier var0) {
      return method_16723(
         "crumbling",
         var0,
         () -> {
            class_3771 var3 = new class_3771(var0, false, false);
            return method_16761(
               "crumbling",
               class_7985.field_40918,
               7,
               256,
               false,
               true,
               class_8570.method_39411()
                  .method_25435(var3)
                  .method_25433(field_27310)
                  .method_25431(field_27326)
                  .method_25428(field_27303)
                  .method_25430(field_27318)
                  .method_25436(false)
            );
         }
      );
   }

   public static RenderLayer method_16732(Identifier var0) {
      return method_16723(
         "text",
         var0,
         () -> method_16761(
               "text",
               class_7985.field_40904,
               7,
               256,
               false,
               false,
               class_8570.method_39411()
                  .method_25435(new class_3771(var0, false, false))
                  .method_25433(field_27310)
                  .method_25431(field_27308)
                  .method_25438(field_27280)
                  .method_25436(false)
            )
      );
   }

   public static RenderLayer method_16752(Identifier var0) {
      return method_16723(
         "text_see_through",
         var0,
         () -> method_16761(
               "text_see_through",
               class_7985.field_40904,
               7,
               256,
               false,
               false,
               class_8570.method_39411()
                  .method_25435(new class_3771(var0, false, false))
                  .method_25433(field_27310)
                  .method_25431(field_27308)
                  .method_25438(field_27280)
                  .method_25439(field_27296)
                  .method_25428(field_27303)
                  .method_25436(false)
            )
      );
   }

   public static RenderLayer method_16714() {
      return field_17577;
   }

   private static class_8570 method_16726() {
      return class_8570.method_39411()
         .method_25434(field_27297)
         .method_25438(field_27280)
         .method_25435(field_27324)
         .method_25431(field_27308)
         .method_25427(field_27313)
         .method_25436(true);
   }

   public static RenderLayer method_16765() {
      return field_17582;
   }

   public static RenderLayer method_16712(int var0) {
      return method_16720(
         "end_portal",
         var0,
         () -> {
            class_4298 var3;
            class_3771 var4;
            if (var0 > 1) {
               var3 = field_27292;
               var4 = new class_3771(class_7260.field_37196, false, false);
            } else {
               var3 = field_27308;
               var4 = new class_3771(class_7260.field_37199, false, false);
            }

            return method_16761(
               "end_portal",
               class_7985.field_40903,
               7,
               256,
               false,
               true,
               class_8570.method_39411().method_25431(var3).method_25435(var4).method_25440(new class_4707(var0)).method_25444(field_27284).method_25436(false)
            );
         }
      );
   }

   public static RenderLayer method_16744() {
      return field_17558;
   }

   public RenderLayer(String var1, class_2868 var2, int var3, int var4, boolean var5, boolean var6, Runnable var7, Runnable var8) {
      super(var1, var7, var8);
      this.field_17572 = var2;
      this.field_17576 = var3;
      this.field_17557 = var4;
      this.field_17579 = var5;
      this.field_17573 = var6;
      this.field_17578 = Optional.<RenderLayer>of(this);
   }

   public static class_7634 method_16760(String var0, class_2868 var1, int var2, int var3, class_8570 var4) {
      return method_16761(var0, var1, var2, var3, false, false, var4);
   }

   public static class_7634 method_16761(String var0, class_2868 var1, int var2, int var3, boolean var4, boolean var5, class_8570 var6) {
      return class_7634.method_34595(var0, var1, var2, var3, var4, var5, var6);
   }

   public void method_16745(class_9633 var1, int var2, int var3, int var4) {
      if (var1.method_44474()) {
         if (this.field_17573) {
            var1.method_44482((float)var2, (float)var3, (float)var4);
         }

         if (var1.field_49059 != null) {
            class_153.method_614(var1.field_49059);
         }

         var1.method_44487();
         this.method_24420();
         if (Config.method_14424()) {
            class_4811.method_22176(false);
            class_6588.method_30315();
            class_293.method_1316(this, var1);
         }

         class_138.method_554(var1);
         if (Config.method_14424()) {
            class_293.method_1303(this, var1);
            class_6588.method_30118();
            class_4811.method_22176(true);
         }

         this.method_24422();
      }
   }

   @Override
   public String toString() {
      return this.field_27283;
   }

   public static List<RenderLayer> method_16770() {
      return ImmutableList.of(method_16751(), method_16756(), method_16771(), method_16762(), method_16765());
   }

   public int method_16742() {
      return this.field_17557;
   }

   public class_2868 method_16718() {
      return this.field_17572;
   }

   public int method_16764() {
      return this.field_17576;
   }

   public Optional<RenderLayer> method_16772() {
      return Optional.<RenderLayer>empty();
   }

   public boolean method_16709() {
      return false;
   }

   public boolean method_16713() {
      return this.field_17579;
   }

   public Optional<RenderLayer> method_16736() {
      return this.field_17578;
   }

   private static RenderLayer method_16723(String var0, Identifier var1, Supplier<RenderLayer> var2) {
      class_6998 var5 = new class_6998(var0, var1);
      return method_16725(var5, var2);
   }

   private static RenderLayer method_16724(String var0, Identifier var1, boolean var2, Supplier<RenderLayer> var3) {
      class_6998 var6 = new class_6998(var0, var1, var2);
      return method_16725(var6, var3);
   }

   private static RenderLayer method_16722(String var0, Identifier var1, float var2, Supplier<RenderLayer> var3) {
      class_6998 var6 = new class_6998(var0, var1, var2);
      return method_16725(var6, var3);
   }

   private static RenderLayer method_16721(String var0, Identifier var1, float var2, float var3, Supplier<RenderLayer> var4) {
      class_6998 var7 = new class_6998(var0, var1, var2, var3);
      return method_16725(var7, var4);
   }

   private static RenderLayer method_16720(String var0, int var1, Supplier<RenderLayer> var2) {
      class_6998 var5 = new class_6998(var0, var1);
      return method_16725(var5, var2);
   }

   private static RenderLayer method_16725(class_6998 var0, Supplier<RenderLayer> var1) {
      if (field_17566 == null) {
         field_17566 = new HashMap<class_6998, RenderLayer>();
      }

      RenderLayer var4 = field_17566.get(var0);
      if (var4 == null) {
         var4 = (RenderLayer)var1.get();
         field_17566.put(var0, var4);
         return var4;
      } else {
         return var4;
      }
   }

   public static Identifier method_16768(Identifier var0) {
      if (Config.method_14394()) {
         var0 = class_8192.method_37530(var0);
      }

      if (class_5052.method_23281()) {
         var0 = class_5052.method_23273(var0);
      }

      return var0;
   }

   public boolean method_16717() {
      return this.method_24421().equals("entity_solid");
   }

   public static int method_16729() {
      return class_8570.method_39413(class_7634.method_34591(field_17558)).size();
   }

   public Identifier method_16758() {
      return null;
   }

   public boolean method_16733() {
      return this.method_16758() == ItemRenderer.field_44880;
   }
}
