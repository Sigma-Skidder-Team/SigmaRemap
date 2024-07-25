package remapped;

import java.util.List;
import java.util.Optional;

public class class_2180 extends class_2219 implements class_938 {
   private static String[] field_10850;
   private final class_8369 field_10849;

   public class_2180(GameOptions var1, int var2, int var3, int var4, int var5, class_8369 var6) {
      super(var1, var2, var3, var4, var5, (double)((float)var6.method_38566(var6.method_38570(var1))));
      this.field_10849 = var6;
      this.method_396();
   }

   @Override
   public void method_399() {
      this.field_10849.method_38567(this.field_11096, this.field_10849.method_38571(this.field_319));
      this.field_11096.method_40873();
   }

   @Override
   public void method_396() {
      this.method_32687(this.field_10849.method_38572(this.field_11096));
   }

   @Override
   public Optional<List<class_7107>> method_4059() {
      return this.field_10849.method_4486();
   }

   public static int method_10122(class_7114 var0) {
      return var0.field_36671;
   }

   public static int method_10121(class_7114 var0) {
      return var0.field_36681;
   }

   public class_1013 method_9910() {
      return this.field_10849;
   }
}
