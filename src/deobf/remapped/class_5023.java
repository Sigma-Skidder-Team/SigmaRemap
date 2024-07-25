package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5023 extends class_7648 {
   private static final Gson field_25985 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger field_25981 = LogManager.getLogger();
   private Map<class_1510<?>, Map<Identifier, class_8932<?>>> field_25982 = ImmutableMap.of();
   private boolean field_25983;

   public class_5023() {
      super(field_25985, "recipes");
   }

   public void method_23144(Map<Identifier, JsonElement> var1, class_7832 var2, class_3492 var3) {
      this.field_25983 = false;
      HashMap var6 = Maps.newHashMap();

      for (Entry var8 : var1.entrySet()) {
         Identifier var9 = (Identifier)var8.getKey();

         try {
            class_8932 var10 = method_23146(var9, class_6539.method_29782((JsonElement)var8.getValue(), "top element"));
            var6.computeIfAbsent(var10.method_41045(), var0 -> ImmutableMap.builder()).put(var9, var10);
         } catch (JsonParseException | IllegalArgumentException var11) {
            field_25981.error("Parsing error loading recipe {}", var9, var11);
         }
      }

      this.field_25982 = var6.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((Builder)var0.getValue()).build()));
      field_25981.info("Loaded {} recipes", var6.size());
   }

   public <C extends class_6867, T extends class_8932<C>> Optional<T> method_23138(class_1510<T> var1, C var2, World var3) {
      return this.method_23142(var1)
         .values()
         .stream()
         .<T>flatMap(var3x -> Util.method_44689(var1.method_6914((class_8932<class_6867>)var3x, var3, var2)))
         .findFirst();
   }

   public <C extends class_6867, T extends class_8932<C>> List<T> method_23137(class_1510<T> var1) {
      return this.method_23142(var1).values().stream().<class_8932>map(var0 -> (class_8932)var0).collect(Collectors.<T>toList());
   }

   public <C extends class_6867, T extends class_8932<C>> List<T> method_23143(class_1510<T> var1, C var2, World var3) {
      return this.method_23142(var1)
         .values()
         .stream()
         .<class_8932>flatMap(var3x -> Util.method_44689(var1.method_6914((class_8932<class_6867>)var3x, var3, var2)))
         .sorted(Comparator.comparing(var0 -> var0.method_41044().method_27958()))
         .collect(Collectors.<T>toList());
   }

   private <C extends class_6867, T extends class_8932<C>> Map<Identifier, class_8932<C>> method_23142(class_1510<T> var1) {
      return (Map<Identifier, class_8932<C>>)this.field_25982.getOrDefault(var1, Collections.<Identifier, class_8932<?>>emptyMap());
   }

   public <C extends class_6867, T extends class_8932<C>> class_2831<ItemStack> method_23147(class_1510<T> var1, C var2, World var3) {
      Optional var6 = this.method_23138(var1, var2, var3);
      if (var6.isPresent()) {
         return ((class_8932)var6.get()).method_41046(var2);
      } else {
         class_2831 var7 = class_2831.<ItemStack>method_12872(var2.method_31505(), ItemStack.EMPTY);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            var7.set(var8, var2.method_31498(var8));
         }

         return var7;
      }
   }

   public Optional<? extends class_8932<?>> method_23139(Identifier var1) {
      return this.field_25982.values().stream().<class_8932<?>>map(var1x -> var1x.get(var1)).filter(Objects::nonNull).findFirst();
   }

   public Collection<class_8932<?>> method_23141() {
      return this.field_25982.values().stream().<class_8932<?>>flatMap(var0 -> var0.values().stream()).collect(Collectors.<class_8932<?>>toSet());
   }

   public Stream<Identifier> method_23145() {
      return this.field_25982.values().stream().<Identifier>flatMap(var0 -> var0.keySet().stream());
   }

   public static class_8932<?> method_23146(Identifier var0, JsonObject var1) {
      String var4 = class_6539.method_29796(var1, "type");
      return class_8669.field_44414
         .method_39794(new Identifier(var4))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + var4 + "'"))
         .method_13696(var0, var1);
   }

   public void method_23140(Iterable<class_8932<?>> var1) {
      this.field_25983 = false;
      HashMap var4 = Maps.newHashMap();
      var1.forEach(var1x -> {
         Map var4x = var4.computeIfAbsent(var1x.method_41045(), var0x -> Maps.newHashMap());
         class_8932 var5 = var4x.put(var1x.method_41050(), var1x);
         if (var5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + var1x.method_41050());
         }
      });
      this.field_25982 = ImmutableMap.copyOf(var4);
   }
}
