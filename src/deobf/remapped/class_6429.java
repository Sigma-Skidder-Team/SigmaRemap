package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class class_6429 {
   private static String[] field_32840;
   private final List<Pair<Predicate<class_2522>, class_7373>> field_32839 = Lists.newArrayList();

   public void method_29372(Predicate<class_2522> var1, class_7373 var2) {
      this.field_32839.add(Pair.of(var1, var2));
   }

   public class_7373 method_29373() {
      return new class_1509(this.field_32839);
   }
}
