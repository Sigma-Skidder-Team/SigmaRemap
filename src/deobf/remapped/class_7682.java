package remapped;

import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7682 {
   private static final Logger field_39040 = LogManager.getLogger();

   public static boolean method_34817(class_3676 var0, class_1215 var1) {
      var1.method_5390(0);
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      File var7 = var0.method_17068(class_6486.field_33048);
      File var8 = var0.method_17068(class_6486.field_33029);
      File var9 = var0.method_17068(class_6486.field_33038);
      field_39040.info("Scanning folders...");
      method_34818(var7, var4);
      if (var8.exists()) {
         method_34818(var8, var5);
      }

      if (var9.exists()) {
         method_34818(var9, var6);
      }

      int var10 = var4.size() + var5.size() + var6.size();
      field_39040.info("Total conversion count is {}", var10);
      class_7522 var11 = class_6322.method_28810();
      class_888 var12 = class_888.method_3825(class_3504.field_17178, class_3144.field_15638, var11);
      class_5684 var13 = var0.method_17072(var12, class_2805.field_13766);
      long var14 = var13 == null ? 0L : var13.method_25703().method_13295();
      class_6433 var16 = var11.<class_6325>method_28813(class_8669.field_44359);
      Object var17;
      if (var13 != null && var13.method_25703().method_13288()) {
         var17 = new class_2136(var16.method_39807(class_8606.field_44136));
      } else {
         var17 = new class_3925(var14, false, false, var16);
      }

      method_34821(var11, new File(var7, "region"), var4, (class_3498)var17, 0, var10, var1);
      method_34821(var11, new File(var8, "region"), var5, new class_2136(var16.method_39807(class_8606.field_44109)), var4.size(), var10, var1);
      method_34821(var11, new File(var9, "region"), var6, new class_2136(var16.method_39807(class_8606.field_44105)), var4.size() + var5.size(), var10, var1);
      method_34819(var0);
      var0.method_17065(var11, var13);
      return true;
   }

   private static void method_34819(class_3676 var0) {
      File var3 = var0.method_17064(class_263.field_925).toFile();
      if (var3.exists()) {
         File var4 = new File(var3.getParent(), "level.dat_mcr");
         if (!var3.renameTo(var4)) {
            field_39040.warn("Unable to create level.dat_mcr backup");
         }
      } else {
         field_39040.warn("Unable to create level.dat_mcr backup");
      }
   }

   private static void method_34821(class_7522 var0, File var1, Iterable<File> var2, class_3498 var3, int var4, int var5, class_1215 var6) {
      for (File var10 : var2) {
         method_34820(var0, var1, var10, var3, var4, var5, var6);
         var4++;
         int var11 = (int)Math.round(100.0 * (double)var4 / (double)var5);
         var6.method_5390(var11);
      }
   }

   private static void method_34820(class_7522 var0, File var1, File var2, class_3498 var3, int var4, int var5, class_1215 var6) {
      String var9 = var2.getName();

      try (
         class_1209 var10 = new class_1209(var2, var1, true);
         class_1209 var12 = new class_1209(new File(var1, var9.substring(0, var9.length() - ".mcr".length()) + ".mca"), var1, true);
      ) {
         for (int var14 = 0; var14 < 32; var14++) {
            for (int var15 = 0; var15 < 32; var15++) {
               class_2034 var16 = new class_2034(var14, var15);
               if (var10.method_5351(var16) && !var12.method_5351(var16)) {
                  class_5734 var20;
                  try (DataInputStream var17 = var10.method_5344(var16)) {
                     if (var17 == null) {
                        field_39040.warn("Failed to fetch input stream for chunk {}", var16);
                        continue;
                     }

                     var20 = class_5957.method_27220(var17);
                  } catch (IOException var109) {
                     field_39040.warn("Failed to read data for chunk {}", var16, var109);
                     continue;
                  }

                  class_5734 var117 = var20.method_25937("Level");
                  class_6744 var118 = class_2371.method_10851(var117);
                  class_5734 var19 = new class_5734();
                  class_5734 var21 = new class_5734();
                  var19.method_25946("Level", var21);
                  class_2371.method_10849(var0, var118, var21, var3);

                  try (DataOutputStream var22 = var12.method_5353(var16)) {
                     class_5957.method_27224(var19, var22);
                  }
               }
            }

            int var115 = (int)Math.round(100.0 * (double)(var4 * 1024) / (double)(var5 * 1024));
            int var116 = (int)Math.round(100.0 * (double)((var14 + 1) * 32 + var4 * 1024) / (double)(var5 * 1024));
            if (var116 > var115) {
               var6.method_5390(var116);
            }
         }
      } catch (IOException var114) {
         field_39040.error("Failed to upgrade region file {}", var2, var114);
      }
   }

   private static void method_34818(File var0, Collection<File> var1) {
      File var4 = new File(var0, "region");
      File[] var5 = var4.listFiles((var0x, var1x) -> var1x.endsWith(".mcr"));
      if (var5 != null) {
         Collections.addAll(var1, var5);
      }
   }
}
