package remapped;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6006 {
   private static String[] field_30583;
   private static final Logger field_30584 = LogManager.getLogger();

   public static void method_27412(
      class_6322 var0,
      class_7805 var1,
      class_1242 var2,
      class_6541 var3,
      class_5799 var4,
      class_1331 var5,
      List<? super class_7624> var6,
      Random var7,
      boolean var8,
      boolean var9
   ) {
      class_5390.method_24549();
      class_6433 var12 = var0.<class_8115>method_28813(class_8669.field_44413);
      class_6631 var13 = class_6631.method_30492(var7);
      class_8115 var14 = var1.method_35385().get();
      class_2609 var15 = var14.method_36912(var7);
      class_7624 var16 = var2.method_5536(var4, var15, var5, var15.method_11833(), var13, var15.method_11832(var4, var5, var13));
      class_9616 var17 = var16.method_32512();
      int var18 = (var17.field_48991 + var17.field_48996) / 2;
      int var19 = (var17.field_48994 + var17.field_48992) / 2;
      int var20;
      if (!var9) {
         var20 = var5.method_12165();
      } else {
         var20 = var5.method_12165() + var3.method_29831(var18, var19, class_3801.field_18598);
      }

      int var21 = var17.field_48995 + var16.method_34558();
      var16.method_32508(0, var20 - var21, 0);
      var6.add(var16);
      if (var1.method_35387() > 0) {
         byte var22 = 80;
         class_4092 var23 = new class_4092(
            (double)(var18 - 80), (double)(var20 - 80), (double)(var19 - 80), (double)(var18 + 80 + 1), (double)(var20 + 80 + 1), (double)(var19 + 80 + 1)
         );
         class_9670 var24 = new class_9670(var12, var1.method_35387(), var2, var3, var4, var6, var7, null);
         class_9670.method_44722(var24)
            .addLast(
               new class_1522(
                  var16,
                  new MutableObject(
                     class_3370.method_15533(class_3370.method_15523(var23), class_3370.method_15523(class_4092.method_18912(var17)), class_8529.field_43656)
                  ),
                  var20 + 80,
                  0,
                  null
               )
            );

         while (!class_9670.method_44722(var24).isEmpty()) {
            class_1522 var25 = (class_1522)class_9670.method_44722(var24).removeFirst();
            class_9670.method_44723(
               var24, class_1522.method_6954(var25), class_1522.method_6952(var25), class_1522.method_6953(var25), class_1522.method_6951(var25), var8
            );
         }
      }
   }

   public static void method_27409(
      class_6322 var0, class_7624 var1, int var2, class_1242 var3, class_6541 var4, class_5799 var5, List<? super class_7624> var6, Random var7
   ) {
      class_6433 var10 = var0.<class_8115>method_28813(class_8669.field_44413);
      class_9670 var11 = new class_9670(var10, var2, var3, var4, var5, var6, var7, null);
      class_9670.method_44722(var11).addLast(new class_1522(var1, new MutableObject(class_3370.field_16614), 0, 0, null));

      while (!class_9670.method_44722(var11).isEmpty()) {
         class_1522 var12 = (class_1522)class_9670.method_44722(var11).removeFirst();
         class_9670.method_44723(
            var11, class_1522.method_6954(var12), class_1522.method_6952(var12), class_1522.method_6953(var12), class_1522.method_6951(var12), false
         );
      }
   }
}
