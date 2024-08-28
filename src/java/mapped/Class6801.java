package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class6801<T> implements Class6802<T> {
   private final List<Class6575<T>> field29613;
   private final Function<T, ResourceLocation> field29614;

   public Class6801(Function<T, ResourceLocation> var1, List<Class8269<T>> var2, long var3) {
      this(
         var1,
         var2.stream()
            .map(var2x -> new Class6575<>(var2x.method28874(), var2x.field35556, (int)(var2x.field35557 - var3), var2x.field35558))
            .collect(Collectors.toList())
      );
   }

   private Class6801(Function<T, ResourceLocation> var1, List<Class6575<T>> var2) {
      this.field29613 = var2;
      this.field29614 = var1;
   }

   @Override
   public boolean method20718(BlockPos var1, T var2) {
      return false;
   }

   @Override
   public void method20719(BlockPos var1, T var2, int var3, Class2199 var4) {
      this.field29613.add(new Class6575<T>(var2, var1, var3, var4));
   }

   @Override
   public boolean method20720(BlockPos var1, T var2) {
      return false;
   }

   public Class41 method20721() {
      Class41 var3 = new Class41();

      for (Class6575 var5 : this.field29613) {
         Class39 var6 = new Class39();
         var6.method109("i", this.field29614.apply((T)Class6575.method19905(var5)).toString());
         var6.method102("x", var5.field28943.method8304());
         var6.method102("y", var5.field28943.getY());
         var6.method102("z", var5.field28943.method8306());
         var6.method102("t", var5.field28944);
         var6.method102("p", var5.field28945.method8914());
         var3.add(var6);
      }

      return var3;
   }

   public static <T> Class6801<T> method20722(Class41 var0, Function<T, ResourceLocation> var1, Function<ResourceLocation, T> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var0.size(); var6++) {
         Class39 var7 = var0.method153(var6);
         Object var8 = var2.apply(new ResourceLocation(var7.method126("i")));
         if (var8 != null) {
            BlockPos var9 = new BlockPos(var7.method122("x"), var7.method122("y"), var7.method122("z"));
            var5.add(new Class6575(var8, var9, var7.method122("t"), Class2199.method8913(var7.method122("p"))));
         }
      }

      return new Class6801<T>(var1, var5);
   }

   public void method20723(Class6802<T> var1) {
      this.field29613.forEach(var1x -> var1.method20719(var1x.field28943, (T) Class6575.method19905(var1x), var1x.field28944, var1x.field28945));
   }
}
