package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.state.Property;

import java.util.Collections;
import java.util.List;

public class Class3632<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends Class3629 {
   private static String[] field19658;
   private final Property<T1> field19659;
   private final Property<T2> field19660;
   private final Property<T3> field19661;
   private final Property<T4> field19662;

   public Class3632(Property<T1> var1, Property<T2> var2, Property<T3> var3, Property<T4> var4) {
      this.field19659 = var1;
      this.field19660 = var2;
      this.field19661 = var3;
      this.field19662 = var4;
   }

   @Override
   public List<Property<?>> method12298() {
      return ImmutableList.of(this.field19659, this.field19660, this.field19661, this.field19662);
   }

   public Class3632<T1, T2, T3, T4> method12323(T1 var1, T2 var2, T3 var3, T4 var4, List<Class5138> var5) {
      Class9262 var8 = Class9262.method34857(
         this.field19659.method30468((T1)var1),
         this.field19660.method30468((T2)var2),
         this.field19661.method30468((T3)var3),
         this.field19662.method30468((T4)var4)
      );
      this.method12307(var8, var5);
      return this;
   }

   public Class3632<T1, T2, T3, T4> method12324(T1 var1, T2 var2, T3 var3, T4 var4, Class5138 var5) {
      return this.method12323((T1)var1, (T2)var2, (T3)var3, (T4)var4, Collections.<Class5138>singletonList(var5));
   }
}
