package mapped;

import java.util.Optional;

public class Class5413 implements Class5402 {
   private static String[] field24096;

   public void method17001(Class7161 var1, Class9695 var2, Class72 var3) throws Exception {
      this.method17006(var1);
      if (this.method17007()) {
         this.method17004(var1).method18723(var2, var3);
      }
   }

   public Optional<Class72> method17002(Class7161 var1, Class9695 var2) throws Exception {
      this.method17006(var1);
      return !this.method17007() ? Optional.<Class72>empty() : this.method17004(var1).method18725(var2);
   }

   public void method17003(Class7161 var1, int var2, int var3) throws Exception {
      this.method17006(var1);
      if (this.method17007()) {
         this.method17004(var1).method18722(var2, var3);
      }
   }

   private Class6045 method17004(Class7161 var1) {
      return var1.<Class6045>method22438(Class6045.class);
   }

   public void method17005(Class7161 var1) throws Exception {
      if (this.method17007()) {
         Class8563 var4 = new Class8563(27, null, var1);
         var4.method30560(Class4750.field22526, var1.<Class6057>method22438(Class6057.class).method18753());
         var4.method30560(Class4750.field22518, (byte)26);
         var4.method30570(Class6363.class);
         var1.<Class6045>method22438(Class6045.class).method18728(true);
      }
   }

   private void method17006(Class7161 var1) throws Exception {
      if (this.method17007()) {
         Class6045 var4 = this.method17004(var1);
         if (!var4.method18727()) {
            this.method17005(var1);
         }
      }
   }

   public boolean method17007() {
      return true;
   }

   public void method17008(Class7161 var1) {
      if (this.method17007()) {
         this.method17004(var1).method18726();
      }
   }
}
