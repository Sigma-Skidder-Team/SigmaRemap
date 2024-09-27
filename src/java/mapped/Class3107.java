package mapped;

public class Class3107 implements Class2982 {
   public final Class3920 field18302;

   public Class3107(Class3920 var1) {
      this.field18302 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30559(BruhMotha.field22544);
      var1.method30560(BruhMotha.field22544, var4 + 6);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.<String>method30561(BruhMotha.field22539);
         int[] var6 = var1.<int[]>method30561(BruhMotha.field22546);

         for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = this.field18302.field20186.method19376().method18529(var6[var7]);
         }
      }

      var1.method30560(BruhMotha.field22539, "minecraft:signs");
      var1.method30560(
         BruhMotha.field22546, new int[]{this.field18302.field20186.method19376().method18529(150), this.field18302.field20186.method19376().method18529(155)}
      );
      var1.method30560(BruhMotha.field22539, "minecraft:wall_signs");
      var1.method30560(BruhMotha.field22546, new int[]{this.field18302.field20186.method19376().method18529(155)});
      var1.method30560(BruhMotha.field22539, "minecraft:standing_signs");
      var1.method30560(BruhMotha.field22546, new int[]{this.field18302.field20186.method19376().method18529(150)});
      var1.method30560(BruhMotha.field22539, "minecraft:fences");
      var1.method30560(BruhMotha.field22546, new int[]{189, 248, 472, 473, 474, 475});
      var1.method30560(BruhMotha.field22539, "minecraft:walls");
      var1.method30560(BruhMotha.field22546, new int[]{271, 272});
      var1.method30560(BruhMotha.field22539, "minecraft:wooden_fences");
      var1.method30560(BruhMotha.field22546, new int[]{189, 472, 473, 474, 475});
      int var9 = var1.<Integer>method30559(BruhMotha.field22544);
      var1.method30560(BruhMotha.field22544, var9 + 2);

      for (int var10 = 0; var10 < var9; var10++) {
         var1.<String>method30561(BruhMotha.field22539);
         int[] var12 = var1.<int[]>method30561(BruhMotha.field22546);

         for (int var8 = 0; var8 < var12.length; var8++) {
            var12[var8] = this.field18302.field20186.method19376().method18530(var12[var8]);
         }
      }

      var1.method30560(BruhMotha.field22539, "minecraft:signs");
      var1.method30560(BruhMotha.field22546, new int[]{this.field18302.field20186.method19376().method18530(541)});
      var1.method30560(BruhMotha.field22539, "minecraft:arrows");
      var1.method30560(BruhMotha.field22546, new int[]{526, 825, 826});
      int var11 = var1.<Integer>method30561(BruhMotha.field22544);

      for (int var13 = 0; var13 < var11; var13++) {
         var1.<String>method30561(BruhMotha.field22539);
         var1.<int[]>method30561(BruhMotha.field22546);
      }

      var1.method30560(BruhMotha.field22544, 0);
   }
}
