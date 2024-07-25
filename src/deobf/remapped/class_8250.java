package remapped;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

public final class class_8250 {
   private static String[] field_42347;
   private final String field_42345;
   private final Supplier<Object> field_42344;
   private final String field_42346;
   private final Class<?> field_42343;

   private class_8250(String var1, Supplier<Object> var2, String var3, Class<?> var4) {
      this.field_42345 = var1;
      this.field_42344 = var2;
      this.field_42346 = var3;
      this.field_42343 = var4;
   }

   private MBeanAttributeInfo method_37797() {
      return new MBeanAttributeInfo(this.field_42345, this.field_42343.getSimpleName(), this.field_42346, true, false, false);
   }
}
