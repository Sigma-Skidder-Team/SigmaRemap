package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3684 extends Class3676<Class1006> {
   private static String[] field19699;
   private final int field19700;

   public Class3684(int var1) {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14486, Class8830.field39826, Class2217.field14484, Class8830.field39827, Class2217.field14485));
      this.field19700 = var1;
   }

   public boolean method12508(ServerWorld var1, Class1006 var2) {
      Class880 var5 = this.method12524(var2);
      return !this.method12523(var2) && Class6983.method21583(var2, var5) && Class6983.method21581(var2, var5);
   }

   private boolean method12523(Class1006 var1) {
      return var1.method3093(var1x -> var1x instanceof Class3262 && var1.method4234((Class3262)var1x));
   }

   public void method12502(ServerWorld var1, Class1006 var2, long var3) {
      Class880 var7 = this.method12524(var2);
      Class6983.method21574(var2, var7);
      var2.swingArm(Hand.field182);
      var2.method3114(var7);
      var2.method2992().method21407(Class8830.field39827, true, (long)this.field19700);
   }

   private Class880 method12524(Class1006 var1) {
      return var1.method2992().<Class880>method21410(Class8830.field39826).get();
   }
}
