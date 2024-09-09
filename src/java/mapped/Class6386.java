package mapped;

public class Class6386 extends ViaVersion7<Class1931, Class1931, Class1929, Class1929> {
   private static String[] field27958;
   private static final Class3032<Float, Short> field27959 = new Class3044(Class4750.field22522);

   public Class6386() {
      super(Class1931.class, Class1931.class, Class1929.class, Class1929.class);
   }

   @Override
   public void method19341() {
      Class6906 var3 = new Class6906(this);
      Class8738.method31537(this);
      this.method19360(Class1931.field12104, new Class3977(this, var3));
      this.method19360(Class1931.field12107, new Class3850(this, var3));
      new Class5150(this, this::method19401).method15951(Class1931.field12174);
      this.method19360(Class1931.field12176, new Class4014(this));
      var3.method21097(Class1931.field12161, Class7593.field32598);
      this.method19360(Class1931.field12177, new Class3917(this));
      var3.method21095(Class1931.field12152);
      this.method19360(Class1931.field12173, new Class3825(this));
      this.method19360(Class1931.field12114, new Class3766(this));
      this.method19360(Class1931.field12113, new Class3926(this));
      this.method19360(Class1931.field12136, new Class3809(this));
      this.method19360(Class1931.field12139, new Class3995(this));
      this.method19360(Class1931.field12155, new Class3804(this));
      this.method19360(Class1931.field12137, new Class3901(this));
      this.method19364(Class1929.field12065, new Class3858(this));
      this.method19364(Class1929.field12039, new Class4025(this));
   }

   private int method19401(int var1) {
      if (var1 != 196) {
         if (var1 >= 85) {
            var1 += 2;
         }

         if (var1 >= 176) {
            var1++;
         }

         if (var1 >= 197) {
            var1 += 8;
         }

         if (var1 >= 207) {
            var1--;
         }

         if (var1 >= 279) {
            var1 += 9;
         }

         if (var1 >= 296) {
            var1++;
         }

         if (var1 >= 390) {
            var1 += 4;
         }

         if (var1 >= 400) {
            var1 += 3;
         }

         if (var1 >= 450) {
            var1++;
         }

         if (var1 >= 455) {
            var1++;
         }

         if (var1 >= 470) {
            var1++;
         }

         return var1;
      } else {
         return -1;
      }
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6055(var1));
      if (!var1.method22439(Class6047.class)) {
         var1.method22440(new Class6047(var1));
      }
   }

   // $VF: synthetic method
   public static Class3032 method19402() {
      return field27959;
   }
}
