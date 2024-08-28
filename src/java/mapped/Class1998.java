package mapped;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;

import javax.annotation.concurrent.Immutable;
import java.util.stream.IntStream;

@Immutable
public class Class1998 implements Comparable<Class1998> {
   public static final Codec<Class1998> field13025 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> Util.method38530(var0, 3).map(var0x -> new Class1998(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.method8304(), var0.getY(), var0.method8306())
      );
   public static final Class1998 field13026 = new Class1998(0, 0, 0);
   public int field13027;
   public int field13028;
   public int field13029;

   public Class1998(int var1, int var2, int var3) {
      this.field13027 = var1;
      this.field13028 = var2;
      this.field13029 = var3;
   }

   public Class1998(double var1, double var3, double var5) {
      this(MathHelper.method37769(var1), MathHelper.method37769(var3), MathHelper.method37769(var5));
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class1998) {
            Class1998 var4 = (Class1998)var1;
            if (this.method8304() == var4.method8304()) {
               return this.getY() == var4.getY() ? this.method8306() == var4.method8306() : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return (this.getY() + this.method8306() * 31) * 31 + this.method8304();
   }

   public int compareTo(Class1998 var1) {
      if (this.getY() != var1.getY()) {
         return this.getY() - var1.getY();
      } else {
         return this.method8306() != var1.method8306() ? this.method8306() - var1.method8306() : this.method8304() - var1.method8304();
      }
   }

   public int method8304() {
      return this.field13027;
   }

   public int getY() {
      return this.field13028;
   }

   public int method8306() {
      return this.field13029;
   }

   public void method8307(int var1) {
      this.field13027 = var1;
   }

   public void method8308(int var1) {
      this.field13028 = var1;
   }

   public void method8309(int var1) {
      this.field13029 = var1;
   }

   public Class1998 method8310() {
      return this.method8311(1);
   }

   public Class1998 method8311(int var1) {
      return this.method8314(Direction.field673, var1);
   }

   public Class1998 method8312() {
      return this.method8313(1);
   }

   public Class1998 method8313(int var1) {
      return this.method8314(Direction.field672, var1);
   }

   public Class1998 method8314(Direction var1, int var2) {
      return var2 != 0
         ? new Class1998(this.method8304() + var1.method539() * var2, this.getY() + var1.method540() * var2, this.method8306() + var1.method541() * var2)
         : this;
   }

   public Class1998 method8315(Class1998 var1) {
      return new Class1998(
         this.getY() * var1.method8306() - this.method8306() * var1.getY(),
         this.method8306() * var1.method8304() - this.method8304() * var1.method8306(),
         this.method8304() * var1.getY() - this.getY() * var1.method8304()
      );
   }

   public boolean method8316(Class1998 var1, double var2) {
      return this.method8320((double)var1.method8304(), (double)var1.getY(), (double)var1.method8306(), false) < var2 * var2;
   }

   public boolean method8317(Class2955 var1, double var2) {
      return this.method8320(var1.method11320(), var1.method11321(), var1.method11322(), true) < var2 * var2;
   }

   public double method8318(Class1998 var1) {
      return this.method8320((double)var1.method8304(), (double)var1.getY(), (double)var1.method8306(), true);
   }

   public double method8319(Class2955 var1, boolean var2) {
      return this.method8320(var1.method11320(), var1.method11321(), var1.method11322(), var2);
   }

   public double method8320(double var1, double var3, double var5, boolean var7) {
      double var10 = !var7 ? 0.0 : 0.5;
      double var12 = (double)this.method8304() + var10 - var1;
      double var14 = (double)this.getY() + var10 - var3;
      double var16 = (double)this.method8306() + var10 - var5;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public int method8321(Class1998 var1) {
      float var4 = (float)Math.abs(var1.method8304() - this.method8304());
      float var5 = (float)Math.abs(var1.getY() - this.getY());
      float var6 = (float)Math.abs(var1.method8306() - this.method8306());
      return (int)(var4 + var5 + var6);
   }

   public int method8322(Class113 var1) {
      return var1.method327(this.field13027, this.field13028, this.field13029);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.method8304()).add("y", this.getY()).add("z", this.method8306()).toString();
   }

   public String method8323() {
      return "" + this.method8304() + ", " + this.getY() + ", " + this.method8306();
   }
}
