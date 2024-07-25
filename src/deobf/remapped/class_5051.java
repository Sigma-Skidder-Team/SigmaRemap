package remapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class class_5051 {
   public static final int field_26100 = 1000;
   private static final class_4106[] field_26097 = new class_4106[0];
   private final ByteBuf field_26093;
   private final class_1455 field_26101;
   private boolean field_26096 = true;
   private int field_26095 = -1;
   private final LinkedList<class_7794<class_8039, Object>> field_26098 = new LinkedList<class_7794<class_8039, Object>>();
   private final List<class_7794<class_8039, Object>> field_26099 = new ArrayList<class_7794<class_8039, Object>>();

   public class_5051(int var1, ByteBuf var2, class_1455 var3) {
      this.field_26095 = var1;
      this.field_26093 = var2;
      this.field_26101 = var3;
   }

   public <T> T method_23248(class_8039<T> var1, int var2) throws Exception {
      int var5 = 0;

      for (class_7794 var7 : this.field_26099) {
         if (var7.method_35355() == var1) {
            if (var5 == var2) {
               return (T)var7.method_35352();
            }

            var5++;
         }
      }

      ArrayIndexOutOfBoundsException var8 = new ArrayIndexOutOfBoundsException("Could not find type " + var1.method_36494() + " at " + var2);
      throw new class_9699(var8)
         .method_44824("Type", var1.method_36494())
         .method_44824("Index", var2)
         .method_44824("Packet ID", this.method_23250())
         .method_44824("Data", this.field_26099);
   }

   public boolean method_23249(class_8039 var1, int var2) {
      int var5 = 0;

      for (class_7794 var7 : this.field_26099) {
         if (var7.method_35355() == var1) {
            if (var5 == var2) {
               return true;
            }

            var5++;
         }
      }

      return false;
   }

   public boolean method_23252(class_8039 var1, int var2) {
      int var5 = 0;

      for (class_7794 var7 : this.field_26098) {
         if (((class_8039)var7.method_35355()).method_36495() == var1.method_36495()) {
            if (var5 == var2) {
               return true;
            }

            var5++;
         }
      }

      return false;
   }

   public <T> void method_23257(class_8039<T> var1, int var2, T var3) throws Exception {
      int var6 = 0;

      for (class_7794 var8 : this.field_26099) {
         if (var8.method_35355() == var1) {
            if (var6 == var2) {
               var8.method_35354(var3);
               return;
            }

            var6++;
         }
      }

      ArrayIndexOutOfBoundsException var9 = new ArrayIndexOutOfBoundsException("Could not find type " + var1.method_36494() + " at " + var2);
      throw new class_9699(var9).method_44824("Type", var1.method_36494()).method_44824("Index", var2).method_44824("Packet ID", this.method_23250());
   }

   public <T> T method_23242(class_8039<T> var1) throws Exception {
      if (var1 == class_8039.field_41145) {
         return null;
      } else if (this.field_26098.isEmpty()) {
         Preconditions.checkNotNull(this.field_26093, "This packet does not have an input buffer.");

         try {
            return (T)var1.method_9912(this.field_26093);
         } catch (Exception var7) {
            throw new class_9699(var7)
               .method_44824("Type", var1.method_36494())
               .method_44824("Packet ID", this.method_23250())
               .method_44824("Data", this.field_26099);
         }
      } else {
         class_7794 var4 = this.field_26098.poll();
         class_8039 var5 = (class_8039)var4.method_35355();
         if (!var5.equals(var1) && (!var1.method_36495().equals(var5.method_36495()) || !var1.method_36493().equals(var5.method_36493()))) {
            if (var5 == class_8039.field_41145) {
               return this.<T>method_23242(var1);
            } else {
               IOException var6 = new IOException("Unable to read type " + var1.method_36494() + ", found " + ((class_8039)var4.method_35355()).method_36494());
               throw new class_9699(var6)
                  .method_44824("Type", var1.method_36494())
                  .method_44824("Packet ID", this.method_23250())
                  .method_44824("Data", this.field_26099);
            }
         } else {
            return (T)var4.method_35352();
         }
      }
   }

   public <T> void method_23236(class_8039<T> var1, T var2) {
      if (var2 != null && !var1.method_36493().isAssignableFrom(var2.getClass())) {
         if (!(var1 instanceof class_7305)) {
            class_3446.method_15886().method_34617().warning("Possible type mismatch: " + var2.getClass().getName() + " -> " + var1.method_36493());
         } else {
            var2 = ((class_7305)var1).method_33313(var2);
         }
      }

      this.field_26099.add(new class_7794<class_8039, Object>(var1, var2));
   }

   public <T> T method_23261(class_8039<T> var1) throws Exception {
      Object var4 = this.method_23242(var1);
      this.method_23236(var1, var4);
      return (T)var4;
   }

   public void method_23244() throws Exception {
      this.field_26099.addAll(this.field_26098);
      this.field_26098.clear();
      if (this.field_26093.readableBytes() > 0) {
         this.<byte[]>method_23261(class_8039.field_41181);
      }
   }

   public void method_23254(ByteBuf var1) throws Exception {
      if (this.field_26095 != -1) {
         class_8039.field_41157.method_15644(var1, this.field_26095);
      }

      if (!this.field_26098.isEmpty()) {
         this.field_26099.addAll(this.field_26098);
         this.field_26098.clear();
      }

      int var4 = 0;

      for (class_7794 var6 : this.field_26099) {
         try {
            Object var7 = var6.method_35352();
            if (var7 != null && !((class_8039)var6.method_35355()).method_36493().isAssignableFrom(var7.getClass())) {
               if (var6.method_35355() instanceof class_7305) {
                  var7 = ((class_7305)var6.method_35355()).method_33313(var7);
               } else {
                  class_3446.method_15886()
                     .method_34617()
                     .warning("Possible type mismatch: " + var7.getClass().getName() + " -> " + ((class_8039)var6.method_35355()).method_36493());
               }
            }

            ((class_8039)var6.method_35355()).method_33275(var1, var7);
         } catch (Exception var8) {
            var1.clear();
         }

         var4++;
      }

      this.method_23258(var1);
   }

   public void method_23246() {
      if (this.field_26093 != null) {
         this.field_26093.clear();
      }

      this.field_26098.clear();
   }

   public void method_23240() {
      this.method_23246();
      this.field_26099.clear();
   }

   private void method_23258(ByteBuf var1) {
      if (this.field_26093 != null) {
         var1.writeBytes(this.field_26093, this.field_26093.readableBytes());
      }
   }

   public void method_23234(Class<? extends class_4106> var1, boolean var2) throws Exception {
      this.method_23235(var1, var2, false);
   }

   public void method_23235(Class<? extends class_4106> var1, boolean var2, boolean var3) throws Exception {
      if (!this.method_23243()) {
         try {
            ByteBuf var6 = this.method_23256(var1, var2, class_3842.field_18754);
            this.method_23255().method_6739(var6, var3);
         } catch (Exception var7) {
            if (!class_3844.method_17837(var7, class_6400.class)) {
               throw var7;
            }
         }
      }
   }

   private ByteBuf method_23256(Class<? extends class_4106> var1, boolean var2, class_3842 var3) throws Exception {
      class_4106[] var6 = this.method_23255().method_6744().method_17596().method_42443().<class_4106>toArray(field_26097);
      boolean var7 = var3 == class_3842.field_18754;
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

         this.method_23251();
         this.method_23239(var3, this.method_23255().method_6744().method_17598(), var8, var6, var7);
         ByteBuf var10 = this.field_26093 != null ? this.field_26093.alloc().buffer() : this.method_23255().method_6733().alloc().buffer();
         this.method_23254(var10);
         return var10;
      } else {
         throw new NoSuchElementException(var1.getCanonicalName());
      }
   }

   public void method_23233(Class<? extends class_4106> var1) throws Exception {
      this.method_23234(var1, true);
   }

   public ChannelFuture method_23247(Class<? extends class_4106> var1) throws Exception {
      if (this.method_23243()) {
         return this.method_23255().method_6733().newFailedFuture(new Exception("Cancelled packet"));
      } else {
         ByteBuf var4 = this.method_23256(var1, true, class_3842.field_18754);
         return this.method_23255().method_6704(var4);
      }
   }

   @Deprecated
   public void method_23232() throws Exception {
      if (!this.method_23243()) {
         ByteBuf var3 = this.field_26093 != null ? this.field_26093.alloc().buffer() : this.method_23255().method_6733().alloc().buffer();
         this.method_23254(var3);
         this.method_23255().method_6738(var3);
      }
   }

   public class_5051 method_23259(int var1) {
      return new class_5051(var1, null, this.method_23255());
   }

   public class_5051 method_23260(int var1, class_5226 var2) throws Exception {
      class_5051 var5 = this.method_23259(var1);
      var2.method_23914(var5);
      return var5;
   }

   public class_5051 method_23238(class_3842 var1, class_1730 var2, int var3, List<class_4106> var4, boolean var5) throws Exception {
      class_4106[] var8 = var4.<class_4106>toArray(field_26097);
      return this.method_23239(var1, var2, !var5 ? var3 : var8.length - 1, var8, var5);
   }

   public class_5051 method_23237(class_3842 var1, class_1730 var2, int var3, List<class_4106> var4) throws Exception {
      return this.method_23239(var1, var2, var3, var4.<class_4106>toArray(field_26097), false);
   }

   private class_5051 method_23239(class_3842 var1, class_1730 var2, int var3, class_4106[] var4, boolean var5) throws Exception {
      if (!var5) {
         for (int var8 = var3; var8 < var4.length; var8++) {
            var4[var8].method_18999(var1, var2, this);
            this.method_23251();
         }
      } else {
         for (int var9 = var3; var9 >= 0; var9--) {
            var4[var9].method_18999(var1, var2, this);
            this.method_23251();
         }
      }

      return this;
   }

   public void method_23245() {
      this.field_26096 = false;
   }

   public boolean method_23243() {
      return !this.field_26096;
   }

   public class_1455 method_23255() {
      return this.field_26101;
   }

   public void method_23251() {
      this.field_26099.addAll(this.field_26098);
      this.field_26098.clear();
      this.field_26098.addAll(this.field_26099);
      this.field_26099.clear();
   }

   @Deprecated
   public void method_23262() throws Exception {
      if (!this.method_23243()) {
         ByteBuf var3 = this.field_26093 != null ? this.field_26093.alloc().buffer() : this.method_23255().method_6733().alloc().buffer();
         this.method_23254(var3);
         this.method_23255().method_6713(var3, true);
      }
   }

   public void method_23265(Class<? extends class_4106> var1, boolean var2, boolean var3) throws Exception {
      if (!this.method_23243()) {
         try {
            ByteBuf var6 = this.method_23256(var1, var2, class_3842.field_18756);
            this.method_23255().method_6713(var6, var3);
         } catch (Exception var7) {
            if (!class_3844.method_17837(var7, class_6400.class)) {
               throw var7;
            }
         }
      }
   }

   public void method_23264(Class<? extends class_4106> var1, boolean var2) throws Exception {
      this.method_23265(var1, var2, false);
   }

   public void method_23263(Class<? extends class_4106> var1) throws Exception {
      this.method_23264(var1, true);
   }

   public int method_23250() {
      return this.field_26095;
   }

   public void method_23253(int var1) {
      this.field_26095 = var1;
   }

   @Override
   public String toString() {
      return "PacketWrapper{packetValues=" + this.field_26099 + ", readableObjects=" + this.field_26098 + ", id=" + this.field_26095 + '}';
   }
}
