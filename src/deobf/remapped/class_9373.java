package remapped;

public class class_9373 extends class_3725 {
   private static class_9741 field_47918;
   private static class_9741 field_47920;

   public class_9373(class_3073 var1) {
      super(class_8469.field_43285, var1);
   }

   @Override
   public void method_29257(World var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      super.method_29257(var1, var2, var3, var4, var5);
      class_3757 var8 = var1.method_28260(var2);
      if (var8 instanceof class_4797) {
         method_43348(var1, var2, (class_4797)var8);
      }
   }

   public static void method_43348(World var0, class_1331 var1, class_4797 var2) {
      if (!var0.field_33055) {
         class_2522 var5 = var2.method_17403();
         boolean var6 = var5.method_8350(class_4783.field_23444) || var5.method_8350(class_4783.field_23279);
         if (var6 && var1.method_12165() >= 0 && var0.method_43370() != class_423.field_1790) {
            class_9741 var7 = method_43347();
            class_6953 var8 = var7.method_44981(var0, var1);
            if (var8 != null) {
               for (int var9 = 0; var9 < var7.method_44984(); var9++) {
                  for (int var10 = 0; var10 < var7.method_44986(); var10++) {
                     class_9115 var11 = var8.method_31795(var9, var10, 0);
                     var0.method_7513(var11.method_41966(), class_4783.field_23184.method_29260(), 2);
                     var0.method_43364(2001, var11.method_41966(), class_6414.method_29285(var11.method_41968()));
                  }
               }

               class_4653 var13 = class_6629.field_34212.method_30484(var0);
               class_1331 var14 = var8.method_31795(1, 2, 0).method_41966();
               var13.method_37144(
                  (double)var14.method_12173() + 0.5,
                  (double)var14.method_12165() + 0.55,
                  (double)var14.method_12185() + 0.5,
                  var8.method_31796().method_1029() != class_9249.field_47215 ? 90.0F : 0.0F,
                  0.0F
               );
               var13.field_29605 = var8.method_31796().method_1029() != class_9249.field_47215 ? 90.0F : 0.0F;
               var13.method_21517();

               for (class_9359 var12 : var0.<class_9359>method_25868(class_9359.class, var13.method_37241().method_18898(50.0))) {
                  class_8807.field_45046.method_22685(var12, var13);
               }

               var0.method_7509(var13);

               for (int var16 = 0; var16 < var7.method_44984(); var16++) {
                  for (int var17 = 0; var17 < var7.method_44986(); var17++) {
                     var0.method_43369(var8.method_31795(var16, var17, 0).method_41966(), class_4783.field_23184);
                  }
               }
            }
         }
      }
   }

   public static boolean method_43349(World var0, class_1331 var1, class_6098 var2) {
      return var2.method_27960() == class_4897.field_24563 && var1.method_12165() >= 2 && var0.method_43370() != class_423.field_1790 && !var0.field_33055
         ? method_43350().method_44981(var0, var1) != null
         : false;
   }

   private static class_9741 method_43347() {
      if (field_47918 == null) {
         field_47918 = class_9224.method_42577()
            .method_42575("^^^", "###", "~#~")
            .method_42576('#', var0 -> var0.method_41968().method_8349(class_2351.field_11778))
            .method_42576('^', class_9115.method_41965(class_2263.method_10400(class_4783.field_23444).or(class_2263.method_10400(class_4783.field_23279))))
            .method_42576('~', class_9115.method_41965(class_2927.method_13381(class_5371.field_27403)))
            .method_42571();
      }

      return field_47918;
   }

   private static class_9741 method_43350() {
      if (field_47920 == null) {
         field_47920 = class_9224.method_42577()
            .method_42575("   ", "###", "~#~")
            .method_42576('#', var0 -> var0.method_41968().method_8349(class_2351.field_11778))
            .method_42576('~', class_9115.method_41965(class_2927.method_13381(class_5371.field_27403)))
            .method_42571();
      }

      return field_47920;
   }
}
