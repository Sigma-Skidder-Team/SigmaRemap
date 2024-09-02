package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

import java.util.List;
import java.util.function.Supplier;

public class Class8359 implements Class8356 {
   private static String[] field35905;
   private final String field35906;

   public Class8359(String var1) {
      this.field35906 = var1;
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof CompoundNBT) {
         INBT var5 = ((CompoundNBT)var1).method116(this.field35906);
         if (var5 != null) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var6 = (CompoundNBT)var1;
         INBT var7;
         if (!var6.contains(this.field35906)) {
            var7 = (INBT)var2.get();
            var6.put(this.field35906, var7);
         } else {
            var7 = var6.method116(this.field35906);
         }

         var3.add(var7);
      }
   }

   @Override
   public INBT method29293() {
      return new CompoundNBT();
   }

   @Override
   public int method29294(INBT var1, Supplier<INBT> var2) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var5 = (CompoundNBT)var1;
         INBT var6 = (INBT)var2.get();
         INBT var7 = var5.put(this.field35906, var6);
         if (!var6.equals(var7)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int method29295(INBT var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         if (var4.contains(this.field35906)) {
            var4.method133(this.field35906);
            return 1;
         }
      }

      return 0;
   }
}
