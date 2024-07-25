package remapped;

public final class class_898 implements class_2007 {
   private static String[] field_4611;

   public class_898(class_5909 var1, float[] var2, float var3, float var4, class_8112 var5) {
      this.field_4614 = var1;
      this.field_4616 = var2;
      this.field_4615 = var3;
      this.field_4613 = var4;
      this.field_4612 = var5;
   }

   public float[] 괠蛊浣䩜綋ぶ(class_3316 var1, float var2, float var3) {
      this.field_4614.method_27016(var1, var2 - this.field_4616[0], var3 - this.field_4616[1]).method_40021();
      class_1440 var6 = this.field_4614.method_27015(var1, var2, var3);
      var2 += var6.field_7766;
      var3 += var6.field_7765;
      float var7 = var2 * this.field_4615;
      float var8 = var3 * this.field_4613;
      var7 = this.field_4612.method_36883() + this.field_4612.method_36862() * var7;
      var8 = this.field_4612.method_36859() + this.field_4612.method_36867() * var8;
      class_7669.method_34744().method_5924(var7, var8);
      return new float[]{var6.field_7766 + var2, var6.field_7765 + var3};
   }
}
