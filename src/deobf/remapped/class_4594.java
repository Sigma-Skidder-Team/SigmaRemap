package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_4594<T> implements class_1272<T> {
   private static String[] field_22336;
   public class_2566<T> field_22334 = new class_2566<T>();
   public class_2566<T> field_22337 = new class_2566<T>();
   private final Function<T, Stream<Identifier>> field_22332;
   private final List<T> field_22333 = Lists.newArrayList();
   private final Object2IntMap<T> field_22335 = new Object2IntOpenHashMap();

   public class_4594(Function<T, Stream<Identifier>> var1) {
      this.field_22332 = var1;
   }

   @Override
   public void method_5710() {
      this.field_22334 = new class_2566<T>();
      this.field_22337 = new class_2566<T>();

      for (Object var4 : this.field_22333) {
         this.method_21296((T)var4);
      }

      this.field_22334.method_11653();
      this.field_22337.method_11653();
   }

   @Override
   public void method_5709(T var1) {
      this.field_22335.put(var1, this.field_22333.size());
      this.field_22333.add((T)var1);
      this.method_21296((T)var1);
   }

   @Override
   public void method_5711() {
      this.field_22333.clear();
      this.field_22335.clear();
   }

   public void method_21296(T var1) {
      this.field_22332.apply((T)var1).forEach(var2 -> {
         this.field_22334.method_11650((T)var1, var2.method_21461().toLowerCase(Locale.ROOT));
         this.field_22337.method_11650((T)var1, var2.method_21456().toLowerCase(Locale.ROOT));
      });
   }

   public int method_21297(T var1, T var2) {
      return Integer.compare(this.field_22335.getInt(var1), this.field_22335.getInt(var2));
   }

   @Override
   public List<T> method_14476(String var1) {
      int var4 = var1.indexOf(58);
      if (var4 != -1) {
         List var5 = this.field_22334.method_11652(var1.substring(0, var4).trim());
         String var6 = var1.substring(var4 + 1).trim();
         List var7 = this.field_22337.method_11652(var6);
         return Lists.newArrayList(new class_6731<T>(var5.iterator(), var7.iterator(), this::method_21297));
      } else {
         return this.field_22337.method_11652(var1);
      }
   }
}
