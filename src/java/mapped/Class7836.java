package mapped;

import net.minecraft.network.PacketBuffer;

import java.util.function.Predicate;

public class Class7836<T> implements Class7833<T> {
   private static String[] field33639;
   private final Class2352<T> field33640;
   private final T field33641;

   public Class7836(Class2352<T> var1, T var2) {
      this.field33640 = var1;
      this.field33641 = (T)var2;
   }

   @Override
   public int method26240(T var1) {
      int var4 = this.field33640.getId((T)var1);
      return var4 != -1 ? var4 : 0;
   }

   @Override
   public boolean method26241(Predicate<T> var1) {
      return true;
   }

   @Override
   public T method26242(int var1) {
      Object var4 = this.field33640.getByValue(var1);
      return (T)(var4 != null ? var4 : this.field33641);
   }

   @Override
   public void method26243(PacketBuffer var1) {
   }

   @Override
   public void method26244(PacketBuffer var1) {
   }

   @Override
   public int method26245() {
      return PacketBuffer.method35695(0);
   }

   @Override
   public void method26246(ListNBT var1) {
   }
}
