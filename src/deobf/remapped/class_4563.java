package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_4563 extends class_1859 {
   public static final class_590 field_22228 = new class_590(1250067, -15329770)
      .method_2765(class_1255.field_6929.field_6917)
      .method_2775(class_6206.field_31726);
   public List<Integer> field_22229 = new ArrayList<Integer>();
   public List<Integer> field_22231 = new ArrayList<Integer>();
   public boolean field_22232;
   public boolean field_22230;
   private float field_22227;

   public class_4563(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, List<Integer> var8) {
      super(var1, var2, var3, var4, var5, var6, field_22228, var7, false);
      this.field_22229 = var8;
      this.method_21189();
   }

   private void method_21189() {
      this.method_32134().clear();
      this.field_36258 = class_5320.field_27139;
      class_6220 var3;
      this.method_32148(var3 = new class_6220(this, "dropdownButton", 0, 0, this.method_32137(), this.method_32137(), this.field_36272));
      var3.method_32135((var1, var2) -> {
         var1.method_32175(0);
         var1.method_32117(0);
         var1.method_32142(this.method_32109());
         var1.method_32158(this.method_32137());
      });
      var3.method_32100((var1, var2) -> this.method_21190(!this.method_21188()));
      int var4 = this.field_36278;
      int var5 = 0;

      for (int var7 : this.field_22229) {
         class_7257 var8;
         this.method_32148(
            var8 = new class_7257(
               this, var7 + "item", var5 % (this.field_36278 / 50) * 50, this.field_36257 + var5 / (this.field_36278 / 50) * 50, 50, 50, var7
            )
         );
         var8.method_33160(this.field_22231.contains(this.field_22229.indexOf(var7)));
         var8.method_32100((var1, var2) -> this.method_8235());
         var5++;
      }
   }

   private int method_21191() {
      return (int)((float)(50 * (this.field_22229.size() / (this.field_36278 / 50)) + 1 + 50) * this.field_22227 * this.field_22227);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (!this.method_32120(var1, var2) && this.method_21188()) {
         this.field_22230 = true;
      }

      if (this.field_22230) {
         float var5 = 0.14F;
         this.field_22227 = this.field_22227 + (!this.method_21188() ? 0.014F + 0.28F * (1.0F - this.field_22227) : -0.014F - 0.14F * this.field_22227);
         if (!(this.field_22227 >= 1.0F)) {
            if (this.field_22227 <= 0.0F) {
               this.field_22227 = 0.0F;
               this.field_22230 = false;
               this.field_22232 = false;
            }
         } else {
            this.field_22227 = 1.0F;
            this.field_22230 = false;
            this.field_22232 = true;
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_94(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137() + this.method_21191()),
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      class_73.method_128(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)(this.method_32137() + this.method_21191()),
         6.0F,
         var1 * 0.21F
      );
      if (this.method_32165() != null) {
         class_73.method_151(this);
         class_73.method_87(
            this.method_32097(),
            (float)(this.method_32132() + 10),
            (float)(this.method_32173() + (this.method_32137() - this.method_32097().method_15654()) / 2 + 1),
            this.field_36275,
            class_314.method_1444(this.field_36272.method_2764(), var1 * 0.7F)
         );
         class_73.method_141();
      }

      class_73.method_149(
         this.method_32155(), this.method_32093(), this.method_32155() + this.method_32109(), this.method_32093() + this.method_32137() + this.method_21191()
      );
      GL11.glPushMatrix();
      if (this.field_22227 > 0.0F) {
         super.method_32178(var1);
      }

      GL11.glPopMatrix();
      class_73.method_141();
      class_73.method_109(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137() + this.method_21191()),
         class_314.method_1444(this.field_36272.method_2769(), var1 * 0.08F)
      );
      int var4 = this.method_32109() - (int)((float)this.method_32137() / 2.0F + 0.5F);
      int var5 = (int)((float)this.method_32137() / 2.0F + 0.5F) + 1;
      int var6 = (int)((float)this.method_32137() / 6.0F + 0.5F);
      GL11.glTranslatef((float)(this.method_32132() + var4), (float)(this.method_32173() + var5), 0.0F);
      GL11.glRotatef(90.0F * this.field_22227, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.method_32132() - var4), (float)(-this.method_32173() - var5), 0.0F);
      class_73.method_87(
         this.field_36258,
         (float)(this.method_32132() + var4 - 6),
         (float)(this.method_32173() + var5 - 14),
         ">",
         class_314.method_1444(this.field_36272.method_2764(), var1 * 0.7F * (!this.method_32120(this.method_32189(), this.method_32129()) ? 0.5F : 1.0F))
      );
   }

   public List<Integer> method_21187() {
      return this.field_22229;
   }

   public void method_21193(Integer var1, int var2) {
      this.method_21187().add(var2, var1);
      this.method_21189();
   }

   public void method_21192(Integer var1) {
      this.method_21193(var1, this.field_22229.size());
   }

   public boolean method_21188() {
      return this.field_22232;
   }

   public void method_21190(boolean var1) {
      if (var1 != this.field_22232) {
         this.field_22230 = true;
      }
   }

   @Override
   public boolean method_32120(int var1, int var2) {
      var1 -= this.method_32155();
      var2 -= this.method_32093();
      return var1 >= 0 && var1 <= this.method_32109() && var2 >= 0 && var2 <= this.method_32137() + this.method_21191();
   }
}
