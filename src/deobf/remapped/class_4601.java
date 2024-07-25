package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;

public class class_4601 {
   private static String[] field_22372;
   public class_2654 field_22373;
   public ByteBuffer field_22374;
   public boolean field_22375;

   public class_4601(class_2654 var1) {
      this.field_22373 = var1;
      this.field_22374 = BufferUtils.createByteBuffer(768);
      this.method_21319();
   }

   public void method_21319() {
      this.field_22374 = BufferUtils.createByteBuffer(768);
      int var3 = this.field_22373.method_27352().field_10328 * 16;
      int var4 = this.field_22373.method_27352().field_10327 * 16;

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            class_1331 var7 = new class_1331(var3 + var5, 64, var4 + var6);
            int var8 = SigmaMainClass.getInstance()
               .method_3309()
               .method_21975(
                  new class_1331(var7.method_12173(), this.field_22373.method_27353(class_3801.field_18592).method_9957(var5, var6) - 1, var7.method_12185()),
                  true
               );
            this.field_22374.put((byte)(var8 >> 16 & 0xFF));
            this.field_22374.put((byte)(var8 >> 8 & 0xFF));
            this.field_22374.put((byte)(var8 & 0xFF));
         }
      }

      ((Buffer)this.field_22374).flip();
      this.field_22375 = this.method_21316();
   }

   public void method_21318() {
      if (!this.field_22375 && this.method_21316()) {
         this.method_21319();
      }
   }

   private boolean method_21316() {
      class_2654 var3 = MiniMapModule.method_22833()
         .field_9601
         .method_29554(this.field_22373.method_27352().field_10328, this.field_22373.method_27352().field_10327 + 1);
      class_2654 var4 = MiniMapModule.method_22832()
         .field_9601
         .method_29554(this.field_22373.method_27352().field_10328, this.field_22373.method_27352().field_10327 - 1);
      return var3 != null && var3.field_13081 && var4 != null && var4.field_13081;
   }

   public boolean method_21320(class_2654 var1) {
      return var1.method_27352().field_10328 == this.field_22373.method_27352().field_10328
         && var1.method_27352().field_10327 == this.field_22373.method_27352().field_10327;
   }
}
