package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.state.Property;

import java.util.Collections;
import java.util.List;

public class Class3630<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
   extends Class3629 {
   private static String[] field19650;
   private final Property<T1> field19651;
   private final Property<T2> field19652;
   private final Property<T3> field19653;
   private final Property<T4> field19654;
   private final Property<T5> field19655;

   public Class3630(Property<T1> var1, Property<T2> var2, Property<T3> var3, Property<T4> var4, Property<T5> var5) {
      this.field19651 = var1;
      this.field19652 = var2;
      this.field19653 = var3;
      this.field19654 = var4;
      this.field19655 = var5;
   }

   @Override
   public List<Property<?>> method12298() {
      return ImmutableList.of(this.field19651, this.field19652, this.field19653, this.field19654, this.field19655);
   }

   public Class3630<T1, T2, T3, T4, T5> method12317(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, List<Class5138> var6) {
      Class9262 var9 = Class9262.method34857(
         this.field19651.method30468((T1)var1),
         this.field19652.method30468((T2)var2),
         this.field19653.method30468((T3)var3),
         this.field19654.method30468((T4)var4),
         this.field19655.method30468((T5)var5)
      );
      this.method12307(var9, var6);
      return this;
   }

   public Class3630<T1, T2, T3, T4, T5> method12318(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, Class5138 var6) {
      return this.method12317((T1)var1, (T2)var2, (T3)var3, (T4)var4, (T5)var5, Collections.<Class5138>singletonList(var6));
   }
}
