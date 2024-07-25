package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_2340 {
   public static final class_95<class_4774> field_11676 = new class_95<class_4774>();
   public final class_8021<class_2340, class_4774> field_11675;
   private class_4774 field_11674;

   public class_2340() {
      class_2203 var3 = new class_2203(this);
      this.method_10728(var3);
      this.field_11675 = var3.method_10164(class_2340::method_10710, class_4774::new);
      this.method_10717(this.field_11675.method_36446());
   }

   public void method_10728(class_2203<class_2340, class_4774> var1) {
   }

   public class_8021<class_2340, class_4774> method_10720() {
      return this.field_11675;
   }

   public final void method_10717(class_4774 var1) {
      this.field_11674 = var1;
   }

   public final class_4774 method_10710() {
      return this.field_11674;
   }

   public abstract class_2451 method_10721();

   public void method_10722(World var1, class_1331 var2, class_4774 var3, Random var4) {
   }

   public void method_10718(World var1, class_1331 var2, class_4774 var3) {
   }

   public void method_10706(World var1, class_1331 var2, class_4774 var3, Random var4) {
   }

   @Nullable
   public class_5079 method_10714() {
      return null;
   }

   public abstract boolean method_10709(class_4774 var1, class_6163 var2, class_1331 var3, class_2340 var4, Direction var5);

   public abstract class_1343 method_10725(class_6163 var1, class_1331 var2, class_4774 var3);

   public abstract int method_10711(class_4924 var1);

   public boolean method_10715() {
      return false;
   }

   public boolean method_10727() {
      return false;
   }

   public abstract float method_10716();

   public abstract float method_10707(class_4774 var1, class_6163 var2, class_1331 var3);

   public abstract float method_10713(class_4774 var1);

   public abstract class_2522 method_10726(class_4774 var1);

   public abstract boolean method_10719(class_4774 var1);

   public abstract int method_10729(class_4774 var1);

   public boolean method_10723(class_2340 var1) {
      return var1 == this;
   }

   public boolean method_10724(class_2307<class_2340> var1) {
      return var1.method_10609(this);
   }

   public abstract class_4190 method_10712(class_4774 var1, class_6163 var2, class_1331 var3);
}
