package mapped;

import com.mentalfrostbyte.jello.viaversion.managers.AbstractResourceManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

public class Class7161 {
   private static final AtomicLong field30794 = new AtomicLong();
   private final long field30795 = field30794.incrementAndGet();
   private final Channel field30796;
   private final boolean field30797;
   public Map<Class, Class6037> field30798 = new ConcurrentHashMap<Class, Class6037>();
   private Class6038 field30799;
   private boolean field30800 = true;
   private boolean field30801;
   private Object field30802;
   private long field30803;
   private long field30804;
   private long field30805;
   private long field30806;
   private long field30807 = -1L;
   private int field30808;
   private int field30809;

   public Class7161(Channel var1, boolean var2) {
      this.field30796 = var1;
      this.field30797 = var2;
   }

   public Class7161(Channel var1) {
      this(var1, true);
   }

   @Nullable
   public <T extends Class6037> T method22438(Class<T> var1) {
      return (T)this.field30798.get(var1);
   }

   public boolean method22439(Class<? extends Class6037> var1) {
      return this.field30798.containsKey(var1);
   }

   public void method22440(Class6037 var1) {
      this.field30798.put(var1.getClass(), var1);
   }

   public void method22441() {
      this.field30798.clear();
   }

   public void method22442(ByteBuf var1, boolean var2) {
      Runnable var5;
      if (this.field30797) {
         var5 = () -> this.method22464().pipeline().context(ViaVersion3.getInstance().method34427().method20576()).fireChannelRead(var1);
      } else {
         var5 = () -> this.field30796.pipeline().context(ViaVersion3.getInstance().method34427().method20575()).writeAndFlush(var1);
      }

      if (var2) {
         var5.run();
      } else {
         try {
            this.field30796.eventLoop().submit(var5);
         } catch (Throwable var7) {
            var1.release();
            var7.printStackTrace();
         }
      }
   }

   public ChannelFuture method22443(ByteBuf var1) {
      return !this.field30797 ? this.method22444(var1) : this.method22445(var1);
   }

   private ChannelFuture method22444(ByteBuf var1) {
      return this.field30796.pipeline().context(ViaVersion3.getInstance().method34427().method20575()).writeAndFlush(var1);
   }

   private ChannelFuture method22445(ByteBuf var1) {
      this.method22464().pipeline().context(ViaVersion3.getInstance().method34427().method20576()).fireChannelRead(var1);
      return this.method22464().newSucceededFuture();
   }

   public void method22446(ByteBuf var1) {
      this.method22442(var1, false);
   }

   public void method22447() {
      this.field30803++;
   }

   public boolean method22448() {
      long var3 = System.currentTimeMillis() - this.field30805;
      if (var3 < 1000L) {
         this.field30806++;
         this.field30804++;
         return false;
      } else {
         this.field30807 = this.field30806;
         this.field30805 = System.currentTimeMillis();
         this.field30806 = 1L;
         return true;
      }
   }

