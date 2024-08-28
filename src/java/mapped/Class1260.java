package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.List;

public class Class1260<C extends Class920> implements Class1253<Integer> {
   public static final Logger field6658 = LogManager.getLogger();
   public final Class6207 field6659 = new Class6207();
   public Class974 field6660;
   public Class5828<C> field6661;

   public Class1260(Class5828<C> var1) {
      this.field6661 = var1;
   }

   public void method5868(Class878 var1, Class4843<C> var2, boolean var3) {
      if (var2 != null && var1.method2810().method21360(var2)) {
         this.field6660 = var1.field4902;
         if (this.method5874() || var1.method2801()) {
            this.field6659.method19128();
            var1.field4902.method4061(this.field6659);
            this.field6661.method18220(this.field6659);
            if (!this.field6659.method19123(var2, (IntList)null)) {
               this.method5869();
               var1.field4855.sendPacket(new Class5589(var1.field4905.field25471, var2));
            } else {
               this.method5871(var2, var3);
            }

            var1.field4902.method3622();
         }
      }
   }

   public void method5869() {
      for (int var3 = 0; var3 < this.field6661.method18224() * this.field6661.method18225() + 1; var3++) {
         if (var3 != this.field6661.method18223() || !(this.field6661 instanceof Class5829) && !(this.field6661 instanceof Class5830)) {
            this.method5870(var3);
         }
      }

      this.field6661.method18221();
   }

   public void method5870(int var1) {
      ItemStack var4 = this.field6661.method18131(var1).method18265();
      if (!var4.method32105()) {
         for (; var4.method32179() > 0; this.field6661.method18131(var1).method18272(1)) {
            int var5 = this.field6660.method4043(var4);
            if (var5 == -1) {
               var5 = this.field6660.method4032();
            }

            ItemStack var6 = var4.method32126();
            var6.method32180(1);
            if (!this.field6660.method4046(var5, var6)) {
               field6658.error("Can't find any space for item in the inventory");
            }
         }
      }
   }

   public void method5871(Class4843<C> var1, boolean var2) {
      boolean var5 = this.field6661.method18222(var1);
      int var6 = this.field6659.method19125(var1, (IntList)null);
      if (var5) {
         for (int var7 = 0; var7 < this.field6661.method18225() * this.field6661.method18224() + 1; var7++) {
            if (var7 != this.field6661.method18223()) {
               ItemStack var8 = this.field6661.method18131(var7).method18265();
               if (!var8.method32105() && Math.min(var6, var8.method32113()) < var8.method32179() + 1) {
                  return;
               }
            }
         }
      }

      int var13 = this.method5872(var2, var6, var5);
      IntArrayList var14 = new IntArrayList();
      if (this.field6659.method19124(var1, var14, var13)) {
         int var9 = var13;
         IntListIterator var10 = var14.iterator();

         while (var10.hasNext()) {
            int var11 = (Integer)var10.next();
            int var12 = Class6207.method19127(var11).method32113();
            if (var12 < var9) {
               var9 = var12;
            }
         }

         if (this.field6659.method19124(var1, var14, var9)) {
            this.method5869();
            this.method5832(this.field6661.method18224(), this.field6661.method18225(), this.field6661.method18223(), var1, var14.iterator(), var9);
         }
      }
   }

   @Override
   public void method5830(Iterator<Integer> var1, int var2, int var3, int var4, int var5) {
      Class5839 var8 = this.field6661.method18131(var2);
      ItemStack var9 = Class6207.method19127((Integer)var1.next());
      if (!var9.method32105()) {
         for (int var10 = 0; var10 < var3; var10++) {
            this.method5873(var8, var9);
         }
      }
   }

   public int method5872(boolean var1, int var2, boolean var3) {
      int var6 = 1;
      if (!var1) {
         if (var3) {
            var6 = 64;

            for (int var7 = 0; var7 < this.field6661.method18224() * this.field6661.method18225() + 1; var7++) {
               if (var7 != this.field6661.method18223()) {
                  ItemStack var8 = this.field6661.method18131(var7).method18265();
                  if (!var8.method32105() && var6 > var8.method32179()) {
                     var6 = var8.method32179();
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

   public void method5873(Class5839 var1, ItemStack var2) {
      int var5 = this.field6660.method4037(var2);
      if (var5 != -1) {
         ItemStack var6 = this.field6660.method3618(var5).method32126();
         if (!var6.method32105()) {
            if (var6.method32179() <= 1) {
               this.field6660.method3620(var5);
            } else {
               this.field6660.method3619(var5, 1);
            }

            var6.method32180(1);
            if (!var1.method18265().method32105()) {
               var1.method18265().method32181(1);
            } else {
               var1.method18267(var6);
            }
         }
      }
   }

   private boolean method5874() {
      List<ItemStack> var3 = Lists.newArrayList();
      int var4 = this.method5875();

      for (int var5 = 0; var5 < this.field6661.method18224() * this.field6661.method18225() + 1; var5++) {
         if (var5 != this.field6661.method18223()) {
            ItemStack var6 = this.field6661.method18131(var5).method18265().method32126();
            if (!var6.method32105()) {
               int var7 = this.field6660.method4043(var6);
               if (var7 == -1 && var3.size() <= var4) {
                  for (ItemStack var9 : var3) {
                     if (var9.method32132(var6) && var9.method32179() != var9.method32113() && var9.method32179() + var6.method32179() <= var9.method32113()) {
                        var9.method32181(var6.method32179());
                        var6.method32180(0);
                        break;
                     }
                  }

                  if (!var6.method32105()) {
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

   private int method5875() {
      int var3 = 0;

      for (ItemStack var5 : this.field6660.field5439) {
         if (var5.method32105()) {
            var3++;
         }
      }

      return var3;
   }
}
