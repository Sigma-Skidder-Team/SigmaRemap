package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5811 extends Class5812 {
   private static String[] field25455;
   private final Class8786 field25456;
   private final Class4923 field25457 = Class4923.method15238();
   private final Class1655 field25458;
   private List<Class4845> field25459 = Lists.newArrayList();
   private Class8848 field25460 = Class8848.field39973;
   private long field25461;
   public final Class5839 field25462;
   public final Class5839 field25463;
   private Runnable field25464 = () -> {
   };
   public final Class920 field25465 = new Class977(this, 1);
   private final Class921 field25466 = new Class921();

   public Class5811(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5811(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35671, var1);
      this.field25456 = var3;
      this.field25458 = var2.field5444.field5024;
      this.field25462 = this.method18124(new Class5839(this.field25465, 0, 20, 33));
      this.field25463 = this.method18124(new Class5850(this, this.field25466, 1, 143, 33, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method18124(new Class5839(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method18124(new Class5839(var2, var8, 8 + var8 * 18, 142));
      }

      this.method18125(this.field25457);
   }

   public int method18099() {
      return this.field25457.method15234();
   }

   public List<Class4845> method18100() {
      return this.field25459;
   }

   public int method18101() {
      return this.field25459.size();
   }

   public boolean method18102() {
      return this.field25462.method18266() && !this.field25459.isEmpty();
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25456, var1, Class8487.field37063);
   }

   @Override
   public boolean method18104(PlayerEntity var1, int var2) {
      if (this.method18105(var2)) {
         this.field25457.method15235(var2);
         this.method18108();
      }

      return true;
   }

   private boolean method18105(int var1) {
      return var1 >= 0 && var1 < this.field25459.size();
   }

   @Override
   public void method18106(Class920 var1) {
      Class8848 var4 = this.field25462.method18265();
      if (var4.method32107() != this.field25460.method32107()) {
         this.field25460 = var4.method32126();
         this.method18107(var1, var4);
      }
   }

   private void method18107(Class920 var1, Class8848 var2) {
      this.field25459.clear();
      this.field25457.method15235(-1);
      this.field25463.method18267(Class8848.field39973);
      if (!var2.method32105()) {
         this.field25459 = this.field25458.method6816().<Class920, Class4845>method1032(Class7207.field30940, var1, this.field25458);
      }
   }

   private void method18108() {
      if (!this.field25459.isEmpty() && this.method18105(this.field25457.method15234())) {
         Class4845 var3 = this.field25459.get(this.field25457.method15234());
         this.field25466.method3636(var3);
         this.field25463.method18267(var3.method14962(this.field25465));
      } else {
         this.field25463.method18267(Class8848.field39973);
      }

      this.method18130();
   }

   @Override
   public Class8298<?> method18109() {
      return Class8298.field35671;
   }

   public void method18110(Runnable var1) {
      this.field25464 = var1;
   }

   @Override
   public boolean method18111(Class8848 var1, Class5839 var2) {
      return var2.field25578 != this.field25466 && super.method18111(var1, var2);
   }

   @Override
   public Class8848 method18112(PlayerEntity var1, int var2) {
      Class8848 var5 = Class8848.field39973;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         Class8848 var7 = var6.method18265();
         Class3257 var8 = var7.method32107();
         var5 = var7.method32126();
         if (var2 != 1) {
            if (var2 != 0) {
               if (!this.field25458.method6816().<Class920, Class4845>method1030(Class7207.field30940, new Class927(var7), this.field25458).isPresent()) {
                  if (var2 >= 2 && var2 < 29) {
                     if (!this.method18142(var7, 29, 38, false)) {
                        return Class8848.field39973;
                     }
                  } else if (var2 >= 29 && var2 < 38 && !this.method18142(var7, 2, 29, false)) {
                     return Class8848.field39973;
                  }
               } else if (!this.method18142(var7, 0, 1, false)) {
                  return Class8848.field39973;
               }
            } else if (!this.method18142(var7, 2, 38, false)) {
               return Class8848.field39973;
            }
         } else {
            var8.method11725(var7, var1.field5024, var1);
            if (!this.method18142(var7, 2, 38, true)) {
               return Class8848.field39973;
            }

            var6.method18260(var7, var5);
         }

         if (var7.method32105()) {
            var6.method18267(Class8848.field39973);
         }

         var6.method18268();
         if (var7.method32179() == var5.method32179()) {
            return Class8848.field39973;
         }

         var6.method18264(var1, var7);
         this.method18130();
      }

      return var5;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25466.method3620(1);
      this.field25456.method31716((var2, var3) -> this.method18135(var1, var1.field5024, this.field25465));
   }

   // $VF: synthetic method
   public static Runnable method18116(Class5811 var0) {
      return var0.field25464;
   }

   // $VF: synthetic method
   public static Class921 method18117(Class5811 var0) {
      return var0.field25466;
   }

   // $VF: synthetic method
   public static void method18118(Class5811 var0) {
      var0.method18108();
   }

   // $VF: synthetic method
   public static long method18119(Class5811 var0) {
      return var0.field25461;
   }

   // $VF: synthetic method
   public static long method18120(Class5811 var0, long var1) {
      return var0.field25461 = var1;
   }
}
