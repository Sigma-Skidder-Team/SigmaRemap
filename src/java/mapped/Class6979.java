package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import org.apache.commons.lang3.tuple.Triple;

public final class Class6979 {
   private static String[] field30193;
   private final Class9367 field30194;
   private boolean field30195;
   private Class7680 field30196;
   private Class8661 field30197;
   private Class7680 field30198;
   private Class8661 field30199;
   private static final Class6979 field30200 = Util.<Class6979>method38507(() -> {
      Class9367 var2 = new Class9367();
      var2.method35503();
      Class6979 var3 = new Class6979(var2);
      var3.method21549();
      return var3;
   });

   public Class6979(Class9367 var1) {
      if (var1 != null) {
         this.field30194 = var1;
      } else {
         this.field30194 = field30200.field30194;
      }
   }

   public Class6979(Class7680 var1, Class8661 var2, Class7680 var3, Class8661 var4) {
      this.field30194 = method21546(var1, var2, var3, var4);
      this.field30196 = var1 == null ? new Class7680() : var1;
      this.field30197 = var2 == null ? Class8661.field39030.method31189() : var2;
      this.field30198 = var3 == null ? new Class7680(1.0F, 1.0F, 1.0F) : var3;
      this.field30199 = var4 == null ? Class8661.field39030.method31189() : var4;
      this.field30195 = true;
   }

   public static Class6979 method21542() {
      return field30200;
   }

   public Class6979 method21543(Class6979 var1) {
      Class9367 var4 = this.method21548();
      var4.method35508(var1.method21548());
      return new Class6979(var4);
   }

   @Nullable
   public Class6979 method21544() {
      if (this != field30200) {
         Class9367 var3 = this.method21548();
         return !var3.method35507() ? null : new Class6979(var3);
      } else {
         return this;
      }
   }

   private void method21545() {
      if (!this.field30195) {
         Pair var3 = method21547(this.field30194);
         Triple var4 = ((Class8967)var3.getFirst()).method32822();
         this.field30196 = (Class7680)var3.getSecond();
         this.field30197 = (Class8661)var4.getLeft();
         this.field30198 = (Class7680)var4.getMiddle();
         this.field30199 = (Class8661)var4.getRight();
         this.field30195 = true;
      }
   }

   private static Class9367 method21546(Class7680 var0, Class8661 var1, Class7680 var2, Class8661 var3) {
      Class9367 var6 = new Class9367();
      var6.method35503();
      if (var1 != null) {
         var6.method35508(new Class9367(var1));
      }

      if (var2 != null) {
         var6.method35508(Class9367.method35515(var2.method25269(), var2.method25270(), var2.method25271()));
      }

      if (var3 != null) {
         var6.method35508(new Class9367(var3));
      }

      if (var0 != null) {
         var6.field43474 = var0.method25269();
         var6.field43478 = var0.method25270();
         var6.field43482 = var0.method25271();
      }

      return var6;
   }

   public static Pair<Class8967, Class7680> method21547(Class9367 var0) {
      var0.method35510(1.0F / var0.field43486);
      Class7680 var3 = new Class7680(var0.field43474, var0.field43478, var0.field43482);
      Class8967 var4 = new Class8967(var0);
      return Pair.of(var4, var3);
   }

   public Class9367 method21548() {
      return this.field30194.method35514();
   }

   public Class8661 method21549() {
      this.method21545();
      return this.field30197.method31189();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class6979 var4 = (Class6979)var1;
            return Objects.equals(this.field30194, var4.field30194);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.field30194);
   }
}
