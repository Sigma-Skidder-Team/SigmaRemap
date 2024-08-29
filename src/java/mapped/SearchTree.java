package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public class SearchTree<T> extends SearchTreeReloadable<T> {
   private static String[] field30303;
   public Class7736<T> field30304 = new Class7736<T>();
   private final Function<T, Stream<String>> field30305;

   public SearchTree(Function<T, Stream<String>> var1, Function<T, Stream<ResourceLocation>> var2) {
      super(var2);
      this.field30305 = var1;
   }

   @Override
   public void method21736() {
      this.field30304 = new Class7736<T>();
      super.method21736();
      this.field30304.method25608();
   }

   @Override
   public void method21738(T var1) {
      super.method21738((T)var1);
      this.field30305.apply((T)var1).forEach(var2 -> this.field30304.method25607((T)var1, var2.toLowerCase(Locale.ROOT)));
   }

   @Override
   public List<T> method21737(String var1) {
      int var4 = var1.indexOf(58);
      if (var4 >= 0) {
         List var5 = this.field30298.method25612(var1.substring(0, var4).trim());
         String var6 = var1.substring(var4 + 1).trim();
         List var7 = this.field30299.method25612(var6);
         List var8 = this.field30304.method25612(var6);
         return Lists.newArrayList(new Class4552<T>(var5.iterator(), new Class4553<T>(var7.iterator(), var8.iterator(), this::method21739), this::method21739));
      } else {
         return this.field30304.method25612(var1);
      }
   }
}
