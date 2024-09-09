package mapped;

public enum Class2242 {
   field14670 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem;
      }
   },
   field14671 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).method11805() == EquipmentSlotType.field13733;
      }
   },
   field14672 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).method11805() == EquipmentSlotType.field13734;
      }
   },
   field14673 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).method11805() == EquipmentSlotType.field13735;
      }
   },
   field14674 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).method11805() == EquipmentSlotType.field13736;
      }
   },
   field14675 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ItemSword;
      }
   },
   field14676 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3264;
      }
   },
   field14677 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3259;
      }
   },
   field14678 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3272;
      }
   },
   field14679 {
      @Override
      public boolean method8990(Item var1) {
         return var1.method11712();
      }
   },
   field14680 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof BowItem;
      }
   },
   field14681 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3255 || Block.method11537(var1) instanceof Class3255;
      }
   },
   field14682 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3261;
      }
   },
   field14683 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3260 || Block.method11537(var1) instanceof Class3260 || field14679.method8990(var1);
      }
   };

   private static final Class2242[] field14684 = new Class2242[]{
      field14670,
      field14671,
      field14672,
      field14673,
      field14674,
      field14675,
      field14676,
      field14677,
      field14678,
      field14679,
      field14680,
      field14681,
      field14682,
      field14683
   };

   private Class2242() {
   }

   public abstract boolean method8990(Item var1);

}
