package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SAdvancementInfoPacket;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8730 {
   private static final Logger field39376 = LogManager.getLogger();
   private final Minecraft field39377;
   private final Class8220 field39378 = new Class8220();
   private final Map<Class7952, Class2006> field39379 = Maps.newHashMap();
   private Class1131 field39380;
   private Class7952 field39381;

   public Class8730(Minecraft var1) {
      this.field39377 = var1;
   }

   public void method31508(SAdvancementInfoPacket var1) {
      if (var1.method17490()) {
         this.field39378.method28596();
         this.field39379.clear();
      }

      this.field39378.method28594(var1.method17488());
      this.field39378.method28595(var1.method17487());

      for (Entry var5 : var1.method17489().entrySet()) {
         Class7952 var6 = this.field39378.method28599((ResourceLocation)var5.getKey());
         if (var6 == null) {
            field39376.warn("Server informed client about progress for unknown advancement {}", var5.getKey());
         } else {
            Class2006 var7 = (Class2006)var5.getValue();
            var7.method8488(var6.method27030(), var6.method27034());
            this.field39379.put(var6, var7);
            if (this.field39380 != null) {
               this.field39380.method5452(var6, var7);
            }

            if (!var1.method17490() && var7.method8489() && var6.method27027() != null && var6.method27027().method34941()) {
               this.field39377.getToastGui().method5914(new Class7604(var6));
            }
         }
      }
   }

   public Class8220 method31509() {
      return this.field39378;
   }

   public void method31510(Class7952 var1, boolean var2) {
      ClientPlayNetHandler var5 = this.field39377.getConnection();
      if (var5 != null && var1 != null && var2) {
         var5.sendPacket(Class5466.method17182(var1));
      }

      if (this.field39381 != var1) {
         this.field39381 = var1;
         if (this.field39380 != null) {
            this.field39380.method5453(var1);
         }
      }
   }

   public void method31511(Class1131 var1) {
      this.field39380 = var1;
      this.field39378.method28600(var1);
      if (var1 != null) {
         for (Entry var5 : this.field39379.entrySet()) {
            var1.method5452((Class7952)var5.getKey(), (Class2006)var5.getValue());
         }

         var1.method5453(this.field39381);
      }
   }
}
