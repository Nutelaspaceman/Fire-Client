package dev.zprestige.fire.module.client.hudeditor;


import dev.zprestige.fire.event.bus.EventListener;
import dev.zprestige.fire.module.Descriptor;
import dev.zprestige.fire.module.Module;
import dev.zprestige.fire.ui.hudeditor.HudEditorScreen;

@Descriptor(description = "Displays the hud editor")
public class HudEditor extends Module {


    public HudEditor() {
        eventListeners = new EventListener[]{
                new TickListener(this)
        };
    }

    @Override
    public void onEnable() {
        mc.displayGuiScreen(new HudEditorScreen());
    }

}
