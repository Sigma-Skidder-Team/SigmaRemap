package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7909 extends StatisticsManager {
   private static final Logger field_40431 = LogManager.getLogger();
   private final class_341 field_40435;
   private final File field_40432;
   private final Set<class_6676<?>> field_40433 = Sets.newHashSet();
   private int field_40434 = -300;

   public class_7909(class_341 var1, File var2) {
      this.field_40435 = var1;
      this.field_40432 = var2;
      if (var2.isFile()) {
         try {
            this.method_35780(var1.method_1607(), FileUtils.readFileToString(var2));
         } catch (IOException var6) {
            field_40431.error("Couldn't read statistics file {}", var2, var6);
         } catch (JsonParseException var7) {
            field_40431.error("Couldn't parse statistics file {}", var2, var7);
         }
      }
   }

   public void method_35775() {
      try {
         FileUtils.writeStringToFile(this.field_40432, this.method_35773());
      } catch (IOException var4) {
         field_40431.error("Couldn't save stats", var4);
      }
   }

   @Override
   public void method_19275(PlayerEntity var1, class_6676<?> var2, int var3) {
      super.method_19275(var1, var2, var3);
      this.field_40433.add(var2);
   }

   private Set<class_6676<?>> method_35778() {
      HashSet var3 = Sets.newHashSet(this.field_40433);
      this.field_40433.clear();
      return var3;
   }

   public void method_35780(DataFixer var1, String var2) {
      try {
         JsonReader var5 = new JsonReader(new StringReader(var2));
         Throwable var6 = null;

         try {
            var5.setLenient(false);
            JsonElement var7 = Streams.parse(var5);
            if (!var7.isJsonNull()) {
               CompoundNBT var8 = method_35776(var7.getAsJsonObject());
               if (!var8.contains("DataVersion", 99)) {
                  var8.method_25931("DataVersion", 1343);
               }

               var8 = class_4338.method_20179(var1, class_5397.field_27552, var8, var8.method_25947("DataVersion"));
               if (var8.contains("stats", 10)) {
                  CompoundNBT var9 = var8.getCompound("stats");

                  for (String var11 : var9.method_25952()) {
                     if (var9.contains(var11, 10)) {
                        Util.<class_9478<?>>method_44691(
                           class_8669.field_44376.method_39794(new Identifier(var11)),
                           var3 -> {
                              CompoundNBT var6x = var9.getCompound(var11);

                              for (String var8x : var6x.method_25952()) {
                                 if (!var6x.contains(var8x, 99)) {
                                    field_40431.warn(
                                       "Invalid statistic value in {}: Don't know what {} is for key {}", this.field_40432, var6x.method_25929(var8x), var8x
                                    );
                                 } else {
                                    Util.<class_6676<?>>method_44691(
                                       this.method_35772(var3, var8x),
                                       var3x -> this.field_20206.put(var3x, var6x.method_25947(var8x)),
                                       () -> field_40431.warn("Invalid statistic in {}: Don't know what {} is", this.field_40432, var8x)
                                    );
                                 }
                              }
                           },
                           () -> field_40431.warn("Invalid statistic type in {}: Don't know what {} is", this.field_40432, var11)
                        );
                     }
                  }
               }

               return;
            }

            field_40431.error("Unable to parse Stat data from {}", this.field_40432);
         } catch (Throwable var21) {
            var6 = var21;
            throw var21;
         } finally {
            if (var5 != null) {
               if (var6 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var20) {
                     var6.addSuppressed(var20);
                  }
               } else {
                  var5.close();
               }
            }
         }
      } catch (JsonParseException | IOException var23) {
         field_40431.error("Unable to parse Stat data from {}", this.field_40432, var23);
      }
   }

   private <T> Optional<class_6676<T>> method_35772(class_9478<T> var1, String var2) {
      return Optional.<Identifier>ofNullable(Identifier.method_21455(var2))
         .<T>flatMap(var1.method_43788()::method_39794)
         .<class_6676<T>>map(var1::method_43790);
   }

   private static CompoundNBT method_35776(JsonObject var0) {
      CompoundNBT var3 = new CompoundNBT();

      for (Entry var5 : var0.entrySet()) {
         JsonElement var6 = (JsonElement)var5.getValue();
         if (!var6.isJsonObject()) {
            if (var6.isJsonPrimitive()) {
               JsonPrimitive var7 = var6.getAsJsonPrimitive();
               if (var7.isNumber()) {
                  var3.method_25931((String)var5.getKey(), var7.getAsInt());
               }
            }
         } else {
            var3.put((String)var5.getKey(), method_35776(var6.getAsJsonObject()));
         }
      }

      return var3;
   }

   public String method_35773() {
      HashMap var3 = Maps.newHashMap();
      ObjectIterator var4 = this.field_20206.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var5 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var4.next();
         class_6676 var6 = (class_6676)var5.getKey();
         var3.computeIfAbsent(var6.method_30631(), var0 -> new JsonObject()).addProperty(method_35777(var6).toString(), var5.getIntValue());
      }

      JsonObject var7 = new JsonObject();

      for (Entry var10 : var3.entrySet()) {
         var7.add(class_8669.field_44376.method_39797((class_9478<?>)var10.getKey()).toString(), (JsonElement)var10.getValue());
      }

      JsonObject var9 = new JsonObject();
      var9.add("stats", var7);
      var9.addProperty("DataVersion", class_7665.method_34674().getWorldVersion());
      return var9.toString();
   }

   private static <T> Identifier method_35777(class_6676<T> var0) {
      return var0.method_30631().method_43788().method_39797(var0.method_30630());
   }

   public void method_35774() {
      this.field_40433.addAll(this.field_20206.keySet());
   }

   public void method_35779(class_9359 var1) {
      int var4 = this.field_40435.method_1682();
      Object2IntOpenHashMap var5 = new Object2IntOpenHashMap();
      if (var4 - this.field_40434 > 300) {
         this.field_40434 = var4;

         for (class_6676 var7 : this.method_35778()) {
            var5.put(var7, this.method_19276(var7));
         }
      }

      var1.field_47794.method_4156(new class_7630(var5));
   }
}
