package com.mentalfrostbyte.jello.viaversion.commands;

import io.netty.channel.ChannelFutureListener;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import mapped.Class7161;
import mapped.ViaVersion3;
import org.jetbrains.annotations.Nullable;

public class CustomCommandManager {
   public final Map<UUID, Class7161> field43248 = new ConcurrentHashMap<UUID, Class7161>();
   public final Set<Class7161> field43249 = Collections.<Class7161>newSetFromMap(new ConcurrentHashMap<Class7161, Boolean>());

   public void method35197(Class7161 var1) {
      Objects.<Class7161>requireNonNull(var1, "connection is null!");
      this.field43249.add(var1);
      if (this.method35199(var1)) {
         UUID var4 = var1.method22465().method18681();
         if (this.field43248.put(var4, var1) != null) {
            ViaVersion3.method27613().getLogger().warning("Duplicate UUID on frontend connection! (" + var4 + ")");
         }
      }

      if (var1.method22464() != null) {
         var1.method22464().closeFuture().addListener((ChannelFutureListener)var2 -> this.method35198(var1));
      }
   }

   public void method35198(Class7161 var1) {
      Objects.<Class7161>requireNonNull(var1, "connection is null!");
      this.field43249.remove(var1);
      if (this.method35199(var1)) {
         UUID var4 = var1.method22465().method18681();
         this.field43248.remove(var4);
      }
   }

   public boolean method35199(Class7161 var1) {
      return !var1.method22488();
   }

   public Map<UUID, Class7161> method35200() {
      return Collections.<UUID, Class7161>unmodifiableMap(this.field43248);
   }

   @Nullable
   public Class7161 method35201(UUID var1) {
      return this.field43248.get(var1);
   }

   @Nullable
   public UUID method35202(Class7161 var1) {
      if (var1.method22465() != null) {
         UUID var4 = var1.method22465().method18681();
         Class7161 var5 = this.field43248.get(var4);
         return var5 != null && var5.equals(var1) ? var4 : null;
      } else {
         return null;
      }
   }

   public Set<Class7161> method35203() {
      return Collections.<Class7161>unmodifiableSet(this.field43249);
   }

   public boolean method35204(UUID var1) {
      return this.field43248.containsKey(var1);
   }
}
