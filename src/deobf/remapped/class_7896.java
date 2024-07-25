package remapped;

import java.util.Random;

public abstract class class_7896 extends class_7060 {
   public final int field_40379;
   public final int field_40378;
   public final int field_40376;
   public int field_40377 = -1;

   public class_7896(class_2746 var1, Random var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, 0);
      this.field_40379 = var6;
      this.field_40378 = var7;
      this.field_40376 = var8;
      this.method_32519(class_9594.field_48893.method_44313(var2));
      if (this.method_32518().method_1029() != class_9249.field_47219) {
         this.field_36435 = new class_9616(var3, var4, var5, var3 + var8 - 1, var4 + var7 - 1, var5 + var6 - 1);
      } else {
         this.field_36435 = new class_9616(var3, var4, var5, var3 + var6 - 1, var4 + var7 - 1, var5 + var8 - 1);
      }
   }

   public class_7896(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field_40379 = var2.method_25947("Width");
      this.field_40378 = var2.method_25947("Height");
      this.field_40376 = var2.method_25947("Depth");
      this.field_40377 = var2.method_25947("HPos");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      var1.method_25931("Width", this.field_40379);
      var1.method_25931("Height", this.field_40378);
      var1.method_25931("Depth", this.field_40376);
      var1.method_25931("HPos", this.field_40377);
   }

   public boolean method_35693(class_9379 var1, class_9616 var2, int var3) {
      if (this.field_40377 >= 0) {
         return true;
      } else {
         int var6 = 0;
         int var7 = 0;
         class_2921 var8 = new class_2921();

         for (int var9 = this.field_36435.field_48992; var9 <= this.field_36435.field_48994; var9++) {
            for (int var10 = this.field_36435.field_48996; var10 <= this.field_36435.field_48991; var10++) {
               var8.method_13362(var10, 64, var9);
               if (var2.method_44395(var8)) {
                  var6 += var1.method_22563(class_3801.field_18590, var8).method_12165();
                  var7++;
               }
            }
         }

         if (var7 != 0) {
            this.field_40377 = var6 / var7;
            this.field_36435.method_44391(0, this.field_40377 - this.field_36435.field_48995 + var3, 0);
            return true;
         } else {
            return false;
         }
      }
   }
}
