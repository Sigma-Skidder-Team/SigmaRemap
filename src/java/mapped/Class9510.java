package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class9510 {
   private static String[] field44270;
   public Class9110 field44271;
   public int field44272;
   public int field44273 = 0;
   public Float field44274;
   public Float field44275 = 0.0F;
   public int field44276 = 1;
   public int field44277 = 2500;
   public Class9510 field44278;
   public Class2317 field44279 = Class2317.field15873;
   public Class2285 field44280 = Class2285.field15121;
   public Set<Long> field44281 = new HashSet<Long>();
   public Set<Long> field44282 = new HashSet<Long>();
   public Set<Long> field44283 = new HashSet<Long>();
   public Set<Long> field44284 = new HashSet<Long>();

   public Class9510(Class9110 var1, int var2, Float var3) {
      this.field44271 = var1;
      this.field44272 = var2;
      this.field44274 = var3;
   }

   public Class9510(Class9110 var1) {
      this.field44271 = var1;
   }

   public Class9510(Class9110 var1, int var2) {
      this.field44271 = var1;
      this.field44276 += var2;
   }

   public Class9510(Class9110 var1, int var2, Class2317 var3) {
      this.field44271 = var1;
      this.field44276 += var2;
      this.field44279 = var3;
   }

   public Class9510(Class9110 var1, int var2, Class2317 var3, Class2285 var4) {
      this.field44271 = var1;
      this.field44276 += var2;
      this.field44279 = var3;
      this.field44280 = var4;
   }

   public Class9510 method36727(Class9110 var1, boolean var2) {
      long var5 = var1.method33979().method8332();
      if (var2) {
         long var7 = var1.method33979().up().method8332();
         this.field44283.add(var7);
         this.field44281.add(var7);
         this.field44284.remove(var7);
      }

      this.field44283.add(var5);
      this.field44281.add(var5);
      this.field44284.remove(var5);
      return this;
   }

   public Class9510 method36728(Class9110 var1) {
      long var4 = var1.method33979().method8332();
      this.field44283.remove(var4);
      this.field44284.add(var4);
      return this;
   }

   public Class9510 method36729(Class9110 var1) {
      this.field44282.add(var1.method33979().method8332());
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class9510 var4 = (Class9510)var1;
            if (this.field44271.method33969() != var4.field44271.method33969()) {
               return false;
            } else {
               return this.field44271.method33970() != var4.field44271.method33970() ? false : this.field44271.method33971() == var4.field44271.method33971();
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = (int)((long)this.field44271.method33969() ^ (long)this.field44271.method33969() >>> 32);
      var3 = 31 * var3 + (int)((long)this.field44271.method33970() ^ (long)this.field44271.method33970() >>> 32);
      return 31 * var3 + (int)((long)this.field44271.method33971() ^ (long)this.field44271.method33971() >>> 32);
   }
}
