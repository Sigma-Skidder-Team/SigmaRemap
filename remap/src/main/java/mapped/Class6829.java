// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6829 extends Class6826
{
    private final CompoundNBT field26823;
    
    public Class6829() {
        super(1);
        (this.field26823 = new CompoundNBT()).putString("id", "minecraft:pig");
    }
    
    public Class6829(final CompoundNBT class51) {
        this(class51.contains("Weight", 99) ? class51.getInt("Weight") : 1, class51.getCompound("Entity"));
    }
    
    public Class6829(final int n, final CompoundNBT field26823) {
        super(n);
        this.field26823 = field26823;
    }
    
    public CompoundNBT method20915() {
        final CompoundNBT class51 = new CompoundNBT();
        if (this.field26823.contains("id", 8)) {
            if (!this.field26823.getString("id").contains(":")) {
                this.field26823.putString("id", new ResourceLocation(this.field26823.getString("id")).toString());
            }
        }
        else {
            this.field26823.putString("id", "minecraft:pig");
        }
        class51.put("Entity", this.field26823);
        class51.putInt("Weight", this.field26816);
        return class51;
    }
    
    public CompoundNBT method20916() {
        return this.field26823;
    }
}
