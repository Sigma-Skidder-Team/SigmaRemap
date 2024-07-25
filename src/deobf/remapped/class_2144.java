package remapped;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Set;

public class class_2144 {
   private final Set<class_9791<?>> field_10734;
   private final Set<class_9791<?>> field_10735;

   private class_2144(Set<class_9791<?>> var1, Set<class_9791<?>> var2) {
      this.field_10734 = ImmutableSet.copyOf(var1);
      this.field_10735 = ImmutableSet.copyOf(Sets.union(var1, var2));
   }

   public Set<class_9791<?>> method_10022() {
      return this.field_10734;
   }

   public Set<class_9791<?>> method_10020() {
      return this.field_10735;
   }

   @Override
   public String toString() {
      return "["
         + Joiner.on(", ").join(this.field_10735.stream().<String>map(var1 -> (!this.field_10734.contains(var1) ? "" : "!") + var1.method_45196()).iterator())
         + "]";
   }

   public void method_10019(class_4737 var1, class_2790 var2) {
      Set var5 = var2.method_12681();
      SetView var6 = Sets.difference(var5, this.field_10735);
      if (!var6.isEmpty()) {
         var1.method_21892("Parameters " + var6 + " are not provided in this context");
      }
   }
}
