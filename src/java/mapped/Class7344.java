package mapped;

import net.optifine.Config;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class7344 {
   private Class6267 field31449;

   public Class7344(Class6267 var1) {
      this.field31449 = var1;
   }

   public Class1884 method23270(String var1) throws Class2445 {
      Class1878 var4 = this.method23272(var1);
      if (var4 instanceof Class1884) {
         return (Class1884)var4;
      } else {
         throw new Class2445("Not a float expression: " + var4.method8139());
      }
   }

   public Class1876 method23271(String var1) throws Class2445 {
      Class1878 var4 = this.method23272(var1);
      if (var4 instanceof Class1876) {
         return (Class1876)var4;
      } else {
         throw new Class2445("Not a boolean expression: " + var4.method8139());
      }
   }

   public Class1878 method23272(String var1) throws Class2445 {
      try {
         Class7681[] var4 = Class9285.method35011(var1);
         if (var4 == null) {
            return null;
         } else {
            ArrayDeque var5 = new ArrayDeque<Class7681>(Arrays.asList(var4));
            return this.method23273(var5);
         }
      } catch (IOException var6) {
         throw new Class2445(var6.getMessage(), var6);
      }
   }

   private Class1878 method23273(Deque<Class7681> var1) throws Class2445 {
      if (!var1.isEmpty()) {
         LinkedList var4 = new LinkedList();
         LinkedList var5 = new LinkedList();
         Class1878 var6 = this.method23277(var1);
         method23286(var6, "Missing expression");
         var4.add(var6);

         while (true) {
            Class7681 var7 = (Class7681)var1.poll();
            if (var7 == null) {
               return this.method23274(var4, var5);
            }

            if (var7.method25289() != Class2161.field14172) {
               throw new Class2445("Invalid operator: " + var7);
            }

            Class1878 var8 = this.method23277(var1);
            method23286(var8, "Missing expression");
            var5.add(var7);
            var4.add(var8);
         }
      } else {
         return null;
      }
   }

   private Class1878 method23274(List<Class1878> var1, List<Class7681> var2) throws Class2445 {
      LinkedList var5 = new LinkedList();

      for (Class7681 var7 : var2) {
         Class2133 var8 = Class2133.method8830(var7.method25290());
         method23286(var8, "Invalid operator: " + var7);
         var5.add(var8);
      }

      return this.method23275(var1, var5);
   }

   private Class1878 method23275(List<Class1878> var1, List<Class2133> var2) throws Class2445 {
      if (var1.size() != var2.size() + 1) {
         throw new Class2445("Invalid infix expression, expressions: " + var1.size() + ", operators: " + var2.size());
      } else if (var1.size() == 1) {
         return (Class1878)var1.get(0);
      } else {
         int var5 = Integer.MAX_VALUE;
         int var6 = Integer.MIN_VALUE;

         for (Class2133 var8 : var2) {
            var5 = Math.min(var8.method8818(), var5);
            var6 = Math.max(var8.method8818(), var6);
         }

         if (var6 >= var5 && var6 - var5 <= 10) {
            for (int var9 = var6; var9 >= var5; var9--) {
               this.method23276(var1, var2, var9);
            }

            if (var1.size() == 1 && var2.size() == 0) {
               return (Class1878)var1.get(0);
            } else {
               throw new Class2445("Error merging operators, expressions: " + var1.size() + ", operators: " + var2.size());
            }
         } else {
            throw new Class2445("Invalid infix precedence, min: " + var5 + ", max: " + var6);
         }
      }
   }

   private void method23276(List<Class1878> var1, List<Class2133> var2, int var3) throws Class2445 {
      for (int var6 = 0; var6 < var2.size(); var6++) {
         Class2133 var7 = (Class2133)var2.get(var6);
         if (var7.method8818() == var3) {
            var2.remove(var6);
            Class1878 var8 = (Class1878)var1.remove(var6);
            Class1878 var9 = (Class1878)var1.remove(var6);
            Class1878 var10 = method23282(var7, new Class1878[]{var8, var9});
            var1.add(var6, var10);
            var6--;
         }
      }
   }

   private Class1878 method23277(Deque<Class7681> var1) throws Class2445 {
      Class7681 var4 = (Class7681)var1.poll();
      method23286(var4, "Missing expression");
      switch (Class9506.field44257[var4.method25289().ordinal()]) {
         case 1:
            return method23278(var4);
         case 2:
            Class2133 var5 = this.method23279(var4, var1);
            if (var5 != null) {
               return this.method23280(var5, var1);
            }

            return this.method23283(var4);
         case 3:
            return this.method23284(var4, var1);
         case 4:
            Class2133 var6 = Class2133.method8830(var4.method25290());
            method23286(var6, "Invalid operator: " + var4);
            if (var6 == Class2133.field13921) {
               return this.method23277(var1);
            } else if (var6 == Class2133.field13922) {
               Class1878 var8 = this.method23277(var1);
               return method23282(Class2133.field13926, new Class1878[]{var8});
            } else if (var6 == Class2133.field13954) {
               Class1878 var7 = this.method23277(var1);
               return method23282(Class2133.field13954, new Class1878[]{var7});
            }
         default:
            throw new Class2445("Invalid expression: " + var4);
      }
   }

   private static Class1878 method23278(Class7681 var0) throws Class2445 {
      float var3 = Config.method26900(var0.method25290(), Float.NaN);
      if (var3 != Float.NaN) {
         return new Class1888(var3);
      } else {
         throw new Class2445("Invalid float value: " + var0);
      }
   }

   private Class2133 method23279(Class7681 var1, Deque<Class7681> var2) throws Class2445 {
      Class7681 var5 = (Class7681)var2.peek();
      if (var5 != null && var5.method25289() == Class2161.field14174) {
         Class2133 var7 = Class2133.method8830(var1.method25290());
         method23286(var7, "Unknown function: " + var1);
         return var7;
      } else {
         Class2133 var6 = Class2133.method8830(var1.method25290());
         if (var6 != null) {
            if (var6.method8821(new Class1878[0]) <= 0) {
               return var6;
            } else {
               throw new Class2445("Missing arguments: " + var6);
            }
         } else {
            return null;
         }
      }
   }

   private Class1878 method23280(Class2133 var1, Deque<Class7681> var2) throws Class2445 {
      if (var1.method8821(new Class1878[0]) == 0) {
         Class7681 var5 = (Class7681)var2.peek();
         if (var5 == null || var5.method25289() != Class2161.field14174) {
            return method23282(var1, new Class1878[0]);
         }
      }

      Class7681 var8 = (Class7681)var2.poll();
      Deque var6 = method23285(var2, Class2161.field14175, true);
      Class1878[] var7 = this.method23281(var6);
      return method23282(var1, var7);
   }

   private Class1878[] method23281(Deque<Class7681> var1) throws Class2445 {
      ArrayList var4 = new ArrayList();

      while (true) {
         Deque var5 = method23285(var1, Class2161.field14173, false);
         Class1878 var6 = this.method23273(var5);
         if (var6 == null) {
            return (Class1878[]) var4.<Class1878>toArray(new Class1878[var4.size()]);
         }

         var4.add(var6);
      }
   }

   private static Class1878 method23282(Class2133 var0, Class1878[] var1) throws Class2445 {
      Class2118[] var4 = var0.method8822(var1);
      if (var1.length != var4.length) {
         throw new Class2445(
            "Invalid number of arguments, function: \"" + var0.method8817() + "\", count arguments: " + var1.length + ", should be: " + var4.length
         );
      } else {
         for (int var5 = 0; var5 < var1.length; var5++) {
            Class1878 var6 = var1[var5];
            Class2118 var7 = var6.method8139();
            Class2118 var8 = var4[var5];
            if (var7 != var8) {
               throw new Class2445(
                  "Invalid argument type, function: \"" + var0.method8817() + "\", index: " + var5 + ", type: " + var7 + ", should be: " + var8
               );
            }
         }

         if (var0.method8819() != Class2118.field13803) {
            if (var0.method8819() != Class2118.field13805) {
               if (var0.method8819() != Class2118.field13804) {
                  throw new Class2445("Unknown function type: " + var0.method8819() + ", function: " + var0.method8817());
               } else {
                  return new Class1880(var0, var1);
               }
            } else {
               return new Class1891(var0, var1);
            }
         } else {
            return new Class1887(var0, var1);
         }
      }
   }

   private Class1878 method23283(Class7681 var1) throws Class2445 {
      if (this.field31449 != null) {
         Class1878 var4 = this.field31449.method19230(var1.method25290());
         if (var4 != null) {
            return var4;
         } else {
            throw new Class2445("Model variable not found: " + var1);
         }
      } else {
         throw new Class2445("Model variable not found: " + var1);
      }
   }

   private Class1878 method23284(Class7681 var1, Deque<Class7681> var2) throws Class2445 {
      Deque var5 = method23285(var2, Class2161.field14175, true);
      return this.method23273(var5);
   }

   private static Deque<Class7681> method23285(Deque<Class7681> var0, Class2161 var1, boolean var2) throws Class2445 {
      ArrayDeque var5 = new ArrayDeque();
      int var6 = 0;
      Iterator var7 = var5.iterator();

      while (var7.hasNext()) {
         Class7681 var8 = (Class7681)var7.next();
         var7.remove();
         if (var6 == 0 && var8.method25289() == var1) {
            return var5;
         }

         var5.add(var8);
         if (var8.method25289() == Class2161.field14174) {
            var6++;
         }

         if (var8.method25289() == Class2161.field14175) {
            var6--;
         }
      }

      if (!var2) {
         return var5;
      } else {
         throw new Class2445("Missing end token: " + var1);
      }
   }

   private static void method23286(Object var0, String var1) throws Class2445 {
      if (var0 == null) {
         throw new Class2445(var1);
      }
   }
}
