package mapped;

public class Class7355 extends Class7354 {
   private final Class5036 field31483;
   private final Class5053 field31484;
   private final Class2268 field31485;

   public Class7355(Class5066 var1, DataStreamReader var2) {
      super(var1, var2);
      Class5066 var5 = var1.method15438(1835297121L).method15438(1835626086L);
      this.field31483 = (Class5036)var5.method15438(1986881636L);
      Class5066 var6 = var5.method15438(1937007212L);
      Class5001 var7 = (Class5001)var6.method15438(1937011556L);
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
               this.method23308((Class5086)this.field31484.method15438(1702061171L));
               this.field31482 = Class6399.method19498(this.field31484.method15438(1936289382L));
            }
         } else {
            this.method23308((Class5086)this.field31484.method15438(1702061171L));
         }

         this.field31485 = Class2269.method8997(this.field31484.method15431());
      }
   }

   @Override
   public Class2169 method23310() {
      return Class2169.field14239;
   }

   @Override
   public Class2268 method23311() {
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
      return this.field31474.method15567();
   }
}
