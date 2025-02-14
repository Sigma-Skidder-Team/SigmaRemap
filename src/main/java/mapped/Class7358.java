package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Class7358 {
   public static final Pattern field31500 = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
   public static final Pattern field31501 = Pattern.compile(
      "^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$"
   );
   public static final Pattern field31502 = Pattern.compile(
      "^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$"
   );
   public static final Pattern field31503 = Pattern.compile("^(?:<<)$");
   public static final Pattern field31504 = Pattern.compile("^(?:~|null|Null|NULL| )$");
   public static final Pattern field31505 = Pattern.compile("^$");
   public static final Pattern field31506 = Pattern.compile(
      "^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$"
   );
   public static final Pattern field31507 = Pattern.compile("^(?:=)$");
   public static final Pattern field31508 = Pattern.compile("^(?:!|&|\\*)$");
   public Map<Character, List<Class8260>> field31509 = new HashMap<Character, List<Class8260>>();

   public void method23353() {
      this.method23354(Class9757.field45640, field31500, "yYnNtTfFoO");
      this.method23354(Class9757.field45637, field31502, "-+0123456789");
      this.method23354(Class9757.field45638, field31501, "-+0123456789.");
      this.method23354(Class9757.field45632, field31503, "<");
      this.method23354(Class9757.field45641, field31504, "~nN\u0000");
      this.method23354(Class9757.field45641, field31505, null);
      this.method23354(Class9757.field45639, field31506, "0123456789");
      this.method23354(Class9757.field45631, field31508, "!&*");
   }

   public Class7358() {
      this.method23353();
   }

   public void method23354(Class9757 var1, Pattern var2, String var3) {
      if (var3 != null) {
         char[] var6 = var3.toCharArray();
         int var7 = 0;

         for (int var8 = var6.length; var7 < var8; var7++) {
            Character var9 = var6[var7];
            if (var9 == 0) {
               var9 = null;
            }

            List<Class8260> var10 = this.field31509.get(var9);
            if (var10 == null) {
               var10 = new ArrayList();
               this.field31509.put(var9, var10);
            }

            var10.add(new Class8260(var1, var2));
         }
      } else {
         List<Class8260> var11 = this.field31509.get(null);
         if (var11 == null) {
            var11 = new ArrayList();
            this.field31509.put(null, var11);
         }

         var11.add(new Class8260(var1, var2));
      }
   }

   public Class9757 method23355(Class2048 var1, String var2, boolean var3) {
      if (var1 == Class2048.field13364 && var3) {
         List<Class8260> var6;
         if (var2.length() == 0) {
            var6 = this.field31509.get('\u0000');
         } else {
            var6 = this.field31509.get(var2.charAt(0));
         }

         if (var6 != null) {
            for (Class8260 var8 : var6) {
               Class9757 var9 = var8.method28797();
               Pattern var10 = var8.method28798();
               if (var10.matcher(var2).matches()) {
                  return var9;
               }
            }
         }

         if (this.field31509.containsKey(null)) {
            for (Class8260 var12 : this.field31509.get(null)) {
               Class9757 var13 = var12.method28797();
               Pattern var14 = var12.method28798();
               if (var14.matcher(var2).matches()) {
                  return var13;
               }
            }
         }
      }

      switch (Class8323.field35752[var1.ordinal()]) {
         case 1:
            return Class9757.field45642;
         case 2:
            return Class9757.field45643;
         default:
            return Class9757.field45644;
      }
   }
}
