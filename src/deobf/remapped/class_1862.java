package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class class_1862 {
   public static final Pattern field_9440 = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
   public static final Pattern field_9442 = Pattern.compile(
      "^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$"
   );
   public static final Pattern field_9435 = Pattern.compile(
      "^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$"
   );
   public static final Pattern field_9444 = Pattern.compile("^(?:<<)$");
   public static final Pattern field_9434 = Pattern.compile("^(?:~|null|Null|NULL| )$");
   public static final Pattern field_9437 = Pattern.compile("^$");
   public static final Pattern field_9441 = Pattern.compile(
      "^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$"
   );
   public static final Pattern field_9438 = Pattern.compile("^(?:=)$");
   public static final Pattern field_9443 = Pattern.compile("^(?:!|&|\\*)$");
   public Map<Character, List<class_4078>> field_9436 = new HashMap<Character, List<class_4078>>();

   public void method_8242() {
      this.method_8241(class_9592.field_48878, field_9440, "yYnNtTfFoO");
      this.method_8241(class_9592.field_48877, field_9435, "-+0123456789");
      this.method_8241(class_9592.field_48881, field_9442, "-+0123456789.");
      this.method_8241(class_9592.field_48872, field_9444, "<");
      this.method_8241(class_9592.field_48873, field_9434, "~nN\u0000");
      this.method_8241(class_9592.field_48873, field_9437, null);
      this.method_8241(class_9592.field_48875, field_9441, "0123456789");
      this.method_8241(class_9592.field_48879, field_9443, "!&*");
   }

   public class_1862() {
      this.method_8242();
   }

   public void method_8241(class_9592 var1, Pattern var2, String var3) {
      if (var3 != null) {
         char[] var6 = var3.toCharArray();
         int var7 = 0;

         for (int var8 = var6.length; var7 < var8; var7++) {
            Character var9 = var6[var7];
            if (var9 == 0) {
               var9 = null;
            }

            Object var10 = this.field_9436.get(var9);
            if (var10 == null) {
               var10 = new ArrayList();
               this.field_9436.put(var9, (List<class_4078>)var10);
            }

            var10.add(new class_4078(var1, var2));
         }
      } else {
         Object var11 = this.field_9436.get(null);
         if (var11 == null) {
            var11 = new ArrayList();
            this.field_9436.put(null, (List<class_4078>)var11);
         }

         var11.add(new class_4078(var1, var2));
      }
   }

   public class_9592 method_8244(class_99 var1, String var2, boolean var3) {
      if (var1 == class_99.field_235 && var3) {
         List var6;
         if (var2.length() == 0) {
            var6 = this.field_9436.get('\u0000');
         } else {
            var6 = this.field_9436.get(var2.charAt(0));
         }

         if (var6 != null) {
            for (class_4078 var8 : var6) {
               class_9592 var9 = var8.method_18803();
               Pattern var10 = var8.method_18805();
               if (var10.matcher(var2).matches()) {
                  return var9;
               }
            }
         }

         if (this.field_9436.containsKey(null)) {
            for (class_4078 var12 : this.field_9436.get(null)) {
               class_9592 var13 = var12.method_18803();
               Pattern var14 = var12.method_18805();
               if (var14.matcher(var2).matches()) {
                  return var13;
               }
            }
         }
      }

      switch (var1) {
         case field_235:
            return class_9592.field_48876;
         case field_234:
            return class_9592.field_48882;
         default:
            return class_9592.field_48871;
      }
   }
}
