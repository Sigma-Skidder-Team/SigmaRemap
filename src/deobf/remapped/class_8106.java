package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_8106 implements class_4650 {
   public class_8106(class_8200 var1) {
      this.field_41514 = var1;
   }

   @Override
   public class_1621 method_21502(Object var1) {
      Class var4 = var1.getClass().getComponentType();
      if (byte.class != var4) {
         if (short.class != var4) {
            if (int.class != var4) {
               if (long.class != var4) {
                  if (float.class != var4) {
                     if (double.class != var4) {
                        if (char.class != var4) {
                           if (boolean.class != var4) {
                              throw new class_5251("Unexpected primitive '" + var4.getCanonicalName() + "'");
                           } else {
                              return this.field_41514.method_596(class_9592.field_48882, this.method_36801(var1), class_435.field_1823);
                           }
                        } else {
                           return this.field_41514.method_596(class_9592.field_48882, this.method_36798(var1), class_435.field_1823);
                        }
                     } else {
                        return this.field_41514.method_596(class_9592.field_48882, this.method_36803(var1), class_435.field_1823);
                     }
                  } else {
                     return this.field_41514.method_596(class_9592.field_48882, this.method_36802(var1), class_435.field_1823);
                  }
               } else {
                  return this.field_41514.method_596(class_9592.field_48882, this.method_36799(var1), class_435.field_1823);
               }
            } else {
               return this.field_41514.method_596(class_9592.field_48882, this.method_36796(var1), class_435.field_1823);
            }
         } else {
            return this.field_41514.method_596(class_9592.field_48882, this.method_36795(var1), class_435.field_1823);
         }
      } else {
         return this.field_41514.method_596(class_9592.field_48882, this.method_36800(var1), class_435.field_1823);
      }
   }

   private List<Byte> method_36800(Object var1) {
      byte[] var4 = (byte[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Short> method_36795(Object var1) {
      short[] var4 = (short[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Integer> method_36796(Object var1) {
      int[] var4 = (int[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Long> method_36799(Object var1) {
      long[] var4 = (long[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Float> method_36802(Object var1) {
      float[] var4 = (float[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Double> method_36803(Object var1) {
      double[] var4 = (double[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Character> method_36798(Object var1) {
      char[] var4 = (char[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Boolean> method_36801(Object var1) {
      boolean[] var4 = (boolean[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }
}
