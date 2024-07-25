package remapped;

import java.util.BitSet;

public final class class_3087 extends class_5791 {
   private static String[] field_15302;
   private final BitSet field_15306;
   private int field_15299;
   private int field_15301;
   private int field_15303;
   private int field_15300;
   private int field_15304;
   private int field_15305;

   public class_3087(int var1, int var2, int var3) {
      this(var1, var2, var3, var1, var2, var3, 0, 0, 0);
   }

   public class_3087(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3);
      this.field_15306 = new BitSet(var1 * var2 * var3);
      this.field_15299 = var4;
      this.field_15301 = var5;
      this.field_15303 = var6;
      this.field_15300 = var7;
      this.field_15304 = var8;
      this.field_15305 = var9;
   }

   public class_3087(class_5791 var1) {
      super(var1.field_29269, var1.field_29266, var1.field_29267);
      if (!(var1 instanceof class_3087)) {
         this.field_15306 = new BitSet(this.field_29269 * this.field_29266 * this.field_29267);

         for (int var4 = 0; var4 < this.field_29269; var4++) {
            for (int var5 = 0; var5 < this.field_29266; var5++) {
               for (int var6 = 0; var6 < this.field_29267; var6++) {
                  if (var1.method_26194(var4, var5, var6)) {
                     this.field_15306.set(this.method_14163(var4, var5, var6));
                  }
               }
            }
         }
      } else {
         this.field_15306 = (BitSet)((class_3087)var1).field_15306.clone();
      }

      this.field_15299 = var1.method_26201(class_9249.field_47215);
      this.field_15301 = var1.method_26201(class_9249.field_47216);
      this.field_15303 = var1.method_26201(class_9249.field_47219);
      this.field_15300 = var1.method_26206(class_9249.field_47215);
      this.field_15304 = var1.method_26206(class_9249.field_47216);
      this.field_15305 = var1.method_26206(class_9249.field_47219);
   }

   public int method_14163(int var1, int var2, int var3) {
      return (var1 * this.field_29266 + var2) * this.field_29267 + var3;
   }

   @Override
   public boolean method_26194(int var1, int var2, int var3) {
      return this.field_15306.get(this.method_14163(var1, var2, var3));
   }

   @Override
   public void method_26202(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.field_15306.set(this.method_14163(var1, var2, var3), var5);
      if (var4 && var5) {
         this.field_15299 = Math.min(this.field_15299, var1);
         this.field_15301 = Math.min(this.field_15301, var2);
         this.field_15303 = Math.min(this.field_15303, var3);
         this.field_15300 = Math.max(this.field_15300, var1 + 1);
         this.field_15304 = Math.max(this.field_15304, var2 + 1);
         this.field_15305 = Math.max(this.field_15305, var3 + 1);
      }
   }

   @Override
   public boolean method_26192() {
      return this.field_15306.isEmpty();
   }

   @Override
   public int method_26201(class_9249 var1) {
      return var1.method_42631(this.field_15299, this.field_15301, this.field_15303);
   }

   @Override
   public int method_26206(class_9249 var1) {
      return var1.method_42631(this.field_15300, this.field_15304, this.field_15305);
   }

   @Override
   public boolean method_26197(int var1, int var2, int var3, int var4) {
      if (var3 < 0 || var4 < 0 || var1 < 0) {
         return false;
      } else {
         return var3 < this.field_29269 && var4 < this.field_29266 && var2 <= this.field_29267
            ? this.field_15306.nextClearBit(this.method_14163(var3, var4, var1)) >= this.method_14163(var3, var4, var2)
            : false;
      }
   }

   @Override
   public void method_26211(int var1, int var2, int var3, int var4, boolean var5) {
      this.field_15306.set(this.method_14163(var3, var4, var1), this.method_14163(var3, var4, var2), var5);
   }

   public static class_3087 method_14162(class_5791 var0, class_5791 var1, class_1205 var2, class_1205 var3, class_1205 var4, class_8529 var5) {
      class_3087 var8 = new class_3087(var2.method_5336().size() - 1, var3.method_5336().size() - 1, var4.method_5336().size() - 1);
      int[] var9 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      var2.method_5337((var7, var8x, var9x) -> {
         boolean[] var12 = new boolean[]{false};
         boolean var13 = var3.method_5337((var10, var11, var12x) -> {
            boolean[] var15 = new boolean[]{false};
            boolean var16 = var4.method_5337((var12xx, var13x, var14) -> {
               boolean var17 = var5.method_39260(var0.method_26204(var7, var10, var12xx), var1.method_26204(var8x, var11, var13x));
               if (var17) {
                  var8.field_15306.set(var8.method_14163(var9x, var12x, var14));
                  var9[2] = Math.min(var9[2], var14);
                  var9[5] = Math.max(var9[5], var14);
                  var15[0] = true;
               }

               return true;
            });
            if (var15[0]) {
               var9[1] = Math.min(var9[1], var12x);
               var9[4] = Math.max(var9[4], var12x);
               var12[0] = true;
            }

            return var16;
         });
         if (var12[0]) {
            var9[0] = Math.min(var9[0], var9x);
            var9[3] = Math.max(var9[3], var9x);
         }

         return var13;
      });
      var8.field_15299 = var9[0];
      var8.field_15301 = var9[1];
      var8.field_15303 = var9[2];
      var8.field_15300 = var9[3] + 1;
      var8.field_15304 = var9[4] + 1;
      var8.field_15305 = var9[5] + 1;
      return var8;
   }
}
