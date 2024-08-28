package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class Class8931 {
   private static String[] field40414;
   private final List<Pair<Predicate<Class7380>, Class7202>> field40415 = Lists.newArrayList();

   public void method32655(Predicate<Class7380> var1, Class7202 var2) {
      this.field40415.add(Pair.of(var1, var2));
   }

   public Class7202 method32656() {
      return new Class7201(this.field40415);
   }
}
