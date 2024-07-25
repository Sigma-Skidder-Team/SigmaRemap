package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class MutableAttribute {
   private final Map<class_225, class_9747> field_7251 = Maps.newHashMap();
   private boolean field_7250;

   private class_9747 method_5982(class_225 var1) {
      class_9747 var4 = new class_9747(var1, var2 -> {
         if (this.field_7250) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + class_8669.field_44403.method_39797(var1));
         }
      });
      this.field_7251.put(var1, var4);
      return var4;
   }

   public MutableAttribute method_5983(class_225 var1) {
      this.method_5982(var1);
      return this;
   }

   public MutableAttribute createMutableAttribute(class_225 var1, double var2) {
      class_9747 var6 = this.method_5982(var1);
      var6.method_45006(var2);
      return this;
   }

   public class_9632 method_5980() {
      this.field_7250 = true;
      return new class_9632(this.field_7251);
   }
}
