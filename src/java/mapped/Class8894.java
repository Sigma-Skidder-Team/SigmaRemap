package mapped;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class Class8894 {
   private final Class4688[] field40251;
   private final Class122[] field40252;
   private final Predicate<Class7812> field40253;
   private final Class127[] field40254;
   private final BiFunction<ItemStack, Class7812, ItemStack> field40255;
   private final Class6870 field40256;
   private final Class6872 field40257;

   public Class8894(Class4688[] var1, Class122[] var2, Class127[] var3, Class6870 var4, Class6872 var5) {
      this.field40251 = var1;
      this.field40252 = var2;
      this.field40253 = Class8582.<Class7812>method30665(var2);
      this.field40254 = var3;
      this.field40255 = Class8585.method30686(var3);
      this.field40256 = var4;
      this.field40257 = var5;
   }

   private void method32370(Consumer<ItemStack> var1, Class7812 var2) {
      Random var5 = var2.method26088();
      List<Class6549> var6 = Lists.newArrayList();
      MutableInt var7 = new MutableInt();

      for (Class4688 var11 : this.field40251) {
         var11.method14697(var2, var3 -> {
            int var6x = var3.method19892(var2.method26089());
            if (var6x > 0) {
               var6.add(var3);
               var7.add(var6x);
            }
         });
      }

      int var12 = var6.size();
      if (var7.intValue() != 0 && var12 != 0) {
         if (var12 != 1) {
            int var13 = var5.nextInt(var7.intValue());

            for (Class6549 var15 : var6) {
               var13 -= var15.method19892(var2.method26089());
               if (var13 < 0) {
                  var15.method19893(var1, var2);
                  return;
               }
            }
         } else {
            ((Class6549)var6.get(0)).method19893(var1, var2);
         }
      }
   }

   public void method32371(Consumer<ItemStack> var1, Class7812 var2) {
      if (this.field40253.test(var2)) {
         Consumer var5 = Class127.method369(this.field40255, var1, var2);
         Random var6 = var2.method26088();
         int var7 = this.field40256.method20914(var6) + MathHelper.method37767(this.field40257.method20924(var6) * var2.method26089());

         for (int var8 = 0; var8 < var7; var8++) {
            this.method32370(var5, var2);
         }
      }
   }

   public void method32372(Class8478 var1) {
      for (int var4 = 0; var4 < this.field40252.length; var4++) {
         this.field40252[var4].method367(var1.method29956(".condition[" + var4 + "]"));
      }

      for (int var5 = 0; var5 < this.field40254.length; var5++) {
         this.field40254[var5].method367(var1.method29956(".functions[" + var5 + "]"));
      }

      for (int var6 = 0; var6 < this.field40251.length; var6++) {
         this.field40251[var6].method14703(var1.method29956(".entries[" + var6 + "]"));
      }
   }

   public static Class5870 method32373() {
      return new Class5870();
   }

   // $VF: synthetic method
   public static Class6870 method32375(Class8894 var0) {
      return var0.field40256;
   }

   // $VF: synthetic method
   public static Class4688[] method32376(Class8894 var0) {
      return var0.field40251;
   }

   // $VF: synthetic method
   public static Class6872 method32377(Class8894 var0) {
      return var0.field40257;
   }

   // $VF: synthetic method
   public static Class122[] method32378(Class8894 var0) {
      return var0.field40252;
   }

   // $VF: synthetic method
   public static Class127[] method32379(Class8894 var0) {
      return var0.field40254;
   }
}
