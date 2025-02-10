package mapped;

public class VideoTrack extends Track {
   private final VideoMediaHeaderBox vmhd;
   private final VideoSampleEntry sampleEntry;
   private Codec codec;

   public VideoTrack(Box var1, MP4InputStream var2) {
      super(var1, var2);
      Box var5 = var1.method15438(1835297121L);
      Box var6 = var5.method15438(1835626086L);
      this.vmhd = (VideoMediaHeaderBox)var6.method15438(1936549988L);
      Box var7 = var6.method15438(1937007212L);
      Class5001 var8 = (Class5001)var7.method15438(1937011556L);
      if (!(var8.method15439().get(0) instanceof VideoSampleEntry)) {
         this.sampleEntry = null;
         this.codec = Class2267.field14749;
      } else {
         this.sampleEntry = (VideoSampleEntry)var8.method15439().get(0);
         long var9 = this.sampleEntry.method15431();
         if (!this.sampleEntry.method15437(1702061171L)) {
            this.field31481 = Class8307.method29064((Class5056)this.sampleEntry.method15439().get(0));
         } else {
            this.method23308((Class5086)this.sampleEntry.method15438(1702061171L));
         }

         if (var9 != 1701733217L && var9 != 1685220723L) {
            this.codec = Class2267.method8996(this.sampleEntry.method15431());
         } else {
            this.method23308((Class5086)this.sampleEntry.method15438(1702061171L));
            this.field31482 = Protection.method19498(this.sampleEntry.method15438(1936289382L));
            this.codec = this.field31482.method19499();
         }
      }
   }

   @Override
   public Type getType() {
      return Type.VIDEO;
   }

   @Override
   public Codec getCodec() {
      return this.codec;
   }

   public int getWidth() {
      return this.sampleEntry.getWidth();
   }

   public int getHeight() {
      return this.sampleEntry.getHeight();
   }

   public int getDepth() {
      return this.sampleEntry.getDepth();
   }
}
