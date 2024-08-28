package mapped;

public class Class2857<T extends Class1066> extends Class2856<T> {
   private static String[] field17705;
   private final Class7219 field17706 = new Class7219(this, 26, 21);
   private final Class7219 field17707;

   public Class2857(float var1) {
      super(var1);
      this.field17706.method22673(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.field17707 = new Class7219(this, 26, 21);
      this.field17707.method22673(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
      this.field17706.field31036 = (float) (-Math.PI / 2);
      this.field17707.field31036 = (float) (Math.PI / 2);
      this.field17706.method22679(6.0F, -8.0F, 0.0F);
      this.field17707.method22679(-6.0F, -8.0F, 0.0F);
      this.field17692.method22670(this.field17706);
      this.field17692.method22670(this.field17707);
   }

   @Override
   public void method11189(Class7219 var1) {
      Class7219 var4 = new Class7219(this, 0, 12);
      var4.method22673(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var4.method22679(1.25F, -10.0F, 4.0F);
      Class7219 var5 = new Class7219(this, 0, 12);
      var5.method22673(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
      var5.method22679(-1.25F, -10.0F, 4.0F);
      var4.field31035 = (float) (Math.PI / 12);
      var4.field31037 = (float) (Math.PI / 12);
      var5.field31035 = (float) (Math.PI / 12);
      var5.field31037 = (float) (-Math.PI / 12);
      var1.method22670(var4);
      var1.method22670(var5);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      if (!var1.method4927()) {
         this.field17706.field31039 = false;
         this.field17707.field31039 = false;
      } else {
         this.field17706.field31039 = true;
         this.field17707.field31039 = true;
      }
   }
}
