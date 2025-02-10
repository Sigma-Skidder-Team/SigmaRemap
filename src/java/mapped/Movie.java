package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Movie {
   private final MP4InputStream in;
   private final MovieHeaderBox mvhd;
   private final List<Track> tracks;
   private final MetaData metaData;
   private final List<Protection> protections;

   public Movie(Box var1, MP4InputStream var2) {
      this.in = var2;
      this.mvhd = (MovieHeaderBox)var1.method15438(1836476516L);
      List var5 = var1.method15440(1953653099L);
      this.tracks = new ArrayList<Track>(var5.size());

      for (int var6 = 0; var6 < var5.size(); var6++) {
         Track var7 = this.method30671((Box)var5.get(var6));
         if (var7 != null) {
            this.tracks.add(var7);
         }
      }

      this.metaData = new MetaData();
      if (!var1.method15437(1835365473L)) {
         if (var1.method15437(1969517665L)) {
            Box var10 = var1.method15438(1969517665L);
            if (var10.method15437(1835365473L)) {
               this.metaData.method33301(var10, var10.method15438(1835365473L));
            }
         }
      } else {
         this.metaData.method33301(null, var1.method15438(1835365473L));
      }

      this.protections = new ArrayList<Protection>();
      if (var1.method15437(1768977007L)) {
         Box var11 = var1.method15438(1768977007L);

         for (Box var9 : var11.method15440(1936289382L)) {
            this.protections.add(Protection.method19498(var9));
         }
      }
   }

   private Track method30671(Box var1) {
      Class5007 var4 = (Class5007)var1.method15438(1835297121L).method15438(1751411826L);
      Object var5;
      switch ((int)var4.method15359()) {
         case 1936684398:
            var5 = new VideoTrack(var1, this.in);
            break;
         case 1986618469:
            var5 = new Class7355(var1, this.in);
            break;
         default:
            var5 = null;
      }

      return (Track)var5;
   }

   public List<Track> getTracks() {
      return Collections.<Track>unmodifiableList(this.tracks);
   }

   public List<Track> method30673(Type var1) {
      ArrayList var4 = new ArrayList();

      for (Track var6 : this.tracks) {
         if (var6.getType().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Track>unmodifiableList(var4);
   }

   public List<Track> method30674(Codec var1) {
      ArrayList var4 = new ArrayList();

      for (Track var6 : this.tracks) {
         if (var6.getCodec().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Track>unmodifiableList(var4);
   }

   public boolean method30675() {
      return this.metaData.method33307();
   }

   public MetaData method30676() {
      return this.metaData;
   }

   public List<Protection> method30677() {
      return Collections.<Protection>unmodifiableList(this.protections);
   }

   public Date method30678() {
      return Class9362.method35458(this.mvhd.method15520());
   }

   public Date method30679() {
      return Class9362.method35458(this.mvhd.method15521());
   }

   public double getDuration() {
      return (double)this.mvhd.getDuration() / (double)this.mvhd.getTimeScale();
   }

   public boolean method30681() {
      for (Track var4 : this.tracks) {
         if (var4.hasMoreFrames()) {
            return true;
         }
      }

      return false;
   }

   public Frame method30682() throws IOException {
      Track var3 = null;

      for (Track var5 : this.tracks) {
         if (var5.hasMoreFrames() && (var3 == null || var5.getNextTimeStamp() < var3.getNextTimeStamp())) {
            var3 = var5;
         }
      }

      return var3 != null ? var3.readNextFrame() : null;
   }
}
