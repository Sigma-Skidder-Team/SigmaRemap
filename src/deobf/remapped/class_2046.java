package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2046 implements class_7730 {
   private static final Logger field_10357 = LogManager.getLogger();

   public void ใ竬值쥦ใ䂷(class_4085 var1) {
      if (!var1.method_18838()) {
         field_10357.warn("(optional) " + var1.method_18835() + " failed. " + Util.method_44664(var1.method_18830()));
      } else {
         field_10357.error(var1.method_18835() + " failed! " + Util.method_44664(var1.method_18830()));
      }
   }
}
