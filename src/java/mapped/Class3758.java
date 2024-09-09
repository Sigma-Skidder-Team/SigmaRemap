package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public abstract class Class3758 {
   private final List<Class9284<Class3031, Class3007>> field19917 = new ArrayList<Class9284<Class3031, Class3007>>();

   public Class3758() {
      this.method12725();
   }

   public void map(Class4750 var1) {
      Class3030 var4 = new Class3030(var1);
      this.method12731(var4, var4);
   }

   public void method12727(Class4750 var1, Class4750 var2) {
      this.method12731(new Class3030(var1), new Class3030(var2));
   }

   public <T1, T2> void method12728(Class4750<T1> var1, Class4750<T2> var2, Function<T1, T2> var3) {
      this.method12731(new Class3030<T1>(var1), new Class3041(this, var2, var3));
   }

   public <T1, T2> void method12729(Class3032<T1, T2> var1) {
      if (var1.method11403() != null) {
         this.method12730(var1.method11403(), var1);
      } else {
         throw new IllegalArgumentException("Use map(Type<T1>, ValueTransformer<T1, T2>) for value transformers without specified input type!");
      }
   }

   public <T1, T2> void method12730(Class4750<T1> var1, Class3032<T1, T2> var2) {
      this.method12731(new Class3030<T1>(var1), var2);
   }

   public <T> void method12731(Class3031<T> var1, Class3007<T> var2) {
      this.field19917.add(new Class9284<Class3031, Class3007>(var1, var2));
   }

   public void method12732(Class3008 var1) {
      this.method12731(new Class3030<Void>(Class4750.field22550), var1);
   }

   public void method12733(Class2982 var1) {
      this.method12731(new Class3030<>(Class4750.field22550), var1);
   }

   public abstract void method12725();

   public void method12734(Class8563 var1) throws Exception {
      try {
         for (Class9284 var10 : this.field19917) {
            Object var6 = ((Class3031)var10.method35008()).method11401(var1);
            ((Class3007)var10.method35009()).method11399(var1, var6);
         }
      } catch (Class2447 var7) {
         var7.method10459(this.getClass());
         throw var7;
      } catch (ViaVersion4 var8) {
         throw var8;
      } catch (Exception var9) {
         Class2447 var5 = new Class2447(var9);
         var5.method10459(this.getClass());
         throw var5;
      }
   }
}
