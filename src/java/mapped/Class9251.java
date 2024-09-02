package mapped;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9251 {
   private static final Logger field42556 = LogManager.getLogger();

   public static boolean method34798(SaveFormat.LevelSave var0, Class1339 var1) {
      var1.method6419(0);
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      File var7 = var0.method7992(World.OVERWORLD);
      File var8 = var0.method7992(World.THE_NETHER);
      File var9 = var0.method7992(World.THE_END);
      field42556.info("Scanning folders...");
      method34802(var7, var4);
      if (var8.exists()) {
         method34802(var8, var5);
      }

      if (var9.exists()) {
         method34802(var9, var6);
      }

      int var10 = var4.size() + var5.size() + var6.size();
      field42556.info("Total conversion count is {}", var10);
      DynamicRegistriesImpl var11 = DynamicRegistries.func_239770_b_();
      WorldSettingsImport var12 = WorldSettingsImport.create(NBTDynamicOps.INSTANCE, Class190.field721, var11);
      IServerConfiguration var13 = var0.readServerConfiguration(var12, DatapackCodec.field33531);
      long var14 = var13 == null ? 0L : var13.getDimensionGeneratorSettings().method26259();
      MutableRegistry<Biome> var16 = var11.getRegistry(Registry.BIOME_KEY);
      Object var17;
      if (var13 != null && var13.getDimensionGeneratorSettings().method26268()) {
         var17 = new Class1688((Biome) var16.getOrThrow(Class9495.field44122));
      } else {
         var17 = new Class1689(var14, false, false, var16);
      }

      method34800(var11, new File(var7, "region"), var4, (Class1685)var17, 0, var10, var1);
      method34800(var11, new File(var8, "region"), var5, new Class1688(var16.getOrThrow(Class9495.field44129)), var4.size(), var10, var1);
      method34800(var11, new File(var9, "region"), var6, new Class1688(var16.getOrThrow(Class9495.field44130)), var4.size() + var5.size(), var10, var1);
      method34799(var0);
      var0.saveLevel(var11, var13);
      return true;
   }

   private static void method34799(SaveFormat.LevelSave var0) {
      File var3 = var0.resolveFilePath(FolderName.field23350).toFile();
      if (var3.exists()) {
         File var4 = new File(var3.getParent(), "level.dat_mcr");
         if (!var3.renameTo(var4)) {
            field42556.warn("Unable to create level.dat_mcr backup");
         }
      } else {
         field42556.warn("Unable to create level.dat_mcr backup");
      }
   }

   private static void method34800(DynamicRegistriesImpl var0, File var1, Iterable<File> var2, Class1685 var3, int var4, int var5, Class1339 var6) {
      for (File var10 : var2) {
         method34801(var0, var1, var10, var3, var4, var5, var6);
         var4++;
         int var11 = (int)Math.round(100.0 * (double)var4 / (double)var5);
         var6.method6419(var11);
      }
   }

   private static void method34801(DynamicRegistriesImpl var0, File var1, File var2, Class1685 var3, int var4, int var5, Class1339 var6) {
      String var9 = var2.getName();

      try (
         Class1692 var10 = new Class1692(var2, var1, true);
         Class1692 var12 = new Class1692(new File(var1, var9.substring(0, var9.length() - ".mcr".length()) + ".mca"), var1, true);
      ) {
         for (int var14 = 0; var14 < 32; var14++) {
            for (int var15 = 0; var15 < 32; var15++) {
               Class7481 var16 = new Class7481(var14, var15);
               if (var10.method7265(var16) && !var12.method7265(var16)) {
                  CompoundNBT var20;
                  try (DataInputStream var17 = var10.method7247(var16)) {
                     if (var17 == null) {
                        field42556.warn("Failed to fetch input stream for chunk {}", var16);
                        continue;
                     }

                     var20 = Class8799.method31771(var17);
                  } catch (IOException var109) {
                     field42556.warn("Failed to read data for chunk {}", var16, var109);
                     continue;
                  }

                  CompoundNBT var117 = var20.getCompound("Level");
                  Class9028 var118 = Class7660.method25180(var117);
                  CompoundNBT var19 = new CompoundNBT();
                  CompoundNBT var21 = new CompoundNBT();
                  var19.put("Level", var21);
                  Class7660.method25181(var0, var118, var21, var3);

                  try (DataOutputStream var22 = var12.method7258(var16)) {
                     Class8799.method31773(var19, var22);
                  }
               }
            }

            int var115 = (int)Math.round(100.0 * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var116 = (int)Math.round(100.0 * (double)((var14 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if (var116 > var115) {
               var6.method6419(var116);
            }
         }
      } catch (IOException var114) {
         field42556.error("Failed to upgrade region file {}", var2, var114);
      }
   }

   private static void method34802(File var0, Collection<File> var1) {
      File var4 = new File(var0, "region");
      File[] var5 = var4.listFiles((var0x, var1x) -> var1x.endsWith(".mcr"));
      if (var5 != null) {
         Collections.addAll(var1, var5);
      }
   }
}
