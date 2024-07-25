package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_4232 extends class_266 {
   private static String[] field_20541;
   public List<class_7114> field_20540 = this.field_950;
   public class_9854 field_20538 = class_1893.method_8510().field_9668;
   public boolean field_20539 = false;

   public class_4232(ITextComponent var1) {
      super(var1);
   }

   public void method_19728(class_7114 var1) {
   }

   public void method_19729(class_7114 var1) {
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      boolean var8 = super.method_26940(var1, var3, var5);
      this.field_20539 = true;
      class_7114 var9 = method_19727((int)var1, (int)var3, this.field_20540);
      if (var9 != null && var9.field_36675) {
         if (var5 == 1 && var9 instanceof class_8243) {
            class_8243 var10 = (class_8243)var9;
            if (var10.method_9910() == class_1013.field_5251) {
               var9.method_32692(super.field_943.method_8590());
            }
         }

         if (var5 != 0) {
            if (var5 == 1) {
               this.method_19729(var9);
            }
         } else {
            this.method_19728(var9);
         }

         return true;
      } else {
         return var8;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (!this.field_20539) {
         return false;
      } else {
         this.field_20539 = false;
         this.method_41179(false);
         return this.method_41185() != null && this.method_41185().method_26941(var1, var3, var5) ? true : super.method_26941(var1, var3, var5);
      }
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      return this.field_20539 ? super.method_26944(var1, var3, var5, var6, var8) : false;
   }

   public static class_7114 method_19727(int var0, int var1, List<class_7114> var2) {
      for (int var5 = 0; var5 < var2.size(); var5++) {
         class_7114 var6 = (class_7114)var2.get(var5);
         if (var6.field_36677) {
            int var7 = class_2148.method_10029(var6);
            int var8 = class_2148.method_10030(var6);
            if (var0 >= var6.field_36670 && var1 >= var6.field_36674 && var0 < var6.field_36670 + var7 && var1 < var6.field_36674 + var8) {
               return var6;
            }
         }
      }

      return null;
   }

   public static void method_19730(class_7966 var0, class_9854 var1, class_7107 var2, int var3, int var4, int var5) {
      var1.method_45402(var0, var2, (float)(var3 - var1.method_45400(var2) / 2), (float)var4, var5);
   }
}
