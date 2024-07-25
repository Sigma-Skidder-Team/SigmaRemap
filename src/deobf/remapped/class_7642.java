package remapped;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.UUID;
import java.util.logging.Logger;

public interface class_7642<T> {
   Logger method_34617();

   String method_34620();

   String method_34616();

   default boolean method_34630() {
      return false;
   }

   String method_34619();

   class_6536 method_34627(Runnable var1);

   class_6536 method_34633(Runnable var1);

   class_6536 method_34634(Runnable var1, Long var2);

   class_6536 method_34631(Runnable var1, Long var2);

   void method_34625(class_6536 var1);

   class_7235[] method_34618();

   void method_34624(UUID var1, String var2);

   boolean method_34637(UUID var1, String var2);

   default boolean method_34638(class_1455 var1, String var2) {
      if (!var1.method_6749()) {
         UUID var5 = var1.<class_3790>method_6746(class_3790.class).method_17594();
         return var5 != null ? this.method_34637(var5, var2) : false;
      } else {
         return false;
      }
   }

   boolean method_34628();

   class_8332<T> method_34632();

   class_5714 method_34626();

   class_5283 method_34621();

   File method_34623();

   void method_34622();

   JsonObject method_34635();

   boolean method_34629();

   class_7918 method_34636();
}
