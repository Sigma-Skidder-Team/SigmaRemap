package remapped;

import com.google.common.collect.ImmutableList;

public class class_6980<T extends class_5542> extends class_1498<T> {
   private static String[] field_35848;
   public final class_1549 field_35851;
   private final class_1549 field_35846;
   private final class_1549 field_35854;
   private final class_1549 field_35844;
   private final class_1549 field_35852;
   private final class_1549 field_35853;
   private final class_1549 field_35845;
   private final class_1549 field_35847;
   private final class_1549 field_35849;
   private final class_1549 field_35843;
   private float field_35850;

   public class_6980() {
      super(true, 8.0F, 3.35F);
      this.field_49928 = 48;
      this.field_49927 = 32;
      this.field_35851 = new class_1549(this, 1, 5);
      this.field_35851.method_7048(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
      this.field_35851.method_7046(-1.0F, 16.5F, -3.0F);
      this.field_35846 = new class_1549(this, 8, 1);
      this.field_35846.method_7048(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.field_35854 = new class_1549(this, 15, 1);
      this.field_35854.method_7048(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
      this.field_35844 = new class_1549(this, 6, 18);
      this.field_35844.method_7048(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
      this.field_35851.method_7043(this.field_35846);
      this.field_35851.method_7043(this.field_35854);
      this.field_35851.method_7043(this.field_35844);
      this.field_35852 = new class_1549(this, 24, 15);
      this.field_35852.method_7048(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
      this.field_35852.method_7046(0.0F, 16.0F, -6.0F);
      float var3 = 0.001F;
      this.field_35853 = new class_1549(this, 13, 24);
      this.field_35853.method_7049(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field_35853.method_7046(-5.0F, 17.5F, 7.0F);
      this.field_35845 = new class_1549(this, 4, 24);
      this.field_35845.method_7049(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field_35845.method_7046(-1.0F, 17.5F, 7.0F);
      this.field_35847 = new class_1549(this, 13, 24);
      this.field_35847.method_7049(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field_35847.method_7046(-5.0F, 17.5F, 0.0F);
      this.field_35849 = new class_1549(this, 4, 24);
      this.field_35849.method_7049(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
      this.field_35849.method_7046(-1.0F, 17.5F, 0.0F);
      this.field_35843 = new class_1549(this, 30, 0);
      this.field_35843.method_7048(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
      this.field_35843.method_7046(-4.0F, 15.0F, -1.0F);
      this.field_35852.method_7043(this.field_35843);
   }

   public void method_31932(T var1, float var2, float var3, float var4) {
      this.field_35852.field_8191 = (float) (Math.PI / 2);
      this.field_35843.field_8191 = -0.05235988F;
      this.field_35853.field_8191 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field_35845.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_35847.field_8191 = MathHelper.cos(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.field_35849.field_8191 = MathHelper.cos(var2 * 0.6662F) * 1.4F * var3;
      this.field_35851.method_7046(-1.0F, 16.5F, -3.0F);
      this.field_35851.field_8190 = 0.0F;
      this.field_35851.field_8185 = var1.method_25190(var4);
      this.field_35853.field_8200 = true;
      this.field_35845.field_8200 = true;
      this.field_35847.field_8200 = true;
      this.field_35849.field_8200 = true;
      this.field_35852.method_7046(0.0F, 16.0F, -6.0F);
      this.field_35852.field_8185 = 0.0F;
      this.field_35853.method_7046(-5.0F, 17.5F, 7.0F);
      this.field_35845.method_7046(-1.0F, 17.5F, 7.0F);
      if (!var1.method_37382()) {
         if (!var1.method_26507()) {
            if (var1.method_25205()) {
               this.field_35852.field_8191 = (float) (Math.PI / 6);
               this.field_35852.method_7046(0.0F, 9.0F, -3.0F);
               this.field_35843.field_8191 = (float) (Math.PI / 4);
               this.field_35843.method_7046(-4.0F, 15.0F, -2.0F);
               this.field_35851.method_7046(-1.0F, 10.0F, -0.25F);
               this.field_35851.field_8191 = 0.0F;
               this.field_35851.field_8190 = 0.0F;
               if (this.field_33204) {
                  this.field_35851.method_7046(-1.0F, 13.0F, -3.75F);
               }

               this.field_35853.field_8191 = (float) (-Math.PI * 5.0 / 12.0);
               this.field_35853.method_7046(-5.0F, 21.5F, 6.75F);
               this.field_35845.field_8191 = (float) (-Math.PI * 5.0 / 12.0);
               this.field_35845.method_7046(-1.0F, 21.5F, 6.75F);
               this.field_35847.field_8191 = (float) (-Math.PI / 12);
               this.field_35849.field_8191 = (float) (-Math.PI / 12);
            }
         } else {
            this.field_35852.field_8185 = (float) (-Math.PI / 2);
            this.field_35852.method_7046(0.0F, 21.0F, -6.0F);
            this.field_35843.field_8191 = (float) (-Math.PI * 5.0 / 6.0);
            if (this.field_33204) {
               this.field_35843.field_8191 = -2.1816616F;
               this.field_35852.method_7046(0.0F, 21.0F, -2.0F);
            }

            this.field_35851.method_7046(1.0F, 19.49F, -3.0F);
            this.field_35851.field_8191 = 0.0F;
            this.field_35851.field_8190 = (float) (-Math.PI * 2.0 / 3.0);
            this.field_35851.field_8185 = 0.0F;
            this.field_35853.field_8200 = false;
            this.field_35845.field_8200 = false;
            this.field_35847.field_8200 = false;
            this.field_35849.field_8200 = false;
         }
      } else {
         this.field_35852.field_8191 = 1.6755161F;
         float var7 = var1.method_25191(var4);
         this.field_35852.method_7046(0.0F, 16.0F + var1.method_25191(var4), -6.0F);
         this.field_35851.method_7046(-1.0F, 16.5F + var7, -3.0F);
         this.field_35851.field_8190 = 0.0F;
      }
   }

   @Override
   public Iterable<class_1549> method_6903() {
      return ImmutableList.of(this.field_35851);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return ImmutableList.of(this.field_35852, this.field_35853, this.field_35845, this.field_35847, this.field_35849);
   }

   public void method_31931(T var1, float var2, float var3, float var4, float var5, float var6) {
      if (!var1.method_26507() && !var1.method_25212() && !var1.method_37382()) {
         this.field_35851.field_8191 = var6 * (float) (Math.PI / 180.0);
         this.field_35851.field_8190 = var5 * (float) (Math.PI / 180.0);
      }

      if (var1.method_26507()) {
         this.field_35851.field_8191 = 0.0F;
         this.field_35851.field_8190 = (float) (-Math.PI * 2.0 / 3.0);
         this.field_35851.field_8185 = MathHelper.cos(var4 * 0.027F) / 22.0F;
      }

      if (var1.method_37382()) {
         float var9 = MathHelper.cos(var4) * 0.01F;
         this.field_35852.field_8190 = var9;
         this.field_35853.field_8185 = var9;
         this.field_35845.field_8185 = var9;
         this.field_35847.field_8185 = var9 / 2.0F;
         this.field_35849.field_8185 = var9 / 2.0F;
      }

      if (var1.method_25212()) {
         float var10 = 0.1F;
         this.field_35850 += 0.67F;
         this.field_35853.field_8191 = MathHelper.cos(this.field_35850 * 0.4662F) * 0.1F;
         this.field_35845.field_8191 = MathHelper.cos(this.field_35850 * 0.4662F + (float) Math.PI) * 0.1F;
         this.field_35847.field_8191 = MathHelper.cos(this.field_35850 * 0.4662F + (float) Math.PI) * 0.1F;
         this.field_35849.field_8191 = MathHelper.cos(this.field_35850 * 0.4662F) * 0.1F;
      }
   }
}
