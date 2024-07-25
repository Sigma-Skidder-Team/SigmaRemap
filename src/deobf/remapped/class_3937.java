package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_3937 extends class_446 {
   private static String[] field_19128;
   private class_7309 field_19127 = null;
   private List<class_4356> field_19129 = new ArrayList<class_4356>();
   private float field_19126 = 0.0F;

   public class_3937(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public void method_18204(class_7309 var1) {
      this.field_19127 = var1;

      for (class_4356 var5 : this.field_19129) {
         this.method_32101(var5);
      }

      if (var1 != null) {
         ArrayList var11 = new ArrayList();

         for (class_5933 var6 : var1.method_33342()) {
            var11.add(var6);
         }

         Collections.reverse(var11);
         int var13 = 0;
         byte var14 = 90;
         byte var7 = 14;

         for (class_5933 var9 : var11) {
            if (var9.method_27123() != null && var9.method_27123().method_11622() != null) {
               class_4356 var10 = new class_4356(
                  this, ((class_5933)var11.get(var13)).method_27126(), 40, 100 + var13 * (var14 + var7), this.field_36278 - 90, var14, var9
               );
               this.method_32148(var10);
               this.field_19129.add(var10);
               var13++;
            }
         }

         this.method_32158(var13 * (var14 + var7) + 116);
      }
   }

   @Override
   public void method_32178(float var1) {
      this.method_32130();
      this.field_19126 = (float)((double)this.field_19126 + (this.method_32126() ? 0.33 : -0.33));
      this.field_19126 = Math.min(1.0F, Math.max(0.0F, this.field_19126));
      if (this.field_19127 == null) {
         int var4 = this.field_36278 - 30;
         int var5 = this.field_36270 + 5;
         class_73.method_96(
            (float)var5,
            (float)((MinecraftClient.getInstance().field_9602.method_43163() - var4 * 342 / 460) / 2 - 60),
            (float)var4,
            (float)(var4 * 342 / 460),
            class_2209.field_11027
         );
      }

      if (this.field_19127 != null) {
         int var6 = class_314.method_1444(class_1255.field_6929.field_6917, 0.2F);
         int var7 = class_314.method_1444(class_1255.field_6929.field_6917, 0.7F);
         class_73.method_87(
            class_5320.field_27140,
            (float)(this.field_36270 + (this.field_36278 - class_5320.field_27140.method_18547(this.field_19127.method_33321())) / 2),
            (float)this.field_36261,
            this.field_19127.method_33321(),
            var7
         );
         super.method_32178(var1);
      }
   }
}
