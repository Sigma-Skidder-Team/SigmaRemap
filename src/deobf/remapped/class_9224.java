package remapped;

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

public class class_9224 {
   private static final Joiner field_47158 = Joiner.on(",");
   private final List<String[]> field_47160 = Lists.newArrayList();
   private final Map<Character, Predicate<class_9115>> field_47159 = Maps.newHashMap();
   private int field_47155;
   private int field_47156;

   private class_9224() {
      this.field_47159.put(' ', Predicates.alwaysTrue());
   }

   public class_9224 method_42575(String... var1) {
      if (!ArrayUtils.isEmpty(var1) && !StringUtils.isEmpty(var1[0])) {
         if (this.field_47160.isEmpty()) {
            this.field_47155 = var1.length;
            this.field_47156 = var1[0].length();
         }

         if (var1.length != this.field_47155) {
            throw new IllegalArgumentException(
               "Expected aisle with height of " + this.field_47155 + ", but was given one with a height of " + var1.length + ")"
            );
         } else {
            for (String var7 : var1) {
               if (var7.length() != this.field_47156) {
                  throw new IllegalArgumentException(
                     "Not all rows in the given aisle are the correct width (expected " + this.field_47156 + ", found one with " + var7.length() + ")"
                  );
               }

               for (char var11 : var7.toCharArray()) {
                  if (!this.field_47159.containsKey(var11)) {
                     this.field_47159.put(var11, (Predicate<class_9115>)null);
                  }
               }
            }

            this.field_47160.add(var1);
            return this;
         }
      } else {
         throw new IllegalArgumentException("Empty pattern for aisle");
      }
   }

   public static class_9224 method_42577() {
      return new class_9224();
   }

   public class_9224 method_42576(char var1, Predicate<class_9115> var2) {
      this.field_47159.put(var1, var2);
      return this;
   }

   public class_9741 method_42571() {
      return new class_9741(this.method_42574());
   }

   private Predicate<class_9115>[][][] method_42574() {
      this.method_42573();
      Predicate[][][] var3 = (Predicate[][][])Array.newInstance(Predicate.class, this.field_47160.size(), this.field_47155, this.field_47156);

      for (int var4 = 0; var4 < this.field_47160.size(); var4++) {
         for (int var5 = 0; var5 < this.field_47155; var5++) {
            for (int var6 = 0; var6 < this.field_47156; var6++) {
               var3[var4][var5][var6] = this.field_47159.get(this.field_47160.get(var4)[var5].charAt(var6));
            }
         }
      }

      return var3;
   }

   private void method_42573() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field_47159.entrySet()) {
         if (var5.getValue() == null) {
            var3.add(var5.getKey());
         }
      }

      if (!var3.isEmpty()) {
         throw new IllegalStateException("Predicates for character(s) " + field_47158.join(var3) + " are missing");
      }
   }
}
