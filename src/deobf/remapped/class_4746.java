package remapped;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import org.lwjgl.opengl.GL11;

public class class_4746 {
   private static class_1893 field_22998 = class_1893.method_8510();
   private static class_4067 field_22994;
   public static class_4230 field_22996;
   public static class_4230 field_23002;
   public static int field_22995 = field_22998.field_9596.field_20526;
   public static int field_22999 = field_22998.field_9596.field_20534;
   public static int field_23000 = 0;
   public static int field_23001 = 0;
   public static int field_22997 = 0;

   public void method_21923() {
      class_727.method_3328().method_3302().method_7908(this);
   }

   public static void method_21925(int var0, int var1, int var2, int var3) {
      field_22995 = Math.min(var0, field_22995);
      field_22999 = Math.min(var1, field_22999);
      field_23000 = Math.max(var0 + var2, field_23000);
      field_23001 = Math.max(var1 + var3, field_23001);
   }

   @class_9148
   public void method_21921(class_139 var1) {
      if (var1.method_557() instanceof class_5257) {
         class_314.method_1430();
      }
   }

   @class_9148
   @class_4249
   public void method_21927(class_3368 var1) {
      if (class_727.method_3328().method_3299().method_30987() && field_22995 < field_23000 && field_22999 < field_23001) {
         if (field_22996 == null) {
            try {
               field_22994 = new class_4067(field_22998.method_8577(), new class_4660(), field_22998.method_8584(), new class_4639("jelloblur"));
               field_22994.method_18750(field_22998.field_9596.field_20526, field_22998.field_9596.field_20534);
               field_22994.field_19813.get(0).method_33272().method_19853("Radius").method_32385(35.0F);
               field_22994.field_19813.get(1).method_33272().method_19853("Radius").method_32385(35.0F);
               field_22996 = field_22994.method_18759("jello");
               field_23002 = field_22994.method_18759("jelloswap");
            } catch (IOException | JsonSyntaxException var5) {
               var5.printStackTrace();
            }
         }

         if (field_22996.field_20534 != field_22998.field_9596.field_20534 || field_22996.field_20526 != field_22998.field_9596.field_20526) {
            field_22994.method_18750(field_22998.field_9596.field_20526, field_22998.field_9596.field_20534);
         }

         class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
         class_3542.method_16488();
         GL11.glDisable(2929);
         GL11.glDisable(3008);
         class_3542.method_16448();
         field_22996.method_19712(true);
         field_23002.method_19712(true);
         class_3542.method_16402(256, class_1893.field_9574);
         class_3542.method_16463(5889);
         class_3542.method_16476();
         class_3542.method_16376(
            0.0,
            (double)field_22998.field_9602.method_43178() / field_22998.field_9602.method_43189(),
            (double)field_22998.field_9602.method_43198() / field_22998.field_9602.method_43189(),
            0.0,
            1000.0,
            3000.0
         );
         class_3542.method_16463(5888);
         class_3542.method_16476();
         class_3542.method_16413(0.0F, 0.0F, -2000.0F);
         GL11.glScaled(
            1.0 / field_22998.field_9602.method_43189() * (double)class_6763.field_34898,
            1.0 / field_22998.field_9602.method_43189() * (double)class_6763.field_34898,
            1.0
         );
         byte var4 = 35;
         class_73.method_149(field_22995, field_22999 - var4, field_23000, field_23001 + var4);
         field_22994.method_18755(field_22998.field_9616.field_32600);
         class_73.method_141();
         GL11.glEnable(3008);
         field_22996.method_19717(true);
         field_22998.field_9596.method_19717(true);
      }

      field_22995 = field_22998.field_9596.field_20526;
      field_22999 = field_22998.field_9596.field_20534;
      field_23000 = 0;
      field_23001 = 0;
   }

   public static void method_21924() {
      if (field_22996 != null) {
         GL11.glPushMatrix();
         field_22996.method_19715();
         field_22996.method_19713(field_22998.field_9596.field_20526, field_22998.field_9596.field_20534);
         GL11.glPopMatrix();
         class_3542.method_16402(256, class_1893.field_9574);
         class_3542.method_16463(5889);
         class_3542.method_16476();
         class_3542.method_16376(
            0.0,
            (double)field_22998.field_9602.method_43178() / field_22998.field_9602.method_43189(),
            (double)field_22998.field_9602.method_43198() / field_22998.field_9602.method_43189(),
            0.0,
            1000.0,
            3000.0
         );
         class_3542.method_16463(5888);
         class_3542.method_16476();
         class_3542.method_16413(0.0F, 0.0F, -2000.0F);
         GL11.glScaled(
            1.0 / field_22998.field_9602.method_43189() * (double)class_6763.field_34898,
            1.0 / field_22998.field_9602.method_43189() * (double)class_6763.field_34898,
            1.0
         );
         field_22998.field_9596.method_19717(true);
      }
   }
}
