package remapped;

public class class_2371 {
   public static class_6744 method_10851(CompoundNBT var0) {
      int var3 = var0.method_25947("xPos");
      int var4 = var0.method_25947("zPos");
      class_6744 var5 = new class_6744(var3, var4);
      var5.field_34809 = var0.method_25930("Blocks");
      var5.field_34798 = new class_6916(var0.method_25930("Data"), 7);
      var5.field_34806 = new class_6916(var0.method_25930("SkyLight"), 7);
      var5.field_34810 = new class_6916(var0.method_25930("BlockLight"), 7);
      var5.field_34803 = var0.method_25930("HeightMap");
      var5.field_34800 = var0.getBoolean("TerrainPopulated");
      var5.field_34801 = var0.method_25927("Entities", 10);
      var5.field_34799 = var0.method_25927("TileEntities", 10);
      var5.field_34807 = var0.method_25927("TileTicks", 10);

      try {
         var5.field_34805 = var0.method_25948("LastUpdate");
      } catch (ClassCastException var7) {
         var5.field_34805 = (long)var0.method_25947("LastUpdate");
      }

      return var5;
   }

   public static void method_10849(class_7522 var0, class_6744 var1, CompoundNBT var2, class_3498 var3) {
      var2.putInt("xPos", var1.field_34808);
      var2.putInt("zPos", var1.field_34804);
      var2.method_25949("LastUpdate", var1.field_34805);
      int[] var6 = new int[var1.field_34803.length];

      for (int var7 = 0; var7 < var1.field_34803.length; var7++) {
         var6[var7] = var1.field_34803[var7];
      }

      var2.method_25969("HeightMap", var6);
      var2.putBoolean("TerrainPopulated", var1.field_34800);
      class_3416 var19 = new class_3416();

      for (int var8 = 0; var8 < 8; var8++) {
         boolean var9 = true;

         for (int var10 = 0; var10 < 16 && var9; var10++) {
            for (int var11 = 0; var11 < 16 && var9; var11++) {
               for (int var12 = 0; var12 < 16; var12++) {
                  int var13 = var10 << 11 | var12 << 7 | var11 + (var8 << 4);
                  byte var14 = var1.field_34809[var13];
                  if (var14 != 0) {
                     var9 = false;
                     break;
                  }
               }
            }
         }

         if (!var9) {
            byte[] var20 = new byte[4096];
            class_1201 var21 = new class_1201();
            class_1201 var22 = new class_1201();
            class_1201 var23 = new class_1201();

            for (int var24 = 0; var24 < 16; var24++) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     int var17 = var24 << 11 | var16 << 7 | var15 + (var8 << 4);
                     byte var18 = var1.field_34809[var17];
                     var20[var15 << 8 | var16 << 4 | var24] = (byte)(var18 & 255);
                     var21.method_5323(var24, var15, var16, var1.field_34798.method_31671(var24, var15 + (var8 << 4), var16));
                     var22.method_5323(var24, var15, var16, var1.field_34806.method_31671(var24, var15 + (var8 << 4), var16));
                     var23.method_5323(var24, var15, var16, var1.field_34810.method_31671(var24, var15 + (var8 << 4), var16));
                  }
               }
            }

            CompoundNBT var25 = new CompoundNBT();
            var25.method_25921("Y", (byte)(var8 & 0xFF));
            var25.method_25953("Blocks", var20);
            var25.method_25953("Data", var21.method_5317());
            var25.method_25953("SkyLight", var22.method_5317());
            var25.method_25953("BlockLight", var23.method_5317());
            var19.add(var25);
         }
      }

      var2.put("Sections", var19);
      var2.method_25969(
         "Biomes", new class_546(var0.<class_6325>method_28813(class_8669.field_44359), new class_2034(var1.field_34808, var1.field_34804), var3).method_2643()
      );
      var2.put("Entities", var1.field_34801);
      var2.put("TileEntities", var1.field_34799);
      if (var1.field_34807 != null) {
         var2.put("TileTicks", var1.field_34807);
      }

      var2.putBoolean("convertedFromAlphaFormat", true);
   }
}
