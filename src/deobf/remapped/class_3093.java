package remapped;

import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Objects;

public enum class_3093 implements Strategy<class_7634> {
   field_15396;

   public int hashCode(class_7634 var1) {
      return var1 != null ? class_7634.method_34594(var1) : 0;
   }

   public boolean equals(class_7634 var1, class_7634 var2) {
      if (var1 == var2) {
         return true;
      } else {
         return var1 != null && var2 != null ? Objects.equals(class_7634.method_34591(var1), class_7634.method_34591(var2)) : false;
      }
   }
}
