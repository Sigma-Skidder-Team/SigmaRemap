package mapped;

public class Class2530 extends Class2520 {
   private Class2532 field16721;
   private Class2532 field16722;
   private Class2532 field16723;
   private float field16724;
   private Class2532 field16725 = new Class2532(0.0F, 0.0F);
   private Class2532 field16726 = new Class2532(0.0F, 0.0F);
   private Class2532 field16727 = new Class2532(0.0F, 0.0F);
   private Class2532 field16728 = new Class2532(0.0F, 0.0F);
   private Class2532 field16729 = new Class2532(0.0F, 0.0F);
   private Class2532 field16730 = new Class2532(0.0F, 0.0F);
   private boolean field16731 = true;
   private boolean field16732 = true;

   public Class2530(float var1, float var2, boolean var3, boolean var4) {
      this(0.0F, 0.0F, var1, var2);
   }

   public Class2530(float var1, float var2) {
      this(var1, var2, true, true);
   }

   public Class2530(float var1, float var2, float var3, float var4) {
      this(new Class2532(var1, var2), new Class2532(var3, var4));
   }

   public Class2530(float var1, float var2, float var3, float var4, boolean var5) {
      this(new Class2532(var1, var2), new Class2532(var1 + var3, var2 + var4));
   }

   public Class2530(float[] var1, float[] var2) {
      this.method10658(var1, var2);
   }

   public Class2530(Class2532 var1, Class2532 var2) {
      this.method10663(var1, var2);
   }

   public void method10658(float[] var1, float[] var2) {
      this.method10664(var1[0], var1[1], var2[0], var2[1]);
   }

   public Class2532 method10659() {
      return this.field16721;
   }

   public Class2532 method10660() {
      return this.field16722;
   }

   public float method10661() {
      return this.field16723.method10698();
   }

   public float method10662() {
      return this.field16723.method10697();
   }

   public void method10663(Class2532 var1, Class2532 var2) {
      super.field16680 = true;
      if (this.field16721 == null) {
         this.field16721 = new Class2532();
      }

      this.field16721.method10685(var1);
      if (this.field16722 == null) {
         this.field16722 = new Class2532();
      }

      this.field16722.method10685(var2);
      this.field16723 = new Class2532(var2);
      this.field16723.method10693(var1);
      this.field16724 = this.field16723.method10697();
   }

   public void method10664(float var1, float var2, float var3, float var4) {
      super.field16680 = true;
      this.field16721.method10687(var1, var2);
      this.field16722.method10687(var3, var4);
      float var7 = var3 - var1;
      float var8 = var4 - var2;
      this.field16723.method10687(var7, var8);
      this.field16724 = var7 * var7 + var8 * var8;
   }

   public float method10665() {
      return this.field16722.method10683() - this.field16721.method10683();
   }

   public float method10666() {
      return this.field16722.method10684() - this.field16721.method10684();
   }

   @Override
   public float method10579() {
      return this.method10667();
   }

   @Override
   public float method10582() {
      return this.method10668();
   }

   public float method10667() {
      return this.field16721.method10683();
   }

   public float method10668() {
      return this.field16721.method10684();
   }

   public float method10669() {
      return this.field16722.method10683();
   }

   public float method10670() {
      return this.field16722.method10684();
   }

   public float method10671(Class2532 var1) {
      return (float)Math.sqrt((double)this.method10673(var1));
   }

   public boolean method10672(Class2532 var1) {
      this.method10674(var1, this.field16729);
      return var1.equals(this.field16729);
   }

   public float method10673(Class2532 var1) {
      this.method10674(var1, this.field16729);
      this.field16729.method10693(var1);
      return this.field16729.method10697();
   }

   public void method10674(Class2532 var1, Class2532 var2) {
      this.field16725.method10685(var1);
      this.field16725.method10693(this.field16721);
      float var5 = this.field16723.method10686(this.field16725);
      var5 /= this.field16723.method10697();
      if (!(var5 < 0.0F)) {
         if (!(var5 > 1.0F)) {
            var2.field16737 = this.field16721.method10683() + var5 * this.field16723.method10683();
            var2.field16738 = this.field16721.method10684() + var5 * this.field16723.method10684();
         } else {
            var2.method10685(this.field16722);
         }
      } else {
         var2.method10685(this.field16721);
      }
   }

   @Override
   public String toString() {
      return "[Line " + this.field16721 + "," + this.field16722 + "]";
   }

   public Class2532 method10675(Class2530 var1) {
      return this.method10676(var1, false);
   }

   public Class2532 method10676(Class2530 var1, boolean var2) {
      Class2532 var5 = new Class2532();
      return this.method10677(var1, var2, var5) ? var5 : null;
   }

   public boolean method10677(Class2530 var1, boolean var2, Class2532 var3) {
      float var6 = this.field16722.method10683() - this.field16721.method10683();
      float var7 = var1.field16722.method10683() - var1.field16721.method10683();
      float var8 = this.field16722.method10684() - this.field16721.method10684();
      float var9 = var1.field16722.method10684() - var1.field16721.method10684();
      float var10 = var9 * var6 - var7 * var8;
      if (var10 == 0.0F) {
         return false;
      } else {
         float var11 = var7 * (this.field16721.method10684() - var1.field16721.method10684())
            - var9 * (this.field16721.method10683() - var1.field16721.method10683());
         var11 /= var10;
         float var12 = var6 * (this.field16721.method10684() - var1.field16721.method10684())
            - var8 * (this.field16721.method10683() - var1.field16721.method10683());
         var12 /= var10;
         if (var2 && (var11 < 0.0F || var11 > 1.0F || var12 < 0.0F || var12 > 1.0F)) {
            return false;
         } else {
            float var14 = this.field16721.method10683() + var11 * (this.field16722.method10683() - this.field16721.method10683());
            float var15 = this.field16721.method10684() + var11 * (this.field16722.method10684() - this.field16721.method10684());
            var3.method10687(var14, var15);
            return true;
         }
      }
   }

   @Override
   public void method10578() {
      this.field16671 = new float[4];
      this.field16671[0] = this.method10667();
      this.field16671[1] = this.method10668();
      this.field16671[2] = this.method10669();
      this.field16671[3] = this.method10670();
   }

   @Override
   public Class2520 method10577(Class8412 var1) {
      float[] var4 = new float[4];
      this.method10578();
      var1.method29529(this.field16671, 0, var4, 0, 2);
      return new Class2530(var4[0], var4[1], var4[2], var4[3]);
   }

   @Override
   public boolean method10612() {
      return false;
   }

   @Override
   public boolean method10603(Class2520 var1) {
      return !(var1 instanceof Class2523) ? super.method10603(var1) : var1.method10603(this);
   }
}
