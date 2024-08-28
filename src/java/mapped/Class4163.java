package mapped;

import java.util.*;

public class Class4163 extends Class4147 {
   private static final Map<Integer, Class1983> field20422 = new HashMap<Integer, Class1983>();
   private static final Map<Byte, Integer> field20423 = new HashMap<Byte, Integer>();
   private static final Set<Integer> field20424 = new HashSet<Integer>();

   public static Class8097 method12884() {
      Class4163 var2 = new Class4163();
      return var1 -> {
         if (var1.method37757().equals("minecraft:chest") || var1.method37757().equals("minecraft:trapped_chest")) {
            if (!var1.method37761("waterlogged").equals("true")) {
               field20422.put(var1.method37758(), Class1983.valueOf(var1.method37761("facing").toUpperCase(Locale.ROOT)));
               if (var1.method37757().equalsIgnoreCase("minecraft:trapped_chest")) {
                  field20424.add(var1.method37758());
               }

               field20423.put(method12885(var1), var1.method37758());
               Class9322.field43276.put(var1.method37758(), var2);
            }
         }
      };
   }

   private static Byte method12885(Class9678 var0) {
      byte var3 = 0;
      String var4 = var0.method37761("type");
      if (var4.equals("left")) {
         var3 = (byte)(var3 | 1);
      }

      if (var4.equals("right")) {
         var3 = (byte)(var3 | 2);
      }

      var3 = (byte)(var3 | Class1983.valueOf(var0.method37761("facing").toUpperCase(Locale.ROOT)).ordinal() << 2);
      if (var0.method37757().equals("minecraft:trapped_chest")) {
         var3 = (byte)(var3 | 16);
      }

      return var3;
   }

   @Override
   public int method12839(Class7161 var1, Class9695 var2, int var3) {
      Class1983 var6 = field20422.get(var3);
      byte var7 = 0;
      var7 = (byte)(var7 | var6.ordinal() << 2);
      boolean var8 = field20424.contains(var3);
      if (var8) {
         var7 = (byte)(var7 | 16);
      }

      int var9;
      if (field20422.containsKey(var9 = this.method12840(var1, var2.method37961(Class1983.field12944))) && var8 == field20424.contains(var9)) {
         var7 = (byte)(var7 | (var6 != Class1983.field12947 ? 2 : 1));
      } else if (field20422.containsKey(var9 = this.method12840(var1, var2.method37961(Class1983.field12945))) && var8 == field20424.contains(var9)) {
         var7 = (byte)(var7 | (var6 != Class1983.field12946 ? 2 : 1));
      } else if (field20422.containsKey(var9 = this.method12840(var1, var2.method37961(Class1983.field12947))) && var8 == field20424.contains(var9)) {
         var7 = (byte)(var7 | (var6 != Class1983.field12944 ? 1 : 2));
      } else if (field20422.containsKey(var9 = this.method12840(var1, var2.method37961(Class1983.field12946))) && var8 == field20424.contains(var9)) {
         var7 = (byte)(var7 | (var6 != Class1983.field12945 ? 1 : 2));
      }

      Integer var10 = field20423.get(var7);
      return var10 != null ? var10 : var3;
   }
}
