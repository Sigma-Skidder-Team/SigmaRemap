package net.sourceforge.jaad.mp4.api;

import mapped.*;
import net.sourceforge.jaad.mp4.MP4InputStream;
import net.sourceforge.jaad.mp4.boxes.Box;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Movie {
   private final MP4InputStream in;
   private final MovieHeaderBox mvhd;
   private final List<Track> field38614;
   private final MetaData field38615;
   private final List<Protection> field38616;

   public Movie(Box var1, MP4InputStream var2) {
      this.in = var2;
      this.mvhd = (MovieHeaderBox)var1.getChild(1836476516L);
      List var5 = var1.method15440(1953653099L);
      this.field38614 = new ArrayList<Track>(var5.size());

      for (int var6 = 0; var6 < var5.size(); var6++) {
         Track var7 = this.method30671((Box)var5.get(var6));
         if (var7 != null) {
            this.field38614.add(var7);
         }
      }

      this.field38615 = new MetaData();
      if (!var1.method15437(1835365473L)) {
         if (var1.method15437(1969517665L)) {
            Box var10 = var1.getChild(1969517665L);
            if (var10.method15437(1835365473L)) {
               this.field38615.method33301(var10, var10.getChild(1835365473L));
            }
         }
      } else {
         this.field38615.method33301(null, var1.getChild(1835365473L));
      }

      this.field38616 = new ArrayList<Protection>();
      if (var1.method15437(1768977007L)) {
         Box var11 = var1.getChild(1768977007L);

         for (Box var9 : var11.method15440(1936289382L)) {
            this.field38616.add(Protection.method19498(var9));
         }
      }
   }

   private Track method30671(Box var1) {
      Class5007 var4 = (Class5007)var1.getChild(1835297121L).getChild(1751411826L);
      Object var5;
      switch ((int)var4.method15359()) {
         case 1936684398:
            var5 = new AudioTrack(var1, this.in);
            break;
         case 1986618469:
            var5 = new Class7355(var1, this.in);
            break;
         default:
            var5 = null;
      }

      return (Track)var5;
   }

   public List<Track> method30672() {
      return Collections.<Track>unmodifiableList(this.field38614);
   }

   public List<Track> method30673(Type var1) {
      ArrayList var4 = new ArrayList();

      for (Track var6 : this.field38614) {
         if (var6.method23310().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Track>unmodifiableList(var4);
   }

   public List<Track> getTracks(Codec var1) {
      ArrayList var4 = new ArrayList();

      for (Track var6 : this.field38614) {
         if (var6.method23311().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Track>unmodifiableList(var4);
   }

   public boolean method30675() {
      return this.field38615.method33307();
   }

   public MetaData method30676() {
      return this.field38615;
   }

   public List<Protection> method30677() {
      return Collections.<Protection>unmodifiableList(this.field38616);
   }

   public Date method30678() {
      return Class9362.method35458(this.mvhd.method15520());
   }

   public Date method30679() {
      return Class9362.method35458(this.mvhd.method15521());
   }

   public double getDuration() {
      return (double)this.mvhd.method15523() / (double)this.mvhd.method15522();
   }

   public boolean method30681() {
      for (Track var4 : this.field38614) {
         if (var4.hasMoreFrames()) {
            return true;
         }
      }

      return false;
   }

   public Frame method30682() throws IOException {
      Track var3 = null;

      for (Track var5 : this.field38614) {
         if (var5.hasMoreFrames() && (var3 == null || var5.method23327() < var3.method23327())) {
            var3 = var5;
         }
      }

      return var3 != null ? var3.method23324() : null;
   }
}
