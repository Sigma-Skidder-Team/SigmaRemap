package mapped;

public class Class6372 extends Class6355<Class1931, Class1912, Class1929, Class1930> {
   private static String[] field27939;

   public Class6372() {
      super(Class1931.class, Class1912.class, Class1929.class, Class1930.class);
   }

   @Override
   public void method19341() {
      Class6905 var3 = new Class6905(this);
      Class8941.method32670(this);
      this.method19360(Class1931.field12104, new Class3986(this, var3));
      this.method19360(Class1931.field12107, new Class3936(this, var3));
      this.method19360(Class1931.field12119, new Class4030(this));
      this.method19360(Class1931.field12136, new Class3951(this));
      var3.method21095(Class1931.field12152);
      var3.method21097(Class1931.field12161, Class6403.field28018);
      this.method19360(Class1931.field12139, new Class3765(this));
      this.method19360(Class1931.field12155, new Class3903(this));
      new Class5150(this, this::method19385).method15951(Class1931.field12174);
      this.method19366(Class1930.field12070);
      this.method19364(Class1930.field12074, new Class3880(this));
      this.method19366(Class1930.field12092);
      this.method19366(Class1930.field12094);
   }

   private int method19385(int var1) {
      int var4 = var1;
      if (var1 >= 26) {
         var4 = var1 + 2;
      }

      if (var1 >= 70) {
         var4 += 4;
      }

      if (var1 >= 74) {
         var4++;
      }

      if (var1 >= 143) {
         var4 += 3;
      }

      if (var1 >= 185) {
         var4++;
      }

      if (var1 >= 263) {
         var4 += 7;
      }

      if (var1 >= 301) {
         var4 += 33;
      }

      if (var1 >= 317) {
         var4 += 2;
      }

      if (var1 >= 491) {
         var4 += 3;
      }

      return var4;
   }

   @Override
   public void method19349(Class8648 var1) {
      var1.method31082(Class5414.class, new Class5414());
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6059(var1));
      if (!var1.method22439(Class6047.class)) {
         var1.method22440(new Class6047(var1));
      }
   }
}
