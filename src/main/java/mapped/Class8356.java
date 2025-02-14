package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.INBT;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public interface Class8356 {
   void method29291(INBT var1, List<INBT> var2);

   void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3);

   INBT method29293();

   int method29294(INBT var1, Supplier<INBT> var2);

   int method29295(INBT var1);

   default List<INBT> method29296(List<INBT> var1) {
      return this.method29298(var1, this::method29291);
   }

   default List<INBT> method29297(List<INBT> var1, Supplier<INBT> var2) {
      return this.method29298(var1, (var2x, var3) -> this.method29292(var2x, var2, var3));
   }

   default List<INBT> method29298(List<INBT> var1, BiConsumer<INBT, List<INBT>> var2) {
      ArrayList var5 = Lists.newArrayList();

      for (INBT var7 : var1) {
         var2.accept(var7, var5);
      }

      return var5;
   }
}
