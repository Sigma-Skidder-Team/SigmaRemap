package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

import java.util.BitSet;
import java.util.List;

public class Class6207 {
   public final Int2IntMap field27690 = new Int2IntOpenHashMap();

   public void method19116(ItemStack var1) {
      if (!var1.method32116() && !var1.method32163() && !var1.method32152()) {
         this.method19117(var1);
      }
   }

   public void method19117(ItemStack var1) {
      this.method19118(var1, 64);
   }

   public void method19118(ItemStack var1, int var2) {
      if (!var1.isEmpty()) {
         int var5 = method19119(var1);
         int var6 = Math.min(var2, var1.getCount());
         this.method19122(var5, var6);
      }
   }

   public static int method19119(ItemStack var0) {
      return Registry.ITEM.getId(var0.getItem());
   }

   private boolean method19120(int var1) {
      return this.field27690.get(var1) > 0;
   }

   private int method19121(int var1, int var2) {
      int var5 = this.field27690.get(var1);
      if (var5 < var2) {
         return 0;
      } else {
         this.field27690.put(var1, var5 - var2);
         return var1;
      }
   }

   private void method19122(int var1, int var2) {
      this.field27690.put(var1, this.field27690.get(var1) + var2);
   }

   public boolean method19123(IRecipe<?> var1, IntList var2) {
      return this.method19124(var1, var2, 1);
   }

   public boolean method19124(IRecipe<?> var1, IntList var2, int var3) {
      return new Class8520(var1).method30187(var3, var2);
   }

   public int method19125(IRecipe<?> var1, IntList var2) {
      return this.method19126(var1, Integer.MAX_VALUE, var2);
   }

   public int method19126(IRecipe<?> var1, int var2, IntList var3) {
      return new Class8520(var1).method30200(var2, var3);
   }

   public static ItemStack method19127(int var0) {
      return var0 != 0 ? new ItemStack(Item.method11702(var0)) : ItemStack.EMPTY;
   }

   public void method19128() {
      this.field27690.clear();
   }

   // $VF: synthetic method
   public static int method19129(Class6207 var0, int var1, int var2) {
      return var0.method19121(var1, var2);
   }

   // $VF: synthetic method
   public static void method19130(Class6207 var0, int var1, int var2) {
      var0.method19122(var1, var2);
   }

   // $VF: synthetic method
   public static boolean method19131(Class6207 var0, int var1) {
      return var0.method19120(var1);
   }

   public class Class8520 {
      private final IRecipe<?> field38231;
      private final List<Class120> field38232;
      private final int field38233;
      private final int[] field38234;
      private final int field38235;
      private final BitSet field38236;
      private final IntList field38237;
   
      public Class8520(IRecipe<?> var1) {
         this.field38231 = var1;
         this.field38232 = Lists.newArrayList();
         this.field38237 = new IntArrayList();
         this.field38232.addAll(field38231.method14969());
         this.field38232.removeIf(Class120::method337);
         this.field38233 = this.field38232.size();
         this.field38234 = this.method30188();
         this.field38235 = this.field38234.length;
         this.field38236 = new BitSet(this.field38233 + this.field38235 + this.field38233 + this.field38233 * this.field38235);
   
         for (int var5 = 0; var5 < this.field38232.size(); var5++) {
            IntList var6 = this.field38232.get(var5).method334();
   
            for (int var7 = 0; var7 < this.field38235; var7++) {
               if (var6.contains(this.field38234[var7])) {
                  this.field38236.set(this.method30196(true, var7, var5));
               }
            }
         }
      }
   
      public boolean method30187(int var1, IntList var2) {
         if (var1 <= 0) {
            return true;
         } else {
            int var5;
            for (var5 = 0; this.method30189(var1); var5++) {
               method19129(Class6207.this, this.field38234[this.field38237.getInt(0)], var1);
               int var6 = this.field38237.size() - 1;
               this.method30191(this.field38237.getInt(var6));
   
               for (int var7 = 0; var7 < var6; var7++) {
                  this.method30195((var7 & 1) == 0, this.field38237.get(var7), this.field38237.get(var7 + 1));
               }
   
               this.field38237.clear();
               this.field38236.clear(0, this.field38233 + this.field38235);
            }
   
            boolean var12 = var5 == this.field38233;
            boolean var13 = var12 && var2 != null;
            if (var13) {
               var2.clear();
            }
   
            this.field38236.clear(0, this.field38233 + this.field38235 + this.field38233);
            int var8 = 0;
            NonNullList<Class120> var9 = this.field38231.method14969();
   
            for (int var10 = 0; var10 < var9.size(); var10++) {
               if (var13 && var9.get(var10).method337()) {
                  var2.add(0);
               } else {
                  for (int var11 = 0; var11 < this.field38235; var11++) {
                     if (this.method30194(false, var8, var11)) {
                        this.method30195(true, var11, var8);
                        method19130(Class6207.this, this.field38234[var11], var1);
                        if (var13) {
                           var2.add(this.field38234[var11]);
                        }
                     }
                  }
   
                  var8++;
               }
            }
   
            return var12;
         }
      }
   
