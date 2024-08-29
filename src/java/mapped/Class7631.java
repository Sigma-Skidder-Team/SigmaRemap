package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7631 {
   public static final Class2352<Class7379> field32708 = new Class2352<Class7379>();
   public final Class9348<Class7631, Class7379> field32709;
   private Class7379 field32710;

   public Class7631() {
      Class7558<Class7631, Class7379> var3 = new Class7558<>(this);
      this.method25046(var3);
      this.field32709 = var3.method24739(Class7631::method25049, Class7379::new);
      this.method25048(this.field32709.method35393());
   }

   public void method25046(Class7558<Class7631, Class7379> var1) {
   }

   public Class9348<Class7631, Class7379> method25047() {
      return this.field32709;
   }

   public final void method25048(Class7379 var1) {
      this.field32710 = var1;
   }

   public final Class7379 method25049() {
      return this.field32710;
   }

   public abstract Item method25050();

   public void method25051(World var1, BlockPos var2, Class7379 var3, Random var4) {
   }

   public void method25052(World var1, BlockPos var2, Class7379 var3) {
   }

   public void method25053(World var1, BlockPos var2, Class7379 var3, Random var4) {
   }

   @Nullable
   public Class7436 method25054() {
      return null;
   }

   public abstract boolean method25055(Class7379 var1, Class1665 var2, BlockPos var3, Class7631 var4, Direction var5);

   public abstract Vector3d method25056(Class1665 var1, BlockPos var2, Class7379 var3);

   public abstract int method25057(Class1662 var1);

   public boolean method25058() {
      return false;
   }

   public boolean method25059() {
      return false;
   }

   public abstract float method25060();

   public abstract float method25061(Class7379 var1, Class1665 var2, BlockPos var3);

   public abstract float method25062(Class7379 var1);

   public abstract BlockState method25063(Class7379 var1);

   public abstract boolean method25064(Class7379 var1);

   public abstract int method25065(Class7379 var1);

   public boolean method25066(Class7631 var1) {
      return var1 == this;
   }

   public boolean method25067(Class7608<Class7631> var1) {
      return var1.method24917(this);
   }

   public abstract Class6408 method25068(Class7379 var1, Class1665 var2, BlockPos var3);
}
