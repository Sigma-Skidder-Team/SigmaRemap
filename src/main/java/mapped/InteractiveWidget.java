package mapped;

import com.mentalfrostbyte.jello.unmapped.GuiComponent;
import org.newdawn.slick.TrueTypeFont;

import java.util.ArrayList;
import java.util.List;

public class InteractiveWidget extends Widget2 {
    private final List<InteractiveWidgetHandler> pressHandlers = new ArrayList<InteractiveWidgetHandler>();

    public InteractiveWidget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    public InteractiveWidget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, boolean var8) {
        super(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public InteractiveWidget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, boolean var9) {
        super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    public InteractiveWidget(GuiComponent var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, TrueTypeFont var9, boolean var10) {
        super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    public final void onPress(InteractiveWidgetHandler var1) {
        this.pressHandlers.add(var1);
    }

    public final void firePressHandlers() {
        for (InteractiveWidgetHandler var4 : this.pressHandlers) {
            var4.method29648(this);
        }
    }
}
