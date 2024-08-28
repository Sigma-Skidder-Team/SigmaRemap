package mapped;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.UUID;
import java.util.logging.Logger;

public interface Class8006<T> {
   Logger method27366();

   String method27350();

   String method27351();

   default boolean method27374() {
      return false;
   }

   String method27352();

   Class8411 method27353(Runnable var1);

   Class8411 method27354(Runnable var1);

   Class8411 method27355(Runnable var1, Long var2);

   Class8411 method27356(Runnable var1, Long var2);

   void method27357(Class8411 var1);

   Class9150[] method27358();

   void method27359(UUID var1, String var2);

   boolean method27360(UUID var1, String var2);

   default boolean method27375(Class7161 var1, String var2) {
      if (!var1.method22488()) {
         UUID var5 = var1.<Class6038>method22438(Class6038.class).method18681();
         return var5 != null ? this.method27360(var5, var2) : false;
      } else {
         return false;
      }
   }

   boolean method27361();

   Class9027<T> method27367();

   Class7041 method27368();

   Class7043 method27362();

   File method27370();

   void method27363();

   JsonObject method27364();

   boolean method27365();

   Class9313 method27371();
}
