package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import org.jetbrains.annotations.Nullable;

public class class_1455 {
   private static final AtomicLong field_7840 = new AtomicLong();
   private final long field_7845 = field_7840.incrementAndGet();
   private final Channel field_7848;
   private final boolean field_7843;
   public Map<Class, class_1174> field_7852 = new ConcurrentHashMap<Class, class_1174>();
   private class_3790 field_7851;
   private boolean field_7838 = true;
   private boolean field_7850;
   private Object field_7836;
   private long field_7839;
   private long field_7849;
   private long field_7847;
   private long field_7842;
   private long field_7837 = -1L;
   private int field_7841;
   private int field_7846;

   public class_1455(Channel var1, boolean var2) {
      this.field_7848 = var1;
      this.field_7843 = var2;
   }

   public class_1455(Channel var1) {
      this(var1, true);
   }

   @Nullable
   public <T extends class_1174> T method_6746(Class<T> var1) {
      return (T)this.field_7852.get(var1);
   }

   public boolean method_6708(Class<? extends class_1174> var1) {
      return this.field_7852.containsKey(var1);
   }

   public void method_6737(class_1174 var1) {
      this.field_7852.put(var1.getClass(), var1);
   }

   public void method_6705() {
      this.field_7852.clear();
   }

   public void method_6739(ByteBuf var1, boolean var2) {
      Runnable var5;
      if (this.field_7843) {
         var5 = () -> this.method_6733().pipeline().context(class_3446.method_15883().method_33738().method_3875()).fireChannelRead(var1);
      } else {
         var5 = () -> this.field_7848.pipeline().context(class_3446.method_15883().method_33738().method_3876()).writeAndFlush(var1);
      }

      if (var2) {
         var5.run();
      } else {
         try {
            this.field_7848.eventLoop().submit(var5);
         } catch (Throwable var7) {
            var1.release();
            var7.printStackTrace();
         }
      }
   }

   public ChannelFuture method_6704(ByteBuf var1) {
      return !this.field_7843 ? this.method_6723(var1) : this.method_6727(var1);
   }

   private ChannelFuture method_6723(ByteBuf var1) {
      return this.field_7848.pipeline().context(class_3446.method_15883().method_33738().method_3876()).writeAndFlush(var1);
   }

   private ChannelFuture method_6727(ByteBuf var1) {
      this.method_6733().pipeline().context(class_3446.method_15883().method_33738().method_3875()).fireChannelRead(var1);
      return this.method_6733().newSucceededFuture();
   }

   public void method_6738(ByteBuf var1) {
      this.method_6739(var1, false);
   }

   public void method_6719() {
      this.field_7839++;
   }

   public boolean method_6726() {
      long var3 = System.currentTimeMillis() - this.field_7847;
      if (var3 < 1000L) {
         this.field_7842++;
         this.field_7849++;
         return false;
      } else {
         this.field_7837 = this.field_7842;
         this.field_7847 = System.currentTimeMillis();
         this.field_7842 = 1L;
         return true;
      }
   }

