package remapped;

public abstract class class_6718 extends class_6057 {
   public class_6718(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean method_27692(long var1) {
      return var1 == class_2034.field_10326;
   }

   @Override
   public void method_27701(long var1, int var3, boolean var4) {
      class_2034 var7 = new class_2034(var1);
      int var8 = var7.field_10328;
      int var9 = var7.field_10327;

      for (int var10 = -1; var10 <= 1; var10++) {
         for (int var11 = -1; var11 <= 1; var11++) {
            long var12 = class_2034.method_9540(var8 + var10, var9 + var11);
            if (var12 != var1) {
               this.method_27687(var1, var12, var3, var4);
            }
         }
      }
   }

   @Override
   public int method_27695(long var1, long var3, int var5) {
      int var8 = var5;
      class_2034 var9 = new class_2034(var1);
      int var10 = var9.field_10328;
      int var11 = var9.field_10327;

      for (int var12 = -1; var12 <= 1; var12++) {
         for (int var13 = -1; var13 <= 1; var13++) {
            long var14 = class_2034.method_9540(var10 + var12, var11 + var13);
            if (var14 == var1) {
               var14 = class_2034.field_10326;
            }

            if (var14 != var3) {
               int var16 = this.method_27700(var14, var1, this.method_27698(var14));
               if (var8 > var16) {
                  var8 = var16;
               }

               if (var8 == 0) {
                  return var8;
               }
            }
         }
      }

      return var8;
   }

   @Override
   public int method_27700(long var1, long var3, int var5) {
      return var1 != class_2034.field_10326 ? var5 + 1 : this.method_30840(var3);
   }

   public abstract int method_30840(long var1);

   public void method_30841(long var1, int var3, boolean var4) {
      this.method_27703(class_2034.field_10326, var1, var3, var4);
   }
}
