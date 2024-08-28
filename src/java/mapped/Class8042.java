package mapped;

import com.google.common.base.Preconditions;

public class Class8042 {
   private static Class8006 field34549;
   private static Class9191 field34550;

   public static void method27610(Class9191 var0) {
      field34549 = var0.method34423();
      field34550 = var0;
   }

   public static Class9027 method27611() {
      Preconditions.checkArgument(field34549 != null, "ViaVersion has not loaded the Platform");
      return field34549.method27367();
   }

   public static Class7041 method27612() {
      Preconditions.checkArgument(field34549 != null, "ViaVersion has not loaded the Platform");
      return field34549.method27368();
   }

   public static Class8006 method27613() {
      return field34549;
   }

   public static Class9191 method27614() {
      return field34550;
   }
}
