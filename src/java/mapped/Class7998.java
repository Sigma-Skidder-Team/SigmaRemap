package mapped;

import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.Client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

public class Class7998 {
   private final Map<String, Object> field34382 = Maps.newHashMap();
   private final Map<String, Object> field34383 = Maps.newHashMap();
   private final String field34384 = UUID.randomUUID().toString();
   private final URL field34385;
   private final Class315 field34386;
   private final Timer field34387 = new Timer("Snooper Timer", true);
   private final Object field34388 = new Object();
   private final long field34389;
   private boolean field34390;
   public static long field34391 = System.currentTimeMillis();

   public Class7998(String var1, Class315 var2, long var3) {
      try {
         this.field34385 = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 2);
      } catch (MalformedURLException var8) {
         throw new IllegalArgumentException();
      }

      this.field34386 = var2;
      this.field34389 = var3;
   }

   public void method27296() {
      if (this.field34390) {
      }
   }

   public void method27297() {
      this.method27299("memory_total", Runtime.getRuntime().totalMemory());
      this.method27299("memory_max", Runtime.getRuntime().maxMemory());
      this.method27299("memory_free", Runtime.getRuntime().freeMemory());
      this.method27299("cpu_cores", Runtime.getRuntime().availableProcessors());
      this.field34386.method1347(this);
      long var3 = System.currentTimeMillis() - field34391;
      if (Client.getInstance().getWebsocketManager() != null && var3 > 992120L) {
         if (Client.getInstance().getWebsocketManager().field29204 == null || Client.getInstance().getWebsocketManager().field29204.method1757() == null) {
            Minecraft.getInstance().field1319.method29105();
            Minecraft.getInstance().field1299.field44727 = false;
         } else if (Client.getInstance().getWebsocketManager().field29204.method1757().method1779() != null) {
            String var5 = Client.getInstance().getWebsocketManager().field29204.method1757().method1779().getHostName();
            if (var5.split("\\.").length != 3 || !var5.split("\\.")[1].equals("sigmaclient")) {
               Minecraft.getInstance().field1319.method29105();
               Minecraft.getInstance().field1299.field44727 = false;
            }
         }
      }
   }

   public void method27298(String var1, Object var2) {
      synchronized (this.field34388) {
         this.field34383.put(var1, var2);
      }
   }

   public void method27299(String var1, Object var2) {
      synchronized (this.field34388) {
         this.field34382.put(var1, var2);
      }
   }

   public boolean method27300() {
      return this.field34390;
   }

   public void method27301() {
      this.field34387.cancel();
   }

   public String method27302() {
      return this.field34384;
   }

   public long method27303() {
      return this.field34389;
   }
}
