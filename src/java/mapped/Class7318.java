package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7318 {
   private static final Logger field31379 = LogManager.getLogger();
   public static final Class7318 field31380 = new Class7318(Class8524.field38281, new Class8894[0], new ILootFunction[0]);
   public static final Class7538 field31381 = Class8524.field38291;
   private final Class7538 field31382;
   private final Class8894[] field31383;
   private final ILootFunction[] field31384;
   private final BiFunction<ItemStack, LootContext, ItemStack> field31385;

   public Class7318(Class7538 var1, Class8894[] var2, ILootFunction[] var3) {
      this.field31382 = var1;
      this.field31383 = var2;
      this.field31384 = var3;
      this.field31385 = LootFunctionManager.combine(var3);
   }

   public static Consumer<ItemStack> method23179(Consumer<ItemStack> var0) {
      return var1 -> {
         if (var1.getCount() >= var1.method32113()) {
            int var4 = var1.getCount();

            while (var4 > 0) {
               ItemStack var5 = var1.copy();
               var5.method32180(Math.min(var1.method32113(), var4));
               var4 -= var5.getCount();
               var0.accept(var5);
            }
         } else {
            var0.accept(var1);
         }
      };
   }

   public void method23180(LootContext var1, Consumer<ItemStack> var2) {
      if (!var1.method26082(this)) {
         field31379.warn("Detected infinite loop in loot tables");
      } else {
         Consumer var5 = ILootFunction.method369(this.field31385, var2, var1);

         for (Class8894 var9 : this.field31383) {
            var9.method32371(var5, var1);
         }

         var1.method26083(this);
      }
   }

   public void method23181(LootContext var1, Consumer<ItemStack> var2) {
      this.method23180(var1, method23179(var2));
   }

   public List<ItemStack> method23182(LootContext var1) {
      ArrayList var4 = Lists.newArrayList();
      this.method23181(var1, var4::add);
      return var4;
   }

   public Class7538 method23183() {
      return this.field31382;
   }

   public void method23184(Class8478 var1) {
      for (int var4 = 0; var4 < this.field31383.length; var4++) {
         this.field31383[var4].method32372(var1.method29956(".pools[" + var4 + "]"));
      }

      for (int var5 = 0; var5 < this.field31384.length; var5++) {
         this.field31384[var5].method367(var1.method29956(".functions[" + var5 + "]"));
      }
   }

   public void method23185(Class920 var1, LootContext var2) {
      List<ItemStack> var5 = this.method23182(var2);
      Random var6 = var2.method26088();
      List<Integer> var7 = this.method23187(var1, var6);
      this.method23186(var5, var7.size(), var6);

      for (ItemStack var9 : var5) {
         if (var7.isEmpty()) {
            field31379.warn("Tried to over-fill a container");
            return;
         }

         if (!var9.isEmpty()) {
            var1.method3621((Integer)var7.remove(var7.size() - 1), var9);
         } else {
            var1.method3621((Integer)var7.remove(var7.size() - 1), ItemStack.EMPTY);
         }
      }
   }

   private void method23186(List<ItemStack> var1, int var2, Random var3) {
      ArrayList var6 = Lists.newArrayList();
      Iterator var7 = var1.iterator();

      while (var7.hasNext()) {
         ItemStack var8 = (ItemStack)var7.next();
         if (!var8.isEmpty()) {
            if (var8.getCount() > 1) {
               var6.add(var8);
               var7.remove();
            }
         } else {
            var7.remove();
         }
      }

      while (var2 - var1.size() - var6.size() > 0 && !var6.isEmpty()) {
         ItemStack var11 = (ItemStack)var6.remove(MathHelper.method37782(var3, 0, var6.size() - 1));
         int var9 = MathHelper.method37782(var3, 1, var11.getCount() / 2);
         ItemStack var10 = var11.method32106(var9);
         if (var11.getCount() > 1 && var3.nextBoolean()) {
            var6.add(var11);
         } else {
            var1.add(var11);
         }

         if (var10.getCount() > 1 && var3.nextBoolean()) {
            var6.add(var10);
         } else {
            var1.add(var10);
         }
      }

      var1.addAll(var6);
      Collections.shuffle(var1, var3);
   }

   private List<Integer> method23187(Class920 var1, Random var2) {
      ArrayList var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < var1.method3629(); var6++) {
         if (var1.method3618(var6).isEmpty()) {
            var5.add(var6);
         }
      }

      Collections.shuffle(var5, var2);
      return var5;
   }

   public static Class5888 method23188() {
      return new Class5888();
   }

   // $VF: synthetic method
   public static Class7538 method23190(Class7318 var0) {
      return var0.field31382;
   }

   // $VF: synthetic method
   public static Logger method23191() {
      return field31379;
   }

   // $VF: synthetic method
   public static Class8894[] method23192(Class7318 var0) {
      return var0.field31383;
   }

   // $VF: synthetic method
   public static ILootFunction[] method23193(Class7318 var0) {
      return var0.field31384;
   }
}
