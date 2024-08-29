package mapped;

import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.util.math.BlockPos;

import java.util.function.Function;
import java.util.function.Predicate;

public class Class6806<T> implements Class6802<T> {
   private static String[] field29627;
   public final Predicate<T> field29628;
   private final Class7481 field29629;
   private final ShortList[] field29630 = new ShortList[16];

   public Class6806(Predicate<T> var1, Class7481 var2) {
      this(var1, var2, new ListNBT());
   }

   public Class6806(Predicate<T> var1, Class7481 var2, ListNBT var3) {
      this.field29628 = var1;
      this.field29629 = var2;

      for (int var6 = 0; var6 < var3.size(); var6++) {
         ListNBT var7 = var3.method154(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            IChunk.method7094(this.field29630, var6).add(var7.method155(var8));
         }
      }
   }

   public ListNBT method20737() {
      return Class9725.method38094(this.field29630);
   }

   public void method20738(Class6802<T> var1, Function<BlockPos, T> var2) {
      for (int var5 = 0; var5 < this.field29630.length; var5++) {
         if (this.field29630[var5] != null) {

             for (Short var7 : this.field29630[var5]) {
                 BlockPos var8 = Class1672.method7114(var7, var5, this.field29629);
                 var1.method20726(var8, var2.apply(var8), 0);
             }

            this.field29630[var5].clear();
         }
      }
   }

   @Override
   public boolean method20718(BlockPos var1, T var2) {
      return false;
   }

   @Override
   public void method20719(BlockPos var1, T var2, int var3, Class2199 var4) {
      IChunk.method7094(this.field29630, var1.getY() >> 4).add(Class1672.method7113(var1));
   }

   @Override
   public boolean method20720(BlockPos var1, T var2) {
      return false;
   }
}
