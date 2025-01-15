// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6829 extends Class6826
{
    private final Class51 field26823;
    
    public Class6829() {
        super(1);
        (this.field26823 = new Class51()).method306("id", "minecraft:pig");
    }
    
    public Class6829(final Class51 class51) {
        this(class51.method316("Weight", 99) ? class51.method319("Weight") : 1, class51.method327("Entity"));
    }
    
    public Class6829(final int n, final Class51 field26823) {
        super(n);
        this.field26823 = field26823;
    }
    
    public Class51 method20915() {
        final Class51 class51 = new Class51();
        if (this.field26823.method316("id", 8)) {
            if (!this.field26823.method323("id").contains(":")) {
                this.field26823.method306("id", new Class1932(this.field26823.method323("id")).toString());
            }
        }
        else {
            this.field26823.method306("id", "minecraft:pig");
        }
        class51.method295("Entity", this.field26823);
        class51.method298("Weight", this.field26816);
        return class51;
    }
    
    public Class51 method20916() {
        return this.field26823;
    }
}
