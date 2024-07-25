package remapped;

import java.util.List;

public class class_9574 extends class_2875 {
   private static String[] field_48704;
   private final World field_48707;
   private class_667 field_48705;
   private final List<class_667> field_48706;

   public class_9574(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_9574(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20258, var1, var2, var3);
      this.field_48707 = var2.field_36409.field_41768;
      this.field_48706 = this.field_48707.method_29549().<class_6867, class_667>method_23137(class_1510.field_7998);
   }

   @Override
   public boolean method_13212(class_2522 var1) {
      return var1.method_8350(class_4783.field_23646);
   }

   @Override
   public boolean method_13210(class_704 var1, boolean var2) {
      return this.field_48705 != null && this.field_48705.method_41052(this.field_14085, this.field_48707);
   }

   @Override
   public ItemStack method_13209(class_704 var1, ItemStack var2) {
      var2.method_27964(var1.field_41768, var1, var2.method_27997());
      this.field_14087.method_41424(var1);
      this.method_44242(0);
      this.method_44242(1);
      this.field_14086.method_42533((var0, var1x) -> var0.method_43364(1044, var1x, 0));
      return var2;
   }

   private void method_44242(int var1) {
      ItemStack var4 = this.field_14085.method_31498(var1);
      var4.method_27970(1);
      this.field_14085.method_31503(var1, var4);
   }

   @Override
   public void method_13213() {
      List var3 = this.field_48707.method_29549().<class_6867, class_667>method_23143(class_1510.field_7998, this.field_14085, this.field_48707);
      if (!var3.isEmpty()) {
         this.field_48705 = (class_667)var3.get(0);
         ItemStack var4 = this.field_48705.method_41042(this.field_14085);
         this.field_14087.method_41427(this.field_48705);
         this.field_14087.method_31503(0, var4);
      } else {
         this.field_14087.method_31503(0, ItemStack.EMPTY);
      }
   }

   @Override
   public boolean method_13211(ItemStack var1) {
      return this.field_48706.stream().anyMatch(var1x -> var1x.method_3043(var1));
   }

   @Override
   public boolean method_18873(ItemStack var1, class_7934 var2) {
      return var2.field_40591 != this.field_14087 && super.method_18873(var1, var2);
   }
}
