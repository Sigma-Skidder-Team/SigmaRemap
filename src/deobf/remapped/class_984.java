package remapped;

public class class_984 implements class_8147 {
   private int field_5012 = -1;
   private String field_5014 = null;
   private class_8143 field_5013 = null;

   public class_984(int var1, String var2, class_8143 var3) {
      this.field_5012 = var1;
      this.field_5014 = var2;
      this.field_5013 = var3;
   }

   public int 햠쇽醧쇽陬卫() {
      return this.field_5012;
   }

   public String method_4291() {
      return this.field_5014;
   }

   public class_8143 method_4290() {
      return this.field_5013;
   }

   public int ಽ佉竁阢贞Ⱋ() {
      return this.field_5013.method_37055();
   }

   public void 괠欫蛊浦室敤() {
      class_4970.method_22838(this.field_5013.method_37055());
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.field_5012 + ", path: " + this.field_5014 + ", glTextureId: " + this.ಽ佉竁阢贞Ⱋ();
   }
}
