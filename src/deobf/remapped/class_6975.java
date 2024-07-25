package remapped;

public class class_6975 extends class_953 {
   private static String[] field_35838;

   public class_6975(class_535 var1) {
      super(var1);
      this.field_35839 = var1;
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      class_7984 var5 = (class_7984)var1;
      class_8473 var6 = var5.method_10282().iterator().next();
      class_1621 var7 = var6.method_38999();
      if (!(var7 instanceof class_7984)) {
         this.field_35839.method_2620(var2, class_535.method_2617(this.field_35839, (class_1596)var7));
      } else {
         var7.method_7226((Class<? extends Object>)var2.getClass());
         this.method_4197((class_7984)var7, var2);
      }
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_8437 var4;
      if (!(var1 instanceof class_7984)) {
         var4 = (class_8437)var1;
      } else {
         class_7984 var5 = (class_7984)var1;
         class_8473 var6 = var5.method_10282().iterator().next();
         var1.method_7229(true);
         var4 = (class_8437)var6.method_38998();
      }

      class_6223 var7 = this.field_35839.method_2616(var4.method_38816());
      return var7 != null ? this.field_35839.method_2619(var4, var7) : class_535.method_2622(this.field_35839, var4);
   }
}
