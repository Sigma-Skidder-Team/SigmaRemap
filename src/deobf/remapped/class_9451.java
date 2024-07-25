package remapped;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collection;
import java.util.List;

public class class_9451 {
   private static String[] field_48235;
   private static final ThreadLocal<class_879> field_48236 = ThreadLocal.<class_879>withInitial(
      () -> new class_879((class_2522)null, (class_2522)null, (Direction)null, null)
   );
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class_879>> field_48234 = ThreadLocal.<Object2ByteLinkedOpenHashMap<class_879>>withInitial(
      () -> {
         class_3979 var2 = new class_3979(200);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );

   public static boolean method_43714(class_2522 var0, class_6163 var1, class_1331 var2, Direction var3, class_4460 var4) {
      class_3310 var7 = new class_3310(var0);
      SigmaMainClass.getInstance().getEventManager().call(var7);
      if (!var7.method_15184()) {
         if (!var7.method_29716()) {
            class_1331 var8 = var2.method_6098(var3);
            class_2522 var9 = var1.method_28262(var8);
            if (!var9.method_11475()) {
               if (!var0.method_8347(var9, var3)) {
                  return !var9.method_8302() ? true : method_43711(var0, var1, var2, var3, var4, var9, var8);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static boolean method_43711(class_2522 var0, class_6163 var1, class_1331 var2, Direction var3, class_4460 var4, class_2522 var5, class_1331 var6) {
      long var9 = (long)var0.method_11472() << 36 | (long)var5.method_11472() << 4 | (long)var3.ordinal();
      Long2ByteLinkedOpenHashMap var11 = var4.method_20677();
      byte var12 = var11.getAndMoveToFirst(var9);
      if (var12 == 0) {
         class_4190 var13 = var0.method_8346(var1, var2, var3);
         class_4190 var14 = var5.method_8346(var1, var6, var3.method_1046());
         boolean var15 = class_3370.method_15537(var13, var14, class_8529.field_43656);
         if (var11.size() > 400) {
            var11.removeLastByte();
         }

         var11.putAndMoveToFirst(var9, (byte)(!var15 ? -1 : 1));
         return var15;
      } else {
         return var12 > 0;
      }
   }

   public static int method_43710(class_6414 var0) {
      return class_8669.field_44462.method_14041(var0);
   }

   public static class_6414 method_43712(Identifier var0) {
      return class_8669.field_44462.method_39814(var0) ? class_8669.field_44462.method_39806(var0) : null;
   }

   public static int method_43707(class_2522 var0) {
      class_6414 var3 = var0.method_8360();
      class_8021 var4 = var3.method_29306();
      ImmutableList var5 = var4.method_36441();
      return var5.indexOf(var0);
   }

   public static int method_43713(class_6414 var0) {
      class_8021 var3 = var0.method_29306();
      ImmutableList var4 = var3.method_36441();
      return var4.size();
   }

   public static class_2522 method_43708(class_6414 var0, int var1) {
      class_8021 var4 = var0.method_29306();
      ImmutableList var5 = var4.method_36441();
      return var1 >= 0 && var1 < var5.size() ? (class_2522)var5.get(var1) : null;
   }

   public static List<class_2522> method_43715(class_6414 var0) {
      class_8021 var3 = var0.method_29306();
      return var3.method_36441();
   }

   public static boolean method_43717(class_2522 var0, class_6163 var1, class_1331 var2) {
      return var0.method_11476();
   }

   public static Collection<class_5019<?>> method_43716(class_2522 var0) {
      return var0.method_10310();
   }
}
