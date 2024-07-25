package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class class_5408 {
   private final Map<Identifier, class_7633> field_27585 = Maps.newHashMap();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_24613(Identifier var1, class_7874 var2, class_7832 var3) {
      class_7633 var6 = this.field_27585.get(var1);
      boolean var7 = var6 == null;
      if (var7 || var2.method_35629()) {
         if (!var7) {
            class_3541.method_16341().debug("Replaced sound event location {}", var1);
         }

         var6 = new class_7633(var1, var2.method_35630());
         this.field_27585.put(var1, var6);
      }

      for (class_2049 var9 : var2.method_35631()) {
         Identifier var10 = var9.method_9578();
         Object var11;
         switch (var9.method_9579()) {
            case field_10317:
               if (!class_3541.method_16333(var9, var1, var3)) {
                  continue;
               }

               var11 = var9;
               break;
            case field_10314:
               var11 = new class_846(this, var10, var9);
               break;
            default:
               throw new IllegalStateException("Unknown SoundEventRegistration type: " + var9.method_9579());
         }

         var6.method_34586((class_6798<class_2049>)var11);
      }
   }

   public void method_24614(Map<Identifier, class_7633> var1, class_132 var2) {
      var1.clear();

      for (Entry var6 : this.field_27585.entrySet()) {
         var1.put(var6.getKey(), var6.getValue());
         ((class_7633)var6.getValue()).method_31145(var2);
      }
   }
}
