package remapped;

public class class_5611 extends class_2255<class_3756> {
   public static final class_2843 field_28488 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/base"));
   public static final class_2843 field_28487 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/cage"));
   public static final class_2843 field_28480 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/wind"));
   public static final class_2843 field_28479 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/wind_vertical"));
   public static final class_2843 field_28482 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/open_eye"));
   public static final class_2843 field_28478 = new class_2843(class_8359.field_42824, new Identifier("entity/conduit/closed_eye"));
   private final class_1549 field_28481 = new class_1549(16, 16, 0, 0);
   private final class_1549 field_28483;
   private final class_1549 field_28486;
   private final class_1549 field_28484;

   public class_5611(class_3569 var1) {
      super(var1);
      this.field_28481.method_7049(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, 0.01F);
      this.field_28483 = new class_1549(64, 32, 0, 0);
      this.field_28483.method_7048(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      this.field_28486 = new class_1549(32, 16, 0, 0);
      this.field_28486.method_7048(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.field_28484 = new class_1549(32, 16, 0, 0);
      this.field_28484.method_7048(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
   }

   public void method_25467(class_3756 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      float var9 = (float)var1.field_18349 + var2;
      if (var1.method_17380()) {
         float var10 = var1.method_17376(var2) * (180.0F / (float)Math.PI);
         float var11 = class_9299.method_42818(var9 * 0.1F) / 2.0F + 0.5F;
         var11 = var11 * var11 + var11;
         var3.method_36063();
         var3.method_36065(0.5, (double)(0.3F + var11 * 0.2F), 0.5);
         class_2426 var12 = new class_2426(0.5F, 1.0F, 0.5F);
         var12.method_11066();
         var3.method_36060(new class_5422(var12, var10, true));
         this.field_28484.method_7060(var3, field_28487.method_12943(var4, class_3581::method_16755), var5, var6);
         var3.method_36064();
         int var13 = var1.field_18349 / 66 % 3;
         var3.method_36063();
         var3.method_36065(0.5, 0.5, 0.5);
         if (var13 != 1) {
            if (var13 == 2) {
               var3.method_36060(class_2426.field_12076.method_11074(90.0F));
            }
         } else {
            var3.method_36060(class_2426.field_12080.method_11074(90.0F));
         }

         class_7907 var14 = (var13 != 1 ? field_28480 : field_28479).method_12943(var4, class_3581::method_16755);
         this.field_28483.method_7060(var3, var14, var5, var6);
         var3.method_36064();
         var3.method_36063();
         var3.method_36065(0.5, 0.5, 0.5);
         var3.method_36062(0.875F, 0.875F, 0.875F);
         var3.method_36060(class_2426.field_12080.method_11074(180.0F));
         var3.method_36060(class_2426.field_12076.method_11074(180.0F));
         this.field_28483.method_7060(var3, var14, var5, var6);
         var3.method_36064();
         class_9071 var15 = this.field_11222.field_17463;
         var3.method_36063();
         var3.method_36065(0.5, (double)(0.3F + var11 * 0.2F), 0.5);
         var3.method_36062(0.5F, 0.5F, 0.5F);
         float var16 = -var15.method_41640();
         var3.method_36060(class_2426.field_12074.method_11074(var16));
         var3.method_36060(class_2426.field_12080.method_11074(var15.method_41638()));
         var3.method_36060(class_2426.field_12076.method_11074(180.0F));
         float var17 = 1.3333334F;
         var3.method_36062(1.3333334F, 1.3333334F, 1.3333334F);
         this.field_28481.method_7060(var3, (!var1.method_17375() ? field_28478 : field_28482).method_12943(var4, class_3581::method_16755), var5, var6);
         var3.method_36064();
      } else {
         float var18 = var1.method_17376(0.0F);
         class_7907 var20 = field_28488.method_12943(var4, class_3581::method_16734);
         var3.method_36063();
         var3.method_36065(0.5, 0.5, 0.5);
         var3.method_36060(class_2426.field_12074.method_11074(var18));
         this.field_28486.method_7060(var3, var20, var5, var6);
         var3.method_36064();
      }
   }
}
