package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_5940 extends class_2612 {
   private List<class_8046> field_30296 = new ArrayList<class_8046>();
   public final int field_30294 = 70;
   public class_2440 field_30293 = new class_2440(300, 300);
   public boolean field_30297;
   public class_8046 field_30298;

   public class_5940(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_30293.method_11119(class_4043.field_19618);
      this.field_20341 = true;
      this.method_32105(false);
      this.method_27165();
   }

   public void method_27165() {
      boolean var3 = false;
   }

   public void method_27166(String var1, class_2700 var2, int var3) {
      String var6 = "waypoint x" + var2.method_12173() + " z" + var2.method_12185();
      if (this.field_12901.method_32094(var6) == null) {
         class_8046 var7 = new class_8046(
            this,
            var6,
            this.field_36270,
            this.method_32134().get(0).method_32134().size() * this.field_30294,
            this.field_36278,
            this.field_30294,
            var1,
            var2,
            var3
         );
         var7.field_41211 = var7.method_32173();
         this.field_30296.add(var7);
         this.method_32148(var7);
         var7.method_32100((var2x, var3x) -> {
            class_3451 var6x = (class_3451)this.method_32167();
            var6x.field_16933.method_4324(var7.field_41210.method_12173(), var7.field_41210.method_12185());
         });
         var7.method_8236(
            var3x -> {
               class_727.method_3328()
                  .method_3309()
                  .method_21972(new class_4333(var7.field_41209, var7.field_41210.method_12173(), var7.field_41210.method_12185(), var7.field_41206));
               this.field_12901.method_32106(var7);
               this.field_30296.remove(var3x);
            }
         );
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_30296.sort((var0, var1x) -> var0.field_41211 < var1x.field_41211 + var0.method_32137() / 2 ? -1 : 1);
      int var5 = 0;
      if (this.field_30298 != null && !this.field_30298.method_1535() && this.field_30297) {
         this.field_30298.method_36513();
         this.field_30298 = null;
         this.field_30297 = false;
      }

      for (class_8046 var7 : this.field_30296) {
         if (!var7.method_1535() && var7.field_41207.method_11128() == class_4043.field_19618) {
            var7.field_41211 = var5 + 5;
         } else {
            var7.field_41211 = var7.method_32173();
         }

         var5 += var7.method_32137();
      }

      for (class_8046 var11 : this.field_30296) {
         if (var11.method_1535()) {
            this.field_30293.method_11119(class_4043.field_19620);
            if (var1 > this.method_32155() + 10
               && var1 < this.method_32155() + 50
               && var2 < this.method_32093() + this.method_32137() - 10
               && var2 > this.method_32093() + this.method_32137() - 50) {
               this.field_30297 = true;
               this.field_30298 = var11;
            } else {
               this.field_30297 = false;
               this.field_30298 = null;
            }
            break;
         }

         if (!var11.method_1535() && this.field_30293.method_11128() == class_4043.field_19620) {
            class_727.method_3328().method_3309().method_21960().clear();

            for (class_8046 var9 : this.field_30296) {
               class_727.method_3328()
                  .method_3309()
                  .method_21960()
                  .add(new class_4333(var9.field_41209, var9.field_41210.method_12173(), var9.field_41210.method_12185(), var9.field_41206));
            }

            Collections.reverse(class_727.method_3328().method_3309().method_21960());
            class_727.method_3328().method_3309().method_21964();
         }

         this.field_30293.method_11119(class_4043.field_19618);
      }
   }

   @Override
   public void method_32178(float var1) {
      float var4 = Math.min(1.0F, 0.21F * (60.0F / (float)class_1893.method_8501()));

      for (class_8046 var6 : this.field_30296) {
         if (!var6.method_1535()) {
            float var7 = (float)(var6.method_32173() - var6.field_41211) * var4;
            if (Math.round(var7) == 0 && var7 > 0.0F) {
               var7 = 1.0F;
            } else if (Math.round(var7) == 0 && var7 < 0.0F) {
               var7 = -1.0F;
            }

            var6.method_32117(Math.round((float)var6.method_32173() - var7));
         }
      }

      super.method_32178(var1);
      int var8 = Math.round(class_9681.method_44757(1.0F - this.field_30293.method_11123(), 0.0F, 1.0F, 1.0F) * 30.0F);
      class_73.method_102(
         (float)(this.field_36270 - var8 + 18),
         (float)(this.field_36257 - 46),
         22.0F,
         26.0F,
         class_2209.field_11060,
         class_314.method_1444(!this.field_30297 ? class_1255.field_6929.field_6917 : class_1255.field_6928.field_6917, this.field_30293.method_11123() * 0.5F),
         false
      );
   }
}
