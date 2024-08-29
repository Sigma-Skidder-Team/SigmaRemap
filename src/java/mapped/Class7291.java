package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class Class7291 {
   private final List<Pair<Class2154, Class112>> field31275 = Lists.newArrayList();

   public Class7291 method23058(Class2154 var1, Class112 var2) {
      this.field31275.add(Pair.of(var1, var2));
      return this;
   }

   public ListNBT method23059() {
      ListNBT var3 = new ListNBT();

      for (Pair var5 : this.field31275) {
         CompoundNBT var6 = new CompoundNBT();
         var6.method109("Pattern", Class2154.method8874((Class2154)var5.getLeft()));
         var6.method102("Color", ((Class112)var5.getRight()).method309());
         var3.add(var6);
      }

      return var3;
   }
}
