package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_993 extends class_1859 {
   private List<class_6220> field_5055 = new ArrayList<class_6220>();
   public int field_5060;
   public class_6409 field_5052;
   public class_2034 field_5050;
   public int field_5048 = 8;
   public float field_5057 = 0.0F;
   public float field_5061 = 0.0F;
   public int field_5056;
   public int field_5047;
   public class_1376 field_5049;
   public int field_5059;
   public float field_5054;
   public float field_5058;
   public class_2034 field_5053;
   private final List<class_3442> field_5062 = new ArrayList<class_3442>();
   private final List<class_9365> field_5063 = new ArrayList<class_9365>();

   public class_993(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      byte var9 = 90;
      byte var10 = 40;
      int var11 = var5 - var10 - 10;
      int var12 = var6 - var9 - 10;
      this.method_32148(this.field_5052 = new class_6409(this, "zoom", var11, var12, var10, var9));
      this.field_5050 = class_1893.method_8510().field_9601.method_22556(class_1893.method_8510().field_9632.method_37075()).method_27352();
      this.method_32105(false);
   }

   public void method_4323(boolean var1) {
      this.field_5048 = Math.max(3, Math.min(33, !var1 ? this.field_5048 + 1 : this.field_5048 - 1));
      this.method_4325();
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.field_36267) {
         int var5 = var1 - this.field_5056;
         int var6 = var2 - this.field_5047;
         float var7 = ((float)this.field_5048 - 1.0F) / (float)this.field_5048;
         float var8 = (float)this.field_36278 / ((float)this.field_5048 * 2.0F * var7);
         this.field_5061 += (float)var5 / var8;
         this.field_5057 += (float)var6 / var8;
      }

      this.field_5056 = var1;
      this.field_5047 = var2;
   }

   public void method_4324(int var1, int var2) {
      this.field_5050 = new class_2034(var1 / 16, var2 / 16);
      this.field_5061 = -0.5F;
      this.field_5057 = -0.5F;
      this.field_5052.field_32710 = true;
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (this.method_32183() && var3 == 1) {
         int var6 = Math.max(this.field_36278, this.field_36257);
         float var7 = (float)(this.field_36278 - var6) / 2.0F;
         float var8 = (float)(this.field_36257 - var6) / 2.0F;
         float var9 = (float)var1 - ((float)this.method_32155() + var8 + (float)(var6 / 2));
         float var10 = (float)(class_1893.method_8510().field_9602.method_43163() - var2) - ((float)this.method_32093() + var7 + (float)(var6 / 2));
         float var11 = (float)var6 / ((float)(this.field_5048 - 1) * 2.0F);
         float var12 = (float)(this.field_5050.field_10328 * 16) - this.field_5061 * 16.0F;
         float var13 = (float)(this.field_5050.field_10327 * 16) - this.field_5057 * 16.0F;
         float var14 = var12 + var9 / var11 * 16.0F;
         float var15 = var13 - var10 / var11 * 16.0F;
         System.out.println(var10 / var11 + " : " + var9 / var11);
         this.method_4321(var1, var2, new class_2700(Math.round(var14), 0, Math.round(var15)));
         return false;
      } else {
         this.method_4325();
         return super.method_29508(var1, var2, var3);
      }
   }

   @Override
   public void method_29510(float var1) {
      super.method_29510(var1);
      if (this.method_32183()) {
         this.field_5048 = Math.round(Math.max(3.0F, Math.min(33.0F, (float)this.field_5048 + var1 / 10.0F)));
         this.method_4325();
      }
   }

   @Override
   public void method_32178(float var1) {
      class_1893 var4 = class_1893.method_8510();
      class_2034 var5 = new class_2034(this.field_5050.field_10328, this.field_5050.field_10327);
      var5.field_10328 = (int)((double)var5.field_10328 - Math.floor((double)this.field_5061));
      var5.field_10327 = (int)((double)var5.field_10327 - Math.floor((double)this.field_5057));
      if (var1 != 1.0F) {
         this.field_5052.field_32710 = true;
      }

      if (this.field_5049 == null || this.field_5048 != this.field_5059 || !this.field_5053.equals(var5)) {
         this.field_5049 = SigmaMainClass.method_3328().method_3309().method_21974(var5, this.field_5048 * 2);
      }

      if (this.field_5049 == null || this.field_5048 != this.field_5059 || this.field_5061 != this.field_5058 || this.field_5057 != this.field_5054) {
         this.field_5052.field_32710 = true;
      }

      int var6 = Math.max(this.field_36278, this.field_36257);
      int var7 = (this.field_36278 - var6) / 2;
      int var8 = (this.field_36257 - var6) / 2;
      float var9 = (float)this.field_5048 / ((float)this.field_5048 - 1.0F);
      float var10 = (float)var6 / ((float)this.field_5048 * 2.0F);
      double var11 = ((double)this.field_5057 - Math.floor((double)this.field_5057)) * (double)var10;
      double var13 = ((double)this.field_5061 - Math.floor((double)this.field_5061)) * (double)var10;
      class_7889 var10000 = var4.method_8577();
      var4.method_8577();
      var10000.method_35674(class_7889.field_40364);
      class_73.method_150(this.field_36270, this.field_36261, this.field_36270 + this.field_36278, this.field_36261 + this.field_36257, true);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.field_36270 + this.field_36278 / 2), (float)(this.field_36261 + this.field_36257 / 2), 0.0F);
      GL11.glScalef(var9, var9, 0.0F);
      GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.field_36270 - this.field_36278 / 2), (float)(-this.field_36261 - this.field_36257 / 2), 0.0F);
      GL11.glTranslated(-var11, var13, 0.0);
      class_73.method_138(
         (float)(this.field_36270 + var7),
         (float)(this.field_36261 + var8),
         (float)var6,
         (float)var6,
         this.field_5049.field_7474,
         class_1255.field_6918.field_6917,
         0.0F,
         0.0F,
         (float)this.field_5049.field_7473,
         (float)this.field_5049.field_7475,
         true,
         false
      );
      GL11.glPopMatrix();

      for (class_4333 var16 : SigmaMainClass.method_3328().method_3309().method_21960()) {
         float var17 = (float)(this.field_5050.field_10328 * 16) - this.field_5061 * 16.0F;
         float var18 = (float)(this.field_5050.field_10327 * 16) - this.field_5057 * 16.0F;
         float var19 = (float)var16.field_21071 - var17 + 1.0F;
         float var20 = (float)var16.field_21073 - var18 + 1.0F;
         float var21 = (float)var6 / ((float)(this.field_5048 - 1) * 2.0F);
         class_73.method_99(
            (float)(this.field_36270 + Math.round(var19 * var21 / 16.0F) + this.field_36278 / 2 - 16),
            (float)(this.field_36261 + Math.round(var20 * var21 / 16.0F) + this.field_36257 / 2 - 42),
            32.0F,
            46.0F,
            class_2209.field_10991,
            var16.field_21075
         );
      }

      class_73.method_141();
      int var22 = Math.round((float)(this.field_5050.field_10328 * 16) - this.field_5061 * 16.0F);
      int var23 = Math.round((float)(this.field_5050.field_10327 * 16) - this.field_5057 * 16.0F);
      String var24 = var22 + "  " + var23;
      class_73.method_87(
         class_5320.field_27138,
         (float)(this.field_36270 - class_5320.field_27138.method_18547(var24) - 23),
         (float)(this.field_36261 + 35),
         var24,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.4F)
      );
      this.field_5054 = this.field_5057;
      this.field_5058 = this.field_5061;
      this.field_5059 = this.field_5048;
      this.field_5053 = var5;
      super.method_32178(var1);
   }

   public final void method_4322(class_3442 var1) {
      this.field_5062.add(var1);
   }

   public final void method_4321(int var1, int var2, class_2700 var3) {
      for (class_3442 var7 : this.field_5062) {
         var7.method_15880(this, var1, var2, var3);
      }
   }

   public final void method_4320(class_9365 var1) {
      this.field_5063.add(var1);
   }

   public final void method_4325() {
      for (class_9365 var4 : this.field_5063) {
         var4.method_43306(this);
      }
   }
}
