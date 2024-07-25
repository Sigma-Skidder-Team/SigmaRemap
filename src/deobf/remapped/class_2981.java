package remapped;

public class class_2981 extends class_3200<class_9507> {
   private static String[] field_14678;

   public class_2981(class_5390<class_9507> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_13655(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_9507 var7) {
      class_823 var10 = new class_823(0, this.field_15989, (var4 << 4) + 2, (var5 << 4) + 2, var7.field_48404);
      this.field_15986.add(var10);
      var10.method_32527(var10, this.field_15986, this.field_15989);
      this.method_14720();
      if (var7.field_48404 != class_1143.field_6469) {
         this.method_14723(var2.method_29816(), this.field_15989, 10);
      } else {
         byte var11 = -5;
         int var12 = var2.method_29816() - this.field_15988.field_48993 + this.field_15988.method_44398() / 2 - -5;
         this.field_15988.method_44391(0, var12, 0);

         for (class_7060 var14 : this.field_15986) {
            var14.method_32508(0, var12, 0);
         }
      }
   }
}
