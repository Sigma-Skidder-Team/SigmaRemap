package mapped;

import net.minecraft.nbt.CollectionNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;

import java.util.List;
import java.util.function.Supplier;

public class Class8355 implements Class8356 {
   private static String[] field35897;
   private final int field35898;

   public Class8355(int var1) {
      this.field35898 = var1;
   }

   @Override
   public void method29291(INBT var1, List<INBT> var2) {
      if (var1 instanceof CollectionNBT) {
         CollectionNBT<INBT> var5 = (CollectionNBT) var1;
         int var6 = var5.size();
         int var7 = this.field35898 >= 0 ? this.field35898 : var6 + this.field35898;
         if (0 <= var7 && var7 < var6) {
            var2.add(var5.get(var7));
         }
      }
   }

   @Override
   public void method29292(INBT var1, Supplier<INBT> var2, List<INBT> var3) {
      this.method29291(var1, var3);
   }

   @Override
   public INBT method29293() {
      return new ListNBT();
   }

   @Override
   public int method29294(INBT var1, Supplier<INBT> var2) {
      if (var1 instanceof CollectionNBT) {
         CollectionNBT var5 = (CollectionNBT)var1;
         int var6 = var5.size();
         int var7 = this.field35898 >= 0 ? this.field35898 : var6 + this.field35898;
         if (0 <= var7 && var7 < var6) {
            INBT var8 = (INBT)var5.get(var7);
            INBT var9 = (INBT)var2.get();
            if (!var9.equals(var8) && var5.setNBTByIndex(var7, var9)) {
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int method29295(INBT var1) {
      if (var1 instanceof CollectionNBT) {
         CollectionNBT var4 = (CollectionNBT)var1;
         int var5 = var4.size();
         int var6 = this.field35898 >= 0 ? this.field35898 : var5 + this.field35898;
         if (0 <= var6 && var6 < var5) {
            var4.remove(var6);
            return 1;
         }
      }

      return 0;
   }
}
