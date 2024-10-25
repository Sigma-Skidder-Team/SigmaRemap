package net.sourceforge.jaad.mp4.api;

import mapped.*;
import net.sourceforge.jaad.mp4.boxes.Box;

public abstract class Protection {
   private final Codec field28009;

   public static Protection method19498(Box var0) {
      Object var3 = null;
      if (var0.method15437(1935894637L)) {
         Class4988 var4 = (Class4988)var0.getChild(1935894637L);
         long var5 = var4.method15308();
         if (var5 == Class2257.method8991(Class2257.field14685)) {
            var3 = new Class6401(var0);
         }
      }

      if (var3 == null) {
         var3 = new Class6400(var0);
      }

      return (Protection)var3;
   }

   public Protection(Box var1) {
      long var4 = ((Class5067)var1.getChild(1718775137L)).method15503();
      Codec var6;
      if ((var6 = AudioTrack.AudioCodec.method8996(var4)).equals(AudioTrack.AudioCodec.field14749)) {
         if ((var6 = Class2269.method8997(var4)).equals(Class2269.field14754)) {
            this.field28009 = null;
         } else {
            this.field28009 = var6;
         }
      } else {
         this.field28009 = var6;
      }
   }

   public Codec method19499() {
      return this.field28009;
   }

   public abstract Class2257 method19500();
}
