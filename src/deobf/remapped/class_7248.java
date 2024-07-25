package remapped;

public class class_7248 extends class_3200<class_1267> {
   private static String[] field_37158;

   public class_7248(class_5390<class_1267> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method_33144(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, class_1267 var7) {
      class_4168 var10 = new class_4168();
      class_3487 var11;
      if (var7.field_6971 != class_6593.field_34013) {
         if (var7.field_6971 != class_6593.field_34023) {
            if (var7.field_6971 != class_6593.field_34015) {
               if (var7.field_6971 != class_6593.field_34018) {
                  if (var7.field_6971 != class_6593.field_34020) {
                     if (var7.field_6971 != class_6593.field_34016) {
                        boolean var12 = this.field_15989.nextFloat() < 0.5F;
                        var11 = !var12 ? class_3487.field_17125 : class_3487.field_17126;
                        var10.field_20274 = var12 || this.field_15989.nextFloat() < 0.5F;
                     } else {
                        var11 = class_3487.field_17121;
                        var10.field_20274 = this.field_15989.nextFloat() < 0.5F;
                        var10.field_20271 = 0.0F;
                        var10.field_20273 = true;
                     }
                  } else {
                     var11 = class_3487.field_17119;
                     var10.field_20274 = false;
                     var10.field_20271 = 0.8F;
                  }
               } else {
                  boolean var25 = this.field_15989.nextFloat() < 0.5F;
                  var11 = !var25 ? class_3487.field_17125 : class_3487.field_17124;
                  var10.field_20274 = var25 || this.field_15989.nextFloat() < 0.5F;
               }
            } else {
               var11 = class_3487.field_17119;
               var10.field_20274 = false;
               var10.field_20271 = 0.5F;
               var10.field_20276 = true;
            }
         } else {
            var11 = class_3487.field_17125;
            var10.field_20274 = this.field_15989.nextFloat() < 0.5F;
            var10.field_20271 = 0.8F;
            var10.field_20277 = true;
            var10.field_20276 = true;
         }
      } else {
         var11 = class_3487.field_17123;
         var10.field_20274 = false;
         var10.field_20271 = 0.0F;
      }

      class_4639 var26;
      if (!(this.field_15989.nextFloat() < 0.05F)) {
         var26 = new class_4639(class_4721.method_21826()[this.field_15989.nextInt(class_4721.method_21826().length)]);
      } else {
         var26 = new class_4639(class_4721.method_21825()[this.field_15989.nextInt(class_4721.method_21825().length)]);
      }

      class_6561 var13 = var3.method_26279(var26);
      class_6631 var14 = Util.<class_6631>method_44697(class_6631.values(), this.field_15989);
      class_9022 var15 = !(this.field_15989.nextFloat() < 0.5F) ? class_9022.field_46144 : class_9022.field_46145;
      class_1331 var16 = new class_1331(var13.method_29975().method_12173() / 2, 0, var13.method_29975().method_12185() / 2);
      class_1331 var17 = new class_2034(var4, var5).method_9546();
      class_9616 var18 = var13.method_29973(var17, var14, var16, var15);
      class_2700 var19 = var18.method_44396();
      int var20 = var19.method_12173();
      int var21 = var19.method_12185();
      int var22 = var2.method_29830(var20, var21, class_1598.method_7169(var11)) - 1;
      int var23 = class_4721.method_21832(this.field_15989, var2, var11, var10.field_20274, var22, var18.method_44398(), var18);
      class_1331 var24 = new class_1331(var17.method_12173(), var23, var17.method_12185());
      if (var7.field_6971 == class_6593.field_34018 || var7.field_6971 == class_6593.field_34020 || var7.field_6971 == class_6593.field_34019) {
         var10.field_20278 = class_4721.method_21828(var24, var6);
      }

      this.field_15986.add(new class_1598(var24, var11, var10, var26, var13, var14, var15, var16));
      this.method_14720();
   }
}
