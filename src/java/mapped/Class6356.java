package mapped;

import java.util.UUID;

public class Class6356 extends ViaVersion7<Class1916, Class1917, Class1922, Class1926> {
   private static final UUID field27917 = new UUID(0L, 0L);
   public static final Class5981 field27918 = new Class5981();
   private Class7136 field27919;

   public Class6356() {
      super(Class1916.class, Class1917.class, Class1922.class, Class1926.class);
   }

   @Override
   public void method19341() {
      Class6911 var3 = new Class6911(this);
      Class9699.method38004(this);
      Class9239.method34749(this);
      Class8121.method28119(this);
      this.field27919 = new Class7136(this, var3::method21106);
      this.field27919.method22254(Class1916.field11625);
      new Class7310(this, var3::method21106).method23096(Class1916.field11540);
      this.method19356(Class187.field701, 2, 2, new Class3806(this));
      this.method19356(Class187.field700, 0, 0, new Class3982(this));
      Class7079 var4 = new Class7079(this);
      this.method19360(Class1916.field11548, new Class3990(this, var4));
      var4.method22002(Class1916.field11546);
      var4.method22004(Class1916.field11613);
      var4.method22003(Class1916.field11584);
      Class5150 var5 = new Class5150(this);
      var5.method15951(Class1916.field11615);
      var5.method15951(Class1916.field11614);
      this.method19364(Class1926.field11968, new Class3912(this));
      if (ViaVersion3.method27612().method21943()) {
         this.method19364(Class1926.field11965, new Class3783(this));
      }

      this.method19364(Class1926.field11980, new Class4026(this));
      this.method19366(Class1926.field11969);
      this.method19366(Class1926.field11994);
   }

   @Override
   public void method19348() {
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

      this.field27919.method22253(Class2165.field14215, "minecraft:wall_post_override", var3);
      this.field27919.method22253(Class2165.field14215, "minecraft:beacon_base_blocks", 133, 134, 148, 265);
      this.field27919.method22253(Class2165.field14215, "minecraft:climbable", 160, 241, 658);
      this.field27919.method22253(Class2165.field14215, "minecraft:fire", 142);
      this.field27919.method22253(Class2165.field14215, "minecraft:campfires", 679);
      this.field27919.method22253(Class2165.field14215, "minecraft:fence_gates", 242, 467, 468, 469, 470, 471);
      this.field27919.method22253(Class2165.field14215, "minecraft:unstable_bottom_center", 242, 467, 468, 469, 470, 471);
      this.field27919.method22253(Class2165.field14215, "minecraft:wooden_trapdoors", 193, 194, 195, 196, 197, 198);
      this.field27919.method22253(Class2165.field14216, "minecraft:wooden_trapdoors", 215, 216, 217, 218, 219, 220);
      this.field27919.method22253(Class2165.field14216, "minecraft:beacon_payment_items", 529, 530, 531, 760);
      this.field27919.method22253(Class2165.field14218, "minecraft:impact_projectiles", 2, 72, 71, 37, 69, 79, 83, 15, 93);
      this.field27919.method22251(Class2165.field14215, "minecraft:guarded_by_piglins");
      this.field27919.method22251(Class2165.field14215, "minecraft:soul_speed_blocks");
      this.field27919.method22251(Class2165.field14215, "minecraft:soul_fire_base_blocks");
      this.field27919.method22251(Class2165.field14215, "minecraft:non_flammable_wood");
      this.field27919.method22251(Class2165.field14216, "minecraft:non_flammable_wood");
      this.field27919
         .method22252(
            Class2165.field14215,
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
      this.field27919.method22252(Class2165.field14218, "minecraft:arrows", "minecraft:beehive_inhabitors", "minecraft:raiders", "minecraft:skeletons");
      this.field27919
         .method22252(
            Class2165.field14216,
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
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6056(var1));
      var1.method22440(new Class6040(var1));
   }

   public Class5981 method19376() {
      return field27918;
   }

   // $VF: synthetic method
   public static UUID method19379() {
      return field27917;
   }
}
