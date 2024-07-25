package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4951 {
   private static final Logger field_25615 = LogManager.getLogger();
   private final class_2451 field_25614;
   private final int field_25617;
   private final List<String> field_25616 = Lists.newArrayList();
   private final Map<Character, class_8137> field_25619 = Maps.newLinkedHashMap();
   private final class_3321 field_25620 = class_3321.method_15269();
   private String field_25618;

   public class_4951(class_8525 var1, int var2) {
      this.field_25614 = var1.method_10803();
      this.field_25617 = var2;
   }

   public static class_4951 method_22690(class_8525 var0) {
      return method_22691(var0, 1);
   }

   public static class_4951 method_22691(class_8525 var0, int var1) {
      return new class_4951(var0, var1);
   }

   public class_4951 method_22692(Character var1, class_2307<class_2451> var2) {
      return this.method_22693(var1, class_8137.method_37022(var2));
   }

   public class_4951 method_22694(Character var1, class_8525 var2) {
      return this.method_22693(var1, class_8137.method_37019(var2));
   }

   public class_4951 method_22693(Character var1, class_8137 var2) {
      if (!this.field_25619.containsKey(var1)) {
         if (var1 != ' ') {
            this.field_25619.put(var1, var2);
            return this;
         } else {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
         }
      } else {
         throw new IllegalArgumentException("Symbol '" + var1 + "' is already defined!");
      }
   }

   public class_4951 method_22697(String var1) {
      if (!this.field_25616.isEmpty() && var1.length() != this.field_25616.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.field_25616.add(var1);
         return this;
      }
   }

   public class_4951 method_22698(String var1, class_5154 var2) {
      this.field_25620.method_15272(var1, var2);
      return this;
   }

   public class_4951 method_22695(String var1) {
      this.field_25618 = var1;
      return this;
   }

   public void method_22687(Consumer<class_4219> var1) {
      this.method_22689(var1, class_8669.field_44382.method_39797(this.field_25614));
   }

   public void method_22688(Consumer<class_4219> var1, String var2) {
      Identifier var5 = class_8669.field_44382.method_39797(this.field_25614);
      if (!new Identifier(var2).equals(var5)) {
         this.method_22689(var1, new Identifier(var2));
      } else {
         throw new IllegalStateException("Shaped Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method_22689(Consumer<class_4219> var1, Identifier var2) {
      this.method_22696(var2);
      this.field_25620
         .method_15260(new Identifier("recipes/root"))
         .method_15272("has_the_recipe", class_8435.method_38807(var2))
         .method_15258(class_7365.method_33536(var2))
         .method_15271(class_6701.field_34598);
      var1.accept(
         new class_184(
            this,
            var2,
            (int)this.field_25614,
            this.field_25617,
            this.field_25618 != null ? this.field_25618 : "",
            this.field_25616,
            this.field_25619,
            this.field_25620,
            new Identifier(var2.method_21461(), "recipes/" + this.field_25614.method_11226().method_37691() + "/" + var2.method_21456())
         )
      );
   }

   private void method_22696(Identifier var1) {
      if (this.field_25616.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + var1 + "!");
      } else {
         HashSet var4 = Sets.newHashSet(this.field_25619.keySet());
         var4.remove(' ');

         for (String var6 : this.field_25616) {
            for (int var7 = 0; var7 < var6.length(); var7++) {
               char var8 = var6.charAt(var7);
               if (!this.field_25619.containsKey(var8) && var8 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + var1 + " uses undefined symbol '" + var8 + "'");
               }

               var4.remove(var8);
            }
         }

         if (!var4.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + var1);
         } else if (this.field_25616.size() == 1 && this.field_25616.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + var1 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.field_25620.method_15255().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + var1);
         }
      }
   }
}
