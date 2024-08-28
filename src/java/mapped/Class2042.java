package mapped;

import it.unimi.dsi.fastutil.Hash.Strategy;

import java.util.Objects;

public enum Class2042 implements Strategy<Class4521> {
   field13345;

   private static final Class2042[] field13346 = new Class2042[]{field13345};

   public int hashCode(Class4521 var1) {
      return var1 != null ? Class4521.method14396(var1) : 0;
   }

   public boolean equals(Class4521 var1, Class4521 var2) {
      if (var1 == var2) {
         return true;
      } else {
         return var1 != null && var2 != null ? Objects.equals(Class4521.method14395(var1), Class4521.method14395(var2)) : false;
      }
   }
}
