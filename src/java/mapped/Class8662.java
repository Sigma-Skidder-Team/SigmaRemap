package mapped;

public class Class8662 {
   private Class7176[] field39035 = new Class7176[128];
   private int field39036;

   public Class7176 method31190(Class7176 var1) {
      if (var1.field30851 < 0) {
         if (this.field39036 == this.field39035.length) {
            Class7176[] var4 = new Class7176[this.field39036 << 1];
            System.arraycopy(this.field39035, 0, var4, 0, this.field39036);
            this.field39035 = var4;
         }

         this.field39035[this.field39036] = var1;
         var1.field30851 = this.field39036;
         this.method31194(this.field39036++);
         return var1;
      } else {
         throw new IllegalStateException("OW KNOWS!");
      }
   }

   public void method31191() {
      this.field39036 = 0;
   }

   public Class7176 method31192() {
      Class7176 var3 = this.field39035[0];
      this.field39035[0] = this.field39035[--this.field39036];
      this.field39035[this.field39036] = null;
      if (this.field39036 > 0) {
         this.method31195(0);
      }

      var3.field30851 = -1;
      return var3;
   }

   public void method31193(Class7176 var1, float var2) {
      float var5 = var1.field30854;
      var1.field30854 = var2;
      if (!(var2 < var5)) {
         this.method31195(var1.field30851);
      } else {
         this.method31194(var1.field30851);
      }
   }

   private void method31194(int var1) {
      Class7176 var4 = this.field39035[var1];
      float var5 = var4.field30854;

      while (var1 > 0) {
         int var6 = var1 - 1 >> 1;
         Class7176 var7 = this.field39035[var6];
         if (!(var5 < var7.field30854)) {
            break;
         }

         this.field39035[var1] = var7;
         var7.field30851 = var1;
         var1 = var6;
      }

      this.field39035[var1] = var4;
      var4.field30851 = var1;
   }

   private void method31195(int var1) {
      Class7176 var4 = this.field39035[var1];
      float var5 = var4.field30854;

      while (true) {
         int var6 = 1 + (var1 << 1);
         int var7 = var6 + 1;
         if (var6 >= this.field39036) {
            break;
         }

         Class7176 var8 = this.field39035[var6];
         float var9 = var8.field30854;
         Class7176 var10;
         float var11;
         if (var7 < this.field39036) {
            var10 = this.field39035[var7];
            var11 = var10.field30854;
         } else {
            var10 = null;
            var11 = Float.POSITIVE_INFINITY;
         }

         if (!(var9 < var11)) {
            if (!(var11 < var5)) {
               break;
            }

            this.field39035[var1] = var10;
            var10.field30851 = var1;
            var1 = var7;
         } else {
            if (!(var9 < var5)) {
               break;
            }

            this.field39035[var1] = var8;
            var8.field30851 = var1;
            var1 = var6;
         }
      }

      this.field39035[var1] = var4;
      var4.field30851 = var1;
   }

   public boolean method31196() {
      return this.field39036 == 0;
   }
}
