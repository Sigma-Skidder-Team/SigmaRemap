package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_7622<T> extends class_4594<T> {
   private static String[] field_38779;
   public class_2566<T> field_38781 = new class_2566<T>();
   private final Function<T, Stream<String>> field_38780;

   public class_7622(Function<T, Stream<String>> var1, Function<T, Stream<Identifier>> var2) {
      super(var2);
      this.field_38780 = var1;
   }

   @Override
   public void method_5710() {
      this.field_38781 = new class_2566<T>();
      super.method_5710();
      this.field_38781.method_11653();
   }

   @Override
   public void method_21296(T var1) {
      super.method_21296((T)var1);
      this.field_38780.apply((T)var1).forEach(var2 -> this.field_38781.method_11650((T)var1, var2.toLowerCase(Locale.ROOT)));
   }

   @Override
   public List<T> method_14476(String var1) {
      int var4 = var1.indexOf(58);
      if (var4 >= 0) {
         List var5 = this.field_22334.method_11652(var1.substring(0, var4).trim());
         String var6 = var1.substring(var4 + 1).trim();
         List var7 = this.field_22337.method_11652(var6);
         List var8 = this.field_38781.method_11652(var6);
         return Lists.newArrayList(
            new class_6731<T>(var5.iterator(), new class_186<T>(var7.iterator(), var8.iterator(), this::method_21297), this::method_21297)
         );
      } else {
         return this.field_38781.method_11652(var1);
      }
   }
}
