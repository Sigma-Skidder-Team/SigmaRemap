package mapped;

public class Class6357 extends ViaVersion7<Class1917, Class1936, Class1926, Class1920> {
   public static final Class5983 field27920 = new Class5983();
   private Class7136 field27921;

   public Class6357() {
      super(Class1917.class, Class1936.class, Class1926.class, Class1920.class);
   }

   @Override
   public void method19341() {
      Class6913 var3 = new Class6913(this);
      Class9316.method35206(this);
      Class8267.method28834(this);
      Class9550.method36996(this);
      this.field27921 = new Class7136(this, var3::method21106);
      this.field27921.method22254(Class1917.field11719);
      new Class7310(this, var3::method21106).method23096(Class1917.field11634);
      Class5150 var4 = new Class5150(this);
      var4.method15951(Class1917.field11709);
      var4.method15951(Class1917.field11708);
      this.method19364(Class1920.field11752, new Class3819(this));
      this.method19365(Class1920.field11753, Class1926.field11984, new Class3775(this));
   }

   @Override
   public void method19348() {
      this.field27921.method22253(Class2165.field14216, "minecraft:stone_crafting_materials", 14, 962);
      this.field27921.method22251(Class2165.field14215, "minecraft:mushroom_grow_block");
      this.field27921
         .method22252(
            Class2165.field14216,
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
      this.field27921
         .method22252(
            Class2165.field14215,
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
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6035(var1));
   }

   public Class5983 method19376() {
      return field27920;
   }
}
