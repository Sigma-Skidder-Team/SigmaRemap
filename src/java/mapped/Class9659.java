package mapped;

import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Class9659 {
   private static final Joiner field45141 = Joiner.on(",");
   private final List<String[]> field45142 = Lists.newArrayList();
   private final Map<Character, Predicate<Class9632>> field45143 = Maps.newHashMap();
   private int field45144;
   private int field45145;

   private Class9659() {
      this.field45143.put(' ', Predicates.alwaysTrue());
   }

   public Class9659 method37705(String... var1) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.field45142.isEmpty()) {
            this.field45144 = var1.length;
            this.field45145 = var1[0].length();
         }

         if (var1.length != this.field45144) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.field45144 + ", but was given one with a height of " + var1.length + ")");
         } else {
            for (String var7 : var1) {
               if (var7.length() != this.field45145) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.field45145 + ", found one with " + var7.length() + ")"
                  );
               }

               for (char var11 : var7.toCharArray()) {
                  if (!this.field45143.containsKey(var11)) {
                     this.field45143.put(var11, (Predicate<Class9632>)null);
                  }
               }
            }

            this.field45142.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static Class9659 method37706() {
      return new Class9659();
   }

   public Class9659 method37707(char var1, Predicate<Class9632> var2) {
      this.field45143.put(var1, var2);
      return this;
   }

   public Class9803 method37708() {
      return new Class9803(this.method37709());
   }

   private Predicate<Class9632>[][][] method37709() {
      this.method37710();
      Predicate[][][] var3 = (Predicate[][][])Array.newInstance(Predicate.class, this.field45142.size(), this.field45144, this.field45145);

      for (int var4 = 0; var4 < this.field45142.size(); var4++) {
         for (int var5 = 0; var5 < this.field45144; var5++) {
            for (int var6 = 0; var6 < this.field45145; var6++) {
               var3[var4][var5][var6] = this.field45143.get(this.field45142.get(var4)[var5].charAt(var6));
            }
         }
      }

      return var3;
   }

   private void method37710() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field45143.entrySet()) {
         if (var5.getValue() == null) {
            var3.add(var5.getKey());
         }
      }

      if (!var3.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + field45141.join(var3) + " are missing");
      }
   }
}
