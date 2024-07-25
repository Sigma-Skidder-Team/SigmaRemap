package remapped;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class class_9877 extends class_9128 {
   public FileWriter field_49935;
   public int field_49934 = 1;
   public class_1343 field_49933;

   public class_9877() {
      super(class_5664.field_28711, "DebugSpeed", "");
   }

   @class_9148
   public void method_45511(class_5596 var1) {
      if (this.method_42015()) {
         class_1343 var4 = new class_1343(field_46692.field_9632.method_37302(), 0.0, field_46692.field_9632.method_37156());
         if (field_46692.field_9632.field_41726 && this.field_49933 != null) {
            double var5 = var4.method_6195(this.field_49933) / (double)this.field_49934;
            var5 *= (double)field_46692.field_9616.field_32603;
            boolean var7 = class_727.method_3328().method_3310().method_25293() > 1 && field_46692.field_9632.field_29600 == 0;
            double var8 = !var7 ? 0.312948 : 0.280616;
            double var10 = var5 / var8;
            BigDecimal var12 = new BigDecimal(var10);
            BigDecimal var13 = var12.setScale(4, RoundingMode.DOWN);
            float var14 = var13.floatValue();
            if ((double)var14 <= 9.0E-4) {
               var14 = 0.0F;
            }

            if (var14 == 0.0F) {
               return;
            }

            String var15 = Float.toString(var14);

            while (var15.length() < 6) {
               var15 = var15 + "0";
            }

            class_314.method_1443(
               class_727.method_3328().method_3325().method_22662() + "(" + var15 + "x faster " + (!var7 ? "jumping" : "walking") + ")  Speed: " + var5
            );
         }

         this.field_49934 = !field_46692.field_9632.field_41726 ? this.field_49934++ : 1;
         this.field_49933 = var4;
      }
   }
}
