package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class class_6884 implements class_2218 {
   private static final Splitter field_35432 = Splitter.on('|').omitEmptyStrings();
   private final String field_35433;
   private final String field_35431;

   public class_6884(String var1, String var2) {
      this.field_35433 = var1;
      this.field_35431 = var2;
   }

   @Override
   public Predicate<class_2522> method_10251(class_8021<class_6414, class_2522> var1) {
      class_5019 var4 = var1.method_36440(this.field_35433);
      if (var4 == null) {
         throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.field_35433, ((class_6414)var1.method_36442()).toString()));
      } else {
         String var5 = this.field_35431;
         boolean var6 = !var5.isEmpty() && var5.charAt(0) == '!';
         if (var6) {
            var5 = var5.substring(1);
         }

         List var7 = field_35432.splitToList(var5);
         if (!var7.isEmpty()) {
            Predicate var9;
            if (var7.size() != 1) {
               List var8 = var7.stream().<Predicate<class_2522>>map(var3 -> this.method_31566(var1, var4, var3)).collect(Collectors.toList());
               var9 = var1x -> var8.stream().anyMatch(var1xx -> var1xx.test(var1x));
            } else {
               var9 = this.method_31566(var1, var4, var5);
            }

            return !var6 ? var9 : var9.negate();
         } else {
            throw new RuntimeException(
               String.format("Empty value '%s' for property '%s' on '%s'", this.field_35431, this.field_35433, ((class_6414)var1.method_36442()).toString())
            );
         }
      }
   }

   private Predicate<class_2522> method_31566(class_8021<class_6414, class_2522> var1, class_5019<?> var2, String var3) {
      Optional var6 = var2.method_23108(var3);
      if (var6.isPresent()) {
         return var2x -> var2x.method_10313(var2).equals(var6.get());
      } else {
         throw new RuntimeException(
            String.format(
               "Unknown value '%s' for property '%s' on '%s' in '%s'", var3, this.field_35433, ((class_6414)var1.method_36442()).toString(), this.field_35431
            )
         );
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.field_35433).add("value", this.field_35431).toString();
   }
}
