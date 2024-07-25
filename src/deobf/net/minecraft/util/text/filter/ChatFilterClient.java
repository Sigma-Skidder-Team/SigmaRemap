package net.minecraft.util.text.filter;

import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import remapped.class_6539;
import remapped.class_7665;

public class ChatFilterClient implements AutoCloseable {
   private static final Logger field_244549_a = LogManager.getLogger();
   private static final AtomicInteger field_244550_b = new AtomicInteger(1);
   private static final ThreadFactory field_244551_c = p_244570_0_ -> {
      Thread var3 = new Thread(p_244570_0_);
      var3.setName("Chat-Filter-Worker-" + field_244550_b.getAndIncrement());
      return var3;
   };
   private final URL field_244552_d = null;
   private final URL field_244553_e = null;
   private final URL field_244554_f = null;
   private final String field_244555_g = null;
   private final int field_244556_h = 0;
   private final String field_244557_i = null;
   private final ChatFilterClient$class_52 field_244558_j = null;
   private final ExecutorService field_244559_k = null;

   private void func_244568_a(GameProfile p_244568_1_, URL p_244568_2_, Executor p_244568_3_) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("server", this.field_244557_i);
      var6.addProperty("room", "Chat");
      var6.addProperty("user_id", p_244568_1_.getId().toString());
      var6.addProperty("user_display_name", p_244568_1_.getName());
      p_244568_3_.execute(() -> {
         try {
            this.func_244573_b(var6, p_244568_2_);
         } catch (Exception var7) {
            field_244549_a.warn("Failed to send join/leave packet to {} for player {}", p_244568_2_, p_244568_1_, var7);
         }
      });
   }

   private CompletableFuture<Optional<String>> func_244567_a(
      GameProfile p_244567_1_, String p_244567_2_, ChatFilterClient$class_52 p_244567_3_, Executor p_244567_4_
   ) {
      if (p_244567_2_.isEmpty()) {
         return CompletableFuture.<Optional<String>>completedFuture(Optional.<String>of(""));
      } else {
         JsonObject var7 = new JsonObject();
         var7.addProperty("rule", 0);
         var7.addProperty("server", this.field_244557_i);
         var7.addProperty("room", "Chat");
         var7.addProperty("player", p_244567_1_.getId().toString());
         var7.addProperty("player_display_name", p_244567_1_.getName());
         var7.addProperty("text", p_244567_2_);
         return CompletableFuture.<Optional<String>>supplyAsync(() -> {
            try {
               JsonObject flag = this.func_244564_a(var7, this.field_244552_d);
               boolean s = class_6539.method_29772(flag, "response", false);
               if (s) {
                  return Optional.<String>of(p_244567_2_);
               } else {
                  String i = class_6539.method_29797(flag, "hashed", (String)null);
                  if (i == null) {
                     return Optional.<String>empty();
                  } else {
                     int var9 = class_6539.method_29787(flag, "hashes").size();
                     return p_244567_3_.shouldIgnore(i, var9) ? Optional.<String>empty() : Optional.<String>of(i);
                  }
               }
            } catch (Exception var10) {
               field_244549_a.warn("Failed to validate message '{}'", p_244567_2_, var10);
               return Optional.<String>empty();
            }
         }, p_244567_4_);
      }
   }

   @Override
   public void close() {
      this.field_244559_k.shutdownNow();
   }

   private void func_244569_a(InputStream p_244569_1_) throws IOException {
      byte[] var4 = new byte[1024];

      while (p_244569_1_.read(var4) != -1) {
      }
   }

   private JsonObject func_244564_a(JsonObject p_244564_1_, URL p_244564_2_) throws IOException {
      HttpURLConnection inputstream = this.func_244575_c(p_244564_1_, p_244564_2_);

      JsonObject var8;
      try (InputStream var6 = inputstream.getInputStream()) {
         if (inputstream.getResponseCode() == 204) {
            return new JsonObject();
         }

         try {
            var8 = Streams.parse(new JsonReader(new InputStreamReader(var6))).getAsJsonObject();
         } finally {
            this.func_244569_a(var6);
         }
      }

      return var8;
   }

   private void func_244573_b(JsonObject p_244573_1_, URL p_244573_2_) throws IOException {
      HttpURLConnection inputstream = this.func_244575_c(p_244573_1_, p_244573_2_);

      try (InputStream var6 = inputstream.getInputStream()) {
         this.func_244569_a(var6);
      }
   }

   private HttpURLConnection func_244575_c(JsonObject p_244575_1_, URL p_244575_2_) throws IOException {
      HttpURLConnection i = (HttpURLConnection)p_244575_2_.openConnection();
      i.setConnectTimeout(15000);
      i.setReadTimeout(2000);
      i.setUseCaches(false);
      i.setDoOutput(true);
      i.setDoInput(true);
      i.setRequestMethod("POST");
      i.setRequestProperty("Content-Type", "application/json; charset=utf-8");
      i.setRequestProperty("Accept", "application/json");
      i.setRequestProperty("Authorization", "Basic " + this.field_244555_g);
      i.setRequestProperty("User-Agent", "Minecraft server" + class_7665.method_34674().getName());

      try (OutputStreamWriter var6 = new OutputStreamWriter(i.getOutputStream(), StandardCharsets.UTF_8)) {
         JsonWriter var8 = new JsonWriter(var6);
         Throwable var9 = null;

         try {
            Streams.write(p_244575_1_, var8);
         } catch (Throwable var32) {
            var9 = var32;
            throw var32;
         } finally {
            if (var8 != null) {
               if (var9 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var31) {
                     var9.addSuppressed(var31);
                  }
               } else {
                  var8.close();
               }
            }
         }
      }

      int var36 = i.getResponseCode();
      if (var36 >= 200 && var36 < 300) {
         return i;
      } else {
         throw new ChatFilterClient$class_51(var36 + " " + i.getResponseMessage(), null);
      }
   }

   public IChatFilter func_244566_a(GameProfile p_244566_1_) {
      return new ChatFilterClient$class_53(this, p_244566_1_, null);
   }

   private ChatFilterClient() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
