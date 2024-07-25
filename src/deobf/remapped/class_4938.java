package remapped;

public abstract class class_4938 extends class_6057 {
   public class_4938(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean method_27692(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   @Override
   public void method_27701(long var1, int var3, boolean var4) {
      for (int var7 = -1; var7 <= 1; var7++) {
         for (int var8 = -1; var8 <= 1; var8++) {
            for (int var9 = -1; var9 <= 1; var9++) {
               long var10 = class_6979.method_31927(var1, var7, var8, var9);
               if (var10 != var1) {
                  this.method_27687(var1, var10, var3, var4);
               }
            }
         }
      }
   }

   @Override
   public int method_27695(long var1, long var3, int var5) {
      int var8 = var5;

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            for (int var11 = -1; var11 <= 1; var11++) {
               long var12 = class_6979.method_31927(var1, var9, var10, var11);
               if (var12 == var1) {
                  var12 = Long.MAX_VALUE;
               }

               if (var12 != var3) {
                  int var14 = this.method_27700(var12, var1, this.method_27698(var12));
                  if (var8 > var14) {
                     var8 = var14;
                  }

                  if (var8 == 0) {
                     return var8;
                  }
               }
            }
         }
      }

      return var8;
   }

   @Override
   public int method_27700(long var1, long var3, int var5) {
      return var1 != Long.MAX_VALUE ? var5 + 1 : this.method_22639(var3);
   }

   public abstract int method_22639(long var1);

   public void method_22640(long var1, int var3, boolean var4) {
      this.method_27703(Long.MAX_VALUE, var1, var3, var4);
   }
}
