package mapped;

public class Class2527 extends Class2520 {
   public float field16704;
   public float field16705;

   public Class2527(float var1, float var2, float var3, float var4) {
      this.field16673 = var1;
      this.field16674 = var2;
      this.field16704 = var3;
      this.field16705 = var4;
      this.field16675 = var1 + var3;
      this.field16676 = var2 + var4;
      this.method10610();
   }

   @Override
   public boolean method10602(float var1, float var2) {
      if (!(var1 <= this.method10579())) {
         if (!(var2 <= this.method10582())) {
            return !(var1 >= this.field16675) ? !(var2 >= this.field16676) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method10645(Class2527 var1) {
      this.method10646(var1.method10579(), var1.method10582(), var1.method10616(), var1.method10617());
   }

   public void method10646(float var1, float var2, float var3, float var4) {
      this.method10580(var1);
      this.method10581(var2);
      this.method10647(var3, var4);
   }

   public void method10647(float var1, float var2) {
      this.method10650(var1);
      this.method10651(var2);
   }

   @Override
   public float method10616() {
      return this.field16704;
   }

   @Override
   public float method10617() {
      return this.field16705;
   }

   public void method10648(float var1, float var2) {
      this.method10580(this.method10579() - var1);
      this.method10581(this.method10582() - var2);
      this.method10650(this.method10616() + var1 * 2.0F);
      this.method10651(this.method10617() + var2 * 2.0F);
   }

   public void method10649(float var1, float var2) {
      this.method10648(this.method10616() * (var1 - 1.0F), this.method10617() * (var2 - 1.0F));
   }

   public void method10650(float var1) {
      if (var1 != this.field16704) {
         this.field16680 = true;
         this.field16704 = var1;
         this.field16675 = this.field16673 + var1;
      }
   }

   public void method10651(float var1) {
      if (var1 != this.field16705) {
         this.field16680 = true;
         this.field16705 = var1;
         this.field16676 = this.field16674 + var1;
      }
   }

   @Override
   public boolean method10603(Class2520 var1) {
      if (!(var1 instanceof Class2527)) {
         return !(var1 instanceof Class2523) ? super.method10603(var1) : this.method10652((Class2523)var1);
      } else {
         Class2527 var4 = (Class2527)var1;
         return this.field16673 > var4.field16673 + var4.field16704 || this.field16673 + this.field16704 < var4.field16673
            ? false
            : !(this.field16674 > var4.field16674 + var4.field16705) && !(this.field16674 + this.field16705 < var4.field16674);
      }
   }

   @Override
   public void method10578() {
      float var3 = this.field16704;
      float var4 = this.field16705;
      this.field16671 = new float[8];
      this.field16671[0] = this.field16673;
      this.field16671[1] = this.field16674;
      this.field16671[2] = this.field16673 + var3;
      this.field16671[3] = this.field16674;
      this.field16671[4] = this.field16673 + var3;
      this.field16671[5] = this.field16674 + var4;
      this.field16671[6] = this.field16673;
      this.field16671[7] = this.field16674 + var4;
      this.field16675 = this.field16671[2];
      this.field16676 = this.field16671[5];
      this.field16677 = this.field16671[0];
      this.field16678 = this.field16671[1];
      this.method10605();
      this.method10606();
   }

   private boolean method10652(Class2523 var1) {
      return var1.method10603(this);
   }

   @Override
   public String toString() {
      return "[Rectangle " + this.field16704 + "x" + this.field16705 + "]";
   }

   public static boolean method10653(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var1 >= var3 && var0 <= var2 + var4 && var1 <= var3 + var5;
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      this.method10610();
      Class2526 var4 = new Class2526();
      float[] var5 = new float[this.field16671.length];
      var1.method29529(this.field16671, 0, var5, 0, this.field16671.length / 2);
      var4.field16671 = var5;
      var4.method10605();
      var4.method10610();
      return var4;
   }
}
