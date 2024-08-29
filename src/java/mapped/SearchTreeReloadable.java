package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class SearchTreeReloadable<T> implements IMutableSearchTree<T> {
   private static String[] field30297;
   public Class7736<T> field30298 = new Class7736<T>();
   public Class7736<T> field30299 = new Class7736<T>();
   private final Function<T, Stream<ResourceLocation>> field30300;
   private final List<T> field30301 = Lists.newArrayList();
   private final Object2IntMap<T> field30302 = new Object2IntOpenHashMap();

   public SearchTreeReloadable(Function<T, Stream<ResourceLocation>> var1) {
      this.field30300 = var1;
   }

   @Override
   public void method21736() {
      this.field30298 = new Class7736<T>();
      this.field30299 = new Class7736<T>();

      for (Object var4 : this.field30301) {
         this.method21738((T)var4);
      }

      this.field30298.method25608();
      this.field30299.method25608();
   }

   @Override
   public void func_217872_a(T var1) {
      this.field30302.put(var1, this.field30301.size());
      this.field30301.add((T)var1);
      this.method21738((T)var1);
   }

   @Override
   public void method21735() {
      this.field30301.clear();
      this.field30302.clear();
   }

   public void method21738(T var1) {
      this.field30300.apply((T)var1).forEach(var2 -> {
         this.field30298.method25607((T)var1, var2.method8293().toLowerCase(Locale.ROOT));
         this.field30299.method25607((T)var1, var2.method8292().toLowerCase(Locale.ROOT));
      });
   }

   public int method21739(T var1, T var2) {
      return Integer.compare(this.field30302.getInt(var1), this.field30302.getInt(var2));
   }

   @Override
   public List<T> method21737(String var1) {
      int var4 = var1.indexOf(58);
      if (var4 != -1) {
         List var5 = this.field30298.method25612(var1.substring(0, var4).trim());
         String var6 = var1.substring(var4 + 1).trim();
         List var7 = this.field30299.method25612(var6);
         return Lists.newArrayList(new Class4552<T>(var5.iterator(), var7.iterator(), this::method21739));
      } else {
         return this.field30299.method25612(var1);
      }
   }
}
