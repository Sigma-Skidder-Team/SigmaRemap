package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameRules {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Map < RuleKey<?>, net.minecraft.world.GameRules.RuleType<? >> GAME_RULES = Maps.newTreeMap(Comparator.comparing((key) ->
   {
      return key.gameRuleName;
   }));
   public static final RuleKey<BooleanValue> DO_FIRE_TICK = register("doFireTick", GameRulesCategory.UPDATES, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> MOB_GRIEFING = register("mobGriefing", GameRulesCategory.MOBS, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> KEEP_INVENTORY = register("keepInventory", GameRulesCategory.PLAYER, BooleanValue.create(false));
   public static final RuleKey<BooleanValue> DO_MOB_SPAWNING = register("doMobSpawning", GameRulesCategory.SPAWNING, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> DO_MOB_LOOT = register("doMobLoot", GameRulesCategory.DROPS, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> DO_TILE_DROPS = register("doTileDrops", GameRulesCategory.DROPS, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> DO_ENTITY_DROPS = register("doEntityDrops", GameRulesCategory.DROPS, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> COMMAND_BLOCK_OUTPUT = register("commandBlockOutput", GameRulesCategory.CHAT, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> NATURAL_REGENERATION = register("naturalRegeneration", GameRulesCategory.PLAYER, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> DO_DAYLIGHT_CYCLE = register("doDaylightCycle", GameRulesCategory.UPDATES, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> LOG_ADMIN_COMMANDS = register("logAdminCommands", GameRulesCategory.CHAT, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> SHOW_DEATH_MESSAGES = register("showDeathMessages", GameRulesCategory.CHAT, BooleanValue.create(true));
   public static final RuleKey<IntegerValue> RANDOM_TICK_SPEED = register("randomTickSpeed", GameRulesCategory.UPDATES, IntegerValue.create(3));
   public static final RuleKey<BooleanValue> SEND_COMMAND_FEEDBACK = register("sendCommandFeedback", GameRulesCategory.CHAT, BooleanValue.create(true));
   public static final RuleKey<BooleanValue> REDUCED_DEBUG_INFO = register(
      "reducedDebugInfo", GameRulesCategory.MISC, BooleanValue.method_26677(false, (var0, var1) -> {
         byte var4 = (byte)(!var1.method_26681() ? 23 : 22);

         for (class_9359 var6 : var0.method_1600().method_39951()) {
            var6.field_47794.method_4156(new class_295(var6, var4));
         }
      })
   );
   public static final RuleKey<BooleanValue> field_1059 = register("spectatorsGenerateChunks", GameRulesCategory.PLAYER, BooleanValue.method_26679(true));
   public static final RuleKey<IntegerValue> field_1054 = register("spawnRadius", GameRulesCategory.PLAYER, IntegerValue.method_9276(10));
   public static final RuleKey<BooleanValue> field_1030 = register("disableElytraMovementCheck", GameRulesCategory.PLAYER, BooleanValue.method_26679(false));
   public static final RuleKey<IntegerValue> field_1027 = register("maxEntityCramming", GameRulesCategory.MOBS, IntegerValue.method_9276(24));
   public static final RuleKey<BooleanValue> field_1025 = register("doWeatherCycle", GameRulesCategory.UPDATES, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1029 = register("doLimitedCrafting", GameRulesCategory.PLAYER, BooleanValue.method_26679(false));
   public static final RuleKey<IntegerValue> field_1055 = register("maxCommandChainLength", GameRulesCategory.MISC, IntegerValue.method_9276(65536));
   public static final RuleKey<BooleanValue> field_1053 = register("announceAdvancements", GameRulesCategory.CHAT, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1045 = register("disableRaids", GameRulesCategory.MOBS, BooleanValue.method_26679(false));
   public static final RuleKey<BooleanValue> field_1052 = register("doInsomnia", GameRulesCategory.SPAWNING, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1046 = register(
      "doImmediateRespawn", GameRulesCategory.PLAYER, BooleanValue.method_26677(false, (var0, var1) -> {
         for (class_9359 var5 : var0.method_1600().method_39951()) {
            var5.field_47794.method_4156(new class_2161(class_2161.field_10782, !var1.method_26681() ? 0.0F : 1.0F));
         }
      })
   );
   public static final RuleKey<BooleanValue> field_1048 = register("drowningDamage", GameRulesCategory.PLAYER, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1044 = register("fallDamage", GameRulesCategory.PLAYER, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1032 = register("fireDamage", GameRulesCategory.PLAYER, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1036 = register("doPatrolSpawning", GameRulesCategory.SPAWNING, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1041 = register("doTraderSpawning", GameRulesCategory.SPAWNING, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1042 = register("forgiveDeadPlayers", GameRulesCategory.MOBS, BooleanValue.method_26679(true));
   public static final RuleKey<BooleanValue> field_1039 = register("universalAnger", GameRulesCategory.MOBS, BooleanValue.method_26679(false));
   private final Map<RuleKey<?>, RuleValue<?>> field_1050;

   private static <T extends RuleValue<T>> RuleKey<T> register(String var0, GameRulesCategory var1, class_3275<T> var2) {
      RuleKey var5 = new RuleKey(var0, var1);
      class_3275 var6 = GAME_RULES.put(var5, var2);
      if (var6 == null) {
         return var5;
      } else {
         throw new IllegalStateException("Duplicate game rule registration for " + var0);
      }
   }

   public GameRules(DynamicLike<?> var1) {
      this();
      this.method_1293(var1);
   }

   public GameRules() {
      this.field_1050 = GAME_RULES.entrySet()
         .stream()
         .collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((class_3275)var0.getValue()).method_14954()));
   }

   private GameRules(Map<RuleKey<?>, RuleValue<?>> var1) {
      this.field_1050 = var1;
   }

   public <T extends RuleValue<T>> T method_1287(RuleKey<T> var1) {
      return (T)this.field_1050.get(var1);
   }

   public CompoundNBT method_1284() {
      CompoundNBT var3 = new CompoundNBT();
      this.field_1050.forEach((var1, var2) -> var3.method_25941(RuleKey.method_34216(var1), var2.method_42124()));
      return var3;
   }

   private void method_1293(DynamicLike<?> var1) {
      this.field_1050.forEach((var1x, var2) -> var1.get(RuleKey.method_34216(var1x)).asString().result().ifPresent(var2::method_42118));
   }

   public GameRules clone() {
      return new GameRules(
         this.field_1050.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((RuleValue)var0.getValue()).method_42119()))
      );
   }

   public static void method_1289(class_2237 var0) {
      GAME_RULES.forEach((var1, var2) -> method_1294(var0, (RuleKey<?>)var1, (class_3275<?>)var2));
   }

   private static <T extends RuleValue<T>> void method_1294(class_2237 var0, RuleKey<?> var1, class_3275<?> var2) {
      var0.method_10289(var1, var2);
      var2.method_14955(var0, var1);
   }

   public void method_1292(GameRules var1, class_341 var2) {
      var1.field_1050.keySet().forEach(var3 -> this.method_1286((RuleKey<?>)var3, var1, var2));
   }

   private <T extends RuleValue<T>> void method_1286(RuleKey<T> var1, GameRules var2, class_341 var3) {
      RuleValue var6 = var2.<RuleValue>method_1287(var1);
      this.method_1287(var1).method_42123((T)var6, var3);
   }

   public boolean getBoolean(RuleKey<BooleanValue> var1) {
      return this.<BooleanValue>method_1287(var1).method_26681();
   }

   public int method_1295(RuleKey<IntegerValue> var1) {
      return this.<IntegerValue>method_1287(var1).method_9272();
   }
}
