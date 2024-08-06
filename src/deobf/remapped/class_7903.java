package remapped;

public class class_7903 extends class_1859 {
   public class_3004 field_40418;

   public class_7903(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, "", false);
      this.field_36258 = class_5320.field_27152;
      this.method_32148(this.field_40418 = new class_3004(this, "chat", 14, 0, var5 - 28, var6, class_3004.field_14738, "", "Chat..."));
      this.field_40418.method_13724(false);
      this.field_40418.method_32144(class_5320.field_27152);
      this.field_40418.method_32177(true);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32130();
      FontManager.method_120(this.field_36270, this.field_36261, this.field_36278, this.field_36257, class_314.method_1444(class_1255.field_6918.field_6917, var1));
      super.method_32178(var1);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 257) {
         ((class_6356)this.method_32167()).method_29128(this.field_40418.method_32165());
         SigmaMainClass.getInstance().getAccountManager().sigmaIRC.method_20856("SF4FSERFERF", this.field_40418.method_32165());
         this.field_40418.method_32186("");
         this.field_40418.method_32177(true);
      }
   }
}
