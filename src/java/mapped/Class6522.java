package mapped;



public abstract class Class6522 implements Class6515 {
   private int field28607;
   private Class6528 field28608;

   public void method19774(Class9189 var1) throws AACException {
      this.field28607 = var1.method34397(4);
   }

   public int method19775() {
      return this.field28607;
   }

   public void method19776(Class9189 var1, Class2288 var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) throws AACException {
      if (this.field28608 == null) {
         this.field28608 = new Class6528(var7, this.field28607 == 1, var2, var6);
      }

      this.field28608.method19801(var1, var3);
   }

   public boolean method19777() {
      return this.field28608 != null;
   }

   public Class6528 method19778() {
      return this.field28608;
   }
}
