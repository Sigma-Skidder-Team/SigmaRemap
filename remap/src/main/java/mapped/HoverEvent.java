// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HoverEvent
{
    private final Action field40296;
    private final ITextComponent field40297;
    
    public HoverEvent(final Action field40296, final ITextComponent field40297) {
        this.field40296 = field40296;
        this.field40297 = field40297;
    }
    
    public Action method34911() {
        return this.field40296;
    }
    
    public ITextComponent method34912() {
        return this.field40297;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final HoverEvent class9390 = (HoverEvent)o;
        if (this.field40296 == class9390.field40296) {
            if (this.field40297 == null) {
                if (class9390.field40297 != null) {
                    return false;
                }
            }
            else if (!this.field40297.equals(class9390.field40297)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "HoverEvent{action=" + this.field40296 + ", value='" + this.field40297 + '\'' + '}';
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field40296.hashCode() + ((this.field40297 == null) ? 0 : this.field40297.hashCode());
    }

    public enum Action
    {
        field10697("show_text", true),
        SHOW_ITEM("show_item", true),
        field10699("show_entity", true);

        private static final Map<String, Action> field10700;
        private final boolean field10701;
        private final String field10702;

        private Action(final String field10702, final boolean field10703) {
            this.field10702 = field10702;
            this.field10701 = field10703;
        }

        public boolean method7947() {
            return this.field10701;
        }

        public String method7948() {
            return this.field10702;
        }

        public static Action method7949(final String s) {
            return Action.field10700.get(s);
        }

        static {
            field10700 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Action, ? extends String>) Action::method7948, class1961 -> class1961));
        }
    }
}
