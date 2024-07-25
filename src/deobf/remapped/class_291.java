package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_291 {
   private static final Logger field_1031 = LogManager.getLogger();
   private static final Map<class_7505<?>, class_3275<?>> field_1043 = Maps.newTreeMap(
      Comparator.<class_7505, String>comparing(var0 -> class_7505.method_34216(var0))
   );
   public static final class_7505<class_5850> field_1035 = method_1291("doFireTick", class_8094.field_41454, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1047 = method_1291("mobGriefing", class_8094.field_41452, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1051 = method_1291("keepInventory", class_8094.field_41457, class_5850.method_26679(false));
   public static final class_7505<class_5850> field_1028 = method_1291("doMobSpawning", class_8094.field_41455, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1033 = method_1291("doMobLoot", class_8094.field_41450, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1058 = method_1291("doTileDrops", class_8094.field_41450, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1024 = method_1291("doEntityDrops", class_8094.field_41450, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1038 = method_1291("commandBlockOutput", class_8094.field_41453, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1049 = method_1291("naturalRegeneration", class_8094.field_41457, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1037 = method_1291("doDaylightCycle", class_8094.field_41454, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1056 = method_1291("logAdminCommands", class_8094.field_41453, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1060 = method_1291("showDeathMessages", class_8094.field_41453, class_5850.method_26679(true));
   public static final class_7505<class_1997> field_1040 = method_1291("randomTickSpeed", class_8094.field_41454, class_1997.method_9276(3));
   public static final class_7505<class_5850> field_1057 = method_1291("sendCommandFeedback", class_8094.field_41453, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1026 = method_1291(
      "reducedDebugInfo", class_8094.field_41458, class_5850.method_26677(false, (var0, var1) -> {
         byte var4 = (byte)(!var1.method_26681() ? 23 : 22);

         for (class_9359 var6 : var0.method_1600().method_39951()) {
            var6.field_47794.method_4156(new class_295(var6, var4));
         }
      })
   );
   public static final class_7505<class_5850> field_1059 = method_1291("spectatorsGenerateChunks", class_8094.field_41457, class_5850.method_26679(true));
   public static final class_7505<class_1997> field_1054 = method_1291("spawnRadius", class_8094.field_41457, class_1997.method_9276(10));
   public static final class_7505<class_5850> field_1030 = method_1291("disableElytraMovementCheck", class_8094.field_41457, class_5850.method_26679(false));
   public static final class_7505<class_1997> field_1027 = method_1291("maxEntityCramming", class_8094.field_41452, class_1997.method_9276(24));
   public static final class_7505<class_5850> field_1025 = method_1291("doWeatherCycle", class_8094.field_41454, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1029 = method_1291("doLimitedCrafting", class_8094.field_41457, class_5850.method_26679(false));
   public static final class_7505<class_1997> field_1055 = method_1291("maxCommandChainLength", class_8094.field_41458, class_1997.method_9276(65536));
   public static final class_7505<class_5850> field_1053 = method_1291("announceAdvancements", class_8094.field_41453, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1045 = method_1291("disableRaids", class_8094.field_41452, class_5850.method_26679(false));
   public static final class_7505<class_5850> field_1052 = method_1291("doInsomnia", class_8094.field_41455, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1046 = method_1291(
      "doImmediateRespawn", class_8094.field_41457, class_5850.method_26677(false, (var0, var1) -> {
         for (class_9359 var5 : var0.method_1600().method_39951()) {
            var5.field_47794.method_4156(new class_2161(class_2161.field_10782, !var1.method_26681() ? 0.0F : 1.0F));
         }
      })
   );
   public static final class_7505<class_5850> field_1048 = method_1291("drowningDamage", class_8094.field_41457, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1044 = method_1291("fallDamage", class_8094.field_41457, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1032 = method_1291("fireDamage", class_8094.field_41457, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1036 = method_1291("doPatrolSpawning", class_8094.field_41455, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1041 = method_1291("doTraderSpawning", class_8094.field_41455, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1042 = method_1291("forgiveDeadPlayers", class_8094.field_41452, class_5850.method_26679(true));
   public static final class_7505<class_5850> field_1039 = method_1291("universalAnger", class_8094.field_41452, class_5850.method_26679(false));
   private final Map<class_7505<?>, class_9152<?>> field_1050;

   private static <T extends class_9152<T>> class_7505<T> method_1291(String var0, class_8094 var1, class_3275<T> var2) {
      class_7505 var5 = new class_7505(var0, var1);
      class_3275 var6 = field_1043.put(var5, var2);
      if (var6 == null) {
         return var5;
      } else {
         throw new IllegalStateException("Duplicate game rule registration for " + var0);
      }
   }

   public class_291(DynamicLike<?> var1) {
      this();
      this.method_1293(var1);
   }

   public class_291() {
      this.field_1050 = field_1043.entrySet()
         .stream()
         .collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((class_3275)var0.getValue()).method_14954()));
   }

   private class_291(Map<class_7505<?>, class_9152<?>> var1) {
      this.field_1050 = var1;
   }

   public <T extends class_9152<T>> T method_1287(class_7505<T> var1) {
      return (T)this.field_1050.get(var1);
   }

   public class_5734 method_1284() {
      class_5734 var3 = new class_5734();
      this.field_1050.forEach((var1, var2) -> var3.method_25941(class_7505.method_34216(var1), var2.method_42124()));
      return var3;
   }

   private void method_1293(DynamicLike<?> var1) {
      this.field_1050.forEach((var1x, var2) -> var1.get(class_7505.method_34216(var1x)).asString().result().ifPresent(var2::method_42118));
   }

   public class_291 clone() {
      return new class_291(
         this.field_1050.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((class_9152)var0.getValue()).method_42119()))
      );
   }

   public static void method_1289(class_2237 var0) {
      field_1043.forEach((var1, var2) -> method_1294(var0, (class_7505<?>)var1, (class_3275<?>)var2));
   }

   private static <T extends class_9152<T>> void method_1294(class_2237 var0, class_7505<?> var1, class_3275<?> var2) {
      var0.method_10289(var1, var2);
      var2.method_14955(var0, var1);
   }

   public void method_1292(class_291 var1, class_341 var2) {
      var1.field_1050.keySet().forEach(var3 -> this.method_1286((class_7505<?>)var3, var1, var2));
   }

   private <T extends class_9152<T>> void method_1286(class_7505<T> var1, class_291 var2, class_341 var3) {
      class_9152 var6 = var2.<class_9152>method_1287(var1);
      this.method_1287(var1).method_42123((T)var6, var3);
   }

   public boolean method_1285(class_7505<class_5850> var1) {
      return this.<class_5850>method_1287(var1).method_26681();
   }

   public int method_1295(class_7505<class_1997> var1) {
      return this.<class_1997>method_1287(var1).method_9272();
   }
}
