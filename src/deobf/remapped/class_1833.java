package remapped;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.optifine.expr.ParseException;

public class class_1833 {
   private class_3608 field_9294;

   public class_1833(class_3608 var1) {
      this.field_9294 = var1;
   }

   public class_6839 method_8091(String var1) throws ParseException {
      class_3999 var4 = this.method_8106(var1);
      if (var4 instanceof class_6839) {
         return (class_6839)var4;
      } else {
         throw new class_425("Not a float expression: " + var4.method_18450());
      }
   }

   public class_1342 method_8096(String var1) throws ParseException {
      class_3999 var4 = this.method_8106(var1);
      if (var4 instanceof class_1342) {
         return (class_1342)var4;
      } else {
         throw new class_425("Not a boolean expression: " + var4.method_18450());
      }
   }

   public class_3999 method_8106(String var1) throws ParseException {
      try {
         class_2428[] var4 = class_7795.method_35357(var1);
         if (var4 == null) {
            return null;
         } else {
            ArrayDeque var5 = new ArrayDeque<class_2428>(Arrays.asList(var4));
            return this.method_8105(var5);
         }
      } catch (IOException var6) {
         throw new class_425(var6.getMessage(), var6);
      }
   }

   private class_3999 method_8105(Deque<class_2428> var1) throws ParseException {
      if (!var1.isEmpty()) {
         LinkedList var4 = new LinkedList();
         LinkedList var5 = new LinkedList();
         class_3999 var6 = this.method_8097(var1);
         method_8107(var6, "Missing expression");
         var4.add(var6);

         while (true) {
            class_2428 var7 = (class_2428)var1.poll();
            if (var7 == null) {
               return this.method_8102(var4, var5);
            }

            if (var7.method_11076() != class_6950.field_35740) {
               throw new class_425("Invalid operator: " + var7);
            }

            class_3999 var8 = this.method_8097(var1);
            method_8107(var8, "Missing expression");
            var5.add(var7);
            var4.add(var8);
         }
      } else {
         return null;
      }
   }

   private class_3999 method_8102(List<class_3999> var1, List<class_2428> var2) throws ParseException {
      LinkedList var5 = new LinkedList();

      for (class_2428 var7 : var2) {
         class_2966 var8 = class_2966.method_13559(var7.method_11077());
         method_8107(var8, "Invalid operator: " + var7);
         var5.add(var8);
      }

      return this.method_8095(var1, var5);
   }

   private class_3999 method_8095(List<class_3999> var1, List<class_2966> var2) throws ParseException {
      if (var1.size() != var2.size() + 1) {
         throw new class_425("Invalid infix expression, expressions: " + var1.size() + ", operators: " + var2.size());
      } else if (var1.size() == 1) {
         return (class_3999)var1.get(0);
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = Integer.MIN_VALUE;

         for (class_2966 var8 : var2) {
            var5 = Math.min(var8.method_13557(), var5);
            var6 = Math.max(var8.method_13557(), var6);
         }

         if (var6 >= var5 && var6 - var5 <= 10) {
            for (int var9 = var6; var9 >= var5; var9--) {
               this.method_8104(var1, var2, var9);
            }

            if (var1.size() == 1 && var2.size() == 0) {
               return (class_3999)var1.get(0);
            } else {
               throw new class_425("Error merging operators, expressions: " + var1.size() + ", operators: " + var2.size());
            }
         } else {
            throw new class_425("Invalid infix precedence, min: " + var5 + ", max: " + var6);
         }
      }
   }

