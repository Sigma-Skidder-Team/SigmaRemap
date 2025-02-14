package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Class8357 implements Class8356 {
   private static String[] field35899;
   private final String field35900;
   private final CompoundNBT field35901;
   private final Predicate<INBT> field35902;

   public Class8357(String var1, CompoundNBT var2) {
      this.field35900 = var1;
      this.field35901 = var2;
      this.field35902 = Class8320.method29137(var2);
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof CompoundNBT) {
         INBT var5 = ((CompoundNBT)var1).get(this.field35900);
         if (this.field35902.test(var5)) {
            var2.add(var5);
         }
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var6 = (CompoundNBT)var1;
         INBT var7 = var6.get(this.field35900);
         if (var7 != null) {
            if (this.field35902.test(var7)) {
               var3.add(var7);
            }
         } else {
            CompoundNBT var8 = this.field35901.copy();
            var6.put(this.field35900, var8);
            var3.add(var8);
         }
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
         INBT var6 = var5.get(this.field35900);
         if (this.field35902.test(var6)) {
            INBT var7 = (INBT)var2.get();
            if (!var7.equals(var6)) {
               var5.put(this.field35900, var7);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method29295(INBT var1) {
      if (var1 instanceof CompoundNBT) {
         CompoundNBT var4 = (CompoundNBT)var1;
         INBT var5 = var4.get(this.field35900);
         if (this.field35902.test(var5)) {
            var4.remove(this.field35900);
            return 1;
         }
      }

      return 0;
   }
}
