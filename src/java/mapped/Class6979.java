package mapped;

import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import javax.annotation.Nullable;

import net.minecraft.client.util.Util;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import org.apache.commons.lang3.tuple.Triple;

public final class Class6979 {
   private static String[] field30193;
   private final Matrix4f field30194;
   private boolean field30195;
   private Vector3f field30196;
   private Quaternion field30197;
   private Vector3f field30198;
   private Quaternion field30199;
   private static final Class6979 field30200 = Util.<Class6979>method38507(() -> {
      Matrix4f var2 = new Matrix4f();
      var2.method35503();
      Class6979 var3 = new Class6979(var2);
      var3.method21549();
      return var3;
   });

   public Class6979(Matrix4f var1) {
      if (var1 != null) {
         this.field30194 = var1;
      } else {
         this.field30194 = field30200.field30194;
      }
   }

   public Class6979(Vector3f var1, Quaternion var2, Vector3f var3, Quaternion var4) {
      this.field30194 = method21546(var1, var2, var3, var4);
      this.field30196 = var1 == null ? new Vector3f() : var1;
      this.field30197 = var2 == null ? Quaternion.field39030.method31189() : var2;
      this.field30198 = var3 == null ? new Vector3f(1.0F, 1.0F, 1.0F) : var3;
      this.field30199 = var4 == null ? Quaternion.field39030.method31189() : var4;
      this.field30195 = true;
   }

   public static Class6979 method21542() {
      return field30200;
   }

   public Class6979 method21543(Class6979 var1) {
      Matrix4f var4 = this.method21548();
      var4.method35508(var1.method21548());
      return new Class6979(var4);
   }

   @Nullable
   public Class6979 method21544() {
      if (this != field30200) {
         Matrix4f var3 = this.method21548();
         return !var3.method35507() ? null : new Class6979(var3);
      } else {
         return this;
      }
   }

   private void method21545() {
      if (!this.field30195) {
         Pair var3 = method21547(this.field30194);
         Triple var4 = ((Matrix3f)var3.getFirst()).method32822();
         this.field30196 = (Vector3f)var3.getSecond();
         this.field30197 = (Quaternion)var4.getLeft();
         this.field30198 = (Vector3f)var4.getMiddle();
         this.field30199 = (Quaternion)var4.getRight();
         this.field30195 = true;
      }
   }

   private static Matrix4f method21546(Vector3f var0, Quaternion var1, Vector3f var2, Quaternion var3) {
      Matrix4f var6 = new Matrix4f();
      var6.method35503();
      if (var1 != null) {
         var6.method35508(new Matrix4f(var1));
      }

      if (var2 != null) {
         var6.method35508(Matrix4f.method35515(var2.method25269(), var2.method25270(), var2.method25271()));
      }

      if (var3 != null) {
         var6.method35508(new Matrix4f(var3));
      }

      if (var0 != null) {
         var6.field43474 = var0.method25269();
         var6.field43478 = var0.method25270();
         var6.field43482 = var0.method25271();
      }

      return var6;
   }

   public static Pair<Matrix3f, Vector3f> method21547(Matrix4f var0) {
      var0.method35510(1.0F / var0.field43486);
      Vector3f var3 = new Vector3f(var0.field43474, var0.field43478, var0.field43482);
      Matrix3f var4 = new Matrix3f(var0);
      return Pair.of(var4, var3);
   }

   public Matrix4f method21548() {
      return this.field30194.method35514();
   }

   public Quaternion method21549() {
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
