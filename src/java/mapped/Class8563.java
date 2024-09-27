package mapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Class8563 {
   public static final int field38494 = 1000;
   private static final ViaVersion7[] field38495 = new ViaVersion7[0];
   private final ByteBuf field38496;
   private final Class7161 field38497;
   private boolean field38498 = true;
   private int field38499 = -1;
   private final LinkedList<Class9284<BruhMotha, Object>> field38500 = new LinkedList<Class9284<BruhMotha, Object>>();
   private final List<Class9284<BruhMotha, Object>> field38501 = new ArrayList<Class9284<BruhMotha, Object>>();

   public Class8563(int var1, ByteBuf var2, Class7161 var3) {
      this.field38499 = var1;
      this.field38496 = var2;
      this.field38497 = var3;
   }

   public <T> T method30555(BruhMotha<T> var1, int var2) throws Exception {
      int var5 = 0;

      for (Class9284 var7 : this.field38501) {
         if (var7.method35008() == var1) {
            if (var5 == var2) {
               return (T)var7.method35009();
            }

            var5++;
         }
      }

      ArrayIndexOutOfBoundsException var8 = new ArrayIndexOutOfBoundsException("Could not find type " + var1.method14899() + " at " + var2);
      throw new Class2447(var8)
         .method10458("Type", var1.method14899())
         .method10458("Index", var2)
         .method10458("Packet ID", this.method30586())
         .method10458("Data", this.field38501);
   }

   public boolean method30556(BruhMotha var1, int var2) {
      int var5 = 0;

      for (Class9284 var7 : this.field38501) {
         if (var7.method35008() == var1) {
            if (var5 == var2) {
               return true;
            }

            var5++;
         }
      }

      return false;
   }

   public boolean method30557(BruhMotha var1, int var2) {
      int var5 = 0;

      for (Class9284 var7 : this.field38500) {
         if (((BruhMotha)var7.method35008()).method14897() == var1.method14897()) {
            if (var5 == var2) {
               return true;
            }

            var5++;
         }
      }

      return false;
   }

   public <T> void method30558(BruhMotha<T> var1, int var2, T var3) throws Exception {
      int var6 = 0;

      for (Class9284 var8 : this.field38501) {
         if (var8.method35008() == var1) {
            if (var6 == var2) {
               var8.method35010(var3);
               return;
            }

            var6++;
         }
      }

      ArrayIndexOutOfBoundsException var9 = new ArrayIndexOutOfBoundsException("Could not find type " + var1.method14899() + " at " + var2);
      throw new Class2447(var9).method10458("Type", var1.method14899()).method10458("Index", var2).method10458("Packet ID", this.method30586());
   }

   public <T> T method30559(BruhMotha<T> var1) throws Exception {
      if (var1 == BruhMotha.field22550) {
         return null;
      } else if (this.field38500.isEmpty()) {
         Preconditions.checkNotNull(this.field38496, "This packet does not have an input buffer.");

         try {
            return (T)var1.method14894(this.field38496);
         } catch (Exception var7) {
            throw new Class2447(var7).method10458("Type", var1.method14899()).method10458("Packet ID", this.method30586()).method10458("Data", this.field38501);
         }
      } else {
         Class9284 var4 = this.field38500.poll();
         BruhMotha var5 = (BruhMotha)var4.method35008();
         if (!var5.equals(var1) && (!var1.method14897().equals(var5.method14897()) || !var1.method14898().equals(var5.method14898()))) {
            if (var5 == BruhMotha.field22550) {
               return this.<T>method30559(var1);
            } else {
               IOException var6 = new IOException("Unable to read type " + var1.method14899() + ", found " + ((BruhMotha)var4.method35008()).method14899());
               throw new Class2447(var6)
                  .method10458("Type", var1.method14899())
                  .method10458("Packet ID", this.method30586())
                  .method10458("Data", this.field38501);
            }
         } else {
            return (T)var4.method35009();
         }
      }
   }

   public <T> void method30560(BruhMotha<T> var1, T var2) {
      if (var2 != null && !var1.method14898().isAssignableFrom(var2.getClass())) {
         if (!(var1 instanceof Class4755)) {
            ViaVersion3.method27613().getLogger().warning("Possible type mismatch: " + var2.getClass().getName() + " -> " + var1.method14898());
         } else {
            var2 = (T) ((Class4755)var1).method14904(var2);
         }
      }

      this.field38501.add(new Class9284<BruhMotha, Object>(var1, var2));
   }

   public <T> T method30561(BruhMotha<T> var1) throws Exception {
      T var4 = this.method30559(var1);
      this.method30560(var1, var4);
      return var4;
   }

   public void method30562() throws Exception {
      this.field38501.addAll(this.field38500);
      this.field38500.clear();
      if (this.field38496.readableBytes() > 0) {
         this.<byte[]>method30561(BruhMotha.field22521);
      }
   }

   public void method30563(ByteBuf var1) throws Exception {
      if (this.field38499 != -1) {
         BruhMotha.field22544.method14908(var1, this.field38499);
      }

      if (!this.field38500.isEmpty()) {
         this.field38501.addAll(this.field38500);
         this.field38500.clear();
      }

      int var4 = 0;

      for (Class9284 var6 : this.field38501) {
         try {
            Object var7 = var6.method35009();
            if (var7 != null && !((BruhMotha)var6.method35008()).method14898().isAssignableFrom(var7.getClass())) {
               if (var6.method35008() instanceof Class4755) {
                  var7 = ((Class4755)var6.method35008()).method14904(var7);
               } else {
                  ViaVersion3.method27613()
                     .getLogger()
                     .warning("Possible type mismatch: " + var7.getClass().getName() + " -> " + ((BruhMotha)var6.method35008()).method14898());
               }
            }

            ((BruhMotha)var6.method35008()).method14895(var1, var7);
         } catch (Exception var8) {
            var1.clear();
         }

         var4++;
      }

      this.method30566(var1);
   }

   public void method30564() {
      if (this.field38496 != null) {
         this.field38496.clear();
      }

      this.field38500.clear();
   }

   public void method30565() {
      this.method30564();
      this.field38501.clear();
   }

   private void method30566(ByteBuf var1) {
      if (this.field38496 != null) {
         var1.writeBytes(this.field38496, this.field38496.readableBytes());
      }
   }

   public void method30567(Class<? extends ViaVersion7> var1, boolean var2) throws Exception {
      this.method30568(var1, var2, false);
   }

   public void method30568(Class<? extends ViaVersion7> var1, boolean var2, boolean var3) throws Exception {
      if (!this.method30579()) {
         try {
            ByteBuf var6 = this.method30569(var1, var2, Class2302.field15717);
            this.method30580().method22442(var6, var3);
         } catch (Exception var7) {
            if (!Class8190.method28486(var7, ViaVersion4.class)) {
               throw var7;
            }
         }
      }
   }

   private ByteBuf method30569(Class<? extends ViaVersion7> var1, boolean var2, Class2302 var3) throws Exception {
      ViaVersion7[] var6 = this.method30580().method22465().method18683().method19393().<ViaVersion7>toArray(field38495);
      boolean var7 = var3 == Class2302.field15717;
      int var8 = -1;

      for (int var9 = 0; var9 < var6.length; var9++) {
         if (var6[var9].getClass() == var1) {
            var8 = var9;
            break;
         }
      }

      if (var8 != -1) {
         if (var2) {
            var8 = !var7 ? var8 + 1 : var8 - 1;
         }

         this.method30581();
         this.method30577(var3, this.method30580().method22465().method18673(), var8, var6, var7);
         ByteBuf var10 = this.field38496 != null ? this.field38496.alloc().buffer() : this.method30580().method22464().alloc().buffer();
         this.method30563(var10);
         return var10;
      } else {
         throw new NoSuchElementException(var1.getCanonicalName());
      }
   }

   public void method30570(Class<? extends ViaVersion7> var1) throws Exception {
      this.method30567(var1, true);
   }

   public ChannelFuture method30571(Class<? extends ViaVersion7> var1) throws Exception {
      if (this.method30579()) {
         return this.method30580().method22464().newFailedFuture(new Exception("Cancelled packet"));
      } else {
         ByteBuf var4 = this.method30569(var1, true, Class2302.field15717);
         return this.method30580().method22443(var4);
      }
   }

   @Deprecated
   public void method30572() throws Exception {
      if (!this.method30579()) {
         ByteBuf var3 = this.field38496 != null ? this.field38496.alloc().buffer() : this.method30580().method22464().alloc().buffer();
         this.method30563(var3);
         this.method30580().method22446(var3);
      }
   }

   public Class8563 method30573(int var1) {
      return new Class8563(var1, null, this.method30580());
   }

   public Class8563 method30574(int var1, Class3008 var2) throws Exception {
      Class8563 var5 = this.method30573(var1);
      var2.method11400(var5);
      return var5;
   }

   public Class8563 method30575(Class2302 var1, Class187 var2, int var3, List<ViaVersion7> var4, boolean var5) throws Exception {
      ViaVersion7[] var8 = var4.<ViaVersion7>toArray(field38495);
      return this.method30577(var1, var2, !var5 ? var3 : var8.length - 1, var8, var5);
   }

   public Class8563 method30576(Class2302 var1, Class187 var2, int var3, List<ViaVersion7> var4) throws Exception {
      return this.method30577(var1, var2, var3, var4.<ViaVersion7>toArray(field38495), false);
   }

   private Class8563 method30577(Class2302 var1, Class187 var2, int var3, ViaVersion7[] var4, boolean var5) throws Exception {
      if (!var5) {
         for (int var8 = var3; var8 < var4.length; var8++) {
            var4[var8].method19369(var1, var2, this);
            this.method30581();
         }
      } else {
         for (int var9 = var3; var9 >= 0; var9--) {
            var4[var9].method19369(var1, var2, this);
            this.method30581();
         }
      }

      return this;
   }

   public void method30578() {
      this.field38498 = false;
   }

   public boolean method30579() {
      return !this.field38498;
   }

   public Class7161 method30580() {
      return this.field38497;
   }

   public void method30581() {
      this.field38501.addAll(this.field38500);
      this.field38500.clear();
      this.field38500.addAll(this.field38501);
      this.field38501.clear();
   }

   @Deprecated
   public void method30582() throws Exception {
      if (!this.method30579()) {
         ByteBuf var3 = this.field38496 != null ? this.field38496.alloc().buffer() : this.method30580().method22464().alloc().buffer();
         this.method30563(var3);
         this.method30580().method22451(var3, true);
      }
   }

   public void method30583(Class<? extends ViaVersion7> var1, boolean var2, boolean var3) throws Exception {
      if (!this.method30579()) {
         try {
            ByteBuf var6 = this.method30569(var1, var2, Class2302.field15718);
            this.method30580().method22451(var6, var3);
         } catch (Exception var7) {
            if (!Class8190.method28486(var7, ViaVersion4.class)) {
               throw var7;
            }
         }
      }
   }

   public void method30584(Class<? extends ViaVersion7> var1, boolean var2) throws Exception {
      this.method30583(var1, var2, false);
   }

   public void method30585(Class<? extends ViaVersion7> var1) throws Exception {
      this.method30584(var1, true);
   }

   public int method30586() {
      return this.field38499;
   }

   public void method30587(int var1) {
      this.field38499 = var1;
   }

   @Override
   public String toString() {
      return "PacketWrapper{packetValues=" + this.field38501 + ", readableObjects=" + this.field38500 + ", id=" + this.field38499 + '}';
   }
}
