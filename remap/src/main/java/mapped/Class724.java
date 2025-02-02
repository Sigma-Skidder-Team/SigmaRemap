// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class724 extends Class723 implements Class725<Class3420>
{
    private final Class3420 field3955;
    private final Class514 field3956;
    
    public Class724(final Class3420 field3955, final Class464 class464, final ITextComponent class465) {
        this.field3956 = new Class753(this);
        this.field3955 = field3955;
    }
    
    public Class3420 method3983() {
        return this.field3955;
    }
    
    @Override
    public void init() {
        super.init();
        this.field3955.method10873(this.field3956);
    }
    
    @Override
    public void onClose() {
        this.minecraft.player.method2814();
        super.onClose();
    }
    
    @Override
    public void removed() {
        super.removed();
        this.field3955.method10874(this.field3956);
    }
    
    @Override
    public void method3971() {
        if (!this.minecraft.player.method2880()) {
            super.method3971();
        }
        else {
            this.addButton(new Class654(this.width / 2 - 100, 196, 98, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.minecraft.displayGuiScreen(null)));
            this.addButton(new Class654(this.width / 2 + 2, 196, 98, 20, Class8822.method30773("lectern.take_book", new Object[0]), class654 -> this.method3984(3)));
        }
    }
    
    @Override
    public void method3974() {
        this.method3984(1);
    }
    
    @Override
    public void method3975() {
        this.method3984(2);
    }
    
    @Override
    public boolean method3970(final int n) {
        if (n == this.field3955.method10901()) {
            return false;
        }
        this.method3984(100 + n);
        return true;
    }
    
    private void method3984(final int n) {
        this.minecraft.playerController.method27326(this.field3955.field16154, n);
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
    
    private void method3985() {
        this.method3968(Class7735.method24687(this.field3955.method10900()));
    }
    
    private void method3986() {
        this.method3969(this.field3955.method10901());
    }
}
