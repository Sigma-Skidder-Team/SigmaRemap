package remapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class class_2983 {
   private static String[] field_14680;
   public static final class_2983 field_14682 = new class_2983();
   private final Collection<class_4085> field_14681 = Lists.newCopyOnWriteArrayList();

   public void method_13658(class_4085 var1) {
      this.field_14681.add(var1);
   }

   public void method_13657() {
      this.field_14681.clear();
   }

   public void method_13659() {
      this.field_14681.forEach(class_4085::method_18836);
      this.field_14681.removeIf(class_4085::method_18828);
   }
}
