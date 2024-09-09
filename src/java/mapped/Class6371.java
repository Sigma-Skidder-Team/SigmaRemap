package mapped;

public class Class6371 extends ViaVersion7<Class1932, Class1915, Class1921, Class1922> {
   private static String[] field27937;
   public static final Class5978 field27938 = new Class5978();

   public Class6371() {
      super(Class1932.class, Class1915.class, Class1921.class, Class1922.class);
   }

   @Override
   public void method19341() {
      Class6910 var3 = new Class6910(this);
      Class8770.method31634(this);
      Class8422.method29594(this);
      Class7290.method23050(this);
      Class9063.method33749(this);
      new Class5150(this).method15951(Class1932.field12259);
      new Class7310(this, var3::method21106).method23096(Class1932.field12189);
      Class7082 var4 = new Class7082(this);
      var4.method22001(Class1932.field12196);
      this.method19360(Class1932.field12267, new Class3920(this));
      this.method19366(Class1922.field11819);
      this.method19366(Class1922.field11833);
      this.method19366(Class1922.field11856);
   }

   @Override
   public void method19348() {
      Class7290.field31272 = this.method19376().method18536().method22147(0);
      Class7290.field31273 = this.method19376().method18536().method22147(8591);
      Class7290.field31274 = this.method19376().method18536().method22147(8592);
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6058(var1));
      if (!var1.method22439(Class6047.class)) {
         var1.method22440(new Class6047(var1));
      }
   }

   public Class5978 method19376() {
      return field27938;
   }
}
