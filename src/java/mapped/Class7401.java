package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class Class7401 {
   public static final Class7401[] field31664 = new Class7401[12];
   public static final Class7401 field31665 = new Class7411(0, "buildingBlocks").method23647("building_blocks");
   public static final Class7401 field31666 = new Class7408(1, "decorations");
   public static final Class7401 field31667 = new Class7405(2, "redstone");
   public static final Class7401 field31668 = new Class7400(3, "transportation");
   public static final Class7401 field31669 = new Class7409(6, "misc");
   public static final Class7401 field31670 = new Class7410(5, "search").method23646("item_search.png");
   public static final Class7401 field31671 = new Class7407(7, "food");
   public static final Class7401 field31672 = new Class7412(8, "tools")
      .method23656(new Class2242[]{Class2242.field14683, Class2242.field14676, Class2242.field14677, Class2242.field14679});
   public static final Class7401 field31673 = new Class7404(9, "combat")
      .method23656(
         new Class2242[]{
            Class2242.field14683,
            Class2242.field14670,
            Class2242.field14671,
            Class2242.field14674,
            Class2242.field14672,
            Class2242.field14673,
            Class2242.field14680,
            Class2242.field14675,
            Class2242.field14681,
            Class2242.field14679,
            Class2242.field14678,
            Class2242.field14682
         }
      );
   public static final Class7401 field31674 = new Class7402(10, "brewing");
   public static final Class7401 field31675 = field31669;
   public static final Class7401 field31676 = new Class7406(4, "hotbar");
   public static final Class7401 field31677 = new Class7403(11, "inventory").method23646("inventory.png").method23651().method23649();
   private final int field31678;
   private final String field31679;
   private final ITextComponent field31680;
   private String field31681;
   private String field31682 = "items.png";
   private boolean field31683 = true;
   private boolean field31684 = true;
   private Class2242[] field31685 = new Class2242[0];
   private ItemStack field31686;

   public Class7401(int var1, String var2) {
      this.field31678 = var1;
      this.field31679 = var2;
      this.field31680 = new TranslationTextComponent("itemGroup." + var2);
      this.field31686 = ItemStack.EMPTY;
      field31664[var1] = this;
   }

   public int method23641() {
      return this.field31678;
   }

   public String method23642() {
      return this.field31681 != null ? this.field31681 : this.field31679;
   }

   public ITextComponent method23643() {
      return this.field31680;
   }

   public ItemStack method23644() {
      if (this.field31686.method32105()) {
         this.field31686 = this.method23640();
      }

      return this.field31686;
   }

   public abstract ItemStack method23640();

   public String method23645() {
      return this.field31682;
   }

   public Class7401 method23646(String var1) {
      this.field31682 = var1;
      return this;
   }

   public Class7401 method23647(String var1) {
      this.field31681 = var1;
      return this;
   }

   public boolean method23648() {
      return this.field31684;
   }

   public Class7401 method23649() {
      this.field31684 = false;
      return this;
   }

   public boolean method23650() {
      return this.field31683;
   }

   public Class7401 method23651() {
      this.field31683 = false;
      return this;
   }

   public int method23652() {
      return this.field31678 % 6;
   }

   public boolean method23653() {
      return this.field31678 < 6;
   }

   public boolean method23654() {
      return this.method23652() == 5;
   }

   public Class2242[] method23655() {
      return this.field31685;
   }

   public Class7401 method23656(Class2242... var1) {
      this.field31685 = var1;
      return this;
   }

   public boolean method23657(Class2242 var1) {
      if (var1 != null) {
         for (Class2242 var7 : this.field31685) {
            if (var7 == var1) {
               return true;
            }
         }
      }

      return false;
   }

   public void method23658(Class25<ItemStack> var1) {
      for (Class3257 var5 : Registry.field16075) {
         var5.method11737(this, var1);
      }
   }
}
