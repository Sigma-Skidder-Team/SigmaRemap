package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8662<C extends class_6867> implements class_2855<Integer> {
   public static final Logger field_44342 = LogManager.getLogger();
   public final class_534 field_44341 = new class_534();
   public class_7051 field_44344;
   public class_3954<C> field_44343;

   public class_8662(class_3954<C> var1) {
      this.field_44343 = var1;
   }

   public void method_39713(class_9359 var1, class_8932<C> var2, boolean var3) {
      if (var2 != null && var1.method_43266().method_5072(var2)) {
         this.field_44344 = var1.inventory;
         if (this.method_39708() || var1.method_3186()) {
            this.field_44341.method_2602();
            var1.inventory.method_32409(this.field_44341);
            this.field_44343.method_18269(this.field_44341);
            if (!this.field_44341.method_2613(var2, (IntList)null)) {
               this.method_39715();
               var1.field_47794.method_4156(new class_7799(var1.field_3874.field_19925, var2));
            } else {
               this.method_39712(var2, var3);
            }

            var1.inventory.method_17407();
         }
      }
   }

   public void method_39715() {
      for (int var3 = 0; var3 < this.field_44343.method_18268() * this.field_44343.method_18266() + 1; var3++) {
         if (var3 != this.field_44343.method_18262() || !(this.field_44343 instanceof class_1722) && !(this.field_44343 instanceof class_3683)) {
            this.method_39710(var3);
         }
      }

      this.field_44343.method_18270();
   }

   public void method_39710(int var1) {
      ItemStack var4 = this.field_44343.method_18878(var1).method_35898();
      if (!var4.method_28022()) {
         for (; var4.method_27997() > 0; this.field_44343.method_18878(var1).method_35899(1)) {
            int var5 = this.field_44344.method_32402(var4);
            if (var5 == -1) {
               var5 = this.field_44344.method_32398();
            }

            ItemStack var6 = var4.method_27973();
            var6.method_28017(1);
            if (!this.field_44344.method_32404(var5, var6)) {
               field_44342.error("Can't find any space for item in the inventory");
            }
         }
      }
   }

   public void method_39712(class_8932<C> var1, boolean var2) {
      boolean var5 = this.field_44343.method_18267(var1);
      int var6 = this.field_44341.method_2611(var1, (IntList)null);
      if (var5) {
         for (int var7 = 0; var7 < this.field_44343.method_18266() * this.field_44343.method_18268() + 1; var7++) {
            if (var7 != this.field_44343.method_18262()) {
               ItemStack var8 = this.field_44343.method_18878(var7).method_35898();
               if (!var8.method_28022() && Math.min(var6, var8.method_28016()) < var8.method_27997() + 1) {
                  return;
               }
            }
         }
      }

      int var13 = this.method_39709(var2, var6, var5);
      IntArrayList var14 = new IntArrayList();
      if (this.field_44341.method_2614(var1, var14, var13)) {
         int var9 = var13;
         IntListIterator var10 = var14.iterator();

         while (var10.hasNext()) {
            int var11 = (Integer)var10.next();
            int var12 = class_534.method_2604(var11).method_28016();
            if (var12 < var9) {
               var9 = var12;
            }
         }

         if (this.field_44341.method_2614(var1, var14, var9)) {
            this.method_39715();
            this.method_12972(this.field_44343.method_18268(), this.field_44343.method_18266(), this.field_44343.method_18262(), var1, var14.iterator(), var9);
         }
      }
   }

   @Override
   public void method_12971(Iterator<Integer> var1, int var2, int var3, int var4, int var5) {
      class_7934 var8 = this.field_44343.method_18878(var2);
      ItemStack var9 = class_534.method_2604((Integer)var1.next());
      if (!var9.method_28022()) {
         for (int var10 = 0; var10 < var3; var10++) {
            this.method_39711(var8, var9);
         }
      }
   }

   public int method_39709(boolean var1, int var2, boolean var3) {
      int var6 = 1;
      if (!var1) {
         if (var3) {
            var6 = 64;

            for (int var7 = 0; var7 < this.field_44343.method_18268() * this.field_44343.method_18266() + 1; var7++) {
               if (var7 != this.field_44343.method_18262()) {
                  ItemStack var8 = this.field_44343.method_18878(var7).method_35898();
                  if (!var8.method_28022() && var6 > var8.method_27997()) {
                     var6 = var8.method_27997();
                  }
               }
            }

            if (var6 < 64) {
               var6++;
            }
         }
      } else {
         var6 = var2;
      }

      return var6;
   }

   public void method_39711(class_7934 var1, ItemStack var2) {
      int var5 = this.field_44344.method_32425(var2);
      if (var5 != -1) {
         ItemStack var6 = this.field_44344.method_31498(var5).method_27973();
         if (!var6.method_28022()) {
            if (var6.method_27997() <= 1) {
               this.field_44344.method_31507(var5);
            } else {
               this.field_44344.method_31497(var5, 1);
            }

            var6.method_28017(1);
            if (!var1.method_35898().method_28022()) {
               var1.method_35898().method_28030(1);
            } else {
               var1.method_35896(var6);
            }
         }
      }
   }

   private boolean method_39708() {
      ArrayList var3 = Lists.newArrayList();
      int var4 = this.method_39714();

      for (int var5 = 0; var5 < this.field_44343.method_18268() * this.field_44343.method_18266() + 1; var5++) {
         if (var5 != this.field_44343.method_18262()) {
            ItemStack var6 = this.field_44343.method_18878(var5).method_35898().method_27973();
            if (!var6.method_28022()) {
               int var7 = this.field_44344.method_32402(var6);
               if (var7 == -1 && var3.size() <= var4) {
                  for (ItemStack var9 : var3) {
                     if (var9.method_27991(var6)
                        && var9.method_27997() != var9.method_28016()
                        && var9.method_27997() + var6.method_27997() <= var9.method_28016()) {
                        var9.method_28030(var6.method_27997());
                        var6.method_28017(0);
                        break;
                     }
                  }

                  if (!var6.method_28022()) {
                     if (var3.size() >= var4) {
                        return false;
                     }

                     var3.add(var6);
                  }
               } else if (var7 == -1) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private int method_39714() {
      int var3 = 0;

      for (ItemStack var5 : this.field_44344.field_36401) {
         if (var5.method_28022()) {
            var3++;
         }
      }

      return var3;
   }
}
