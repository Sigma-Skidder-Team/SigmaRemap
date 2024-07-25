package remapped;

public class class_262 implements class_2995 {
   private static String[] field_922;
   private final class_1893 field_921;

   public class_262(class_1893 var1) {
      this.field_921 = var1;
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      class_6486 var11 = this.field_921.field_9632.field_41768;
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16484(2.0F);
      class_3542.method_16354();
      class_3542.method_16387(false);
      class_1331 var12 = new class_1331(var3, var5, var7);

      for (class_1331 var14 : class_1331.method_6076(var12.method_6104(-6, -6, -6), var12.method_6104(6, 6, 6))) {
         class_2522 var15 = var11.method_28262(var14);
         if (!var15.method_8350(class_4783.field_23184)) {
            class_4190 var16 = var15.method_8334(var11, var14);

            for (class_4092 var18 : var16.method_19492()) {
               class_4092 var19 = var18.method_18919(var14).method_18898(0.002).method_18918(-var3, -var5, -var7);
               double var20 = var19.field_19941;
               double var22 = var19.field_19937;
               double var24 = var19.field_19938;
               double var26 = var19.field_19940;
               double var28 = var19.field_19939;
               double var30 = var19.field_19942;
               float var32 = 1.0F;
               float var33 = 0.0F;
               float var34 = 0.0F;
               float var35 = 0.5F;
               if (var15.method_8308(var11, var14, class_240.field_809)) {
                  class_8042 var36 = class_8042.method_36499();
                  class_9633 var37 = var36.method_36501();
                  var37.method_44471(5, class_7985.field_40903);
                  var37.method_35761(var20, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var37.method_35761(var20, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var37.method_35761(var20, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var37.method_35761(var20, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var36.method_36500();
               }

               if (var15.method_8308(var11, var14, class_240.field_800)) {
                  class_8042 var38 = class_8042.method_36499();
                  class_9633 var43 = var38.method_36501();
                  var43.method_44471(5, class_7985.field_40903);
                  var43.method_35761(var20, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var43.method_35761(var20, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var43.method_35761(var26, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var43.method_35761(var26, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var38.method_36500();
               }

               if (var15.method_8308(var11, var14, class_240.field_804)) {
                  class_8042 var39 = class_8042.method_36499();
                  class_9633 var44 = var39.method_36501();
                  var44.method_44471(5, class_7985.field_40903);
                  var44.method_35761(var26, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var44.method_35761(var26, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var44.method_35761(var26, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var44.method_35761(var26, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var39.method_36500();
               }

               if (var15.method_8308(var11, var14, class_240.field_818)) {
                  class_8042 var40 = class_8042.method_36499();
                  class_9633 var45 = var40.method_36501();
                  var45.method_44471(5, class_7985.field_40903);
                  var45.method_35761(var26, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var45.method_35761(var26, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var45.method_35761(var20, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var45.method_35761(var20, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var40.method_36500();
               }

               if (var15.method_8308(var11, var14, class_240.field_802)) {
                  class_8042 var41 = class_8042.method_36499();
                  class_9633 var46 = var41.method_36501();
                  var46.method_44471(5, class_7985.field_40903);
                  var46.method_35761(var20, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var46.method_35761(var26, var22, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var46.method_35761(var20, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var46.method_35761(var26, var22, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var41.method_36500();
               }

               if (var15.method_8308(var11, var14, class_240.field_817)) {
                  class_8042 var42 = class_8042.method_36499();
                  class_9633 var47 = var42.method_36501();
                  var47.method_44471(5, class_7985.field_40903);
                  var47.method_35761(var20, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var47.method_35761(var20, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var47.method_35761(var26, var28, var24).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var47.method_35761(var26, var28, var30).method_35742(1.0F, 0.0F, 0.0F, 0.5F).method_35735();
                  var42.method_36500();
               }
            }
         }
      }

      class_3542.method_16387(true);
      class_3542.method_16432();
      class_3542.method_16448();
   }
}
