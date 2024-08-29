package mapped;

import java.util.function.Supplier;

public final class Class7164 implements IProfiler {
   private static String[] field30815;
   public final IProfiler field30816;
   public final IProfiler field30817;

   public Class7164(IProfiler var1, IProfiler var2) {
      this.field30816 = var1;
      this.field30817 = var2;
   }

   @Override
   public void startTick() {
      this.field30816.startTick();
      this.field30817.startTick();
   }

   @Override
   public void endTick() {
      this.field30816.endTick();
      this.field30817.endTick();
   }

   @Override
   public void startSection(String var1) {
      this.field30816.startSection(var1);
      this.field30817.startSection(var1);
   }

   @Override
   public void method22504(Supplier<String> var1) {
      this.field30816.method22504(var1);
      this.field30817.method22504(var1);
   }

   @Override
   public void endSection() {
      this.field30816.endSection();
      this.field30817.endSection();
   }

   @Override
   public void endStartSection(String var1) {
      this.field30816.endStartSection(var1);
      this.field30817.endStartSection(var1);
   }

   @Override
   public void method22507(Supplier<String> var1) {
      this.field30816.method22507(var1);
      this.field30817.method22507(var1);
   }

   @Override
   public void func_230035_c_(String var1) {
      this.field30816.func_230035_c_(var1);
      this.field30817.func_230035_c_(var1);
   }

   @Override
   public void method22509(Supplier<String> var1) {
      this.field30816.method22509(var1);
      this.field30817.method22509(var1);
   }
}
