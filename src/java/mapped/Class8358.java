package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Class8358 implements Class8356 {
   private static String[] field35903;
   private final Predicate<INBT> field35904;

   public Class8358(CompoundNBT var1) {
      this.field35904 = Class8320.method29137(var1);
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof CompoundNBT && this.field35904.test(var1)) {
         var2.add(var1);
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      this.method29291(var1, var3);
   }

   @Override
   public INBT method29293() {
      return new CompoundNBT();
   }

   @Override
   public int method29294(INBT var1, Supplier<INBT> var2) {
      return 0;
   }

   @Override
   public int method29295(INBT var1) {
      return 0;
   }
}
