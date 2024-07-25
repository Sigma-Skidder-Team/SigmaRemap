package remapped;

import it.unimi.dsi.fastutil.Hash.Strategy;

public enum class_3107 implements Strategy<Object> {
   field_15443;

   public int hashCode(Object var1) {
      return System.identityHashCode(var1);
   }

   public boolean equals(Object var1, Object var2) {
      return var1 == var2;
   }
}
