package mapped;

public class Class2867<T extends Class1097> extends Class2866<T> {
   private static String[] field17778;
   private float field17779;
   private float field17780;
   private float field17781;

   public Class2867(int var1, float var2) {
      super(var1, var2, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17772 = new Class7219(this, 0, 6);
      this.field17772.method22673(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
      this.field17772.method22679(0.0F, 11.5F, -17.0F);
      this.field17772.method22671(45, 16).method22673(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
      this.field17772.method22671(52, 25).method22673(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.field17772.method22671(52, 25).method22673(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.field17773 = new Class7219(this, 0, 25);
      this.field17773.method22673(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
      this.field17773.method22679(0.0F, 10.0F, 0.0F);
      byte var5 = 9;
      byte var6 = 6;
      this.field17774 = new Class7219(this, 40, 0);
      this.field17774.method22673(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field17774.method22679(-5.5F, 15.0F, 9.0F);
      this.field17775 = new Class7219(this, 40, 0);
      this.field17775.method22673(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field17775.method22679(5.5F, 15.0F, 9.0F);
      this.field17776 = new Class7219(this, 40, 0);
      this.field17776.method22673(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field17776.method22679(-5.5F, 15.0F, -9.0F);
      this.field17777 = new Class7219(this, 40, 0);
      this.field17777.method22673(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field17777.method22679(5.5F, 15.0F, -9.0F);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      super.method10997((T)var1, var2, var3, var4);
      this.field17779 = var1.method5220(var4);
      this.field17780 = var1.method5221(var4);
      this.field17781 = !var1.method3005() ? var1.method5222(var4) : 0.0F;
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      boolean var9 = var1.method5186() > 0;
      boolean var10 = var1.method5188();
      int var11 = var1.method5198();
      boolean var12 = var1.method5193();
      boolean var13 = var1.method5214();
      if (!var9) {
         this.field17772.field31037 = 0.0F;
      } else {
         this.field17772.field31036 = 0.35F * Class9679.method37763(0.6F * var4);
         this.field17772.field31037 = 0.35F * Class9679.method37763(0.6F * var4);
         this.field17776.field31035 = -0.75F * Class9679.method37763(0.3F * var4);
         this.field17777.field31035 = 0.75F * Class9679.method37763(0.3F * var4);
      }

      if (var10) {
         if (var11 >= 15) {
            if (var11 < 20) {
               float var14 = (float)((var11 - 15) / 5);
               this.field17772.field31035 = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * var14;
            }
         } else {
            this.field17772.field31035 = (float) (-Math.PI / 4) * (float)var11 / 14.0F;
         }
      }

      if (!(this.field17779 > 0.0F)) {
         this.field17774.field31037 = 0.0F;
         this.field17775.field31037 = 0.0F;
         this.field17776.field31037 = 0.0F;
         this.field17777.field31037 = 0.0F;
      } else {
         this.field17773.field31035 = Class9530.method36832(this.field17773.field31035, 1.7407963F, this.field17779);
         this.field17772.field31035 = Class9530.method36832(this.field17772.field31035, (float) (Math.PI / 2), this.field17779);
         this.field17776.field31037 = -0.27079642F;
         this.field17777.field31037 = 0.27079642F;
         this.field17774.field31037 = 0.5707964F;
         this.field17775.field31037 = -0.5707964F;
         if (var12) {
            this.field17772.field31035 = (float) (Math.PI / 2) + 0.2F * Class9679.method37763(var4 * 0.6F);
            this.field17776.field31035 = -0.4F - 0.2F * Class9679.method37763(var4 * 0.6F);
            this.field17777.field31035 = -0.4F - 0.2F * Class9679.method37763(var4 * 0.6F);
         }

         if (var13) {
            this.field17772.field31035 = 2.1707964F;
            this.field17776.field31035 = -0.9F;
            this.field17777.field31035 = -0.9F;
         }
      }

      if (this.field17780 > 0.0F) {
         this.field17774.field31035 = -0.6F * Class9679.method37763(var4 * 0.15F);
         this.field17775.field31035 = 0.6F * Class9679.method37763(var4 * 0.15F);
         this.field17776.field31035 = 0.3F * Class9679.method37763(var4 * 0.25F);
         this.field17777.field31035 = -0.3F * Class9679.method37763(var4 * 0.25F);
         this.field17772.field31035 = Class9530.method36832(this.field17772.field31035, (float) (Math.PI / 2), this.field17780);
      }

      if (this.field17781 > 0.0F) {
         this.field17772.field31035 = Class9530.method36832(this.field17772.field31035, 2.0561945F, this.field17781);
         this.field17774.field31035 = -0.5F * Class9679.method37763(var4 * 0.5F);
         this.field17775.field31035 = 0.5F * Class9679.method37763(var4 * 0.5F);
         this.field17776.field31035 = 0.5F * Class9679.method37763(var4 * 0.5F);
         this.field17777.field31035 = -0.5F * Class9679.method37763(var4 * 0.5F);
      }
   }
}
