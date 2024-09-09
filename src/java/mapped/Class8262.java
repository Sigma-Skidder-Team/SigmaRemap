package mapped;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Collection;
import javax.annotation.Nullable;

public class Class8262 {
   private final Class4871 field35509;
   private BlockPos field35510;
   private final ServerWorld field35511;
   private final Collection<Class8405> field35512 = Lists.newArrayList();
   private final int field35513;
   private final Collection<Class8803> field35514 = Lists.newCopyOnWriteArrayList();
   private Object2LongMap<Runnable> field35515 = new Object2LongOpenHashMap();
   private long field35516;
   private long field35517;
   private boolean field35518 = false;
   private final Stopwatch field35519 = Stopwatch.createUnstarted();
   private boolean field35520 = false;
   private final Class80 field35521;
   private Throwable field35522;

   public Class8262(Class4871 var1, Class80 var2, ServerWorld var3) {
      this.field35509 = var1;
      this.field35511 = var3;
      this.field35513 = var1.method15036();
      this.field35521 = var1.method15040().method250(var2);
   }

   public void method28802(BlockPos var1) {
      this.field35510 = var1;
   }

   public void method28803() {
      this.field35516 = this.field35511.getGameTime() + 1L + this.field35509.method15039();
      this.field35519.start();
   }

   public void method28804() {
      if (!this.method28812()) {
         this.field35517 = this.field35511.getGameTime() - this.field35516;
         if (this.field35517 >= 0L) {
            if (this.field35517 == 0L) {
               this.method28805();
            }

            ObjectIterator var3 = this.field35515.object2LongEntrySet().iterator();

            while (var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if (var4.getLongValue() <= this.field35517) {
                  try {
                     ((Runnable)var4.getKey()).run();
                  } catch (Exception var6) {
                     this.method28814(var6);
                  }

                  var3.remove();
               }
            }

            if (this.field35517 > (long)this.field35513) {
               if (this.field35514.isEmpty()) {
                  this.method28814(new Class2465("Didn't succeed or fail within " + this.field35509.method15036() + " ticks"));
               } else {
                  this.field35514.forEach(var1 -> var1.method31784(this.field35517));
                  if (this.field35522 == null) {
                     this.method28814(new Class2465("No sequences finished"));
                  }
               }
            } else {
               this.field35514.forEach(var1 -> var1.method31783(this.field35517));
            }
         }
      }
   }

   private void method28805() {
      if (this.field35518) {
         throw new IllegalStateException("Test already started");
      } else {
         this.field35518 = true;

         try {
            this.field35509.method15033(new Class8240(this));
         } catch (Exception var4) {
            this.method28814(var4);
         }
      }
   }

   public String method28806() {
      return this.field35509.method15034();
   }

   public BlockPos method28807() {
      return this.field35510;
   }

   public ServerWorld method28808() {
      return this.field35511;
   }

   public boolean method28809() {
      return this.field35520 && this.field35522 == null;
   }

   public boolean method28810() {
      return this.field35522 != null;
   }

   public boolean method28811() {
      return this.field35518;
   }

   public boolean method28812() {
      return this.field35520;
   }

   private void method28813() {
      if (!this.field35520) {
         this.field35520 = true;
         this.field35519.stop();
      }
   }

   public void method28814(Throwable var1) {
      this.method28813();
      this.field35522 = var1;
      this.field35512.forEach(var1x -> var1x.method29525(this));
   }

   @Nullable
   public Throwable method28815() {
      return this.field35522;
   }

   @Override
   public String toString() {
      return this.method28806();
   }

   public void method28816(Class8405 var1) {
      this.field35512.add(var1);
   }

   public void method28817(BlockPos var1, int var2) {
      Class964 var5 = Class7803.method26056(this.method28820(), var1, this.method28821(), var2, this.field35511, false);
      this.method28802(var5.getPos());
      var5.method3937(this.method28806());
      Class7803.method26054(this.field35510, new BlockPos(1, 0, -1), this.method28821(), this.field35511);
      this.field35512.forEach(var1x -> var1x.method29524(this));
   }

   public boolean method28818() {
      return this.field35509.method15037();
   }

   public boolean method28819() {
      return !this.field35509.method15037();
   }

   public String method28820() {
      return this.field35509.method15035();
   }

   public Class80 method28821() {
      return this.field35521;
   }

   public Class4871 method28822() {
      return this.field35509;
   }
}
