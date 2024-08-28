package mapped;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Class5815 extends Class5812 {
   private final Class920 field25483 = new Class921();
   private final Class920 field25484 = new Class982(this, 2);
   private final Class8786 field25485;

   public Class5815(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5815(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35662, var1);
      this.field25485 = var3;
      this.method18124(new Class5838(this, this.field25484, 0, 49, 19));
      this.method18124(new Class5847(this, this.field25484, 1, 49, 40));
      this.method18124(new Class5863(this, this.field25483, 2, 129, 34, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method18124(new Class5839(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method18124(new Class5839(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public void method18106(Class920 var1) {
      super.method18106(var1);
      if (var1 == this.field25484) {
         this.method18166();
      }
   }

   private void method18166() {
      Class8848 var3 = this.field25484.method3618(0);
      Class8848 var4 = this.field25484.method3618(1);
      boolean var5 = !var3.method32105() || !var4.method32105();
      boolean var6 = !var3.method32105() && !var4.method32105();
      if (!var5) {
         this.field25483.method3621(0, Class8848.field39973);
      } else {
         boolean var7 = !var3.method32105() && var3.method32107() != Class8514.field38070 && !var3.method32163()
            || !var4.method32105() && var4.method32107() != Class8514.field38070 && !var4.method32163();
         if (var3.method32179() > 1 || var4.method32179() > 1 || !var6 && var7) {
            this.field25483.method3621(0, Class8848.field39973);
            this.method18130();
            return;
         }

         byte var8 = 1;
         int var13;
         Class8848 var14;
         if (!var6) {
            boolean var9 = !var3.method32105();
            var13 = !var9 ? var4.method32117() : var3.method32117();
            var14 = !var9 ? var4 : var3;
         } else {
            if (var3.method32107() != var4.method32107()) {
               this.field25483.method3621(0, Class8848.field39973);
               this.method18130();
               return;
            }

            Class3257 var15 = var3.method32107();
            int var10 = var15.method11711() - var3.method32117();
            int var11 = var15.method11711() - var4.method32117();
            int var12 = var10 + var11 + var15.method11711() * 5 / 100;
            var13 = Math.max(var15.method11711() - var12, 0);
            var14 = this.method18167(var3, var4);
            if (!var14.method32115()) {
               if (!Class8848.method32128(var3, var4)) {
                  this.field25483.method3621(0, Class8848.field39973);
                  this.method18130();
                  return;
               }

               var8 = 2;
            }
         }

         this.field25483.method3621(0, this.method18168(var14, var13, var8));
      }

      this.method18130();
   }

   private Class8848 method18167(Class8848 var1, Class8848 var2) {
      Class8848 var5 = var1.method32126();
      Map<Class6069, Integer> var6 = Class7858.method26312(var2);

      for (Entry<Class6069, Integer> var8 : var6.entrySet()) {
         Class6069 var9 = var8.getKey();
         if (!var9.method18825() || Class7858.method26311(var9, var5) == 0) {
            var5.method32162(var9, var8.getValue());
         }
      }

      return var5;
   }

   private Class8848 method18168(Class8848 var1, int var2, int var3) {
      Class8848 var6 = var1.method32126();
      var6.method32146("Enchantments");
      var6.method32146("StoredEnchantments");
      if (var2 <= 0) {
         var6.method32146("Damage");
      } else {
         var6.method32118(var2);
      }

      var6.method32180(var3);
      Map var7 = Class7858.method26312(var1)
         .entrySet()
         .stream()
         .filter(var0 -> var0.getKey().method18825())
         .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      Class7858.method26314(var7, var6);
      var6.method32170(0);
      if (var6.method32107() == Class8514.field38070 && var7.size() == 0) {
         var6 = new Class8848(Class8514.field37900);
         if (var1.method32152()) {
            var6.method32150(var1.method32149());
         }
      }

      for (int var8 = 0; var8 < var7.size(); var8++) {
         var6.method32170(Class5824.method18196(var6.method32169()));
      }

      return var6;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25485.method31716((var2, var3) -> this.method18135(var1, var2, this.field25484));
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25485, var1, Class8487.field37060);
   }

   @Override
   public Class8848 method18112(PlayerEntity var1, int var2) {
      Class8848 var5 = Class8848.field39973;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         Class8848 var7 = var6.method18265();
         var5 = var7.method32126();
         Class8848 var8 = this.field25484.method3618(0);
         Class8848 var9 = this.field25484.method3618(1);
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (!var8.method32105() && !var9.method32105()) {
                  if (var2 >= 3 && var2 < 30) {
                     if (!this.method18142(var7, 30, 39, false)) {
                        return Class8848.field39973;
                     }
                  } else if (var2 >= 30 && var2 < 39 && !this.method18142(var7, 3, 30, false)) {
                     return Class8848.field39973;
                  }
               } else if (!this.method18142(var7, 0, 2, false)) {
                  return Class8848.field39973;
               }
            } else if (!this.method18142(var7, 3, 39, false)) {
               return Class8848.field39973;
            }
         } else {
            if (!this.method18142(var7, 3, 39, true)) {
               return Class8848.field39973;
            }

            var6.method18260(var7, var5);
         }

         if (!var7.method32105()) {
            var6.method18268();
         } else {
            var6.method18267(Class8848.field39973);
         }

         if (var7.method32179() == var5.method32179()) {
            return Class8848.field39973;
         }

         var6.method18264(var1, var7);
      }

      return var5;
   }

   // $VF: synthetic method
   public static Class920 method18171(Class5815 var0) {
      return var0.field25484;
   }
}
