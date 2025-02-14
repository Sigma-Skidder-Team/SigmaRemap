package mapped;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Set;

public class Class7538 {
   private final Set<Class9821<?>> field32347;
   private final Set<Class9821<?>> field32348;

   public Class7538(Set<Class9821<?>> var1, Set<Class9821<?>> var2) {
      this.field32347 = ImmutableSet.copyOf(var1);
      this.field32348 = ImmutableSet.copyOf(Sets.union(var1, var2));
   }

   public Set<Class9821<?>> method24643() {
      return this.field32347;
   }

   public Set<Class9821<?>> method24644() {
      return this.field32348;
   }

   @Override
   public String toString() {
      return "["
         + Joiner.on(", ").join(this.field32348.stream().<String>map(var1 -> (!this.field32347.contains(var1) ? "" : "!") + var1.method38767()).iterator())
         + "]";
   }

   public void method24645(Class8478 var1, Class126 var2) {
      Set var5 = var2.method355();
      SetView var6 = Sets.difference(var5, this.field32348);
      if (!var6.isEmpty()) {
         var1.method29955("Parameters " + var6 + " are not provided in this context");
      }
   }
}
