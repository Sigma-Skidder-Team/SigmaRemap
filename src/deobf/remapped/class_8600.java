package remapped;

import java.util.Random;

public class class_8600 extends class_8131 {
   private final String field_44044;
   private final class_6631 field_44042;
   private final class_9022 field_44043;

   public class_8600(class_5799 var1, String var2, class_1331 var3, class_6631 var4) {
      this(var1, var2, var3, var4, class_9022.field_46145);
   }

   public class_8600(class_5799 var1, String var2, class_1331 var3, class_6631 var4, class_9022 var5) {
      super(class_2746.field_13442, 0);
      this.field_44044 = var2;
      this.field_41648 = var3;
      this.field_44042 = var4;
      this.field_44043 = var5;
      this.method_39533(var1);
   }

   public class_8600(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13442, var2);
      this.field_44044 = var2.method_25965("Template");
      this.field_44042 = class_6631.valueOf(var2.method_25965("Rot"));
      this.field_44043 = class_9022.valueOf(var2.method_25965("Mi"));
      this.method_39533(var1);
   }

   private void method_39533(class_5799 var1) {
      class_6561 var4 = var1.method_26279(new Identifier("woodland_mansion/" + this.field_44044));
      class_8478 var5 = new class_8478().method_39045(true).method_39053(this.field_44042).method_39055(this.field_44043).method_39048(class_2010.field_10194);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_44044);
      var1.method_25941("Rot", this.field_41650.method_39056().name());
      var1.method_25941("Mi", this.field_41650.method_39054().name());
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
      if (var1.startsWith("Chest")) {
         class_6631 var8 = this.field_41650.method_39056();
         class_2522 var9 = class_4783.field_23471.method_29260();
         if ("ChestWest".equals(var1)) {
            var9 = var9.method_10308(class_6942.field_35692, var8.method_30489(Direction.field_809));
         } else if ("ChestEast".equals(var1)) {
            var9 = var9.method_10308(class_6942.field_35692, var8.method_30489(Direction.field_804));
         } else if ("ChestSouth".equals(var1)) {
            var9 = var9.method_10308(class_6942.field_35692, var8.method_30489(Direction.field_800));
         } else if ("ChestNorth".equals(var1)) {
            var9 = var9.method_10308(class_6942.field_35692, var8.method_30489(Direction.field_818));
         }

         this.method_32526(var3, var5, var4, var2, class_5931.field_30118, var9);
      } else {
         class_7637 var11;
         switch (var1) {
            case "Mage":
               var11 = class_6629.field_34296.method_30484(var3.method_7066());
               break;
            case "Warrior":
               var11 = class_6629.field_34255.method_30484(var3.method_7066());
               break;
            default:
               return;
         }

         var11.method_26883();
         var11.method_37253(var2, 0.0F, 0.0F);
         var11.method_26864(var3, var3.method_43368(var11.method_37075()), class_2417.field_12033, (class_8733)null, (class_5734)null);
         var3.method_7065(var11);
         var3.method_7513(var2, class_4783.field_23184.method_29260(), 2);
      }
   }
}
