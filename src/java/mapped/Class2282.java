package mapped;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Supplier;

public enum Class2282 implements IItemTier {
   field15104(0, 59, 2.0F, 0.0F, 15, () -> Class120.method342(ItemTags.field26071)),
   field15105(1, 131, 4.0F, 1.0F, 5, () -> Class120.method342(ItemTags.field26122)),
   field15106(2, 250, 6.0F, 2.0F, 14, () -> Class120.method339(Items.field37801)),
   field15107(3, 1561, 8.0F, 3.0F, 10, () -> Class120.method339(Items.field37800)),
   field15108(0, 32, 12.0F, 0.0F, 22, () -> Class120.method339(Items.field37802)),
   field15109(4, 2031, 9.0F, 4.0F, 15, () -> Class120.method339(Items.field37803));

   private final int field15110;
   private final int field15111;
   private final float field15112;
   private final float field15113;
   private final int field15114;
   private final LazyValue<Class120> field15115;
   private static final Class2282[] field15116 = new Class2282[]{field15104, field15105, field15106, field15107, field15108, field15109};

   private Class2282(int var3, int var4, float var5, float var6, int var7, Supplier<Class120> var8) {
      this.field15110 = var3;
      this.field15111 = var4;
      this.field15112 = var5;
      this.field15113 = var6;
      this.field15114 = var7;
      this.field15115 = new LazyValue<Class120>(var8);
   }

   @Override
   public int method9010() {
      return this.field15111;
   }

   @Override
   public float getEfficiency() {
      return this.field15112;
   }

   @Override
   public float getAttackDamage() {
      return this.field15113;
   }

   @Override
   public int method9013() {
      return this.field15110;
   }

   @Override
   public int method9014() {
      return this.field15114;
   }

   @Override
   public Class120 method9015() {
      return this.field15115.getValue();
   }
}
