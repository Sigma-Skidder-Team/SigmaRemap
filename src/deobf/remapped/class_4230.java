package remapped;

import java.nio.IntBuffer;

public class class_4230 {
   public int field_20533;
   public int field_20535;
   public int field_20526;
   public int field_20534;
   public final boolean field_20530;
   public int field_20527;
   private int field_20525;
   public int field_20532;
   public final float[] field_20528;
   public int field_20529;

   public class_4230(int var1, int var2, boolean var3, boolean var4) {
      class_3542.method_16431(class_3542::method_16440);
      this.field_20530 = var3;
      this.field_20527 = -1;
      this.field_20525 = -1;
      this.field_20532 = -1;
      this.field_20528 = new float[4];
      this.field_20528[0] = 1.0F;
      this.field_20528[1] = 1.0F;
      this.field_20528[2] = 1.0F;
      this.field_20528[3] = 0.0F;
      this.method_19708(var1, var2, var4);
   }

   public void method_19708(int var1, int var2, boolean var3) {
      if (class_3542.method_16366()) {
         this.method_19721(var1, var2, var3);
      } else {
         class_3542.method_16474(() -> this.method_19721(var1, var2, var3));
      }
   }

   private void method_19721(int var1, int var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16440);
      class_1920.method_8745();
      if (this.field_20527 >= 0) {
         this.method_19722();
      }

