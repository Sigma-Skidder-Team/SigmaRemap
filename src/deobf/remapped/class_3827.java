package remapped;

public class class_3827 extends class_8394<class_1941> {
   private static String[] field_18699;

   public class_3827(class_5390<class_1941> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_17804(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1941 var7) {
      class_2034 var10 = new class_2034(var4, var5);
      int var11 = var10.method_9535() + this.field_15989.nextInt(16);
      int var12 = var10.method_9545() + this.field_15989.nextInt(16);
      int var13 = var2.method_29816();
      int var14 = var13 + this.field_15989.nextInt(var2.method_29826() - 2 - var13);
      class_6163 var15 = var2.method_29822(var11, var12);

      for (class_2921 var16 = new class_2921(var11, var14, var12); var14 > var13; var14--) {
         class_2522 var17 = var15.method_28262(var16);
         var16.method_13368(Direction.field_802);
         class_2522 var18 = var15.method_28262(var16);
         if (var17.method_8345() && (var18.method_8350(class_4783.field_23784) || var18.method_8308(var15, var16, Direction.field_817))) {
            break;
         }
      }

      if (var14 > var13) {
         class_6596.method_30372(var3, this.field_15986, this.field_15989, new class_1331(var11, var14, var12));
         this.method_14720();
      }
   }
}