      private int[] method30188() {
         IntAVLTreeSet var3 = new IntAVLTreeSet();
   
         for (Class120 var5 : this.field38232) {
            var3.addAll(var5.method334());
         }
   
         IntIterator var6 = var3.iterator();
   
         while (var6.hasNext()) {
            if (!method19131(Class6207.this, var6.nextInt())) {
               var6.remove();
            }
         }
   
         return var3.toIntArray();
      }
   
      private boolean method30189(int var1) {
         int var4 = this.field38235;
   
         for (int var5 = 0; var5 < var4; var5++) {
            if (Class6207.this.field27690.get(this.field38234[var5]) >= var1) {
               this.method30197(false, var5);
   
               while (!this.field38237.isEmpty()) {
                  int var6 = this.field38237.size();
                  boolean var7 = (var6 & 1) == 1;
                  int var8 = this.field38237.getInt(var6 - 1);
                  if (!var7 && !this.method30190(var8)) {
                     break;
                  }
   
                  int var9 = !var7 ? var4 : this.field38233;
                  int var10 = 0;
   
                  while (true) {
                     if (var10 < var9) {
                        if (this.method30198(var7, var10) || !this.method30193(var7, var8, var10) || !this.method30194(var7, var8, var10)) {
                           var10++;
                           continue;
                        }
   
                        this.method30197(var7, var10);
                     }
   
                     var10 = this.field38237.size();
                     if (var10 == var6) {
                        this.field38237.removeInt(var10 - 1);
                     }
                     break;
                  }
               }
   
               if (!this.field38237.isEmpty()) {
                  return true;
               }
            }
         }
   
         return false;
      }
   
      private boolean method30190(int var1) {
         return this.field38236.get(this.method30192(var1));
      }
   
      private void method30191(int var1) {
         this.field38236.set(this.method30192(var1));
      }
   
      private int method30192(int var1) {
         return this.field38233 + this.field38235 + var1;
      }
   
      private boolean method30193(boolean var1, int var2, int var3) {
         return this.field38236.get(this.method30196(var1, var2, var3));
      }
   
      private boolean method30194(boolean var1, int var2, int var3) {
         return var1 != this.field38236.get(1 + this.method30196(var1, var2, var3));
      }
   
      private void method30195(boolean var1, int var2, int var3) {
         this.field38236.flip(1 + this.method30196(var1, var2, var3));
      }
   
      private int method30196(boolean var1, int var2, int var3) {
         int var6 = !var1 ? var3 * this.field38233 + var2 : var2 * this.field38233 + var3;
         return this.field38233 + this.field38235 + this.field38233 + 2 * var6;
      }
   
      private void method30197(boolean var1, int var2) {
         this.field38236.set(this.method30199(var1, var2));
         this.field38237.add(var2);
      }
   
      private boolean method30198(boolean var1, int var2) {
         return this.field38236.get(this.method30199(var1, var2));
      }
   
      private int method30199(boolean var1, int var2) {
         return (!var1 ? this.field38233 : 0) + var2;
      }
   
      public int method30200(int var1, IntList var2) {
         int var5 = 0;
         int var6 = Math.min(var1, this.method30201()) + 1;
   
         while (true) {
            int var7 = (var5 + var6) / 2;
            if (!this.method30187(var7, (IntList)null)) {
               var6 = var7;
            } else {
               if (var6 - var5 <= 1) {
                  if (var7 > 0) {
                     this.method30187(var7, var2);
                  }
   
                  return var7;
               }
   
               var5 = var7;
            }
         }
      }
   
      private int method30201() {
         int var3 = Integer.MAX_VALUE;
   
         for (Class120 var5 : this.field38232) {
            int var6 = 0;
            IntListIterator var7 = var5.method334().iterator();
   
            while (var7.hasNext()) {
               int var8 = (Integer)var7.next();
               var6 = Math.max(var6, Class6207.this.field27690.get(var8));
            }
   
            if (var3 > 0) {
               var3 = Math.min(var3, var6);
            }
         }
   
         return var3;
      }
   }
}
