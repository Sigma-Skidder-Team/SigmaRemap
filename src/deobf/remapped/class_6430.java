package remapped;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class class_6430 extends class_2612 {
   private List<class_6220> field_32851 = new ArrayList<class_6220>();
   private boolean field_32841;
   private boolean field_32847;
   private float field_32850 = 1.0F;
   private int field_32843 = 0;
   private int field_32844 = 14;
   private static class_3384 field_32848 = class_5320.field_27139;
   private static int field_32842 = 14;
   private boolean field_32845 = false;
   private static final String field_32846 = "\n";

   public class_6430(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   public void method_29377(class_7274 var1) {
      boolean var4 = this.field_32845 == var1.field_37242 && this.field_32843 != 0;
      boolean var5 = this.method_11853() + this.method_32137() >= this.method_11850().method_32137() - field_32842;
      if (var4) {
         this.field_32844 -= 7;
      }

      int var6 = this.method_11850().method_32137() - this.method_32137();
      this.method_11850()
         .method_32148(
            new class_6450(this.method_11850(), "message" + this.field_32843, 0, this.field_32844, this.method_32109(), var1.method_33251() + field_32842, var1)
         );
      this.field_32844 = this.field_32844 + var1.method_33251();
      this.field_32843++;
      this.field_32845 = var1.field_37242;
      if (var1.field_37242 || var5) {
         this.method_29378(var6, var1.method_33251(), var4);
      }
   }

   public void method_29378(int var1, int var2, boolean var3) {
      int var6 = this.method_11853();
      int var7 = var1 + var2;
      if (var3) {
         var7 -= 7;
      }

      int var8 = var7 - var6;
      float var9 = 300.0F;
      long var10 = new Date().getTime() + (long)((int)var9);
      int var12 = this.field_32843 + 0;
      new Thread(() -> {
         int var9x = var8;
         if (this.field_32843 == 1) {
            var9x = var8 + 30;
         }

         while (var10 >= new Date().getTime() && var12 == this.field_32843) {
            float var10x = 1.0F - (float)(var10 - new Date().getTime()) / var9;
            var10x = class_9681.method_44756((float)Math.sqrt((double)var10x), 0.0F, 1.0F, 1.0F);
            this.method_11851((int)((float)var6 + (float)var9x * var10x));
         }
      }).start();
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
   }
}
