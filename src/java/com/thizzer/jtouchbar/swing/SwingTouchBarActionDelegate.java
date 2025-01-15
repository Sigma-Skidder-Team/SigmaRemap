// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.swing;

import java.beans.PropertyChangeEvent;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import java.util.Objects;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

public class SwingTouchBarActionDelegate implements TouchBarViewAction
{
    private static final String PROPERTY_NAME_ENABLED = "enabled";
    private final Action action;
    private final PropertyChangeListener propertyChangeListener;
    
    public SwingTouchBarActionDelegate(final Action action, final TouchBarButton touchBarButton) {
        Objects.requireNonNull(action, "action");
        Objects.requireNonNull(touchBarButton, "touchBarButton");
        this.action = action;
        this.propertyChangeListener = (event -> {
            if ("enabled".equals(event.getPropertyName())) {
                touchBarButton.fireActionStateChanged();
            }
            return;
        });
        this.action.addPropertyChangeListener(this.propertyChangeListener);
    }
    
    public void destroy() {
        this.action.removePropertyChangeListener(this.propertyChangeListener);
    }
    
    public boolean isOnEDT() {
        return SwingUtilities.isEventDispatchThread();
    }
    
    public ActionEvent getActionEvent() {
        return new ActionEvent(this, 0, null);
    }
    
    @Override
    public void onCall(final TouchBarView view) {
        if (this.isOnEDT()) {
            this.callAction();
        }
        else {
            SwingUtilities.invokeLater(this::callAction);
        }
    }
    
    private void callAction() {
        this.action.actionPerformed(this.getActionEvent());
    }
    
    @Override
    public boolean isEnabled() {
        return this.action.isEnabled();
    }
}
