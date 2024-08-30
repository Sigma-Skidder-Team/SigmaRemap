package mapped;

import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.Client;
import net.minecraft.client.Minecraft;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

public class Snooper {
   private final Map<String, Object> field34382 = Maps.newHashMap();
   private final Map<String, Object> field34383 = Maps.newHashMap();
   private final String field34384 = UUID.randomUUID().toString();
   private final URL field34385;
   private final ISnooperInfo field34386;
   private final Timer field34387 = new Timer("Snooper Timer", true);
   private final Object field34388 = new Object();
   private final long field34389;
   private boolean field34390;
   public static long field34391 = System.currentTimeMillis();

   public Snooper(String var1, ISnooperInfo var2, long var3) {
      try {
         this.field34385 = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 2);
      } catch (MalformedURLException var8) {
         throw new IllegalArgumentException();
      }

      this.field34386 = var2;
      this.field34389 = var3;
   }

   public void start() {
      if (this.field34390) {
      }
   }

   public void addMemoryStatsToSnooper() {
      this.method27299("memory_total", Runtime.getRuntime().totalMemory());
      this.method27299("memory_max", Runtime.getRuntime().maxMemory());
      this.method27299("memory_free", Runtime.getRuntime().freeMemory());
      this.method27299("cpu_cores", Runtime.getRuntime().availableProcessors());
      this.field34386.fillSnooper(this);
      long var3 = System.currentTimeMillis() - field34391;
      if (var3 > 992120L) {
         Minecraft.getInstance().framebuffer.method29105();
         Minecraft.getInstance().gameSettings.field44727 = false;
      }
   }

   public void addClientStat(String var1, Object var2) {
      synchronized (this.field34388) {
         this.field34383.put(var1, var2);
      }
   }

   public void method27299(String var1, Object var2) {
      synchronized (this.field34388) {
         this.field34382.put(var1, var2);
      }
   }

   public boolean isSnooperRunning() {
      return this.field34390;
   }

   public void method27301() {
      this.field34387.cancel();
   }

   public String getUniqueID() {
      return this.field34384;
   }

   public long getMinecraftStartTimeMillis() {
      return this.field34389;
   }
}
