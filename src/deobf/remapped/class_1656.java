package remapped;

public class class_1656 extends class_9513 {
   private static String[] field_8596;

   public class_1656(class_5542 var1, double var2) {
      super(var1, var2);
      this.field_8595 = var1;
   }

   @Override
   public void method_16796() {
      class_5542.method_25206((class_5542)this.field_48435);
      class_5542.method_25206((class_5542)this.field_48441);
      super.method_16796();
   }

   @Override
   public void method_43906() {
      class_6331 var3 = (class_6331)this.field_48439;
      class_5542 var4 = (class_5542)this.field_48435.method_8638(var3, this.field_48441);
      if (var4 != null) {
         class_9359 var5 = this.field_48435.method_24877();
         class_9359 var6 = this.field_48441.method_24877();
         class_9359 var7 = var5;
         if (var5 == null) {
            var7 = var6;
         } else {
            class_5542.method_25201(var4, var5.method_37328());
         }

         if (var6 != null && var5 != var6) {
            class_5542.method_25201(var4, var6.method_37328());
         }

         if (var7 != null) {
            var7.method_3209(class_6234.field_31883);
            class_8807.field_45072.method_5733(var7, this.field_48435, this.field_48441, var4);
         }

         this.field_48435.method_8635(6000);
         this.field_48441.method_8635(6000);
         this.field_48435.method_24876();
         this.field_48441.method_24876();
         var4.method_8635(-24000);
         var4.method_37144(this.field_48435.getPosX(), this.field_48435.method_37309(), this.field_48435.getPosZ(), 0.0F, 0.0F);
         var3.method_7065(var4);
         this.field_48439.method_29587(this.field_48435, (byte)18);
         if (this.field_48439.getGameRules().getBoolean(GameRules.field_1033)) {
            this.field_48439
               .method_7509(
                  new class_5614(
                     this.field_48439,
                     this.field_48435.getPosX(),
                     this.field_48435.method_37309(),
                     this.field_48435.getPosZ(),
                     this.field_48435.method_26594().nextInt(7) + 1
                  )
               );
         }
      }
   }
}
