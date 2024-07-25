package remapped;

import com.google.common.collect.Sets;
import java.util.Set;

public class class_4000 extends class_5363<class_4000> {
   private final class_6414 field_19425;
   private final Set<class_5019<?>> field_19427 = Sets.newHashSet();

   private class_4000(class_6414 var1) {
      this.field_19425 = var1;
   }

   public class_4000 method_18452(class_5019<?> var1) {
      if (this.field_19425.method_29306().method_36444().contains(var1)) {
         this.field_19427.add(var1);
         return this;
      } else {
         throw new IllegalStateException("Property " + var1 + " is not present on block " + this.field_19425);
      }
   }

   public class_4000 method_18451() {
      return this;
   }

   @Override
   public class_2913 method_8947() {
      return new class_4849(this.method_24475(), this.field_19425, this.field_19427, null);
   }
}
