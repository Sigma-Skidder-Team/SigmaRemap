package mapped;

import java.util.Optional;
import java.util.stream.IntStream;

public class Class9756 {
   public static final Class9253 field45535 = method38333(
      "cube",
      Class9588.field44827,
      Class9588.field44834,
      Class9588.field44835,
      Class9588.field44836,
      Class9588.field44837,
      Class9588.field44838,
      Class9588.field44839
   );
   public static final Class9253 field45536 = method38333(
      "cube_directional",
      Class9588.field44827,
      Class9588.field44834,
      Class9588.field44835,
      Class9588.field44836,
      Class9588.field44837,
      Class9588.field44838,
      Class9588.field44839
   );
   public static final Class9253 field45537 = method38333("cube_all", Class9588.field44825);
   public static final Class9253 field45538 = method38335("cube_mirrored_all", "_mirrored", Class9588.field44825);
   public static final Class9253 field45539 = method38333("cube_column", Class9588.field44828, Class9588.field44833);
   public static final Class9253 field45540 = method38335("cube_column_horizontal", "_horizontal", Class9588.field44828, Class9588.field44833);
   public static final Class9253 field45541 = method38333("cube_top", Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45542 = method38333("cube_bottom_top", Class9588.field44830, Class9588.field44829, Class9588.field44833);
   public static final Class9253 field45543 = method38333("orientable", Class9588.field44830, Class9588.field44831, Class9588.field44833);
   public static final Class9253 field45544 = method38333(
      "orientable_with_bottom", Class9588.field44830, Class9588.field44829, Class9588.field44833, Class9588.field44831
   );
   public static final Class9253 field45545 = method38335("orientable_vertical", "_vertical", Class9588.field44831, Class9588.field44833);
   public static final Class9253 field45546 = method38333("button", Class9588.field44826);
   public static final Class9253 field45547 = method38335("button_pressed", "_pressed", Class9588.field44826);
   public static final Class9253 field45548 = method38335("button_inventory", "_inventory", Class9588.field44826);
   public static final Class9253 field45549 = method38335("door_bottom", "_bottom", Class9588.field44830, Class9588.field44829);
   public static final Class9253 field45550 = method38335("door_bottom_rh", "_bottom_hinge", Class9588.field44830, Class9588.field44829);
   public static final Class9253 field45551 = method38335("door_top", "_top", Class9588.field44830, Class9588.field44829);
   public static final Class9253 field45552 = method38335("door_top_rh", "_top_hinge", Class9588.field44830, Class9588.field44829);
   public static final Class9253 field45553 = method38335("fence_post", "_post", Class9588.field44826);
   public static final Class9253 field45554 = method38335("fence_side", "_side", Class9588.field44826);
   public static final Class9253 field45555 = method38335("fence_inventory", "_inventory", Class9588.field44826);
   public static final Class9253 field45556 = method38335("template_wall_post", "_post", Class9588.field44842);
   public static final Class9253 field45557 = method38335("template_wall_side", "_side", Class9588.field44842);
   public static final Class9253 field45558 = method38335("template_wall_side_tall", "_side_tall", Class9588.field44842);
   public static final Class9253 field45559 = method38335("wall_inventory", "_inventory", Class9588.field44842);
   public static final Class9253 field45560 = method38333("template_fence_gate", Class9588.field44826);
   public static final Class9253 field45561 = method38335("template_fence_gate_open", "_open", Class9588.field44826);
   public static final Class9253 field45562 = method38335("template_fence_gate_wall", "_wall", Class9588.field44826);
   public static final Class9253 field45563 = method38335("template_fence_gate_wall_open", "_wall_open", Class9588.field44826);
   public static final Class9253 field45564 = method38333("pressure_plate_up", Class9588.field44826);
   public static final Class9253 field45565 = method38335("pressure_plate_down", "_down", Class9588.field44826);
   public static final Class9253 field45566 = method38332(Class9588.field44827);
   public static final Class9253 field45567 = method38333("slab", Class9588.field44829, Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45568 = method38335("slab_top", "_top", Class9588.field44829, Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45569 = method38333("leaves", Class9588.field44825);
   public static final Class9253 field45570 = method38333("stairs", Class9588.field44829, Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45571 = method38335("inner_stairs", "_inner", Class9588.field44829, Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45572 = method38335("outer_stairs", "_outer", Class9588.field44829, Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45573 = method38335("template_trapdoor_top", "_top", Class9588.field44826);
   public static final Class9253 field45574 = method38335("template_trapdoor_bottom", "_bottom", Class9588.field44826);
   public static final Class9253 field45575 = method38335("template_trapdoor_open", "_open", Class9588.field44826);
   public static final Class9253 field45576 = method38335("template_orientable_trapdoor_top", "_top", Class9588.field44826);
   public static final Class9253 field45577 = method38335("template_orientable_trapdoor_bottom", "_bottom", Class9588.field44826);
   public static final Class9253 field45578 = method38335("template_orientable_trapdoor_open", "_open", Class9588.field44826);
   public static final Class9253 field45579 = method38333("cross", Class9588.field44840);
   public static final Class9253 field45580 = method38333("tinted_cross", Class9588.field44840);
   public static final Class9253 field45581 = method38333("flower_pot_cross", Class9588.field44841);
   public static final Class9253 field45582 = method38333("tinted_flower_pot_cross", Class9588.field44841);
   public static final Class9253 field45583 = method38333("rail_flat", Class9588.field44843);
   public static final Class9253 field45584 = method38335("rail_curved", "_corner", Class9588.field44843);
   public static final Class9253 field45585 = method38335("template_rail_raised_ne", "_raised_ne", Class9588.field44843);
   public static final Class9253 field45586 = method38335("template_rail_raised_sw", "_raised_sw", Class9588.field44843);
   public static final Class9253 field45587 = method38333("carpet", Class9588.field44844);
   public static final Class9253 field45588 = method38333("coral_fan", Class9588.field44848);
   public static final Class9253 field45589 = method38333("coral_wall_fan", Class9588.field44848);
   public static final Class9253 field45590 = method38333("template_glazed_terracotta", Class9588.field44845);
   public static final Class9253 field45591 = method38333("template_chorus_flower", Class9588.field44826);
   public static final Class9253 field45592 = method38333("template_daylight_detector", Class9588.field44830, Class9588.field44833);
   public static final Class9253 field45593 = method38335("template_glass_pane_noside", "_noside", Class9588.field44846);
   public static final Class9253 field45594 = method38335("template_glass_pane_noside_alt", "_noside_alt", Class9588.field44846);
   public static final Class9253 field45595 = method38335("template_glass_pane_post", "_post", Class9588.field44846, Class9588.field44847);
   public static final Class9253 field45596 = method38335("template_glass_pane_side", "_side", Class9588.field44846, Class9588.field44847);
   public static final Class9253 field45597 = method38335("template_glass_pane_side_alt", "_side_alt", Class9588.field44846, Class9588.field44847);
   public static final Class9253 field45598 = method38333("template_command_block", Class9588.field44831, Class9588.field44832, Class9588.field44833);
   public static final Class9253 field45599 = method38333("template_anvil", Class9588.field44830);
   public static final Class9253[] field45600 = IntStream.range(0, 8)
      .<Class9253>mapToObj(var0 -> method38335("stem_growth" + var0, "_stage" + var0, Class9588.field44849))
      .<Class9253>toArray(Class9253[]::new);
   public static final Class9253 field45601 = method38333("stem_fruit", Class9588.field44849, Class9588.field44850);
   public static final Class9253 field45602 = method38333("crop", Class9588.field44851);
   public static final Class9253 field45603 = method38333("template_farmland", Class9588.field44852, Class9588.field44830);
   public static final Class9253 field45604 = method38333("template_fire_floor", Class9588.field44853);
   public static final Class9253 field45605 = method38333("template_fire_side", Class9588.field44853);
   public static final Class9253 field45606 = method38333("template_fire_side_alt", Class9588.field44853);
   public static final Class9253 field45607 = method38333("template_fire_up", Class9588.field44853);
   public static final Class9253 field45608 = method38333("template_fire_up_alt", Class9588.field44853);
   public static final Class9253 field45609 = method38333("template_campfire", Class9588.field44853, Class9588.field44859);
   public static final Class9253 field45610 = method38333("template_lantern", Class9588.field44854);
   public static final Class9253 field45611 = method38335("template_hanging_lantern", "_hanging", Class9588.field44854);
   public static final Class9253 field45612 = method38333("template_torch", Class9588.field44857);
   public static final Class9253 field45613 = method38333("template_torch_wall", Class9588.field44857);
   public static final Class9253 field45614 = method38333("template_piston", Class9588.field44855, Class9588.field44829, Class9588.field44833);
   public static final Class9253 field45615 = method38333("template_piston_head", Class9588.field44855, Class9588.field44833, Class9588.field44856);
   public static final Class9253 field45616 = method38333("template_piston_head_short", Class9588.field44855, Class9588.field44833, Class9588.field44856);
   public static final Class9253 field45617 = method38333("template_seagrass", Class9588.field44826);
   public static final Class9253 field45618 = method38333("template_turtle_egg", Class9588.field44825);
   public static final Class9253 field45619 = method38333("template_two_turtle_eggs", Class9588.field44825);
   public static final Class9253 field45620 = method38333("template_three_turtle_eggs", Class9588.field44825);
   public static final Class9253 field45621 = method38333("template_four_turtle_eggs", Class9588.field44825);
   public static final Class9253 field45622 = method38333("template_single_face", Class9588.field44826);
   public static final Class9253 field45623 = method38334("generated", Class9588.field44858);
   public static final Class9253 field45624 = method38334("handheld", Class9588.field44858);
   public static final Class9253 field45625 = method38334("handheld_rod", Class9588.field44858);
   public static final Class9253 field45626 = method38334("template_shulker_box", Class9588.field44827);
   public static final Class9253 field45627 = method38334("template_bed", Class9588.field44827);
   public static final Class9253 field45628 = method38334("template_banner");
   public static final Class9253 field45629 = method38334("template_skull");

   private static Class9253 method38332(Class9588... var0) {
      return new Class9253(Optional.<ResourceLocation>empty(), Optional.<String>empty(), var0);
   }

   private static Class9253 method38333(String var0, Class9588... var1) {
      return new Class9253(Optional.<ResourceLocation>of(new ResourceLocation("minecraft", "block/" + var0)), Optional.<String>empty(), var1);
   }

   private static Class9253 method38334(String var0, Class9588... var1) {
      return new Class9253(Optional.<ResourceLocation>of(new ResourceLocation("minecraft", "item/" + var0)), Optional.<String>empty(), var1);
   }

   private static Class9253 method38335(String var0, String var1, Class9588... var2) {
      return new Class9253(Optional.<ResourceLocation>of(new ResourceLocation("minecraft", "block/" + var0)), Optional.<String>of(var1), var2);
   }
}
