package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;
import net.sourceforge.jaad.mp4.api.Protection;
import net.sourceforge.jaad.mp4.api.Type;
import net.sourceforge.jaad.mp4.boxes.Box;

public class AudioTrack extends Track {
   private final SoundMediaHeaderBox field31487;
   private final AudioSampleEntry field31488;
   private Codec codec;

   public AudioTrack(Box var1, MP4InputStream var2) {
      super(var1, var2);
      Box var5 = var1.getChild(1835297121L);
      Box var6 = var5.getChild(1835626086L);
      this.field31487 = (SoundMediaHeaderBox)var6.getChild(1936549988L);
      Box var7 = var6.getChild(1937007212L);
      SampleDescriptionBox var8 = (SampleDescriptionBox)var7.getChild(1937011556L);
      if (!(var8.method15439().get(0) instanceof AudioSampleEntry)) {
         this.field31488 = null;
         this.codec = AudioCodec.field14749;
      } else {
         this.field31488 = (AudioSampleEntry)var8.method15439().get(0);
         long var9 = this.field31488.method15431();
         if (!this.field31488.method15437(1702061171L)) {
            this.field31481 = Class8307.method29064((Class5056)this.field31488.method15439().get(0));
         } else {
            this.method23308((Class5086)this.field31488.getChild(1702061171L));
         }

         if (var9 != 1701733217L && var9 != 1685220723L) {
            this.codec = AudioCodec.method8996(this.field31488.method15431());
         } else {
            this.method23308((Class5086)this.field31488.getChild(1702061171L));
            this.field31482 = Protection.method19498(this.field31488.getChild(1936289382L));
            this.codec = this.field31482.method19499();
         }
      }
   }

   @Override
   public Type method23310() {
      return Type.AUDIO;
   }

   @Override
   public Codec method23311() {
      return this.codec;
   }

   public double getBalance() {
      return this.field31487.method15428();
   }

   public int getChannelCount() {
      return this.field31488.method15449();
   }

   public int getSampleRate() {
      return this.field31488.getSampleRate();
   }

   public int getSampleSize() {
      return this.field31488.getSampleSize();
   }

   public double getVolume() {
      return this.tkhd.getVolume();
   }

   public enum AudioCodec implements Codec {
      AAC,
      field14742,
      field14743,
      field14744,
      field14745,
      field14746,
      field14747,
      field14748,
      field14749;

      private static final AudioCodec[] field14750 = new AudioCodec[]{
              AAC, field14742, field14743, field14744, field14745, field14746, field14747, field14748, field14749
      };

      public static Codec method8996(long var0) {
         AudioCodec var4;
         if (var0 != 1836069985L) {
            if (var0 != 1633889587L) {
               if (var0 != 1935764850L) {
                  if (var0 != 1935767394L) {
                     if (var0 != 1936029283L) {
                        if (var0 != 1700998451L) {
                           if (var0 != 1936810864L) {
                              if (var0 != 1936944502L) {
                                 var4 = field14749;
                              } else {
                                 var4 = field14748;
                              }
                           } else {
                              var4 = field14747;
                           }
                        } else {
                           var4 = field14746;
                        }
                     } else {
                        var4 = field14745;
                     }
                  } else {
                     var4 = field14744;
                  }
               } else {
                  var4 = field14743;
               }
            } else {
               var4 = field14742;
            }
         } else {
            var4 = AAC;
         }

         return var4;
      }
   }
}
