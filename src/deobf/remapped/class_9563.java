package remapped;

public class class_9563 extends class_122 {
   private String[] field_48677;
   private int field_48676;

   public class_9563(
      class_7038 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, class_590 var9, String var10, class_3384 var11
   ) {
      super(var1, var2, var3, var4, var5, var6, NotificationIcons.altskin, var9, var10, var11);
      this.field_48677 = var7;
      this.field_48676 = var8;
      this.method_44212();
   }

   public class_9563(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, class_590 var9, String var10) {
      super(var1, var2, var3, var4, var5, var6, NotificationIcons.altskin, var9, var10);
      this.field_48677 = var7;
      this.field_48676 = var8;
      this.method_44212();
   }

   public class_9563(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8, class_590 var9) {
      super(var1, var2, var3, var4, var5, var6, NotificationIcons.altskin, var9);
      this.field_48677 = var7;
      this.field_48676 = var8;
      this.method_44212();
   }

   public class_9563(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String[] var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, NotificationIcons.altskin);
      this.field_48677 = var7;
      this.field_48676 = var8;
      this.method_44212();
   }

   private void method_44212() {
      if (this.field_48676 >= 0 && this.field_48676 < this.field_48677.length) {
         this.method_32144(class_5320.field_27152);
         this.method_32186(this.field_48677[this.field_48676]);
      } else {
         throw new RuntimeException("Invalid index for TypeButton");
      }
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_44210(this.method_44209() + 1);
      super.method_29506(var1, var2, var3);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
   }

   public int method_44209() {
      return this.field_48676;
   }

   public void method_44210(int var1) {
      this.method_44211(var1, true);
   }

   public void method_44211(int var1, boolean var2) {
      var1 %= this.field_48677.length;
      if (var1 != this.field_48676) {
         this.field_48676 = var1;
         this.method_32186(this.field_48677[var1]);
         if (var2) {
            this.method_8235();
         }
      }
   }

   public String[] method_44213() {
      return this.field_48677;
   }
}
