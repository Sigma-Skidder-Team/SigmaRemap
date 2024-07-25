package remapped;

public class class_6003 extends class_4106<class_3680, class_6608, class_4805, class_3799> {
   public static final class_8841 field_30576 = new class_8841();
   private class_1421 field_30575;

   public class_6003() {
      super(class_3680.class, class_6608.class, class_4805.class, class_3799.class);
   }

   @Override
   public void method_18998() {
      class_7831 var3 = new class_7831(this);
      class_7924.method_35837(this);
      class_4101.method_18942(this);
      class_8806.method_40475(this);
      this.field_30575 = new class_1421(this, var3::method_33115);
      this.field_30575.method_6520(class_3680.field_17962);
      new class_1739(this, var3::method_33115).method_7755(class_3680.field_18005);
      class_267 var4 = new class_267(this);
      var4.method_1194(class_3680.field_18026);
      var4.method_1194(class_3680.field_17963);
      this.method_18992(class_3799.field_18581, new class_4179(this));
      this.method_18993(class_3799.field_18552, class_4805.field_24049, new class_2334(this));
   }

   @Override
   public void method_19022() {
      this.field_30575.method_6515(class_1121.field_6409, "minecraft:stone_crafting_materials", 14, 962);
      this.field_30575.method_6519(class_1121.field_6407, "minecraft:mushroom_grow_block");
      this.field_30575
         .method_6514(
            class_1121.field_6409,
            "minecraft:soul_fire_base_blocks",
            "minecraft:furnace_materials",
            "minecraft:crimson_stems",
            "minecraft:gold_ores",
            "minecraft:piglin_loved",
            "minecraft:piglin_repellents",
            "minecraft:creeper_drop_music_discs",
            "minecraft:logs_that_burn",
            "minecraft:stone_tool_materials",
            "minecraft:warped_stems"
         );
      this.field_30575
         .method_6514(
            class_1121.field_6407,
            "minecraft:infiniburn_nether",
            "minecraft:crimson_stems",
            "minecraft:wither_summon_base_blocks",
            "minecraft:infiniburn_overworld",
            "minecraft:piglin_repellents",
            "minecraft:hoglin_repellents",
            "minecraft:prevent_mob_spawning_inside",
            "minecraft:wart_blocks",
            "minecraft:stone_pressure_plates",
            "minecraft:nylium",
            "minecraft:gold_ores",
            "minecraft:pressure_plates",
            "minecraft:logs_that_burn",
            "minecraft:strider_warm_blocks",
            "minecraft:warped_stems",
            "minecraft:infiniburn_end",
            "minecraft:base_stone_nether",
            "minecraft:base_stone_overworld"
         );
   }

   @Override
   public void method_19025(class_1455 var1) {
      var1.method_6737(new class_448(var1));
   }

   public class_8841 method_27400() {
      return field_30576;
   }
}
