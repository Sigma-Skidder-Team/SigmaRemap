package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class class_823 extends class_462 {
   private final List<class_9616> field_4349 = Lists.newLinkedList();

   public class_823(int var1, Random var2, int var3, int var4, class_1143 var5) {
      super(class_2746.field_13425, var1, var5);
      this.field_1919 = var5;
      this.field_36435 = new class_9616(var3, 50, var4, var3 + 7 + var2.nextInt(6), 54 + var2.nextInt(6), var4 + 7 + var2.nextInt(6));
   }

   public class_823(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13425, var2);
      class_3416 var5 = var2.method_25927("Entrances", 11);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         this.field_4349.add(new class_9616(var5.method_15767(var6)));
      }
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      int var6 = this.method_32515();
      int var7 = this.field_36435.method_44398() - 3 - 1;
      if (var7 <= 0) {
         var7 = 1;
      }

      int var8 = 0;

      while (var8 < this.field_36435.method_44393()) {
         var8 += var3.nextInt(this.field_36435.method_44393());
         if (var8 + 3 > this.field_36435.method_44393()) {
            break;
         }

         class_462 var9 = class_1087.method_4766(
            var1,
            var2,
            var3,
            this.field_36435.field_48996 + var8,
            this.field_36435.field_48995 + var3.nextInt(var7) + 1,
            this.field_36435.field_48992 - 1,
            class_240.field_818,
            var6
         );
         if (var9 != null) {
            class_9616 var10 = var9.method_32512();
            this.field_4349
               .add(
                  new class_9616(
                     var10.field_48996, var10.field_48995, this.field_36435.field_48992, var10.field_48991, var10.field_48993, this.field_36435.field_48992 + 1
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field_36435.method_44393()) {
         var8 += var3.nextInt(this.field_36435.method_44393());
         if (var8 + 3 > this.field_36435.method_44393()) {
            break;
         }

         class_462 var18 = class_1087.method_4766(
            var1,
            var2,
            var3,
            this.field_36435.field_48996 + var8,
            this.field_36435.field_48995 + var3.nextInt(var7) + 1,
            this.field_36435.field_48994 + 1,
            class_240.field_800,
            var6
         );
         if (var18 != null) {
            class_9616 var21 = var18.method_32512();
            this.field_4349
               .add(
                  new class_9616(
                     var21.field_48996, var21.field_48995, this.field_36435.field_48994 - 1, var21.field_48991, var21.field_48993, this.field_36435.field_48994
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field_36435.method_44387()) {
         var8 += var3.nextInt(this.field_36435.method_44387());
         if (var8 + 3 > this.field_36435.method_44387()) {
            break;
         }

         class_462 var19 = class_1087.method_4766(
            var1,
            var2,
            var3,
            this.field_36435.field_48996 - 1,
            this.field_36435.field_48995 + var3.nextInt(var7) + 1,
            this.field_36435.field_48992 + var8,
            class_240.field_809,
            var6
         );
         if (var19 != null) {
            class_9616 var22 = var19.method_32512();
            this.field_4349
               .add(
                  new class_9616(
                     this.field_36435.field_48996, var22.field_48995, var22.field_48992, this.field_36435.field_48996 + 1, var22.field_48993, var22.field_48994
                  )
               );
         }

         var8 += 4;
      }

      var8 = 0;

      while (var8 < this.field_36435.method_44387()) {
         var8 += var3.nextInt(this.field_36435.method_44387());
         if (var8 + 3 > this.field_36435.method_44387()) {
            break;
         }

         class_462 var20 = class_1087.method_4766(
            var1,
            var2,
            var3,
            this.field_36435.field_48991 + 1,
            this.field_36435.field_48995 + var3.nextInt(var7) + 1,
            this.field_36435.field_48992 + var8,
            class_240.field_804,
            var6
         );
         if (var20 != null) {
            class_9616 var23 = var20.method_32512();
            this.field_4349
               .add(
                  new class_9616(
                     this.field_36435.field_48991 - 1, var23.field_48995, var23.field_48992, this.field_36435.field_48991, var23.field_48993, var23.field_48994
                  )
               );
         }

         var8 += 4;
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (this.method_32503(var1, var5)) {
         return false;
      } else {
         this.method_32500(
            var1,
            var5,
            this.field_36435.field_48996,
            this.field_36435.field_48995,
            this.field_36435.field_48992,
            this.field_36435.field_48991,
            this.field_36435.field_48995,
            this.field_36435.field_48994,
            class_4783.field_23592.method_29260(),
            field_36439,
            true
         );
         this.method_32500(
            var1,
            var5,
            this.field_36435.field_48996,
            this.field_36435.field_48995 + 1,
            this.field_36435.field_48992,
            this.field_36435.field_48991,
            Math.min(this.field_36435.field_48995 + 3, this.field_36435.field_48993),
            this.field_36435.field_48994,
            field_36439,
            field_36439,
            false
         );

         for (class_9616 var11 : this.field_4349) {
            this.method_32500(
               var1,
               var5,
               var11.field_48996,
               var11.field_48993 - 2,
               var11.field_48992,
               var11.field_48991,
               var11.field_48993,
               var11.field_48994,
               field_36439,
               field_36439,
               false
            );
         }

         this.method_32516(
            var1,
            var5,
            this.field_36435.field_48996,
            this.field_36435.field_48995 + 4,
            this.field_36435.field_48992,
            this.field_36435.field_48991,
            this.field_36435.field_48993,
            this.field_36435.field_48994,
            field_36439,
            false
         );
         return true;
      }
   }

   @Override
   public void method_32508(int var1, int var2, int var3) {
      super.method_32508(var1, var2, var3);

      for (class_9616 var7 : this.field_4349) {
         var7.method_44391(var1, var2, var3);
      }
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      class_3416 var4 = new class_3416();

      for (class_9616 var6 : this.field_4349) {
         var4.add(var6.method_44388());
      }

      var1.method_25946("Entrances", var4);
   }
}