      this.method_19716(var1, var2, var3);
      class_1920.method_8893(class_6024.field_30769, 0);
   }

   public void method_19722() {
      class_3542.method_16431(class_3542::method_16440);
      this.method_19719();
      this.method_19723();
      if (this.field_20532 > -1) {
         class_4970.method_22838(this.field_20532);
         this.field_20532 = -1;
      }

      if (this.field_20525 > -1) {
         class_4970.method_22838(this.field_20525);
         this.field_20525 = -1;
      }

      if (this.field_20527 > -1) {
         class_1920.method_8893(class_6024.field_30769, 0);
         class_1920.method_8857(this.field_20527);
         this.field_20527 = -1;
      }
   }

   public void method_19710(class_4230 var1) {
      class_3542.method_16431(class_3542::method_16440);
      if (!class_1920.method_8795()) {
         class_1920.method_8893(class_6024.field_30769, this.field_20527);
         int var4 = class_1920.method_8748();
         if (var4 != 0) {
            int var5 = class_1920.method_8910();
            class_1920.method_8791(var4);
            class_1920.method_8893(class_6024.field_30769, var1.field_20527);
            class_1920.method_8874(3553, 0, 0, 0, 0, 0, Math.min(this.field_20533, var1.field_20533), Math.min(this.field_20535, var1.field_20535));
            class_1920.method_8791(var5);
         }
      } else {
         class_1920.method_8893(36008, var1.field_20527);
         class_1920.method_8893(36009, this.field_20527);
         class_1920.method_8835(0, 0, var1.field_20533, var1.field_20535, 0, 0, this.field_20533, this.field_20535, 256, 9728);
      }

      class_1920.method_8893(class_6024.field_30769, 0);
   }

   public void method_19716(int var1, int var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16440);
      this.field_20526 = var1;
      this.field_20534 = var2;
      this.field_20533 = var1;
      this.field_20535 = var2;
      this.field_20527 = class_1920.method_8828();
      this.field_20525 = class_4970.method_22837();
      if (this.field_20530) {
         this.field_20532 = class_4970.method_22837();
         class_1920.method_8791(this.field_20532);
         class_1920.method_8879(3553, 10241, 9728);
         class_1920.method_8879(3553, 10240, 9728);
         class_1920.method_8879(3553, 10242, 10496);
         class_1920.method_8879(3553, 10243, 10496);
         class_1920.method_8879(3553, 34892, 0);
         class_1920.method_8886(3553, 0, 6402, this.field_20533, this.field_20535, 0, 6402, 5126, (IntBuffer)null);
      }

      this.method_19725(9728);
      class_1920.method_8791(this.field_20525);
      class_1920.method_8886(3553, 0, 32856, this.field_20533, this.field_20535, 0, 6408, 5121, (IntBuffer)null);
      class_1920.method_8893(class_6024.field_30769, this.field_20527);
      class_1920.method_8747(class_6024.field_30769, class_6024.field_30770, 3553, this.field_20525, 0);
      if (this.field_20530) {
         class_1920.method_8747(class_6024.field_30769, class_6024.field_30765, 3553, this.field_20532, 0);
      }

      this.method_19718();
      this.method_19712(var3);
      this.method_19719();
   }

   public void method_19725(int var1) {
      class_3542.method_16431(class_3542::method_16440);
      this.field_20529 = var1;
      class_1920.method_8791(this.field_20525);
      class_1920.method_8879(3553, 10241, var1);
      class_1920.method_8879(3553, 10240, var1);
      class_1920.method_8879(3553, 10242, 10496);
      class_1920.method_8879(3553, 10243, 10496);
      class_1920.method_8791(0);
   }

   public void method_19718() {
      class_3542.method_16431(class_3542::method_16440);
      int var3 = class_1920.method_8916(class_6024.field_30769);
      if (var3 != class_6024.field_30761) {
         if (var3 != class_6024.field_30767) {
            if (var3 != class_6024.field_30768) {
               if (var3 != class_6024.field_30766) {
                  if (var3 != class_6024.field_30763) {
                     throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + var3);
                  } else {
                     throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
                  }
               } else {
                  throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
               }
            } else {
               throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
         } else {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         }
      }
   }

   public void method_19715() {
      class_3542.method_16431(class_3542::method_16366);
      class_1920.method_8791(this.field_20525);
   }

   public void method_19719() {
      class_3542.method_16431(class_3542::method_16440);
      class_1920.method_8791(0);
   }

   public void method_19717(boolean var1) {
      if (class_3542.method_16366()) {
         this.method_19711(var1);
      } else {
         class_3542.method_16474(() -> this.method_19711(var1));
      }
   }

   private void method_19711(boolean var1) {
      class_3542.method_16431(class_3542::method_16440);
      class_1920.method_8893(class_6024.field_30769, this.field_20527);
      if (var1) {
         class_1920.method_8930(0, 0, this.field_20526, this.field_20534);
      }
   }

   public void method_19723() {
      if (class_3542.method_16366()) {
         class_1920.method_8893(class_6024.field_30769, 0);
      } else {
         class_3542.method_16474(() -> class_1920.method_8893(class_6024.field_30769, 0));
      }
   }

   public void method_19709(float var1, float var2, float var3, float var4) {
      this.field_20528[0] = var1;
      this.field_20528[1] = var2;
      this.field_20528[2] = var3;
      this.field_20528[3] = var4;
   }

   public void method_19713(int var1, int var2) {
      this.method_19714(var1, var2, true);
   }

   public void method_19714(int var1, int var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16363);
      if (class_3542.method_16395()) {
         this.method_19707(var1, var2, var3);
      } else {
         class_3542.method_16474(() -> this.method_19707(var1, var2, var3));
      }
   }

   private void method_19707(int var1, int var2, boolean var3) {
      class_3542.method_16431(class_3542::method_16366);
      class_1920.method_8895(true, true, true, false);
      class_1920.method_8786();
      class_1920.method_8867(false);
      class_1920.method_8842(5889);
      class_1920.method_8865();
      class_1920.method_8781(0.0, (double)var1, (double)var2, 0.0, 1000.0, 3000.0);
      class_1920.method_8842(5888);
      class_1920.method_8865();
      class_1920.method_8897(0.0F, 0.0F, -2000.0F);
      class_1920.method_8930(0, 0, var1, var2);
      class_1920.method_8843();
      class_1920.method_8912();
      class_1920.method_8801();
      if (var3) {
         class_1920.method_8775();
         class_1920.method_8819();
      }

      class_1920.method_8789(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_19715();
      float var6 = (float)var1;
      float var7 = (float)var2;
      float var8 = (float)this.field_20526 / (float)this.field_20533;
      float var9 = (float)this.field_20534 / (float)this.field_20535;
      class_8042 var10 = class_3542.method_16373();
      class_9633 var11 = var10.method_36501();
      var11.method_44471(7, class_7985.field_40905);
      var11.method_35761(0.0, (double)var7, 0.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, 255).method_35735();
      var11.method_35761((double)var6, (double)var7, 0.0).method_35745(var8, 0.0F).method_35743(255, 255, 255, 255).method_35735();
      var11.method_35761((double)var6, 0.0, 0.0).method_35745(var8, var9).method_35743(255, 255, 255, 255).method_35735();
      var11.method_35761(0.0, 0.0, 0.0).method_35745(0.0F, var9).method_35743(255, 255, 255, 255).method_35735();
      var10.method_36500();
      this.method_19719();
      class_1920.method_8867(true);
      class_1920.method_8895(true, true, true, true);
   }

   public void method_19712(boolean var1) {
      class_3542.method_16431(class_3542::method_16440);
      this.method_19717(true);
      class_1920.method_8880(this.field_20528[0], this.field_20528[1], this.field_20528[2], this.field_20528[3]);
      short var4 = 16384;
      if (this.field_20530) {
         class_1920.method_8913(1.0);
         var4 |= 256;
      }

      class_1920.method_8794(var4, var1);
      this.method_19723();
   }

   public int method_19724() {
      return this.field_20525;
   }

   public int method_19706() {
      return this.field_20532;
   }
}
