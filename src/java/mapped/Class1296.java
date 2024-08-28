package mapped;

import javax.annotation.Nullable;
import java.util.Optional;

public class Class1296 extends Class1293<Class1179> {
   private static String[] field6862;

   public Class1296(Minecraft var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field6791 = false;
   }

   public int method6129(Class5805 var1) {
      return this.method6030(Class1179.method5607(this.field6782.field1299, this.field6785, var1));
   }

   public void method6130(Class5805 var1, Class5805 var2) {
      this.method6030(Class1179.method5608(this.field6782.field1299, this.field6785, var1, var2));
   }

   public void method6131(Class5805[] var1) {
      for (int var4 = 0; var4 < var1.length; var4 += 2) {
         this.method6130(var1[var4], var4 >= var1.length - 1 ? null : var1[var4 + 1]);
      }
   }

   @Override
   public int method6022() {
      return 400;
   }

   @Override
   public int method6048() {
      return super.method6048() + 32;
   }

   @Nullable
   public Class1197 method6132(Class5805 var1) {
      for (Class1179 var5 : this.method2468()) {
         for (Class1197 var7 : Class1179.method5610(var5)) {
            if (var7 instanceof Class1228 && ((Class1228)var7).method5809() == var1) {
               return var7;
            }
         }
      }

      return null;
   }

   public Optional<Class1197> method6133(double var1, double var3) {
      for (Class1179 var8 : this.method2468()) {
         for (Class1197 var10 : Class1179.method5610(var8)) {
            if (var10.method2485(var1, var3)) {
               return Optional.<Class1197>of(var10);
            }
         }
      }

      return Optional.<Class1197>empty();
   }
}
