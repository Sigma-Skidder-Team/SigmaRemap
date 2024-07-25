package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2304 implements class_5998 {
   private static final Logger field_11498 = LogManager.getLogger();
   private static final Gson field_11496 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final class_6901 field_11499;

   public class_2304(class_6901 var1) {
      this.field_11499 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) {
      Path var4 = this.field_11499.method_31600();
      HashMap var5 = Maps.newHashMap();
      Consumer var6 = var1x -> {
         class_6414 var4x = var1x.method_40130();
         class_8740 var5x = var5.put(var4x, var1x);
         if (var5x != null) {
            throw new IllegalStateException("Duplicate blockstate definition for " + var4x);
         }
      };
      HashMap var7 = Maps.newHashMap();
      HashSet var8 = Sets.newHashSet();
      BiConsumer var9 = (var1x, var2) -> {
         Supplier var5x = var7.put(var1x, var2);
         if (var5x != null) {
            throw new IllegalStateException("Duplicate model definition for " + var1x);
         }
      };
      Consumer var10 = var8::add;
      new class_8261(var6, var9, var10).method_37916();
      new class_2785(var9).method_12665();
      List var11 = class_8669.field_44462.method_39801().filter(var1x -> !var5.containsKey(var1x)).collect(Collectors.toList());
      if (var11.isEmpty()) {
         class_8669.field_44462.forEach(var2 -> {
            class_2451 var5x = class_2451.field_12170.get(var2);
            if (var5x != null) {
               if (var8.contains(var5x)) {
                  return;
               }

               class_4639 var6x = class_6856.method_31450(var5x);
               if (!var7.containsKey(var6x)) {
                  var7.put(var6x, new class_7503(class_6856.method_31446(var2)));
               }
            }
         });
         this.method_10593(var1, var4, var5, class_2304::method_10594);
         this.method_10593(var1, var4, var7, class_2304::method_10596);
      } else {
         throw new IllegalStateException("Missing blockstate definitions for: " + var11);
      }
   }

   private <T> void method_10593(class_4162 var1, Path var2, Map<T, ? extends Supplier<JsonElement>> var3, BiFunction<Path, T, Path> var4) {
      var3.forEach((var3x, var4x) -> {
         Path var7 = (Path)var4.apply(var2, var3x);

         try {
            class_5998.method_27388(field_11496, var1, (JsonElement)var4x.get(), var7);
         } catch (Exception var9) {
            field_11498.error("Couldn't save {}", var7, var9);
         }
      });
   }

   private static Path method_10594(Path var0, class_6414 var1) {
      class_4639 var4 = class_8669.field_44462.method_39797(var1);
      return var0.resolve("assets/" + var4.method_21461() + "/blockstates/" + var4.method_21456() + ".json");
   }

   private static Path method_10596(Path var0, class_4639 var1) {
      return var0.resolve("assets/" + var1.method_21461() + "/models/" + var1.method_21456() + ".json");
   }

   @Override
   public String method_27387() {
      return "Block State Definitions";
   }
}
