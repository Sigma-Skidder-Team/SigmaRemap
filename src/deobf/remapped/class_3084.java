package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_3084 {
   private static final Collection<class_226> field_15160 = Lists.newArrayList();
   private static final Set<String> field_15158 = Sets.newHashSet();
   private static final Map<String, Consumer<class_6331>> field_15159 = Maps.newHashMap();
   private static final Collection<class_226> field_15157 = Sets.newHashSet();

   public static Collection<class_226> method_14143(String var0) {
      return field_15160.stream().filter(var1 -> method_14153(var1, var0)).collect(Collectors.<class_226>toList());
   }

   public static Collection<class_226> method_14152() {
      return field_15160;
   }

   public static Collection<String> method_14151() {
      return field_15158;
   }

   public static boolean method_14146(String var0) {
      return field_15158.contains(var0);
   }

   @Nullable
   public static Consumer<class_6331> method_14147(String var0) {
      return field_15159.get(var0);
   }

   public static Optional<class_226> method_14148(String var0) {
      return method_14152().stream().filter(var1 -> var1.method_962().equalsIgnoreCase(var0)).findFirst();
   }

   public static class_226 method_14142(String var0) {
      Optional var3 = method_14148(var0);
      if (var3.isPresent()) {
         return (class_226)var3.get();
      } else {
         throw new IllegalArgumentException("Can't find the test function for " + var0);
      }
   }

   private static boolean method_14153(class_226 var0, String var1) {
      return var0.method_962().toLowerCase().startsWith(var1.toLowerCase() + ".");
   }

   public static Collection<class_226> method_14149() {
      return field_15157;
   }

   public static void method_14150(class_226 var0) {
      field_15157.add(var0);
   }

   public static void method_14145() {
      field_15157.clear();
   }
}
