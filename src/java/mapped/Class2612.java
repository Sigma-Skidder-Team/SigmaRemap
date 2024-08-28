package mapped;

import java.util.EnumSet;

public class Class2612 extends Class2595 {
   private static String[] field16880;
   public final Class1006 field16881;
   public Entity field16882;
   public final float field16883;
   private int field16884;
   public final float field16885;
   public final Class<? extends Class880> field16886;
   public final Class8522 field16887;

   public Class2612(Class1006 var1, Class<? extends Class880> var2, float var3) {
      this(var1, var2, var3, 0.02F);
   }

   public Class2612(Class1006 var1, Class<? extends Class880> var2, float var3, float var4) {
      this.field16881 = var1;
      this.field16886 = var2;
      this.field16883 = var3;
      this.field16885 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14658));
      if (var2 != PlayerEntity.class) {
         this.field16887 = new Class8522().method30203((double)var3).method30205().method30204().method30207();
      } else {
         this.field16887 = new Class8522()
            .method30203((double)var3)
            .method30205()
            .method30204()
            .method30207()
            .method30209(var1x -> Class8088.method27982(var1).test(var1x));
      }
   }

   @Override
   public boolean method10803() {
      if (!(this.field16881.method3013().nextFloat() >= this.field16885)) {
         if (this.field16881.method4232() != null) {
            this.field16882 = this.field16881.method4232();
         }

         if (this.field16886 != PlayerEntity.class) {
            this.field16882 = this.field16881
               .field5024
               .<Class880>method7192(
                  this.field16886,
                  this.field16887,
                  this.field16881,
                  this.field16881.getPosX(),
                  this.field16881.method3442(),
                  this.field16881.getPosZ(),
                  this.field16881.method3389().method19663((double)this.field16883, 3.0, (double)this.field16883)
               );
         } else {
            this.field16882 = this.field16881
               .field5024
               .method7189(this.field16887, this.field16881, this.field16881.getPosX(), this.field16881.method3442(), this.field16881.getPosZ());
         }

         return this.field16882 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (this.field16882.method3066()) {
         return !(this.field16881.method3277(this.field16882) > (double)(this.field16883 * this.field16883)) ? this.field16884 > 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      this.field16884 = 40 + this.field16881.method3013().nextInt(40);
   }

   @Override
   public void method10807() {
      this.field16882 = null;
   }

   @Override
   public void method10805() {
      this.field16881.method4227().method28041(this.field16882.getPosX(), this.field16882.method3442(), this.field16882.getPosZ());
      this.field16884--;
   }
}
