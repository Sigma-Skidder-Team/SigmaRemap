package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_1954 {
   public static class_7730 field_9966 = new class_2046();

   public static void method_9032(class_4085 var0, class_1331 var1, class_2983 var2) {
      var0.method_18841();
      var2.method_13658(var0);
      var0.method_18848(new class_9676());
      var0.method_18834(var1, 2);
   }

   public static Collection<class_4085> method_9041(Collection<class_4350> var0, class_1331 var1, class_6631 var2, class_6331 var3, class_2983 var4, int var5) {
      class_467 var8 = new class_467(var0, var1, var2, var3, var4, var5);
      var8.method_2243();
      return var8.method_2248();
   }

   public static Collection<class_4085> method_9045(Collection<class_226> var0, class_1331 var1, class_6631 var2, class_6331 var3, class_2983 var4, int var5) {
      return method_9041(method_9046(var0), var1, var2, var3, var4, var5);
   }

   public static Collection<class_4350> method_9046(Collection<class_226> var0) {
      HashMap var3 = Maps.newHashMap();
      var0.forEach(var1 -> {
         String var4 = var1.method_963();
         Collection var5 = var3.computeIfAbsent(var4, var0xx -> Lists.newArrayList());
         var5.add(var1);
      });
      return var3.keySet().stream().<class_4350>flatMap(var1 -> {
         Collection var4 = (Collection)var3.get(var1);
         Consumer var5 = class_3084.method_14147(var1);
         MutableInt var6 = new MutableInt();
         return Streams.stream(Iterables.partition(var4, 100)).map(var4x -> new class_4350(var1 + ":" + var6.incrementAndGet(), var4, var5));
      }).collect(Collectors.<class_4350>toList());
   }

   private static void method_9047(class_4085 var0) {
      Throwable var3 = var0.method_18830();
      String var4 = (!var0.method_18838() ? "(optional) " : "") + var0.method_18835() + " failed! " + Util.method_44664(var3);
      method_9042(var0.method_18832(), !var0.method_18838() ? TextFormatting.YELLOW : TextFormatting.RED, var4);
      if (var3 instanceof class_2832) {
         class_2832 var5 = (class_2832)var3;
         method_9044(var0.method_18832(), var5.method_12875(), var5.method_12876());
      }

      field_9966.method_34983(var0);
   }

   private static void method_9033(class_4085 var0, class_6414 var1) {
      class_6331 var4 = var0.method_18832();
      class_1331 var5 = var0.method_18843();
      class_1331 var6 = new class_1331(-1, -1, -1);
      class_1331 var7 = class_6561.method_29966(var5.method_6105(var6), class_9022.field_46145, var0.method_18840(), var5);
      var4.method_29594(var7, class_4783.field_23862.method_29260().method_8318(var0.method_18840()));
      class_1331 var8 = var7.method_6104(0, 1, 0);
      var4.method_29594(var8, var1.method_29260());

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            class_1331 var11 = var7.method_6104(var9, -1, var10);
            var4.method_29594(var11, class_4783.field_23810.method_29260());
         }
      }
   }

   private static void method_9037(class_4085 var0, String var1) {
      class_6331 var4 = var0.method_18832();
      class_1331 var5 = var0.method_18843();
      class_1331 var6 = new class_1331(-1, 1, -1);
      class_1331 var7 = class_6561.method_29966(var5.method_6105(var6), class_9022.field_46145, var0.method_18840(), var5);
      var4.method_29594(var7, class_4783.field_23566.method_29260().method_8318(var0.method_18840()));
      class_2522 var8 = var4.method_28262(var7);
      ItemStack var9 = method_9035(var0.method_18835(), var0.method_18838(), var1);
      class_2013.method_9334(var4, var7, var8, var9);
   }

   private static ItemStack method_9035(String var0, boolean var1, String var2) {
      ItemStack var5 = new ItemStack(class_4897.field_24805);
      class_3416 var6 = new class_3416();
      StringBuffer var7 = new StringBuffer();
      Arrays.<String>stream(var0.split("\\.")).forEach(var1x -> var7.append(var1x).append('\n'));
      if (!var1) {
         var7.append("(optional)\n");
      }

      var7.append("-------------------\n");
      var6.add(class_473.method_2261(var7.toString() + var2));
      var5.method_27954("pages", var6);
      return var5;
   }

   private static void method_9042(class_6331 var0, TextFormatting var1, String var2) {
      var0.method_28990(var0x -> true).forEach(var2x -> var2x.method_26286(new StringTextComponent(var2).mergeStyle(var1), Util.NIL_UUID));
   }

   public static void method_9039(class_6331 var0) {
      class_1892.method_8438(var0);
   }

   private static void method_9044(class_6331 var0, class_1331 var1, String var2) {
      class_1892.method_8436(var0, var1, var2, -2130771968, Integer.MAX_VALUE);
   }

   public static void method_9038(class_6331 var0, class_1331 var1, class_2983 var2, int var3) {
      var2.method_13657();
      class_1331 var6 = var1.method_6104(-var3, 0, -var3);
      class_1331 var7 = var1.method_6104(var3, 0, var3);
      class_1331.method_6084(var6, var7).filter(var1x -> var0.method_28262(var1x).method_8350(class_4783.field_23846)).forEach(var1x -> {
         class_945 var4 = (class_945)var0.method_28260(var1x);
         class_1331 var5 = var4.method_17399();
         class_9616 var6x = class_2765.method_12591(var4);
         class_2765.method_12583(var6x, var5.method_12165(), var0);
      });
   }
}
