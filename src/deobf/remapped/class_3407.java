package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_3407 extends class_4178 {
   public final class_5664 field_16766;
   public class_1996 field_16769;
   public float field_16773;
   public static final int field_16768 = 60;
   public int field_16770;
   public int field_16767;
   private int field_16774;
   private final List<class_8524> field_16771 = new ArrayList<class_8524>();

   public class_3407(class_7038 var1, String var2, int var3, int var4, class_5664 var5) {
      super(var1, var2, var3, var4, 200, 350, true);
      this.method_32142(200);
      this.method_32158(350);
      this.field_20347 = true;
      this.field_16766 = var5;
      this.method_15728();
   }

   public void method_15727() {
      this.method_32102(() -> {
         this.method_32179(this.field_16769);
         this.method_32148(this.field_16769 = new class_1996(this, "modListView", 0, 60, this.method_32109(), this.method_32137() - 60, this.field_16766));
      });
   }

   private void method_15728() {
      this.method_32148(this.field_16769 = new class_1996(this, "modListView", 0, 60, this.method_32109(), this.method_32137() - 60, this.field_16766));
      this.field_16769.method_32135(new class_8395());
      this.field_16769.method_32135((var0, var1) -> {
         var0.method_32117(60);
         var0.method_32158(var1.method_32137() - 60);
      });
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (!(this.field_16773 >= 1.0F)) {
         this.method_1533(false);
         this.field_36267 = false;
      } else {
         this.field_16770 = this.method_32132();
         this.field_16767 = this.method_32173();
         this.method_1533(true);
      }

      float var5 = 200.0F;
      float var6 = 320.0F;
      float var7 = 0.7F;
      float var8 = 0.1F;
      int var9 = (int)(200.0F + 140.0F * (1.0F - this.field_16773));
      int var10 = (int)(320.0F + 320.0F * 0.1F * (1.0F - this.field_16773));
      int var11 = this.field_16767;
      int var12 = (int)((float)this.field_16770 - ((float)var9 - 200.0F) / 2.0F + 0.5F);
      if (this.field_16773 < 1.0F) {
         if (var12 < 0) {
            var12 = 0;
         }

         if (var12 + var9 > this.field_36283.method_32109()) {
            var12 = this.field_36283.method_32109() - var9;
         }

         if (var11 + var10 > this.field_36283.method_32137()) {
            var11 = this.field_36283.method_32137() - var10;
         }
      }

      this.method_32142(var9);
      this.method_32158(var10);
      this.method_32175(var12);
      this.method_32117(var11);
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32190();
      super.method_32130();
      int var4 = (int)(1.0F + 10.0F * (1.0F - this.field_16773));
      class_73.method_128(
         (float)(this.method_32132() + (var4 - 1)),
         (float)(this.method_32173() + (var4 - 1)),
         (float)(this.method_32109() - (var4 - 1) * 2),
         (float)(this.method_32137() - (var4 - 1) * 2),
         (float)this.field_16774 + (1.0F - this.field_16773) * (float)var4,
         var1
      );
      class_73.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + 60),
         class_314.method_1444(class_1255.field_6918.field_6917, Math.min(1.0F, var1 * 0.9F * this.field_16773))
      );
      class_73.method_103(
         (float)this.method_32132(),
         (float)this.method_32173() + 60.0F * this.field_16773,
         (float)this.method_32109(),
         (float)this.method_32137() - 60.0F * this.field_16773,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      if (!(this.field_16773 > 0.8F)) {
         if (this.field_16773 < 0.2F) {
            this.field_16774 = 30;
         }
      } else {
         this.field_16774 = 20;
      }

      String var5 = this.method_15726().method_25628();
      class_73.method_88(
         class_5320.field_27141,
         (float)(this.method_32132() + 20),
         (float)(this.method_32173() + 30),
         var5,
         class_314.method_1444(class_1255.field_6929.field_6917, var1 * 0.5F * this.field_16773),
         class_6206.field_31724,
         class_6206.field_31726
      );
      GL11.glPushMatrix();
      super.method_32178(var1 * var1);
      GL11.glPopMatrix();
      if (this.field_16769.method_11853() > 0) {
         class_73.method_99(
            (float)this.method_32132(),
            (float)(this.method_32173() + 60),
            (float)this.method_32109(),
            18.0F,
            class_2209.field_10992,
            class_314.method_1444(class_1255.field_6918.field_6917, var1 * this.field_16773 * 0.5F)
         );
      }
   }

   public class_5664 method_15726() {
      return this.field_16766;
   }

   public final void method_15730(class_8524 var1) {
      this.field_16771.add(var1);
   }

   public final void method_15729(class_9128 var1) {
      for (class_8524 var5 : this.field_16771) {
         var5.method_39240(var1);
      }
   }
}
