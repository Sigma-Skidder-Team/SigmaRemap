package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class1032 extends Class1031 {
   private static String[] field5736;
   private Class1019 field5737;

   public Class1032(Class8992<? extends Class1032> var1, World var2) {
      super(var1, var2);
      this.field5594 = 10;
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2697(this));
      this.field5600.method20002(2, new Class2770<PlayerEntity>(this, PlayerEntity.class, 8.0F, 0.6, 1.0));
      this.field5600.method20002(4, new Class2675(this));
      this.field5600.method20002(5, new Class2674(this));
      this.field5600.method20002(6, new Class2676(this));
      this.field5600.method20002(8, new Class2736(this, 0.6));
      this.field5600.method20002(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
      this.field5601.method20002(1, new Class2704(this, Class1026.class).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true).method10917(300));
      this.field5601.method20002(3, new Class2709<Class1043>(this, Class1043.class, false).method10917(300));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, false));
   }

   public static Class7037 method4600() {
      return Class1009.method4343().method21849(Class9173.field42108, 0.5).method21849(Class9173.field42106, 12.0).method21849(Class9173.field42105, 24.0);
   }

   @Override
   public void method2850() {
      super.method2850();
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
   }

   @Override
   public Class9455 method4546() {
      return Class6067.field26561;
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
   }

   @Override
   public void method4258() {
      super.method4258();
   }

   @Override
   public boolean method3345(Entity var1) {
      if (var1 != null) {
         if (var1 == this) {
            return true;
         } else if (!super.method3345(var1)) {
            if (var1 instanceof Class1100) {
               return this.method3345(((Class1100)var1).method5270());
            } else {
               return var1 instanceof Class880 && ((Class880)var1).method3089() == Class7809.field33508
                  ? this.method3344() == null && var1.method3344() == null
                  : false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26559;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26562;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26564;
   }

   private void method4601(Class1019 var1) {
      this.field5737 = var1;
   }

   @Nullable
   private Class1019 method4602() {
      return this.field5737;
   }

   @Override
   public Class9455 method4598() {
      return Class6067.field26560;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   // $VF: synthetic method
   public static Class1019 method4603(Class1032 var0) {
      return var0.method4602();
   }

   // $VF: synthetic method
   public static Random method4604(Class1032 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4605(Class1032 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4606(Class1032 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4607(Class1032 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4608(Class1032 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static void method4609(Class1032 var0, Class1019 var1) {
      var0.method4601(var1);
   }
}