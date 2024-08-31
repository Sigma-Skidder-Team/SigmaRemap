package mapped;

import net.minecraft.entity.LivingEntity;

public enum Class2111 {
   field13770 {
      @Override
      public <E extends LivingEntity> void method8780(Class7271<Class3676<? super E>> class7271, ServerWorld class1657, E e, long l) {
         class7271.method22841().filter(class3676 -> class3676.method12500() == Class2092.field13632).filter(class3676 -> class3676.method12501(class1657, e, l)).findFirst();
      }
   },
   field13771 {
      @Override
      public <E extends LivingEntity> void method8780(Class7271<Class3676<? super E>> class7271, ServerWorld class1657, E e, long l) {
         class7271.method22841().filter(class3676 -> class3676.method12500() == Class2092.field13632).forEach(class3676 -> class3676.method12501(class1657, e, l));
      }
   };

   private static final Class2111[] field13772 = new Class2111[]{field13770, field13771};

   private Class2111() {
   }

   public abstract <E extends LivingEntity> void method8780(Class7271<Class3676<? super E>> var1, ServerWorld var2, E var3, long var4);
}
