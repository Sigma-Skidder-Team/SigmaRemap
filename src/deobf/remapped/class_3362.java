package remapped;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3362 {
   private static final Logger field_16566 = LogManager.getLogger();
   private static final Gson field_16576 = new GsonBuilder()
      .registerTypeAdapter(class_3604.class, new class_8744())
      .registerTypeAdapter(class_4639.class, new class_6690())
      .setPrettyPrinting()
      .create();
   private static final TypeToken<Map<class_4639, class_3604>> field_16572 = new class_331();
   private final DataFixer field_16570;
   private final class_8704 field_16564;
   private final File field_16573;
   private final Map<class_3139, class_3604> field_16569 = Maps.newLinkedHashMap();
   private final Set<class_3139> field_16575 = Sets.newLinkedHashSet();
   private final Set<class_3139> field_16577 = Sets.newLinkedHashSet();
   private final Set<class_3139> field_16565 = Sets.newLinkedHashSet();
   private class_9359 field_16567;
   private class_3139 field_16571;
   private boolean field_16568 = true;

   public class_3362(DataFixer var1, class_8704 var2, class_8873 var3, File var4, class_9359 var5) {
      this.field_16570 = var1;
      this.field_16564 = var2;
      this.field_16573 = var4;
      this.field_16567 = var5;
      this.method_15397(var3);
   }

   public void method_15407(class_9359 var1) {
      this.field_16567 = var1;
   }

   public void method_15388() {
      for (class_911 var4 : class_8807.method_40477()) {
         var4.method_3901(this);
      }
   }

   public void method_15394(class_8873 var1) {
      this.method_15388();
      this.field_16569.clear();
      this.field_16575.clear();
      this.field_16577.clear();
      this.field_16565.clear();
      this.field_16568 = true;
      this.field_16571 = null;
      this.method_15397(var1);
   }

   private void method_15392(class_8873 var1) {
      for (class_3139 var5 : var1.method_40816()) {
         this.method_15405(var5);
      }
   }

   private void method_15402() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field_16569.entrySet()) {
         if (((class_3604)var5.getValue()).method_16811()) {
            var3.add(var5.getKey());
            this.field_16565.add((class_3139)var5.getKey());
         }
      }

      for (class_3139 var7 : var3) {
         this.method_15393(var7);
      }
   }

   private void method_15395(class_8873 var1) {
      for (class_3139 var5 : var1.method_40816()) {
         if (var5.method_14518().isEmpty()) {
            this.method_15396(var5, "");
            var5.method_14517().method_23509(this.field_16567);
         }
      }
   }

   private void method_15397(class_8873 var1) {
      if (this.field_16573.isFile()) {
         try {
            JsonReader var4 = new JsonReader(new StringReader(Files.toString(this.field_16573, StandardCharsets.UTF_8)));
            Throwable var5 = null;

            try {
               var4.setLenient(false);
               Dynamic var6 = new Dynamic(JsonOps.INSTANCE, Streams.parse(var4));
               if (!var6.get("DataVersion").asNumber().result().isPresent()) {
                  var6 = var6.set("DataVersion", var6.createInt(1343));
               }

               var6 = this.field_16570
                  .update(class_5397.field_27545.method_24571(), var6, var6.get("DataVersion").asInt(0), class_7665.method_34674().getWorldVersion());
               var6 = var6.remove("DataVersion");
               Map var7 = (Map)field_16576.getAdapter(field_16572).fromJsonTree((JsonElement)var6.getValue());
               if (var7 == null) {
                  throw new JsonParseException("Found null for advancements");
               }

               Stream var8 = var7.entrySet().stream().sorted(Comparator.comparing(Entry::getValue));

               for (Entry var10 : (List)var8.collect(Collectors.toList())) {
                  class_3139 var11 = var1.method_40818((class_4639)var10.getKey());
                  if (var11 == null) {
                     field_16566.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", var10.getKey(), this.field_16573);
                  } else {
                     this.method_15391(var11, (class_3604)var10.getValue());
                  }
               }
            } catch (Throwable var21) {
               var5 = var21;
               throw var21;
            } finally {
               if (var4 != null) {
                  if (var5 != null) {
                     try {
                        var4.close();
                     } catch (Throwable var20) {
                        var5.addSuppressed(var20);
                     }
                  } else {
                     var4.close();
                  }
               }
            }
         } catch (JsonParseException var23) {
            field_16566.error("Couldn't parse player advancements in {}", this.field_16573, var23);
         } catch (IOException var24) {
            field_16566.error("Couldn't access player advancements in {}", this.field_16573, var24);
         }
      }

      this.method_15395(var1);
      this.method_15402();
      this.method_15392(var1);
   }

   public void method_15398() {
      HashMap var3 = Maps.newHashMap();

      for (Entry var5 : this.field_16569.entrySet()) {
         class_3604 var6 = (class_3604)var5.getValue();
         if (var6.method_16818()) {
            var3.put(((class_3139)var5.getKey()).method_14520(), var6);
         }
      }

      if (this.field_16573.getParentFile() != null) {
         this.field_16573.getParentFile().mkdirs();
      }

      JsonElement var38 = field_16576.toJsonTree(var3);
      var38.getAsJsonObject().addProperty("DataVersion", class_7665.method_34674().getWorldVersion());

      try (
         FileOutputStream var39 = new FileOutputStream(this.field_16573);
         OutputStreamWriter var7 = new OutputStreamWriter(var39, Charsets.UTF_8.newEncoder());
      ) {
         field_16576.toJson(var38, var7);
      } catch (IOException var37) {
         field_16566.error("Couldn't save player advancements to {}", this.field_16573, var37);
      }
   }

   public boolean method_15396(class_3139 var1, String var2) {
      boolean var5 = false;
      class_3604 var6 = this.method_15389(var1);
      boolean var7 = var6.method_16811();
      if (var6.method_16807(var2)) {
         this.method_15399(var1);
         this.field_16565.add(var1);
         var5 = true;
         if (!var7 && var6.method_16811()) {
            var1.method_14517().method_23509(this.field_16567);
            if (var1.method_14511() != null
               && var1.method_14511().method_35163()
               && this.field_16567.field_41768.method_29537().method_1285(class_291.field_1053)) {
               this.field_16564
                  .method_39983(
                     new TranslationTextComponent(
                        "chat.type.advancement." + var1.method_14511().method_35157().method_15385(), this.field_16567.method_19839(), var1.method_14512()
                     ),
                     ChatType.SYSTEM,
                     Util.NIL_UUID
                  );
            }
         }
      }

      if (var6.method_16811()) {
         this.method_15393(var1);
      }

      return var5;
   }

   public boolean method_15403(class_3139 var1, String var2) {
      boolean var5 = false;
      class_3604 var6 = this.method_15389(var1);
      if (var6.method_16816(var2)) {
         this.method_15405(var1);
         this.field_16565.add(var1);
         var5 = true;
      }

      if (!var6.method_16818()) {
         this.method_15393(var1);
      }

      return var5;
   }

   private void method_15405(class_3139 var1) {
      class_3604 var4 = this.method_15389(var1);
      if (!var4.method_16811()) {
         for (Entry var6 : var1.method_14518().entrySet()) {
            class_8984 var7 = var4.method_16820((String)var6.getKey());
            if (var7 != null && !var7.method_41192()) {
               class_5154 var8 = ((class_7353)var6.getValue()).method_33505();
               if (var8 != null) {
                  class_911 var9 = class_8807.method_40478(var8.method_23585());
                  if (var9 != null) {
                     var9.method_3902(this, new class_7787<class_5154>(var8, var1, (String)var6.getKey()));
                  }
               }
            }
         }
      }
   }

   private void method_15399(class_3139 var1) {
      class_3604 var4 = this.method_15389(var1);

      for (Entry var6 : var1.method_14518().entrySet()) {
         class_8984 var7 = var4.method_16820((String)var6.getKey());
         if (var7 != null && (var7.method_41192() || var4.method_16811())) {
            class_5154 var8 = ((class_7353)var6.getValue()).method_33505();
            if (var8 != null) {
               class_911 var9 = class_8807.method_40478(var8.method_23585());
               if (var9 != null) {
                  var9.method_3900(this, new class_7787<class_5154>(var8, var1, (String)var6.getKey()));
               }
            }
         }
      }
   }

   public void method_15404(class_9359 var1) {
      if (this.field_16568 || !this.field_16577.isEmpty() || !this.field_16565.isEmpty()) {
         HashMap var4 = Maps.newHashMap();
         LinkedHashSet var5 = Sets.newLinkedHashSet();
         LinkedHashSet var6 = Sets.newLinkedHashSet();

         for (class_3139 var8 : this.field_16565) {
            if (this.field_16575.contains(var8)) {
               var4.put(var8.method_14520(), this.field_16569.get(var8));
            }
         }

         for (class_3139 var10 : this.field_16577) {
            if (!this.field_16575.contains(var10)) {
               var6.add(var10.method_14520());
            } else {
               var5.add(var10);
            }
         }

         if (this.field_16568 || !var4.isEmpty() || !var5.isEmpty() || !var6.isEmpty()) {
            var1.field_47794.method_4156(new class_6642(this.field_16568, var5, var6, var4));
            this.field_16577.clear();
            this.field_16565.clear();
         }
      }

      this.field_16568 = false;
   }

   public void method_15406(class_3139 var1) {
      class_3139 var4 = this.field_16571;
      if (var1 != null && var1.method_14510() == null && var1.method_14511() != null) {
         this.field_16571 = var1;
      } else {
         this.field_16571 = null;
      }

      if (var4 != this.field_16571) {
         this.field_16567.field_47794.method_4156(new class_4472(this.field_16571 != null ? this.field_16571.method_14520() : null));
      }
   }

   public class_3604 method_15389(class_3139 var1) {
      class_3604 var4 = this.field_16569.get(var1);
      if (var4 == null) {
         var4 = new class_3604();
         this.method_15391(var1, var4);
      }

      return var4;
   }

   private void method_15391(class_3139 var1, class_3604 var2) {
      var2.method_16809(var1.method_14518(), var1.method_14515());
      this.field_16569.put(var1, var2);
   }

   private void method_15393(class_3139 var1) {
      boolean var4 = this.method_15401(var1);
      boolean var5 = this.field_16575.contains(var1);
      if (var4 && !var5) {
         this.field_16575.add(var1);
         this.field_16577.add(var1);
         if (this.field_16569.containsKey(var1)) {
            this.field_16565.add(var1);
         }
      } else if (!var4 && var5) {
         this.field_16575.remove(var1);
         this.field_16577.add(var1);
      }

      if (var4 != var5 && var1.method_14510() != null) {
         this.method_15393(var1.method_14510());
      }

      for (class_3139 var7 : var1.method_14516()) {
         this.method_15393(var7);
      }
   }

   private boolean method_15401(class_3139 var1) {
      for (int var4 = 0; var1 != null && var4 <= 2; var4++) {
         if (var4 == 0 && this.method_15390(var1)) {
            return true;
         }

         if (var1.method_14511() == null) {
            return false;
         }

         class_3604 var5 = this.method_15389(var1);
         if (var5.method_16811()) {
            return true;
         }

         if (var1.method_14511().method_35158()) {
            return false;
         }

         var1 = var1.method_14510();
      }

      return false;
   }

   private boolean method_15390(class_3139 var1) {
      class_3604 var4 = this.method_15389(var1);
      if (var4.method_16811()) {
         return true;
      } else {
         for (class_3139 var6 : var1.method_14516()) {
            if (this.method_15390(var6)) {
               return true;
            }
         }

         return false;
      }
   }
}
