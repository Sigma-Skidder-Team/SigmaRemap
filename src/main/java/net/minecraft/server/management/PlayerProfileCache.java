package net.minecraft.server.management;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import mapped.Class8461;
import mapped.Class9731;
import net.minecraft.entity.player.PlayerEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerProfileCache {
   private static final Logger field39634 = LogManager.getLogger();
   private static boolean field39635;
   private final Map<String, Class9731> field39636 = Maps.newConcurrentMap();
   private final Map<UUID, Class9731> field39637 = Maps.newConcurrentMap();
   private final GameProfileRepository field39638;
   private final Gson field39639 = new GsonBuilder().create();
   private final File field39640;
   private final AtomicLong field39641 = new AtomicLong();

   public PlayerProfileCache(GameProfileRepository var1, File var2) {
      this.field39638 = var1;
      this.field39640 = var2;
      Lists.reverse(this.method31795()).forEach(this::method31786);
   }

   private void method31786(Class9731 var1) {
      GameProfile var4 = var1.method38116();
      var1.method38118(this.method31791());
      String var5 = var4.getName();
      if (var5 != null) {
         this.field39636.put(var5.toLowerCase(Locale.ROOT), var1);
      }

      UUID var6 = var4.getId();
      if (var6 != null) {
         this.field39637.put(var6, var1);
      }
   }

   @Nullable
   private static GameProfile method31787(GameProfileRepository var0, String var1) {
      AtomicReference var4 = new AtomicReference();
      Class8461 var5 = new Class8461(var4);
      var0.findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var5);
      GameProfile var6 = (GameProfile)var4.get();
      if (!method31789() && var6 == null) {
         UUID var7 = PlayerEntity.method2960(new GameProfile((UUID)null, var1));
         var6 = new GameProfile(var7, var1);
      }

      return var6;
   }

   public static void setOnlineMode(boolean var0) {
      field39635 = var0;
   }

   private static boolean method31789() {
      return field39635;
   }

   public void method31790(GameProfile var1) {
      Calendar var4 = Calendar.getInstance();
      var4.setTime(new Date());
      var4.add(2, 1);
      Date var5 = var4.getTime();
      Class9731 var6 = new Class9731(var1, var5, null);
      this.method31786(var6);
      this.save();
   }

   private long method31791() {
      return this.field39641.incrementAndGet();
   }

   @Nullable
   public GameProfile method31792(String var1) {
      String var4 = var1.toLowerCase(Locale.ROOT);
      Class9731 var5 = this.field39636.get(var4);
      boolean var6 = false;
      if (var5 != null && new Date().getTime() >= Class9731.method38120(var5).getTime()) {
         this.field39637.remove(var5.method38116().getId());
         this.field39636.remove(var5.method38116().getName().toLowerCase(Locale.ROOT));
         var6 = true;
         var5 = null;
      }

      GameProfile var7;
      if (var5 == null) {
         var7 = method31787(this.field39638, var4);
         if (var7 != null) {
            this.method31790(var7);
            var6 = false;
         }
      } else {
         var5.method38118(this.method31791());
         var7 = var5.method38116();
      }

      if (var6) {
         this.save();
      }

      return var7;
   }

   @Nullable
   public GameProfile method31793(UUID var1) {
      Class9731 var4 = this.field39637.get(var1);
      if (var4 != null) {
         var4.method38118(this.method31791());
         return var4.method38116();
      } else {
         return null;
      }
   }

   private static DateFormat method31794() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   }

   public List<Class9731> method31795() {
      ArrayList var3 = Lists.newArrayList();

      try (BufferedReader var4 = Files.newReader(this.field39640, StandardCharsets.UTF_8)) {
         JsonArray var6 = (JsonArray)this.field39639.fromJson(var4, JsonArray.class);
         if (var6 == null) {
            return var3;
         }

         DateFormat var23 = method31794();
         var6.forEach(var2 -> {
            Class9731 var5 = method31799(var2, var23);
            if (var5 != null) {
               var3.add(var5);
            }
         });
      } catch (FileNotFoundException var21) {
      } catch (IOException | JsonParseException var22) {
         field39634.warn("Failed to load profile cache {}", this.field39640, var22);
      }

      return var3;
   }

   public void save() {
      JsonArray var3 = new JsonArray();
      DateFormat var4 = method31794();
      this.method31797(1000).forEach(var2 -> var3.add(method31798(var2, var4)));
      String var5 = this.field39639.toJson(var3);

      try (BufferedWriter var6 = Files.newWriter(this.field39640, StandardCharsets.UTF_8)) {
         var6.write(var5);
      } catch (IOException var19) {
      }
   }

   private Stream<Class9731> method31797(int var1) {
      return ImmutableList.copyOf(this.field39637.values())
         .stream()
         .sorted(Comparator.<Class9731, Long>comparing(Class9731::method38119).reversed())
         .limit((long)var1);
   }

   private static JsonElement method31798(Class9731 var0, DateFormat var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var0.method38116().getName());
      UUID var5 = var0.method38116().getId();
      var4.addProperty("uuid", var5 != null ? var5.toString() : "");
      var4.addProperty("expiresOn", var1.format(var0.method38117()));
      return var4;
   }

   @Nullable
   private static Class9731 method31799(JsonElement var0, DateFormat var1) {
      if (var0.isJsonObject()) {
         JsonObject var4 = var0.getAsJsonObject();
         JsonElement var5 = var4.get("name");
         JsonElement var6 = var4.get("uuid");
         JsonElement var7 = var4.get("expiresOn");
         if (var5 != null && var6 != null) {
            String var8 = var6.getAsString();
            String var9 = var5.getAsString();
            Date var10 = null;
            if (var7 != null) {
               try {
                  var10 = var1.parse(var7.getAsString());
               } catch (ParseException var14) {
               }
            }

            if (var9 != null && var8 != null && var10 != null) {
               UUID var11;
               try {
                  var11 = UUID.fromString(var8);
               } catch (Throwable var13) {
                  return null;
               }

               return new Class9731(new GameProfile(var11, var9), var10, null);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
