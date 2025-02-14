package mapped;

import java.util.function.Supplier;

public interface IProfiler {
   void startTick();

   void endTick();

   void startSection(String var1);

   void startSection(Supplier<String> var1);

   void endSection();

   void endStartSection(String var1);

   void method22507(Supplier<String> var1);

   void func_230035_c_(String var1);

   void method22509(Supplier<String> var1);

   static IProfiler method22510(IProfiler var0, IProfiler var1) {
      if (var0 != EmptyProfiler.INSTANCE) {
         return (IProfiler)(var1 != EmptyProfiler.INSTANCE ? new Class7164(var0, var1) : var0);
      } else {
         return var1;
      }
   }
}
