package remapped;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class class_4566 {
   private static final String field_22255 = ".mp3";
   private static List<String> field_22256 = new ArrayList<String>(
      Arrays.asList("activate", "deactivate", "click", "error", "pop", "connect", "switch", "clicksound")
   );
   public static HashMap<String, class_9084> field_22254 = new HashMap<String, class_9084>();

   public void method_21206(String var1) {
      if (!field_22256.contains(var1)) {
         SigmaMainClass.getInstance().method_3326().method_12862("Invalid audio file attempted to be played: " + var1);
      } else {
         InputStream var4 = class_2209.method_10226("com/mentalfrostbyte/gui/resources/audio/" + var1 + ".mp3");
         if (field_22254.containsKey(var1) && field_22254.get(var1).method_41843()) {
            field_22254.get(var1).method_41817(var4);
            field_22254.get(var1).method_41836();
         } else {
            if (field_22254.containsKey(var1)) {
               field_22254.get(var1).method_41823();
            }

            class_9084 var5 = new class_9084(var4);
            field_22254.put(var1, var5);
            var5.method_41836();
         }
      }
   }

   public void method_21204() {
   }
}
