// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6603 extends Class6601
{
    public Class6603(final IInventory class446, final int n, final int n2, final int n3) {
        super(class446, n, n2, n3);
    }
    
    @Override
    public boolean method20061(final PlayerEntity playerEntity) {
        if (super.method20061(playerEntity) && this.method20054()) {
            return this.method20053().method27660("CustomCreativeLock") == null;
        }
        return !this.method20054();
    }
}
