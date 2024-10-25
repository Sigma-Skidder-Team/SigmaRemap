package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;
import net.sourceforge.jaad.mp4.api.Protection;
import net.sourceforge.jaad.mp4.api.Type;
import net.sourceforge.jaad.mp4.boxes.Box;

public class Class7355 extends Track {
   private final Class5036 field31483;
   private final Class5053 field31484;
   private final Codec field31485;

   public Class7355(Box var1, MP4InputStream var2) {
      super(var1, var2);
      Box var5 = var1.getChild(1835297121L).getChild(1835626086L);
      this.field31483 = (Class5036)var5.getChild(1986881636L);
      Box var6 = var5.getChild(1937007212L);
      SampleDescriptionBox var7 = (SampleDescriptionBox)var6.getChild(1937011556L);
      if (!(var7.method15439().get(0) instanceof Class5053)) {
         this.field31484 = null;
         this.field31485 = Class2269.field14754;
      } else {
         this.field31484 = (Class5053)var7.method15439().get(0);
         long var8 = this.field31484.method15431();
         if (var8 != 1836070006L) {
            if (var8 != 1701733238L && var8 != 1685220723L) {
               this.field31481 = Class8307.method29064((Class5056)this.field31484.method15439().get(0));
            } else {
               this.method23308((Class5086)this.field31484.getChild(1702061171L));
               this.field31482 = Protection.method19498(this.field31484.getChild(1936289382L));
            }
         } else {
            this.method23308((Class5086)this.field31484.getChild(1702061171L));
         }

         this.field31485 = Class2269.method8997(this.field31484.method15431());
      }
   }

   @Override
   public Type method23310() {
      return Type.VIDEO;
   }

   @Override
   public Codec method23311() {
      return this.field31485;
   }

   public int method23328() {
      return this.field31484 == null ? 0 : this.field31484.method15457();
   }

   public int method23329() {
      return this.field31484 == null ? 0 : this.field31484.method15458();
   }

   public double method23330() {
      return this.field31484 == null ? 0.0 : this.field31484.method15459();
   }

   public double method23331() {
      return this.field31484 == null ? 0.0 : this.field31484.method15460();
   }

   public int method23332() {
      return this.field31484 == null ? 0 : this.field31484.method15461();
   }

   public String method23333() {
      return this.field31484 == null ? "" : this.field31484.method15462();
   }

   public int method23334() {
      return this.field31484 == null ? 0 : this.field31484.method15463();
   }

   public int method23335() {
      return this.tkhd.method15567();
   }
}
