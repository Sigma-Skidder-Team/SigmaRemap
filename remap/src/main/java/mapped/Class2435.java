// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.JelloTouch;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

public class Class2435 implements TouchBarViewAction
{
    private static String[] field14377;
    public final /* synthetic */ Class8879 field14378;
    public final /* synthetic */ JelloTouch field14379;
    
    public Class2435(final JelloTouch field14379, final Class8879 field14380) {
        this.field14379 = field14379;
        this.field14378 = field14380;
    }
    
    @Override
    public void onCall(final TouchBarView touchBarView) {
        this.field14378.method31234().method9910();
        ((TouchBarButton)touchBarView).setBezelColor(this.field14379.method21971(this.field14378.method31234()));
    }
}
