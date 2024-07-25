package remapped;

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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5969 {
   private static final Logger field_30400 = LogManager.getLogger();
   private static boolean field_30397;
   private final Map<String, class_9499> field_30393 = Maps.newConcurrentMap();
   private final Map<UUID, class_9499> field_30399 = Maps.newConcurrentMap();
   private final GameProfileRepository field_30396;
   private final Gson field_30394 = new GsonBuilder().create();
   private final File field_30395;
   private final AtomicLong field_30401 = new AtomicLong();

   public class_5969(GameProfileRepository var1, File var2) {
      this.field_30396 = var1;
      this.field_30395 = var2;
      Lists.reverse(this.method_27267()).forEach(this::method_27259);
   }

   private void method_27259(class_9499 var1) {
      GameProfile var4 = var1.method_43857();
      var1.method_43858(this.method_27260());
      String var5 = var4.getName();
      if (var5 != null) {
         this.field_30393.put(var5.toLowerCase(Locale.ROOT), var1);
      }

      UUID var6 = var4.getId();
      if (var6 != null) {
         this.field_30399.put(var6, var1);
      }
   }

   @Nullable
   private static GameProfile method_27261(GameProfileRepository var0, String var1) {
      AtomicReference var4 = new AtomicReference();
      class_4682 var5 = new class_4682(var4);
      var0.findProfilesByNames(new String[]{var1}, Agent.MINECRAFT, var5);
      GameProfile var6 = (GameProfile)var4.get();
      if (!method_27257() && var6 == null) {
         UUID var7 = class_704.method_3242(new GameProfile((UUID)null, var1));
         var6 = new GameProfile(var7, var1);
      }

      return var6;
   }

   public static void method_27263(boolean var0) {
      field_30397 = var0;
   }

   private static boolean method_27257() {
      return field_30397;
   }

   public void method_27258(GameProfile var1) {
      Calendar var4 = Calendar.getInstance();
      var4.setTime(new Date());
      var4.add(2, 1);
      Date var5 = var4.getTime();
      class_9499 var6 = new class_9499(var1, var5, null);
      this.method_27259(var6);
      this.method_27264();
   }

   private long method_27260() {
      return this.field_30401.incrementAndGet();
   }

   @Nullable
   public GameProfile method_27255(String var1) {
      String var4 = var1.toLowerCase(Locale.ROOT);
      class_9499 var5 = this.field_30393.get(var4);
      boolean var6 = false;
      if (var5 != null && new Date().getTime() >= class_9499.method_43859(var5).getTime()) {
         this.field_30399.remove(var5.method_43857().getId());
         this.field_30393.remove(var5.method_43857().getName().toLowerCase(Locale.ROOT));
         var6 = true;
         var5 = null;
      }

      GameProfile var7;
      if (var5 == null) {
         var7 = method_27261(this.field_30396, var4);
         if (var7 != null) {
            this.method_27258(var7);
            var6 = false;
         }
      } else {
         var5.method_43858(this.method_27260());
         var7 = var5.method_43857();
      }

      if (var6) {
         this.method_27264();
      }

      return var7;
   }

   @Nullable
   public GameProfile method_27254(UUID var1) {
      class_9499 var4 = this.field_30399.get(var1);
      if (var4 != null) {
         var4.method_43858(this.method_27260());
         return var4.method_43857();
      } else {
         return null;
      }
   }

   private static DateFormat method_27266() {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
   }

   public List<class_9499> method_27267() {
      ArrayList var3 = Lists.newArrayList();

      try (BufferedReader var4 = Files.newReader(this.field_30395, StandardCharsets.UTF_8)) {
         JsonArray var6 = (JsonArray)this.field_30394.fromJson(var4, JsonArray.class);
         if (var6 == null) {
            return var3;
         }

         DateFormat var23 = method_27266();
         var6.forEach(var2 -> {
            class_9499 var5 = method_27268(var2, var23);
            if (var5 != null) {
               var3.add(var5);
            }
         });
      } catch (FileNotFoundException var21) {
      } catch (IOException | JsonParseException var22) {
         field_30400.warn("Failed to load profile cache {}", this.field_30395, var22);
      }

      return var3;
   }

   public void method_27264() {
      JsonArray var3 = new JsonArray();
      DateFormat var4 = method_27266();
      this.method_27265(1000).forEach(var2 -> var3.add(method_27256(var2, var4)));
      String var5 = this.field_30394.toJson(var3);

      try (BufferedWriter var6 = Files.newWriter(this.field_30395, StandardCharsets.UTF_8)) {
         var6.write(var5);
      } catch (IOException var19) {
      }
   }

   private Stream<class_9499> method_27265(int var1) {
      return ImmutableList.copyOf(this.field_30399.values())
         .stream()
         .sorted(Comparator.<class_9499, Long>comparing(class_9499::method_43860).reversed())
         .limit((long)var1);
   }

   private static JsonElement method_27256(class_9499 var0, DateFormat var1) {
      JsonObject var4 = new JsonObject();
      var4.addProperty("name", var0.method_43857().getName());
      UUID var5 = var0.method_43857().getId();
      var4.addProperty("uuid", var5 != null ? var5.toString() : "");
      var4.addProperty("expiresOn", var1.format(var0.method_43862()));
      return var4;
   }

   @Nullable
   private static class_9499 method_27268(JsonElement var0, DateFormat var1) {
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

               return new class_9499(new GameProfile(var11, var9), var10, null);
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
