package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5692 {
   private static final Logger field_28835 = LogManager.getLogger();
   private final class_1893 field_28832;
   private final class_3904 field_28833 = new class_3904();
   private final Map<class_3139, class_3604> field_28829 = Maps.newHashMap();
   private class_4361 field_28830;
   private class_3139 field_28834;

   public class_5692(class_1893 var1) {
      this.field_28832 = var1;
   }

   public void method_25745(class_6642 var1) {
      if (var1.method_30513()) {
         this.field_28833.method_18073();
         this.field_28829.clear();
      }

      this.field_28833.method_18081(var1.method_30515());
      this.field_28833.method_18079(var1.method_30516());

      for (Entry var5 : var1.method_30514().entrySet()) {
         class_3139 var6 = this.field_28833.method_18078((class_4639)var5.getKey());
         if (var6 == null) {
            field_28835.warn("Server informed client about progress for unknown advancement {}", var5.getKey());
         } else {
            class_3604 var7 = (class_3604)var5.getValue();
            var7.method_16809(var6.method_14518(), var6.method_14515());
            this.field_28829.put(var6, var7);
            if (this.field_28830 != null) {
               this.field_28830.method_20232(var6, var7);
            }

            if (!var1.method_30513() && var7.method_16811() && var6.method_14511() != null && var6.method_14511().method_35150()) {
               this.field_28832.method_8519().method_42329(new class_9564(var6));
            }
         }
      }
   }

   public class_3904 method_25749() {
      return this.field_28833;
   }

   public void method_25746(class_3139 var1, boolean var2) {
      class_1092 var5 = this.field_28832.method_8614();
      if (var5 != null && var1 != null && var2) {
         var5.method_4813(class_3906.method_18083(var1));
      }

      if (this.field_28834 != var1) {
         this.field_28834 = var1;
         if (this.field_28830 != null) {
            this.field_28830.method_20233(var1);
         }
      }
   }

   public void method_25747(class_4361 var1) {
      this.field_28830 = var1;
      this.field_28833.method_18080(var1);
      if (var1 != null) {
         for (Entry var5 : this.field_28829.entrySet()) {
            var1.method_20232((class_3139)var5.getKey(), (class_3604)var5.getValue());
         }

         var1.method_20233(this.field_28834);
      }
   }
}
