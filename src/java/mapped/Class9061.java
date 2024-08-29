package mapped;

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

public class Class9061 {
   private static final Logger field41470 = LogManager.getLogger();
   public static final File field41471 = new File("banned-ips.txt");
   public static final File field41472 = new File("banned-players.txt");
   public static final File field41473 = new File("ops.txt");
   public static final File field41474 = new File("white-list.txt");

   public static List<String> method33726(File var0, Map<String, String[]> var1) throws IOException {
      List<String> var4 = Files.readLines(var0, StandardCharsets.UTF_8);

      for (String var6 : var4) {
         var6 = var6.trim();
         if (!var6.startsWith("#") && var6.length() >= 1) {
            String[] var7 = var6.split("\\|");
            var1.put(var7[0].toLowerCase(Locale.ROOT), var7);
         }
      }

      return var4;
   }

   private static void method33727(MinecraftServer var0, Collection<String> var1, ProfileLookupCallback var2) {
      String[] var5 = var1.stream().filter(var0x -> !Class9001.method33256(var0x)).<String>toArray(String[]::new);
      if (!var0.method1350()) {
         for (String var9 : var5) {
            UUID var10 = PlayerEntity.method2960(new GameProfile((UUID)null, var9));
            GameProfile var11 = new GameProfile(var10, var9);
            var2.onProfileLookupSucceeded(var11);
         }
      } else {
         var0.method1385().findProfilesByNames(var5, Agent.MINECRAFT, var2);
      }
   }

