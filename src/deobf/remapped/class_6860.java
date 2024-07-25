package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6860 {
   private static final Logger field_35350 = LogManager.getLogger();
   public static final File field_35349 = new File("banned-ips.txt");
   public static final File field_35352 = new File("banned-players.txt");
   public static final File field_35348 = new File("ops.txt");
   public static final File field_35347 = new File("white-list.txt");

   public static List<String> method_31463(File var0, Map<String, String[]> var1) throws IOException {
      List var4 = Files.readLines(var0, StandardCharsets.UTF_8);

      for (String var6 : var4) {
         var6 = var6.trim();
         if (!var6.startsWith("#") && var6.length() >= 1) {
            String[] var7 = var6.split("\\|");
            var1.put(var7[0].toLowerCase(Locale.ROOT), var7);
         }
      }

      return var4;
   }

   private static void method_31464(class_341 var0, Collection<String> var1, ProfileLookupCallback var2) {
      String[] var5 = var1.stream().filter(var0x -> !class_6660.method_30576(var0x)).<String>toArray(String[]::new);
      if (!var0.method_1657()) {
         for (String var9 : var5) {
            UUID var10 = PlayerEntity.method_3242(new GameProfile((UUID)null, var9));
            GameProfile var11 = new GameProfile(var10, var9);
            var2.onProfileLookupSucceeded(var11);
         }
      } else {
         var0.method_1701().findProfilesByNames(var5, Agent.MINECRAFT, var2);
      }
   }

   public static boolean method_31471(class_341 var0) {
      class_161 var3 = new class_161(class_8704.field_44615);
      if (field_35352.exists() && field_35352.isFile()) {
         if (var3.method_19921().exists()) {
            try {
               var3.method_19920();
            } catch (IOException var8) {
               field_35350.warn("Could not load existing file {}", var3.method_19921().getName(), var8);
            }
         }

         try {
            HashMap var4 = Maps.newHashMap();
            method_31463(field_35352, var4);
            class_8037 var5 = new class_8037(var0, var4, var3);
            method_31464(var0, var4.keySet(), var5);
            var3.method_19922();
            method_31456(field_35352);
            return true;
         } catch (IOException var6) {
            field_35350.warn("Could not read old user banlist to convert it!", var6);
            return false;
         } catch (class_8811 var7) {
            field_35350.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method_31472(class_341 var0) {
      class_9065 var3 = new class_9065(class_8704.field_44620);
      if (field_35349.exists() && field_35349.isFile()) {
         if (var3.method_19921().exists()) {
            try {
               var3.method_19920();
            } catch (IOException var13) {
               field_35350.warn("Could not load existing file {}", var3.method_19921().getName(), var13);
            }
         }

         try {
            HashMap var4 = Maps.newHashMap();
            method_31463(field_35349, var4);

            for (String var6 : var4.keySet()) {
               String[] var7 = (String[])var4.get(var6);
               Date var8 = var7.length > 1 ? method_31461(var7[1], (Date)null) : null;
               String var9 = var7.length > 2 ? var7[2] : null;
               Date var10 = var7.length > 3 ? method_31461(var7[3], (Date)null) : null;
               String var11 = var7.length > 4 ? var7[4] : null;
               var3.method_19928(new class_4513(var6, var8, var9, var10, var11));
            }

            var3.method_19922();
            method_31456(field_35349);
            return true;
         } catch (IOException var12) {
            field_35350.warn("Could not parse old ip banlist to convert it!", var12);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method_31466(class_341 var0) {
      class_8053 var3 = new class_8053(class_8704.field_44612);
      if (field_35348.exists() && field_35348.isFile()) {
         if (var3.method_19921().exists()) {
            try {
               var3.method_19920();
            } catch (IOException var8) {
               field_35350.warn("Could not load existing file {}", var3.method_19921().getName(), var8);
            }
         }

         try {
            List var4 = Files.readLines(field_35348, StandardCharsets.UTF_8);
            class_7227 var5 = new class_7227(var0, var3);
            method_31464(var0, var4, var5);
            var3.method_19922();
            method_31456(field_35348);
            return true;
         } catch (IOException var6) {
            field_35350.warn("Could not read old oplist to convert it!", var6);
            return false;
         } catch (class_8811 var7) {
            field_35350.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method_31459(class_341 var0) {
      class_5686 var3 = new class_5686(class_8704.field_44618);
      if (field_35347.exists() && field_35347.isFile()) {
         if (var3.method_19921().exists()) {
            try {
               var3.method_19920();
            } catch (IOException var8) {
               field_35350.warn("Could not load existing file {}", var3.method_19921().getName(), var8);
            }
         }

         try {
            List var4 = Files.readLines(field_35347, StandardCharsets.UTF_8);
            class_4474 var5 = new class_4474(var0, var3);
            method_31464(var0, var4, var5);
            var3.method_19922();
            method_31456(field_35347);
            return true;
         } catch (IOException var6) {
            field_35350.warn("Could not read old whitelist to convert it!", var6);
            return false;
         } catch (class_8811 var7) {
            field_35350.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   @Nullable
   public static UUID method_31462(class_341 var0, String var1) {
      if (!class_6660.method_30576(var1) && var1.length() <= 16) {
         GameProfile var4 = var0.method_1647().method_27255(var1);
         if (var4 != null && var4.getId() != null) {
            return var4.getId();
         } else if (!var0.method_1689() && var0.method_1657()) {
            ArrayList var5 = Lists.newArrayList();
            class_6136 var6 = new class_6136(var0, var5);
            method_31464(var0, Lists.newArrayList(new String[]{var1}), var6);
            return !var5.isEmpty() && ((GameProfile)var5.get(0)).getId() != null ? ((GameProfile)var5.get(0)).getId() : null;
         } else {
            return PlayerEntity.method_3242(new GameProfile((UUID)null, var1));
         }
      } else {
         try {
            return UUID.fromString(var1);
         } catch (IllegalArgumentException var7) {
            return null;
         }
      }
   }

   public static boolean method_31468(class_4497 var0) {
      File var3 = method_31457(var0);
      File var4 = new File(var3.getParentFile(), "playerdata");
      File var5 = new File(var3.getParentFile(), "unknownplayers");
      if (var3.exists() && var3.isDirectory()) {
         File[] var6 = var3.listFiles();
         ArrayList var7 = Lists.newArrayList();

         for (File var11 : var6) {
            String var12 = var11.getName();
            if (var12.toLowerCase(Locale.ROOT).endsWith(".dat")) {
               String var13 = var12.substring(0, var12.length() - ".dat".length());
               if (!var13.isEmpty()) {
                  var7.add(var13);
               }
            }
         }

         try {
            String[] var15 = var7.<String>toArray(new String[var7.size()]);
            class_4186 var16 = new class_4186(var0, var4, var5, var3, var15);
            method_31464(var0, Lists.newArrayList(var15), var16);
            return true;
         } catch (class_8811 var14) {
            field_35350.error("Conversion failed, please try again later", var14);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void method_31470(File var0) {
      if (!var0.exists()) {
         if (!var0.mkdirs()) {
            throw new class_8811("Can't create directory " + var0.getName() + " in world save directory.", null);
         }
      } else if (!var0.isDirectory()) {
         throw new class_8811("Can't create directory " + var0.getName() + " in world save directory.", null);
      }
   }

   public static boolean method_31474(class_341 var0) {
      boolean var3 = method_31467();
      return var3 && method_31469(var0);
   }

   private static boolean method_31467() {
      boolean var2 = false;
      if (field_35352.exists() && field_35352.isFile()) {
         var2 = true;
      }

      boolean var3 = false;
      if (field_35349.exists() && field_35349.isFile()) {
         var3 = true;
      }

      boolean var4 = false;
      if (field_35348.exists() && field_35348.isFile()) {
         var4 = true;
      }

      boolean var5 = false;
      if (field_35347.exists() && field_35347.isFile()) {
         var5 = true;
      }

      if (!var2 && !var3 && !var4 && !var5) {
         return true;
      } else {
         field_35350.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         field_35350.warn("** please remove the following files and restart the server:");
         if (var2) {
            field_35350.warn("* {}", field_35352.getName());
         }

         if (var3) {
            field_35350.warn("* {}", field_35349.getName());
         }

         if (var4) {
            field_35350.warn("* {}", field_35348.getName());
         }

         if (var5) {
            field_35350.warn("* {}", field_35347.getName());
         }

         return false;
      }
   }

   private static boolean method_31469(class_341 var0) {
      File var3 = method_31457(var0);
      if (var3.exists() && var3.isDirectory() && (var3.list().length > 0 || !var3.delete())) {
         field_35350.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         field_35350.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         field_35350.warn("** please restart the server and if the problem persists, remove the directory '{}'", var3.getPath());
         return false;
      } else {
         return true;
      }
   }

   private static File method_31457(class_341 var0) {
      return var0.method_1649(class_263.field_927).toFile();
   }

   private static void method_31456(File var0) {
      File var3 = new File(var0.getName() + ".converted");
      var0.renameTo(var3);
   }

   private static Date method_31461(String var0, Date var1) {
      Date var4;
      try {
         var4 = class_4424.field_21622.parse(var0);
      } catch (ParseException var6) {
         var4 = var1;
      }

      return var4;
   }
}