   public boolean method22449() {
      if (!this.field30797) {
         AbstractResourceManager var3 = ViaVersion3.method27612();
         if (var3.method21901() > 0 && this.field30807 >= (long)var3.method21901()) {
            this.method22450(var3.method21902().replace("%pps", Long.toString(this.field30807)));
            return true;
         } else {
            if (var3.method21905() > 0 && var3.method21903() > 0) {
               if (this.field30808 <= var3.method21903()) {
                  this.field30808++;
                  if (this.field30807 >= (long)var3.method21904()) {
                     this.field30809++;
                  }

                  if (this.field30809 >= var3.method21905()) {
                     this.method22450(var3.method21906().replace("%pps", Long.toString(this.field30807)));
                     return true;
                  }
               } else {
                  this.field30809 = 0;
                  this.field30808 = 1;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public void method22450(String var1) {
      if (this.field30796.isOpen() && !this.field30801) {
         this.field30801 = true;
         ViaVersion3.method27613().scheduleTaskWithDelay(() -> {
            if (!ViaVersion3.method27613().method27375(this, Class2307.method9078('&', var1))) {
               this.field30796.close();
            }
         });
      }
   }

   public void method22451(ByteBuf var1, boolean var2) {
      if (!this.field30797) {
         this.method22452(var1, var2);
      } else {
         this.method22453(var1, var2);
      }
   }

   private void method22452(ByteBuf var1, boolean var2) {
      ByteBuf var5 = var1.alloc().buffer();

      try {
         ChannelHandlerContext var6 = Class8190.method28488(ViaVersion3.getInstance().method34427().method20576(), this.field30796.pipeline());

         try {
            BruhMotha.field22544.method14908(var5, 1000);
         } catch (Exception var14) {
            ViaVersion3.method27613().getLogger().warning("Type.VAR_INT.write thrown an exception: " + var14);
         }

         var5.writeBytes(var1);
         Runnable var7 = () -> {
            if (var6 == null) {
               this.field30796.pipeline().fireChannelRead(var5);
            } else {
               var6.fireChannelRead(var5);
            }
         };
         if (var2) {
            var7.run();
         } else {
            try {
               this.field30796.eventLoop().submit(var7);
            } catch (Throwable var13) {
               var5.release();
               throw var13;
            }
         }
      } finally {
         var1.release();
      }
   }

   private void method22453(ByteBuf var1, boolean var2) {
      Runnable var5 = () -> this.method22464().pipeline().context(ViaVersion3.getInstance().method34427().method20575()).writeAndFlush(var1);
      if (var2) {
         var5.run();
      } else {
         try {
            this.method22464().eventLoop().submit(var5);
         } catch (Throwable var7) {
            var7.printStackTrace();
            var1.release();
         }
      }
   }

   public void method22454(ByteBuf var1) {
      this.method22451(var1, false);
   }

   public boolean method22455() {
      return !this.field30797 ? this.method22457() : this.method22456();
   }

   private boolean method22456() {
      this.method22447();
      return true;
   }

   private boolean method22457() {
      return this.field30801 ? false : !this.method22448() || !this.method22449();
   }

   public boolean method22458() {
      return !this.field30797 ? this.method22456() : this.method22457();
   }

   public boolean method22459() {
      return this.field30800;
   }

   public void method22460(ByteBuf var1, Function<Throwable, Exception> var2) throws Exception {
      if (var1.isReadable()) {
         this.method22462(var1, !this.field30797 ? Class2302.field15717 : Class2302.field15718, var2);
      }
   }

   public void method22461(ByteBuf var1, Function<Throwable, Exception> var2) throws Exception {
      if (var1.isReadable()) {
         this.method22462(var1, !this.field30797 ? Class2302.field15718 : Class2302.field15717, var2);
      }
   }

   private void method22462(ByteBuf var1, Class2302 var2, Function<Throwable, Exception> var3) throws Exception {
      int var6 = BruhMotha.field22544.method14907(var1);
      if (var6 != 1000) {
         Class8563 var7 = new Class8563(var6, var1, this);

         try {
            this.field30799.method18683().method19369(var2, this.field30799.method18673(), var7);
         } catch (ViaVersion4 var13) {
            throw (Exception)var3.apply(var13);
         }

         ByteBuf var8 = var1.alloc().buffer();

         try {
            var7.method30563(var8);
            var1.clear().writeBytes(var8);
         } finally {
            var8.release();
         }
      }
   }

   public long method22463() {
      return this.field30795;
   }

   @Nullable
   public Channel method22464() {
      return this.field30796;
   }

   @Nullable
   public Class6038 method22465() {
      return this.field30799;
   }

   public void method22466(Class6038 var1) {
      this.field30799 = var1;
      if (var1 == null) {
         this.field30798.remove(Class6038.class);
      } else {
         this.field30798.put(Class6038.class, var1);
      }
   }

   public Map<Class, Class6037> method22467() {
      return this.field30798;
   }

   public boolean method22468() {
      return this.field30800;
   }

   public void method22469(boolean var1) {
      this.field30800 = var1;
   }

   public boolean method22470() {
      return this.field30801;
   }

   public void method22471(boolean var1) {
      this.field30801 = var1;
   }

   @Nullable
   public Object method22472() {
      return this.field30802;
   }

   public void method22473(Object var1) {
      this.field30802 = var1;
   }

   public long method22474() {
      return this.field30803;
   }

   public void method22475(long var1) {
      this.field30803 = var1;
   }

   public long method22476() {
      return this.field30804;
   }

   public void method22477(long var1) {
      this.field30804 = var1;
   }

   public long method22478() {
      return this.field30805;
   }

   public void method22479(long var1) {
      this.field30805 = var1;
   }

   public long method22480() {
      return this.field30806;
   }

   public void method22481(long var1) {
      this.field30806 = var1;
   }

   public long method22482() {
      return this.field30807;
   }

   public void method22483(long var1) {
      this.field30807 = var1;
   }

   public int method22484() {
      return this.field30808;
   }

   public void method22485(int var1) {
      this.field30808 = var1;
   }

   public int method22486() {
      return this.field30809;
   }

   public void method22487(int var1) {
      this.field30809 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7161 var4 = (Class7161)var1;
            return this.field30795 == var4.field30795;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Long.hashCode(this.field30795);
   }

   public boolean method22488() {
      return this.field30797;
   }

   public boolean method22489() {
      return !this.field30797;
   }
}
