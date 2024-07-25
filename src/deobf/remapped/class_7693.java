package remapped;

import java.util.ArrayList;
import java.util.Iterator;

public class class_7693 extends class_9128 {
   public int field_39065 = 10;
   public int field_39066 = 260;
   public ArrayList<class_3074> field_39064 = new ArrayList<class_3074>();

   public class_7693() {
      super(class_5664.field_28708, "KeyStrokes", "Shows what keybind you are pressing");
      this.method_42011(false);
   }

   public class_6849 method_34853(int var1) {
      if (var1 != field_46692.field_9577.field_45504.field_30027.field_17800) {
         if (var1 != field_46692.field_9577.field_45411.field_30027.field_17800) {
            if (var1 != field_46692.field_9577.field_45416.field_30027.field_17800) {
               if (var1 != field_46692.field_9577.field_45434.field_30027.field_17800) {
                  if (var1 != field_46692.field_9577.field_45530.field_30027.field_17800) {
                     return var1 != field_46692.field_9577.field_45559.field_30027.field_17800 ? null : class_6849.field_35322;
                  } else {
                     return class_6849.field_35323;
                  }
               } else {
                  return class_6849.field_35321;
               }
            } else {
               return class_6849.field_35324;
            }
         } else {
            return class_6849.field_35316;
         }
      } else {
         return class_6849.field_35314;
      }
   }

   @class_9148
   private void method_34855(class_3278 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (!MinecraftClient.method_8510().field_9577.field_45470) {
            if (!MinecraftClient.method_8510().field_9577.field_45567) {
               this.field_39066 = var1.method_14966();
               if (SigmaMainClass.method_3328().method_3299().method_30987()) {
                  for (class_6849 var7 : class_6849.values()) {
                     class_7737 var8 = var7.method_31422();
                     class_7737 var9 = var7.method_31423();
                     class_73.method_149(
                        this.field_39065 + var8.field_39233,
                        this.field_39066 + var8.field_39236,
                        this.field_39065 + var8.field_39233 + var9.field_39233,
                        this.field_39066 + var8.field_39236 + var9.field_39236
                     );
                     class_4746.method_21925(this.field_39065 + var8.field_39233, this.field_39066 + var8.field_39236, var9.field_39233, var9.field_39236);
                     class_4746.method_21924();
                     class_73.method_141();
                  }
               }

               for (class_6849 var19 : class_6849.values()) {
                  class_7737 var21 = var19.method_31422();
                  class_7737 var23 = var19.method_31423();
                  float var10 = 1.0F;
                  float var11 = 1.0F;
                  if (SigmaMainClass.method_3328().method_3299().method_30987()) {
                     var11 = 0.5F;
                     var10 = 0.5F;
                  }

                  String var12 = class_314.method_1451(var19.field_35319.field_30027.field_17800);
                  if (var19.field_35319 != field_46692.field_9577.field_45530) {
                     if (var19.field_35319 == field_46692.field_9577.field_45559) {
                        var12 = "R";
                     }
                  } else {
                     var12 = "L";
                  }

                  class_73.method_94(
                     (float)(this.field_39065 + var21.field_39233),
                     (float)(this.field_39066 + var21.field_39236),
                     (float)(this.field_39065 + var21.field_39233 + var23.field_39233),
                     (float)(this.field_39066 + var21.field_39236 + var23.field_39236),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.5F * var10)
                  );
                  class_73.method_128(
                     (float)(this.field_39065 + var21.field_39233),
                     (float)(this.field_39066 + var21.field_39236),
                     (float)var23.field_39233,
                     (float)var23.field_39236,
                     10.0F,
                     0.75F * var11
                  );
                  class_73.method_87(
                     class_5320.field_27139,
                     (float)(this.field_39065 + var21.field_39233 + (var23.field_39233 - class_5320.field_27139.method_18547(var12)) / 2),
                     (float)(this.field_39066 + var21.field_39236 + 12),
                     var12,
                     class_1255.field_6918.field_6917
                  );
               }

               Iterator var14 = this.field_39064.iterator();

               while (var14.hasNext()) {
                  class_3074 var16 = (class_3074)var14.next();
                  class_6849 var18 = var16.field_15113;
                  class_7737 var20 = var18.method_31422();
                  class_7737 var22 = var18.method_31423();
                  class_73.method_149(
                     this.field_39065 + var20.field_39233,
                     this.field_39066 + var20.field_39236,
                     this.field_39065 + var20.field_39233 + var22.field_39233,
                     this.field_39066 + var20.field_39236 + var22.field_39236
                  );
                  float var24 = 0.7F;
                  int var25 = 0;

                  for (class_3074 var28 : this.field_39064) {
                     if (var28.field_15113.equals(var18)) {
                        var25++;
                     }
                  }

                  if (var18.method_31425().method_27060() && var16.field_15112.method_11123() >= var24 && var25 < 2) {
                     var16.field_15112.method_11122(var24);
                  }

                  float var27 = var16.field_15112.method_11123();
                  int var29 = class_314.method_1444(-5658199, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                  if (SigmaMainClass.method_3328().method_3299().method_30987()) {
                     var29 = class_314.method_1444(-1, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                  }

                  class_73.method_124(
                     (float)(this.field_39065 + var20.field_39233 + var22.method_35028() / 2),
                     (float)(this.field_39066 + var20.field_39236 + var22.field_39236 / 2),
                     (float)(var22.method_35028() - 4) * var27 + 4.0F,
                     var29
                  );
                  class_73.method_141();
                  if (var16.field_15112.method_11123() == 1.0F) {
                     var14.remove();
                  }
               }

               var1.method_14968(160);
            }
         }
      }
   }

   @class_9148
   private void method_34861(class_6435 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (this.method_34853(var1.method_29384()) != null && !var1.method_29385()) {
            this.field_39064.add(new class_3074(this, this.method_34853(var1.method_29384())));
         }
      }
   }

   @class_9148
   private void method_34850(class_8706 var1) {
      if (!this.method_42015() || field_46692.field_9632 == null) {
         ;
      }
   }
}
