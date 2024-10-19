package mapped;

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
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.util.Util;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SSelectAdvancementsTabPacket;
import net.minecraft.network.play.server.SAdvancementInfoPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameRules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8019 {
   private static final Logger field34445 = LogManager.getLogger();
   private static final Gson field34446 = new GsonBuilder()
      .registerTypeAdapter(Class2006.class, new Class2576())
      .registerTypeAdapter(ResourceLocation.class, new Class2550())
      .setPrettyPrinting()
      .create();
   private static final TypeToken<Map<ResourceLocation, Class2006>> field34447 = new Class5796();
   private final DataFixer field34448;
   private final Class6395 field34449;
   private final File field34450;
   private final Map<Advancement, Class2006> field34451 = Maps.newLinkedHashMap();
   private final Set<Advancement> field34452 = Sets.newLinkedHashSet();
   private final Set<Advancement> field34453 = Sets.newLinkedHashSet();
   private final Set<Advancement> field34454 = Sets.newLinkedHashSet();
   private ServerPlayerEntity field34455;
   private Advancement field34456;
   private boolean field34457 = true;

   public Class8019(DataFixer var1, Class6395 var2, AdvancementManager var3, File var4, ServerPlayerEntity var5) {
      this.field34448 = var1;
      this.field34449 = var2;
      this.field34450 = var4;
      this.field34455 = var5;
      this.method27408(var3);
   }

   public void method27402(ServerPlayerEntity var1) {
      this.field34455 = var1;
   }

   public void method27403() {
      for (Class4907 var4 : CriteriaTriggers.method37001()) {
         var4.method15051(this);
      }
   }

   public void method27404(AdvancementManager var1) {
      this.method27403();
      this.field34451.clear();
      this.field34452.clear();
      this.field34453.clear();
      this.field34454.clear();
      this.field34457 = true;
      this.field34456 = null;
      this.method27408(var1);
   }

   private void method27405(AdvancementManager var1) {
      for (Advancement var5 : var1.method1066()) {
         this.method27412(var5);
      }
   }

   private void method27406() {
      List<Advancement> var3 = Lists.newArrayList();

      for (Entry<Advancement, Class2006> var5 : this.field34451.entrySet()) {
         if (((Class2006)var5.getValue()).method8489()) {
            var3.add(var5.getKey());
            this.field34454.add((Advancement)var5.getKey());
         }
      }

      for (Advancement var7 : var3) {
         this.method27418(var7);
      }
   }

   private void method27407(AdvancementManager var1) {
      for (Advancement var5 : var1.method1066()) {
         if (var5.method27030().isEmpty()) {
            this.method27410(var5, "");
            var5.method27028().method30722(this.field34455);
         }
      }
   }

   private void method27408(AdvancementManager var1) {
      if (this.field34450.isFile()) {
         try {
            JsonReader var4 = new JsonReader(new StringReader(Files.toString(this.field34450, StandardCharsets.UTF_8)));
            Throwable var5 = null;

            try {
               var4.setLenient(false);
               Dynamic var6 = new Dynamic(JsonOps.INSTANCE, Streams.parse(var4));
               if (!var6.get("DataVersion").asNumber().result().isPresent()) {
                  var6 = var6.set("DataVersion", var6.createInt(1343));
               }

               var6 = this.field34448
                  .update(Class2108.field13756.method8778(), var6, var6.get("DataVersion").asInt(0), SharedConstants.getVersion().getWorldVersion());
               var6 = var6.remove("DataVersion");
               Map<ResourceLocation, Class2006> var7 =field34446.getAdapter(field34447).fromJsonTree((JsonElement)var6.getValue());
               if (var7 == null) {
                  throw new JsonParseException("Found null for advancements");
               }

               Stream<Entry<ResourceLocation, Class2006>>  var8 = var7.entrySet().stream().sorted(Comparator.comparing(Entry::getValue));

               for (Entry var10 : var8.collect(Collectors.toList())) {
                  Advancement var11 = var1.method1065((ResourceLocation)var10.getKey());
                  if (var11 == null) {
                     field34445.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", var10.getKey(), this.field34450);
                  } else {
                     this.method27417(var11, (Class2006)var10.getValue());
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
            field34445.error("Couldn't parse player advancements in {}", this.field34450, var23);
         } catch (IOException var24) {
            field34445.error("Couldn't access player advancements in {}", this.field34450, var24);
         }
      }

      this.method27407(var1);
      this.method27406();
      this.method27405(var1);
   }

   public void method27409() {
      HashMap var3 = Maps.newHashMap();

      for (Entry var5 : this.field34451.entrySet()) {
         Class2006 var6 = (Class2006)var5.getValue();
         if (var6.method8490()) {
            var3.put(((Advancement)var5.getKey()).getId(), var6);
         }
      }

      if (this.field34450.getParentFile() != null) {
         this.field34450.getParentFile().mkdirs();
      }

      JsonElement var38 = field34446.toJsonTree(var3);
      var38.getAsJsonObject().addProperty("DataVersion", SharedConstants.getVersion().getWorldVersion());

      try (
         FileOutputStream var39 = new FileOutputStream(this.field34450);
         OutputStreamWriter var7 = new OutputStreamWriter(var39, Charsets.UTF_8.newEncoder());
      ) {
         field34446.toJson(var38, var7);
      } catch (IOException var37) {
         field34445.error("Couldn't save player advancements to {}", this.field34450, var37);
      }
   }

   public boolean method27410(Advancement var1, String var2) {
      boolean var5 = false;
      Class2006 var6 = this.method27416(var1);
      boolean var7 = var6.method8489();
      if (var6.method8491(var2)) {
         this.method27413(var1);
         this.field34454.add(var1);
         var5 = true;
         if (!var7 && var6.method8489()) {
            var1.method27028().method30722(this.field34455);
            if (var1.method27027() != null && var1.method27027().method34942() && this.field34455.world.getGameRules().getBoolean(GameRules.ANNOUNCE_ADVANCEMENTS)) {
               this.field34449
                  .method19484(
                     new TranslationTextComponent(
                        "chat.type.advancement." + var1.method27027().method34938().method8241(), this.field34455.getDisplayName(), var1.method27035()
                     ),
                     ChatType.SYSTEM,
                     Util.DUMMY_UUID
                  );
            }
         }
      }

      if (var6.method8489()) {
         this.method27418(var1);
      }

      return var5;
   }

   public boolean method27411(Advancement var1, String var2) {
      boolean var5 = false;
      Class2006 var6 = this.method27416(var1);
      if (var6.method8492(var2)) {
         this.method27412(var1);
         this.field34454.add(var1);
         var5 = true;
      }

      if (!var6.method8490()) {
         this.method27418(var1);
      }

      return var5;
   }

   private void method27412(Advancement var1) {
      Class2006 var4 = this.method27416(var1);
      if (!var4.method8489()) {
         for (Entry var6 : var1.method27030().entrySet()) {
            Class9599 var7 = var4.method8495((String)var6.getKey());
            if (var7 != null && !var7.method37263()) {
               Class4477 var8 = ((Class9181)var6.getValue()).method34341();
               if (var8 != null) {
                  Class4907 var9 = CriteriaTriggers.method37000(var8.method14093());
                  if (var9 != null) {
                     var9.method15049(this, new Class9282<Class4477>(var8, var1, (String)var6.getKey()));
                  }
               }
            }
         }
      }
   }

   private void method27413(Advancement var1) {
      Class2006 var4 = this.method27416(var1);

      for (Entry var6 : var1.method27030().entrySet()) {
         Class9599 var7 = var4.method8495((String)var6.getKey());
         if (var7 != null && (var7.method37263() || var4.method8489())) {
            Class4477 var8 = ((Class9181)var6.getValue()).method34341();
            if (var8 != null) {
               Class4907 var9 = CriteriaTriggers.method37000(var8.method14093());
               if (var9 != null) {
                  var9.method15050(this, new Class9282<Class4477>(var8, var1, (String)var6.getKey()));
               }
            }
         }
      }
   }

   public void method27414(ServerPlayerEntity var1) {
      if (this.field34457 || !this.field34453.isEmpty() || !this.field34454.isEmpty()) {
         HashMap var4 = Maps.newHashMap();
         LinkedHashSet var5 = Sets.newLinkedHashSet();
         LinkedHashSet var6 = Sets.newLinkedHashSet();

         for (Advancement var8 : this.field34454) {
            if (this.field34452.contains(var8)) {
               var4.put(var8.getId(), this.field34451.get(var8));
            }
         }

         for (Advancement var10 : this.field34453) {
            if (!this.field34452.contains(var10)) {
               var6.add(var10.getId());
            } else {
               var5.add(var10);
            }
         }

         if (this.field34457 || !var4.isEmpty() || !var5.isEmpty() || !var6.isEmpty()) {
            var1.connection.sendPacket(new SAdvancementInfoPacket(this.field34457, var5, var6, var4));
            this.field34453.clear();
            this.field34454.clear();
         }
      }

      this.field34457 = false;
   }

   public void method27415(Advancement var1) {
      Advancement var4 = this.field34456;
      if (var1 != null && var1.method27026() == null && var1.method27027() != null) {
         this.field34456 = var1;
      } else {
         this.field34456 = null;
      }

      if (var4 != this.field34456) {
         this.field34455.connection.sendPacket(new SSelectAdvancementsTabPacket(this.field34456 != null ? this.field34456.getId() : null));
      }
   }

   public Class2006 method27416(Advancement var1) {
      Class2006 var4 = this.field34451.get(var1);
      if (var4 == null) {
         var4 = new Class2006();
         this.method27417(var1, var4);
      }

      return var4;
   }

   private void method27417(Advancement var1, Class2006 var2) {
      var2.method8488(var1.method27030(), var1.method27034());
      this.field34451.put(var1, var2);
   }

   private void method27418(Advancement var1) {
      boolean var4 = this.method27419(var1);
      boolean var5 = this.field34452.contains(var1);
      if (var4 && !var5) {
         this.field34452.add(var1);
         this.field34453.add(var1);
         if (this.field34451.containsKey(var1)) {
            this.field34454.add(var1);
         }
      } else if (!var4 && var5) {
         this.field34452.remove(var1);
         this.field34453.add(var1);
      }

      if (var4 != var5 && var1.method27026() != null) {
         this.method27418(var1.method27026());
      }

      for (Advancement var7 : var1.method27029()) {
         this.method27418(var7);
      }
   }

   private boolean method27419(Advancement var1) {
      for (int var4 = 0; var1 != null && var4 <= 2; var4++) {
         if (var4 == 0 && this.method27420(var1)) {
            return true;
         }

         if (var1.method27027() == null) {
            return false;
         }

         Class2006 var5 = this.method27416(var1);
         if (var5.method8489()) {
            return true;
         }

         if (var1.method27027().method34943()) {
            return false;
         }

         var1 = var1.method27026();
      }

      return false;
   }

   private boolean method27420(Advancement var1) {
      Class2006 var4 = this.method27416(var1);
      if (var4.method8489()) {
         return true;
      } else {
         for (Advancement var6 : var1.method27029()) {
            if (this.method27420(var6)) {
               return true;
            }
         }

         return false;
      }
   }
}
