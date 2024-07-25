package remapped;

import java.util.Iterator;

public class class_2918 implements Iterator<class_8087> {
   private static String[] field_14244;

   public class_2918(class_7151 var1, class_9375 var2) {
      this.field_14243 = var1;
      this.field_14242 = var2;
   }

   @Override
   public boolean hasNext() {
      return this.field_14242.method_43354() != null;
   }

   public class_8087 next() {
      return this.field_14242.method_43352();
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }
}