   private void method_8104(List<class_3999> var1, List<class_2966> var2, int var3) throws ParseException {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         class_2966 var7 = (class_2966)var2.get(var6);
         if (var7.method_13557() == var3) {
            var2.remove(var6);
            class_3999 var8 = (class_3999)var1.remove(var6);
            class_3999 var9 = (class_3999)var1.remove(var6);
            class_3999 var10 = method_8094(var7, new class_3999[]{var8, var9});
            var1.add(var6, var10);
            var6--;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_3999 method_8097(Deque<class_2428> var1) throws ParseException {
      class_2428 var4 = (class_2428)var1.poll();
      method_8107(var4, "Missing expression");
      switch (var4.method_11076()) {
         case field_35739:
            return method_8092(var4);
         case field_35736:
            class_2966 var5 = this.method_8103(var4, var1);
            if (var5 != null) {
               return this.method_8093(var5, var1);
            }

            return this.method_8098(var4);
         case field_35733:
            return this.method_8100(var4, var1);
         case field_35740:
            class_2966 var6 = class_2966.method_13559(var4.method_11077());
            method_8107(var6, "Invalid operator: " + var4);
            if (var6 == class_2966.field_14556) {
               return this.method_8097(var1);
            } else if (var6 == class_2966.field_14547) {
               class_3999 var8 = this.method_8097(var1);
               return method_8094(class_2966.field_14546, new class_3999[]{var8});
            } else if (var6 == class_2966.field_14585) {
               class_3999 var7 = this.method_8097(var1);
               return method_8094(class_2966.field_14585, new class_3999[]{var7});
            }
         default:
            throw new class_425("Invalid expression: " + var4);
      }
   }

   private static class_3999 method_8092(class_2428 var0) throws ParseException {
      float var3 = Config.method_14445(var0.method_11077(), Float.NaN);
      if (var3 != Float.NaN) {
         return new class_4570(var3);
      } else {
         throw new class_425("Invalid float value: " + var0);
      }
   }

   private class_2966 method_8103(class_2428 var1, Deque<class_2428> var2) throws ParseException {
      class_2428 var5 = (class_2428)var2.peek();
      if (var5 != null && var5.method_11076() == class_6950.field_35733) {
         class_2966 var7 = class_2966.method_13559(var1.method_11077());
         method_8107(var7, "Unknown function: " + var1);
         return var7;
      } else {
         class_2966 var6 = class_2966.method_13559(var1.method_11077());
         if (var6 != null) {
            if (var6.method_13556(new class_3999[0]) <= 0) {
               return var6;
            } else {
               throw new class_425("Missing arguments: " + var6);
            }
         } else {
            return null;
         }
      }
   }

   private class_3999 method_8093(class_2966 var1, Deque<class_2428> var2) throws ParseException {
      if (var1.method_13556(new class_3999[0]) == 0) {
         class_2428 var5 = (class_2428)var2.peek();
         if (var5 == null || var5.method_11076() != class_6950.field_35733) {
            return method_8094(var1, new class_3999[0]);
         }
      }

      class_2428 var8 = (class_2428)var2.poll();
      Deque var6 = method_8099(var2, class_6950.field_35731, true);
      class_3999[] var7 = this.method_8090(var6);
      return method_8094(var1, var7);
   }

   private class_3999[] method_8090(Deque<class_2428> var1) throws ParseException {
      ArrayList var4 = new ArrayList();

      while (true) {
         Deque var5 = method_8099(var1, class_6950.field_35732, false);
         class_3999 var6 = this.method_8105(var5);
         if (var6 == null) {
            return var4.<class_3999>toArray(new class_3999[var4.size()]);
         }

         var4.add(var6);
      }
   }

   private static class_3999 method_8094(class_2966 var0, class_3999[] var1) throws ParseException {
      class_8848[] var4 = var0.method_13564(var1);
      if (var1.length != var4.length) {
         throw new class_425(
            "Invalid number of arguments, function: \"" + var0.method_13558() + "\", count arguments: " + var1.length + ", should be: " + var4.length
         );
      } else {
         for (int var5 = 0; var5 < var1.length; var5++) {
            class_3999 var6 = var1[var5];
            class_8848 var7 = var6.method_18450();
            class_8848 var8 = var4[var5];
            if (var7 != var8) {
               throw new class_425(
                  "Invalid argument type, function: \"" + var0.method_13558() + "\", index: " + var5 + ", type: " + var7 + ", should be: " + var8
               );
            }
         }

         if (var0.method_13562() != class_8848.field_45248) {
            if (var0.method_13562() != class_8848.field_45252) {
               if (var0.method_13562() != class_8848.field_45249) {
                  throw new class_425("Unknown function type: " + var0.method_13562() + ", function: " + var0.method_13558());
               } else {
                  return new class_2554(var0, var1);
               }
            } else {
               return new class_6457(var0, var1);
            }
         } else {
            return new class_5482(var0, var1);
         }
      }
   }

   private class_3999 method_8098(class_2428 var1) throws ParseException {
      if (this.field_9294 != null) {
         class_3999 var4 = this.field_9294.method_16829(var1.method_11077());
         if (var4 != null) {
            return var4;
         } else {
            throw new class_425("Model variable not found: " + var1);
         }
      } else {
         throw new class_425("Model variable not found: " + var1);
      }
   }

   private class_3999 method_8100(class_2428 var1, Deque<class_2428> var2) throws ParseException {
      Deque var5 = method_8099(var2, class_6950.field_35731, true);
      return this.method_8105(var5);
   }

   private static Deque<class_2428> method_8099(Deque<class_2428> var0, class_6950 var1, boolean var2) throws ParseException {
      ArrayDeque var5 = new ArrayDeque();
      int var6 = 0;
      Iterator var7 = var5.iterator();

      while (var7.hasNext()) {
         class_2428 var8 = (class_2428)var7.next();
         var7.remove();
         if (var6 == 0 && var8.method_11076() == var1) {
            return var5;
         }

         var5.add(var8);
         if (var8.method_11076() == class_6950.field_35733) {
            var6++;
         }

         if (var8.method_11076() == class_6950.field_35731) {
            var6--;
         }
      }

      if (!var2) {
         return var5;
      } else {
         throw new class_425("Missing end token: " + var1);
      }
   }

   private static void method_8107(Object var0, String var1) throws ParseException {
      if (var0 == null) {
         throw new class_425(var1);
      }
   }
}
