package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class4529<K, V extends Class6789<K>> {
   public static final Logger field21841 = LogManager.getLogger();
   private static final Gson field21842 = new GsonBuilder().setPrettyPrinting().create();
   private final File field21843;
   private final Map<String, V> field21844 = Maps.newHashMap();

   public Class4529(File var1) {
      this.field21843 = var1;
   }

   public File method14435() {
      return this.field21843;
   }

   public void method14436(V var1) {
      this.field21844.put(this.method14434((K)var1.method20686()), (V)var1);

      try {
         this.method14444();
      } catch (IOException var5) {
         field21841.warn("Could not save the list after adding a user.", var5);
      }
   }

   @Nullable
   public V method14437(K var1) {
      this.method14442();
      return this.field21844.get(this.method14434((K)var1));
   }

   public void method14438(K var1) {
      this.field21844.remove(this.method14434((K)var1));

      try {
         this.method14444();
      } catch (IOException var5) {
         field21841.warn("Could not save the list after removing a user.", var5);
      }
   }

   public void method14439(Class6789<K> var1) {
      this.method14438((K)var1.method20686());
   }

   public String[] method14432() {
      return this.field21844.keySet().<String>toArray(new String[this.field21844.size()]);
   }

   public boolean method14440() {
      return this.field21844.size() < 1;
   }

   public String method14434(K var1) {
      return var1.toString();
   }

   public boolean method14441(K var1) {
      return this.field21844.containsKey(this.method14434((K)var1));
   }

   private void method14442() {
      ArrayList var3 = Lists.newArrayList();

      for (Class6789 var5 : this.field21844.values()) {
         if (var5.method20684()) {
            var3.add(var5.method20686());
         }
      }

      for (Object var7 : var3) {
         this.field21844.remove(this.method14434((K)var7));
      }
   }

   public abstract Class6789<K> method14430(JsonObject var1);

   public Collection<V> method14443() {
      return this.field21844.values();
   }

   public void method14444() throws IOException {
      JsonArray var3 = new JsonArray();
      this.field21844.values().stream().<JsonObject>map(var0 -> Util.make(new JsonObject(), var0::method20678)).forEach(var3::add);

      try (BufferedWriter var4 = Files.newWriter(this.field21843, StandardCharsets.UTF_8)) {
         field21842.toJson(var3, var4);
      }
   }

   public void method14445() throws IOException {
      if (this.field21843.exists()) {
         try (BufferedReader var3 = Files.newReader(this.field21843, StandardCharsets.UTF_8)) {
            JsonArray var5 = (JsonArray)field21842.fromJson(var3, JsonArray.class);
            this.field21844.clear();

            for (JsonElement var7 : var5) {
               JsonObject var8 = JSONUtils.method32781(var7, "entry");
               Class6789 var9 = this.method14430(var8);
               if (var9.method20686() != null) {
                  this.field21844.put(this.method14434((K)var9.method20686()), (V)var9);
               }
            }
         }
      }
   }
}
