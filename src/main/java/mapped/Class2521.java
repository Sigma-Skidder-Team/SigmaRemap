package mapped;

public class Class2521 extends Class2520 {
   private static String[] field16683;

   public Class2521(float var1, float var2) {
      this.field16673 = var1;
      this.field16674 = var2;
      this.method10610();
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      float[] var4 = new float[this.field16671.length];
      var1.method29529(this.field16671, 0, var4, 0, this.field16671.length / 2);
      return new Class2521(this.field16671[0], this.field16671[1]);
   }

   @Override
   public void method10578() {
      this.field16671 = new float[2];
      this.field16671[0] = this.method10579();
      this.field16671[1] = this.method10582();
      this.field16675 = this.field16673;
      this.field16676 = this.field16674;
      this.field16677 = this.field16673;
      this.field16678 = this.field16674;
      this.method10605();
      this.method10606();
   }

   @Override
   public void method10605() {
      this.field16672 = new float[2];
      this.field16672[0] = this.field16671[0];
      this.field16672[1] = this.field16671[1];
   }

   @Override
   public void method10606() {
      this.field16679 = 0.0F;
   }
}
