// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class131 extends Class126
{
    private final Class1932 field399;
    private final long field400;
    
    private Class131(final Class122[] array, final Class1932 field399, final long field400) {
        super(array);
        this.field399 = field399;
        this.field400 = field400;
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (!class8321.method27620()) {
            final Class51 class8323 = new Class51();
            class8323.method306("LootTable", this.field399.toString());
            if (this.field400 != 0L) {
                class8323.method299("LootTableSeed", this.field400);
            }
            class8321.method27658().method295("BlockEntityTag", class8323);
            return class8321;
        }
        return class8321;
    }
    
    @Override
    public void method636(final Class7790 class7790) {
        if (!class7790.method25018(this.field399)) {
            super.method636(class7790);
            final Class9317 method25022 = class7790.method25022(this.field399);
            if (method25022 != null) {
                method25022.method34487(class7790.method25016("->{" + this.field399 + "}", this.field399));
            }
            else {
                class7790.method25014("Unknown loot table called " + this.field399);
            }
        }
        else {
            class7790.method25014("Table " + this.field399 + " is recursively called");
        }
    }
}
