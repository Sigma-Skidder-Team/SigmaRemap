package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public abstract class class_1279 extends class_7060 {
   public static final class_2522 field_7037 = class_4783.field_23186.method_29260();
   public static final class_2522 field_7039 = class_4783.field_23536.method_29260();
   public static final class_2522 field_7040 = class_4783.field_23441.method_29260();
   public static final class_2522 field_7035 = field_7039;
   public static final class_2522 field_7032 = class_4783.field_23329.method_29260();
   public static final class_2522 field_7029 = class_4783.field_23900.method_29260();
   public static final Set<class_6414> field_7034 = ImmutableSet.builder()
      .add(class_4783.field_23496)
      .add(class_4783.field_23829)
      .add(class_4783.field_23437)
      .add(field_7029.method_8360())
      .build();
   public static final int field_7038 = method_5723(2, 0, 0);
   public static final int field_7033 = method_5723(2, 2, 0);
   public static final int field_7030 = method_5723(0, 1, 0);
   public static final int field_7036 = method_5723(4, 1, 0);
   public class_7914 field_7031;

   public static final int method_5723(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }

   public class_1279(class_2746 var1, int var2) {
      super(var1, var2);
   }

   public class_1279(class_2746 var1, Direction var2, class_9616 var3) {
      super(var1, 1);
      this.method_32519(var2);
      this.field_36435 = var3;
   }

   public class_1279(class_2746 var1, int var2, Direction var3, class_7914 var4, int var5, int var6, int var7) {
      super(var1, var2);
      this.method_32519(var3);
      this.field_7031 = var4;
      int var10 = class_7914.method_35808(var4);
      int var11 = var10 % 5;
      int var12 = var10 / 5 % 5;
      int var13 = var10 / 25;
      if (var3 != Direction.field_818 && var3 != Direction.field_800) {
         this.field_36435 = new class_9616(0, 0, 0, var7 * 8 - 1, var6 * 4 - 1, var5 * 8 - 1);
      } else {
         this.field_36435 = new class_9616(0, 0, 0, var5 * 8 - 1, var6 * 4 - 1, var7 * 8 - 1);
      }

      switch (var3) {
         case field_818:
            this.field_36435.method_44391(var11 * 8, var13 * 4, -(var12 + var7) * 8 + 1);
            break;
         case field_800:
            this.field_36435.method_44391(var11 * 8, var13 * 4, var12 * 8);
            break;
         case field_809:
            this.field_36435.method_44391(-(var12 + var7) * 8 + 1, var13 * 4, var11 * 8);
            break;
         default:
            this.field_36435.method_44391(var12 * 8, var13 * 4, var11 * 8);
      }
   }

   public class_1279(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
   }

   public void method_5718(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var11 = var4; var11 <= var7; var11++) {
         for (int var12 = var3; var12 <= var6; var12++) {
            for (int var13 = var5; var13 <= var8; var13++) {
               class_2522 var14 = this.method_32514(var1, var12, var11, var13, var2);
               if (!field_7034.contains(var14.method_8360())) {
                  if (this.method_32507(var11) >= var1.method_22552() && var14 != field_7029) {
                     this.method_32529(var1, class_4783.field_23184.method_29260(), var12, var11, var13, var2);
                  } else {
                     this.method_32529(var1, field_7029, var12, var11, var13, var2);
                  }
               }
            }
         }
      }
   }

   public void method_5722(class_700 var1, class_9616 var2, int var3, int var4, boolean var5) {
      if (!var5) {
         this.method_32500(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, field_7037, field_7037, false);
      } else {
         this.method_32500(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, field_7037, field_7037, false);
         this.method_32500(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, field_7037, field_7037, false);
         this.method_32500(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, field_7037, field_7037, false);
         this.method_32500(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, field_7037, field_7037, false);
         this.method_32500(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, field_7039, field_7039, false);
         this.method_32500(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, field_7039, field_7039, false);
         this.method_32500(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, field_7039, field_7039, false);
         this.method_32500(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, field_7039, field_7039, false);
      }
   }

   public void method_5720(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8, class_2522 var9) {
      for (int var12 = var4; var12 <= var7; var12++) {
         for (int var13 = var3; var13 <= var6; var13++) {
            for (int var14 = var5; var14 <= var8; var14++) {
               if (this.method_32514(var1, var13, var12, var14, var2) == field_7029) {
                  this.method_32529(var1, var9, var13, var12, var14, var2);
               }
            }
         }
      }
   }

   public boolean method_5721(class_9616 var1, int var2, int var3, int var4, int var5) {
      int var8 = this.method_32530(var2, var3);
      int var9 = this.method_32523(var2, var3);
      int var10 = this.method_32530(var4, var5);
      int var11 = this.method_32523(var4, var5);
      return var1.method_44401(Math.min(var8, var10), Math.min(var9, var11), Math.max(var8, var10), Math.max(var9, var11));
   }

   public boolean method_5719(class_700 var1, class_9616 var2, int var3, int var4, int var5) {
      int var8 = this.method_32530(var3, var5);
      int var9 = this.method_32507(var4);
      int var10 = this.method_32523(var3, var5);
      if (!var2.method_44395(new BlockPos(var8, var9, var10))) {
         return false;
      } else {
         class_4965 var11 = class_6629.field_34324.method_30484(var1.method_7066());
         var11.heal(var11.method_26465());
         var11.method_37144((double)var8 + 0.5, (double)var9, (double)var10 + 0.5, 0.0F, 0.0F);
         var11.method_26864(var1, var1.method_43368(var11.method_37075()), class_2417.field_12033, (class_8733)null, (CompoundNBT)null);
         var1.method_7065(var11);
         return true;
      }
   }
}
