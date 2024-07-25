package remapped;

import java.util.Optional;
import java.util.stream.IntStream;

public class class_9590 {
   public static final class_7701 field_48841 = method_44290(
      "cube",
      class_8940.field_45832,
      class_8940.field_45825,
      class_8940.field_45840,
      class_8940.field_45824,
      class_8940.field_45836,
      class_8940.field_45817,
      class_8940.field_45839
   );
   public static final class_7701 field_48866 = method_44290(
      "cube_directional",
      class_8940.field_45832,
      class_8940.field_45825,
      class_8940.field_45840,
      class_8940.field_45824,
      class_8940.field_45836,
      class_8940.field_45817,
      class_8940.field_45839
   );
   public static final class_7701 field_48833 = method_44290("cube_all", class_8940.field_45843);
   public static final class_7701 field_48781 = method_44294("cube_mirrored_all", "_mirrored", class_8940.field_45843);
   public static final class_7701 field_48862 = method_44290("cube_column", class_8940.field_45830, class_8940.field_45813);
   public static final class_7701 field_48830 = method_44294("cube_column_horizontal", "_horizontal", class_8940.field_45830, class_8940.field_45813);
   public static final class_7701 field_48807 = method_44290("cube_top", class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48789 = method_44290("cube_bottom_top", class_8940.field_45810, class_8940.field_45822, class_8940.field_45813);
   public static final class_7701 field_48837 = method_44290("orientable", class_8940.field_45810, class_8940.field_45833, class_8940.field_45813);
   public static final class_7701 field_48817 = method_44290(
      "orientable_with_bottom", class_8940.field_45810, class_8940.field_45822, class_8940.field_45813, class_8940.field_45833
   );
   public static final class_7701 field_48778 = method_44294("orientable_vertical", "_vertical", class_8940.field_45833, class_8940.field_45813);
   public static final class_7701 field_48858 = method_44290("button", class_8940.field_45837);
   public static final class_7701 field_48855 = method_44294("button_pressed", "_pressed", class_8940.field_45837);
   public static final class_7701 field_48799 = method_44294("button_inventory", "_inventory", class_8940.field_45837);
   public static final class_7701 field_48838 = method_44294("door_bottom", "_bottom", class_8940.field_45810, class_8940.field_45822);
   public static final class_7701 field_48848 = method_44294("door_bottom_rh", "_bottom_hinge", class_8940.field_45810, class_8940.field_45822);
   public static final class_7701 field_48782 = method_44294("door_top", "_top", class_8940.field_45810, class_8940.field_45822);
   public static final class_7701 field_48822 = method_44294("door_top_rh", "_top_hinge", class_8940.field_45810, class_8940.field_45822);
   public static final class_7701 field_48783 = method_44294("fence_post", "_post", class_8940.field_45837);
   public static final class_7701 field_48860 = method_44294("fence_side", "_side", class_8940.field_45837);
   public static final class_7701 field_48810 = method_44294("fence_inventory", "_inventory", class_8940.field_45837);
   public static final class_7701 field_48827 = method_44294("template_wall_post", "_post", class_8940.field_45831);
   public static final class_7701 field_48774 = method_44294("template_wall_side", "_side", class_8940.field_45831);
   public static final class_7701 field_48865 = method_44294("template_wall_side_tall", "_side_tall", class_8940.field_45831);
   public static final class_7701 field_48864 = method_44294("wall_inventory", "_inventory", class_8940.field_45831);
   public static final class_7701 field_48771 = method_44290("template_fence_gate", class_8940.field_45837);
   public static final class_7701 field_48819 = method_44294("template_fence_gate_open", "_open", class_8940.field_45837);
   public static final class_7701 field_48800 = method_44294("template_fence_gate_wall", "_wall", class_8940.field_45837);
   public static final class_7701 field_48828 = method_44294("template_fence_gate_wall_open", "_wall_open", class_8940.field_45837);
   public static final class_7701 field_48857 = method_44290("pressure_plate_up", class_8940.field_45837);
   public static final class_7701 field_48818 = method_44294("pressure_plate_down", "_down", class_8940.field_45837);
   public static final class_7701 field_48844 = method_44292(class_8940.field_45832);
   public static final class_7701 field_48803 = method_44290("slab", class_8940.field_45822, class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48861 = method_44294("slab_top", "_top", class_8940.field_45822, class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48815 = method_44290("leaves", class_8940.field_45843);
   public static final class_7701 field_48787 = method_44290("stairs", class_8940.field_45822, class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48791 = method_44294("inner_stairs", "_inner", class_8940.field_45822, class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48773 = method_44294("outer_stairs", "_outer", class_8940.field_45822, class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48816 = method_44294("template_trapdoor_top", "_top", class_8940.field_45837);
   public static final class_7701 field_48832 = method_44294("template_trapdoor_bottom", "_bottom", class_8940.field_45837);
   public static final class_7701 field_48795 = method_44294("template_trapdoor_open", "_open", class_8940.field_45837);
   public static final class_7701 field_48779 = method_44294("template_orientable_trapdoor_top", "_top", class_8940.field_45837);
   public static final class_7701 field_48788 = method_44294("template_orientable_trapdoor_bottom", "_bottom", class_8940.field_45837);
   public static final class_7701 field_48842 = method_44294("template_orientable_trapdoor_open", "_open", class_8940.field_45837);
   public static final class_7701 field_48847 = method_44290("cross", class_8940.field_45826);
   public static final class_7701 field_48835 = method_44290("tinted_cross", class_8940.field_45826);
   public static final class_7701 field_48777 = method_44290("flower_pot_cross", class_8940.field_45841);
   public static final class_7701 field_48786 = method_44290("tinted_flower_pot_cross", class_8940.field_45841);
   public static final class_7701 field_48793 = method_44290("rail_flat", class_8940.field_45814);
   public static final class_7701 field_48851 = method_44294("rail_curved", "_corner", class_8940.field_45814);
   public static final class_7701 field_48820 = method_44294("template_rail_raised_ne", "_raised_ne", class_8940.field_45814);
   public static final class_7701 field_48812 = method_44294("template_rail_raised_sw", "_raised_sw", class_8940.field_45814);
   public static final class_7701 field_48776 = method_44290("carpet", class_8940.field_45823);
   public static final class_7701 field_48836 = method_44290("coral_fan", class_8940.field_45816);
   public static final class_7701 field_48823 = method_44290("coral_wall_fan", class_8940.field_45816);
   public static final class_7701 field_48825 = method_44290("template_glazed_terracotta", class_8940.field_45821);
   public static final class_7701 field_48785 = method_44290("template_chorus_flower", class_8940.field_45837);
   public static final class_7701 field_48796 = method_44290("template_daylight_detector", class_8940.field_45810, class_8940.field_45813);
   public static final class_7701 field_48780 = method_44294("template_glass_pane_noside", "_noside", class_8940.field_45811);
   public static final class_7701 field_48850 = method_44294("template_glass_pane_noside_alt", "_noside_alt", class_8940.field_45811);
   public static final class_7701 field_48792 = method_44294("template_glass_pane_post", "_post", class_8940.field_45811, class_8940.field_45845);
   public static final class_7701 field_48856 = method_44294("template_glass_pane_side", "_side", class_8940.field_45811, class_8940.field_45845);
   public static final class_7701 field_48813 = method_44294("template_glass_pane_side_alt", "_side_alt", class_8940.field_45811, class_8940.field_45845);
   public static final class_7701 field_48826 = method_44290("template_command_block", class_8940.field_45833, class_8940.field_45809, class_8940.field_45813);
   public static final class_7701 field_48839 = method_44290("template_anvil", class_8940.field_45810);
   public static final class_7701[] field_48808 = IntStream.range(0, 8)
      .<class_7701>mapToObj(var0 -> method_44294("stem_growth" + var0, "_stage" + var0, class_8940.field_45829))
      .<class_7701>toArray(class_7701[]::new);
   public static final class_7701 field_48809 = method_44290("stem_fruit", class_8940.field_45829, class_8940.field_45828);
   public static final class_7701 field_48804 = method_44290("crop", class_8940.field_45835);
   public static final class_7701 field_48834 = method_44290("template_farmland", class_8940.field_45815, class_8940.field_45810);
   public static final class_7701 field_48824 = method_44290("template_fire_floor", class_8940.field_45808);
   public static final class_7701 field_48811 = method_44290("template_fire_side", class_8940.field_45808);
   public static final class_7701 field_48829 = method_44290("template_fire_side_alt", class_8940.field_45808);
   public static final class_7701 field_48840 = method_44290("template_fire_up", class_8940.field_45808);
   public static final class_7701 field_48846 = method_44290("template_fire_up_alt", class_8940.field_45808);
   public static final class_7701 field_48772 = method_44290("template_campfire", class_8940.field_45808, class_8940.field_45820);
   public static final class_7701 field_48852 = method_44290("template_lantern", class_8940.field_45838);
   public static final class_7701 field_48775 = method_44294("template_hanging_lantern", "_hanging", class_8940.field_45838);
   public static final class_7701 field_48845 = method_44290("template_torch", class_8940.field_45819);
   public static final class_7701 field_48859 = method_44290("template_torch_wall", class_8940.field_45819);
   public static final class_7701 field_48853 = method_44290("template_piston", class_8940.field_45812, class_8940.field_45822, class_8940.field_45813);
   public static final class_7701 field_48802 = method_44290("template_piston_head", class_8940.field_45812, class_8940.field_45813, class_8940.field_45842);
   public static final class_7701 field_48798 = method_44290(
      "template_piston_head_short", class_8940.field_45812, class_8940.field_45813, class_8940.field_45842
   );
   public static final class_7701 field_48821 = method_44290("template_seagrass", class_8940.field_45837);
   public static final class_7701 field_48794 = method_44290("template_turtle_egg", class_8940.field_45843);
   public static final class_7701 field_48863 = method_44290("template_two_turtle_eggs", class_8940.field_45843);
   public static final class_7701 field_48801 = method_44290("template_three_turtle_eggs", class_8940.field_45843);
   public static final class_7701 field_48790 = method_44290("template_four_turtle_eggs", class_8940.field_45843);
   public static final class_7701 field_48814 = method_44290("template_single_face", class_8940.field_45837);
   public static final class_7701 field_48797 = method_44293("generated", class_8940.field_45827);
   public static final class_7701 field_48831 = method_44293("handheld", class_8940.field_45827);
   public static final class_7701 field_48843 = method_44293("handheld_rod", class_8940.field_45827);
   public static final class_7701 field_48806 = method_44293("template_shulker_box", class_8940.field_45832);
   public static final class_7701 field_48854 = method_44293("template_bed", class_8940.field_45832);
   public static final class_7701 field_48805 = method_44293("template_banner");
   public static final class_7701 field_48784 = method_44293("template_skull");

   private static class_7701 method_44292(class_8940... var0) {
      return new class_7701(Optional.<class_4639>empty(), Optional.<String>empty(), var0);
   }

   private static class_7701 method_44290(String var0, class_8940... var1) {
      return new class_7701(Optional.<class_4639>of(new class_4639("minecraft", "block/" + var0)), Optional.<String>empty(), var1);
   }

   private static class_7701 method_44293(String var0, class_8940... var1) {
      return new class_7701(Optional.<class_4639>of(new class_4639("minecraft", "item/" + var0)), Optional.<String>empty(), var1);
   }

   private static class_7701 method_44294(String var0, String var1, class_8940... var2) {
      return new class_7701(Optional.<class_4639>of(new class_4639("minecraft", "block/" + var0)), Optional.<String>of(var1), var2);
   }
}
