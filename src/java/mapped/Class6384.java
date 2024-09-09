package mapped;

public class Class6384 extends ViaVersion7<Class1915, Class1916, Class1922, Class1922> {
   public static final Class5982 field27955 = new Class5982();
   private Class7136 field27956;

   public Class6384() {
      super(Class1915.class, Class1916.class, Class1922.class, Class1922.class);
   }

   @Override
   public void method19341() {
      Class6907 var3 = new Class6907(this);
      Class8691.method31313(this);
      Class6215.method19190(this);
      Class7987.method27143(this);
      Class8704.method31392(this);
      Class5150 var4 = new Class5150(this);
      var4.method15951(Class1915.field11518);
      var4.method15951(Class1915.field11519);
      new Class7310(this, var3::method21106).method23096(Class1915.field11445);
      this.method19364(Class1922.field11829, new Class3833(this));
      this.field27956 = new Class7136(this, Class8691::method31314);
      this.field27956.method22254(Class1915.field11529);
   }

   @Override
   public void method19348() {
      int[] var3 = new int[17];
      short var4 = 501;

      for (int var5 = 0; var5 < 17; var5++) {
         var3[var5] = var4 + var5;
      }

      this.field27956.method22253(Class2165.field14215, "minecraft:shulker_boxes", var3);
   }

   @Override
   public void method19342(Class7161 var1) {
      var1.method22440(new Class6053(var1));
   }

   public Class5982 method19376() {
      return field27955;
   }
}
