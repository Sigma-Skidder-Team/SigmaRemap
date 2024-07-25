package remapped;

import org.lwjgl.opengl.GL11;

public class class_4113 extends class_7038 {
   public class_2440 field_20042 = new class_2440(370, 150, class_4043.field_19618);

   public class_4113(class_7038 var1, String var2, JSONObjectImpl var3) {
      super(var1, var2);
      this.method_32142(this.method_32167().method_32109());
      int var6 = 0;
      if (var3.method_5850("deprecated")) {
         GL11.glTexEnvi(8960, 8704, 260);
      }

      String var7 = var3.method_5861("title");
      JSONArray var8 = var3.method_5849("changes");
      this.method_32148(new class_1552(this, "title", 0, var6, 0, 0, class_590.field_3421, var7, class_5320.field_27147));
      var6 += 55;

      for (int var9 = 0; var9 < var8.method_6142(); var9++) {
         String var10 = " - " + var8.method_6133(var9);
         this.method_32148(
            new class_1552(
               this,
               "change" + var9,
               0,
               var6,
               0,
               0,
               new class_590(0, 0, 0, class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)),
               var10,
               class_5320.field_27152
            )
         );
         var6 += 22;
      }

      var6 += 75;
      this.method_32158(var6);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = class_5181.method_23766(this.field_20042.method_11123(), 0.17, 1.0, 0.51, 1.0);
      this.method_32124((int)((1.0F - var4) * 100.0F));
      this.method_32130();
      var1 *= this.field_20042.method_11123();
      super.method_32178(var1);
   }
}
