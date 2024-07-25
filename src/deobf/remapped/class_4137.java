package remapped;

import java.awt.Color;
import java.io.IOException;

public class class_4137 extends Module {
   public class_4895 field_20135 = new class_4895(1.0F, 1.0F);
   public float field_20136;
   public float field_20137 = 0.0F;
   public float field_20138 = 1.0F;
   public float field_20139 = 1.0F;
   public class_7030 field_20140 = new class_7030(201, 90);
   public int field_20134 = 0;

   public class_4137() {
      super(Category.RENDER, "DVD Simulator", "wtf");
      this.method_19211();
   }

   @Override
   public void onEnable() {
      this.field_20136 = (float)((double)(mcInstance.window.method_43166() - this.field_20140.field_36201) * Math.random());
      this.field_20137 = (float)((double)(mcInstance.window.method_43163() - this.field_20140.field_36203) * Math.random());
      this.method_19211();
   }

   @EventListen
   private void method_19210(class_3278 var1) throws IOException {
      if (this.method_42015() && mcInstance.field_9632 != null && mcInstance.field_9601 != null) {
         int var4 = mcInstance.window.method_43163();
         int var5 = mcInstance.window.method_43166();
         byte var6 = 2;
         if (!(this.field_20137 <= (float)var6)) {
            if (this.field_20137 + (float)this.field_20140.field_36203 > (float)var4) {
               this.field_20139 = -1.0F;
               this.method_19211();
            }
         } else {
            this.field_20139 = 1.0F;
            this.method_19211();
         }

         if (!(this.field_20136 <= (float)var6)) {
            if (this.field_20136 + (float)this.field_20140.field_36201 > (float)var5) {
               this.field_20138 = -1.0F;
               this.method_19211();
            }
         } else {
            this.field_20138 = 1.0F;
            this.method_19211();
         }

         this.field_20136 = this.field_20136 + this.field_20138 * (float)var6;
         this.field_20137 = this.field_20137 + this.field_20139 * (float)var6;
         class_73.method_99(
            this.field_20136,
            this.field_20137,
            (float)this.field_20140.field_36201,
            (float)this.field_20140.field_36203,
            NotificationIcons.field_11016,
            class_314.method_1444(this.field_20134, 0.8F)
         );
      }
   }

   private void method_19211() {
      this.field_20134 = Color.getHSBColor((float)Math.random(), 0.6F, 1.0F).getRGB();
   }
}
