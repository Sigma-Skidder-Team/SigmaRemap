package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;

import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class7835<T> implements Class7833<T> {
   private static String[] field33632;
   private final Class2352<T> field33633;
   private final T[] field33634;
   private final Class8555<T> field33635;
   private final Function<CompoundNBT, T> field33636;
   private final int field33637;
   private int field33638;

   public Class7835(Class2352<T> var1, int var2, Class8555<T> var3, Function<CompoundNBT, T> var4) {
      this.field33633 = var1;
      this.field33634 = (T[])(new Object[1 << var2]);
      this.field33637 = var2;
      this.field33635 = var3;
      this.field33636 = var4;
   }

   @Override
   public int method26240(T var1) {
      for (int var4 = 0; var4 < this.field33638; var4++) {
         if (this.field33634[var4] == var1) {
            return var4;
         }
      }

      int var5 = this.field33638;
      if (var5 >= this.field33634.length) {
         return this.field33635.method30489(this.field33637 + 1, (T)var1);
      } else {
         this.field33634[var5] = (T)var1;
         this.field33638++;
         return var5;
      }
   }

   @Override
   public boolean method26241(Predicate<T> var1) {
      for (int var4 = 0; var4 < this.field33638; var4++) {
         if (var1.test(this.field33634[var4])) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public T method26242(int var1) {
      return var1 >= 0 && var1 < this.field33638 ? this.field33634[var1] : null;
   }

   @Override
   public void method26243(PacketBuffer var1) {
      this.field33638 = var1.readVarInt();

      for (int var4 = 0; var4 < this.field33638; var4++) {
         this.field33634[var4] = this.field33633.getByValue(var1.readVarInt());
      }
   }

   @Override
   public void method26244(PacketBuffer var1) {
      var1.writeVarInt(this.field33638);

      for (int var4 = 0; var4 < this.field33638; var4++) {
         var1.writeVarInt(this.field33633.getId(this.field33634[var4]));
      }
   }

   @Override
   public int method26245() {
      int var3 = PacketBuffer.method35695(this.method26249());

      for (int var4 = 0; var4 < this.method26249(); var4++) {
         var3 += PacketBuffer.method35695(this.field33633.getId(this.field33634[var4]));
      }

      return var3;
   }

   public int method26249() {
      return this.field33638;
   }

   @Override
   public void method26246(ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         this.field33634[var4] = this.field33636.apply(var1.method153(var4));
      }

      this.field33638 = var1.size();
   }
}
