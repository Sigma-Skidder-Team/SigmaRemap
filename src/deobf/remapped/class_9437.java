package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_9437 extends Module {
   private class_1331 field_48181;
   private List<class_1331> field_48180;

   public class_9437() {
      super(class_5664.field_28718, "Nuker", "Destroys blocks around you");
      this.method_42010(new class_2748<Float>("Range", "Range value for nuker", 6.0F, Float.class, 2.0F, 10.0F, 1.0F));
      this.method_42010(new class_2826("Mode", "Mode", 0, "All", "One hit", "Bed", "Egg"));
      this.method_42010(new class_8563("NoSwing", "Removes the swing animation.", false));
      this.method_42010(new class_4589("Blocks", "Blocks to destroy", true));
      this.method_42010(new class_976("Color", "The rendered block color", class_1255.field_6920.field_6917, true));
   }

   @class_9148
   private void method_43656(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         this.field_48180 = this.method_43660(this.method_42002("Range") / 2.0F);
         if (this.field_48180.isEmpty()) {
            this.field_48181 = null;
         } else if (field_46692.field_9647.method_42158() != class_4666.field_22761) {
            if (this.field_48181 != null) {
               if (field_46692.field_9601.method_28262(this.field_48181).method_8345()
                  || Math.sqrt(
                        field_46692.field_9632
                           .method_37273(
                              (double)this.field_48181.method_12173() + 0.5,
                              (double)this.field_48181.method_12165() + 0.5,
                              (double)this.field_48181.method_12185() + 0.5
                           )
                     )
                     > 6.0) {
                  this.field_48181 = this.field_48180.get(0);
               }

               float[] var4 = class_7211.method_33006(
                  (double)this.field_48181.method_12173(), (double)this.field_48181.method_12185(), (double)this.field_48181.method_12165()
               );
               var1.method_6441(var4[0]);
               var1.method_6448(var4[1]);
               class_6435 var5 = new class_6435(0, false, this.field_48181);
               SigmaMainClass.method_3328().method_3302().method_7914(var5);
               field_46692.field_9647.method_42163(this.field_48181, class_7494.method_34113(this.field_48181));
               if (!this.method_42007("NoSwing")) {
                  field_46692.field_9632.method_26597(class_2584.field_12791);
               } else {
                  field_46692.method_8614().method_4813(new class_3195(class_2584.field_12791));
               }
            } else {
               this.field_48181 = this.field_48180.get(0);
               float[] var6 = class_7211.method_33006(
                  (double)this.field_48181.method_12173() + 0.5, (double)this.field_48181.method_12185(), (double)this.field_48181.method_12165() + 0.5
               );
               var1.method_6441(var6[0]);
               var1.method_6448(var6[1]);
               class_6435 var8 = new class_6435(0, false, this.field_48181);
               SigmaMainClass.method_3328().method_3302().method_7914(var8);
               field_46692.field_9647.method_42163(this.field_48181, class_7494.method_34113(this.field_48181));
               if (!this.method_42007("NoSwing")) {
                  field_46692.field_9632.method_26597(class_2584.field_12791);
               } else {
                  field_46692.method_8614().method_4813(new class_3195(class_2584.field_12791));
               }
            }
         } else {
            for (class_1331 var9 : this.field_48180) {
               field_46692.method_8614().method_4813(new class_1586(class_7500.field_38263, var9, class_7494.method_34113(var9)));
               if (!this.method_42007("NoSwing")) {
                  field_46692.field_9632.method_26597(class_2584.field_12791);
               } else {
                  field_46692.method_8614().method_4813(new class_3195(class_2584.field_12791));
               }
            }
         }
      }
   }

   @class_9148
   public void method_43659(class_3368 var1) {
      if (this.field_48181 != null && !field_46692.field_9601.method_28262(this.field_48181).method_8345()) {
         int var4 = class_314.method_1444(this.method_41993("Color"), 0.4F);
         GL11.glPushMatrix();
         GL11.glDisable(2929);
         double var5 = (double)this.field_48181.method_12173() - field_46692.gameRenderer.method_35949().method_41627().method_61();
         double var7 = (double)this.field_48181.method_12165() - field_46692.gameRenderer.method_35949().method_41627().method_60();
         double var9 = (double)this.field_48181.method_12185() - field_46692.gameRenderer.method_35949().method_41627().method_62();
         class_4092 var11 = field_46692.field_9601.method_28262(this.field_48181).method_8324(field_46692.field_9601, this.field_48181).method_19483();
         class_8194 var12 = new class_8194(
            var5 + var11.field_19941,
            var7 + var11.field_19937,
            var9 + var11.field_19938,
            var5 + var11.field_19940,
            var7 + var11.field_19939,
            var9 + var11.field_19942
         );
         class_73.method_83(var12, var4);
         GL11.glEnable(2929);
         GL11.glPopMatrix();
      }
   }

   public static void method_43657(class_1331 var0) {
      field_46692.method_8614().method_4813(new class_1586(class_7500.field_38263, var0, Direction.field_817));
      field_46692.method_8614().method_4813(new class_1586(class_7500.field_38258, var0, Direction.field_817));
      field_46692.field_9601.method_29594(var0, class_4783.field_23184.method_29260());
   }

   private boolean method_43658(class_1331 var1) {
      class_6414 var4 = field_46692.field_9601.method_28262(var1).method_8360();
      return field_46692.field_9601.method_28262(var1).method_8362().method_24497() || var4 instanceof class_2830;
   }

   private List<class_1331> method_43660(float var1) {
      ArrayList var4 = new ArrayList();

      for (float var5 = var1 + 2.0F; var5 >= -var1 + 1.0F; var5--) {
         for (float var6 = -var1; var6 <= var1; var6++) {
            for (float var7 = -var1; var7 <= var1; var7++) {
               class_1331 var8 = new class_1331(
                  field_46692.field_9632.method_37302() + (double)var6,
                  field_46692.field_9632.method_37309() + (double)var5,
                  field_46692.field_9632.method_37156() + (double)var7
               );
               if (!field_46692.field_9601.method_28262(var8).method_8345()
                  && field_46692.field_9601.method_28262(var8).method_8364().method_22001()
                  && Math.sqrt(
                        field_46692.field_9632
                           .method_37273((double)var8.method_12173() + 0.5, (double)var8.method_12165() + 0.5, (double)var8.method_12185() + 0.5)
                     )
                     < (double)var1) {
                  String var9 = this.method_42016("Mode");
                  switch (var9) {
                     case "One hit":
                        if (!this.method_43658(var8)) {
                           continue;
                        }
                        break;
                     case "Bed":
                        if (!(field_46692.field_9601.method_28262(var8).method_8360() instanceof class_3633)) {
                           continue;
                        }
                        break;
                     case "Egg":
                        if (!(field_46692.field_9601.method_28262(var8).method_8360() instanceof class_5730)) {
                           continue;
                        }
                  }

                  var4.add(var8);
               }
            }
         }
      }

      return var4;
   }
}
