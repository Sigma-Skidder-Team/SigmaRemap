package mapped;

import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class7834<T> implements Class7833<T> {
   private static String[] field33625;
   private final Class2352<T> field33626;
   private final Class2353<T> field33627;
   private final Class8555<T> field33628;
   private final Function<CompoundNBT, T> field33629;
   private final Function<T, CompoundNBT> field33630;
   private final int field33631;

   public Class7834(Class2352<T> var1, int var2, Class8555<T> var3, Function<CompoundNBT, T> var4, Function<T, CompoundNBT> var5) {
      this.field33626 = var1;
      this.field33631 = var2;
      this.field33628 = var3;
      this.field33629 = var4;
      this.field33630 = var5;
      this.field33627 = new Class2353<T>(1 << var2);
   }

   @Override
   public int method26240(T var1) {
      int var4 = this.field33627.method9171((T)var1);
      if (var4 == -1) {
         var4 = this.field33627.method9272((T)var1);
         if (var4 >= 1 << this.field33631) {
            var4 = this.field33628.method30489(this.field33631 + 1, (T)var1);
         }
      }

      return var4;
   }

   @Override
   public boolean method26241(Predicate<T> var1) {
      for (int var4 = 0; var4 < this.method26247(); var4++) {
         if (var1.test(this.field33627.method9172(var4))) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public T method26242(int var1) {
      return this.field33627.method9172(var1);
   }

   @Override
   public void method26243(PacketBuffer var1) {
      this.field33627.method9279();
      int var4 = var1.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field33627.method9272(this.field33626.method9172(var1.method35714()));
      }
   }

   @Override
   public void method26244(PacketBuffer var1) {
      int var4 = this.method26247();
      var1.writeVarInt(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.writeVarInt(this.field33626.method9171(this.field33627.method9172(var5)));
      }
   }

   @Override
   public int method26245() {
      int var3 = PacketBuffer.method35695(this.method26247());

      for (int var4 = 0; var4 < this.method26247(); var4++) {
         var3 += PacketBuffer.method35695(this.field33626.method9171(this.field33627.method9172(var4)));
      }

      return var3;
   }

   public int method26247() {
      return this.field33627.method9280();
   }

   @Override
   public void method26246(ListNBT var1) {
      this.field33627.method9279();

      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.field33627.method9272(this.field33629.apply(var1.method153(var4)));
      }
   }

   public void method26248(ListNBT var1) {
      for (int var4 = 0; var4 < this.method26247(); var4++) {
         var1.add(this.field33630.apply(this.field33627.method9172(var4)));
      }
   }
}
