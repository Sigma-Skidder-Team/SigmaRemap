package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;

public class class_2605 extends class_8374<class_1439> {
   private static String[] field_12880;
   public final List<class_9478<class_6414>> field_12877;
   public final List<class_9478<class_2451>> field_12873;
   private final int[] field_12876;
   public int field_12879;
   public final List<class_2451> field_12875;
   public final Comparator<class_2451> field_12874;
   public class_9478<?> field_12878;
   public int field_12872;

   public class_2605(class_3231 var1, MinecraftClient var2) {
      super(var2, var1.field_941, var1.field_940, 32, var1.field_940 - 64, 20);
      this.field_12881 = var1;
      this.field_12876 = new int[]{3, 4, 1, 2, 5, 6};
      this.field_12879 = -1;
      this.field_12874 = new class_1559(this, null);
      this.field_12877 = Lists.newArrayList();
      this.field_12877.add(class_6234.field_31905);
      this.field_12873 = Lists.newArrayList(
         new class_9478[]{class_6234.field_31879, class_6234.field_31839, class_6234.field_31907, class_6234.field_31849, class_6234.field_31850}
      );
      this.method_36203(true, 20);
      Set var5 = Sets.newIdentityHashSet();

      for (class_2451 var7 : class_8669.field_44382) {
         boolean var8 = false;

         for (class_9478 var10 : this.field_12873) {
            if (var10.method_43793(var7) && class_3231.method_14804(var1).method_19276(var10.method_43790(var7)) > 0) {
               var8 = true;
            }
         }

         if (var8) {
            var5.add(var7);
         }
      }

      for (class_6414 var13 : class_8669.field_44462) {
         boolean var14 = false;

         for (class_9478 var16 : this.field_12877) {
            if (var16.method_43793(var13) && class_3231.method_14804(var1).method_19276(var16.method_43790(var13)) > 0) {
               var14 = true;
            }
         }

         if (var14) {
            var5.add(var13.method_10803());
         }
      }

      var5.remove(class_4897.field_25302);
      this.field_12875 = Lists.newArrayList(var5);

      for (int var12 = 0; var12 < this.field_12875.size(); var12++) {
         this.method_36202(new class_1439(this, null));
      }
   }

   @Override
   public void method_36196(class_7966 var1, int var2, int var3, class_8042 var4) {
      if (!this.field_40883.field_9625.method_39838()) {
         this.field_12879 = -1;
      }

      for (int var7 = 0; var7 < this.field_12876.length; var7++) {
         class_3231.method_14803(
            this.field_12881, var1, var2 + class_3231.method_14805(this.field_12881, var7) - 18, var3 + 1, 0, this.field_12879 != var7 ? 18 : 0
         );
      }

      if (this.field_12878 != null) {
         int var9 = class_3231.method_14805(this.field_12881, this.method_11806(this.field_12878)) - 36;
         int var8 = this.field_12872 != 1 ? 1 : 2;
         class_3231.method_14803(this.field_12881, var1, var2 + var9, var3 + 1, 18 * var8, 0);
      }

      for (int var10 = 0; var10 < this.field_12876.length; var10++) {
         int var11 = this.field_12879 != var10 ? 0 : 1;
         class_3231.method_14803(
            this.field_12881, var1, var2 + class_3231.method_14805(this.field_12881, var10) - 18 + var11, var3 + 1 + var11, 18 * this.field_12876[var10], 18
         );
      }
   }

   @Override
   public int method_36195() {
      return 375;
   }

   @Override
   public int method_36191() {
      return this.field_40891 / 2 + 140;
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_12881.method_1183(var1);
   }

   @Override
   public void method_36214(int var1, int var2) {
      this.field_12879 = -1;

      for (int var5 = 0; var5 < this.field_12876.length; var5++) {
         int var6 = var1 - class_3231.method_14805(this.field_12881, var5);
         if (var6 >= -36 && var6 <= 0) {
            this.field_12879 = var5;
            break;
         }
      }

      if (this.field_12879 >= 0) {
         this.method_11805(this.method_11807(this.field_12879));
         this.field_40883.method_8590().method_16345(class_4949.method_22675(class_463.field_1995, 1.0F));
      }
   }

   private class_9478<?> method_11807(int var1) {
      return var1 >= this.field_12877.size() ? this.field_12873.get(var1 - this.field_12877.size()) : this.field_12877.get(var1);
   }

   private int method_11806(class_9478<?> var1) {
      int var4 = this.field_12877.indexOf(var1);
      if (var4 < 0) {
         int var5 = this.field_12873.indexOf(var1);
         return var5 < 0 ? -1 : var5 + this.field_12877.size();
      } else {
         return var4;
      }
   }

   @Override
   public void method_36220(class_7966 var1, int var2, int var3) {
      if (var3 >= this.field_40876 && var3 <= this.field_40877) {
         class_1439 var6 = this.method_36193((double)var2, (double)var3);
         int var7 = (this.field_40891 - this.method_36195()) / 2;
         if (var6 == null) {
            ITextComponent var12 = null;
            int var9 = var2 - var7;

            for (int var10 = 0; var10 < this.field_12876.length; var10++) {
               int var11 = class_3231.method_14805(this.field_12881, var10);
               if (var9 >= var11 - 18 && var9 <= var11) {
                  var12 = this.method_11807(var10).method_43789();
                  break;
               }
            }

            this.method_11808(var1, var12, var2, var3);
         } else {
            if (var2 < var7 + 40 || var2 > var7 + 40 + 20) {
               return;
            }

            class_2451 var8 = this.field_12875.get(this.method_41183().indexOf(var6));
            this.method_11808(var1, this.method_11809(var8), var2, var3);
         }
      }
   }

   public void method_11808(class_7966 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field_12881.field_948.method_45379(var2);
         this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         class_3542.method_16438();
         class_3542.method_16413(0.0F, 0.0F, 400.0F);
         this.field_12881.field_948.method_45392(var1, var2, (float)var7, (float)var8, -1);
         class_3542.method_16489();
      }
   }

   public ITextComponent method_11809(class_2451 var1) {
      return var1.method_11219();
   }

   public void method_11805(class_9478<?> var1) {
      if (var1 == this.field_12878) {
         if (this.field_12872 != -1) {
            this.field_12878 = null;
            this.field_12872 = 0;
         } else {
            this.field_12872 = 1;
         }
      } else {
         this.field_12878 = var1;
         this.field_12872 = -1;
      }

      this.field_12875.sort(this.field_12874);
   }
}
