package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class6189 implements Class6180 {
   public final Class4499 field27633;

   public Class6189(Class4499 var1) {
      this.field27633 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      Class var4 = var1.getClass().getComponentType();
      if (byte.class != var4) {
         if (short.class != var4) {
            if (int.class != var4) {
               if (long.class != var4) {
                  if (float.class != var4) {
                     if (double.class != var4) {
                        if (char.class != var4) {
                           if (boolean.class != var4) {
                              throw new Class2478("Unexpected primitive '" + var4.getCanonicalName() + "'");
                           } else {
                              return this.field27633.method14194(Class9757.field45643, this.method19096(var1), Class2214.field14477);
                           }
                        } else {
                           return this.field27633.method14194(Class9757.field45643, this.method19095(var1), Class2214.field14477);
                        }
                     } else {
                        return this.field27633.method14194(Class9757.field45643, this.method19094(var1), Class2214.field14477);
                     }
                  } else {
                     return this.field27633.method14194(Class9757.field45643, this.method19093(var1), Class2214.field14477);
                  }
               } else {
                  return this.field27633.method14194(Class9757.field45643, this.method19092(var1), Class2214.field14477);
               }
            } else {
               return this.field27633.method14194(Class9757.field45643, this.method19091(var1), Class2214.field14477);
            }
         } else {
            return this.field27633.method14194(Class9757.field45643, this.method19090(var1), Class2214.field14477);
         }
      } else {
         return this.field27633.method14194(Class9757.field45643, this.method19089(var1), Class2214.field14477);
      }
   }

   private List<Byte> method19089(Object var1) {
      byte[] var4 = (byte[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Short> method19090(Object var1) {
      short[] var4 = (short[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Integer> method19091(Object var1) {
      int[] var4 = (int[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Long> method19092(Object var1) {
      long[] var4 = (long[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Float> method19093(Object var1) {
      float[] var4 = (float[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Double> method19094(Object var1) {
      double[] var4 = (double[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Character> method19095(Object var1) {
      char[] var4 = (char[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }

   private List<Boolean> method19096(Object var1) {
      boolean[] var4 = (boolean[])var1;
      ArrayList var5 = new ArrayList(var4.length);

      for (int var6 = 0; var6 < var4.length; var6++) {
         var5.add(var4[var6]);
      }

      return var5;
   }
}
