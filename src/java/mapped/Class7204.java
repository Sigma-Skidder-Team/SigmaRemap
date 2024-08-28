package mapped;

import java.util.List;
import java.util.Random;

public class Class7204 implements Class7202 {
   private static String[] field30922;
   private final int field30923;
   private final List<Class6690> field30924;
   private final Class7202 field30925;

   public Class7204(List<Class6690> var1) {
      this.field30924 = var1;
      this.field30923 = Class8879.method32311(var1);
      this.field30925 = ((Class6690)var1.get(0)).field29307;
   }

   @Override
   public List<Class8557> method22619(Class7380 var1, Direction var2, Random var3) {
      return Class8879.<Class6690>method32313(this.field30924, Math.abs((int)var3.nextLong()) % this.field30923).field29307.method22619(var1, var2, var3);
   }

   @Override
   public boolean method22620() {
      return this.field30925.method22620();
   }

   @Override
   public boolean method22621() {
      return this.field30925.method22621();
   }

   @Override
   public boolean method22622() {
      return this.field30925.method22622();
   }

   @Override
   public boolean method22623() {
      return this.field30925.method22623();
   }

   @Override
   public Class1713 method22624() {
      return this.field30925.method22624();
   }

   @Override
   public Class9264 method22625() {
      return this.field30925.method22625();
   }

   @Override
   public Class6391 method22626() {
      return this.field30925.method22626();
   }
}