   public boolean method_6725() {
      if (!this.field_7843) {
         class_5714 var3 = class_3446.method_15884();
         if (var3.method_25850() > 0 && this.field_7837 >= (long)var3.method_25850()) {
            this.method_6715(var3.method_25829().replace("%pps", Long.toString(this.field_7837)));
            return true;
         } else {
            if (var3.method_25807() > 0 && var3.method_25830() > 0) {
               if (this.field_7841 <= var3.method_25830()) {
                  this.field_7841++;
                  if (this.field_7837 >= (long)var3.method_25843()) {
                     this.field_7846++;
                  }

                  if (this.field_7846 >= var3.method_25807()) {
                     this.method_6715(var3.method_25828().replace("%pps", Long.toString(this.field_7837)));
                     return true;
                  }
               } else {
                  this.field_7846 = 0;
                  this.field_7841 = 1;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void method_6715(String var1) {
      if (this.field_7848.isOpen() && !this.field_7850) {
         this.field_7850 = true;
         class_3446.method_15886().method_34633(() -> {
            if (!class_3446.method_15886().method_34638(this, class_2909.method_13307('&', var1))) {
               this.field_7848.close();
            }
         });
      }
   }

   public void method_6713(ByteBuf var1, boolean var2) {
      if (!this.field_7843) {
         this.method_6714(var1, var2);
      } else {
         this.method_6743(var1, var2);
      }
   }

   private void method_6714(ByteBuf var1, boolean var2) {
      ByteBuf var5 = var1.alloc().buffer();

      try {
         ChannelHandlerContext var6 = class_3844.method_17842(class_3446.method_15883().method_33738().method_3875(), this.field_7848.pipeline());

         try {
            class_8039.field_41157.method_15644(var5, 1000);
         } catch (Exception var14) {
            class_3446.method_15886().method_34617().warning("Type.VAR_INT.write thrown an exception: " + var14);
         }

         var5.writeBytes(var1);
         Runnable var7 = () -> {
            if (var6 == null) {
               this.field_7848.pipeline().fireChannelRead(var5);
            } else {
               var6.fireChannelRead(var5);
            }
         };
         if (var2) {
            var7.run();
         } else {
            try {
               this.field_7848.eventLoop().submit(var7);
            } catch (Throwable var13) {
               var5.release();
               throw var13;
            }
         }
      } finally {
         var1.release();
      }
   }

   private void method_6743(ByteBuf var1, boolean var2) {
      Runnable var5 = () -> this.method_6733().pipeline().context(class_3446.method_15883().method_33738().method_3876()).writeAndFlush(var1);
      if (var2) {
         var5.run();
      } else {
         try {
            this.method_6733().eventLoop().submit(var5);
         } catch (Throwable var7) {
            var7.printStackTrace();
            var1.release();
         }
      }
   }

   public void method_6712(ByteBuf var1) {
      this.method_6713(var1, false);
   }

   public boolean method_6722() {
      return !this.field_7843 ? this.method_6721() : this.method_6734();
   }

   private boolean method_6734() {
      this.method_6719();
      return true;
   }

   private boolean method_6721() {
      return this.field_7850 ? false : !this.method_6726() || !this.method_6725();
   }

   public boolean method_6736() {
      return !this.field_7843 ? this.method_6734() : this.method_6721();
   }

   public boolean method_6716() {
      return this.field_7838;
   }

   public void method_6700(ByteBuf var1, Function<Throwable, Exception> var2) throws Exception {
      if (var1.isReadable()) {
         this.method_6750(var1, !this.field_7843 ? class_3842.field_18754 : class_3842.field_18756, var2);
      }
   }

   public void method_6703(ByteBuf var1, Function<Throwable, Exception> var2) throws Exception {
      if (var1.isReadable()) {
         this.method_6750(var1, !this.field_7843 ? class_3842.field_18756 : class_3842.field_18754, var2);
      }
   }

   private void method_6750(ByteBuf var1, class_3842 var2, Function<Throwable, Exception> var3) throws Exception {
      int var6 = class_8039.field_41157.method_15647(var1);
      if (var6 != 1000) {
         class_5051 var7 = new class_5051(var6, var1, this);

         try {
            this.field_7851.method_17596().method_18999(var2, this.field_7851.method_17598(), var7);
         } catch (class_6400 var13) {
            throw (Exception)var3.apply(var13);
         }

         ByteBuf var8 = var1.alloc().buffer();

         try {
            var7.method_23254(var8);
            var1.clear().writeBytes(var8);
         } finally {
            var8.release();
         }
      }
   }

   public long method_6747() {
      return this.field_7845;
   }

   @Nullable
   public Channel method_6733() {
      return this.field_7848;
   }

   @Nullable
   public class_3790 method_6744() {
      return this.field_7851;
   }

   public void method_6709(class_3790 var1) {
      this.field_7851 = var1;
      if (var1 == null) {
         this.field_7852.remove(class_3790.class);
      } else {
         this.field_7852.put(class_3790.class, var1);
      }
   }

   public Map<Class, class_1174> method_6745() {
      return this.field_7852;
   }

   public boolean method_6742() {
      return this.field_7838;
   }

   public void method_6718(boolean var1) {
      this.field_7838 = var1;
   }

   public boolean method_6720() {
      return this.field_7850;
   }

   public void method_6699(boolean var1) {
      this.field_7850 = var1;
   }

   @Nullable
   public Object method_6735() {
      return this.field_7836;
   }

   public void method_6724(Object var1) {
      this.field_7836 = var1;
   }

   public long method_6731() {
      return this.field_7839;
   }

   public void method_6728(long var1) {
      this.field_7839 = var1;
   }

   public long method_6732() {
      return this.field_7849;
   }

   public void method_6698(long var1) {
      this.field_7849 = var1;
   }

   public long method_6717() {
      return this.field_7847;
   }

   public void method_6741(long var1) {
      this.field_7847 = var1;
   }

   public long method_6710() {
      return this.field_7842;
   }

   public void method_6748(long var1) {
      this.field_7842 = var1;
   }

   public long method_6711() {
      return this.field_7837;
   }

   public void method_6740(long var1) {
      this.field_7837 = var1;
   }

   public int method_6707() {
      return this.field_7841;
   }

   public void method_6702(int var1) {
      this.field_7841 = var1;
   }

   public int method_6730() {
      return this.field_7846;
   }

   public void method_6729(int var1) {
      this.field_7846 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_1455 var4 = (class_1455)var1;
            return this.field_7845 == var4.field_7845;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Long.hashCode(this.field_7845);
   }

   public boolean method_6749() {
      return this.field_7843;
   }

   public boolean method_6701() {
      return !this.field_7843;
   }
}
