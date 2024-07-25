package remapped;

import java.util.UUID;

public class class_757 extends class_4106<class_2786, class_3680, class_3970, class_4805> {
   private static final UUID field_4105 = new UUID(0L, 0L);
   public static final class_1907 field_4103 = new class_1907();
   private class_1421 field_4106;

   public class_757() {
      super(class_2786.class, class_3680.class, class_3970.class, class_4805.class);
   }

   @Override
   public void method_18998() {
      class_6732 var3 = new class_6732(this);
      class_9390.method_43439(this);
      class_7610.method_34522(this);
      class_3663.method_17002(this);
      this.field_4106 = new class_1421(this, var3::method_33115);
      this.field_4106.method_6520(class_2786.field_13619);
      new class_1739(this, var3::method_33115).method_7755(class_2786.field_13659);
      this.method_19017(class_1730.field_8922, 2, 2, new class_4136(this));
      this.method_19017(class_1730.field_8919, 0, 0, new class_289(this));
      class_1358 var4 = new class_1358(this);
      this.method_19015(class_2786.field_13653, new class_6923(this, var4));
      var4.method_41800(class_2786.field_13622);
      var4.method_41797(class_2786.field_13610);
      var4.method_41805(class_2786.field_13615);
      class_267 var5 = new class_267(this);
      var5.method_1194(class_2786.field_13645);
      var5.method_1194(class_2786.field_13670);
      this.method_18992(class_4805.field_24013, new class_1382(this));
      if (class_3446.method_15884().method_25846()) {
         this.method_18992(class_4805.field_24012, new class_6634(this));
      }

      this.method_18992(class_4805.field_24023, new class_3814(this));
      this.method_19003(class_4805.field_24043);
      this.method_19003(class_4805.field_24048);
   }

   @Override
   public void method_19022() {
      int[] var3 = new int[47];
      int var4 = 0;
      var3[var4++] = 140;
      var3[var4++] = 179;
      var3[var4++] = 264;
      int var5 = 153;

      while (var5 <= 158) {
         var3[var4++] = var5++;
      }

      var5 = 163;

      while (var5 <= 168) {
         var3[var4++] = var5++;
      }

      var5 = 408;

      while (var5 <= 439) {
         var3[var4++] = var5++;
      }

      this.field_4106.method_6515(class_1121.field_6407, "minecraft:wall_post_override", var3);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:beacon_base_blocks", 133, 134, 148, 265);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:climbable", 160, 241, 658);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:fire", 142);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:campfires", 679);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:fence_gates", 242, 467, 468, 469, 470, 471);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:unstable_bottom_center", 242, 467, 468, 469, 470, 471);
      this.field_4106.method_6515(class_1121.field_6407, "minecraft:wooden_trapdoors", 193, 194, 195, 196, 197, 198);
      this.field_4106.method_6515(class_1121.field_6409, "minecraft:wooden_trapdoors", 215, 216, 217, 218, 219, 220);
      this.field_4106.method_6515(class_1121.field_6409, "minecraft:beacon_payment_items", 529, 530, 531, 760);
      this.field_4106.method_6515(class_1121.field_6410, "minecraft:impact_projectiles", 2, 72, 71, 37, 69, 79, 83, 15, 93);
      this.field_4106.method_6519(class_1121.field_6407, "minecraft:guarded_by_piglins");
      this.field_4106.method_6519(class_1121.field_6407, "minecraft:soul_speed_blocks");
      this.field_4106.method_6519(class_1121.field_6407, "minecraft:soul_fire_base_blocks");
      this.field_4106.method_6519(class_1121.field_6407, "minecraft:non_flammable_wood");
      this.field_4106.method_6519(class_1121.field_6409, "minecraft:non_flammable_wood");
      this.field_4106
         .method_6514(
            class_1121.field_6407,
            "minecraft:bamboo_plantable_on",
            "minecraft:beds",
            "minecraft:bee_growables",
            "minecraft:beehives",
            "minecraft:coral_plants",
            "minecraft:crops",
            "minecraft:dragon_immune",
            "minecraft:flowers",
            "minecraft:portals",
            "minecraft:shulker_boxes",
            "minecraft:small_flowers",
            "minecraft:tall_flowers",
            "minecraft:trapdoors",
            "minecraft:underwater_bonemeals",
            "minecraft:wither_immune",
            "minecraft:wooden_fences",
            "minecraft:wooden_trapdoors"
         );
      this.field_4106.method_6514(class_1121.field_6410, "minecraft:arrows", "minecraft:beehive_inhabitors", "minecraft:raiders", "minecraft:skeletons");
      this.field_4106
         .method_6514(
            class_1121.field_6409,
            "minecraft:beds",
            "minecraft:coals",
            "minecraft:fences",
            "minecraft:flowers",
            "minecraft:lectern_books",
            "minecraft:music_discs",
            "minecraft:small_flowers",
            "minecraft:tall_flowers",
            "minecraft:trapdoors",
            "minecraft:walls",
            "minecraft:wooden_fences"
         );
   }

   @Override
   public void method_19025(class_1455 var1) {
      var1.method_6737(new class_2188(var1));
      var1.method_6737(new class_6992(var1));
   }

   public class_1907 method_3424() {
      return field_4103;
   }
}
