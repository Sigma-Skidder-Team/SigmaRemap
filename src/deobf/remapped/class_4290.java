package remapped;

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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_4290<K, V extends class_8227<K>> {
   public static final Logger field_20817 = LogManager.getLogger();
   private static final Gson field_20816 = new GsonBuilder().setPrettyPrinting().create();
   private final File field_20814;
   private final Map<String, V> field_20815 = Maps.newHashMap();

   public class_4290(File var1) {
      this.field_20814 = var1;
   }

   public File method_19921() {
      return this.field_20814;
   }

   public void method_19928(V var1) {
      this.field_20815.put(this.method_19930((K)var1.method_37661()), (V)var1);

      try {
         this.method_19922();
      } catch (IOException var5) {
         field_20817.warn("Could not save the list after adding a user.", var5);
      }
   }

   @Nullable
   public V method_19927(K var1) {
      this.method_19932();
      return this.field_20815.get(this.method_19930((K)var1));
   }

   public void method_19925(K var1) {
      this.field_20815.remove(this.method_19930((K)var1));

      try {
         this.method_19922();
      } catch (IOException var5) {
         field_20817.warn("Could not save the list after removing a user.", var5);
      }
   }

   public void method_19926(class_8227<K> var1) {
      this.method_19925((K)var1.method_37661());
   }

   public String[] method_19929() {
      return this.field_20815.keySet().<String>toArray(new String[this.field_20815.size()]);
   }

   public boolean method_19931() {
      return this.field_20815.size() < 1;
   }

   public String method_19930(K var1) {
      return var1.toString();
   }

   public boolean method_19933(K var1) {
      return this.field_20815.containsKey(this.method_19930((K)var1));
   }

   private void method_19932() {
      ArrayList var3 = Lists.newArrayList();

      for (class_8227 var5 : this.field_20815.values()) {
         if (var5.method_37663()) {
            var3.add(var5.method_37661());
         }
      }

      for (Object var7 : var3) {
         this.field_20815.remove(this.method_19930((K)var7));
      }
   }

   public abstract class_8227<K> method_19924(JsonObject var1);

   public Collection<V> method_19919() {
      return this.field_20815.values();
   }

   public void method_19922() throws IOException {
      JsonArray var3 = new JsonArray();
      this.field_20815.values().stream().<JsonObject>map(var0 -> Util.method_44659(new JsonObject(), var0::method_37664)).forEach(var3::add);

      try (BufferedWriter var4 = Files.newWriter(this.field_20814, StandardCharsets.UTF_8)) {
         field_20816.toJson(var3, var4);
      }
   }

   public void method_19920() throws IOException {
      if (this.field_20814.exists()) {
         try (BufferedReader var3 = Files.newReader(this.field_20814, StandardCharsets.UTF_8)) {
            JsonArray var5 = (JsonArray)field_20816.fromJson(var3, JsonArray.class);
            this.field_20815.clear();

            for (JsonElement var7 : var5) {
               JsonObject var8 = class_6539.method_29782(var7, "entry");
               class_8227 var9 = this.method_19924(var8);
               if (var9.method_37661() != null) {
                  this.field_20815.put(this.method_19930((K)var9.method_37661()), (V)var9);
               }
            }
         }
      }
   }
}