   public static boolean method33728(MinecraftServer var0) {
      Class4528 var3 = new Class4528(Class6395.field27984);
      if (field41472.exists() && field41472.isFile()) {
         if (var3.method14435().exists()) {
            try {
               var3.method14445();
            } catch (IOException var8) {
               field41470.warn("Could not load existing file {}", var3.method14435().getName(), var8);
            }
         }

         try {
            HashMap var4 = Maps.newHashMap();
            method33726(field41472, var4);
            Class9351 var5 = new Class9351(var0, var4, var3);
            method33727(var0, var4.keySet(), var5);
            var3.method14444();
            method33739(field41472);
            return true;
         } catch (IOException var6) {
            field41470.warn("Could not read old user banlist to convert it!", var6);
            return false;
         } catch (Class2502 var7) {
            field41470.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method33729(MinecraftServer var0) {
      Class4532 var3 = new Class4532(Class6395.field27985);
      if (field41471.exists() && field41471.isFile()) {
         if (var3.method14435().exists()) {
            try {
               var3.method14445();
            } catch (IOException var13) {
               field41470.warn("Could not load existing file {}", var3.method14435().getName(), var13);
            }
         }

         try {
            HashMap<String, String[]> var4 = Maps.newHashMap();
            method33726(field41471, var4);

            for (String var6 : var4.keySet()) {
               String[] var7 = (String[])var4.get(var6);
               Date var8 = var7.length > 1 ? method33740(var7[1], (Date)null) : null;
               String var9 = var7.length > 2 ? var7[2] : null;
               Date var10 = var7.length > 3 ? method33740(var7[3], (Date)null) : null;
               String var11 = var7.length > 4 ? var7[4] : null;
               var3.method14436(new Class6788(var6, var8, var9, var10, var11));
            }

            var3.method14444();
            method33739(field41471);
            return true;
         } catch (IOException var12) {
            field41470.warn("Could not parse old ip banlist to convert it!", var12);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method33730(MinecraftServer var0) {
      Class4530 var3 = new Class4530(Class6395.field27986);
      if (field41473.exists() && field41473.isFile()) {
         if (var3.method14435().exists()) {
            try {
               var3.method14445();
            } catch (IOException var8) {
               field41470.warn("Could not load existing file {}", var3.method14435().getName(), var8);
            }
         }

         try {
            List var4 = Files.readLines(field41473, StandardCharsets.UTF_8);
            Class9148 var5 = new Class9148(var0, var3);
            method33727(var0, var4, var5);
            var3.method14444();
            method33739(field41473);
            return true;
         } catch (IOException var6) {
            field41470.warn("Could not read old oplist to convert it!", var6);
            return false;
         } catch (Class2502 var7) {
            field41470.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method33731(MinecraftServer var0) {
      Class4531 var3 = new Class4531(Class6395.field27987);
      if (field41474.exists() && field41474.isFile()) {
         if (var3.method14435().exists()) {
            try {
               var3.method14445();
            } catch (IOException var8) {
               field41470.warn("Could not load existing file {}", var3.method14435().getName(), var8);
            }
         }

         try {
            List var4 = Files.readLines(field41474, StandardCharsets.UTF_8);
            Class8397 var5 = new Class8397(var0, var3);
            method33727(var0, var4, var5);
            var3.method14444();
            method33739(field41474);
            return true;
         } catch (IOException var6) {
            field41470.warn("Could not read old whitelist to convert it!", var6);
            return false;
         } catch (Class2502 var7) {
            field41470.error("Conversion failed, please try again later", var7);
            return false;
         }
      } else {
         return true;
      }
   }

   @Nullable
   public static UUID method33732(MinecraftServer var0, String var1) {
      if (!Class9001.method33256(var1) && var1.length() <= 16) {
         GameProfile var4 = var0.method1386().method31792(var1);
         if (var4 != null && var4.getId() != null) {
            return var4.getId();
         } else if (!var0.method1334() && var0.method1350()) {
            ArrayList var5 = Lists.newArrayList();
            Class8858 var6 = new Class8858(var0, var5);
            method33727(var0, Lists.newArrayList(new String[]{var1}), var6);
            return !var5.isEmpty() && ((GameProfile)var5.get(0)).getId() != null ? ((GameProfile)var5.get(0)).getId() : null;
         } else {
            return PlayerEntity.method2960(new GameProfile((UUID)null, var1));
         }
      } else {
         try {
            return UUID.fromString(var1);
         } catch (IllegalArgumentException var7) {
            return null;
         }
      }
   }

   public static boolean method33733(Class1645 var0) {
      File var3 = method33738(var0);
      File var4 = new File(var3.getParentFile(), "playerdata");
      File var5 = new File(var3.getParentFile(), "unknownplayers");
      if (var3.exists() && var3.isDirectory()) {
         File[] var6 = var3.listFiles();
         ArrayList<Object> var7 = Lists.newArrayList();

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
            String[] var15 = var7.toArray(new String[var7.size()]);
            Class8301 var16 = new Class8301(var0, var4, var5, var3, var15);
            method33727(var0, Lists.newArrayList(var15), var16);
            return true;
         } catch (Class2502 var14) {
            field41470.error("Conversion failed, please try again later", var14);
            return false;
         }
      } else {
         return true;
      }
   }

   private static void method33734(File var0) {
      if (!var0.exists()) {
         if (!var0.mkdirs()) {
            throw new Class2502("Can't create directory " + var0.getName() + " in world save directory.", null);
         }
      } else if (!var0.isDirectory()) {
         throw new Class2502("Can't create directory " + var0.getName() + " in world save directory.", null);
      }
   }

   public static boolean method33735(MinecraftServer var0) {
      boolean var3 = method33736();
      return var3 && method33737(var0);
   }

   private static boolean method33736() {
      boolean var2 = false;
      if (field41472.exists() && field41472.isFile()) {
         var2 = true;
      }

      boolean var3 = false;
      if (field41471.exists() && field41471.isFile()) {
         var3 = true;
      }

      boolean var4 = false;
      if (field41473.exists() && field41473.isFile()) {
         var4 = true;
      }

      boolean var5 = false;
      if (field41474.exists() && field41474.isFile()) {
         var5 = true;
      }

      if (!var2 && !var3 && !var4 && !var5) {
         return true;
      } else {
         field41470.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
         field41470.warn("** please remove the following files and restart the server:");
         if (var2) {
            field41470.warn("* {}", field41472.getName());
         }

         if (var3) {
            field41470.warn("* {}", field41471.getName());
         }

         if (var4) {
            field41470.warn("* {}", field41473.getName());
         }

         if (var5) {
            field41470.warn("* {}", field41474.getName());
         }

         return false;
      }
   }

   private static boolean method33737(MinecraftServer var0) {
      File var3 = method33738(var0);
      if (var3.exists() && var3.isDirectory() && (var3.list().length > 0 || !var3.delete())) {
         field41470.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
         field41470.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
         field41470.warn("** please restart the server and if the problem persists, remove the directory '{}'", var3.getPath());
         return false;
      } else {
         return true;
      }
   }

   private static File method33738(MinecraftServer var0) {
      return var0.method1433(FolderName.field23349).toFile();
   }

   private static void method33739(File var0) {
      File var3 = new File(var0.getName() + ".converted");
      var0.renameTo(var3);
   }

   private static Date method33740(String var0, Date var1) {
      Date var4;
      try {
         var4 = Class6787.field29579.parse(var0);
      } catch (ParseException var6) {
         var4 = var1;
      }

      return var4;
   }

   // $VF: synthetic method
   public static Logger method33743() {
      return field41470;
   }

   // $VF: synthetic method
   public static Date method33744(String var0, Date var1) {
      return method33740(var0, var1);
   }

   // $VF: synthetic method
   public static void method33745(File var0) {
      method33734(var0);
   }
}
