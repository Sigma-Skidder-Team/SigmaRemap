package mapped;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

public final class Class9401 {
   private static String[] field43620;
   private final String field43621;
   private final Supplier<Object> field43622;
   private final String field43623;
   private final Class<?> field43624;

   public Class9401(String var1, Supplier<Object> var2, String var3, Class<?> var4) {
      this.field43621 = var1;
      this.field43622 = var2;
      this.field43623 = var3;
      this.field43624 = var4;
   }

   private MBeanAttributeInfo method35740() {
      return new MBeanAttributeInfo(this.field43621, this.field43624.getSimpleName(), this.field43623, true, false, false);
   }

   // $VF: synthetic method
   public static Supplier method35741(Class9401 var0) {
      return var0.field43622;
   }

   // $VF: synthetic method
   public static String method35742(Class9401 var0) {
      return var0.field43621;
   }

   // $VF: synthetic method
   public static MBeanAttributeInfo method35743(Class9401 var0) {
      return var0.method35740();
   }
}
