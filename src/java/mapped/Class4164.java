package mapped;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Class4164 extends Class4147 {
   private static final Map<Integer, Class7714> field20425 = new HashMap<Integer, Class7714>();
   private static final Map<Byte, Integer> field20426 = new HashMap<Byte, Integer>();
   private static final Map<Integer, Class1983> field20427 = new HashMap<Integer, Class1983>();

   public static Class8097 method12887() {
      Class4164 var2 = new Class4164();
      return var1 -> {
         if (!var1.method37757().equals("minecraft:tripwire_hook")) {
            if (var1.method37757().equals("minecraft:tripwire")) {
               Class7714 var4 = new Class7714(
                  var1.method37761("attached").equals("true"), var1.method37761("disarmed").equals("true"), var1.method37761("powered").equals("true")
               );
               field20425.put(var1.method37758(), var4);
               field20426.put(method12888(var1), var1.method37758());
               Class9322.field43276.put(var1.method37758(), var2);
            }
         } else {
            field20427.put(var1.method37758(), Class1983.valueOf(var1.method37761("facing").toUpperCase(Locale.ROOT)));
         }
      };
   }

   private static byte method12888(Class9678 var0) {
      byte var3 = 0;
      if (var0.method37761("attached").equals("true")) {
         var3 = (byte)(var3 | 1);
      }

      if (var0.method37761("disarmed").equals("true")) {
         var3 = (byte)(var3 | 2);
      }

      if (var0.method37761("powered").equals("true")) {
         var3 = (byte)(var3 | 4);
      }

      if (var0.method37761("east").equals("true")) {
         var3 = (byte)(var3 | 8);
      }

      if (var0.method37761("north").equals("true")) {
         var3 = (byte)(var3 | 16);
      }

      if (var0.method37761("south").equals("true")) {
         var3 = (byte)(var3 | 32);
      }

      if (var0.method37761("west").equals("true")) {
         var3 = (byte)(var3 | 64);
      }

      return var3;
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      Class7714 var6 = field20425.get(var3);
      if (var6 != null) {
         byte var7 = 0;
         if (var6.method25486()) {
            var7 = (byte)(var7 | 1);
         }

         if (var6.method25487()) {
            var7 = (byte)(var7 | 2);
         }

         if (var6.method25488()) {
            var7 = (byte)(var7 | 4);
         }

         int var8 = this.method12840(var1, var2.method37961(Class1983.field12946));
         int var9 = this.method12840(var1, var2.method37961(Class1983.field12944));
         int var10 = this.method12840(var1, var2.method37961(Class1983.field12945));
         int var11 = this.method12840(var1, var2.method37961(Class1983.field12947));
         if (field20425.containsKey(var8) || field20427.get(var8) == Class1983.field12947) {
            var7 = (byte)(var7 | 8);
         }

         if (field20425.containsKey(var9) || field20427.get(var9) == Class1983.field12945) {
            var7 = (byte)(var7 | 16);
         }

         if (field20425.containsKey(var10) || field20427.get(var10) == Class1983.field12944) {
            var7 = (byte)(var7 | 32);
         }

         if (field20425.containsKey(var11) || field20427.get(var11) == Class1983.field12946) {
            var7 = (byte)(var7 | 64);
         }

         Integer var12 = field20426.get(var7);
         return var12 != null ? var12 : var3;
      } else {
         return var3;
      }
   }
}
