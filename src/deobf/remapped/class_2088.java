package remapped;

public abstract class class_2088 extends class_9733 {
   public float field_10503 = 0.1F * (this.field_49466.nextFloat() * 0.5F + 0.5F) * 2.0F;

   public class_2088(class_174 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public class_2088(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method_44951(class_7907 var1, class_9071 var2, float var3) {
      class_1343 var6 = var2.method_41627();
      float var7 = (float)(class_9299.method_42794((double)var3, this.field_49459, this.field_49462) - var6.method_61());
      float var8 = (float)(class_9299.method_42794((double)var3, this.field_49480, this.field_49473) - var6.method_60());
      float var9 = (float)(class_9299.method_42794((double)var3, this.field_49479, this.field_49465) - var6.method_62());
      class_5422 var10;
      if (this.field_49478 != 0.0F) {
         var10 = new class_5422(var2.method_41644());
         float var11 = class_9299.method_42795(var3, this.field_49467, this.field_49478);
         var10.method_24658(class_2426.field_12076.method_11062(var11));
      } else {
         var10 = var2.method_41644();
      }

      class_2426 var19 = new class_2426(-1.0F, -1.0F, 0.0F);
      var19.method_11058(var10);
      class_2426[] var12 = new class_2426[]{
         new class_2426(-1.0F, -1.0F, 0.0F), new class_2426(-1.0F, 1.0F, 0.0F), new class_2426(1.0F, 1.0F, 0.0F), new class_2426(1.0F, -1.0F, 0.0F)
      };
      float var13 = this.method_9766(var3);

      for (int var14 = 0; var14 < 4; var14++) {
         class_2426 var15 = var12[var14];
         var15.method_11058(var10);
         var15.method_11068(var13);
         var15.method_11071(var7, var8, var9);
      }

      float var20 = this.method_9765();
      float var21 = this.method_9767();
      float var16 = this.method_9768();
      float var17 = this.method_9769();
      int var18 = this.method_44952(var3);
      var1.method_35761((double)var12[0].method_11057(), (double)var12[0].method_11061(), (double)var12[0].method_11055())
         .method_35745(var21, var17)
         .method_35742(this.field_49485, this.field_49468, this.field_49487, this.field_49470)
         .method_35747(var18)
         .method_35735();
      var1.method_35761((double)var12[1].method_11057(), (double)var12[1].method_11061(), (double)var12[1].method_11055())
         .method_35745(var21, var16)
         .method_35742(this.field_49485, this.field_49468, this.field_49487, this.field_49470)
         .method_35747(var18)
         .method_35735();
      var1.method_35761((double)var12[2].method_11057(), (double)var12[2].method_11061(), (double)var12[2].method_11055())
         .method_35745(var20, var16)
         .method_35742(this.field_49485, this.field_49468, this.field_49487, this.field_49470)
         .method_35747(var18)
         .method_35735();
      var1.method_35761((double)var12[3].method_11057(), (double)var12[3].method_11061(), (double)var12[3].method_11055())
         .method_35745(var20, var17)
         .method_35742(this.field_49485, this.field_49468, this.field_49487, this.field_49470)
         .method_35747(var18)
         .method_35735();
   }

   public float method_9766(float var1) {
      return this.field_10503;
   }

   @Override
   public class_9733 method_44947(float var1) {
      this.field_10503 *= var1;
      return super.method_44947(var1);
   }

   public abstract float method_9765();

   public abstract float method_9767();

   public abstract float method_9768();

   public abstract float method_9769();
}
