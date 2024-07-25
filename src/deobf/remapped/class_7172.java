package remapped;

import com.google.common.collect.Lists;
import java.util.LinkedList;

public class class_7172 extends class_6414 {
   private static String[] field_36899;

   public class_7172(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360())) {
         this.method_32875(var2, var3);
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      this.method_32875(var2, var3);
      super.method_10801(var1, var2, var3, var4, var5, var6);
   }

   public void method_32875(World var1, BlockPos var2) {
      if (this.method_32874(var1, var2)) {
         var1.method_7513(var2, class_4783.field_23172.method_29260(), 2);
         var1.method_43364(2001, var2, class_6414.method_29285(class_4783.field_23900.method_29260()));
      }
   }

   private boolean method_32874(World var1, BlockPos var2) {
      LinkedList var5 = Lists.newLinkedList();
      var5.add(new class_947<BlockPos, Integer>(var2, 0));
      int var6 = 0;

      while (!var5.isEmpty()) {
         class_947 var7 = (class_947)var5.poll();
         BlockPos var8 = (BlockPos)var7.method_4141();
         int var9 = (Integer)var7.method_4142();

         for (Direction var13 : Direction.values()) {
            BlockPos var14 = var8.method_6098(var13);
            class_2522 var15 = var1.method_28262(var14);
            class_4774 var16 = var1.method_28258(var14);
            class_5371 var17 = var15.method_8362();
            if (var16.method_22007(class_6503.field_33094)) {
               if (var15.method_8360() instanceof class_5978 && ((class_5978)var15.method_8360()).method_27280(var1, var14, var15) != class_8532.field_43673) {
                  var6++;
                  if (var9 < 6) {
                     var5.add(new class_947<BlockPos, Integer>(var14, var9 + 1));
                  }
               } else if (!(var15.method_8360() instanceof class_7855)) {
                  if (var17 == class_5371.field_27426 || var17 == class_5371.field_27410) {
                     class_3757 var18 = !var15.method_8360().method_10802() ? null : var1.method_28260(var14);
                     method_29296(var15, var1, var14, var18);
                     var1.method_7513(var14, class_4783.field_23184.method_29260(), 3);
                     var6++;
                     if (var9 < 6) {
                        var5.add(new class_947<BlockPos, Integer>(var14, var9 + 1));
                     }
                  }
               } else {
                  var1.method_7513(var14, class_4783.field_23184.method_29260(), 3);
                  var6++;
                  if (var9 < 6) {
                     var5.add(new class_947<BlockPos, Integer>(var14, var9 + 1));
                  }
               }
            }
         }

         if (var6 > 64) {
            break;
         }
      }

      return var6 > 0;
   }
}
