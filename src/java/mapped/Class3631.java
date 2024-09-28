package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.state.Property;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Class3631<T1 extends Comparable<T1>> extends Class3629 {
   private static String[] field19656;
   private final Property<T1> field19657;

   public Class3631(Property<T1> var1) {
      this.field19657 = var1;
   }

   @Override
   public List<Property<?>> method12298() {
      return ImmutableList.of(this.field19657);
   }

   public Class3631<T1> method12319(T1 var1, List<Class5138> var2) {
      Class9262 var5 = Class9262.method34857(this.field19657.method30468((T1)var1));
      this.method12307(var5, var2);
      return this;
   }

   public Class3631<T1> method12320(T1 var1, Class5138 var2) {
      return this.method12319((T1)var1, Collections.<Class5138>singletonList(var2));
   }

   public Class3629 method12321(Function<T1, Class5138> var1) {
      this.field19657.method30474().forEach(var2 -> this.method12320((T1)var2, (Class5138)var1.apply(var2)));
      return this;
   }
}
