package mapped;

public class Class7356 extends Class7354 {
   private static String[] field31486;
   private final Class5040 field31487;
   private final Class5047 field31488;
   private Class2268 field31489;

   public Class7356(Class5066 var1, Class8827 var2) {
      super(var1, var2);
      Class5066 var5 = var1.method15438(1835297121L);
      Class5066 var6 = var5.method15438(1835626086L);
      this.field31487 = (Class5040)var6.method15438(1936549988L);
      Class5066 var7 = var6.method15438(1937007212L);
      Class5001 var8 = (Class5001)var7.method15438(1937011556L);
      if (!(var8.method15439().get(0) instanceof Class5047)) {
         this.field31488 = null;
         this.field31489 = Class2267.field14749;
      } else {
         this.field31488 = (Class5047)var8.method15439().get(0);
         long var9 = this.field31488.method15431();
         if (!this.field31488.method15437(1702061171L)) {
            this.field31481 = Class8307.method29064((Class5056)this.field31488.method15439().get(0));
         } else {
            this.method23308((Class5086)this.field31488.method15438(1702061171L));
         }

         if (var9 != 1701733217L && var9 != 1685220723L) {
            this.field31489 = Class2267.method8996(this.field31488.method15431());
         } else {
            this.method23308((Class5086)this.field31488.method15438(1702061171L));
            this.field31482 = Class6399.method19498(this.field31488.method15438(1936289382L));
            this.field31489 = this.field31482.method19499();
         }
      }
   }

   @Override
   public Class2169 method23310() {
      return Class2169.field14240;
   }

   @Override
   public Class2268 method23311() {
      return this.field31489;
   }

   public double method23336() {
      return this.field31487.method15428();
   }

   public int method23337() {
      return this.field31488.method15449();
   }

   public int method23338() {
      return this.field31488.method15450();
   }

   public int method23339() {
      return this.field31488.method15451();
   }

   public double method23340() {
      return this.field31474.method15569();
   }
}
