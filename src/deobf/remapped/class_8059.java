package remapped;

public class class_8059 extends class_1859 {
   private static String[] field_41257;
   public class_1742 field_41256;

   public class_8059(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class_8059(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7, class_1742 var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field_41256 = var8;
   }

   public class_8059(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, boolean var8, class_1742 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_41256 = var9;
   }

   public class_8059(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, boolean var9, class_1742 var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field_41256 = var10;
   }

   public class_8059(
      class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9, boolean var10, class_1742 var11
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.field_41256 = var11;
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_41256.method_7771();
   }

   @Override
   public void method_32178(float var1) {
      this.method_36563().method_7766(this.method_32132(), this.method_32173(), this.method_32109(), this.method_32137(), var1);
      super.method_32178(var1);
   }

   public class_1742 method_36563() {
      return this.field_41256;
   }

   public void method_36562(class_1742 var1) {
      this.field_41256 = var1;
   }
}
