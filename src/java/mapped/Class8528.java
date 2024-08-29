package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8528 {
   private static final Logger field38304 = LogManager.getLogger();
   private final Item field38305;
   private final int field38306;
   private final List<String> field38307 = Lists.newArrayList();
   private final Map<Character, Class120> field38308 = Maps.newLinkedHashMap();
   private final Class7999 field38309 = Class7999.method27304();
   private String field38310;

   public Class8528(Class3303 var1, int var2) {
      this.field38305 = var1.method11581();
      this.field38306 = var2;
   }

   public static Class8528 method30247(Class3303 var0) {
      return method30248(var0, 1);
   }

   public static Class8528 method30248(Class3303 var0, int var1) {
      return new Class8528(var0, var1);
   }

   public Class8528 method30249(Character var1, Class7608<Item> var2) {
      return this.method30251(var1, Class120.method342(var2));
   }

   public Class8528 method30250(Character var1, Class3303 var2) {
      return this.method30251(var1, Class120.method339(var2));
   }

   public Class8528 method30251(Character var1, Class120 var2) {
      if (!this.field38308.containsKey(var1)) {
         if (var1 != ' ') {
            this.field38308.put(var1, var2);
            return this;
         } else {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
         }
      } else {
         throw new IllegalArgumentException("Symbol '" + var1 + "' is already defined!");
      }
   }

   public Class8528 method30252(String var1) {
      if (!this.field38307.isEmpty() && var1.length() != this.field38307.get(0).length()) {
         throw new IllegalArgumentException("Pattern must be the same width on every line!");
      } else {
         this.field38307.add(var1);
         return this;
      }
   }

   public Class8528 method30253(String var1, Class4477 var2) {
      this.field38309.method27312(var1, var2);
      return this;
   }

   public Class8528 method30254(String var1) {
      this.field38310 = var1;
      return this;
   }

   public void method30255(Consumer<Class4664> var1) {
      this.method30257(var1, Registry.ITEM.getKey(this.field38305));
   }

   public void method30256(Consumer<Class4664> var1, String var2) {
      ResourceLocation var5 = Registry.ITEM.getKey(this.field38305);
      if (!new ResourceLocation(var2).equals(var5)) {
         this.method30257(var1, new ResourceLocation(var2));
      } else {
         throw new IllegalStateException("Shaped Recipe " + var2 + " should remove its 'save' argument");
      }
   }

   public void method30257(Consumer<Class4664> var1, ResourceLocation var2) {
      this.method30258(var2);
      this.field38309
         .method27306(new ResourceLocation("recipes/root"))
         .method27312("has_the_recipe", Class4897.method15131(var2))
         .method27310(Class9182.method34345(var2))
         .method27314(Class9014.field41221);
      var1.accept(
         new Class4663(
            this,
            var2,
                 this.field38305,
            this.field38306,
            this.field38310 != null ? this.field38310 : "",
            this.field38307,
            this.field38308,
            this.field38309,
            new ResourceLocation(var2.method8293(), "recipes/" + this.field38305.method11739().method23642() + "/" + var2.method8292())
         )
      );
   }

   private void method30258(ResourceLocation var1) {
      if (this.field38307.isEmpty()) {
         throw new IllegalStateException("No pattern is defined for shaped recipe " + var1 + "!");
      } else {
         HashSet var4 = Sets.newHashSet(this.field38308.keySet());
         var4.remove(' ');

         for (String var6 : this.field38307) {
            for (int var7 = 0; var7 < var6.length(); var7++) {
               char var8 = var6.charAt(var7);
               if (!this.field38308.containsKey(var8) && var8 != ' ') {
                  throw new IllegalStateException("Pattern in recipe " + var1 + " uses undefined symbol '" + var8 + "'");
               }

               var4.remove(var8);
            }
         }

         if (!var4.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + var1);
         } else if (this.field38307.size() == 1 && this.field38307.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + var1 + " only takes in a single item - should it be a shapeless recipe instead?");
         } else if (this.field38309.method27322().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + var1);
         }
      }
   }
}
