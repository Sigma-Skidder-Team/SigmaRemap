package net.minecraft.world;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import mapped.*;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SEntityStatusPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GameRules {
   private static final Logger field24221 = LogManager.getLogger();
   private static final Map<Class9221<?>, Class7989<?>> field24222 = Maps.newTreeMap(
      Comparator.<Class9221, String>comparing(var0 -> Class9221.method34675(var0))
   );
   public static final Class9221<Class7466> field24223 = method17127("doFireTick", Class2155.field14135, Class7466.method24178(true));
   public static final Class9221<Class7466> field24224 = method17127("mobGriefing", Class2155.field14132, Class7466.method24178(true));
   public static final Class9221<Class7466> field24225 = method17127("keepInventory", Class2155.field14131, Class7466.method24178(false));
   public static final Class9221<Class7466> field24226 = method17127("doMobSpawning", Class2155.field14133, Class7466.method24178(true));
   public static final Class9221<Class7466> field24227 = method17127("doMobLoot", Class2155.field14134, Class7466.method24178(true));
   public static final Class9221<Class7466> field24228 = method17127("doTileDrops", Class2155.field14134, Class7466.method24178(true));
   public static final Class9221<Class7466> field24229 = method17127("doEntityDrops", Class2155.field14134, Class7466.method24178(true));
   public static final Class9221<Class7466> field24230 = method17127("commandBlockOutput", Class2155.field14136, Class7466.method24178(true));
   public static final Class9221<Class7466> field24231 = method17127("naturalRegeneration", Class2155.field14131, Class7466.method24178(true));
   public static final Class9221<Class7466> field24232 = method17127("doDaylightCycle", Class2155.field14135, Class7466.method24178(true));
   public static final Class9221<Class7466> field24233 = method17127("logAdminCommands", Class2155.field14136, Class7466.method24178(true));
   public static final Class9221<Class7466> field24234 = method17127("showDeathMessages", Class2155.field14136, Class7466.method24178(true));
   public static final Class9221<Class7464> field24235 = method17127("randomTickSpeed", Class2155.field14135, Class7464.method24169(3));
   public static final Class9221<Class7466> field24236 = method17127("sendCommandFeedback", Class2155.field14136, Class7466.method24178(true));
   public static final Class9221<Class7466> field24237 = method17127("reducedDebugInfo", Class2155.field14137, Class7466.method24179(false, (var0, var1) -> {
      byte var4 = (byte)(!var1.method24174() ? 23 : 22);

      for (ServerPlayerEntity var6 : var0.getPlayerList().getPlayers()) {
         var6.connection.sendPacket(new SEntityStatusPacket(var6, var4));
      }
   }));
   public static final Class9221<Class7466> field24238 = method17127("spectatorsGenerateChunks", Class2155.field14131, Class7466.method24178(true));
   public static final Class9221<Class7464> field24239 = method17127("spawnRadius", Class2155.field14131, Class7464.method24169(10));
   public static final Class9221<Class7466> field24240 = method17127("disableElytraMovementCheck", Class2155.field14131, Class7466.method24178(false));
   public static final Class9221<Class7464> field24241 = method17127("maxEntityCramming", Class2155.field14132, Class7464.method24169(24));
   public static final Class9221<Class7466> field24242 = method17127("doWeatherCycle", Class2155.field14135, Class7466.method24178(true));
   public static final Class9221<Class7466> field24243 = method17127("doLimitedCrafting", Class2155.field14131, Class7466.method24178(false));
   public static final Class9221<Class7464> field24244 = method17127("maxCommandChainLength", Class2155.field14137, Class7464.method24169(65536));
   public static final Class9221<Class7466> ANNOUNCE_ADVANCEMENTS = method17127("announceAdvancements", Class2155.field14136, Class7466.method24178(true));
   public static final Class9221<Class7466> field24246 = method17127("disableRaids", Class2155.field14132, Class7466.method24178(false));
   public static final Class9221<Class7466> field24247 = method17127("doInsomnia", Class2155.field14133, Class7466.method24178(true));
   public static final Class9221<Class7466> field24248 = method17127("doImmediateRespawn", Class2155.field14131, Class7466.method24179(false, (var0, var1) -> {
      for (ServerPlayerEntity var5 : var0.getPlayerList().getPlayers()) {
         var5.connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24571, !var1.method24174() ? 0.0F : 1.0F));
      }
   }));
   public static final Class9221<Class7466> field24249 = method17127("drowningDamage", Class2155.field14131, Class7466.method24178(true));
   public static final Class9221<Class7466> field24250 = method17127("fallDamage", Class2155.field14131, Class7466.method24178(true));
   public static final Class9221<Class7466> field24251 = method17127("fireDamage", Class2155.field14131, Class7466.method24178(true));
   public static final Class9221<Class7466> field24252 = method17127("doPatrolSpawning", Class2155.field14133, Class7466.method24178(true));
   public static final Class9221<Class7466> field24253 = method17127("doTraderSpawning", Class2155.field14133, Class7466.method24178(true));
   public static final Class9221<Class7466> field24254 = method17127("forgiveDeadPlayers", Class2155.field14132, Class7466.method24178(true));
   public static final Class9221<Class7466> field24255 = method17127("universalAnger", Class2155.field14132, Class7466.method24178(false));
   private final Map<Class9221<?>, Class7465<?>> field24256;

   private static <T extends Class7465<T>> Class9221<T> method17127(String var0, Class2155 var1, Class7989<T> var2) {
      Class9221 var5 = new Class9221(var0, var1);
      Class7989 var6 = field24222.put(var5, var2);
      if (var6 == null) {
         return var5;
      } else {
         throw new IllegalStateException("Duplicate game rule registration for " + var0);
      }
   }

   public GameRules(DynamicLike<?> var1) {
      this();
      this.method17130(var1);
   }

   public GameRules() {
      this.field24256 = field24222.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((Class7989)var0.getValue()).method27159()));
   }

   private GameRules(Map<Class9221<?>, Class7465<?>> var1) {
      this.field24256 = var1;
   }

   public <T extends Class7465<T>> T get(Class9221<T> var1) {
      return (T)this.field24256.get(var1);
   }

   public CompoundNBT method17129() {
      CompoundNBT var3 = new CompoundNBT();
      this.field24256.forEach((var1, var2) -> var3.method109(Class9221.method34675(var1), var2.method24156()));
      return var3;
   }

   private void method17130(DynamicLike<?> var1) {
      this.field24256.forEach((var1x, var2) -> var1.get(Class9221.method34675(var1x)).asString().result().ifPresent(var2::method24157));
   }

   public GameRules clone() {
      return new GameRules(
         this.field24256.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((Class7465)var0.getValue()).method24165()))
      );
   }

   public static void method17131(Class7567 var0) {
      field24222.forEach((var1, var2) -> method17132(var0, var1, var2));
   }

   private static <T extends Class7465<T>> void method17132(Class7567 var0, Class9221<?> var1, Class7989<?> var2) {
      var0.method24776((Class9221) var1, var2);
      var2.method27160(var0, (Class9221) var1);
   }

   public void method17133(GameRules var1, MinecraftServer var2) {
      var1.field24256.keySet().forEach(var3 -> this.method17134((Class9221<?>)var3, var1, var2));
   }

   private <T extends Class7465<T>> void method17134(Class9221<T> var1, GameRules var2, MinecraftServer var3) {
      T var6 = var2.get(var1);
      this.get(var1).method24164(var6, var3);
   }

   public boolean getBoolean(Class9221<Class7466> var1) {
      return this.<Class7466>get(var1).method24174();
   }

   public int method17136(Class9221<Class7464> var1) {
      return this.<Class7464>get(var1).method24155();
   }

   // $VF: synthetic method
   public static Logger method17146() {
      return field24221;
   }
}
