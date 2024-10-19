package mapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class Class8360 implements Class8356 {
   private static String[] field35907;
   private final CompoundNBT field35908;
   private final Predicate<INBT> field35909;

   public Class8360(CompoundNBT var1) {
      this.field35908 = var1;
      this.field35909 = Class8320.method29137(var1);
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof ListNBT) {
         ListNBT var5 = (ListNBT)var1;
         var5.stream().filter(this.field35909).forEach(var2::add);
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      MutableBoolean var6 = new MutableBoolean();
      if (var1 instanceof ListNBT) {
         ListNBT var7 = (ListNBT)var1;
         var7.stream().filter(this.field35909).forEach(var2x -> {
            var3.add(var2x);
            var6.setTrue();
         });
         if (var6.isFalse()) {
            CompoundNBT var8 = this.field35908.copy();
            var7.add(var8);
            var3.add(var8);
         }
      }
   }

   @Override
   public INBT method29293() {
      return new ListNBT();
   }

   @Override
   public int method29294(INBT var1, Supplier<INBT> var2) {
      int var5 = 0;
      if (var1 instanceof ListNBT) {
         ListNBT var6 = (ListNBT)var1;
         int var7 = var6.size();
         if (var7 != 0) {
            for (int var8 = 0; var8 < var7; var8++) {
               INBT var9 = var6.get(var8);
               if (this.field35909.test(var9)) {
                  INBT var10 = (INBT)var2.get();
                  if (!var10.equals(var9) && var6.setNBTByIndex(var8, var10)) {
                     var5++;
                  }
               }
            }
         } else {
            var6.add((INBT)var2.get());
            var5++;
         }
      }

      return var5;
   }

   @Override
   public int method29295(INBT var1) {
      int var4 = 0;
      if (var1 instanceof ListNBT) {
         ListNBT var5 = (ListNBT)var1;

         for (int var6 = var5.size() - 1; var6 >= 0; var6--) {
            if (this.field35909.test(var5.get(var6))) {
               var5.remove(var6);
               var4++;
            }
         }
      }

      return var4;
   }
}
