package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ITickList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Class6801<T> implements ITickList<T> {
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

   public ListNBT method20721() {
      ListNBT var3 = new ListNBT();

      for (Class6575 var5 : this.field29613) {
         CompoundNBT var6 = new CompoundNBT();
         var6.putString("i", this.field29614.apply((T)Class6575.method19905(var5)).toString());
         var6.putInt("x", var5.field28943.getX());
         var6.putInt("y", var5.field28943.getY());
         var6.putInt("z", var5.field28943.getZ());
         var6.putInt("t", var5.field28944);
         var6.putInt("p", var5.field28945.method8914());
         var3.add(var6);
      }

      return var3;
   }

   public static <T> Class6801<T> method20722(ListNBT var0, Function<T, ResourceLocation> var1, Function<ResourceLocation, T> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var0.size(); var6++) {
         CompoundNBT var7 = var0.getCompound(var6);
         Object var8 = var2.apply(new ResourceLocation(var7.getString("i")));
         if (var8 != null) {
            BlockPos var9 = new BlockPos(var7.getInt("x"), var7.getInt("y"), var7.getInt("z"));
            var5.add(new Class6575(var8, var9, var7.getInt("t"), Class2199.method8913(var7.getInt("p"))));
         }
      }

      return new Class6801<T>(var1, var5);
   }

   public void method20723(ITickList<T> var1) {
      this.field29613.forEach(var1x -> var1.method20719(var1x.field28943, (T) Class6575.method19905(var1x), var1x.field28944, var1x.field28945));
   }
}
