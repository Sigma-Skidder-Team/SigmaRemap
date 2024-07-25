package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class class_6065 implements class_8740 {
   private final class_6414 field_31022;
   private final List<class_265> field_31024;
   private final Set<class_5019<?>> field_31023 = Sets.newHashSet();
   private final List<class_121> field_31020 = Lists.newArrayList();

   private class_6065(class_6414 var1, List<class_265> var2) {
      this.field_31022 = var1;
      this.field_31024 = var2;
   }

   public class_6065 method_27775(class_121 var1) {
      var1.method_354().forEach(var1x -> {
         if (this.field_31022.method_29306().method_36440(var1x.method_23109()) == var1x) {
            if (!this.field_31023.add(var1x)) {
               throw new IllegalStateException("Values of property " + var1x + " already defined for block " + this.field_31022);
            }
         } else {
            throw new IllegalStateException("Property " + var1x + " is not defined for block " + this.field_31022);
         }
      });
      this.field_31020.add(var1);
      return this;
   }

   public JsonElement get() {
      Stream var3 = Stream.<Pair>of(Pair.of(class_7727.method_34970(), this.field_31024));

      for (class_121 var5 : this.field_31020) {
         Map var6 = var5.method_361();
         var3 = var3.<Pair>flatMap(var1 -> var6.entrySet().stream().map(var1x -> {
               class_7727 var4 = ((class_7727)var1.getFirst()).method_34968((class_7727)var1x.getKey());
               List var5x = method_27774((List<class_265>)var1.getSecond(), (List<class_265>)var1x.getValue());
               return Pair.of(var4, var5x);
            }));
      }

      TreeMap var7 = new TreeMap();
      var3.forEach(var1 -> {
         JsonElement var4 = var7.put(((class_7727)var1.getFirst()).method_34969(), class_265.method_1152((List<class_265>)var1.getSecond()));
      });
      JsonObject var8 = new JsonObject();
      var8.add("variants", Util.<JsonElement>method_44659(new JsonObject(), var1 -> var7.forEach(var1::add)));
      return var8;
   }

   private static List<class_265> method_27774(List<class_265> var0, List<class_265> var1) {
      Builder var4 = ImmutableList.builder();
      var0.forEach(var2 -> var1.forEach(var2x -> var4.add(class_265.method_1154(var2, var2x))));
      return var4.build();
   }

   @Override
   public class_6414 method_40130() {
      return this.field_31022;
   }

   public static class_6065 method_27776(class_6414 var0) {
      return new class_6065(var0, ImmutableList.of(class_265.method_1150()));
   }

   public static class_6065 method_27778(class_6414 var0, class_265 var1) {
      return new class_6065(var0, ImmutableList.of(var1));
   }

   public static class_6065 method_27777(class_6414 var0, class_265... var1) {
      return new class_6065(var0, ImmutableList.copyOf(var1));
   }
}
