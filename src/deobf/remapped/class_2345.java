package remapped;

public class class_2345 implements class_8147 {
   private int field_11711 = -1;
   private Identifier field_11714;
   private int field_11708 = 0;
   private class_8143 field_11712;
   public static final int field_11710 = 0;
   public static final int field_11713 = 1;
   public static final int field_11707 = 2;

   public class_2345(int var1, Identifier var2, int var3) {
      this.field_11711 = var1;
      this.field_11714 = var2;
      this.field_11708 = var3;
   }

   public class_8143 method_10748() {
      if (this.field_11712 == null) {
         TextureManager var3 = MinecraftClient.getInstance().getTextureManager();
         this.field_11712 = var3.method_35679(this.field_11714);
         if (this.field_11712 == null) {
            this.field_11712 = new class_1809(this.field_11714);
            var3.method_35682(this.field_11714, this.field_11712);
            this.field_11712 = var3.method_35679(this.field_11714);
         }
      }

      return this.field_11712;
   }

   public int ಽ佉竁阢贞Ⱋ() {
      class_8143 var3 = this.method_10748();
      if (this.field_11708 != 0 && var3 instanceof class_8143) {
         class_9510 var4 = var3.field_41688;
         if (var4 != null) {
            if (this.field_11708 == 1) {
               return var4.field_48418;
            }

            if (this.field_11708 == 2) {
               return var4.field_48419;
            }
         }
      }

      return var3.method_37055();
   }

   public int 햠쇽醧쇽陬卫() {
      return this.field_11711;
   }

   public void 괠欫蛊浦室敤() {
   }

   @Override
   public String toString() {
      return "textureUnit: "
         + this.field_11711
         + ", location: "
         + this.field_11714
         + ", glTextureId: "
         + (this.field_11712 == null ? "" : this.field_11712.method_37055());
   }
}
