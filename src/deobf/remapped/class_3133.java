package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class class_3133<C extends class_4139> {
   private static final class_2522 field_15591 = class_4783.field_23592.method_29260();
   private static final class_2522 field_15560 = class_4783.field_23259.method_29260();
   private static final class_2522 field_15592 = class_4783.field_23201.method_29260();
   private static final class_2522 field_15572 = class_4783.field_23709.method_29260();
   private static final class_2522 field_15571 = class_4783.field_23644.method_29260();
   private static final class_2522 field_15589 = class_4783.field_23577.method_29260();
   private static final class_2522 field_15596 = class_4783.field_23216.method_29260();
   private static final class_2522 field_15602 = class_4783.field_23814.method_29260();
   private static final class_2522 field_15578 = class_4783.field_23264.method_29260();
   private static final class_2522 field_15593 = class_4783.field_23162.method_29260();
   private static final class_2522 field_15579 = class_4783.field_23784.method_29260();
   private static final class_2522 field_15559 = class_4783.field_23700.method_29260();
   private static final class_2522 field_15569 = class_4783.field_23894.method_29260();
   private static final class_2522 field_15557 = class_4783.field_23598.method_29260();
   private static final class_2522 field_15583 = class_4783.field_23209.method_29260();
   private static final class_2522 field_15567 = class_4783.field_23273.method_29260();
   private static final class_2522 field_15585 = class_4783.field_23490.method_29260();
   private static final class_2522 field_15564 = class_4783.field_23785.method_29260();
   private static final class_2522 field_15576 = class_4783.field_23788.method_29260();
   private static final class_2522 field_15570 = class_4783.field_23215.method_29260();
   public static final class_5194 field_15587 = new class_5194(field_15592, field_15591, field_15572);
   public static final class_5194 field_15590 = new class_5194(field_15572, field_15572, field_15572);
   public static final class_5194 field_15575 = new class_5194(field_15560, field_15591, field_15572);
   public static final class_5194 field_15601 = new class_5194(field_15571, field_15571, field_15572);
   public static final class_5194 field_15565 = new class_5194(field_15589, field_15591, field_15572);
   public static final class_5194 field_15574 = new class_5194(field_15596, field_15596, field_15572);
   public static final class_5194 field_15555 = new class_5194(field_15560, field_15591, field_15596);
   public static final class_5194 field_15584 = new class_5194(field_15596, field_15596, field_15596);
   public static final class_5194 field_15586 = new class_5194(field_15602, field_15578, field_15572);
   public static final class_5194 field_15588 = new class_5194(field_15593, field_15591, field_15572);
   public static final class_5194 field_15604 = new class_5194(field_15559, field_15559, field_15559);
   public static final class_5194 field_15568 = new class_5194(field_15579, field_15579, field_15579);
   public static final class_5194 field_15605 = new class_5194(field_15569, field_15569, field_15569);
   public static final class_5194 field_15600 = new class_5194(field_15557, field_15559, field_15567);
   public static final class_5194 field_15581 = new class_5194(field_15583, field_15559, field_15585);
   public static final class_5194 field_15573 = new class_5194(field_15564, field_15576, field_15570);
   public static final class_3133<class_5194> field_15561 = method_14496("default", new class_1426(class_5194.field_26714));
   public static final class_3133<class_5194> field_15603 = method_14496("mountain", new class_7465(class_5194.field_26714));
   public static final class_3133<class_5194> field_15598 = method_14496("shattered_savanna", new class_932(class_5194.field_26714));
   public static final class_3133<class_5194> field_15582 = method_14496("gravelly_mountain", new class_3427(class_5194.field_26714));
   public static final class_3133<class_5194> field_15577 = method_14496("giant_tree_taiga", new class_5494(class_5194.field_26714));
   public static final class_3133<class_5194> field_15599 = method_14496("swamp", new class_6413(class_5194.field_26714));
   public static final class_3133<class_5194> field_15563 = method_14496("badlands", new class_7389(class_5194.field_26714));
   public static final class_3133<class_5194> field_15594 = method_14496("wooded_badlands", new class_6877(class_5194.field_26714));
   public static final class_3133<class_5194> field_15580 = method_14496("eroded_badlands", new class_7534(class_5194.field_26714));
   public static final class_3133<class_5194> field_15562 = method_14496("frozen_ocean", new class_8239(class_5194.field_26714));
   public static final class_3133<class_5194> field_15558 = method_14496("nether", new class_4019(class_5194.field_26714));
   public static final class_3133<class_5194> field_15556 = method_14496("nether_forest", new class_2622(class_5194.field_26714));
   public static final class_3133<class_5194> field_15595 = method_14496("soul_sand_valley", new class_3862(class_5194.field_26714));
   public static final class_3133<class_5194> field_15554 = method_14496("basalt_deltas", new class_4588(class_5194.field_26714));
   public static final class_3133<class_5194> field_15566 = method_14496("nope", new class_1955(class_5194.field_26714));
   private final Codec<class_7929<C>> field_15597;

   private static <C extends class_4139, F extends class_3133<C>> F method_14496(String var0, F var1) {
      return class_8669.<F>method_39791(class_8669.field_44363, var0, (F)var1);
   }

   public class_3133(Codec<C> var1) {
      this.field_15597 = var1.fieldOf("config").xmap(this::method_14494, class_7929::method_35846).codec();
   }

   public Codec<class_7929<C>> method_14495() {
      return this.field_15597;
   }

   public class_7929<C> method_14494(C var1) {
      return new class_7929<C>(this, var1);
   }

   public abstract void method_14498(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      C var14
   );

   public void method_14499(long var1) {
   }
}
