package remapped;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_6409 extends class_1859 {
   public int field_32707;
   public List<class_1364> field_32706 = new ArrayList<class_1364>();
   public int field_32708 = 0;
   public boolean field_32710 = true;
   private class_8343 field_32709;

   public class_6409(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_36267 && this.field_32708 <= 0) {
         if (var2 >= this.method_32093() + this.method_32137() / 2) {
            ((class_993)this.field_36283).method_4323(false);
            this.field_32706.add(new class_1364(this, false));
         } else {
            ((class_993)this.field_36283).method_4323(true);
            this.field_32706.add(new class_1364(this, true));
         }

         if (this.field_32708 != 0) {
            this.field_32708 = 14;
         } else {
            this.field_32708 = 3;
         }
      }

      this.field_32708--;
      if (!this.field_36267) {
         this.field_32708 = -1;
      }
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field_32709 != null) {
            class_727.method_3328().method_3329(this.field_32709);
         }
      } finally {
         super.finalize();
      }
   }

   @Override
   public void method_32178(float var1) {
      Iterator var4 = this.field_32706.iterator();
      byte var5 = 8;

      try {
         if (this.field_32710) {
            BufferedImage var6 = class_7849.method_35509(this.method_32155(), this.method_32093(), this.field_36278, this.field_36257, 3, 10, true);
            this.field_32707 = class_314.method_1389(new Color(var6.getRGB(6, 7)), new Color(var6.getRGB(6, 22))).getRGB();
            this.field_32707 = class_314.method_1401(this.field_32707, 0.25F);
            if (this.field_32709 != null) {
               this.field_32709.method_38413();
            }

            this.field_32709 = class_6568.method_30015("blur", var6);
            this.field_32710 = false;
         }

         if (this.field_32709 != null) {
            class_73.method_128(
               (float)(this.field_36270 + var5),
               (float)(this.field_36261 + var5),
               (float)(this.field_36278 - var5 * 2),
               (float)(this.field_36257 - var5 * 2),
               20.0F,
               var1 * 0.5F
            );
            class_73.method_128(
               (float)(this.field_36270 + var5),
               (float)(this.field_36261 + var5),
               (float)(this.field_36278 - var5 * 2),
               (float)(this.field_36257 - var5 * 2),
               14.0F,
               var1
            );
            GL11.glPushMatrix();
            class_73.method_107();
            class_73.method_139(
               (float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, 8.0F, class_1255.field_6918.field_6917
            );
            class_73.method_85(class_3118.field_15505);
            class_73.method_153(
               (float)(this.field_36270 - 1),
               (float)(this.field_36261 - 1),
               (float)(this.field_36278 + 2),
               (float)(this.field_36257 + 2),
               this.field_32709,
               class_1255.field_6918.field_6917
            );

            while (var4.hasNext()) {
               class_1364 var11 = (class_1364)var4.next();
               int var7 = this.field_36257 / 2;
               int var8 = this.field_36261 + (var11.field_7417 ? 0 : var7);
               int var9 = this.field_36278 / 2;
               class_73.method_150(this.field_36270, var8, this.field_36270 + this.field_36278, var8 + var7, true);
               class_73.method_124(
                  (float)(this.field_36270 + var9),
                  (float)(var8 + this.field_36257 / 4),
                  (float)(var9 * 2 - 4) * var11.field_7415 + 4.0F,
                  class_314.method_1444(class_1255.field_6918.field_6917, (1.0F - var11.field_7415 * (0.5F + var11.field_7415 * 0.5F)) * 0.4F)
               );
               class_73.method_141();
               var11.field_7415 = Math.min(var11.field_7415 + 3.0F / (float)class_1893.method_8501(), 1.0F);
               if (var11.field_7415 == 1.0F) {
                  var4.remove();
               }
            }

            class_73.method_145();
            class_73.method_108(
               (float)this.field_36270,
               (float)this.field_36261,
               (float)this.field_36278,
               (float)this.field_36257,
               6.0F,
               class_314.method_1444(class_1255.field_6929.field_6917, 0.3F)
            );
            GL11.glPopMatrix();
            class_73.method_87(
               class_5320.field_27161,
               (float)(this.field_36270 + 14),
               (float)(this.field_36261 + 8),
               "+",
               class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)
            );
            class_73.method_103(
               (float)(this.field_36270 + 16), (float)(this.field_36261 + 65), 8.0F, 2.0F, class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)
            );
         }
      } catch (IOException var10) {
      }

      super.method_32178(var1);
   }
}
