package mapped;

import java.util.function.Supplier;

public interface Class7165 {
   void method22501();

   void method22502();

   void startSection(String var1);

   void method22504(Supplier<String> var1);

   void endSection();

   void endStartSection(String var1);

   void method22507(Supplier<String> var1);

   void func_230035_c_(String var1);

   void method22509(Supplier<String> var1);

   static Class7165 method22510(Class7165 var0, Class7165 var1) {
      if (var0 != Class7167.field30819) {
         return (Class7165)(var1 != Class7167.field30819 ? new Class7164(var0, var1) : var0);
      } else {
         return var1;
      }
   }
}
