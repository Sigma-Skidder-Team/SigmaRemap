package mapped;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Class1179 extends Class1178<Class1179> {
   private static String[] field6375;
   private final List<Class1197> field6376;

   private Class1179(List<Class1197> var1) {
      this.field6376 = var1;
   }

   public static Class1179 method5607(Class9574 var0, int var1, Class5805 var2) {
      return new Class1179(ImmutableList.of(var2.method17946(var0, var1 / 2 - 155, 0, 310)));
   }

   public static Class1179 method5608(Class9574 var0, int var1, Class5805 var2, Class5805 var3) {
      Class1197 var6 = var2.method17946(var0, var1 / 2 - 155, 0, 150);
      return var3 != null ? new Class1179(ImmutableList.of(var6, var3.method17946(var0, var1 / 2 - 155 + 160, 0, 150))) : new Class1179(ImmutableList.of(var6));
   }

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field6376.forEach(var5x -> {
         var5x.field6478 = var3;
         var5x.method1923(var1, var7, var8, var10);
      });
   }

   @Override
   public List<? extends Class1152> method2468() {
      return this.field6376;
   }

   // $VF: synthetic method
   public static List<Class1197> method5610(Class1179 var0) {
      return var0.field6376;
   }
}
