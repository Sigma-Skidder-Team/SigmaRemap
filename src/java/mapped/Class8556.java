package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import net.minecraft.nbt.CompoundNBT;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class8556<T> implements Class8555<T> {
   private final Class7833<T> field38446;
   private final Class8555<T> field38447 = (var0, var1x) -> 0;
   private final Class2352<T> field38448;
   private final Function<CompoundNBT, T> field38449;
   private final Function<T, CompoundNBT> field38450;
   private final T field38451;
   public Class7776 field38452;
   private Class7833<T> field38453;
   private int field38454;
   private final ReentrantLock field38455 = new ReentrantLock();

   public void method30490() {
      if (this.field38455.isLocked() && !this.field38455.isHeldByCurrentThread()) {
         String var3 = Thread.getAllStackTraces()
            .keySet()
            .stream()
            .filter(Objects::nonNull)
            .<CharSequence>map(
               var0 -> var0.getName()
                     + ": \n\tat "
                     + Arrays.<StackTraceElement>stream(var0.getStackTrace()).<CharSequence>map(Object::toString).collect(Collectors.joining("\n\tat "))
            )
            .collect(Collectors.joining("\n"));
         CrashReport var4 = new CrashReport("Writing into PalettedContainer from multiple threads", new IllegalStateException());
         CrashReportCategory var5 = var4.makeCategory("Thread dumps");
         var5.addDetail("Thread dumps", var3);
         throw new ReportedException(var4);
      } else {
         this.field38455.lock();
      }
   }

   public void method30491() {
      this.field38455.unlock();
   }

   public Class8556(Class7833<T> var1, Class2352<T> var2, Function<CompoundNBT, T> var3, Function<T, CompoundNBT> var4, T var5) {
      this.field38446 = var1;
      this.field38448 = var2;
      this.field38449 = var3;
      this.field38450 = var4;
      this.field38451 = (T)var5;
      this.method30493(4);
   }

   private static int method30492(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   private void method30493(int var1) {
      if (var1 != this.field38454) {
         this.field38454 = var1;
         if (this.field38454 > 4) {
            if (this.field38454 >= 9) {
               this.field38453 = this.field38446;
               this.field38454 = MathHelper.method37802(this.field38448.method9270());
            } else {
               this.field38453 = new Class7834<T>(this.field38448, this.field38454, this, this.field38449, this.field38450);
            }
         } else {
            this.field38454 = 4;
            this.field38453 = new Class7835<T>(this.field38448, this.field38454, this, this.field38449);
         }

         this.field38453.method26240(this.field38451);
         this.field38452 = new Class7776(this.field38454, 4096);
      }
   }

   @Override
   public int method30489(int var1, T var2) {
      this.method30490();
      Class7776 var5 = this.field38452;
      Class7833 var6 = this.field38453;
      this.method30493(var1);

      for (int var7 = 0; var7 < var5.method25764(); var7++) {
         Object var8 = var6.method26242(var5.method25762(var7));
         if (var8 != null) {
            this.method30497(var7, (T)var8);
         }
      }

      int var9 = this.field38453.method26240((T)var2);
      this.method30491();
      return var9;
   }

   public T method30494(int var1, int var2, int var3, T var4) {
      this.method30490();
      Object var7 = this.method30496(method30492(var1, var2, var3), (T)var4);
      this.method30491();
      return (T)var7;
   }

   public T method30495(int var1, int var2, int var3, T var4) {
      return this.method30496(method30492(var1, var2, var3), (T)var4);
   }

   public T method30496(int var1, T var2) {
      int var5 = this.field38453.method26240((T)var2);
      int var6 = this.field38452.method25760(var1, var5);
      Object var7 = this.field38453.method26242(var6);
      return (T)(var7 != null ? var7 : this.field38451);
   }

   public void method30497(int var1, T var2) {
      int var5 = this.field38453.method26240((T)var2);
      this.field38452.method25761(var1, var5);
   }

   public T method30498(int var1, int var2, int var3) {
      return this.method30499(method30492(var1, var2, var3));
   }

   public T method30499(int var1) {
      Object var4 = this.field38453.method26242(this.field38452.method25762(var1));
      return (T)(var4 != null ? var4 : this.field38451);
   }

   public void method30500(PacketBuffer var1) {
      this.method30490();
      byte var4 = var1.readByte();
      if (this.field38454 != var4) {
         this.method30493(var4);
      }

      this.field38453.method26243(var1);
      var1.method35705(this.field38452.method25763());
      this.method30491();
   }

   public void method30501(PacketBuffer var1) {
      this.method30490();
      var1.writeByte(this.field38454);
      this.field38453.method26244(var1);
      var1.method35704(this.field38452.method25763());
      this.method30491();
   }

   public void method30502(ListNBT var1, long[] var2) {
      this.method30490();
      int var5 = Math.max(4, MathHelper.method37802(var1.size()));
      if (var5 != this.field38454) {
         this.method30493(var5);
      }

      this.field38453.method26246(var1);
      int var6 = var2.length * 64 / 4096;
      if (this.field38453 != this.field38446) {
         if (var6 != this.field38454) {
            Class7776 var7 = new Class7776(var6, 4096, var2);

            for (int var8 = 0; var8 < 4096; var8++) {
               this.field38452.method25761(var8, var7.method25762(var8));
            }
         } else {
            System.arraycopy(var2, 0, this.field38452.method25763(), 0, var2.length);
         }
      } else {
         Class7834 var10 = new Class7834<T>(this.field38448, var5, this.field38447, this.field38449, this.field38450);
         var10.method26246(var1);
         Class7776 var11 = new Class7776(var5, 4096, var2);

         for (int var9 = 0; var9 < 4096; var9++) {
            this.field38452.method25761(var9, this.field38446.method26240((T)var10.method26242(var11.method25762(var9))));
         }
      }

      this.method30491();
   }

   public void method30503(CompoundNBT var1, String var2, String var3) {
      this.method30490();
      Class7834 var6 = new Class7834<T>(this.field38448, this.field38454, this.field38447, this.field38449, this.field38450);
      Object var7 = this.field38451;
      int var8 = var6.method26240(this.field38451);
      int[] var9 = new int[4096];

      for (int var10 = 0; var10 < 4096; var10++) {
         Object var11 = this.method30499(var10);
         if (var11 != var7) {
            var7 = var11;
            var8 = var6.method26240(var11);
         }

         var9[var10] = var8;
      }

      ListNBT var14 = new ListNBT();
      var6.method26248(var14);
      var1.put(var2, var14);
      int var15 = Math.max(4, MathHelper.method37802(var14.size()));
      Class7776 var12 = new Class7776(var15, 4096);

      for (int var13 = 0; var13 < var9.length; var13++) {
         var12.method25761(var13, var9[var13]);
      }

      var1.method113(var3, var12.method25763());
      this.method30491();
   }

   public int method30504() {
      return 1 + this.field38453.method26245() + PacketBuffer.method35695(this.field38452.method25764()) + this.field38452.method25763().length * 8;
   }

   public boolean method30505(Predicate<T> var1) {
      return this.field38453.method26241(var1);
   }

   public void method30506(Class7811<T> var1) {
      Int2IntOpenHashMap var4 = new Int2IntOpenHashMap();
      this.field38452.method25765(var1x -> var4.put(var1x, var4.get(var1x) + 1));
      var4.int2IntEntrySet().forEach(var2 -> var1.method26078(this.field38453.method26242(var2.getIntKey()), var2.getIntValue()));
   }
}
