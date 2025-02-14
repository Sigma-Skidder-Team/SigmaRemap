package mapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public enum Class1840 implements Class1836 {
   field9848;

   private static final IntSet field9849 = new IntOpenHashSet(new int[]{26, 11, 12, 13, 140, 30, 31, 158, 10});
   private static final IntSet field9850 = new IntOpenHashSet(new int[]{168, 169, 21, 22, 23, 149, 151});
   private static final Class1840[] field9851 = new Class1840[]{field9848};

   @Override
   public int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 14) {
         if (!field9850.contains(var6)) {
            if (var6 != 3 && var6 != 34 && var6 != 20) {
               if (!field9849.contains(var6)) {
                  if (var6 != 37 && var6 != 38) {
                     if (!Class9320.method35218(var6)
                        && var6 != 7
                        && var6 != 6
                        && (Class9320.method35218(var2) || Class9320.method35218(var3) || Class9320.method35218(var4) || Class9320.method35218(var5))) {
                        return 16;
                     }
                  } else if (!Class9320.method35218(var2)
                     && !Class9320.method35218(var3)
                     && !Class9320.method35218(var4)
                     && !Class9320.method35218(var5)
                     && (!this.method8090(var2) || !this.method8090(var3) || !this.method8090(var4) || !this.method8090(var5))) {
                     return 2;
                  }
               } else if (!Class9320.method35218(var6)
                  && (Class9320.method35218(var2) || Class9320.method35218(var3) || Class9320.method35218(var4) || Class9320.method35218(var5))) {
                  return 26;
               }
            } else if (!Class9320.method35218(var6)
               && (Class9320.method35218(var2) || Class9320.method35218(var3) || Class9320.method35218(var4) || Class9320.method35218(var5))) {
               return 25;
            }
         } else {
            if (method8089(var2) && method8089(var3) && method8089(var4) && method8089(var5)) {
               if (!Class9320.method35218(var2) && !Class9320.method35218(var3) && !Class9320.method35218(var4) && !Class9320.method35218(var5)) {
                  return var6;
               }

               return 16;
            }

            return 23;
         }
      } else if (Class9320.method35219(var2) || Class9320.method35219(var3) || Class9320.method35219(var4) || Class9320.method35219(var5)) {
         return 15;
      }

      return var6;
   }

   private static boolean method8089(int var0) {
      return field9850.contains(var0) || var0 == 4 || var0 == 5 || Class9320.method35218(var0);
   }

   private boolean method8090(int var1) {
      return var1 == 37 || var1 == 38 || var1 == 39 || var1 == 165 || var1 == 166 || var1 == 167;
   }
}
