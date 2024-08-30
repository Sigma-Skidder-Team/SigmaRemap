package mapped;

public class Class6630 implements Class6627 {
   private int field29164 = -1;
   private String field29165 = null;
   private Class290 field29166 = null;

   public Class6630(int var1, String var2, Class290 var3) {
      this.field29164 = var1;
      this.field29165 = var2;
      this.field29166 = var3;
   }

   @Override
   public int method20208() {
      return this.field29164;
   }

   public String method20211() {
      return this.field29165;
   }

   public Class290 method20212() {
      return this.field29166;
   }

   @Override
   public int method20207() {
      return this.field29166.getGlTextureId();
   }

   @Override
   public void method20203() {
      Class8535.method30367(this.field29166.getGlTextureId());
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.field29164 + ", path: " + this.field29165 + ", glTextureId: " + this.method20207();
   }
}
