package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.NibbleArray;

public class Class7660 {
   public static Class9028 method25180(CompoundNBT var0) {
      int var3 = var0.getInt("xPos");
      int var4 = var0.getInt("zPos");
      Class9028 var5 = new Class9028(var3, var4);
      var5.field41306 = var0.getByteArray("Blocks");
      var5.field41305 = new Class9074(var0.getByteArray("Data"), 7);
      var5.field41304 = new Class9074(var0.getByteArray("SkyLight"), 7);
      var5.field41303 = new Class9074(var0.getByteArray("BlockLight"), 7);
      var5.field41302 = var0.getByteArray("HeightMap");
      var5.field41301 = var0.getBoolean("TerrainPopulated");
      var5.field41307 = var0.method131("Entities", 10);
      var5.field41308 = var0.method131("TileEntities", 10);
      var5.field41309 = var0.method131("TileTicks", 10);

      try {
         var5.field41300 = var0.getLong("LastUpdate");
      } catch (ClassCastException var7) {
         var5.field41300 = (long)var0.getInt("LastUpdate");
      }

      return var5;
   }

   public static void method25181(DynamicRegistriesImpl var0, Class9028 var1, CompoundNBT var2, BiomeProvider var3) {
      var2.putInt("xPos", var1.field41310);
      var2.putInt("zPos", var1.field41311);
      var2.method103("LastUpdate", var1.field41300);
      int[] var6 = new int[var1.field41302.length];

      for (int var7 = 0; var7 < var1.field41302.length; var7++) {
         var6[var7] = var1.field41302[var7];
      }

      var2.method111("HeightMap", var6);
      var2.putBoolean("TerrainPopulated", var1.field41301);
      ListNBT var19 = new ListNBT();

      for (int var8 = 0; var8 < 8; var8++) {
         boolean var9 = true;

         for (int var10 = 0; var10 < 16 && var9; var10++) {
            for (int var11 = 0; var11 < 16 && var9; var11++) {
               for (int var12 = 0; var12 < 16; var12++) {
                  int var13 = var10 << 11 | var12 << 7 | var11 + (var8 << 4);
                  byte var14 = var1.field41306[var13];
                  if (var14 != 0) {
                     var9 = false;
                     break;
                  }
               }
            }
         }

         if (!var9) {
            byte[] var20 = new byte[4096];
            NibbleArray var21 = new NibbleArray();
            NibbleArray var22 = new NibbleArray();
            NibbleArray var23 = new NibbleArray();

            for (int var24 = 0; var24 < 16; var24++) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     int var17 = var24 << 11 | var16 << 7 | var15 + (var8 << 4);
                     byte var18 = var1.field41306[var17];
                     var20[var15 << 8 | var16 << 4 | var24] = (byte)(var18 & 255);
                     var21.method20671(var24, var15, var16, var1.field41305.method33815(var24, var15 + (var8 << 4), var16));
                     var22.method20671(var24, var15, var16, var1.field41304.method33815(var24, var15 + (var8 << 4), var16));
                     var23.method20671(var24, var15, var16, var1.field41303.method33815(var24, var15 + (var8 << 4), var16));
                  }
               }
            }

            CompoundNBT var25 = new CompoundNBT();
            var25.method100("Y", (byte)(var8 & 0xFF));
            var25.method110("Blocks", var20);
            var25.method110("Data", var21.method20669());
            var25.method110("SkyLight", var22.method20669());
            var25.method110("BlockLight", var23.method20669());
            var19.add(var25);
         }
      }

      var2.put("Sections", var19);
      var2.method111(
         "Biomes", new BiomeContainer(var0.<Biome>getRegistry(Registry.BIOME_KEY), new ChunkPos(var1.field41310, var1.field41311), var3).method7198()
      );
      var2.put("Entities", var1.field41307);
      var2.put("TileEntities", var1.field41308);
      if (var1.field41309 != null) {
         var2.put("TileTicks", var1.field41309);
      }

      var2.putBoolean("convertedFromAlphaFormat", true);
   }
}
